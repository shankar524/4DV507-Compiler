// Generated from /Users/shankaracharya/Workspace/linn/sem1/compiler/ANTLR_Starter_Kit_ 2024/examples/Expressions/Expressions.g4 by ANTLR 4.13.1
    // Define name of package for generated Java files.
    package generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionsParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExpressionsParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ExpressionsParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExpressionsParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionsParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ExpressionsParser.AssignContext ctx);
}