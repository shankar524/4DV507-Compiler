// Generated from /Users/shankaracharya/Workspace/linn/sem1/compiler/assignment1/Expression.g4 by ANTLR 4.13.1

    package generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExpressionParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ExpressionParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ExpressionParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ExpressionParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ExpressionParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ExpressionParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ExpressionParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ExpressionParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ExpressionParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatement(ExpressionParser.ControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ExpressionParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(ExpressionParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ExpressionParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(ExpressionParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#functionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInvocation(ExpressionParser.FunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ExpressionParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#arrayItemAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayItemAccess(ExpressionParser.ArrayItemAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#lengthOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthOperation(ExpressionParser.LengthOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(ExpressionParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(ExpressionParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#arrayInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitialization(ExpressionParser.ArrayInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(ExpressionParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(ExpressionParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExpressionParser.TypeContext ctx);
}