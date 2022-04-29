package compiler;

import java.io.*;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class splGrammar {

    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the File Path:");
        String filePath = sc.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
        String input = "";
        String iterator = "";
        while ((iterator = reader.readLine()) != null) {
            input = input + iterator;
        }

        CharStream inputStream = CharStreams.fromString(input);
        splLexer lexer = new splLexer(inputStream);
        CommonTokenStream tokenizer = new CommonTokenStream(lexer);
        splParser parser = new splParser(tokenizer);
        ParseTree tree = parser.program();
        splEvaluate visitor = new splEvaluate();
        visitor.visit(tree);
    }
}
