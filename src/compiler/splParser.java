// Generated from C:/Users/svodeti/IdeaProjects/SER502Project_team17_SPL/data\spl.g4 by ANTLR 4.10.1

package compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class splParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, Str=38, ID=39, 
		Special_char=40, Digit=41, WS=42, COMMENT=43, LINE_COMMENT=44;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_initialization = 2, RULE_integer = 3, 
		RULE_string = 4, RULE_bool = 5, RULE_declaration = 6, RULE_assignment = 7, 
		RULE_unary = 8, RULE_show = 9, RULE_if_check = 10, RULE_condition = 11, 
		RULE_performtill = 12, RULE_perform = 13, RULE_option = 14, RULE_performInRange = 15, 
		RULE_ternary = 16, RULE_expression = 17, RULE_term = 18, RULE_factor = 19, 
		RULE_sentence = 20, RULE_sent_option = 21, RULE_str_sent = 22, RULE_identifier = 23, 
		RULE_special_char = 24, RULE_number = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "initialization", "integer", "string", "bool", "declaration", 
			"assignment", "unary", "show", "if_check", "condition", "performtill", 
			"perform", "option", "performInRange", "ternary", "expression", "term", 
			"factor", "sentence", "sent_option", "str_sent", "identifier", "special_char", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'***'", "'//'", "'\\'", "'.'", "'digit'", "'**='", "'word'", "'\"'", 
			"'dual'", "'true'", "'false'", "'++'", "'--'", "'show'", "'if_check'", 
			"'{'", "'}'", "'else'", "'*=='", "'*<'", "'*>'", "'*<='", "'*>='", "'*!='", 
			"'performtill'", "'('", "')'", "'perform'", "','", "'performInRange'", 
			"'in'", "'range'", "':'", "'*+'", "'*-'", "'**'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Str", "ID", "Special_char", "Digit", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "spl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public splParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(T__1);
			setState(54);
			block();
			setState(55);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public If_checkContext if_check() {
			return getRuleContext(If_checkContext.class,0);
		}
		public PerformtillContext performtill() {
			return getRuleContext(PerformtillContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PerformContext perform() {
			return getRuleContext(PerformContext.class,0);
		}
		public PerformInRangeContext performInRange() {
			return getRuleContext(PerformInRangeContext.class,0);
		}
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				initialization();
				setState(58);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				initialization();
				setState(61);
				match(T__3);
				setState(62);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				declaration();
				setState(65);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				declaration();
				setState(68);
				match(T__3);
				setState(69);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				if_check();
				setState(72);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				if_check();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				performtill();
				setState(76);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				performtill();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				unary();
				setState(80);
				match(T__3);
				setState(81);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(83);
				unary();
				setState(84);
				match(T__3);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(86);
				assignment();
				setState(87);
				match(T__3);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(89);
				assignment();
				setState(90);
				match(T__3);
				setState(91);
				block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(93);
				perform();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(94);
				perform();
				setState(95);
				block();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(97);
				performInRange();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(98);
				performInRange();
				setState(99);
				block();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(101);
				ternary();
				setState(102);
				match(T__3);
				setState(103);
				block();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(105);
				ternary();
				setState(106);
				match(T__3);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(108);
				show();
				setState(109);
				match(T__3);
				setState(110);
				block();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(112);
				show();
				setState(113);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializationContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initialization);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				integer();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				string();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	 
		public IntegerContext() { }
		public void copyFrom(IntegerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DigitInitIdenContext extends IntegerContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DigitInitIdenContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDigitInitIden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDigitInitIden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDigitInitIden(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitInitNumContext extends IntegerContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DigitInitNumContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDigitInitNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDigitInitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDigitInitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitInitEprContext extends IntegerContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DigitInitEprContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDigitInitEpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDigitInitEpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDigitInitEpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integer);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DigitInitNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__4);
				setState(123);
				identifier();
				setState(124);
				match(T__5);
				setState(125);
				number();
				}
				break;
			case 2:
				_localctx = new DigitInitIdenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__4);
				setState(128);
				identifier();
				setState(129);
				match(T__5);
				setState(130);
				identifier();
				}
				break;
			case 3:
				_localctx = new DigitInitEprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__4);
				setState(133);
				identifier();
				setState(134);
				match(T__5);
				setState(135);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WordInitIdContext extends StringContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public WordInitIdContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterWordInitId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitWordInitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitWordInitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WordInitSenContext extends StringContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public WordInitSenContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterWordInitSen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitWordInitSen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitWordInitSen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new WordInitIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__6);
				setState(140);
				identifier();
				setState(141);
				match(T__5);
				setState(142);
				identifier();
				}
				break;
			case 2:
				_localctx = new WordInitSenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__6);
				setState(145);
				identifier();
				setState(146);
				match(T__5);
				setState(147);
				match(T__7);
				setState(148);
				sentence();
				setState(149);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DualDefContext extends BoolContext {
		public Token bop;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DualDefContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDualDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDualDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDualDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DualInitIdContext extends BoolContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DualInitIdContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDualInitId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDualInitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDualInitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DualInitIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__8);
				setState(154);
				identifier();
				setState(155);
				match(T__5);
				setState(156);
				identifier();
				}
				break;
			case 2:
				_localctx = new DualDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T__8);
				setState(159);
				identifier();
				setState(160);
				match(T__5);
				setState(161);
				((DualDefContext)_localctx).bop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((DualDefContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DualDeclarationContext extends DeclarationContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DualDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDualDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDualDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDualDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WordDeclarationContext extends DeclarationContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WordDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterWordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitWordDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitWordDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitDeclarationContext extends DeclarationContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DigitDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDigitDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDigitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDigitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new DigitDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__4);
				setState(166);
				identifier();
				}
				break;
			case T__6:
				_localctx = new WordDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__6);
				setState(168);
				identifier();
				}
				break;
			case T__8:
				_localctx = new DualDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__8);
				setState(170);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WordAssignContext extends AssignmentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public WordAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterWordAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitWordAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitWordAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DualAssignContext extends AssignmentContext {
		public Token boolean_value;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DualAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDualAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDualAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDualAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAssignContext extends AssignmentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterExprAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitExprAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitExprAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitAssignContext extends AssignmentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DigitAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDigitAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDigitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDigitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DigitAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				identifier();
				setState(174);
				match(T__5);
				setState(175);
				number();
				}
				break;
			case 2:
				_localctx = new DualAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				identifier();
				setState(178);
				match(T__5);
				setState(179);
				((DualAssignContext)_localctx).boolean_value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((DualAssignContext)_localctx).boolean_value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new WordAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				identifier();
				setState(182);
				match(T__5);
				setState(183);
				match(T__7);
				setState(184);
				sentence();
				setState(185);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new ExprAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				identifier();
				setState(188);
				match(T__5);
				setState(189);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecrementContext extends UnaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DecrementContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementContext extends UnaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IncrementContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unary);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IncrementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				identifier();
				setState(194);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new DecrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				identifier();
				setState(197);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowContext extends ParserRuleContext {
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	 
		public ShowContext() { }
		public void copyFrom(ShowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowExprContext extends ShowContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ShowExprContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterShowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitShowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitShowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSentenceContext extends ShowContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ShowSentenceContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterShowSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitShowSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitShowSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_show);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ShowSentenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__13);
				setState(202);
				sentence();
				}
				break;
			case 2:
				_localctx = new ShowExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__13);
				setState(204);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_checkContext extends ParserRuleContext {
		public If_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_check; }
	 
		public If_checkContext() { }
		public void copyFrom(If_checkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfCheckContext extends If_checkContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfCheckContext(If_checkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterIfCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitIfCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitIfCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfCheckElseContext extends If_checkContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfCheckElseContext(If_checkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterIfCheckElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitIfCheckElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitIfCheckElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_checkContext if_check() throws RecognitionException {
		If_checkContext _localctx = new If_checkContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_check);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IfCheckContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__14);
				setState(208);
				condition();
				setState(209);
				match(T__15);
				setState(210);
				block();
				setState(211);
				match(T__16);
				}
				break;
			case 2:
				_localctx = new IfCheckElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__14);
				setState(214);
				condition();
				setState(215);
				match(T__15);
				setState(216);
				block();
				setState(217);
				match(T__16);
				setState(218);
				match(T__17);
				setState(219);
				match(T__15);
				setState(220);
				block();
				setState(221);
				match(T__16);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarCondContext extends ConditionContext {
		public Token conditional_operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StarCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarDualCondContext extends ConditionContext {
		public Token boolean_value;
		public StarDualCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarDualCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarDualCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarDualCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case Digit:
				_localctx = new StarCondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				expression();
				setState(226);
				((StarCondContext)_localctx).conditional_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
					((StarCondContext)_localctx).conditional_operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				expression();
				}
				break;
			case T__9:
			case T__10:
				_localctx = new StarDualCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((StarDualCondContext)_localctx).boolean_value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((StarDualCondContext)_localctx).boolean_value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PerformtillContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PerformtillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_performtill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterPerformtill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitPerformtill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitPerformtill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerformtillContext performtill() throws RecognitionException {
		PerformtillContext _localctx = new PerformtillContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_performtill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__24);
			setState(233);
			match(T__25);
			setState(234);
			condition();
			setState(235);
			match(T__26);
			setState(236);
			match(T__15);
			setState(237);
			block();
			setState(238);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PerformContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PerformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterPerform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitPerform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitPerform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerformContext perform() throws RecognitionException {
		PerformContext _localctx = new PerformContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_perform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__27);
			setState(241);
			match(T__25);
			setState(242);
			integer();
			setState(243);
			match(T__28);
			setState(244);
			condition();
			setState(245);
			match(T__28);
			setState(246);
			option();
			setState(247);
			match(T__26);
			setState(248);
			match(T__15);
			setState(249);
			block();
			setState(250);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			unary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PerformInRangeContext extends ParserRuleContext {
		public PerformInRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_performInRange; }
	 
		public PerformInRangeContext() { }
		public void copyFrom(PerformInRangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StepRangePerformContext extends PerformInRangeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StepRangePerformContext(PerformInRangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStepRangePerform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStepRangePerform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStepRangePerform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangePerformContext extends PerformInRangeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RangePerformContext(PerformInRangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterRangePerform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitRangePerform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitRangePerform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerformInRangeContext performInRange() throws RecognitionException {
		PerformInRangeContext _localctx = new PerformInRangeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_performInRange);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new RangePerformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__29);
				setState(255);
				identifier();
				setState(256);
				match(T__30);
				setState(257);
				match(T__31);
				setState(258);
				match(T__25);
				setState(259);
				number();
				setState(260);
				match(T__28);
				setState(261);
				number();
				setState(262);
				match(T__26);
				setState(263);
				match(T__15);
				setState(264);
				block();
				setState(265);
				match(T__16);
				}
				break;
			case 2:
				_localctx = new StepRangePerformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__29);
				setState(268);
				identifier();
				setState(269);
				match(T__30);
				setState(270);
				match(T__31);
				setState(271);
				match(T__25);
				setState(272);
				number();
				setState(273);
				match(T__28);
				setState(274);
				number();
				setState(275);
				match(T__28);
				setState(276);
				number();
				setState(277);
				match(T__26);
				setState(278);
				match(T__15);
				setState(279);
				block();
				setState(280);
				match(T__16);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryContext extends ParserRuleContext {
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
	 
		public TernaryContext() { }
		public void copyFrom(TernaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryInitDualContext extends TernaryContext {
		public Token boolean_value;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TernaryInitDualContext(TernaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterTernaryInitDual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitTernaryInitDual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitTernaryInitDual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryInitDigitContext extends TernaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryInitDigitContext(TernaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterTernaryInitDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitTernaryInitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitTernaryInitDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryInitWordContext extends TernaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TernaryInitWordContext(TernaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterTernaryInitWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitTernaryInitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitTernaryInitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ternary);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new TernaryInitDigitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(T__4);
				setState(285);
				identifier();
				setState(286);
				match(T__5);
				setState(287);
				condition();
				setState(288);
				match(T__32);
				setState(289);
				expression();
				setState(290);
				match(T__28);
				setState(291);
				expression();
				}
				break;
			case T__6:
				_localctx = new TernaryInitWordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(T__6);
				setState(294);
				identifier();
				setState(295);
				match(T__5);
				setState(296);
				condition();
				setState(297);
				match(T__32);
				setState(298);
				match(T__7);
				setState(299);
				sentence();
				setState(300);
				match(T__7);
				setState(301);
				match(T__28);
				setState(302);
				match(T__7);
				setState(303);
				sentence();
				setState(304);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new TernaryInitDualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(T__8);
				setState(307);
				identifier();
				setState(308);
				match(T__5);
				setState(309);
				condition();
				setState(310);
				match(T__32);
				setState(311);
				((TernaryInitDualContext)_localctx).boolean_value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((TernaryInitDualContext)_localctx).boolean_value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				match(T__28);
				setState(313);
				((TernaryInitDualContext)_localctx).boolean_value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((TernaryInitDualContext)_localctx).boolean_value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarPrecedenceContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public StarPrecedenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarAdditionContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StarAdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarSubtractionContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StarSubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new StarAdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				term();
				setState(318);
				match(T__33);
				setState(319);
				expression();
				}
				break;
			case 2:
				_localctx = new StarSubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				term();
				setState(322);
				match(T__34);
				setState(323);
				expression();
				}
				break;
			case 3:
				_localctx = new StarPrecedenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarMultiplicationContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public StarMultiplicationContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarFactContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public StarFactContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarFact(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarDivisionContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public StarDivisionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new StarMultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				factor();
				setState(329);
				match(T__35);
				setState(330);
				term();
				}
				break;
			case 2:
				_localctx = new StarDivisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				factor();
				setState(333);
				match(T__36);
				setState(334);
				term();
				}
				break;
			case 3:
				_localctx = new StarFactContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarIdenExprContext extends FactorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StarIdenExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarIdenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarIdenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarIdenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarDigitExprContext extends FactorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StarDigitExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStarDigitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStarDigitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStarDigitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StarIdenExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				identifier();
				}
				break;
			case Digit:
				_localctx = new StarDigitExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public List<Sent_optionContext> sent_option() {
			return getRuleContexts(Sent_optionContext.class);
		}
		public Sent_optionContext sent_option(int i) {
			return getRuleContext(Sent_optionContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Str) | (1L << Special_char) | (1L << Digit))) != 0)) {
				{
				{
				setState(343);
				sent_option();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_optionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Str_sentContext str_sent() {
			return getRuleContext(Str_sentContext.class,0);
		}
		public Special_charContext special_char() {
			return getRuleContext(Special_charContext.class,0);
		}
		public Sent_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterSent_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitSent_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitSent_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_optionContext sent_option() throws RecognitionException {
		Sent_optionContext _localctx = new Sent_optionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sent_option);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				number();
				}
				break;
			case Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				str_sent();
				}
				break;
			case Special_char:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				special_char();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Str_sentContext extends ParserRuleContext {
		public TerminalNode Str() { return getToken(splParser.Str, 0); }
		public Str_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterStr_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitStr_sent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitStr_sent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_sentContext str_sent() throws RecognitionException {
		Str_sentContext _localctx = new Str_sentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_str_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(Str);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(splParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_charContext extends ParserRuleContext {
		public TerminalNode Special_char() { return getToken(splParser.Special_char, 0); }
		public Special_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterSpecial_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitSpecial_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitSpecial_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_charContext special_char() throws RecognitionException {
		Special_charContext _localctx = new Special_charContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_special_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(Special_char);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(splParser.Digit, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof splListener ) ((splListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof splVisitor ) return ((splVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(Digit);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u016b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"t\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002y\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008a\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0098"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a4"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00ac\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c0\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c8\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00ce\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00e0\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00e7\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u011b\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u013c\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0147\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0152\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0156\b"+
		"\u0013\u0001\u0014\u0005\u0014\u0159\b\u0014\n\u0014\f\u0014\u015c\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0161\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000"+
		"\u0002\u0001\u0000\n\u000b\u0001\u0000\u0013\u0018\u017d\u00004\u0001"+
		"\u0000\u0000\u0000\u0002s\u0001\u0000\u0000\u0000\u0004x\u0001\u0000\u0000"+
		"\u0000\u0006\u0089\u0001\u0000\u0000\u0000\b\u0097\u0001\u0000\u0000\u0000"+
		"\n\u00a3\u0001\u0000\u0000\u0000\f\u00ab\u0001\u0000\u0000\u0000\u000e"+
		"\u00bf\u0001\u0000\u0000\u0000\u0010\u00c7\u0001\u0000\u0000\u0000\u0012"+
		"\u00cd\u0001\u0000\u0000\u0000\u0014\u00df\u0001\u0000\u0000\u0000\u0016"+
		"\u00e6\u0001\u0000\u0000\u0000\u0018\u00e8\u0001\u0000\u0000\u0000\u001a"+
		"\u00f0\u0001\u0000\u0000\u0000\u001c\u00fc\u0001\u0000\u0000\u0000\u001e"+
		"\u011a\u0001\u0000\u0000\u0000 \u013b\u0001\u0000\u0000\u0000\"\u0146"+
		"\u0001\u0000\u0000\u0000$\u0151\u0001\u0000\u0000\u0000&\u0155\u0001\u0000"+
		"\u0000\u0000(\u015a\u0001\u0000\u0000\u0000*\u0160\u0001\u0000\u0000\u0000"+
		",\u0162\u0001\u0000\u0000\u0000.\u0164\u0001\u0000\u0000\u00000\u0166"+
		"\u0001\u0000\u0000\u00002\u0168\u0001\u0000\u0000\u000045\u0005\u0001"+
		"\u0000\u000056\u0005\u0002\u0000\u000067\u0003\u0002\u0001\u000078\u0005"+
		"\u0003\u0000\u00008\u0001\u0001\u0000\u0000\u00009:\u0003\u0004\u0002"+
		"\u0000:;\u0005\u0004\u0000\u0000;t\u0001\u0000\u0000\u0000<=\u0003\u0004"+
		"\u0002\u0000=>\u0005\u0004\u0000\u0000>?\u0003\u0002\u0001\u0000?t\u0001"+
		"\u0000\u0000\u0000@A\u0003\f\u0006\u0000AB\u0005\u0004\u0000\u0000Bt\u0001"+
		"\u0000\u0000\u0000CD\u0003\f\u0006\u0000DE\u0005\u0004\u0000\u0000EF\u0003"+
		"\u0002\u0001\u0000Ft\u0001\u0000\u0000\u0000GH\u0003\u0014\n\u0000HI\u0003"+
		"\u0002\u0001\u0000It\u0001\u0000\u0000\u0000Jt\u0003\u0014\n\u0000KL\u0003"+
		"\u0018\f\u0000LM\u0003\u0002\u0001\u0000Mt\u0001\u0000\u0000\u0000Nt\u0003"+
		"\u0018\f\u0000OP\u0003\u0010\b\u0000PQ\u0005\u0004\u0000\u0000QR\u0003"+
		"\u0002\u0001\u0000Rt\u0001\u0000\u0000\u0000ST\u0003\u0010\b\u0000TU\u0005"+
		"\u0004\u0000\u0000Ut\u0001\u0000\u0000\u0000VW\u0003\u000e\u0007\u0000"+
		"WX\u0005\u0004\u0000\u0000Xt\u0001\u0000\u0000\u0000YZ\u0003\u000e\u0007"+
		"\u0000Z[\u0005\u0004\u0000\u0000[\\\u0003\u0002\u0001\u0000\\t\u0001\u0000"+
		"\u0000\u0000]t\u0003\u001a\r\u0000^_\u0003\u001a\r\u0000_`\u0003\u0002"+
		"\u0001\u0000`t\u0001\u0000\u0000\u0000at\u0003\u001e\u000f\u0000bc\u0003"+
		"\u001e\u000f\u0000cd\u0003\u0002\u0001\u0000dt\u0001\u0000\u0000\u0000"+
		"ef\u0003 \u0010\u0000fg\u0005\u0004\u0000\u0000gh\u0003\u0002\u0001\u0000"+
		"ht\u0001\u0000\u0000\u0000ij\u0003 \u0010\u0000jk\u0005\u0004\u0000\u0000"+
		"kt\u0001\u0000\u0000\u0000lm\u0003\u0012\t\u0000mn\u0005\u0004\u0000\u0000"+
		"no\u0003\u0002\u0001\u0000ot\u0001\u0000\u0000\u0000pq\u0003\u0012\t\u0000"+
		"qr\u0005\u0004\u0000\u0000rt\u0001\u0000\u0000\u0000s9\u0001\u0000\u0000"+
		"\u0000s<\u0001\u0000\u0000\u0000s@\u0001\u0000\u0000\u0000sC\u0001\u0000"+
		"\u0000\u0000sG\u0001\u0000\u0000\u0000sJ\u0001\u0000\u0000\u0000sK\u0001"+
		"\u0000\u0000\u0000sN\u0001\u0000\u0000\u0000sO\u0001\u0000\u0000\u0000"+
		"sS\u0001\u0000\u0000\u0000sV\u0001\u0000\u0000\u0000sY\u0001\u0000\u0000"+
		"\u0000s]\u0001\u0000\u0000\u0000s^\u0001\u0000\u0000\u0000sa\u0001\u0000"+
		"\u0000\u0000sb\u0001\u0000\u0000\u0000se\u0001\u0000\u0000\u0000si\u0001"+
		"\u0000\u0000\u0000sl\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000"+
		"t\u0003\u0001\u0000\u0000\u0000uy\u0003\u0006\u0003\u0000vy\u0003\b\u0004"+
		"\u0000wy\u0003\n\u0005\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xw\u0001\u0000\u0000\u0000y\u0005\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0005\u0000\u0000{|\u0003.\u0017\u0000|}\u0005\u0006\u0000\u0000}~\u0003"+
		"2\u0019\u0000~\u008a\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0005\u0000"+
		"\u0000\u0080\u0081\u0003.\u0017\u0000\u0081\u0082\u0005\u0006\u0000\u0000"+
		"\u0082\u0083\u0003.\u0017\u0000\u0083\u008a\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\u0005\u0000\u0000\u0085\u0086\u0003.\u0017\u0000\u0086\u0087"+
		"\u0005\u0006\u0000\u0000\u0087\u0088\u0003\"\u0011\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089z\u0001\u0000\u0000\u0000\u0089\u007f\u0001\u0000"+
		"\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u008a\u0007\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\u0007\u0000\u0000\u008c\u008d\u0003.\u0017"+
		"\u0000\u008d\u008e\u0005\u0006\u0000\u0000\u008e\u008f\u0003.\u0017\u0000"+
		"\u008f\u0098\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0007\u0000\u0000"+
		"\u0091\u0092\u0003.\u0017\u0000\u0092\u0093\u0005\u0006\u0000\u0000\u0093"+
		"\u0094\u0005\b\u0000\u0000\u0094\u0095\u0003(\u0014\u0000\u0095\u0096"+
		"\u0005\b\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u008b\u0001"+
		"\u0000\u0000\u0000\u0097\u0090\u0001\u0000\u0000\u0000\u0098\t\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005\t\u0000\u0000\u009a\u009b\u0003.\u0017"+
		"\u0000\u009b\u009c\u0005\u0006\u0000\u0000\u009c\u009d\u0003.\u0017\u0000"+
		"\u009d\u00a4\u0001\u0000\u0000\u0000\u009e\u009f\u0005\t\u0000\u0000\u009f"+
		"\u00a0\u0003.\u0017\u0000\u00a0\u00a1\u0005\u0006\u0000\u0000\u00a1\u00a2"+
		"\u0007\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u0099"+
		"\u0001\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a4\u000b"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0005\u0000\u0000\u00a6\u00ac"+
		"\u0003.\u0017\u0000\u00a7\u00a8\u0005\u0007\u0000\u0000\u00a8\u00ac\u0003"+
		".\u0017\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u00ac\u0003.\u0017"+
		"\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\r\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0003.\u0017\u0000\u00ae\u00af\u0005\u0006\u0000\u0000\u00af"+
		"\u00b0\u00032\u0019\u0000\u00b0\u00c0\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0003.\u0017\u0000\u00b2\u00b3\u0005\u0006\u0000\u0000\u00b3\u00b4\u0007"+
		"\u0000\u0000\u0000\u00b4\u00c0\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003"+
		".\u0017\u0000\u00b6\u00b7\u0005\u0006\u0000\u0000\u00b7\u00b8\u0005\b"+
		"\u0000\u0000\u00b8\u00b9\u0003(\u0014\u0000\u00b9\u00ba\u0005\b\u0000"+
		"\u0000\u00ba\u00c0\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003.\u0017\u0000"+
		"\u00bc\u00bd\u0005\u0006\u0000\u0000\u00bd\u00be\u0003\"\u0011\u0000\u00be"+
		"\u00c0\u0001\u0000\u0000\u0000\u00bf\u00ad\u0001\u0000\u0000\u0000\u00bf"+
		"\u00b1\u0001\u0000\u0000\u0000\u00bf\u00b5\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bb\u0001\u0000\u0000\u0000\u00c0\u000f\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0003.\u0017\u0000\u00c2\u00c3\u0005\f\u0000\u0000\u00c3\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003.\u0017\u0000\u00c5\u00c6\u0005"+
		"\r\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8\u0011\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u000e\u0000\u0000\u00ca\u00ce\u0003(\u0014"+
		"\u0000\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc\u00ce\u0003\"\u0011\u0000"+
		"\u00cd\u00c9\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ce\u0013\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u000f\u0000\u0000"+
		"\u00d0\u00d1\u0003\u0016\u000b\u0000\u00d1\u00d2\u0005\u0010\u0000\u0000"+
		"\u00d2\u00d3\u0003\u0002\u0001\u0000\u00d3\u00d4\u0005\u0011\u0000\u0000"+
		"\u00d4\u00e0\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u000f\u0000\u0000"+
		"\u00d6\u00d7\u0003\u0016\u000b\u0000\u00d7\u00d8\u0005\u0010\u0000\u0000"+
		"\u00d8\u00d9\u0003\u0002\u0001\u0000\u00d9\u00da\u0005\u0011\u0000\u0000"+
		"\u00da\u00db\u0005\u0012\u0000\u0000\u00db\u00dc\u0005\u0010\u0000\u0000"+
		"\u00dc\u00dd\u0003\u0002\u0001\u0000\u00dd\u00de\u0005\u0011\u0000\u0000"+
		"\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00cf\u0001\u0000\u0000\u0000"+
		"\u00df\u00d5\u0001\u0000\u0000\u0000\u00e0\u0015\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0003\"\u0011\u0000\u00e2\u00e3\u0007\u0001\u0000\u0000\u00e3"+
		"\u00e4\u0003\"\u0011\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e7"+
		"\u0007\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u0017\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0019\u0000\u0000\u00e9\u00ea\u0005\u001a\u0000\u0000\u00ea\u00eb"+
		"\u0003\u0016\u000b\u0000\u00eb\u00ec\u0005\u001b\u0000\u0000\u00ec\u00ed"+
		"\u0005\u0010\u0000\u0000\u00ed\u00ee\u0003\u0002\u0001\u0000\u00ee\u00ef"+
		"\u0005\u0011\u0000\u0000\u00ef\u0019\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0005\u001c\u0000\u0000\u00f1\u00f2\u0005\u001a\u0000\u0000\u00f2\u00f3"+
		"\u0003\u0006\u0003\u0000\u00f3\u00f4\u0005\u001d\u0000\u0000\u00f4\u00f5"+
		"\u0003\u0016\u000b\u0000\u00f5\u00f6\u0005\u001d\u0000\u0000\u00f6\u00f7"+
		"\u0003\u001c\u000e\u0000\u00f7\u00f8\u0005\u001b\u0000\u0000\u00f8\u00f9"+
		"\u0005\u0010\u0000\u0000\u00f9\u00fa\u0003\u0002\u0001\u0000\u00fa\u00fb"+
		"\u0005\u0011\u0000\u0000\u00fb\u001b\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0003\u0010\b\u0000\u00fd\u001d\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		"\u001e\u0000\u0000\u00ff\u0100\u0003.\u0017\u0000\u0100\u0101\u0005\u001f"+
		"\u0000\u0000\u0101\u0102\u0005 \u0000\u0000\u0102\u0103\u0005\u001a\u0000"+
		"\u0000\u0103\u0104\u00032\u0019\u0000\u0104\u0105\u0005\u001d\u0000\u0000"+
		"\u0105\u0106\u00032\u0019\u0000\u0106\u0107\u0005\u001b\u0000\u0000\u0107"+
		"\u0108\u0005\u0010\u0000\u0000\u0108\u0109\u0003\u0002\u0001\u0000\u0109"+
		"\u010a\u0005\u0011\u0000\u0000\u010a\u011b\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005\u001e\u0000\u0000\u010c\u010d\u0003.\u0017\u0000\u010d\u010e"+
		"\u0005\u001f\u0000\u0000\u010e\u010f\u0005 \u0000\u0000\u010f\u0110\u0005"+
		"\u001a\u0000\u0000\u0110\u0111\u00032\u0019\u0000\u0111\u0112\u0005\u001d"+
		"\u0000\u0000\u0112\u0113\u00032\u0019\u0000\u0113\u0114\u0005\u001d\u0000"+
		"\u0000\u0114\u0115\u00032\u0019\u0000\u0115\u0116\u0005\u001b\u0000\u0000"+
		"\u0116\u0117\u0005\u0010\u0000\u0000\u0117\u0118\u0003\u0002\u0001\u0000"+
		"\u0118\u0119\u0005\u0011\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000"+
		"\u011a\u00fe\u0001\u0000\u0000\u0000\u011a\u010b\u0001\u0000\u0000\u0000"+
		"\u011b\u001f\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0005\u0000\u0000"+
		"\u011d\u011e\u0003.\u0017\u0000\u011e\u011f\u0005\u0006\u0000\u0000\u011f"+
		"\u0120\u0003\u0016\u000b\u0000\u0120\u0121\u0005!\u0000\u0000\u0121\u0122"+
		"\u0003\"\u0011\u0000\u0122\u0123\u0005\u001d\u0000\u0000\u0123\u0124\u0003"+
		"\"\u0011\u0000\u0124\u013c\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0007"+
		"\u0000\u0000\u0126\u0127\u0003.\u0017\u0000\u0127\u0128\u0005\u0006\u0000"+
		"\u0000\u0128\u0129\u0003\u0016\u000b\u0000\u0129\u012a\u0005!\u0000\u0000"+
		"\u012a\u012b\u0005\b\u0000\u0000\u012b\u012c\u0003(\u0014\u0000\u012c"+
		"\u012d\u0005\b\u0000\u0000\u012d\u012e\u0005\u001d\u0000\u0000\u012e\u012f"+
		"\u0005\b\u0000\u0000\u012f\u0130\u0003(\u0014\u0000\u0130\u0131\u0005"+
		"\b\u0000\u0000\u0131\u013c\u0001\u0000\u0000\u0000\u0132\u0133\u0005\t"+
		"\u0000\u0000\u0133\u0134\u0003.\u0017\u0000\u0134\u0135\u0005\u0006\u0000"+
		"\u0000\u0135\u0136\u0003\u0016\u000b\u0000\u0136\u0137\u0005!\u0000\u0000"+
		"\u0137\u0138\u0007\u0000\u0000\u0000\u0138\u0139\u0005\u001d\u0000\u0000"+
		"\u0139\u013a\u0007\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000"+
		"\u013b\u011c\u0001\u0000\u0000\u0000\u013b\u0125\u0001\u0000\u0000\u0000"+
		"\u013b\u0132\u0001\u0000\u0000\u0000\u013c!\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0003$\u0012\u0000\u013e\u013f\u0005\"\u0000\u0000\u013f\u0140"+
		"\u0003\"\u0011\u0000\u0140\u0147\u0001\u0000\u0000\u0000\u0141\u0142\u0003"+
		"$\u0012\u0000\u0142\u0143\u0005#\u0000\u0000\u0143\u0144\u0003\"\u0011"+
		"\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0147\u0003$\u0012\u0000"+
		"\u0146\u013d\u0001\u0000\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000"+
		"\u0146\u0145\u0001\u0000\u0000\u0000\u0147#\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0003&\u0013\u0000\u0149\u014a\u0005$\u0000\u0000\u014a\u014b\u0003"+
		"$\u0012\u0000\u014b\u0152\u0001\u0000\u0000\u0000\u014c\u014d\u0003&\u0013"+
		"\u0000\u014d\u014e\u0005%\u0000\u0000\u014e\u014f\u0003$\u0012\u0000\u014f"+
		"\u0152\u0001\u0000\u0000\u0000\u0150\u0152\u0003&\u0013\u0000\u0151\u0148"+
		"\u0001\u0000\u0000\u0000\u0151\u014c\u0001\u0000\u0000\u0000\u0151\u0150"+
		"\u0001\u0000\u0000\u0000\u0152%\u0001\u0000\u0000\u0000\u0153\u0156\u0003"+
		".\u0017\u0000\u0154\u0156\u00032\u0019\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\'\u0001\u0000\u0000\u0000"+
		"\u0157\u0159\u0003*\u0015\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159"+
		"\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b)\u0001\u0000\u0000\u0000\u015c\u015a"+
		"\u0001\u0000\u0000\u0000\u015d\u0161\u00032\u0019\u0000\u015e\u0161\u0003"+
		",\u0016\u0000\u015f\u0161\u00030\u0018\u0000\u0160\u015d\u0001\u0000\u0000"+
		"\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000"+
		"\u0000\u0161+\u0001\u0000\u0000\u0000\u0162\u0163\u0005&\u0000\u0000\u0163"+
		"-\u0001\u0000\u0000\u0000\u0164\u0165\u0005\'\u0000\u0000\u0165/\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0005(\u0000\u0000\u01671\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0005)\u0000\u0000\u01693\u0001\u0000\u0000\u0000\u0012"+
		"sx\u0089\u0097\u00a3\u00ab\u00bf\u00c7\u00cd\u00df\u00e6\u011a\u013b\u0146"+
		"\u0151\u0155\u015a\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}