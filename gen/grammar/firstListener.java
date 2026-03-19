// Generated from /home/sn3k/IdeaProjects/ANTLR_LAB/src/grammar/first.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link firstParser}.
 */
public interface firstListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link firstParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(firstParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(firstParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stat(firstParser.Expr_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stat(firstParser.Expr_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(firstParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(firstParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stat(firstParser.Print_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_stat}
	 * labeled alternative in {@link firstParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stat(firstParser.Print_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_single}
	 * labeled alternative in {@link firstParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock_single(firstParser.Block_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_single}
	 * labeled alternative in {@link firstParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock_single(firstParser.Block_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_real}
	 * labeled alternative in {@link firstParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock_real(firstParser.Block_realContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_real}
	 * labeled alternative in {@link firstParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock_real(firstParser.Block_realContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_tok}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt_tok(firstParser.Int_tokContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_tok}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt_tok(firstParser.Int_tokContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pars}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPars(firstParser.ParsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pars}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPars(firstParser.ParsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOp}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(firstParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOp}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(firstParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(firstParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link firstParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(firstParser.AssignContext ctx);
}