// Generated from C:/Users/patri/IdeaProjects/practicaGrupo23/src\gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, IDENTIFIER=42, NUMERIC_INTEGER_CONST=43, 
		NUMERIC_REAL_CONST=44, STRING_CONST=45, COMENTARIOS=46, WS=47;
	public static final int
		RULE_r = 0, RULE_prg = 1, RULE_blq = 2, RULE_dcllist = 3, RULE_sentlist = 4, 
		RULE_sentlist1 = 5, RULE_dcl = 6, RULE_defcte = 7, RULE_ctelist = 8, RULE_ctelist1 = 9, 
		RULE_simpvalue = 10, RULE_defvar = 11, RULE_defvarlist = 12, RULE_defvarlist1 = 13, 
		RULE_varlist = 14, RULE_varlist1 = 15, RULE_defproc = 16, RULE_deffun = 17, 
		RULE_formal_paramlist = 18, RULE_formal_param = 19, RULE_formal_param1 = 20, 
		RULE_tbas = 21, RULE_sent = 22, RULE_a = 23, RULE_exp = 24, RULE_exp1 = 25, 
		RULE_op = 26, RULE_factor = 27, RULE_subpparamlist = 28, RULE_explist = 29, 
		RULE_explist1 = 30, RULE_inc = 31, RULE_expcond = 32, RULE_expcond1 = 33, 
		RULE_oplog = 34, RULE_factorcond = 35, RULE_opcomp = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "prg", "blq", "dcllist", "sentlist", "sentlist1", "dcl", "defcte", 
			"ctelist", "ctelist1", "simpvalue", "defvar", "defvarlist", "defvarlist1", 
			"varlist", "varlist1", "defproc", "deffun", "formal_paramlist", "formal_param", 
			"formal_param1", "tbas", "sent", "a", "exp", "exp1", "op", "factor", 
			"subpparamlist", "explist", "explist1", "inc", "expcond", "expcond1", 
			"oplog", "factorcond", "opcomp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'.'", "'BEGIN'", "'END'", "'CONST'", "'='", 
			"'VAR'", "':'", "','", "'PROCEDURE'", "'FUNCTION'", "'('", "')'", "'integer'", 
			"'real'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "'REPEAT'", 
			"'UNTIL'", "'FOR'", "':='", "'+'", "'-'", "'*'", "'DIV'", "'MOD'", "'TO'", 
			"'DOWNTO'", "'OR'", "'AND'", "'NOT'", "'TRUE'", "'FALSE'", "'<'", "'>'", 
			"'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENTIFIER", "NUMERIC_INTEGER_CONST", 
			"NUMERIC_REAL_CONST", "STRING_CONST", "COMENTARIOS", "WS"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramaticaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramaticaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERIC_INTEGER_CONST() { return getTokens(gramaticaParser.NUMERIC_INTEGER_CONST); }
		public TerminalNode NUMERIC_INTEGER_CONST(int i) {
			return getToken(gramaticaParser.NUMERIC_INTEGER_CONST, i);
		}
		public List<TerminalNode> NUMERIC_REAL_CONST() { return getTokens(gramaticaParser.NUMERIC_REAL_CONST); }
		public TerminalNode NUMERIC_REAL_CONST(int i) {
			return getToken(gramaticaParser.NUMERIC_REAL_CONST, i);
		}
		public List<TerminalNode> STRING_CONST() { return getTokens(gramaticaParser.STRING_CONST); }
		public TerminalNode STRING_CONST(int i) {
			return getToken(gramaticaParser.STRING_CONST, i);
		}
		public List<TerminalNode> COMENTARIOS() { return getTokens(gramaticaParser.COMENTARIOS); }
		public TerminalNode COMENTARIOS(int i) {
			return getToken(gramaticaParser.COMENTARIOS, i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMERIC_INTEGER_CONST) | (1L << NUMERIC_REAL_CONST) | (1L << STRING_CONST) | (1L << COMENTARIOS))) != 0)) {
				{
				{
				setState(74);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMERIC_INTEGER_CONST) | (1L << NUMERIC_REAL_CONST) | (1L << STRING_CONST) | (1L << COMENTARIOS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(79);
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

	public static class PrgContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(81);
			match(IDENTIFIER);
			setState(82);
			match(T__1);
			setState(83);
			blq();
			setState(84);
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

	public static class BlqContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			dcllist();
			setState(87);
			match(T__3);
			setState(88);
			sentlist();
			setState(89);
			match(T__4);
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

	public static class DcllistContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcllist);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				dcl();
				setState(92);
				dcllist();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist1Context sentlist1() {
			return getRuleContext(Sentlist1Context.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			sent();
			setState(98);
			sentlist1();
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

	public static class Sentlist1Context extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist1Context sentlist1() {
			return getRuleContext(Sentlist1Context.class,0);
		}
		public Sentlist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist1Context sentlist1() throws RecognitionException {
		Sentlist1Context _localctx = new Sentlist1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentlist1);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__19:
			case T__21:
			case T__23:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				sent();
				setState(101);
				sentlist1();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DclContext extends ParserRuleContext {
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefprocContext defproc() {
			return getRuleContext(DefprocContext.class,0);
		}
		public DeffunContext deffun() {
			return getRuleContext(DeffunContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dcl);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				defcte();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				defvar();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				defproc();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				deffun();
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

	public static class DefcteContext extends ParserRuleContext {
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__5);
			setState(113);
			ctelist();
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

	public static class CtelistContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist1Context ctelist1() {
			return getRuleContext(Ctelist1Context.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENTIFIER);
			setState(116);
			match(T__6);
			setState(117);
			simpvalue();
			setState(118);
			match(T__1);
			setState(119);
			ctelist1();
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

	public static class Ctelist1Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist1Context ctelist1() {
			return getRuleContext(Ctelist1Context.class,0);
		}
		public Ctelist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtelist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtelist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtelist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctelist1Context ctelist1() throws RecognitionException {
		Ctelist1Context _localctx = new Ctelist1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_ctelist1);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(T__6);
				setState(123);
				simpvalue();
				setState(124);
				match(T__1);
				setState(125);
				ctelist1();
				}
				break;
			case T__3:
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SimpvalueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_INTEGER_CONST() { return getToken(gramaticaParser.NUMERIC_INTEGER_CONST, 0); }
		public TerminalNode NUMERIC_REAL_CONST() { return getToken(gramaticaParser.NUMERIC_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(gramaticaParser.STRING_CONST, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERIC_INTEGER_CONST) | (1L << NUMERIC_REAL_CONST) | (1L << STRING_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DefvarContext extends ParserRuleContext {
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__7);
			setState(133);
			defvarlist();
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

	public static class DefvarlistContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Defvarlist1Context defvarlist1() {
			return getRuleContext(Defvarlist1Context.class,0);
		}
		public DefvarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefvarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefvarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefvarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistContext defvarlist() throws RecognitionException {
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defvarlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			varlist();
			setState(136);
			match(T__8);
			setState(137);
			tbas();
			setState(138);
			match(T__1);
			setState(139);
			defvarlist1();
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

	public static class Defvarlist1Context extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Defvarlist1Context defvarlist1() {
			return getRuleContext(Defvarlist1Context.class,0);
		}
		public Defvarlist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefvarlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefvarlist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefvarlist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defvarlist1Context defvarlist1() throws RecognitionException {
		Defvarlist1Context _localctx = new Defvarlist1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_defvarlist1);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				varlist();
				setState(142);
				match(T__8);
				setState(143);
				tbas();
				setState(144);
				defvarlist1();
				}
				break;
			case T__3:
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VarlistContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public Varlist1Context varlist1() {
			return getRuleContext(Varlist1Context.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDENTIFIER);
			setState(150);
			varlist1();
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

	public static class Varlist1Context extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Varlist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarlist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarlist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varlist1Context varlist1() throws RecognitionException {
		Varlist1Context _localctx = new Varlist1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_varlist1);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__9);
				setState(153);
				varlist();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DefprocContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DefprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefprocContext defproc() throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__10);
			setState(158);
			match(IDENTIFIER);
			setState(159);
			formal_paramlist();
			setState(160);
			match(T__1);
			setState(161);
			blq();
			setState(162);
			match(T__1);
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

	public static class DeffunContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DeffunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeffun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeffun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeffun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffunContext deffun() throws RecognitionException {
		DeffunContext _localctx = new DeffunContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_deffun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__11);
			setState(165);
			match(IDENTIFIER);
			setState(166);
			formal_paramlist();
			setState(167);
			match(T__8);
			setState(168);
			tbas();
			setState(169);
			match(T__1);
			setState(170);
			blq();
			setState(171);
			match(T__1);
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

	public static class Formal_paramlistContext extends ParserRuleContext {
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal_paramlist);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__12);
				setState(174);
				formal_param();
				setState(175);
				match(T__13);
				}
				break;
			case T__1:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Formal_paramContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Formal_param1Context formal_param1() {
			return getRuleContext(Formal_param1Context.class,0);
		}
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFormal_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formal_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			varlist();
			setState(181);
			match(T__8);
			setState(182);
			tbas();
			setState(183);
			formal_param1();
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

	public static class Formal_param1Context extends ParserRuleContext {
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_param1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal_param1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal_param1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFormal_param1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_param1Context formal_param1() throws RecognitionException {
		Formal_param1Context _localctx = new Formal_param1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_formal_param1);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__1);
				setState(186);
				formal_param();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TbasContext extends ParserRuleContext {
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tbas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sent);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(IDENTIFIER);
				setState(193);
				a();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__16);
				setState(195);
				expcond();
				setState(196);
				match(T__17);
				setState(197);
				blq();
				setState(198);
				match(T__18);
				setState(199);
				blq();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(T__19);
				setState(202);
				expcond();
				setState(203);
				match(T__20);
				setState(204);
				blq();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(T__21);
				setState(207);
				blq();
				setState(208);
				match(T__22);
				setState(209);
				expcond();
				setState(210);
				match(T__1);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(T__23);
				setState(213);
				match(IDENTIFIER);
				setState(214);
				match(T__24);
				setState(215);
				exp();
				setState(216);
				inc();
				setState(217);
				exp();
				setState(218);
				match(T__20);
				setState(219);
				blq();
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

	public static class AContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_a);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__24);
				setState(224);
				exp();
				setState(225);
				match(T__1);
				}
				break;
			case T__1:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				subpparamlist();
				setState(228);
				match(T__1);
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

	public static class ExpContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			factor();
			setState(233);
			exp1();
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

	public static class Exp1Context extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_exp1);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				op();
				setState(236);
				exp();
				}
				break;
			case T__1:
			case T__6:
			case T__9:
			case T__13:
			case T__17:
			case T__20:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FactorContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				simpvalue();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__12);
				setState(245);
				exp();
				setState(246);
				match(T__13);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(IDENTIFIER);
				setState(249);
				subpparamlist();
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

	public static class SubpparamlistContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubpparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subpparamlist);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(T__12);
				setState(253);
				explist();
				setState(254);
				match(T__13);
				}
				break;
			case T__1:
			case T__6:
			case T__9:
			case T__13:
			case T__17:
			case T__20:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExplistContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Explist1Context explist1() {
			return getRuleContext(Explist1Context.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			exp();
			setState(260);
			explist1();
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

	public static class Explist1Context extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Explist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExplist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExplist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExplist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explist1Context explist1() throws RecognitionException {
		Explist1Context _localctx = new Explist1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_explist1);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__9);
				setState(263);
				explist();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IncContext extends ParserRuleContext {
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpcondContext extends ParserRuleContext {
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond1Context expcond1() {
			return getRuleContext(Expcond1Context.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			factorcond();
			setState(270);
			expcond1();
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

	public static class Expcond1Context extends ParserRuleContext {
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public Expcond1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpcond1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpcond1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpcond1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expcond1Context expcond1() throws RecognitionException {
		Expcond1Context _localctx = new Expcond1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_expcond1);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				oplog();
				setState(273);
				expcond();
				}
				break;
			case T__1:
			case T__13:
			case T__17:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OplogContext extends ParserRuleContext {
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__33) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FactorcondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_factorcond);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				exp();
				setState(281);
				opcomp();
				setState(282);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__12);
				setState(285);
				expcond();
				setState(286);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(T__34);
				setState(289);
				factorcond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(T__35);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				match(T__36);
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

	public static class OpcompContext extends ParserRuleContext {
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_opcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u012b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5b\n\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0083\n"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0096\n\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u009e"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00b5\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\5\26\u00bf\n\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e0\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e9\n\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\5\33\u00f2\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u00fd\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0104\n\36\3\37\3"+
		"\37\3\37\3 \3 \3 \5 \u010c\n \3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0117\n"+
		"#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0127\n%\3&\3&\3&\2\2\'"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"J\2\t\3\2,\60\3\2-/\3\2\21\22\3\2\34 \3\2!\"\3\2#$\4\2\t\t(+\2\u011f\2"+
		"O\3\2\2\2\4R\3\2\2\2\6X\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fj\3\2\2\2\16p\3"+
		"\2\2\2\20r\3\2\2\2\22u\3\2\2\2\24\u0082\3\2\2\2\26\u0084\3\2\2\2\30\u0086"+
		"\3\2\2\2\32\u0089\3\2\2\2\34\u0095\3\2\2\2\36\u0097\3\2\2\2 \u009d\3\2"+
		"\2\2\"\u009f\3\2\2\2$\u00a6\3\2\2\2&\u00b4\3\2\2\2(\u00b6\3\2\2\2*\u00be"+
		"\3\2\2\2,\u00c0\3\2\2\2.\u00df\3\2\2\2\60\u00e8\3\2\2\2\62\u00ea\3\2\2"+
		"\2\64\u00f1\3\2\2\2\66\u00f3\3\2\2\28\u00fc\3\2\2\2:\u0103\3\2\2\2<\u0105"+
		"\3\2\2\2>\u010b\3\2\2\2@\u010d\3\2\2\2B\u010f\3\2\2\2D\u0116\3\2\2\2F"+
		"\u0118\3\2\2\2H\u0126\3\2\2\2J\u0128\3\2\2\2LN\t\2\2\2ML\3\2\2\2NQ\3\2"+
		"\2\2OM\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QO\3\2\2\2RS\7\3\2\2ST\7,\2\2TU\7\4"+
		"\2\2UV\5\6\4\2VW\7\5\2\2W\5\3\2\2\2XY\5\b\5\2YZ\7\6\2\2Z[\5\n\6\2[\\\7"+
		"\7\2\2\\\7\3\2\2\2]^\5\16\b\2^_\5\b\5\2_b\3\2\2\2`b\3\2\2\2a]\3\2\2\2"+
		"a`\3\2\2\2b\t\3\2\2\2cd\5.\30\2de\5\f\7\2e\13\3\2\2\2fg\5.\30\2gh\5\f"+
		"\7\2hk\3\2\2\2ik\3\2\2\2jf\3\2\2\2ji\3\2\2\2k\r\3\2\2\2lq\5\20\t\2mq\5"+
		"\30\r\2nq\5\"\22\2oq\5$\23\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q"+
		"\17\3\2\2\2rs\7\b\2\2st\5\22\n\2t\21\3\2\2\2uv\7,\2\2vw\7\t\2\2wx\5\26"+
		"\f\2xy\7\4\2\2yz\5\24\13\2z\23\3\2\2\2{|\7,\2\2|}\7\t\2\2}~\5\26\f\2~"+
		"\177\7\4\2\2\177\u0080\5\24\13\2\u0080\u0083\3\2\2\2\u0081\u0083\3\2\2"+
		"\2\u0082{\3\2\2\2\u0082\u0081\3\2\2\2\u0083\25\3\2\2\2\u0084\u0085\t\3"+
		"\2\2\u0085\27\3\2\2\2\u0086\u0087\7\n\2\2\u0087\u0088\5\32\16\2\u0088"+
		"\31\3\2\2\2\u0089\u008a\5\36\20\2\u008a\u008b\7\13\2\2\u008b\u008c\5,"+
		"\27\2\u008c\u008d\7\4\2\2\u008d\u008e\5\34\17\2\u008e\33\3\2\2\2\u008f"+
		"\u0090\5\36\20\2\u0090\u0091\7\13\2\2\u0091\u0092\5,\27\2\u0092\u0093"+
		"\5\34\17\2\u0093\u0096\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2"+
		"\u0095\u0094\3\2\2\2\u0096\35\3\2\2\2\u0097\u0098\7,\2\2\u0098\u0099\5"+
		" \21\2\u0099\37\3\2\2\2\u009a\u009b\7\f\2\2\u009b\u009e\5\36\20\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009c\3\2\2\2\u009e!\3\2\2\2"+
		"\u009f\u00a0\7\r\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\5&\24\2\u00a2\u00a3"+
		"\7\4\2\2\u00a3\u00a4\5\6\4\2\u00a4\u00a5\7\4\2\2\u00a5#\3\2\2\2\u00a6"+
		"\u00a7\7\16\2\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\5&\24\2\u00a9\u00aa\7\13"+
		"\2\2\u00aa\u00ab\5,\27\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\5\6\4\2\u00ad"+
		"\u00ae\7\4\2\2\u00ae%\3\2\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b1\5(\25\2"+
		"\u00b1\u00b2\7\20\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00af"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\'\3\2\2\2\u00b6\u00b7\5\36\20\2\u00b7"+
		"\u00b8\7\13\2\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\5*\26\2\u00ba)\3\2\2\2"+
		"\u00bb\u00bc\7\4\2\2\u00bc\u00bf\5(\25\2\u00bd\u00bf\3\2\2\2\u00be\u00bb"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf+\3\2\2\2\u00c0\u00c1\t\4\2\2\u00c1"+
		"-\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3\u00e0\5\60\31\2\u00c4\u00c5\7\23\2"+
		"\2\u00c5\u00c6\5B\"\2\u00c6\u00c7\7\24\2\2\u00c7\u00c8\5\6\4\2\u00c8\u00c9"+
		"\7\25\2\2\u00c9\u00ca\5\6\4\2\u00ca\u00e0\3\2\2\2\u00cb\u00cc\7\26\2\2"+
		"\u00cc\u00cd\5B\"\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\5\6\4\2\u00cf\u00e0"+
		"\3\2\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\5\6\4\2\u00d2\u00d3\7\31\2\2"+
		"\u00d3\u00d4\5B\"\2\u00d4\u00d5\7\4\2\2\u00d5\u00e0\3\2\2\2\u00d6\u00d7"+
		"\7\32\2\2\u00d7\u00d8\7,\2\2\u00d8\u00d9\7\33\2\2\u00d9\u00da\5\62\32"+
		"\2\u00da\u00db\5@!\2\u00db\u00dc\5\62\32\2\u00dc\u00dd\7\27\2\2\u00dd"+
		"\u00de\5\6\4\2\u00de\u00e0\3\2\2\2\u00df\u00c2\3\2\2\2\u00df\u00c4\3\2"+
		"\2\2\u00df\u00cb\3\2\2\2\u00df\u00d0\3\2\2\2\u00df\u00d6\3\2\2\2\u00e0"+
		"/\3\2\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00e4\7\4\2"+
		"\2\u00e4\u00e9\3\2\2\2\u00e5\u00e6\5:\36\2\u00e6\u00e7\7\4\2\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\61\3\2\2\2\u00ea"+
		"\u00eb\58\35\2\u00eb\u00ec\5\64\33\2\u00ec\63\3\2\2\2\u00ed\u00ee\5\66"+
		"\34\2\u00ee\u00ef\5\62\32\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ed\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\65\3\2\2\2\u00f3\u00f4\t\5\2"+
		"\2\u00f4\67\3\2\2\2\u00f5\u00fd\5\26\f\2\u00f6\u00f7\7\17\2\2\u00f7\u00f8"+
		"\5\62\32\2\u00f8\u00f9\7\20\2\2\u00f9\u00fd\3\2\2\2\u00fa\u00fb\7,\2\2"+
		"\u00fb\u00fd\5:\36\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd9\3\2\2\2\u00fe\u00ff\7\17\2\2\u00ff\u0100\5<\37\2\u0100"+
		"\u0101\7\20\2\2\u0101\u0104\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00fe\3"+
		"\2\2\2\u0103\u0102\3\2\2\2\u0104;\3\2\2\2\u0105\u0106\5\62\32\2\u0106"+
		"\u0107\5> \2\u0107=\3\2\2\2\u0108\u0109\7\f\2\2\u0109\u010c\5<\37\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u010a\3\2\2\2\u010c?\3\2\2\2"+
		"\u010d\u010e\t\6\2\2\u010eA\3\2\2\2\u010f\u0110\5H%\2\u0110\u0111\5D#"+
		"\2\u0111C\3\2\2\2\u0112\u0113\5F$\2\u0113\u0114\5B\"\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0117\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"E\3\2\2\2\u0118\u0119\t\7\2\2\u0119G\3\2\2\2\u011a\u011b\5\62\32\2\u011b"+
		"\u011c\5J&\2\u011c\u011d\5\62\32\2\u011d\u0127\3\2\2\2\u011e\u011f\7\17"+
		"\2\2\u011f\u0120\5B\"\2\u0120\u0121\7\20\2\2\u0121\u0127\3\2\2\2\u0122"+
		"\u0123\7%\2\2\u0123\u0127\5H%\2\u0124\u0127\7&\2\2\u0125\u0127\7\'\2\2"+
		"\u0126\u011a\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0125\3\2\2\2\u0127I\3\2\2\2\u0128\u0129\t\b\2\2\u0129"+
		"K\3\2\2\2\23Oajp\u0082\u0095\u009d\u00b4\u00be\u00df\u00e8\u00f1\u00fc"+
		"\u0103\u010b\u0116\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}