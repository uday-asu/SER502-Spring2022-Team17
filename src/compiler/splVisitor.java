// Generated from C:/Users/svodeti/IdeaProjects/SER502Project_team17_SPL/data\spl.g4 by ANTLR 4.10.1

package compiler;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link splParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface splVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link splParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(splParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(splParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(splParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitInitNum}
	 * labeled alternative in {@link splParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitInitNum(splParser.DigitInitNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitInitIden}
	 * labeled alternative in {@link splParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitInitIden(splParser.DigitInitIdenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitInitEpr}
	 * labeled alternative in {@link splParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitInitEpr(splParser.DigitInitEprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wordInitId}
	 * labeled alternative in {@link splParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordInitId(splParser.WordInitIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wordInitSen}
	 * labeled alternative in {@link splParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordInitSen(splParser.WordInitSenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dualInitId}
	 * labeled alternative in {@link splParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDualInitId(splParser.DualInitIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dualDef}
	 * labeled alternative in {@link splParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDualDef(splParser.DualDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitDeclaration}
	 * labeled alternative in {@link splParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitDeclaration(splParser.DigitDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wordDeclaration}
	 * labeled alternative in {@link splParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordDeclaration(splParser.WordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dualDeclaration}
	 * labeled alternative in {@link splParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDualDeclaration(splParser.DualDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitAssign(splParser.DigitAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dualAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDualAssign(splParser.DualAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wordAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordAssign(splParser.WordAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link splParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssign(splParser.ExprAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link splParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(splParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link splParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(splParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSentence}
	 * labeled alternative in {@link splParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSentence(splParser.ShowSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showExpr}
	 * labeled alternative in {@link splParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowExpr(splParser.ShowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifCheck}
	 * labeled alternative in {@link splParser#if_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCheck(splParser.IfCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifCheckElse}
	 * labeled alternative in {@link splParser#if_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCheckElse(splParser.IfCheckElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starCond}
	 * labeled alternative in {@link splParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarCond(splParser.StarCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starDualCond}
	 * labeled alternative in {@link splParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarDualCond(splParser.StarDualCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#performtill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformtill(splParser.PerformtillContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#perform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform(splParser.PerformContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(splParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangePerform}
	 * labeled alternative in {@link splParser#performInRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangePerform(splParser.RangePerformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stepRangePerform}
	 * labeled alternative in {@link splParser#performInRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepRangePerform(splParser.StepRangePerformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryInitDigit}
	 * labeled alternative in {@link splParser#ternary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryInitDigit(splParser.TernaryInitDigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryInitWord}
	 * labeled alternative in {@link splParser#ternary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryInitWord(splParser.TernaryInitWordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryInitDual}
	 * labeled alternative in {@link splParser#ternary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryInitDual(splParser.TernaryInitDualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starAddition}
	 * labeled alternative in {@link splParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarAddition(splParser.StarAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starSubtraction}
	 * labeled alternative in {@link splParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarSubtraction(splParser.StarSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starPrecedence}
	 * labeled alternative in {@link splParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarPrecedence(splParser.StarPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starMultiplication}
	 * labeled alternative in {@link splParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarMultiplication(splParser.StarMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starDivision}
	 * labeled alternative in {@link splParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarDivision(splParser.StarDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starFact}
	 * labeled alternative in {@link splParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarFact(splParser.StarFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starIdenExpr}
	 * labeled alternative in {@link splParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarIdenExpr(splParser.StarIdenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starDigitExpr}
	 * labeled alternative in {@link splParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarDigitExpr(splParser.StarDigitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(splParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#sent_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_option(splParser.Sent_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#str_sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_sent(splParser.Str_sentContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(splParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#special_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_char(splParser.Special_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link splParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(splParser.NumberContext ctx);
}