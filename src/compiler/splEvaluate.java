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
    public Object visitProgram(splParser.ProgramContext param) {
        LinkedHashMap<String,String> words = new LinkedHashMap<String,String>();
        LinkedHashMap<String,String> digits = new LinkedHashMap<String,String>();
        LinkedHashMap<String,String> duals = new LinkedHashMap<String,String>();
        stack.put("WORD", words);
        stack.put("DIGIT", digits);
        stack.put("DUAL", duals);
        return visitChildren(param);
    }

    @Override
    public Object visitBlock(splParser.BlockContext param) {
        return visitChildren(param);
    }

    @Override
    public Object visitInitialization(splParser.InitializationContext param) {
        return super.visitInitialization(param);
    }

    @Override
    public Object visitDigitInitNum(splParser.DigitInitNumContext param) {
        String entity = param.identifier().getText();
        String digit = param.number().getText();
        stack.get("DIGIT").put(entity,digit);
        return 0;
    }

    @Override
    public Object visitDigitInitIden(splParser.DigitInitIdenContext param) {
        String entity1 = param.identifier(0).getText();
        String entity2 = param.identifier(1).getText();
        boolean keyExists = false;
        for (String integer : stack.keySet()) {
            if (!keyExists) {
                HashMap<String, String> innerMap = stack.get(integer);
                for (String name: innerMap.keySet()) {
                    String key = name.toString();
                    if (key.equals(entity2)) {
                        String value = innerMap.get(name).toString();
                        stack.get("DIGIT").put(entity1,value);
                        keyExists = true;
                        break;
                    }
                }
            }
        }

        return 0;
    }

    @Override
    public Object visitDigitInitEpr(splParser.DigitInitEprContext param) {
        String entity1 = param.identifier().getText();
        String value = visit(param.expression()).toString();
        stack.get("DIGIT").put(entity1,value);
        return 0;
    }

    @Override
    public Object visitWordInitId(splParser.WordInitIdContext param) {
        String entity1 = param.identifier(0).getText();
        String entity2 = param.identifier(1).getText();

        boolean keyExists = false;
        for (String string : stack.keySet()) {
            if (!keyExists) {
                HashMap<String, String> innerMap = stack.get(string);
                for (String name: innerMap.keySet()) {
                    String key = name.toString();
                    if (key.equals(entity2)) {
                        String value = innerMap.get(name).toString();
                        stack.get("WORD").put(entity1,value);
                        keyExists = true;
                        break;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public Object visitWordInitSen(splParser.WordInitSenContext param) {
        String entity1 = param.identifier().getText();
        String entity2 = param.sentence().getText();
        stack.get("WORD").put(entity1,entity2);
        return 0;
    }

    @Override
    public Object visitDualInitId(splParser.DualInitIdContext param) {
        String entity1 = param.identifier(0).getText();
        String entity2 = param.identifier(1).getText();
        boolean keyExists = false;
        for (String string : stack.keySet()) {
            if (!keyExists) {
                HashMap<String, String> innerMap = stack.get(string);
                for (String name: innerMap.keySet()) {
                    String key = name.toString();
                    if (key.equals(entity2)) {
                        String value = innerMap.get(name).toString();
                        stack.get("DUAL").put(entity1,value);
                        keyExists = true;
                        break;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public Object visitDualDef(splParser.DualDefContext param) {
        String entity1 = param.identifier().getText();
        String entity2 = param.bop.getText();
        stack.get("DUAL").put(entity1,entity2);
        return 0;
    }

    @Override
    public Object visitDigitDeclaration(splParser.DigitDeclarationContext param) {
        String id = param.identifier().getText();
        stack.get("DIGIT").put(id,null);
        return 0;
    }

    @Override
    public Object visitWordDeclaration(splParser.WordDeclarationContext param) {
        String id = param.identifier().getText();
        stack.get("WORD").put(id,null);
        return 0;
    }

    @Override
    public Object visitDualDeclaration(splParser.DualDeclarationContext param) {
        String id = param.identifier().getText();
        stack.get("DUAL").put(id,null);
        return 0;
    }

    @Override
    public Object visitDigitAssign(splParser.DigitAssignContext param) {
        String entity1 = param.identifier().getText();
        String entity2 = param.number().getText();
        stack.get("DIGIT").put(entity1,entity2);
        return 0;
    }

    @Override
    public Object visitDualAssign(splParser.DualAssignContext param) {
        String entity1 = param.identifier().getText();
        String entity2 = param.boolean_value.getText();
        stack.get("DUAL").put(entity1,entity2);
        return 0;
    }

    @Override
    public Object visitWordAssign(splParser.WordAssignContext param) {
        String entity1 = param.identifier().getText();
        String entity2 = param.sentence().getText();
        stack.get("WORD").put(entity1,entity2);
        return 0;
    }

    @Override
    public Object visitExprAssign(splParser.ExprAssignContext param) {
        String entity1 = param.identifier().getText();
        String entity2 = visit(param.expression()).toString();
        stack.get("DIGIT").put(entity1, entity2);
        return 0;
    }

    @Override
    public Object visitIncrement(splParser.IncrementContext param) {
        int val = 0;
        String id = param.identifier().getText();
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
    public Object visitDecrement(splParser.DecrementContext param) {
        int val = 0;
        String id = param.identifier().getText();
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
    public Object visitShowSentence(splParser.ShowSentenceContext param) {
        String res = param.sentence().getText();
        System.out.println(res.replaceAll("[\"]",""));
        return 0;
    }

    @Override
    public Object visitShowExpr(splParser.ShowExprContext param) {
        System.out.println(visit(param.expression()));
        return 0;
    }

    @Override
    public Object visitIfCheck(splParser.IfCheckContext param) {
        if((boolean)visit(param.condition())) {
            visit(param.block());
        }
        return 0;
    }

    @Override
    public Object visitIfCheckElse(splParser.IfCheckElseContext param) {
        if((boolean)visit(param.condition())) {
            visit(param.block(0));
        } else {
            visit(param.block(1));
        }
        return 0;
    }

    @Override
    public Object visitStarCond(splParser.StarCondContext param) {
        int expr1 = Integer.parseInt(visit(param.expression(0)).toString());
        int expr2 = Integer.parseInt(visit(param.expression(1)).toString());
        String conditionalOp = param.conditional_operator.getText();
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
        }
        return 0;
    }

    @Override
    public Object visitStarDualCond(splParser.StarDualCondContext param) {
        boolean boolVal = Boolean.parseBoolean(param.boolean_value.getText());
        return boolVal;
    }

    @Override
    public Object visitPerformtill(splParser.PerformtillContext param) {
        while((boolean)visit(param.condition()))
        {
            visit(param.block());
        }

        return 0;
    }

    @Override
    public Object visitPerform(splParser.PerformContext param) {
        for(visit(param.integer());(boolean)visit(param.condition());visit(param.option()))
        {
            visit(param.block());
        }
        return 0;
    }

    @Override
    public Object visitOption(splParser.OptionContext param) {
        return super.visitOption(param);
    }

    @Override
    public Object visitRangePerform(splParser.RangePerformContext param) {
        int val1 = Integer.parseInt(param.number(0).getText());
        int val2 = Integer.parseInt(param.number(1).getText());
        String x = param.identifier().getText();
        stack.get("DIGIT").put(x,null);
        for(int a =val1 ; a < val2; a++ )
        {   stack.get("DIGIT").put(x, String.valueOf(a));
            visit(param.block());
        }
        return 0;
    }

    @Override
    public Object visitStepRangePerform(splParser.StepRangePerformContext param) {
        int val1 = Integer.parseInt(param.number(0).getText());
        int val2 = Integer.parseInt(param.number(1).getText());
        int step = Integer.parseInt(param.number(2).getText());
        String x = param.identifier().getText();
        stack.get("DIGIT").put(x,null);
        for(int a =val1 ; a < val2; a+=step )
        {   stack.get("DIGIT").put(x, String.valueOf(a));
            visit(param.block());
        }
        return 0;
    }

    @Override
    public Object visitTernaryInitDigit(splParser.TernaryInitDigitContext param) {
        int a=0;
        String id = param.identifier().getText();
        if((boolean)visit(param.condition())) {
            a =Integer.parseInt((String) visit(param.expression(0)));
        } else {
            a =Integer.parseInt((String) visit(param.expression(1)));
        }
        stack.get("DIGIT").put(id, String.valueOf(a));
        return 0;
    }

    @Override
    public Object visitTernaryInitWord(splParser.TernaryInitWordContext param) {
        String a= null;
        String id = param.identifier().getText();
        if((boolean)visit(param.condition())) {
            a = param.sentence(0).getText();
        } else {
            a = param.sentence(1).getText();
        }
        stack.get("WORD").put(id, a);
        return 0;
    }

    @Override
    public Object visitTernaryInitDual(splParser.TernaryInitDualContext param) {
        String a= null;
        String id = param.identifier().getText();
        if((boolean)visit(param.condition())) {
            a =param.boolean_value.getText();
        } else {
            a =param.boolean_value.getText();
        }
        stack.get("DUAL").put(id, String.valueOf(a));
        return 0;
    }

    @Override
    public Object visitStarAddition(splParser.StarAdditionContext param) {
        int left =  Integer.parseInt(String.valueOf(visit(param.term())));
        int right =  Integer.parseInt(String.valueOf(visit(param.expression())));
        int result = left + right;
        return result;
    }

    @Override
    public Object visitStarSubtraction(splParser.StarSubtractionContext param) {
        int left = Integer.parseInt(String.valueOf(visit(param.term())));
        int right =  Integer.parseInt(String.valueOf(visit(param.expression())));
        int result = left - right;
        return result;
    }

    @Override
    public Object visitStarPrecedence(splParser.StarPrecedenceContext param) {
        return visitChildren(param);
    }

    @Override
    public Object visitStarMultiplication(splParser.StarMultiplicationContext param) {
        int left =  Integer.parseInt(String.valueOf(visit(param.factor())));
        int right =  Integer.parseInt(String.valueOf(visit(param.term())));
        int result = left * right;
        return result;
    }

    @Override
    public Object visitStarDivision(splParser.StarDivisionContext param) {
        int left =  Integer.parseInt(String.valueOf(visit(param.factor())));
        int right =  Integer.parseInt(String.valueOf(visit(param.term())));
        int result = left / right;
        return result;
    }

    @Override
    public Object visitStarFact(splParser.StarFactContext param) {
        return visitChildren(param);
    }

    @Override
    public Object visitStarIdenExpr(splParser.StarIdenExprContext param) {
        int val1 = 0;
        String val2 = null;
        String id = param.identifier().getText();
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
    public Object visitStarDigitExpr(splParser.StarDigitExprContext param) {
        return param.number().getText();
    }

    @Override
    public Object visitSentence(splParser.SentenceContext param) {
        System.out.println(param.sent_option());
        return 0;
    }

    @Override
    public Object visitSent_option(splParser.Sent_optionContext param) {
        return super.visitSent_option(param);
    }

    @Override
    public Object visitStr_sent(splParser.Str_sentContext param) {
        return super.visitStr_sent(param);
    }

    @Override
    public Object visitIdentifier(splParser.IdentifierContext param) {
        return visitChildren(param);
    }

    @Override
    public Object visitSpecial_char(splParser.Special_charContext param) {
        return super.visitSpecial_char(param);
    }

    @Override
    public Object visitNumber(splParser.NumberContext param) {
        return visitChildren(param);
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