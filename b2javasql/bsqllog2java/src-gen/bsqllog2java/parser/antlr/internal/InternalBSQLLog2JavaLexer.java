package bsqllog2java.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSQLLog2JavaLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalBSQLLog2JavaLexer() {;} 
    public InternalBSQLLog2JavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBSQLLog2JavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBSQLLog2Java.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:11:7: ( 'MACHINE' )
            // InternalBSQLLog2Java.g:11:9: 'MACHINE'
            {
            match("MACHINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:12:7: ( 'SEES' )
            // InternalBSQLLog2Java.g:12:9: 'SEES'
            {
            match("SEES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:13:7: ( ',' )
            // InternalBSQLLog2Java.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:14:7: ( 'VARIABLES' )
            // InternalBSQLLog2Java.g:14:9: 'VARIABLES'
            {
            match("VARIABLES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:15:7: ( 'INVARIANT' )
            // InternalBSQLLog2Java.g:15:9: 'INVARIANT'
            {
            match("INVARIANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:16:7: ( 'INITIALISATION' )
            // InternalBSQLLog2Java.g:16:9: 'INITIALISATION'
            {
            match("INITIALISATION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:17:7: ( ':=' )
            // InternalBSQLLog2Java.g:17:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:18:7: ( '{}' )
            // InternalBSQLLog2Java.g:18:9: '{}'
            {
            match("{}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:19:7: ( 'OPERATIONS' )
            // InternalBSQLLog2Java.g:19:9: 'OPERATIONS'
            {
            match("OPERATIONS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:20:7: ( ';' )
            // InternalBSQLLog2Java.g:20:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:21:7: ( 'END' )
            // InternalBSQLLog2Java.g:21:9: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:22:7: ( '<:' )
            // InternalBSQLLog2Java.g:22:9: '<:'
            {
            match("<:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:23:7: ( 'struct' )
            // InternalBSQLLog2Java.g:23:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:24:7: ( '(' )
            // InternalBSQLLog2Java.g:24:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:25:7: ( ')' )
            // InternalBSQLLog2Java.g:25:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:26:7: ( ':' )
            // InternalBSQLLog2Java.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:27:7: ( 'FALSE' )
            // InternalBSQLLog2Java.g:27:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:28:7: ( 'TRUE' )
            // InternalBSQLLog2Java.g:28:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:29:7: ( '<--' )
            // InternalBSQLLog2Java.g:29:9: '<--'
            {
            match("<--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:30:7: ( '=' )
            // InternalBSQLLog2Java.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:31:7: ( 'PRE' )
            // InternalBSQLLog2Java.g:31:9: 'PRE'
            {
            match("PRE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:32:7: ( '&' )
            // InternalBSQLLog2Java.g:32:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:33:7: ( 'THEN' )
            // InternalBSQLLog2Java.g:33:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:34:7: ( 'bool(' )
            // InternalBSQLLog2Java.g:34:9: 'bool('
            {
            match("bool("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:35:7: ( '#' )
            // InternalBSQLLog2Java.g:35:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:36:7: ( 'not' )
            // InternalBSQLLog2Java.g:36:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:37:7: ( 'ANY' )
            // InternalBSQLLog2Java.g:37:9: 'ANY'
            {
            match("ANY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:38:7: ( 'WHERE' )
            // InternalBSQLLog2Java.g:38:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:39:7: ( '||' )
            // InternalBSQLLog2Java.g:39:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:40:7: ( '\\'' )
            // InternalBSQLLog2Java.g:40:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:41:7: ( '.(' )
            // InternalBSQLLog2Java.g:41:9: '.('
            {
            match(".("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:42:7: ( '\\\\/' )
            // InternalBSQLLog2Java.g:42:9: '\\\\/'
            {
            match("\\/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:43:7: ( '{' )
            // InternalBSQLLog2Java.g:43:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:44:7: ( 'rec(' )
            // InternalBSQLLog2Java.g:44:9: 'rec('
            {
            match("rec("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:45:7: ( ')}' )
            // InternalBSQLLog2Java.g:45:9: ')}'
            {
            match(")}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:2340:13: ( '#' '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalBSQLLog2Java.g:2340:15: '#' '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('#'); 
            match('\"'); 
            // InternalBSQLLog2Java.g:2340:23: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:2340:24: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalBSQLLog2Java.g:2340:69: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:2342:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBSQLLog2Java.g:2342:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBSQLLog2Java.g:2342:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBSQLLog2Java.g:2342:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBSQLLog2Java.g:2342:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:2344:10: ( ( '0' .. '9' )+ )
            // InternalBSQLLog2Java.g:2344:12: ( '0' .. '9' )+
            {
            // InternalBSQLLog2Java.g:2344:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:2344:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:2346:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBSQLLog2Java.g:2346:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBSQLLog2Java.g:2346:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:2346:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:2348:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBSQLLog2Java.g:2348:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBSQLLog2Java.g:2348:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:2348:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalBSQLLog2Java.g:2348:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBSQLLog2Java.g:2348:41: ( '\\r' )? '\\n'
                    {
                    // InternalBSQLLog2Java.g:2348:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalBSQLLog2Java.g:2348:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:2350:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBSQLLog2Java.g:2350:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBSQLLog2Java.g:2350:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQLLog2Java.g:2352:16: ( . )
            // InternalBSQLLog2Java.g:2352:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalBSQLLog2Java.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=42;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalBSQLLog2Java.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalBSQLLog2Java.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalBSQLLog2Java.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalBSQLLog2Java.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalBSQLLog2Java.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalBSQLLog2Java.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalBSQLLog2Java.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalBSQLLog2Java.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalBSQLLog2Java.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalBSQLLog2Java.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalBSQLLog2Java.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalBSQLLog2Java.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalBSQLLog2Java.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalBSQLLog2Java.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalBSQLLog2Java.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalBSQLLog2Java.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalBSQLLog2Java.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalBSQLLog2Java.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalBSQLLog2Java.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalBSQLLog2Java.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalBSQLLog2Java.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalBSQLLog2Java.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalBSQLLog2Java.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalBSQLLog2Java.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalBSQLLog2Java.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalBSQLLog2Java.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalBSQLLog2Java.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalBSQLLog2Java.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalBSQLLog2Java.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalBSQLLog2Java.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalBSQLLog2Java.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalBSQLLog2Java.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalBSQLLog2Java.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalBSQLLog2Java.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalBSQLLog2Java.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalBSQLLog2Java.g:1:220: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalBSQLLog2Java.g:1:232: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalBSQLLog2Java.g:1:240: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalBSQLLog2Java.g:1:249: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalBSQLLog2Java.g:1:265: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalBSQLLog2Java.g:1:281: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalBSQLLog2Java.g:1:289: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\2\45\1\uffff\2\45\1\53\1\55\1\45\1\uffff\1\45\1\43\1\45\1\uffff\1\66\2\45\1\uffff\1\45\1\uffff\1\45\1\77\3\45\1\43\1\uffff\2\43\1\45\1\43\2\uffff\1\43\2\uffff\1\45\1\uffff\1\45\1\uffff\2\45\4\uffff\1\45\1\uffff\1\45\2\uffff\1\45\3\uffff\3\45\1\uffff\1\45\1\uffff\1\45\2\uffff\3\45\4\uffff\1\45\4\uffff\6\45\1\143\4\45\1\150\1\45\1\152\1\153\3\45\1\157\4\45\1\uffff\2\45\1\166\1\167\1\uffff\1\45\2\uffff\1\45\1\uffff\1\45\1\uffff\5\45\1\u0080\3\uffff\1\u0081\5\45\1\u0087\2\uffff\1\u0088\4\45\2\uffff\4\45\1\u0091\1\u0092\2\45\2\uffff\1\45\1\u0096\1\45\1\uffff\2\45\1\u009a\1\uffff";
    static final String DFA10_eofS =
        "\u009b\uffff";
    static final String DFA10_minS =
        "\1\0\1\101\1\105\1\uffff\1\101\1\116\1\75\1\175\1\120\1\uffff\1\116\1\55\1\164\1\uffff\1\175\1\101\1\110\1\uffff\1\122\1\uffff\1\157\1\42\1\157\1\116\1\110\1\174\1\uffff\1\50\1\57\1\145\1\101\2\uffff\1\52\2\uffff\1\103\1\uffff\1\105\1\uffff\1\122\1\111\4\uffff\1\105\1\uffff\1\104\2\uffff\1\162\3\uffff\1\114\1\125\1\105\1\uffff\1\105\1\uffff\1\157\2\uffff\1\164\1\131\1\105\4\uffff\1\143\4\uffff\1\110\1\123\1\111\1\101\1\124\1\122\1\60\1\165\1\123\1\105\1\116\1\60\1\154\2\60\1\122\1\50\1\111\1\60\1\101\1\122\1\111\1\101\1\uffff\1\143\1\105\2\60\1\uffff\1\50\2\uffff\1\105\1\uffff\1\116\1\uffff\1\102\1\111\1\101\1\124\1\164\1\60\3\uffff\1\60\1\105\1\114\1\101\1\114\1\111\1\60\2\uffff\1\60\1\105\1\116\1\111\1\117\2\uffff\1\123\1\124\1\123\1\116\2\60\1\101\1\123\2\uffff\1\124\1\60\1\111\1\uffff\1\117\1\116\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\101\1\105\1\uffff\1\101\1\116\1\75\1\175\1\120\1\uffff\1\116\1\72\1\164\1\uffff\1\175\1\101\1\122\1\uffff\1\122\1\uffff\1\157\1\42\1\157\1\116\1\110\1\174\1\uffff\1\50\1\57\1\145\1\172\2\uffff\1\57\2\uffff\1\103\1\uffff\1\105\1\uffff\1\122\1\126\4\uffff\1\105\1\uffff\1\104\2\uffff\1\162\3\uffff\1\114\1\125\1\105\1\uffff\1\105\1\uffff\1\157\2\uffff\1\164\1\131\1\105\4\uffff\1\143\4\uffff\1\110\1\123\1\111\1\101\1\124\1\122\1\172\1\165\1\123\1\105\1\116\1\172\1\154\2\172\1\122\1\50\1\111\1\172\1\101\1\122\1\111\1\101\1\uffff\1\143\1\105\2\172\1\uffff\1\50\2\uffff\1\105\1\uffff\1\116\1\uffff\1\102\1\111\1\101\1\124\1\164\1\172\3\uffff\1\172\1\105\1\114\1\101\1\114\1\111\1\172\2\uffff\1\172\1\105\1\116\1\111\1\117\2\uffff\1\123\1\124\1\123\1\116\2\172\1\101\1\123\2\uffff\1\124\1\172\1\111\1\uffff\1\117\1\116\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\3\5\uffff\1\12\3\uffff\1\16\3\uffff\1\24\1\uffff\1\26\6\uffff\1\36\4\uffff\1\45\1\46\1\uffff\1\51\1\52\1\uffff\1\45\1\uffff\1\3\2\uffff\1\7\1\20\1\10\1\41\1\uffff\1\12\1\uffff\1\14\1\23\1\uffff\1\16\1\43\1\17\3\uffff\1\24\1\uffff\1\26\1\uffff\1\44\1\31\3\uffff\1\35\1\36\1\37\1\40\1\uffff\1\46\1\47\1\50\1\51\27\uffff\1\13\4\uffff\1\25\1\uffff\1\32\1\33\1\uffff\1\42\1\uffff\1\2\6\uffff\1\22\1\27\1\30\7\uffff\1\21\1\34\5\uffff\1\15\1\1\10\uffff\1\4\1\5\3\uffff\1\11\3\uffff\1\6";
    static final String DFA10_specialS =
        "\1\0\u009a\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\2\43\1\25\2\43\1\23\1\32\1\15\1\16\2\43\1\3\1\43\1\33\1\41\12\40\1\6\1\11\1\13\1\21\3\43\1\27\3\37\1\12\1\17\2\37\1\5\3\37\1\1\1\37\1\10\1\22\2\37\1\2\1\20\1\37\1\4\1\30\3\37\1\43\1\34\1\43\1\36\1\37\1\43\1\37\1\24\13\37\1\26\3\37\1\35\1\14\7\37\1\7\1\31\uff83\43",
            "\1\44",
            "\1\46",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\54",
            "\1\56",
            "",
            "\1\60",
            "\1\62\14\uffff\1\61",
            "\1\63",
            "",
            "\1\65",
            "\1\67",
            "\1\71\11\uffff\1\70",
            "",
            "\1\73",
            "",
            "\1\75",
            "\1\76",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\111\4\uffff\1\112",
            "",
            "",
            "\1\114",
            "",
            "\1\115",
            "",
            "\1\116",
            "\1\120\14\uffff\1\117",
            "",
            "",
            "",
            "",
            "\1\121",
            "",
            "\1\122",
            "",
            "",
            "\1\123",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "",
            "\1\130",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "\1\134",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\151",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\170",
            "",
            "",
            "\1\171",
            "",
            "\1\172",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "\1\u0095",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='M') ) {s = 1;}

                        else if ( (LA10_0=='S') ) {s = 2;}

                        else if ( (LA10_0==',') ) {s = 3;}

                        else if ( (LA10_0=='V') ) {s = 4;}

                        else if ( (LA10_0=='I') ) {s = 5;}

                        else if ( (LA10_0==':') ) {s = 6;}

                        else if ( (LA10_0=='{') ) {s = 7;}

                        else if ( (LA10_0=='O') ) {s = 8;}

                        else if ( (LA10_0==';') ) {s = 9;}

                        else if ( (LA10_0=='E') ) {s = 10;}

                        else if ( (LA10_0=='<') ) {s = 11;}

                        else if ( (LA10_0=='s') ) {s = 12;}

                        else if ( (LA10_0=='(') ) {s = 13;}

                        else if ( (LA10_0==')') ) {s = 14;}

                        else if ( (LA10_0=='F') ) {s = 15;}

                        else if ( (LA10_0=='T') ) {s = 16;}

                        else if ( (LA10_0=='=') ) {s = 17;}

                        else if ( (LA10_0=='P') ) {s = 18;}

                        else if ( (LA10_0=='&') ) {s = 19;}

                        else if ( (LA10_0=='b') ) {s = 20;}

                        else if ( (LA10_0=='#') ) {s = 21;}

                        else if ( (LA10_0=='n') ) {s = 22;}

                        else if ( (LA10_0=='A') ) {s = 23;}

                        else if ( (LA10_0=='W') ) {s = 24;}

                        else if ( (LA10_0=='|') ) {s = 25;}

                        else if ( (LA10_0=='\'') ) {s = 26;}

                        else if ( (LA10_0=='.') ) {s = 27;}

                        else if ( (LA10_0=='\\') ) {s = 28;}

                        else if ( (LA10_0=='r') ) {s = 29;}

                        else if ( (LA10_0=='^') ) {s = 30;}

                        else if ( ((LA10_0>='B' && LA10_0<='D')||(LA10_0>='G' && LA10_0<='H')||(LA10_0>='J' && LA10_0<='L')||LA10_0=='N'||(LA10_0>='Q' && LA10_0<='R')||LA10_0=='U'||(LA10_0>='X' && LA10_0<='Z')||LA10_0=='_'||LA10_0=='a'||(LA10_0>='c' && LA10_0<='m')||(LA10_0>='o' && LA10_0<='q')||(LA10_0>='t' && LA10_0<='z')) ) {s = 31;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 32;}

                        else if ( (LA10_0=='/') ) {s = 33;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 34;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='!' && LA10_0<='\"')||(LA10_0>='$' && LA10_0<='%')||(LA10_0>='*' && LA10_0<='+')||LA10_0=='-'||(LA10_0>='>' && LA10_0<='@')||LA10_0=='['||LA10_0==']'||LA10_0=='`'||(LA10_0>='}' && LA10_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}