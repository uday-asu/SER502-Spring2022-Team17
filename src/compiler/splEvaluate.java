package compiler;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class splEvaluate extends splBaseVisitor{

    static LinkedHashMap<String, LinkedHashMap<String,String>> stack = new LinkedHashMap<>();

    @Override
    public Object visitProgram(splParser.ProgramContext ctx) {
        LinkedHashMap<String,String> words = new LinkedHashMap<String,String>();
        LinkedHashMap<String,String> digits = new LinkedHashMap<String,String>();
        LinkedHashMap<String,String> duals = new LinkedHashMap<String,String>();
        stack.put("STR", words);
        stack.put("DIGIT", digits);
        stack.put("DUAL", duals);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlock(splParser.BlockContext ctx) {
       return visitChildren(ctx);
    }

    @Override
    public Object visitInitialization(splParser.InitializationContext ctx) {
        return super.visitInitialization(ctx);
    }

    @Override
    public Object visitDigitInitNum(splParser.DigitInitNumContext ctx) {
        String id = ctx.identifier().getText();
        String num = ctx.number().getText();
        stack.get("DIGIT").put(id,num);
        return 0;
    }

    @Override
    public Object visitDigitInitIden(splParser.DigitInitIdenContext ctx) {
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        boolean keyExists = false;
        for (String integer : stack.keySet()) {
            if (!keyExists) {
                HashMap<String, String> innerMap = stack.get(integer);
                for (String name: innerMap.keySet()) {
                    String key = name.toString();
                    if (key.equals(id2)) {
                        String value = innerMap.get(name).toString();
                        stack.get("DIGIT").put(id1,value);
                        keyExists = true;
                        break;
                    }
                }
            }
        }

        return 0;
    }

    @Override
    public Object visitDigitInitEpr(splParser.DigitInitEprContext ctx) {
        String id1 = ctx.identifier().getText();
        String value = visit(ctx.expression()).toString();
        stack.get("DIGIT").put(id1,value);
        return 0;
    }

    @Override
    public Object visitWordInitId(splParser.WordInitIdContext ctx) {
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();

        boolean keyExists = false;
        for (String string : stack.keySet()) {
            if (!keyExists) {
                HashMap<String, String> innerMap = stack.get(string);
                for (String name: innerMap.keySet()) {
                    String key = name.toString();
                    if (key.equals(id2)) {
                        String value = innerMap.get(name).toString();
                        stack.get("WORD").put(id1,value);
                        keyExists = true;
                        break;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public Object visitWordInitSen(splParser.WordInitSenContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.sentence().getText();
        stack.get("WORD").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitDualInitId(splParser.DualInitIdContext ctx) {
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        boolean keyExists = false;
        for (String string : stack.keySet()) {
            if (!keyExists) {
                HashMap<String, String> innerMap = stack.get(string);
                for (String name: innerMap.keySet()) {
                    String key = name.toString();
                    if (key.equals(id2)) {
                        String value = innerMap.get(name).toString();
                        stack.get("DUAL").put(id1,value);
                        keyExists = true;
                        break;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public Object visitDualDef(splParser.DualDefContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.bop.getText();
        stack.get("DUAL").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitDigitDeclaration(splParser.DigitDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        stack.get("DIGIT").put(id,null);
        return 0;
    }

    @Override
    public Object visitWordDeclaration(splParser.WordDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        stack.get("WORD").put(id,null);
        return 0;
    }

    @Override
    public Object visitDualDeclaration(splParser.DualDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        stack.get("DUAL").put(id,null);
        return 0;
    }

    @Override
    public Object visitDigitAssign(splParser.DigitAssignContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.number().getText();
        stack.get("DIGIT").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitDualAssign(splParser.DualAssignContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.boolean_value.getText();
        stack.get("DUAL").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitWordAssign(splParser.WordAssignContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.sentence().getText();
        stack.get("WORD").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitExprAssign(splParser.ExprAssignContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = visit(ctx.expression()).toString();
        stack.get("DIGIT").put(id1, id2);
        return 0;
    }

    @Override
    public Object visitIncrement(splParser.IncrementContext ctx) {
        int val = 0;
        String id = ctx.identifier().getText();
        for(String integer : stack.keySet()){
            HashMap<String,String> innerMap = stack.get(integer);
            if(innerMap.containsKey(id)){
                val= Integer.parseInt(innerMap.get(id));
                val++;
                stack.get("DIGIT").put(id, String.valueOf(val));
            }
        }
        return val;
    }

    @Override
    public Object visitDecrement(splParser.DecrementContext ctx) {
        int val = 0;
        String id = ctx.identifier().getText();
        for(String integer : stack.keySet()){
            HashMap<String,String> innerMap = stack.get(integer);
            if(innerMap.containsKey(id)){
                val= Integer.parseInt(innerMap.get(id));
                val--;
                stack.get("DIGIT").put(id, String.valueOf(val));
            }
        }
        return val;
    }

    @Override
    public Object visitShowSentence(splParser.ShowSentenceContext ctx) {
        String res = ctx.sentence().getText();
        System.out.println(res.replaceAll("[\"]",""));
        return 0;
    }

    @Override
    public Object visitShowExpr(splParser.ShowExprContext ctx) {
        System.out.println(visit(ctx.expression()));
        return 0;
    }

    @Override
    public Object visitIfCheck(splParser.IfCheckContext ctx) {
        if((boolean)visit(ctx.condition())) {
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitIfCheckElse(splParser.IfCheckElseContext ctx) {
        if((boolean)visit(ctx.condition())) {
            visit(ctx.block(0));
        } else {
            visit(ctx.block(1));
        }
        return 0;
    }

    @Override
    public Object visitStarCond(splParser.StarCondContext ctx) {
        int expr1 = Integer.parseInt(visit(ctx.expression(0)).toString());
        int expr2 = Integer.parseInt(visit(ctx.expression(1)).toString());
        String conditionalOp = ctx.conditional_operator.getText();
        switch (conditionalOp) {
            case "*==":
                return expr1 == expr2;
            case "*<":
                return expr1 < expr2;
            case "*>":
                return expr1 > expr2;
            case "*<=":
                return expr1 <= expr2;
            case "*>=":
                return expr1 >= expr2;
            case "*!=":
                return expr1 != expr2;
            case "|||":
                return expr1 | expr2;
            case "&&&":
                return expr1 & expr2;
        }
        return 0;
    }

    @Override
    public Object visitStarDualCond(splParser.StarDualCondContext ctx) {
        boolean boolVal = Boolean.parseBoolean(ctx.boolean_value.getText());
        return boolVal;
    }

    @Override
    public Object visitPerformtill(splParser.PerformtillContext ctx) {
        while((boolean)visit(ctx.condition()))
        {
            visit(ctx.block());
        }

        return 0;
    }

    @Override
    public Object visitPerform(splParser.PerformContext ctx) {
        for(visit(ctx.integer());(boolean)visit(ctx.condition());visit(ctx.option()))
        {
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitOption(splParser.OptionContext ctx) {
        return super.visitOption(ctx);
    }

    @Override
    public Object visitRangePerform(splParser.RangePerformContext ctx) {
        int val1 = Integer.parseInt(ctx.number(0).getText());
        int val2 = Integer.parseInt(ctx.number(1).getText());
        String x = ctx.identifier().getText();
        stack.get("DIGIT").put(x,null);
        for(int a =val1 ; a < val2; a++ )
        {   stack.get("DIGIT").put(x, String.valueOf(a));
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitStepRangePerform(splParser.StepRangePerformContext ctx) {
        int val1 = Integer.parseInt(ctx.number(0).getText());
        int val2 = Integer.parseInt(ctx.number(1).getText());
        int step = Integer.parseInt(ctx.number(2).getText());
        String x = ctx.identifier().getText();
        stack.get("DIGIT").put(x,null);
        for(int a =val1 ; a < val2; a+=step )
        {   stack.get("DIGIT").put(x, String.valueOf(a));
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitTernaryInitDigit(splParser.TernaryInitDigitContext ctx) {
        int a=0;
        String id = ctx.identifier().getText();
        if((boolean)visit(ctx.condition())) {
            a =Integer.parseInt((String) visit(ctx.expression(0)));
        } else {
            a =Integer.parseInt((String) visit(ctx.expression(1)));
        }
        stack.get("DIGIT").put(id, String.valueOf(a));
        return 0;
    }

    @Override
    public Object visitTernaryInitWord(splParser.TernaryInitWordContext ctx) {
        String a= null;
        String id = ctx.identifier().getText();
        if((boolean)visit(ctx.condition())) {
            a = ctx.sentence(0).getText();
        } else {
            a = ctx.sentence(1).getText();
        }
        stack.get("WORD").put(id, a);
        return 0;
    }

    @Override
    public Object visitTernaryInitDual(splParser.TernaryInitDualContext ctx) {
        String a= null;
        String id = ctx.identifier().getText();
        if((boolean)visit(ctx.condition())) {
            a =ctx.boolean_value.getText();
        } else {
            a =ctx.boolean_value.getText();
        }
        stack.get("DUAL").put(id, String.valueOf(a));
        return 0;
    }

    @Override
    public Object visitStarAddition(splParser.StarAdditionContext ctx) {
        int left =  Integer.parseInt(String.valueOf(visit(ctx.term())));
        int right =  Integer.parseInt(String.valueOf(visit(ctx.expression())));
        int result = left + right;
        return result;
    }

    @Override
    public Object visitStarSubtraction(splParser.StarSubtractionContext ctx) {
        int left = Integer.parseInt(String.valueOf(visit(ctx.term())));
        int right =  Integer.parseInt(String.valueOf(visit(ctx.expression())));
        int result = left - right;
        return result;
    }

    @Override
    public Object visitStarPrecedence(splParser.StarPrecedenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitStarMultiplication(splParser.StarMultiplicationContext ctx) {
        int left =  Integer.parseInt(String.valueOf(visit(ctx.factor())));
        int right =  Integer.parseInt(String.valueOf(visit(ctx.term())));
        int result = left * right;
        return result;
    }

    @Override
    public Object visitStarDivision(splParser.StarDivisionContext ctx) {
        int left =  Integer.parseInt(String.valueOf(visit(ctx.factor())));
        int right =  Integer.parseInt(String.valueOf(visit(ctx.term())));
        int result = left / right;
        return result;
    }

    @Override
    public Object visitStarFact(splParser.StarFactContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitStarIdenExpr(splParser.StarIdenExprContext ctx) {
        int val1 = 0;
        String val2 = null;
        String id = ctx.identifier().getText();
        if(id.getClass().equals("class java.lang.Integer"))
        {
            for (String datatype : stack.keySet()) {
                HashMap<String, String> innerMap = stack.get(datatype);
                if (innerMap.containsKey(id)) {
                    val1 = Integer.parseInt(innerMap.get(id));
                }
            }
            return val1;
        }else{
            for (String datatype : stack.keySet()) {
                HashMap<String, String> innerMap = stack.get(datatype);
                if (innerMap.containsKey(id)) {
                    val2 = (innerMap.get(id));
                }
            }
            return val2;
        }
    }

    @Override
    public Object visitStarDigitExpr(splParser.StarDigitExprContext ctx) {
        return ctx.number().getText();
    }

    @Override
    public Object visitSentence(splParser.SentenceContext ctx) {
        System.out.println(ctx.sent_option());
        return 0;
    }

    @Override
    public Object visitSent_option(splParser.Sent_optionContext ctx) {
        return super.visitSent_option(ctx);
    }

    @Override
    public Object visitStr_sent(splParser.Str_sentContext ctx) {
        return super.visitStr_sent(ctx);
    }

    @Override
    public Object visitIdentifier(splParser.IdentifierContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitSpecial_char(splParser.Special_charContext ctx) {
        return super.visitSpecial_char(ctx);
    }

    @Override
    public Object visitNumber(splParser.NumberContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
