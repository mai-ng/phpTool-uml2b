package bsql2sql.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSQL2SQLLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators

    public InternalBSQL2SQLLexer() {;} 
    public InternalBSQL2SQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBSQL2SQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBSQL2SQL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQL2SQL.g:11:7: ( 'FALSE' )
            // InternalBSQL2SQL.g:11:9: 'FALSE'
            {
            match("FALSE"); 


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
            // InternalBSQL2SQL.g:12:7: ( 'TRUE' )
            // InternalBSQL2SQL.g:12:9: 'TRUE'
            {
            match("TRUE"); 


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
            // InternalBSQL2SQL.g:13:7: ( 'MACHINE' )
            // InternalBSQL2SQL.g:13:9: 'MACHINE'
            {
            match("MACHINE"); 


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
            // InternalBSQL2SQL.g:14:7: ( 'VARIABLES' )
            // InternalBSQL2SQL.g:14:9: 'VARIABLES'
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
            // InternalBSQL2SQL.g:15:7: ( 'INVARIANT' )
            // InternalBSQL2SQL.g:15:9: 'INVARIANT'
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
            // InternalBSQL2SQL.g:16:7: ( 'INITIALISATION' )
            // InternalBSQL2SQL.g:16:9: 'INITIALISATION'
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
            // InternalBSQL2SQL.g:17:7: ( ':=' )
            // InternalBSQL2SQL.g:17:9: ':='
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
            // InternalBSQL2SQL.g:18:7: ( '{}' )
            // InternalBSQL2SQL.g:18:9: '{}'
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
            // InternalBSQL2SQL.g:19:7: ( 'OPERATIONS' )
            // InternalBSQL2SQL.g:19:9: 'OPERATIONS'
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
            // InternalBSQL2SQL.g:20:7: ( '<:' )
            // InternalBSQL2SQL.g:20:9: '<:'
            {
            match("<:"); 


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
            // InternalBSQL2SQL.g:21:7: ( 'struct' )
            // InternalBSQL2SQL.g:21:9: 'struct'
            {
            match("struct"); 


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
            // InternalBSQL2SQL.g:22:7: ( '(' )
            // InternalBSQL2SQL.g:22:9: '('
            {
            match('('); 

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
            // InternalBSQL2SQL.g:23:7: ( ')' )
            // InternalBSQL2SQL.g:23:9: ')'
            {
            match(')'); 

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
            // InternalBSQL2SQL.g:24:7: ( ',' )
            // InternalBSQL2SQL.g:24:9: ','
            {
            match(','); 

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
            // InternalBSQL2SQL.g:25:7: ( ':' )
            // InternalBSQL2SQL.g:25:9: ':'
            {
            match(':'); 

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
            // InternalBSQL2SQL.g:26:7: ( 'res' )
            // InternalBSQL2SQL.g:26:9: 'res'
            {
            match("res"); 


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
            // InternalBSQL2SQL.g:27:7: ( '<--' )
            // InternalBSQL2SQL.g:27:9: '<--'
            {
            match("<--"); 


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
            // InternalBSQL2SQL.g:28:7: ( '=' )
            // InternalBSQL2SQL.g:28:9: '='
            {
            match('='); 

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
            // InternalBSQL2SQL.g:29:7: ( 'PRE' )
            // InternalBSQL2SQL.g:29:9: 'PRE'
            {
            match("PRE"); 


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
            // InternalBSQL2SQL.g:30:7: ( 'THEN' )
            // InternalBSQL2SQL.g:30:9: 'THEN'
            {
            match("THEN"); 


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
            // InternalBSQL2SQL.g:31:7: ( 'bool(' )
            // InternalBSQL2SQL.g:31:9: 'bool('
            {
            match("bool("); 


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
            // InternalBSQL2SQL.g:32:7: ( '#' )
            // InternalBSQL2SQL.g:32:9: '#'
            {
            match('#'); 

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
            // InternalBSQL2SQL.g:33:7: ( '&' )
            // InternalBSQL2SQL.g:33:9: '&'
            {
            match('&'); 

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
            // InternalBSQL2SQL.g:34:7: ( 'END' )
            // InternalBSQL2SQL.g:34:9: 'END'
            {
            match("END"); 


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
            // InternalBSQL2SQL.g:35:7: ( '\\'' )
            // InternalBSQL2SQL.g:35:9: '\\''
            {
            match('\''); 

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
            // InternalBSQL2SQL.g:36:7: ( '.(' )
            // InternalBSQL2SQL.g:36:9: '.('
            {
            match(".("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSQL2SQL.g:3584:13: ( '#' '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalBSQL2SQL.g:3584:15: '#' '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('#'); 
            match('\"'); 
            // InternalBSQL2SQL.g:3584:23: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalBSQL2SQL.g:3584:24: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalBSQL2SQL.g:3584:69: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalBSQL2SQL.g:3586:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBSQL2SQL.g:3586:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBSQL2SQL.g:3586:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBSQL2SQL.g:3586:11: '^'
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

            // InternalBSQL2SQL.g:3586:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBSQL2SQL.g:
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
            // InternalBSQL2SQL.g:3588:10: ( ( '0' .. '9' )+ )
            // InternalBSQL2SQL.g:3588:12: ( '0' .. '9' )+
            {
            // InternalBSQL2SQL.g:3588:12: ( '0' .. '9' )+
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
            	    // InternalBSQL2SQL.g:3588:13: '0' .. '9'
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
            // InternalBSQL2SQL.g:3590:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBSQL2SQL.g:3590:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBSQL2SQL.g:3590:24: ( options {greedy=false; } : . )*
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
            	    // InternalBSQL2SQL.g:3590:52: .
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
            // InternalBSQL2SQL.g:3592:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBSQL2SQL.g:3592:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBSQL2SQL.g:3592:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBSQL2SQL.g:3592:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalBSQL2SQL.g:3592:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBSQL2SQL.g:3592:41: ( '\\r' )? '\\n'
                    {
                    // InternalBSQL2SQL.g:3592:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalBSQL2SQL.g:3592:41: '\\r'
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
            // InternalBSQL2SQL.g:3594:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBSQL2SQL.g:3594:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBSQL2SQL.g:3594:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalBSQL2SQL.g:
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
            // InternalBSQL2SQL.g:3596:16: ( . )
            // InternalBSQL2SQL.g:3596:18: .
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
        // InternalBSQL2SQL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=33;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalBSQL2SQL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalBSQL2SQL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalBSQL2SQL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalBSQL2SQL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalBSQL2SQL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalBSQL2SQL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalBSQL2SQL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalBSQL2SQL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalBSQL2SQL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalBSQL2SQL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalBSQL2SQL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalBSQL2SQL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalBSQL2SQL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalBSQL2SQL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalBSQL2SQL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalBSQL2SQL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalBSQL2SQL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalBSQL2SQL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalBSQL2SQL.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalBSQL2SQL.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalBSQL2SQL.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalBSQL2SQL.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalBSQL2SQL.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalBSQL2SQL.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalBSQL2SQL.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalBSQL2SQL.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalBSQL2SQL.g:1:166: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalBSQL2SQL.g:1:178: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalBSQL2SQL.g:1:186: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalBSQL2SQL.g:1:195: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // InternalBSQL2SQL.g:1:211: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalBSQL2SQL.g:1:227: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalBSQL2SQL.g:1:235: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\5\36\1\45\1\34\1\36\1\34\1\36\3\uffff\1\36\1\uffff\2\36\1\63\1\uffff\1\36\1\uffff\2\34\2\uffff\1\34\2\uffff\1\36\1\uffff\5\36\3\uffff\1\36\2\uffff\1\36\3\uffff\1\36\1\uffff\2\36\3\uffff\1\36\6\uffff\11\36\1\122\1\123\1\36\1\125\1\36\1\127\1\130\6\36\2\uffff\1\36\1\uffff\1\140\2\uffff\6\36\2\uffff\5\36\1\154\1\155\4\36\2\uffff\4\36\1\166\1\167\2\36\2\uffff\1\36\1\173\1\36\1\uffff\2\36\1\177\1\uffff";
    static final String DFA10_eofS =
        "\u0080\uffff";
    static final String DFA10_minS =
        "\1\0\1\101\1\110\2\101\1\116\1\75\1\175\1\120\1\55\1\164\3\uffff\1\145\1\uffff\1\122\1\157\1\42\1\uffff\1\116\1\uffff\1\50\1\101\2\uffff\1\52\2\uffff\1\114\1\uffff\1\125\1\105\1\103\1\122\1\111\3\uffff\1\105\2\uffff\1\162\3\uffff\1\163\1\uffff\1\105\1\157\3\uffff\1\104\6\uffff\1\123\1\105\1\116\1\110\1\111\1\101\1\124\1\122\1\165\2\60\1\154\1\60\1\105\2\60\1\111\1\101\1\122\1\111\1\101\1\143\2\uffff\1\50\1\uffff\1\60\2\uffff\1\116\1\102\1\111\1\101\1\124\1\164\2\uffff\1\105\1\114\1\101\1\114\1\111\2\60\1\105\1\116\1\111\1\117\2\uffff\1\123\1\124\1\123\1\116\2\60\1\101\1\123\2\uffff\1\124\1\60\1\111\1\uffff\1\117\1\116\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\101\1\122\2\101\1\116\1\75\1\175\1\120\1\72\1\164\3\uffff\1\145\1\uffff\1\122\1\157\1\42\1\uffff\1\116\1\uffff\1\50\1\172\2\uffff\1\57\2\uffff\1\114\1\uffff\1\125\1\105\1\103\1\122\1\126\3\uffff\1\105\2\uffff\1\162\3\uffff\1\163\1\uffff\1\105\1\157\3\uffff\1\104\6\uffff\1\123\1\105\1\116\1\110\1\111\1\101\1\124\1\122\1\165\2\172\1\154\1\172\1\105\2\172\1\111\1\101\1\122\1\111\1\101\1\143\2\uffff\1\50\1\uffff\1\172\2\uffff\1\116\1\102\1\111\1\101\1\124\1\164\2\uffff\1\105\1\114\1\101\1\114\1\111\2\172\1\105\1\116\1\111\1\117\2\uffff\1\123\1\124\1\123\1\116\2\172\1\101\1\123\2\uffff\1\124\1\172\1\111\1\uffff\1\117\1\116\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\13\uffff\1\14\1\15\1\16\1\uffff\1\22\3\uffff\1\27\1\uffff\1\31\2\uffff\1\34\1\35\1\uffff\1\40\1\41\1\uffff\1\34\5\uffff\1\7\1\17\1\10\1\uffff\1\12\1\21\1\uffff\1\14\1\15\1\16\1\uffff\1\22\2\uffff\1\33\1\26\1\27\1\uffff\1\31\1\32\1\35\1\36\1\37\1\40\26\uffff\1\20\1\23\1\uffff\1\30\1\uffff\1\2\1\24\6\uffff\1\25\1\1\13\uffff\1\13\1\3\10\uffff\1\4\1\5\3\uffff\1\11\3\uffff\1\6";
    static final String DFA10_specialS =
        "\1\0\177\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\2\34\1\22\2\34\1\23\1\25\1\13\1\14\2\34\1\15\1\34\1\26\1\32\12\31\1\6\1\34\1\11\1\17\3\34\4\30\1\24\1\1\2\30\1\5\3\30\1\3\1\30\1\10\1\20\3\30\1\2\1\30\1\4\4\30\3\34\1\27\1\30\1\34\1\30\1\21\17\30\1\16\1\12\7\30\1\7\uff84\34",
            "\1\35",
            "\1\40\11\uffff\1\37",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\46",
            "\1\47",
            "\1\51\14\uffff\1\50",
            "\1\52",
            "",
            "",
            "",
            "\1\56",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\65",
            "",
            "\1\67",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102\14\uffff\1\101",
            "",
            "",
            "",
            "\1\103",
            "",
            "",
            "\1\104",
            "",
            "",
            "",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\124",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\126",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "\1\137",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='F') ) {s = 1;}

                        else if ( (LA10_0=='T') ) {s = 2;}

                        else if ( (LA10_0=='M') ) {s = 3;}

                        else if ( (LA10_0=='V') ) {s = 4;}

                        else if ( (LA10_0=='I') ) {s = 5;}

                        else if ( (LA10_0==':') ) {s = 6;}

                        else if ( (LA10_0=='{') ) {s = 7;}

                        else if ( (LA10_0=='O') ) {s = 8;}

                        else if ( (LA10_0=='<') ) {s = 9;}

                        else if ( (LA10_0=='s') ) {s = 10;}

                        else if ( (LA10_0=='(') ) {s = 11;}

                        else if ( (LA10_0==')') ) {s = 12;}

                        else if ( (LA10_0==',') ) {s = 13;}

                        else if ( (LA10_0=='r') ) {s = 14;}

                        else if ( (LA10_0=='=') ) {s = 15;}

                        else if ( (LA10_0=='P') ) {s = 16;}

                        else if ( (LA10_0=='b') ) {s = 17;}

                        else if ( (LA10_0=='#') ) {s = 18;}

                        else if ( (LA10_0=='&') ) {s = 19;}

                        else if ( (LA10_0=='E') ) {s = 20;}

                        else if ( (LA10_0=='\'') ) {s = 21;}

                        else if ( (LA10_0=='.') ) {s = 22;}

                        else if ( (LA10_0=='^') ) {s = 23;}

                        else if ( ((LA10_0>='A' && LA10_0<='D')||(LA10_0>='G' && LA10_0<='H')||(LA10_0>='J' && LA10_0<='L')||LA10_0=='N'||(LA10_0>='Q' && LA10_0<='S')||LA10_0=='U'||(LA10_0>='W' && LA10_0<='Z')||LA10_0=='_'||LA10_0=='a'||(LA10_0>='c' && LA10_0<='q')||(LA10_0>='t' && LA10_0<='z')) ) {s = 24;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 25;}

                        else if ( (LA10_0=='/') ) {s = 26;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 27;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='!' && LA10_0<='\"')||(LA10_0>='$' && LA10_0<='%')||(LA10_0>='*' && LA10_0<='+')||LA10_0=='-'||LA10_0==';'||(LA10_0>='>' && LA10_0<='@')||(LA10_0>='[' && LA10_0<=']')||LA10_0=='`'||(LA10_0>='|' && LA10_0<='\uFFFF')) ) {s = 28;}

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