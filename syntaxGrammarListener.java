// Generated from syntaxGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link syntaxGrammarParser}.
 */
public interface syntaxGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link syntaxGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(syntaxGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link syntaxGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(syntaxGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link syntaxGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(syntaxGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link syntaxGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(syntaxGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link syntaxGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(syntaxGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link syntaxGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(syntaxGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link syntaxGrammarParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(syntaxGrammarParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link syntaxGrammarParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(syntaxGrammarParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link syntaxGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(syntaxGrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link syntaxGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(syntaxGrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link syntaxGrammarParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(syntaxGrammarParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link syntaxGrammarParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(syntaxGrammarParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link syntaxGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(syntaxGrammarParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link syntaxGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(syntaxGrammarParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link syntaxGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(syntaxGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link syntaxGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(syntaxGrammarParser.BoolContext ctx);
}