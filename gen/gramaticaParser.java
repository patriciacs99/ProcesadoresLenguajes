// Generated from C:/Users/patri/IdeaProjects/practicaGrupo23\gramatica.g4 by ANTLR 4.9.2

     import java.io.*;
     import traduccion.*;

    import java.util.ArrayList;
    import java.util.List;

    import java.io.PrintWriter;
    import java.io.FileWriter;

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
		public Token IDENTIFIER;
		public BlqContext blq;
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
			((PrgContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(82);
			match(T__1);
			setState(83);
			((PrgContext)_localctx).blq = blq();
			setState(84);
			match(T__2);
			System.out.println("PROGRAM "+ (((PrgContext)_localctx).IDENTIFIER!=null?((PrgContext)_localctx).IDENTIFIER.getText():null) + " ;\n"+ ((PrgContext)_localctx).blq.expr +"\n.");
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
		public String expr;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
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
			setState(87);
			((BlqContext)_localctx).dcllist = dcllist();
			setState(88);
			match(T__3);
			setState(89);
			((BlqContext)_localctx).sentlist = sentlist();
			setState(90);
			match(T__4);
			((BlqContext)_localctx).expr =  ((BlqContext)_localctx).dcllist.expr + "\nBEGIN\n"+ ((BlqContext)_localctx).sentlist.expr +"\nEND\n";
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
		public String expr;
		public DclContext dcl;
		public DcllistContext dcllist;
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
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				((DcllistContext)_localctx).dcl = dcl();
				setState(94);
				((DcllistContext)_localctx).dcllist = dcllist();
				((DcllistContext)_localctx).expr =  ((DcllistContext)_localctx).dcl.expr +"\n"+ ((DcllistContext)_localctx).dcllist.expr;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				((DcllistContext)_localctx).expr =  "";
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
		public String expr;
		public SentContext sent;
		public Sentlist1Context sentlist1;
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
			setState(100);
			((SentlistContext)_localctx).sent = sent();
			setState(101);
			((SentlistContext)_localctx).sentlist1 = sentlist1();
			((SentlistContext)_localctx).expr =  ((SentlistContext)_localctx).sent.expr + "\n" +((SentlistContext)_localctx).sentlist1.expr;
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
		public String expr;
		public SentContext sent;
		public Sentlist1Context sentlist1;
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__19:
			case T__21:
			case T__23:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((Sentlist1Context)_localctx).sent = sent();
				setState(105);
				((Sentlist1Context)_localctx).sentlist1 = sentlist1();
				((Sentlist1Context)_localctx).expr =  ((Sentlist1Context)_localctx).sent.expr + "\n" + ((Sentlist1Context)_localctx).sentlist1.expr;
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				((Sentlist1Context)_localctx).expr =  "";
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
		public String expr;
		public DefcteContext defcte;
		public DefvarContext defvar;
		public DefprocContext defproc;
		public DeffunContext deffun;
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				((DclContext)_localctx).defcte = defcte();
				((DclContext)_localctx).expr =  ((DclContext)_localctx).defcte.expr;
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				((DclContext)_localctx).defvar = defvar();
				((DclContext)_localctx).expr =  ((DclContext)_localctx).defvar.expr;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				((DclContext)_localctx).defproc = defproc();
				((DclContext)_localctx).expr =  ((DclContext)_localctx).defproc.expr;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				((DclContext)_localctx).deffun = deffun();
				((DclContext)_localctx).expr =  ((DclContext)_localctx).deffun.expr;
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
		public String expr;
		public CtelistContext ctelist;
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
			setState(125);
			match(T__5);
			setState(126);
			((DefcteContext)_localctx).ctelist = ctelist();
			((DefcteContext)_localctx).expr =  "CONST" + ((DefcteContext)_localctx).ctelist.expr;
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
		public String expr;
		public Token IDENTIFIER;
		public SimpvalueContext simpvalue;
		public Ctelist1Context ctelist1;
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
			setState(129);
			((CtelistContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(130);
			match(T__6);
			setState(131);
			((CtelistContext)_localctx).simpvalue = simpvalue();
			setState(132);
			match(T__1);
			setState(133);
			((CtelistContext)_localctx).ctelist1 = ctelist1();

			           ArrayList<String> lista = ((CtelistContext)_localctx).ctelist1.lista;
			            String elems = "";
			            for (int i = 0;i<lista.size();i++){
			                elems = elems + lista[i];
			            }
			            ((CtelistContext)_localctx).expr =  (((CtelistContext)_localctx).IDENTIFIER!=null?((CtelistContext)_localctx).IDENTIFIER.getText():null) + " = " + ((CtelistContext)_localctx).simpvalue.expr + " ; "+ elems;

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
		public ArrayList<String> lista;
		public Token IDENTIFIER;
		public SimpvalueContext simpvalue;
		public Ctelist1Context ctelist1;
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((Ctelist1Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(137);
				match(T__6);
				setState(138);
				((Ctelist1Context)_localctx).simpvalue = simpvalue();
				setState(139);
				match(T__1);
				setState(140);
				((Ctelist1Context)_localctx).ctelist1 = ctelist1();
				((Ctelist1Context)_localctx).lista =  ((Ctelist1Context)_localctx).ctelist1.lista.addFirst( (((Ctelist1Context)_localctx).IDENTIFIER!=null?((Ctelist1Context)_localctx).IDENTIFIER.getText():null) + " = " +((Ctelist1Context)_localctx).simpvalue.expr +" ; ");
				}
				break;
			case T__3:
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				((Ctelist1Context)_localctx).lista =  new ArrayList<>();
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
		public String expr;
		public Token NUMERIC_INTEGER_CONST;
		public Token NUMERIC_REAL_CONST;
		public Token STRING_CONST;
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
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).expr =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null) + "</SPAN>";
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).expr =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null) + "</SPAN>";
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).expr =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null) + "</SPAN>";
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

	public static class DefvarContext extends ParserRuleContext {
		public String expr;
		public DefvarlistContext defvarlist;
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
			setState(154);
			match(T__7);
			setState(155);
			((DefvarContext)_localctx).defvarlist = defvarlist();
			((DefvarContext)_localctx).expr =  "VAR " + ((DefvarContext)_localctx).defvarlist.expr;
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
		public String expr;
		public VarlistContext varlist;
		public TbasContext tbas;
		public Defvarlist1Context defvarlist1;
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
			setState(158);
			((DefvarlistContext)_localctx).varlist = varlist();
			setState(159);
			match(T__8);
			setState(160);
			((DefvarlistContext)_localctx).tbas = tbas();
			setState(161);
			match(T__1);
			setState(162);
			((DefvarlistContext)_localctx).defvarlist1 = defvarlist1();

			                                      String parte = ((DefvarlistContext)_localctx).varlist.expr + " : " + ((DefvarlistContext)_localctx).tbas.t + " ; ";
			                                     ArrayList<String> lista = ((DefvarlistContext)_localctx).defvarlist1.lista;
			                                      String elems = "";
			                                      for(int i = 0;i< lista.size();i++){
			                                        elems = elems + lista[i];
			                                      }
			                                      ((DefvarlistContext)_localctx).expr =  parte + elems;

			                                                                   
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
		public ArrayList<String> lista;
		public VarlistContext varlist;
		public TbasContext tbas;
		public Defvarlist1Context defvarlist1;
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((Defvarlist1Context)_localctx).varlist = varlist();
				setState(166);
				match(T__8);
				setState(167);
				((Defvarlist1Context)_localctx).tbas = tbas();
				setState(168);
				((Defvarlist1Context)_localctx).defvarlist1 = defvarlist1();

				                String newElem = ((Defvarlist1Context)_localctx).varlist.expr + " : " + ((Defvarlist1Context)_localctx).tbas.t + " ; ";
				                ((Defvarlist1Context)_localctx).lista =  ((Defvarlist1Context)_localctx).defvarlist1.lista.addFirst(newElem);
				            
				}
				break;
			case T__3:
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				((Defvarlist1Context)_localctx).lista =  new ArrayList<>();
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
		public String expr;
		public Token IDENTIFIER;
		public Varlist1Context varlist1;
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
			setState(174);
			((VarlistContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(175);
			((VarlistContext)_localctx).varlist1 = varlist1(((VarlistContext)_localctx).IDENTIFIER);

			                   ArrayList<String> lista = ((VarlistContext)_localctx).varlist1.lista;
			                    String elems = lista[0];
			                    for(int i = 1;i<lista.size();i++){
			                       elems = elems + "," + lista[i];
			                    }
			                    ((VarlistContext)_localctx).expr =  elems;
			                
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
		public String ident;
		public ArrayList<String> lista;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Varlist1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Varlist1Context(ParserRuleContext parent, int invokingState, String ident) {
			super(parent, invokingState);
			this.ident = ident;
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

	public final Varlist1Context varlist1(String ident) throws RecognitionException {
		Varlist1Context _localctx = new Varlist1Context(_ctx, getState(), ident);
		enterRule(_localctx, 30, RULE_varlist1);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(T__9);
				setState(179);
				varlist();

				                    ((Varlist1Context)_localctx).lista =  _localctx.lista.addFirst(_localctx.ident.text);
				                    
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				 ArrayList<String> lista = new ArrayList<>();
				                ((Varlist1Context)_localctx).lista =  lista.addFirst(_localctx.ident.text);
				             
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
		public String expr;
		public Token IDENTIFIER;
		public Formal_paramlistContext formal_paramlist;
		public BlqContext blq;
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
			setState(185);
			match(T__10);
			setState(186);
			((DefprocContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(187);
			((DefprocContext)_localctx).formal_paramlist = formal_paramlist();
			setState(188);
			match(T__1);
			setState(189);
			((DefprocContext)_localctx).blq = blq();
			setState(190);
			match(T__1);

			               ((DefprocContext)_localctx).expr =  "PROCEDURE " + (((DefprocContext)_localctx).IDENTIFIER!=null?((DefprocContext)_localctx).IDENTIFIER.getText():null) + ((DefprocContext)_localctx).formal_paramlist.expr + " ; "+ ((DefprocContext)_localctx).blq.expr +" ; ";

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
		public String expr;
		public Token IDENTIFIER;
		public Formal_paramlistContext formal_paramlist;
		public TbasContext tbas;
		public BlqContext blq;
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
			setState(193);
			match(T__11);
			setState(194);
			((DeffunContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(195);
			((DeffunContext)_localctx).formal_paramlist = formal_paramlist();
			setState(196);
			match(T__8);
			setState(197);
			((DeffunContext)_localctx).tbas = tbas();
			setState(198);
			match(T__1);
			setState(199);
			((DeffunContext)_localctx).blq = blq();
			setState(200);
			match(T__1);

			              ((DeffunContext)_localctx).expr =  "FUNCTION " + (((DeffunContext)_localctx).IDENTIFIER!=null?((DeffunContext)_localctx).IDENTIFIER.getText():null) + ((DeffunContext)_localctx).formal_paramlist.expr + " : "+ ((DeffunContext)_localctx).tbas.t+ " ; " + ((DeffunContext)_localctx).blq.expr +" ; ";


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
		public String expr;
		public Formal_paramContext formal_param;
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
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__12);
				setState(204);
				((Formal_paramlistContext)_localctx).formal_param = formal_param();
				setState(205);
				match(T__13);

				               ArrayList<String> lista = ((Formal_paramlistContext)_localctx).formal_param.lista;
				                String elems = "";
				                for(int i = 0;i< lista.size()-1;i++){
				                    elems = elems + lista[i] + "; ";
				                }
				                elems = elems + lista[lista.size()-1];

				                ((Formal_paramlistContext)_localctx).expr =  "( "+ elems +" )";
				              
				}
				break;
			case T__1:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				((Formal_paramlistContext)_localctx).expr =  "";
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
		public ArrayList<String> lista;
		public VarlistContext varlist;
		public TbasContext tbas;
		public Formal_param1Context formal_param1;
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
			setState(211);
			((Formal_paramContext)_localctx).varlist = varlist();
			setState(212);
			match(T__8);
			setState(213);
			((Formal_paramContext)_localctx).tbas = tbas();
			setState(214);
			((Formal_paramContext)_localctx).formal_param1 = formal_param1(((Formal_paramContext)_localctx).varlist.expr,((Formal_paramContext)_localctx).tbas.t);
			((Formal_paramContext)_localctx).lista =  ((Formal_paramContext)_localctx).formal_param1.lista;
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
		public String varlisth;
		public String tbash;
		public ArrayList<String> lista;
		public Formal_paramContext formal_param;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_param1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Formal_param1Context(ParserRuleContext parent, int invokingState, String varlisth, String tbash) {
			super(parent, invokingState);
			this.varlisth = varlisth;
			this.tbash = tbash;
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

	public final Formal_param1Context formal_param1(String varlisth,String tbash) throws RecognitionException {
		Formal_param1Context _localctx = new Formal_param1Context(_ctx, getState(), varlisth, tbash);
		enterRule(_localctx, 40, RULE_formal_param1);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__1);
				setState(218);
				((Formal_param1Context)_localctx).formal_param = formal_param();

				                    ((Formal_param1Context)_localctx).formal_param.lista.add(_localctx.varlisth + " : "+ _localctx.tbash);
				                    ((Formal_param1Context)_localctx).lista =  ((Formal_param1Context)_localctx).formal_param.lista;
				                    
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				((Formal_param1Context)_localctx).lista =  new ArrayList<>() ;
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
		public String t;
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
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(T__14);
				((TbasContext)_localctx).t =  "integer";
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(T__15);
				((TbasContext)_localctx).t =  "real";
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

	public static class SentContext extends ParserRuleContext {
		public String expr;
		public Token IDENTIFIER;
		public AContext a;
		public ExpcondContext expcond;
		public BlqContext blq;
		public ExpContext expe1;
		public IncContext inc;
		public ExpContext expe2;
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
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((SentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(231);
				((SentContext)_localctx).a = a(((SentContext)_localctx).IDENTIFIER);
				((SentContext)_localctx).expr =  ((SentContext)_localctx).a.expr;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(T__16);
				setState(235);
				((SentContext)_localctx).expcond = expcond();
				setState(236);
				match(T__17);
				setState(237);
				((SentContext)_localctx).blq = blq();
				setState(238);
				match(T__18);
				setState(239);
				((SentContext)_localctx).blq = blq();
				((SentContext)_localctx).expr =  "IF "+ ((SentContext)_localctx).expcond.expr + " THEN " + ((SentContext)_localctx).blq.expr + " ELSE " + ((SentContext)_localctx).blq.expr; 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__19);
				setState(243);
				((SentContext)_localctx).expcond = expcond();
				setState(244);
				match(T__20);
				setState(245);
				((SentContext)_localctx).blq = blq();
				((SentContext)_localctx).expr =  "WHILE "+ ((SentContext)_localctx).expcond.expr + " DO " + ((SentContext)_localctx).blq.expr ;
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(T__21);
				setState(249);
				((SentContext)_localctx).blq = blq();
				setState(250);
				match(T__22);
				setState(251);
				((SentContext)_localctx).expcond = expcond();
				setState(252);
				match(T__1);
				 ((SentContext)_localctx).expr =  "REPEAT "+ ((SentContext)_localctx).blq.expr + " UNTIL " + ((SentContext)_localctx).expcond.expr + " ; ";
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(T__23);
				setState(256);
				((SentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(257);
				match(T__24);
				setState(258);
				((SentContext)_localctx).expe1 = exp();
				setState(259);
				((SentContext)_localctx).inc = inc();
				setState(260);
				((SentContext)_localctx).expe2 = exp();
				setState(261);
				match(T__20);
				setState(262);
				((SentContext)_localctx).blq = blq();
				((SentContext)_localctx).expr =  "FOR "+ (((SentContext)_localctx).IDENTIFIER!=null?((SentContext)_localctx).IDENTIFIER.getText():null) + " := " + ((SentContext)_localctx).expe1.expr + " " + ((SentContext)_localctx).inc.incr + " " + ((SentContext)_localctx).expe2.expr + " DO " + ((SentContext)_localctx).blq.expr;
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
		public String ident;
		public String expr;
		public ExpContext exp;
		public SubpparamlistContext subpparamlist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AContext(ParserRuleContext parent, int invokingState, String ident) {
			super(parent, invokingState);
			this.ident = ident;
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

	public final AContext a(String ident) throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState(), ident);
		enterRule(_localctx, 46, RULE_a);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__24);
				setState(268);
				((AContext)_localctx).exp = exp();
				setState(269);
				match(T__1);
				((AContext)_localctx).expr =  _localctx.ident.text + " := " + ((AContext)_localctx).exp.expr + ";";
				}
				break;
			case T__1:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				((AContext)_localctx).subpparamlist = subpparamlist();
				setState(273);
				match(T__1);

				                          ArrayList<String> lista = ((AContext)_localctx).subpparamlist.lista;
				                           String expr = _localctx.ident.text;
				                           if(!lista.isEmpty()){
				                                String params = lista[0];
				                                for(int i = 1;i<lista.size();i++){
				                                    params = params +"," + lista[i];
				                                }
				                                ((AContext)_localctx).expr =  expr + " ( " + params + " )" +" ;";
				                           }else{
				                                 ((AContext)_localctx).expr =  expr + " ;" ;
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

	public static class ExpContext extends ParserRuleContext {
		public String expr;
		public FactorContext factor;
		public Exp1Context exp1;
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
			setState(278);
			((ExpContext)_localctx).factor = factor();
			setState(279);
			((ExpContext)_localctx).exp1 = exp1(((ExpContext)_localctx).factor.expr);
			((ExpContext)_localctx).expr =  ((ExpContext)_localctx).exp1.expr;
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
		public String factorh;
		public String expr;
		public OpContext op;
		public ExpContext exp;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exp1Context(ParserRuleContext parent, int invokingState, String factorh) {
			super(parent, invokingState);
			this.factorh = factorh;
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

	public final Exp1Context exp1(String factorh) throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState(), factorh);
		enterRule(_localctx, 50, RULE_exp1);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				((Exp1Context)_localctx).op = op();
				setState(283);
				((Exp1Context)_localctx).exp = exp();
				((Exp1Context)_localctx).expr =  _localctx.factorh + ((Exp1Context)_localctx).op.opa + ((Exp1Context)_localctx).exp.expr;
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
				((Exp1Context)_localctx).expr =  _localctx.factorh;
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
		public OpAritmetico opa;
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
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(T__25);
				((OpContext)_localctx).opa =  OpAritmetico.SUMA;
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__26);
				((OpContext)_localctx).opa =  OpAritmetico.RESTA;
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(T__27);
				((OpContext)_localctx).opa =  OpAritmetico.MULT;
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(T__28);
				((OpContext)_localctx).opa =  OpAritmetico.DIV;
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				match(T__29);
				((OpContext)_localctx).opa =  OpAritmetico.MOD;
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

	public static class FactorContext extends ParserRuleContext {
		public String expr;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token IDENTIFIER;
		public SubpparamlistContext subpparamlist;
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
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).expr =  ((FactorContext)_localctx).simpvalue.expr;
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__12);
				setState(305);
				((FactorContext)_localctx).exp = exp();
				setState(306);
				match(T__13);
				((FactorContext)_localctx).expr =  "(" + ((FactorContext)_localctx).exp.expr + ")";
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				((FactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(310);
				((FactorContext)_localctx).subpparamlist = subpparamlist();

				            ArrayList<String> lista = ((FactorContext)_localctx).subpparamlist.lista;
				            String expr = "<SPAN CLASS = \"ident\">" + (((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null) + "</SPAN>";
				            if(!lista.isEmpty()){
				                String params = lista[0];
				                for(int i = 1;i<lista.size();i++){
				                    params = params +"," + lista[i];
				                }
				                ((FactorContext)_localctx).expr =  expr + " ( " + params + " )";
				            }else{
				                ((FactorContext)_localctx).expr =  expr ;
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

	public static class SubpparamlistContext extends ParserRuleContext {
		public ArrayList<String> lista;
		public ExplistContext explist;
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
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(T__12);
				setState(316);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(317);
				match(T__13);
				((SubpparamlistContext)_localctx).lista =  ((SubpparamlistContext)_localctx).explist.lista;
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
				((SubpparamlistContext)_localctx).lista =  new ArrayList<>();
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
		public ArrayList<String> lista;
		public ExpContext exp;
		public Explist1Context explist1;
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
			setState(323);
			((ExplistContext)_localctx).exp = exp();
			setState(324);
			((ExplistContext)_localctx).explist1 = explist1(((ExplistContext)_localctx).exp.expr);
			((ExplistContext)_localctx).lista =  ((ExplistContext)_localctx).explist1.lista;
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
		public String expr;
		public ArrayList<String> lista;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Explist1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Explist1Context(ParserRuleContext parent, int invokingState, String expr) {
			super(parent, invokingState);
			this.expr = expr;
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

	public final Explist1Context explist1(String expr) throws RecognitionException {
		Explist1Context _localctx = new Explist1Context(_ctx, getState(), expr);
		enterRule(_localctx, 60, RULE_explist1);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(T__9);
				setState(328);
				((Explist1Context)_localctx).explist = explist();
				 ((Explist1Context)_localctx).lista =  ((Explist1Context)_localctx).explist.lista.addFirst(_localctx.expr);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{

				           ArrayList<String> lista = new ArrayList<>();
				            ((Explist1Context)_localctx).lista =  lista.addFirst(_localctx.expr);
				          
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
		public OpIncremento incr;
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
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(T__30);
				((IncContext)_localctx).incr =  OpIncremento.TO;
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(T__31);
				((IncContext)_localctx).incr =  OpIncremento.DOWNTO;
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

	public static class ExpcondContext extends ParserRuleContext {
		public String expr;
		public FactorcondContext factorcond;
		public Expcond1Context expcond1;
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
			setState(340);
			((ExpcondContext)_localctx).factorcond = factorcond();
			setState(341);
			((ExpcondContext)_localctx).expcond1 = expcond1(((ExpcondContext)_localctx).factorcond.fc);
			((ExpcondContext)_localctx).expr =  ((ExpcondContext)_localctx).expcond1.expr;
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
		public String fc;
		public String expr;
		public OplogContext oplog;
		public ExpcondContext expcond;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public Expcond1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expcond1Context(ParserRuleContext parent, int invokingState, String fc) {
			super(parent, invokingState);
			this.fc = fc;
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

	public final Expcond1Context expcond1(String fc) throws RecognitionException {
		Expcond1Context _localctx = new Expcond1Context(_ctx, getState(), fc);
		enterRule(_localctx, 66, RULE_expcond1);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				((Expcond1Context)_localctx).oplog = oplog();
				setState(345);
				((Expcond1Context)_localctx).expcond = expcond();
				((Expcond1Context)_localctx).expr =  _localctx.fc + ((Expcond1Context)_localctx).oplog.opl + ((Expcond1Context)_localctx).expcond.expr;
				}
				break;
			case T__1:
			case T__13:
			case T__17:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				((Expcond1Context)_localctx).expr =  _localctx.fc;
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
		public OpLogico opl;
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
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__32);
				((OplogContext)_localctx).opl =  OpLogico.OR; 
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(T__33);
				((OplogContext)_localctx).opl =  OpLogico.AND;
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

	public static class FactorcondContext extends ParserRuleContext {
		public String fc;
		public ExpContext expe1;
		public OpcompContext opcomp;
		public ExpContext expe2;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((FactorcondContext)_localctx).expe1 = exp();
				setState(358);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(359);
				((FactorcondContext)_localctx).expe2 = exp();
				((FactorcondContext)_localctx).fc =  ((FactorcondContext)_localctx).expe1.expr + ((FactorcondContext)_localctx).opcomp.opc + ((FactorcondContext)_localctx).expe2.expr;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(T__12);
				setState(363);
				((FactorcondContext)_localctx).expcond = expcond();
				setState(364);
				match(T__13);
				((FactorcondContext)_localctx).fc =  "("+ ((FactorcondContext)_localctx).expcond.expr +")";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(T__34);
				setState(368);
				((FactorcondContext)_localctx).factorcond = factorcond();
				((FactorcondContext)_localctx).fc =  "NOT" + ((FactorcondContext)_localctx).factorcond.fc;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(T__35);
				((FactorcondContext)_localctx).fc =  "TRUE";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(T__36);
				((FactorcondContext)_localctx).fc =  "FALSE";
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
		public OpComparador opc;
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
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(T__37);
				((OpcompContext)_localctx).opc =  OpComparador.MENOR;
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(T__38);
				((OpcompContext)_localctx).opc =  OpComparador.MAYOR;
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(T__39);
				((OpcompContext)_localctx).opc =  OpComparador.MENOR_IGUAL;
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(T__40);
				((OpcompContext)_localctx).opc =  OpComparador.MAYOR_IGUAL;
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				match(T__6);
				((OpcompContext)_localctx).opc =  OpComparador.IGUAL;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0188\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5"+
		"e\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0093\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u009b\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00af\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00ba\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d4\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00e1\n\26\3\27\3\27\3\27"+
		"\3\27\5\27\u00e7\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u010c\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0117\n\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0122\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u012e\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u013c\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0144\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u014f"+
		"\n \3!\3!\3!\3!\5!\u0155\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u0160\n"+
		"#\3$\3$\3$\3$\5$\u0166\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u017a\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0186\n&\3&\2"+
		"\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJ\2\3\3\2,\60\2\u0189\2O\3\2\2\2\4R\3\2\2\2\6Y\3\2\2\2\bd\3\2\2\2"+
		"\nf\3\2\2\2\fo\3\2\2\2\16}\3\2\2\2\20\177\3\2\2\2\22\u0083\3\2\2\2\24"+
		"\u0092\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32\u00a0\3\2\2\2\34\u00ae"+
		"\3\2\2\2\36\u00b0\3\2\2\2 \u00b9\3\2\2\2\"\u00bb\3\2\2\2$\u00c3\3\2\2"+
		"\2&\u00d3\3\2\2\2(\u00d5\3\2\2\2*\u00e0\3\2\2\2,\u00e6\3\2\2\2.\u010b"+
		"\3\2\2\2\60\u0116\3\2\2\2\62\u0118\3\2\2\2\64\u0121\3\2\2\2\66\u012d\3"+
		"\2\2\28\u013b\3\2\2\2:\u0143\3\2\2\2<\u0145\3\2\2\2>\u014e\3\2\2\2@\u0154"+
		"\3\2\2\2B\u0156\3\2\2\2D\u015f\3\2\2\2F\u0165\3\2\2\2H\u0179\3\2\2\2J"+
		"\u0185\3\2\2\2LN\t\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\3\3"+
		"\2\2\2QO\3\2\2\2RS\7\3\2\2ST\7,\2\2TU\7\4\2\2UV\5\6\4\2VW\7\5\2\2WX\b"+
		"\3\1\2X\5\3\2\2\2YZ\5\b\5\2Z[\7\6\2\2[\\\5\n\6\2\\]\7\7\2\2]^\b\4\1\2"+
		"^\7\3\2\2\2_`\5\16\b\2`a\5\b\5\2ab\b\5\1\2be\3\2\2\2ce\b\5\1\2d_\3\2\2"+
		"\2dc\3\2\2\2e\t\3\2\2\2fg\5.\30\2gh\5\f\7\2hi\b\6\1\2i\13\3\2\2\2jk\5"+
		".\30\2kl\5\f\7\2lm\b\7\1\2mp\3\2\2\2np\b\7\1\2oj\3\2\2\2on\3\2\2\2p\r"+
		"\3\2\2\2qr\5\20\t\2rs\b\b\1\2s~\3\2\2\2tu\5\30\r\2uv\b\b\1\2v~\3\2\2\2"+
		"wx\5\"\22\2xy\b\b\1\2y~\3\2\2\2z{\5$\23\2{|\b\b\1\2|~\3\2\2\2}q\3\2\2"+
		"\2}t\3\2\2\2}w\3\2\2\2}z\3\2\2\2~\17\3\2\2\2\177\u0080\7\b\2\2\u0080\u0081"+
		"\5\22\n\2\u0081\u0082\b\t\1\2\u0082\21\3\2\2\2\u0083\u0084\7,\2\2\u0084"+
		"\u0085\7\t\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7\4\2\2\u0087\u0088\5"+
		"\24\13\2\u0088\u0089\b\n\1\2\u0089\23\3\2\2\2\u008a\u008b\7,\2\2\u008b"+
		"\u008c\7\t\2\2\u008c\u008d\5\26\f\2\u008d\u008e\7\4\2\2\u008e\u008f\5"+
		"\24\13\2\u008f\u0090\b\13\1\2\u0090\u0093\3\2\2\2\u0091\u0093\b\13\1\2"+
		"\u0092\u008a\3\2\2\2\u0092\u0091\3\2\2\2\u0093\25\3\2\2\2\u0094\u0095"+
		"\7-\2\2\u0095\u009b\b\f\1\2\u0096\u0097\7.\2\2\u0097\u009b\b\f\1\2\u0098"+
		"\u0099\7/\2\2\u0099\u009b\b\f\1\2\u009a\u0094\3\2\2\2\u009a\u0096\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\27\3\2\2\2\u009c\u009d\7\n\2\2\u009d\u009e"+
		"\5\32\16\2\u009e\u009f\b\r\1\2\u009f\31\3\2\2\2\u00a0\u00a1\5\36\20\2"+
		"\u00a1\u00a2\7\13\2\2\u00a2\u00a3\5,\27\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5"+
		"\5\34\17\2\u00a5\u00a6\b\16\1\2\u00a6\33\3\2\2\2\u00a7\u00a8\5\36\20\2"+
		"\u00a8\u00a9\7\13\2\2\u00a9\u00aa\5,\27\2\u00aa\u00ab\5\34\17\2\u00ab"+
		"\u00ac\b\17\1\2\u00ac\u00af\3\2\2\2\u00ad\u00af\b\17\1\2\u00ae\u00a7\3"+
		"\2\2\2\u00ae\u00ad\3\2\2\2\u00af\35\3\2\2\2\u00b0\u00b1\7,\2\2\u00b1\u00b2"+
		"\5 \21\2\u00b2\u00b3\b\20\1\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5"+
		"\u00b6\5\36\20\2\u00b6\u00b7\b\21\1\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba"+
		"\b\21\1\2\u00b9\u00b4\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba!\3\2\2\2\u00bb"+
		"\u00bc\7\r\2\2\u00bc\u00bd\7,\2\2\u00bd\u00be\5&\24\2\u00be\u00bf\7\4"+
		"\2\2\u00bf\u00c0\5\6\4\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\b\22\1\2\u00c2"+
		"#\3\2\2\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c6\5&\24\2"+
		"\u00c6\u00c7\7\13\2\2\u00c7\u00c8\5,\27\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca"+
		"\5\6\4\2\u00ca\u00cb\7\4\2\2\u00cb\u00cc\b\23\1\2\u00cc%\3\2\2\2\u00cd"+
		"\u00ce\7\17\2\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\7\20\2\2\u00d0\u00d1\b"+
		"\24\1\2\u00d1\u00d4\3\2\2\2\u00d2\u00d4\b\24\1\2\u00d3\u00cd\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7\13"+
		"\2\2\u00d7\u00d8\5,\27\2\u00d8\u00d9\5*\26\2\u00d9\u00da\b\25\1\2\u00da"+
		")\3\2\2\2\u00db\u00dc\7\4\2\2\u00dc\u00dd\5(\25\2\u00dd\u00de\b\26\1\2"+
		"\u00de\u00e1\3\2\2\2\u00df\u00e1\b\26\1\2\u00e0\u00db\3\2\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1+\3\2\2\2\u00e2\u00e3\7\21\2\2\u00e3\u00e7\b\27\1\2\u00e4"+
		"\u00e5\7\22\2\2\u00e5\u00e7\b\27\1\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3"+
		"\2\2\2\u00e7-\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ea\5\60\31\2\u00ea\u00eb"+
		"\b\30\1\2\u00eb\u010c\3\2\2\2\u00ec\u00ed\7\23\2\2\u00ed\u00ee\5B\"\2"+
		"\u00ee\u00ef\7\24\2\2\u00ef\u00f0\5\6\4\2\u00f0\u00f1\7\25\2\2\u00f1\u00f2"+
		"\5\6\4\2\u00f2\u00f3\b\30\1\2\u00f3\u010c\3\2\2\2\u00f4\u00f5\7\26\2\2"+
		"\u00f5\u00f6\5B\"\2\u00f6\u00f7\7\27\2\2\u00f7\u00f8\5\6\4\2\u00f8\u00f9"+
		"\b\30\1\2\u00f9\u010c\3\2\2\2\u00fa\u00fb\7\30\2\2\u00fb\u00fc\5\6\4\2"+
		"\u00fc\u00fd\7\31\2\2\u00fd\u00fe\5B\"\2\u00fe\u00ff\7\4\2\2\u00ff\u0100"+
		"\b\30\1\2\u0100\u010c\3\2\2\2\u0101\u0102\7\32\2\2\u0102\u0103\7,\2\2"+
		"\u0103\u0104\7\33\2\2\u0104\u0105\5\62\32\2\u0105\u0106\5@!\2\u0106\u0107"+
		"\5\62\32\2\u0107\u0108\7\27\2\2\u0108\u0109\5\6\4\2\u0109\u010a\b\30\1"+
		"\2\u010a\u010c\3\2\2\2\u010b\u00e8\3\2\2\2\u010b\u00ec\3\2\2\2\u010b\u00f4"+
		"\3\2\2\2\u010b\u00fa\3\2\2\2\u010b\u0101\3\2\2\2\u010c/\3\2\2\2\u010d"+
		"\u010e\7\33\2\2\u010e\u010f\5\62\32\2\u010f\u0110\7\4\2\2\u0110\u0111"+
		"\b\31\1\2\u0111\u0117\3\2\2\2\u0112\u0113\5:\36\2\u0113\u0114\7\4\2\2"+
		"\u0114\u0115\b\31\1\2\u0115\u0117\3\2\2\2\u0116\u010d\3\2\2\2\u0116\u0112"+
		"\3\2\2\2\u0117\61\3\2\2\2\u0118\u0119\58\35\2\u0119\u011a\5\64\33\2\u011a"+
		"\u011b\b\32\1\2\u011b\63\3\2\2\2\u011c\u011d\5\66\34\2\u011d\u011e\5\62"+
		"\32\2\u011e\u011f\b\33\1\2\u011f\u0122\3\2\2\2\u0120\u0122\b\33\1\2\u0121"+
		"\u011c\3\2\2\2\u0121\u0120\3\2\2\2\u0122\65\3\2\2\2\u0123\u0124\7\34\2"+
		"\2\u0124\u012e\b\34\1\2\u0125\u0126\7\35\2\2\u0126\u012e\b\34\1\2\u0127"+
		"\u0128\7\36\2\2\u0128\u012e\b\34\1\2\u0129\u012a\7\37\2\2\u012a\u012e"+
		"\b\34\1\2\u012b\u012c\7 \2\2\u012c\u012e\b\34\1\2\u012d\u0123\3\2\2\2"+
		"\u012d\u0125\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012e\67\3\2\2\2\u012f\u0130\5\26\f\2\u0130\u0131\b\35\1\2\u0131"+
		"\u013c\3\2\2\2\u0132\u0133\7\17\2\2\u0133\u0134\5\62\32\2\u0134\u0135"+
		"\7\20\2\2\u0135\u0136\b\35\1\2\u0136\u013c\3\2\2\2\u0137\u0138\7,\2\2"+
		"\u0138\u0139\5:\36\2\u0139\u013a\b\35\1\2\u013a\u013c\3\2\2\2\u013b\u012f"+
		"\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0137\3\2\2\2\u013c9\3\2\2\2\u013d"+
		"\u013e\7\17\2\2\u013e\u013f\5<\37\2\u013f\u0140\7\20\2\2\u0140\u0141\b"+
		"\36\1\2\u0141\u0144\3\2\2\2\u0142\u0144\b\36\1\2\u0143\u013d\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144;\3\2\2\2\u0145\u0146\5\62\32\2\u0146\u0147\5> \2"+
		"\u0147\u0148\b\37\1\2\u0148=\3\2\2\2\u0149\u014a\7\f\2\2\u014a\u014b\5"+
		"<\37\2\u014b\u014c\b \1\2\u014c\u014f\3\2\2\2\u014d\u014f\b \1\2\u014e"+
		"\u0149\3\2\2\2\u014e\u014d\3\2\2\2\u014f?\3\2\2\2\u0150\u0151\7!\2\2\u0151"+
		"\u0155\b!\1\2\u0152\u0153\7\"\2\2\u0153\u0155\b!\1\2\u0154\u0150\3\2\2"+
		"\2\u0154\u0152\3\2\2\2\u0155A\3\2\2\2\u0156\u0157\5H%\2\u0157\u0158\5"+
		"D#\2\u0158\u0159\b\"\1\2\u0159C\3\2\2\2\u015a\u015b\5F$\2\u015b\u015c"+
		"\5B\"\2\u015c\u015d\b#\1\2\u015d\u0160\3\2\2\2\u015e\u0160\b#\1\2\u015f"+
		"\u015a\3\2\2\2\u015f\u015e\3\2\2\2\u0160E\3\2\2\2\u0161\u0162\7#\2\2\u0162"+
		"\u0166\b$\1\2\u0163\u0164\7$\2\2\u0164\u0166\b$\1\2\u0165\u0161\3\2\2"+
		"\2\u0165\u0163\3\2\2\2\u0166G\3\2\2\2\u0167\u0168\5\62\32\2\u0168\u0169"+
		"\5J&\2\u0169\u016a\5\62\32\2\u016a\u016b\b%\1\2\u016b\u017a\3\2\2\2\u016c"+
		"\u016d\7\17\2\2\u016d\u016e\5B\"\2\u016e\u016f\7\20\2\2\u016f\u0170\b"+
		"%\1\2\u0170\u017a\3\2\2\2\u0171\u0172\7%\2\2\u0172\u0173\5H%\2\u0173\u0174"+
		"\b%\1\2\u0174\u017a\3\2\2\2\u0175\u0176\7&\2\2\u0176\u017a\b%\1\2\u0177"+
		"\u0178\7\'\2\2\u0178\u017a\b%\1\2\u0179\u0167\3\2\2\2\u0179\u016c\3\2"+
		"\2\2\u0179\u0171\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"I\3\2\2\2\u017b\u017c\7(\2\2\u017c\u0186\b&\1\2\u017d\u017e\7)\2\2\u017e"+
		"\u0186\b&\1\2\u017f\u0180\7*\2\2\u0180\u0186\b&\1\2\u0181\u0182\7+\2\2"+
		"\u0182\u0186\b&\1\2\u0183\u0184\7\t\2\2\u0184\u0186\b&\1\2\u0185\u017b"+
		"\3\2\2\2\u0185\u017d\3\2\2\2\u0185\u017f\3\2\2\2\u0185\u0181\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186K\3\2\2\2\31Odo}\u0092\u009a\u00ae\u00b9\u00d3\u00e0"+
		"\u00e6\u010b\u0116\u0121\u012d\u013b\u0143\u014e\u0154\u015f\u0165\u0179"+
		"\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}