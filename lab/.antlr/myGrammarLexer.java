// Generated from /Users/shankaracharya/Workspace/linn/sem1/compiler/lab/myGrammar.g4 by ANTLR 4.13.1
    // Define name of package for generated Java files.
    package generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class myGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT=20, ID=21, BOOL=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "INT", "ID", "BOOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'{'", "'}'", "'int'", "'='", "';'", "'while'", "'('", 
			"')'", "'if'", "'print'", "'else'", "'/'", "'*'", "'+'", "'-'", "'<'", 
			"'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INT", "ID", "BOOL"
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


	public myGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013k\b\u0013"+
		"\u0001\u0013\u0004\u0013n\b\u0013\u000b\u0013\f\u0013o\u0003\u0013r\b"+
		"\u0013\u0001\u0014\u0004\u0014u\b\u0014\u000b\u0014\f\u0014v\u0001\u0014"+
		"\u0005\u0014z\b\u0014\n\u0014\f\u0014}\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0088\b\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0002\u0001\u0000"+
		"AZ\u0002\u000009AZ\u008e\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001"+
		"\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000"+
		"\u0000\u00079\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b"+
		"?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fG\u0001\u0000"+
		"\u0000\u0000\u0011I\u0001\u0000\u0000\u0000\u0013K\u0001\u0000\u0000\u0000"+
		"\u0015N\u0001\u0000\u0000\u0000\u0017T\u0001\u0000\u0000\u0000\u0019Y"+
		"\u0001\u0000\u0000\u0000\u001b[\u0001\u0000\u0000\u0000\u001d]\u0001\u0000"+
		"\u0000\u0000\u001f_\u0001\u0000\u0000\u0000!a\u0001\u0000\u0000\u0000"+
		"#c\u0001\u0000\u0000\u0000%e\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000"+
		"\u0000)t\u0001\u0000\u0000\u0000+\u0087\u0001\u0000\u0000\u0000-.\u0005"+
		"p\u0000\u0000./\u0005r\u0000\u0000/0\u0005o\u0000\u000001\u0005g\u0000"+
		"\u000012\u0005r\u0000\u000023\u0005a\u0000\u000034\u0005m\u0000\u0000"+
		"4\u0002\u0001\u0000\u0000\u000056\u0005{\u0000\u00006\u0004\u0001\u0000"+
		"\u0000\u000078\u0005}\u0000\u00008\u0006\u0001\u0000\u0000\u00009:\u0005"+
		"i\u0000\u0000:;\u0005n\u0000\u0000;<\u0005t\u0000\u0000<\b\u0001\u0000"+
		"\u0000\u0000=>\u0005=\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005;"+
		"\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005w\u0000\u0000BC\u0005h"+
		"\u0000\u0000CD\u0005i\u0000\u0000DE\u0005l\u0000\u0000EF\u0005e\u0000"+
		"\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005(\u0000\u0000H\u0010\u0001"+
		"\u0000\u0000\u0000IJ\u0005)\u0000\u0000J\u0012\u0001\u0000\u0000\u0000"+
		"KL\u0005i\u0000\u0000LM\u0005f\u0000\u0000M\u0014\u0001\u0000\u0000\u0000"+
		"NO\u0005p\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005"+
		"n\u0000\u0000RS\u0005t\u0000\u0000S\u0016\u0001\u0000\u0000\u0000TU\u0005"+
		"e\u0000\u0000UV\u0005l\u0000\u0000VW\u0005s\u0000\u0000WX\u0005e\u0000"+
		"\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0005/\u0000\u0000Z\u001a\u0001"+
		"\u0000\u0000\u0000[\\\u0005*\u0000\u0000\\\u001c\u0001\u0000\u0000\u0000"+
		"]^\u0005+\u0000\u0000^\u001e\u0001\u0000\u0000\u0000_`\u0005-\u0000\u0000"+
		"` \u0001\u0000\u0000\u0000ab\u0005<\u0000\u0000b\"\u0001\u0000\u0000\u0000"+
		"cd\u0005>\u0000\u0000d$\u0001\u0000\u0000\u0000ef\u0005=\u0000\u0000f"+
		"g\u0005=\u0000\u0000g&\u0001\u0000\u0000\u0000hr\u00050\u0000\u0000ik"+
		"\u0005-\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"km\u0001\u0000\u0000\u0000ln\u000219\u0000ml\u0001\u0000\u0000\u0000n"+
		"o\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000qj\u0001\u0000"+
		"\u0000\u0000r(\u0001\u0000\u0000\u0000su\u0007\u0000\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000w{\u0001\u0000\u0000\u0000xz\u0007\u0001\u0000"+
		"\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|*\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005t\u0000\u0000\u007f\u0080\u0005r\u0000"+
		"\u0000\u0080\u0081\u0005u\u0000\u0000\u0081\u0088\u0005e\u0000\u0000\u0082"+
		"\u0083\u0005f\u0000\u0000\u0083\u0084\u0005a\u0000\u0000\u0084\u0085\u0005"+
		"l\u0000\u0000\u0085\u0086\u0005s\u0000\u0000\u0086\u0088\u0005e\u0000"+
		"\u0000\u0087~\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000"+
		"\u0088,\u0001\u0000\u0000\u0000\u0007\u0000joqv{\u0087\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}