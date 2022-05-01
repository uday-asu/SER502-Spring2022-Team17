package compiler;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class splGrammar {

    public static void main(String[] args) throws IOException{

        String filePath = args [0];
        boolean exists = Files.exists(Paths.get(filePath));
        if(!exists){
            System.out.println("Error: file does not exists");
            System.exit(1);
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
        String in = "";
        String itr = "";
        while ((itr = bufferedReader.readLine()) != null) {
            in = in + itr;
        }

        CharStream inCharStream = CharStreams.fromString(in);
        splLexer spllexer = new splLexer(inCharStream);
        CommonTokenStream tokens = new CommonTokenStream(spllexer);
        splParser splpraser = new splParser(tokens);
        ParseTree tree = splpraser.program();

        try {
            PrintWriter writeFile = new PrintWriter("tree.pt", "UTF-8");
            writeFile.println(tree.toStringTree(splpraser));
            writeFile.close();
        } catch (Exception ex) {
            System.out.println("Unable to write into file." + ex.toString());
        }
        splEvaluate visitor = new splEvaluate();
        visitor.visit(tree);
    }
}
