// Generated from /Users/shankaracharya/Workspace/linn/sem1/compiler/assignment1/Expression.g4 by ANTLR 4.13.1

    package generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExpressionParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExpressionParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#nonVoidTypes}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidTypes(ExpressionParser.NonVoidTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#nonVoidTypes}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidTypes(ExpressionParser.NonVoidTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(ExpressionParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(ExpressionParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ExpressionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ExpressionParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(ExpressionParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(ExpressionParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ExpressionParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ExpressionParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExpressionParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExpressionParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExpressionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExpressionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ExpressionParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ExpressionParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExpressionParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExpressionParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExpressionParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExpressionParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(ExpressionParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(ExpressionParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(ExpressionParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(ExpressionParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(ExpressionParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(ExpressionParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#numericLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiterals(ExpressionParser.NumericLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#numericLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiterals(ExpressionParser.NumericLiteralsContext ctx);
}