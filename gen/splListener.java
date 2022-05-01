// Generated from C:/Users/svodeti/IdeaProjects/SER502Project_team17_SPL/data\spl.g4 by ANTLR 4.10.1

package compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link splParser}.
 */
public interface splListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link splParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(splParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(splParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(splParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(splParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(splParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(splParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitInitNum}
	 * labeled alternative in {@link splParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterDigitInitNum(splParser.DigitInitNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitInitNum}
	 * labeled alternative in {@link splParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitDigitInitNum(splParser.DigitInitNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitInitIden}
	 * labeled alternative in {@link splParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterDigitInitIden(splParser.DigitInitIdenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitInitIden}
	 * labeled alternative in {@link splParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitDigitInitIden(splParser.DigitInitIdenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitInitEpr}
	 * labeled alternative in {@link splParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterDigitInitEpr(splParser.DigitInitEprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitInitEpr}
	 * labeled alternative in {@link splParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitDigitInitEpr(splParser.DigitInitEprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wordInitId}
	 * labeled alternative in {@link splParser#string}.
	 * @param ctx the parse tree
	 */
	void enterWordInitId(splParser.WordInitIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wordInitId}
	 * labeled alternative in {@link splParser#string}.
	 * @param ctx the parse tree
	 */
	void exitWordInitId(splParser.WordInitIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wordInitSen}
	 * labeled alternative in {@link splParser#string}.
	 * @param ctx the parse tree
	 */
	void enterWordInitSen(splParser.WordInitSenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wordInitSen}
	 * labeled alternative in {@link splParser#string}.
	 * @param ctx the parse tree
	 */
	void exitWordInitSen(splParser.WordInitSenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dualInitId}
	 * labeled alternative in {@link splParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterDualInitId(splParser.DualInitIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dualInitId}
	 * labeled alternative in {@link splParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitDualInitId(splParser.DualInitIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dualDef}
	 * labeled alternative in {@link splParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterDualDef(splParser.DualDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dualDef}
	 * labeled alternative in {@link splParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitDualDef(splParser.DualDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitDeclaration}
	 * labeled alternative in {@link splParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDigitDeclaration(splParser.DigitDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitDeclaration}
	 * labeled alternative in {@link splParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDigitDeclaration(splParser.DigitDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wordDeclaration}
	 * labeled alternative in {@link splParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterWordDeclaration(splParser.WordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wordDeclaration}
	 * labeled alternative in {@link splParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitWordDeclaration(splParser.WordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dualDeclaration}
	 * labeled alternative in {@link splParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDualDeclaration(splParser.DualDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dualDeclaration}
	 * labeled alternative in {@link splParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDualDeclaration(splParser.DualDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDigitAssign(splParser.DigitAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDigitAssign(splParser.DigitAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dualAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDualAssign(splParser.DualAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dualAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDualAssign(splParser.DualAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wordAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterWordAssign(splParser.WordAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wordAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitWordAssign(splParser.WordAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExprAssign(splParser.ExprAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExprAssign(splParser.ExprAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code increment}
	 * labeled alternative in {@link splParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(splParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link splParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(splParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link splParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(splParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link splParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(splParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSentence}
	 * labeled alternative in {@link splParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShowSentence(splParser.ShowSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSentence}
	 * labeled alternative in {@link splParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShowSentence(splParser.ShowSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showExpr}
	 * labeled alternative in {@link splParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShowExpr(splParser.ShowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showExpr}
	 * labeled alternative in {@link splParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShowExpr(splParser.ShowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifCheck}
	 * labeled alternative in {@link splParser#if_check}.
	 * @param ctx the parse tree
	 */
	void enterIfCheck(splParser.IfCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifCheck}
	 * labeled alternative in {@link splParser#if_check}.
	 * @param ctx the parse tree
	 */
	void exitIfCheck(splParser.IfCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifCheckElse}
	 * labeled alternative in {@link splParser#if_check}.
	 * @param ctx the parse tree
	 */
	void enterIfCheckElse(splParser.IfCheckElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifCheckElse}
	 * labeled alternative in {@link splParser#if_check}.
	 * @param ctx the parse tree
	 */
	void exitIfCheckElse(splParser.IfCheckElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starCond}
	 * labeled alternative in {@link splParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterStarCond(splParser.StarCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starCond}
	 * labeled alternative in {@link splParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitStarCond(splParser.StarCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starDualCond}
	 * labeled alternative in {@link splParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterStarDualCond(splParser.StarDualCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starDualCond}
	 * labeled alternative in {@link splParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitStarDualCond(splParser.StarDualCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#performtill}.
	 * @param ctx the parse tree
	 */
	void enterPerformtill(splParser.PerformtillContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#performtill}.
	 * @param ctx the parse tree
	 */
	void exitPerformtill(splParser.PerformtillContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#perform}.
	 * @param ctx the parse tree
	 */
	void enterPerform(splParser.PerformContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#perform}.
	 * @param ctx the parse tree
	 */
	void exitPerform(splParser.PerformContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(splParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(splParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangePerform}
	 * labeled alternative in {@link splParser#performInRange}.
	 * @param ctx the parse tree
	 */
	void enterRangePerform(splParser.RangePerformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangePerform}
	 * labeled alternative in {@link splParser#performInRange}.
	 * @param ctx the parse tree
	 */
	void exitRangePerform(splParser.RangePerformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stepRangePerform}
	 * labeled alternative in {@link splParser#performInRange}.
	 * @param ctx the parse tree
	 */
	void enterStepRangePerform(splParser.StepRangePerformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stepRangePerform}
	 * labeled alternative in {@link splParser#performInRange}.
	 * @param ctx the parse tree
	 */
	void exitStepRangePerform(splParser.StepRangePerformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryInitDigit}
	 * labeled alternative in {@link splParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernaryInitDigit(splParser.TernaryInitDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryInitDigit}
	 * labeled alternative in {@link splParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernaryInitDigit(splParser.TernaryInitDigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryInitWord}
	 * labeled alternative in {@link splParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernaryInitWord(splParser.TernaryInitWordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryInitWord}
	 * labeled alternative in {@link splParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernaryInitWord(splParser.TernaryInitWordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryInitDual}
	 * labeled alternative in {@link splParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernaryInitDual(splParser.TernaryInitDualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryInitDual}
	 * labeled alternative in {@link splParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernaryInitDual(splParser.TernaryInitDualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starAddition}
	 * labeled alternative in {@link splParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStarAddition(splParser.StarAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starAddition}
	 * labeled alternative in {@link splParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStarAddition(splParser.StarAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starSubtraction}
	 * labeled alternative in {@link splParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStarSubtraction(splParser.StarSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starSubtraction}
	 * labeled alternative in {@link splParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStarSubtraction(splParser.StarSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starPrecedence}
	 * labeled alternative in {@link splParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStarPrecedence(splParser.StarPrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starPrecedence}
	 * labeled alternative in {@link splParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStarPrecedence(splParser.StarPrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starMultiplication}
	 * labeled alternative in {@link splParser#term}.
	 * @param ctx the parse tree
	 */
	void enterStarMultiplication(splParser.StarMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starMultiplication}
	 * labeled alternative in {@link splParser#term}.
	 * @param ctx the parse tree
	 */
	void exitStarMultiplication(splParser.StarMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starDivision}
	 * labeled alternative in {@link splParser#term}.
	 * @param ctx the parse tree
	 */
	void enterStarDivision(splParser.StarDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starDivision}
	 * labeled alternative in {@link splParser#term}.
	 * @param ctx the parse tree
	 */
	void exitStarDivision(splParser.StarDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starFact}
	 * labeled alternative in {@link splParser#term}.
	 * @param ctx the parse tree
	 */
	void enterStarFact(splParser.StarFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starFact}
	 * labeled alternative in {@link splParser#term}.
	 * @param ctx the parse tree
	 */
	void exitStarFact(splParser.StarFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starIdenExpr}
	 * labeled alternative in {@link splParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStarIdenExpr(splParser.StarIdenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starIdenExpr}
	 * labeled alternative in {@link splParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStarIdenExpr(splParser.StarIdenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starDigitExpr}
	 * labeled alternative in {@link splParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStarDigitExpr(splParser.StarDigitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starDigitExpr}
	 * labeled alternative in {@link splParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStarDigitExpr(splParser.StarDigitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(splParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(splParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#sent_option}.
	 * @param ctx the parse tree
	 */
	void enterSent_option(splParser.Sent_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#sent_option}.
	 * @param ctx the parse tree
	 */
	void exitSent_option(splParser.Sent_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#str_sent}.
	 * @param ctx the parse tree
	 */
	void enterStr_sent(splParser.Str_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#str_sent}.
	 * @param ctx the parse tree
	 */
	void exitStr_sent(splParser.Str_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(splParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(splParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#special_char}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_char(splParser.Special_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#special_char}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_char(splParser.Special_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link splParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(splParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link splParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(splParser.NumberContext ctx);
}