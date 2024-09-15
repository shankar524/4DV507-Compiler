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
	 * Enter a parse tree produced by {@link ExpressionParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ExpressionParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ExpressionParser.ParameterListContext ctx);
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
	 * Enter a parse tree produced by {@link ExpressionParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ExpressionParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ExpressionParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ExpressionParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ExpressionParser.ReturnStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ExpressionParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void enterControlStatement(ExpressionParser.ControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void exitControlStatement(ExpressionParser.ControlStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ExpressionParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ExpressionParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ExpressionParser.WhileStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ExpressionParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocation(ExpressionParser.FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocation(ExpressionParser.FunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ExpressionParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ExpressionParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#arrayItemAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayItemAccess(ExpressionParser.ArrayItemAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#arrayItemAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayItemAccess(ExpressionParser.ArrayItemAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#lengthOperation}.
	 * @param ctx the parse tree
	 */
	void enterLengthOperation(ExpressionParser.LengthOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#lengthOperation}.
	 * @param ctx the parse tree
	 */
	void exitLengthOperation(ExpressionParser.LengthOperationContext ctx);
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
	 * Enter a parse tree produced by {@link ExpressionParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ExpressionParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ExpressionParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#arrayInitialization}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitialization(ExpressionParser.ArrayInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#arrayInitialization}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitialization(ExpressionParser.ArrayInitializationContext ctx);
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
	 * Enter a parse tree produced by {@link ExpressionParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ExpressionParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ExpressionParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExpressionParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExpressionParser.TypeContext ctx);
}