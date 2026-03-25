// Generated from /home/student/IdeaProjects/ANTLR_LAB/src/grammar/first.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link firstParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface firstVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link firstParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(firstParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(firstParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(firstParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(firstParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stat(firstParser.Expr_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stat(firstParser.Print_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block_single}
	 * labeled alternative in {@link firstParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_single(firstParser.Block_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block_real}
	 * labeled alternative in {@link firstParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_real(firstParser.Block_realContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_tok}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_tok(firstParser.Int_tokContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notOp}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOp(firstParser.NotOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(firstParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pars}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPars(firstParser.ParsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOp}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOp(firstParser.LogicOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(firstParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relOp}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(firstParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOp}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(firstParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(firstParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(firstParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(firstParser.ArgListContext ctx);
}