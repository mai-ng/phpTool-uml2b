package secureuml2SQL.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import secureuml2SQL.services.SecureUML2SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecureUML2SQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MACHINE'", "'SETS'", "'CONSTANTS'", "'PROPERTIES'", "'END'", "';'", "','", "'&'", "'='", "'}'", "'|->'", "'{'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSecureUML2SQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSecureUML2SQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSecureUML2SQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSecureUML2SQL.g"; }


    	private SecureUML2SQLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SecureUML2SQLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSecureUML2SQL"
    // InternalSecureUML2SQL.g:53:1: entryRuleSecureUML2SQL : ruleSecureUML2SQL EOF ;
    public final void entryRuleSecureUML2SQL() throws RecognitionException {
        try {
            // InternalSecureUML2SQL.g:54:1: ( ruleSecureUML2SQL EOF )
            // InternalSecureUML2SQL.g:55:1: ruleSecureUML2SQL EOF
            {
             before(grammarAccess.getSecureUML2SQLRule()); 
            pushFollow(FOLLOW_1);
            ruleSecureUML2SQL();

            state._fsp--;

             after(grammarAccess.getSecureUML2SQLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecureUML2SQL"


    // $ANTLR start "ruleSecureUML2SQL"
    // InternalSecureUML2SQL.g:62:1: ruleSecureUML2SQL : ( ruleBMachine ) ;
    public final void ruleSecureUML2SQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:66:2: ( ( ruleBMachine ) )
            // InternalSecureUML2SQL.g:67:2: ( ruleBMachine )
            {
            // InternalSecureUML2SQL.g:67:2: ( ruleBMachine )
            // InternalSecureUML2SQL.g:68:3: ruleBMachine
            {
             before(grammarAccess.getSecureUML2SQLAccess().getBMachineParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBMachine();

            state._fsp--;

             after(grammarAccess.getSecureUML2SQLAccess().getBMachineParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecureUML2SQL"


    // $ANTLR start "entryRuleBMachine"
    // InternalSecureUML2SQL.g:78:1: entryRuleBMachine : ruleBMachine EOF ;
    public final void entryRuleBMachine() throws RecognitionException {
        try {
            // InternalSecureUML2SQL.g:79:1: ( ruleBMachine EOF )
            // InternalSecureUML2SQL.g:80:1: ruleBMachine EOF
            {
             before(grammarAccess.getBMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleBMachine();

            state._fsp--;

             after(grammarAccess.getBMachineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBMachine"


    // $ANTLR start "ruleBMachine"
    // InternalSecureUML2SQL.g:87:1: ruleBMachine : ( ( rule__BMachine__Group__0 ) ) ;
    public final void ruleBMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:91:2: ( ( ( rule__BMachine__Group__0 ) ) )
            // InternalSecureUML2SQL.g:92:2: ( ( rule__BMachine__Group__0 ) )
            {
            // InternalSecureUML2SQL.g:92:2: ( ( rule__BMachine__Group__0 ) )
            // InternalSecureUML2SQL.g:93:3: ( rule__BMachine__Group__0 )
            {
             before(grammarAccess.getBMachineAccess().getGroup()); 
            // InternalSecureUML2SQL.g:94:3: ( rule__BMachine__Group__0 )
            // InternalSecureUML2SQL.g:94:4: rule__BMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBMachine"


    // $ANTLR start "entryRuleBProperties"
    // InternalSecureUML2SQL.g:103:1: entryRuleBProperties : ruleBProperties EOF ;
    public final void entryRuleBProperties() throws RecognitionException {
        try {
            // InternalSecureUML2SQL.g:104:1: ( ruleBProperties EOF )
            // InternalSecureUML2SQL.g:105:1: ruleBProperties EOF
            {
             before(grammarAccess.getBPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleBProperties();

            state._fsp--;

             after(grammarAccess.getBPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBProperties"


    // $ANTLR start "ruleBProperties"
    // InternalSecureUML2SQL.g:112:1: ruleBProperties : ( ( rule__BProperties__Group__0 ) ) ;
    public final void ruleBProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:116:2: ( ( ( rule__BProperties__Group__0 ) ) )
            // InternalSecureUML2SQL.g:117:2: ( ( rule__BProperties__Group__0 ) )
            {
            // InternalSecureUML2SQL.g:117:2: ( ( rule__BProperties__Group__0 ) )
            // InternalSecureUML2SQL.g:118:3: ( rule__BProperties__Group__0 )
            {
             before(grammarAccess.getBPropertiesAccess().getGroup()); 
            // InternalSecureUML2SQL.g:119:3: ( rule__BProperties__Group__0 )
            // InternalSecureUML2SQL.g:119:4: rule__BProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBProperties"


    // $ANTLR start "entryRuleBTuple"
    // InternalSecureUML2SQL.g:128:1: entryRuleBTuple : ruleBTuple EOF ;
    public final void entryRuleBTuple() throws RecognitionException {
        try {
            // InternalSecureUML2SQL.g:129:1: ( ruleBTuple EOF )
            // InternalSecureUML2SQL.g:130:1: ruleBTuple EOF
            {
             before(grammarAccess.getBTupleRule()); 
            pushFollow(FOLLOW_1);
            ruleBTuple();

            state._fsp--;

             after(grammarAccess.getBTupleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTuple"


    // $ANTLR start "ruleBTuple"
    // InternalSecureUML2SQL.g:137:1: ruleBTuple : ( ( rule__BTuple__Group__0 ) ) ;
    public final void ruleBTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:141:2: ( ( ( rule__BTuple__Group__0 ) ) )
            // InternalSecureUML2SQL.g:142:2: ( ( rule__BTuple__Group__0 ) )
            {
            // InternalSecureUML2SQL.g:142:2: ( ( rule__BTuple__Group__0 ) )
            // InternalSecureUML2SQL.g:143:3: ( rule__BTuple__Group__0 )
            {
             before(grammarAccess.getBTupleAccess().getGroup()); 
            // InternalSecureUML2SQL.g:144:3: ( rule__BTuple__Group__0 )
            // InternalSecureUML2SQL.g:144:4: rule__BTuple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BTuple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBTupleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTuple"


    // $ANTLR start "entryRuleBESet"
    // InternalSecureUML2SQL.g:153:1: entryRuleBESet : ruleBESet EOF ;
    public final void entryRuleBESet() throws RecognitionException {
        try {
            // InternalSecureUML2SQL.g:154:1: ( ruleBESet EOF )
            // InternalSecureUML2SQL.g:155:1: ruleBESet EOF
            {
             before(grammarAccess.getBESetRule()); 
            pushFollow(FOLLOW_1);
            ruleBESet();

            state._fsp--;

             after(grammarAccess.getBESetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBESet"


    // $ANTLR start "ruleBESet"
    // InternalSecureUML2SQL.g:162:1: ruleBESet : ( ( rule__BESet__Group__0 ) ) ;
    public final void ruleBESet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:166:2: ( ( ( rule__BESet__Group__0 ) ) )
            // InternalSecureUML2SQL.g:167:2: ( ( rule__BESet__Group__0 ) )
            {
            // InternalSecureUML2SQL.g:167:2: ( ( rule__BESet__Group__0 ) )
            // InternalSecureUML2SQL.g:168:3: ( rule__BESet__Group__0 )
            {
             before(grammarAccess.getBESetAccess().getGroup()); 
            // InternalSecureUML2SQL.g:169:3: ( rule__BESet__Group__0 )
            // InternalSecureUML2SQL.g:169:4: rule__BESet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BESet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBESetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBESet"


    // $ANTLR start "entryRuleBSetValue"
    // InternalSecureUML2SQL.g:178:1: entryRuleBSetValue : ruleBSetValue EOF ;
    public final void entryRuleBSetValue() throws RecognitionException {
        try {
            // InternalSecureUML2SQL.g:179:1: ( ruleBSetValue EOF )
            // InternalSecureUML2SQL.g:180:1: ruleBSetValue EOF
            {
             before(grammarAccess.getBSetValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBSetValue();

            state._fsp--;

             after(grammarAccess.getBSetValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSetValue"


    // $ANTLR start "ruleBSetValue"
    // InternalSecureUML2SQL.g:187:1: ruleBSetValue : ( ( rule__BSetValue__Value_nameAssignment ) ) ;
    public final void ruleBSetValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:191:2: ( ( ( rule__BSetValue__Value_nameAssignment ) ) )
            // InternalSecureUML2SQL.g:192:2: ( ( rule__BSetValue__Value_nameAssignment ) )
            {
            // InternalSecureUML2SQL.g:192:2: ( ( rule__BSetValue__Value_nameAssignment ) )
            // InternalSecureUML2SQL.g:193:3: ( rule__BSetValue__Value_nameAssignment )
            {
             before(grammarAccess.getBSetValueAccess().getValue_nameAssignment()); 
            // InternalSecureUML2SQL.g:194:3: ( rule__BSetValue__Value_nameAssignment )
            // InternalSecureUML2SQL.g:194:4: rule__BSetValue__Value_nameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BSetValue__Value_nameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBSetValueAccess().getValue_nameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSetValue"


    // $ANTLR start "entryRuleBConstant"
    // InternalSecureUML2SQL.g:203:1: entryRuleBConstant : ruleBConstant EOF ;
    public final void entryRuleBConstant() throws RecognitionException {
        try {
            // InternalSecureUML2SQL.g:204:1: ( ruleBConstant EOF )
            // InternalSecureUML2SQL.g:205:1: ruleBConstant EOF
            {
             before(grammarAccess.getBConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleBConstant();

            state._fsp--;

             after(grammarAccess.getBConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBConstant"


    // $ANTLR start "ruleBConstant"
    // InternalSecureUML2SQL.g:212:1: ruleBConstant : ( ( rule__BConstant__Constant_nameAssignment ) ) ;
    public final void ruleBConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:216:2: ( ( ( rule__BConstant__Constant_nameAssignment ) ) )
            // InternalSecureUML2SQL.g:217:2: ( ( rule__BConstant__Constant_nameAssignment ) )
            {
            // InternalSecureUML2SQL.g:217:2: ( ( rule__BConstant__Constant_nameAssignment ) )
            // InternalSecureUML2SQL.g:218:3: ( rule__BConstant__Constant_nameAssignment )
            {
             before(grammarAccess.getBConstantAccess().getConstant_nameAssignment()); 
            // InternalSecureUML2SQL.g:219:3: ( rule__BConstant__Constant_nameAssignment )
            // InternalSecureUML2SQL.g:219:4: rule__BConstant__Constant_nameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BConstant__Constant_nameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBConstantAccess().getConstant_nameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBConstant"


    // $ANTLR start "rule__BMachine__Group__0"
    // InternalSecureUML2SQL.g:227:1: rule__BMachine__Group__0 : rule__BMachine__Group__0__Impl rule__BMachine__Group__1 ;
    public final void rule__BMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:231:1: ( rule__BMachine__Group__0__Impl rule__BMachine__Group__1 )
            // InternalSecureUML2SQL.g:232:2: rule__BMachine__Group__0__Impl rule__BMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__0"


    // $ANTLR start "rule__BMachine__Group__0__Impl"
    // InternalSecureUML2SQL.g:239:1: rule__BMachine__Group__0__Impl : ( 'MACHINE' ) ;
    public final void rule__BMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:243:1: ( ( 'MACHINE' ) )
            // InternalSecureUML2SQL.g:244:1: ( 'MACHINE' )
            {
            // InternalSecureUML2SQL.g:244:1: ( 'MACHINE' )
            // InternalSecureUML2SQL.g:245:2: 'MACHINE'
            {
             before(grammarAccess.getBMachineAccess().getMACHINEKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getMACHINEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__0__Impl"


    // $ANTLR start "rule__BMachine__Group__1"
    // InternalSecureUML2SQL.g:254:1: rule__BMachine__Group__1 : rule__BMachine__Group__1__Impl rule__BMachine__Group__2 ;
    public final void rule__BMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:258:1: ( rule__BMachine__Group__1__Impl rule__BMachine__Group__2 )
            // InternalSecureUML2SQL.g:259:2: rule__BMachine__Group__1__Impl rule__BMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__1"


    // $ANTLR start "rule__BMachine__Group__1__Impl"
    // InternalSecureUML2SQL.g:266:1: rule__BMachine__Group__1__Impl : ( ( rule__BMachine__M_nameAssignment_1 ) ) ;
    public final void rule__BMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:270:1: ( ( ( rule__BMachine__M_nameAssignment_1 ) ) )
            // InternalSecureUML2SQL.g:271:1: ( ( rule__BMachine__M_nameAssignment_1 ) )
            {
            // InternalSecureUML2SQL.g:271:1: ( ( rule__BMachine__M_nameAssignment_1 ) )
            // InternalSecureUML2SQL.g:272:2: ( rule__BMachine__M_nameAssignment_1 )
            {
             before(grammarAccess.getBMachineAccess().getM_nameAssignment_1()); 
            // InternalSecureUML2SQL.g:273:2: ( rule__BMachine__M_nameAssignment_1 )
            // InternalSecureUML2SQL.g:273:3: rule__BMachine__M_nameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__M_nameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getM_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__1__Impl"


    // $ANTLR start "rule__BMachine__Group__2"
    // InternalSecureUML2SQL.g:281:1: rule__BMachine__Group__2 : rule__BMachine__Group__2__Impl rule__BMachine__Group__3 ;
    public final void rule__BMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:285:1: ( rule__BMachine__Group__2__Impl rule__BMachine__Group__3 )
            // InternalSecureUML2SQL.g:286:2: rule__BMachine__Group__2__Impl rule__BMachine__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__2"


    // $ANTLR start "rule__BMachine__Group__2__Impl"
    // InternalSecureUML2SQL.g:293:1: rule__BMachine__Group__2__Impl : ( 'SETS' ) ;
    public final void rule__BMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:297:1: ( ( 'SETS' ) )
            // InternalSecureUML2SQL.g:298:1: ( 'SETS' )
            {
            // InternalSecureUML2SQL.g:298:1: ( 'SETS' )
            // InternalSecureUML2SQL.g:299:2: 'SETS'
            {
             before(grammarAccess.getBMachineAccess().getSETSKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getSETSKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__2__Impl"


    // $ANTLR start "rule__BMachine__Group__3"
    // InternalSecureUML2SQL.g:308:1: rule__BMachine__Group__3 : rule__BMachine__Group__3__Impl rule__BMachine__Group__4 ;
    public final void rule__BMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:312:1: ( rule__BMachine__Group__3__Impl rule__BMachine__Group__4 )
            // InternalSecureUML2SQL.g:313:2: rule__BMachine__Group__3__Impl rule__BMachine__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__BMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__3"


    // $ANTLR start "rule__BMachine__Group__3__Impl"
    // InternalSecureUML2SQL.g:320:1: rule__BMachine__Group__3__Impl : ( ( rule__BMachine__EsetsAssignment_3 ) ) ;
    public final void rule__BMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:324:1: ( ( ( rule__BMachine__EsetsAssignment_3 ) ) )
            // InternalSecureUML2SQL.g:325:1: ( ( rule__BMachine__EsetsAssignment_3 ) )
            {
            // InternalSecureUML2SQL.g:325:1: ( ( rule__BMachine__EsetsAssignment_3 ) )
            // InternalSecureUML2SQL.g:326:2: ( rule__BMachine__EsetsAssignment_3 )
            {
             before(grammarAccess.getBMachineAccess().getEsetsAssignment_3()); 
            // InternalSecureUML2SQL.g:327:2: ( rule__BMachine__EsetsAssignment_3 )
            // InternalSecureUML2SQL.g:327:3: rule__BMachine__EsetsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__EsetsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getEsetsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__3__Impl"


    // $ANTLR start "rule__BMachine__Group__4"
    // InternalSecureUML2SQL.g:335:1: rule__BMachine__Group__4 : rule__BMachine__Group__4__Impl rule__BMachine__Group__5 ;
    public final void rule__BMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:339:1: ( rule__BMachine__Group__4__Impl rule__BMachine__Group__5 )
            // InternalSecureUML2SQL.g:340:2: rule__BMachine__Group__4__Impl rule__BMachine__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__BMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__4"


    // $ANTLR start "rule__BMachine__Group__4__Impl"
    // InternalSecureUML2SQL.g:347:1: rule__BMachine__Group__4__Impl : ( ( rule__BMachine__Group_4__0 )* ) ;
    public final void rule__BMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:351:1: ( ( ( rule__BMachine__Group_4__0 )* ) )
            // InternalSecureUML2SQL.g:352:1: ( ( rule__BMachine__Group_4__0 )* )
            {
            // InternalSecureUML2SQL.g:352:1: ( ( rule__BMachine__Group_4__0 )* )
            // InternalSecureUML2SQL.g:353:2: ( rule__BMachine__Group_4__0 )*
            {
             before(grammarAccess.getBMachineAccess().getGroup_4()); 
            // InternalSecureUML2SQL.g:354:2: ( rule__BMachine__Group_4__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:354:3: rule__BMachine__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__BMachine__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBMachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__4__Impl"


    // $ANTLR start "rule__BMachine__Group__5"
    // InternalSecureUML2SQL.g:362:1: rule__BMachine__Group__5 : rule__BMachine__Group__5__Impl rule__BMachine__Group__6 ;
    public final void rule__BMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:366:1: ( rule__BMachine__Group__5__Impl rule__BMachine__Group__6 )
            // InternalSecureUML2SQL.g:367:2: rule__BMachine__Group__5__Impl rule__BMachine__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__5"


    // $ANTLR start "rule__BMachine__Group__5__Impl"
    // InternalSecureUML2SQL.g:374:1: rule__BMachine__Group__5__Impl : ( 'CONSTANTS' ) ;
    public final void rule__BMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:378:1: ( ( 'CONSTANTS' ) )
            // InternalSecureUML2SQL.g:379:1: ( 'CONSTANTS' )
            {
            // InternalSecureUML2SQL.g:379:1: ( 'CONSTANTS' )
            // InternalSecureUML2SQL.g:380:2: 'CONSTANTS'
            {
             before(grammarAccess.getBMachineAccess().getCONSTANTSKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getCONSTANTSKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__5__Impl"


    // $ANTLR start "rule__BMachine__Group__6"
    // InternalSecureUML2SQL.g:389:1: rule__BMachine__Group__6 : rule__BMachine__Group__6__Impl rule__BMachine__Group__7 ;
    public final void rule__BMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:393:1: ( rule__BMachine__Group__6__Impl rule__BMachine__Group__7 )
            // InternalSecureUML2SQL.g:394:2: rule__BMachine__Group__6__Impl rule__BMachine__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__BMachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__6"


    // $ANTLR start "rule__BMachine__Group__6__Impl"
    // InternalSecureUML2SQL.g:401:1: rule__BMachine__Group__6__Impl : ( ( rule__BMachine__ConsAssignment_6 ) ) ;
    public final void rule__BMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:405:1: ( ( ( rule__BMachine__ConsAssignment_6 ) ) )
            // InternalSecureUML2SQL.g:406:1: ( ( rule__BMachine__ConsAssignment_6 ) )
            {
            // InternalSecureUML2SQL.g:406:1: ( ( rule__BMachine__ConsAssignment_6 ) )
            // InternalSecureUML2SQL.g:407:2: ( rule__BMachine__ConsAssignment_6 )
            {
             before(grammarAccess.getBMachineAccess().getConsAssignment_6()); 
            // InternalSecureUML2SQL.g:408:2: ( rule__BMachine__ConsAssignment_6 )
            // InternalSecureUML2SQL.g:408:3: rule__BMachine__ConsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__ConsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getConsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__6__Impl"


    // $ANTLR start "rule__BMachine__Group__7"
    // InternalSecureUML2SQL.g:416:1: rule__BMachine__Group__7 : rule__BMachine__Group__7__Impl rule__BMachine__Group__8 ;
    public final void rule__BMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:420:1: ( rule__BMachine__Group__7__Impl rule__BMachine__Group__8 )
            // InternalSecureUML2SQL.g:421:2: rule__BMachine__Group__7__Impl rule__BMachine__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__BMachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__7"


    // $ANTLR start "rule__BMachine__Group__7__Impl"
    // InternalSecureUML2SQL.g:428:1: rule__BMachine__Group__7__Impl : ( ( rule__BMachine__Group_7__0 )* ) ;
    public final void rule__BMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:432:1: ( ( ( rule__BMachine__Group_7__0 )* ) )
            // InternalSecureUML2SQL.g:433:1: ( ( rule__BMachine__Group_7__0 )* )
            {
            // InternalSecureUML2SQL.g:433:1: ( ( rule__BMachine__Group_7__0 )* )
            // InternalSecureUML2SQL.g:434:2: ( rule__BMachine__Group_7__0 )*
            {
             before(grammarAccess.getBMachineAccess().getGroup_7()); 
            // InternalSecureUML2SQL.g:435:2: ( rule__BMachine__Group_7__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:435:3: rule__BMachine__Group_7__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BMachine__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getBMachineAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__7__Impl"


    // $ANTLR start "rule__BMachine__Group__8"
    // InternalSecureUML2SQL.g:443:1: rule__BMachine__Group__8 : rule__BMachine__Group__8__Impl rule__BMachine__Group__9 ;
    public final void rule__BMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:447:1: ( rule__BMachine__Group__8__Impl rule__BMachine__Group__9 )
            // InternalSecureUML2SQL.g:448:2: rule__BMachine__Group__8__Impl rule__BMachine__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__8"


    // $ANTLR start "rule__BMachine__Group__8__Impl"
    // InternalSecureUML2SQL.g:455:1: rule__BMachine__Group__8__Impl : ( 'PROPERTIES' ) ;
    public final void rule__BMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:459:1: ( ( 'PROPERTIES' ) )
            // InternalSecureUML2SQL.g:460:1: ( 'PROPERTIES' )
            {
            // InternalSecureUML2SQL.g:460:1: ( 'PROPERTIES' )
            // InternalSecureUML2SQL.g:461:2: 'PROPERTIES'
            {
             before(grammarAccess.getBMachineAccess().getPROPERTIESKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getPROPERTIESKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__8__Impl"


    // $ANTLR start "rule__BMachine__Group__9"
    // InternalSecureUML2SQL.g:470:1: rule__BMachine__Group__9 : rule__BMachine__Group__9__Impl rule__BMachine__Group__10 ;
    public final void rule__BMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:474:1: ( rule__BMachine__Group__9__Impl rule__BMachine__Group__10 )
            // InternalSecureUML2SQL.g:475:2: rule__BMachine__Group__9__Impl rule__BMachine__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__BMachine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__9"


    // $ANTLR start "rule__BMachine__Group__9__Impl"
    // InternalSecureUML2SQL.g:482:1: rule__BMachine__Group__9__Impl : ( ( rule__BMachine__ProsAssignment_9 ) ) ;
    public final void rule__BMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:486:1: ( ( ( rule__BMachine__ProsAssignment_9 ) ) )
            // InternalSecureUML2SQL.g:487:1: ( ( rule__BMachine__ProsAssignment_9 ) )
            {
            // InternalSecureUML2SQL.g:487:1: ( ( rule__BMachine__ProsAssignment_9 ) )
            // InternalSecureUML2SQL.g:488:2: ( rule__BMachine__ProsAssignment_9 )
            {
             before(grammarAccess.getBMachineAccess().getProsAssignment_9()); 
            // InternalSecureUML2SQL.g:489:2: ( rule__BMachine__ProsAssignment_9 )
            // InternalSecureUML2SQL.g:489:3: rule__BMachine__ProsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__ProsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getProsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__9__Impl"


    // $ANTLR start "rule__BMachine__Group__10"
    // InternalSecureUML2SQL.g:497:1: rule__BMachine__Group__10 : rule__BMachine__Group__10__Impl rule__BMachine__Group__11 ;
    public final void rule__BMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:501:1: ( rule__BMachine__Group__10__Impl rule__BMachine__Group__11 )
            // InternalSecureUML2SQL.g:502:2: rule__BMachine__Group__10__Impl rule__BMachine__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__BMachine__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__10"


    // $ANTLR start "rule__BMachine__Group__10__Impl"
    // InternalSecureUML2SQL.g:509:1: rule__BMachine__Group__10__Impl : ( ( rule__BMachine__Group_10__0 )* ) ;
    public final void rule__BMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:513:1: ( ( ( rule__BMachine__Group_10__0 )* ) )
            // InternalSecureUML2SQL.g:514:1: ( ( rule__BMachine__Group_10__0 )* )
            {
            // InternalSecureUML2SQL.g:514:1: ( ( rule__BMachine__Group_10__0 )* )
            // InternalSecureUML2SQL.g:515:2: ( rule__BMachine__Group_10__0 )*
            {
             before(grammarAccess.getBMachineAccess().getGroup_10()); 
            // InternalSecureUML2SQL.g:516:2: ( rule__BMachine__Group_10__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:516:3: rule__BMachine__Group_10__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BMachine__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBMachineAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__10__Impl"


    // $ANTLR start "rule__BMachine__Group__11"
    // InternalSecureUML2SQL.g:524:1: rule__BMachine__Group__11 : rule__BMachine__Group__11__Impl ;
    public final void rule__BMachine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:528:1: ( rule__BMachine__Group__11__Impl )
            // InternalSecureUML2SQL.g:529:2: rule__BMachine__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__11"


    // $ANTLR start "rule__BMachine__Group__11__Impl"
    // InternalSecureUML2SQL.g:535:1: rule__BMachine__Group__11__Impl : ( 'END' ) ;
    public final void rule__BMachine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:539:1: ( ( 'END' ) )
            // InternalSecureUML2SQL.g:540:1: ( 'END' )
            {
            // InternalSecureUML2SQL.g:540:1: ( 'END' )
            // InternalSecureUML2SQL.g:541:2: 'END'
            {
             before(grammarAccess.getBMachineAccess().getENDKeyword_11()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getENDKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group__11__Impl"


    // $ANTLR start "rule__BMachine__Group_4__0"
    // InternalSecureUML2SQL.g:551:1: rule__BMachine__Group_4__0 : rule__BMachine__Group_4__0__Impl rule__BMachine__Group_4__1 ;
    public final void rule__BMachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:555:1: ( rule__BMachine__Group_4__0__Impl rule__BMachine__Group_4__1 )
            // InternalSecureUML2SQL.g:556:2: rule__BMachine__Group_4__0__Impl rule__BMachine__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_4__0"


    // $ANTLR start "rule__BMachine__Group_4__0__Impl"
    // InternalSecureUML2SQL.g:563:1: rule__BMachine__Group_4__0__Impl : ( ';' ) ;
    public final void rule__BMachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:567:1: ( ( ';' ) )
            // InternalSecureUML2SQL.g:568:1: ( ';' )
            {
            // InternalSecureUML2SQL.g:568:1: ( ';' )
            // InternalSecureUML2SQL.g:569:2: ';'
            {
             before(grammarAccess.getBMachineAccess().getSemicolonKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getSemicolonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_4__0__Impl"


    // $ANTLR start "rule__BMachine__Group_4__1"
    // InternalSecureUML2SQL.g:578:1: rule__BMachine__Group_4__1 : rule__BMachine__Group_4__1__Impl ;
    public final void rule__BMachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:582:1: ( rule__BMachine__Group_4__1__Impl )
            // InternalSecureUML2SQL.g:583:2: rule__BMachine__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_4__1"


    // $ANTLR start "rule__BMachine__Group_4__1__Impl"
    // InternalSecureUML2SQL.g:589:1: rule__BMachine__Group_4__1__Impl : ( ( rule__BMachine__EsetsAssignment_4_1 ) ) ;
    public final void rule__BMachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:593:1: ( ( ( rule__BMachine__EsetsAssignment_4_1 ) ) )
            // InternalSecureUML2SQL.g:594:1: ( ( rule__BMachine__EsetsAssignment_4_1 ) )
            {
            // InternalSecureUML2SQL.g:594:1: ( ( rule__BMachine__EsetsAssignment_4_1 ) )
            // InternalSecureUML2SQL.g:595:2: ( rule__BMachine__EsetsAssignment_4_1 )
            {
             before(grammarAccess.getBMachineAccess().getEsetsAssignment_4_1()); 
            // InternalSecureUML2SQL.g:596:2: ( rule__BMachine__EsetsAssignment_4_1 )
            // InternalSecureUML2SQL.g:596:3: rule__BMachine__EsetsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__EsetsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getEsetsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_4__1__Impl"


    // $ANTLR start "rule__BMachine__Group_7__0"
    // InternalSecureUML2SQL.g:605:1: rule__BMachine__Group_7__0 : rule__BMachine__Group_7__0__Impl rule__BMachine__Group_7__1 ;
    public final void rule__BMachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:609:1: ( rule__BMachine__Group_7__0__Impl rule__BMachine__Group_7__1 )
            // InternalSecureUML2SQL.g:610:2: rule__BMachine__Group_7__0__Impl rule__BMachine__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_7__0"


    // $ANTLR start "rule__BMachine__Group_7__0__Impl"
    // InternalSecureUML2SQL.g:617:1: rule__BMachine__Group_7__0__Impl : ( ',' ) ;
    public final void rule__BMachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:621:1: ( ( ',' ) )
            // InternalSecureUML2SQL.g:622:1: ( ',' )
            {
            // InternalSecureUML2SQL.g:622:1: ( ',' )
            // InternalSecureUML2SQL.g:623:2: ','
            {
             before(grammarAccess.getBMachineAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_7__0__Impl"


    // $ANTLR start "rule__BMachine__Group_7__1"
    // InternalSecureUML2SQL.g:632:1: rule__BMachine__Group_7__1 : rule__BMachine__Group_7__1__Impl ;
    public final void rule__BMachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:636:1: ( rule__BMachine__Group_7__1__Impl )
            // InternalSecureUML2SQL.g:637:2: rule__BMachine__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_7__1"


    // $ANTLR start "rule__BMachine__Group_7__1__Impl"
    // InternalSecureUML2SQL.g:643:1: rule__BMachine__Group_7__1__Impl : ( ( rule__BMachine__ConsAssignment_7_1 ) ) ;
    public final void rule__BMachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:647:1: ( ( ( rule__BMachine__ConsAssignment_7_1 ) ) )
            // InternalSecureUML2SQL.g:648:1: ( ( rule__BMachine__ConsAssignment_7_1 ) )
            {
            // InternalSecureUML2SQL.g:648:1: ( ( rule__BMachine__ConsAssignment_7_1 ) )
            // InternalSecureUML2SQL.g:649:2: ( rule__BMachine__ConsAssignment_7_1 )
            {
             before(grammarAccess.getBMachineAccess().getConsAssignment_7_1()); 
            // InternalSecureUML2SQL.g:650:2: ( rule__BMachine__ConsAssignment_7_1 )
            // InternalSecureUML2SQL.g:650:3: rule__BMachine__ConsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__ConsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getConsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_7__1__Impl"


    // $ANTLR start "rule__BMachine__Group_10__0"
    // InternalSecureUML2SQL.g:659:1: rule__BMachine__Group_10__0 : rule__BMachine__Group_10__0__Impl rule__BMachine__Group_10__1 ;
    public final void rule__BMachine__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:663:1: ( rule__BMachine__Group_10__0__Impl rule__BMachine__Group_10__1 )
            // InternalSecureUML2SQL.g:664:2: rule__BMachine__Group_10__0__Impl rule__BMachine__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_10__0"


    // $ANTLR start "rule__BMachine__Group_10__0__Impl"
    // InternalSecureUML2SQL.g:671:1: rule__BMachine__Group_10__0__Impl : ( '&' ) ;
    public final void rule__BMachine__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:675:1: ( ( '&' ) )
            // InternalSecureUML2SQL.g:676:1: ( '&' )
            {
            // InternalSecureUML2SQL.g:676:1: ( '&' )
            // InternalSecureUML2SQL.g:677:2: '&'
            {
             before(grammarAccess.getBMachineAccess().getAmpersandKeyword_10_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getAmpersandKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_10__0__Impl"


    // $ANTLR start "rule__BMachine__Group_10__1"
    // InternalSecureUML2SQL.g:686:1: rule__BMachine__Group_10__1 : rule__BMachine__Group_10__1__Impl ;
    public final void rule__BMachine__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:690:1: ( rule__BMachine__Group_10__1__Impl )
            // InternalSecureUML2SQL.g:691:2: rule__BMachine__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_10__1"


    // $ANTLR start "rule__BMachine__Group_10__1__Impl"
    // InternalSecureUML2SQL.g:697:1: rule__BMachine__Group_10__1__Impl : ( ( rule__BMachine__ProsAssignment_10_1 ) ) ;
    public final void rule__BMachine__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:701:1: ( ( ( rule__BMachine__ProsAssignment_10_1 ) ) )
            // InternalSecureUML2SQL.g:702:1: ( ( rule__BMachine__ProsAssignment_10_1 ) )
            {
            // InternalSecureUML2SQL.g:702:1: ( ( rule__BMachine__ProsAssignment_10_1 ) )
            // InternalSecureUML2SQL.g:703:2: ( rule__BMachine__ProsAssignment_10_1 )
            {
             before(grammarAccess.getBMachineAccess().getProsAssignment_10_1()); 
            // InternalSecureUML2SQL.g:704:2: ( rule__BMachine__ProsAssignment_10_1 )
            // InternalSecureUML2SQL.g:704:3: rule__BMachine__ProsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__ProsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getProsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__Group_10__1__Impl"


    // $ANTLR start "rule__BProperties__Group__0"
    // InternalSecureUML2SQL.g:713:1: rule__BProperties__Group__0 : rule__BProperties__Group__0__Impl rule__BProperties__Group__1 ;
    public final void rule__BProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:717:1: ( rule__BProperties__Group__0__Impl rule__BProperties__Group__1 )
            // InternalSecureUML2SQL.g:718:2: rule__BProperties__Group__0__Impl rule__BProperties__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__BProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__0"


    // $ANTLR start "rule__BProperties__Group__0__Impl"
    // InternalSecureUML2SQL.g:725:1: rule__BProperties__Group__0__Impl : ( ( rule__BProperties__ConsAssignment_0 ) ) ;
    public final void rule__BProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:729:1: ( ( ( rule__BProperties__ConsAssignment_0 ) ) )
            // InternalSecureUML2SQL.g:730:1: ( ( rule__BProperties__ConsAssignment_0 ) )
            {
            // InternalSecureUML2SQL.g:730:1: ( ( rule__BProperties__ConsAssignment_0 ) )
            // InternalSecureUML2SQL.g:731:2: ( rule__BProperties__ConsAssignment_0 )
            {
             before(grammarAccess.getBPropertiesAccess().getConsAssignment_0()); 
            // InternalSecureUML2SQL.g:732:2: ( rule__BProperties__ConsAssignment_0 )
            // InternalSecureUML2SQL.g:732:3: rule__BProperties__ConsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BProperties__ConsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBPropertiesAccess().getConsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__0__Impl"


    // $ANTLR start "rule__BProperties__Group__1"
    // InternalSecureUML2SQL.g:740:1: rule__BProperties__Group__1 : rule__BProperties__Group__1__Impl rule__BProperties__Group__2 ;
    public final void rule__BProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:744:1: ( rule__BProperties__Group__1__Impl rule__BProperties__Group__2 )
            // InternalSecureUML2SQL.g:745:2: rule__BProperties__Group__1__Impl rule__BProperties__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BProperties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__1"


    // $ANTLR start "rule__BProperties__Group__1__Impl"
    // InternalSecureUML2SQL.g:752:1: rule__BProperties__Group__1__Impl : ( '=' ) ;
    public final void rule__BProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:756:1: ( ( '=' ) )
            // InternalSecureUML2SQL.g:757:1: ( '=' )
            {
            // InternalSecureUML2SQL.g:757:1: ( '=' )
            // InternalSecureUML2SQL.g:758:2: '='
            {
             before(grammarAccess.getBPropertiesAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBPropertiesAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__1__Impl"


    // $ANTLR start "rule__BProperties__Group__2"
    // InternalSecureUML2SQL.g:767:1: rule__BProperties__Group__2 : rule__BProperties__Group__2__Impl rule__BProperties__Group__3 ;
    public final void rule__BProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:771:1: ( rule__BProperties__Group__2__Impl rule__BProperties__Group__3 )
            // InternalSecureUML2SQL.g:772:2: rule__BProperties__Group__2__Impl rule__BProperties__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__BProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BProperties__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__2"


    // $ANTLR start "rule__BProperties__Group__2__Impl"
    // InternalSecureUML2SQL.g:779:1: rule__BProperties__Group__2__Impl : ( ( rule__BProperties__PropAssignment_2 ) ) ;
    public final void rule__BProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:783:1: ( ( ( rule__BProperties__PropAssignment_2 ) ) )
            // InternalSecureUML2SQL.g:784:1: ( ( rule__BProperties__PropAssignment_2 ) )
            {
            // InternalSecureUML2SQL.g:784:1: ( ( rule__BProperties__PropAssignment_2 ) )
            // InternalSecureUML2SQL.g:785:2: ( rule__BProperties__PropAssignment_2 )
            {
             before(grammarAccess.getBPropertiesAccess().getPropAssignment_2()); 
            // InternalSecureUML2SQL.g:786:2: ( rule__BProperties__PropAssignment_2 )
            // InternalSecureUML2SQL.g:786:3: rule__BProperties__PropAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BProperties__PropAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBPropertiesAccess().getPropAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__2__Impl"


    // $ANTLR start "rule__BProperties__Group__3"
    // InternalSecureUML2SQL.g:794:1: rule__BProperties__Group__3 : rule__BProperties__Group__3__Impl rule__BProperties__Group__4 ;
    public final void rule__BProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:798:1: ( rule__BProperties__Group__3__Impl rule__BProperties__Group__4 )
            // InternalSecureUML2SQL.g:799:2: rule__BProperties__Group__3__Impl rule__BProperties__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__BProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BProperties__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__3"


    // $ANTLR start "rule__BProperties__Group__3__Impl"
    // InternalSecureUML2SQL.g:806:1: rule__BProperties__Group__3__Impl : ( ( rule__BProperties__PairsAssignment_3 ) ) ;
    public final void rule__BProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:810:1: ( ( ( rule__BProperties__PairsAssignment_3 ) ) )
            // InternalSecureUML2SQL.g:811:1: ( ( rule__BProperties__PairsAssignment_3 ) )
            {
            // InternalSecureUML2SQL.g:811:1: ( ( rule__BProperties__PairsAssignment_3 ) )
            // InternalSecureUML2SQL.g:812:2: ( rule__BProperties__PairsAssignment_3 )
            {
             before(grammarAccess.getBPropertiesAccess().getPairsAssignment_3()); 
            // InternalSecureUML2SQL.g:813:2: ( rule__BProperties__PairsAssignment_3 )
            // InternalSecureUML2SQL.g:813:3: rule__BProperties__PairsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BProperties__PairsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBPropertiesAccess().getPairsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__3__Impl"


    // $ANTLR start "rule__BProperties__Group__4"
    // InternalSecureUML2SQL.g:821:1: rule__BProperties__Group__4 : rule__BProperties__Group__4__Impl rule__BProperties__Group__5 ;
    public final void rule__BProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:825:1: ( rule__BProperties__Group__4__Impl rule__BProperties__Group__5 )
            // InternalSecureUML2SQL.g:826:2: rule__BProperties__Group__4__Impl rule__BProperties__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__BProperties__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BProperties__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__4"


    // $ANTLR start "rule__BProperties__Group__4__Impl"
    // InternalSecureUML2SQL.g:833:1: rule__BProperties__Group__4__Impl : ( ( rule__BProperties__Group_4__0 )* ) ;
    public final void rule__BProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:837:1: ( ( ( rule__BProperties__Group_4__0 )* ) )
            // InternalSecureUML2SQL.g:838:1: ( ( rule__BProperties__Group_4__0 )* )
            {
            // InternalSecureUML2SQL.g:838:1: ( ( rule__BProperties__Group_4__0 )* )
            // InternalSecureUML2SQL.g:839:2: ( rule__BProperties__Group_4__0 )*
            {
             before(grammarAccess.getBPropertiesAccess().getGroup_4()); 
            // InternalSecureUML2SQL.g:840:2: ( rule__BProperties__Group_4__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:840:3: rule__BProperties__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BProperties__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBPropertiesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__4__Impl"


    // $ANTLR start "rule__BProperties__Group__5"
    // InternalSecureUML2SQL.g:848:1: rule__BProperties__Group__5 : rule__BProperties__Group__5__Impl ;
    public final void rule__BProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:852:1: ( rule__BProperties__Group__5__Impl )
            // InternalSecureUML2SQL.g:853:2: rule__BProperties__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BProperties__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__5"


    // $ANTLR start "rule__BProperties__Group__5__Impl"
    // InternalSecureUML2SQL.g:859:1: rule__BProperties__Group__5__Impl : ( '}' ) ;
    public final void rule__BProperties__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:863:1: ( ( '}' ) )
            // InternalSecureUML2SQL.g:864:1: ( '}' )
            {
            // InternalSecureUML2SQL.g:864:1: ( '}' )
            // InternalSecureUML2SQL.g:865:2: '}'
            {
             before(grammarAccess.getBPropertiesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBPropertiesAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group__5__Impl"


    // $ANTLR start "rule__BProperties__Group_4__0"
    // InternalSecureUML2SQL.g:875:1: rule__BProperties__Group_4__0 : rule__BProperties__Group_4__0__Impl rule__BProperties__Group_4__1 ;
    public final void rule__BProperties__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:879:1: ( rule__BProperties__Group_4__0__Impl rule__BProperties__Group_4__1 )
            // InternalSecureUML2SQL.g:880:2: rule__BProperties__Group_4__0__Impl rule__BProperties__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__BProperties__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BProperties__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group_4__0"


    // $ANTLR start "rule__BProperties__Group_4__0__Impl"
    // InternalSecureUML2SQL.g:887:1: rule__BProperties__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BProperties__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:891:1: ( ( ',' ) )
            // InternalSecureUML2SQL.g:892:1: ( ',' )
            {
            // InternalSecureUML2SQL.g:892:1: ( ',' )
            // InternalSecureUML2SQL.g:893:2: ','
            {
             before(grammarAccess.getBPropertiesAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBPropertiesAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group_4__0__Impl"


    // $ANTLR start "rule__BProperties__Group_4__1"
    // InternalSecureUML2SQL.g:902:1: rule__BProperties__Group_4__1 : rule__BProperties__Group_4__1__Impl ;
    public final void rule__BProperties__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:906:1: ( rule__BProperties__Group_4__1__Impl )
            // InternalSecureUML2SQL.g:907:2: rule__BProperties__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BProperties__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group_4__1"


    // $ANTLR start "rule__BProperties__Group_4__1__Impl"
    // InternalSecureUML2SQL.g:913:1: rule__BProperties__Group_4__1__Impl : ( ( rule__BProperties__PairsAssignment_4_1 ) ) ;
    public final void rule__BProperties__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:917:1: ( ( ( rule__BProperties__PairsAssignment_4_1 ) ) )
            // InternalSecureUML2SQL.g:918:1: ( ( rule__BProperties__PairsAssignment_4_1 ) )
            {
            // InternalSecureUML2SQL.g:918:1: ( ( rule__BProperties__PairsAssignment_4_1 ) )
            // InternalSecureUML2SQL.g:919:2: ( rule__BProperties__PairsAssignment_4_1 )
            {
             before(grammarAccess.getBPropertiesAccess().getPairsAssignment_4_1()); 
            // InternalSecureUML2SQL.g:920:2: ( rule__BProperties__PairsAssignment_4_1 )
            // InternalSecureUML2SQL.g:920:3: rule__BProperties__PairsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BProperties__PairsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBPropertiesAccess().getPairsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__Group_4__1__Impl"


    // $ANTLR start "rule__BTuple__Group__0"
    // InternalSecureUML2SQL.g:929:1: rule__BTuple__Group__0 : rule__BTuple__Group__0__Impl rule__BTuple__Group__1 ;
    public final void rule__BTuple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:933:1: ( rule__BTuple__Group__0__Impl rule__BTuple__Group__1 )
            // InternalSecureUML2SQL.g:934:2: rule__BTuple__Group__0__Impl rule__BTuple__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__BTuple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BTuple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTuple__Group__0"


    // $ANTLR start "rule__BTuple__Group__0__Impl"
    // InternalSecureUML2SQL.g:941:1: rule__BTuple__Group__0__Impl : ( ( rule__BTuple__RanAssignment_0 ) ) ;
    public final void rule__BTuple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:945:1: ( ( ( rule__BTuple__RanAssignment_0 ) ) )
            // InternalSecureUML2SQL.g:946:1: ( ( rule__BTuple__RanAssignment_0 ) )
            {
            // InternalSecureUML2SQL.g:946:1: ( ( rule__BTuple__RanAssignment_0 ) )
            // InternalSecureUML2SQL.g:947:2: ( rule__BTuple__RanAssignment_0 )
            {
             before(grammarAccess.getBTupleAccess().getRanAssignment_0()); 
            // InternalSecureUML2SQL.g:948:2: ( rule__BTuple__RanAssignment_0 )
            // InternalSecureUML2SQL.g:948:3: rule__BTuple__RanAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BTuple__RanAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBTupleAccess().getRanAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTuple__Group__0__Impl"


    // $ANTLR start "rule__BTuple__Group__1"
    // InternalSecureUML2SQL.g:956:1: rule__BTuple__Group__1 : rule__BTuple__Group__1__Impl rule__BTuple__Group__2 ;
    public final void rule__BTuple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:960:1: ( rule__BTuple__Group__1__Impl rule__BTuple__Group__2 )
            // InternalSecureUML2SQL.g:961:2: rule__BTuple__Group__1__Impl rule__BTuple__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BTuple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BTuple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTuple__Group__1"


    // $ANTLR start "rule__BTuple__Group__1__Impl"
    // InternalSecureUML2SQL.g:968:1: rule__BTuple__Group__1__Impl : ( '|->' ) ;
    public final void rule__BTuple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:972:1: ( ( '|->' ) )
            // InternalSecureUML2SQL.g:973:1: ( '|->' )
            {
            // InternalSecureUML2SQL.g:973:1: ( '|->' )
            // InternalSecureUML2SQL.g:974:2: '|->'
            {
             before(grammarAccess.getBTupleAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBTupleAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTuple__Group__1__Impl"


    // $ANTLR start "rule__BTuple__Group__2"
    // InternalSecureUML2SQL.g:983:1: rule__BTuple__Group__2 : rule__BTuple__Group__2__Impl ;
    public final void rule__BTuple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:987:1: ( rule__BTuple__Group__2__Impl )
            // InternalSecureUML2SQL.g:988:2: rule__BTuple__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BTuple__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTuple__Group__2"


    // $ANTLR start "rule__BTuple__Group__2__Impl"
    // InternalSecureUML2SQL.g:994:1: rule__BTuple__Group__2__Impl : ( ( rule__BTuple__DomAssignment_2 ) ) ;
    public final void rule__BTuple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:998:1: ( ( ( rule__BTuple__DomAssignment_2 ) ) )
            // InternalSecureUML2SQL.g:999:1: ( ( rule__BTuple__DomAssignment_2 ) )
            {
            // InternalSecureUML2SQL.g:999:1: ( ( rule__BTuple__DomAssignment_2 ) )
            // InternalSecureUML2SQL.g:1000:2: ( rule__BTuple__DomAssignment_2 )
            {
             before(grammarAccess.getBTupleAccess().getDomAssignment_2()); 
            // InternalSecureUML2SQL.g:1001:2: ( rule__BTuple__DomAssignment_2 )
            // InternalSecureUML2SQL.g:1001:3: rule__BTuple__DomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BTuple__DomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBTupleAccess().getDomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTuple__Group__2__Impl"


    // $ANTLR start "rule__BESet__Group__0"
    // InternalSecureUML2SQL.g:1010:1: rule__BESet__Group__0 : rule__BESet__Group__0__Impl rule__BESet__Group__1 ;
    public final void rule__BESet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1014:1: ( rule__BESet__Group__0__Impl rule__BESet__Group__1 )
            // InternalSecureUML2SQL.g:1015:2: rule__BESet__Group__0__Impl rule__BESet__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__BESet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BESet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__0"


    // $ANTLR start "rule__BESet__Group__0__Impl"
    // InternalSecureUML2SQL.g:1022:1: rule__BESet__Group__0__Impl : ( ( rule__BESet__Set_nameAssignment_0 ) ) ;
    public final void rule__BESet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1026:1: ( ( ( rule__BESet__Set_nameAssignment_0 ) ) )
            // InternalSecureUML2SQL.g:1027:1: ( ( rule__BESet__Set_nameAssignment_0 ) )
            {
            // InternalSecureUML2SQL.g:1027:1: ( ( rule__BESet__Set_nameAssignment_0 ) )
            // InternalSecureUML2SQL.g:1028:2: ( rule__BESet__Set_nameAssignment_0 )
            {
             before(grammarAccess.getBESetAccess().getSet_nameAssignment_0()); 
            // InternalSecureUML2SQL.g:1029:2: ( rule__BESet__Set_nameAssignment_0 )
            // InternalSecureUML2SQL.g:1029:3: rule__BESet__Set_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BESet__Set_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBESetAccess().getSet_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__0__Impl"


    // $ANTLR start "rule__BESet__Group__1"
    // InternalSecureUML2SQL.g:1037:1: rule__BESet__Group__1 : rule__BESet__Group__1__Impl rule__BESet__Group__2 ;
    public final void rule__BESet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1041:1: ( rule__BESet__Group__1__Impl rule__BESet__Group__2 )
            // InternalSecureUML2SQL.g:1042:2: rule__BESet__Group__1__Impl rule__BESet__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BESet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BESet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__1"


    // $ANTLR start "rule__BESet__Group__1__Impl"
    // InternalSecureUML2SQL.g:1049:1: rule__BESet__Group__1__Impl : ( '=' ) ;
    public final void rule__BESet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1053:1: ( ( '=' ) )
            // InternalSecureUML2SQL.g:1054:1: ( '=' )
            {
            // InternalSecureUML2SQL.g:1054:1: ( '=' )
            // InternalSecureUML2SQL.g:1055:2: '='
            {
             before(grammarAccess.getBESetAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBESetAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__1__Impl"


    // $ANTLR start "rule__BESet__Group__2"
    // InternalSecureUML2SQL.g:1064:1: rule__BESet__Group__2 : rule__BESet__Group__2__Impl rule__BESet__Group__3 ;
    public final void rule__BESet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1068:1: ( rule__BESet__Group__2__Impl rule__BESet__Group__3 )
            // InternalSecureUML2SQL.g:1069:2: rule__BESet__Group__2__Impl rule__BESet__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__BESet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BESet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__2"


    // $ANTLR start "rule__BESet__Group__2__Impl"
    // InternalSecureUML2SQL.g:1076:1: rule__BESet__Group__2__Impl : ( '{' ) ;
    public final void rule__BESet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1080:1: ( ( '{' ) )
            // InternalSecureUML2SQL.g:1081:1: ( '{' )
            {
            // InternalSecureUML2SQL.g:1081:1: ( '{' )
            // InternalSecureUML2SQL.g:1082:2: '{'
            {
             before(grammarAccess.getBESetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBESetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__2__Impl"


    // $ANTLR start "rule__BESet__Group__3"
    // InternalSecureUML2SQL.g:1091:1: rule__BESet__Group__3 : rule__BESet__Group__3__Impl rule__BESet__Group__4 ;
    public final void rule__BESet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1095:1: ( rule__BESet__Group__3__Impl rule__BESet__Group__4 )
            // InternalSecureUML2SQL.g:1096:2: rule__BESet__Group__3__Impl rule__BESet__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__BESet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BESet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__3"


    // $ANTLR start "rule__BESet__Group__3__Impl"
    // InternalSecureUML2SQL.g:1103:1: rule__BESet__Group__3__Impl : ( ( rule__BESet__ValuesAssignment_3 ) ) ;
    public final void rule__BESet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1107:1: ( ( ( rule__BESet__ValuesAssignment_3 ) ) )
            // InternalSecureUML2SQL.g:1108:1: ( ( rule__BESet__ValuesAssignment_3 ) )
            {
            // InternalSecureUML2SQL.g:1108:1: ( ( rule__BESet__ValuesAssignment_3 ) )
            // InternalSecureUML2SQL.g:1109:2: ( rule__BESet__ValuesAssignment_3 )
            {
             before(grammarAccess.getBESetAccess().getValuesAssignment_3()); 
            // InternalSecureUML2SQL.g:1110:2: ( rule__BESet__ValuesAssignment_3 )
            // InternalSecureUML2SQL.g:1110:3: rule__BESet__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BESet__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBESetAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__3__Impl"


    // $ANTLR start "rule__BESet__Group__4"
    // InternalSecureUML2SQL.g:1118:1: rule__BESet__Group__4 : rule__BESet__Group__4__Impl rule__BESet__Group__5 ;
    public final void rule__BESet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1122:1: ( rule__BESet__Group__4__Impl rule__BESet__Group__5 )
            // InternalSecureUML2SQL.g:1123:2: rule__BESet__Group__4__Impl rule__BESet__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__BESet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BESet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__4"


    // $ANTLR start "rule__BESet__Group__4__Impl"
    // InternalSecureUML2SQL.g:1130:1: rule__BESet__Group__4__Impl : ( ( rule__BESet__Group_4__0 )* ) ;
    public final void rule__BESet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1134:1: ( ( ( rule__BESet__Group_4__0 )* ) )
            // InternalSecureUML2SQL.g:1135:1: ( ( rule__BESet__Group_4__0 )* )
            {
            // InternalSecureUML2SQL.g:1135:1: ( ( rule__BESet__Group_4__0 )* )
            // InternalSecureUML2SQL.g:1136:2: ( rule__BESet__Group_4__0 )*
            {
             before(grammarAccess.getBESetAccess().getGroup_4()); 
            // InternalSecureUML2SQL.g:1137:2: ( rule__BESet__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:1137:3: rule__BESet__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BESet__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBESetAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__4__Impl"


    // $ANTLR start "rule__BESet__Group__5"
    // InternalSecureUML2SQL.g:1145:1: rule__BESet__Group__5 : rule__BESet__Group__5__Impl ;
    public final void rule__BESet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1149:1: ( rule__BESet__Group__5__Impl )
            // InternalSecureUML2SQL.g:1150:2: rule__BESet__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BESet__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__5"


    // $ANTLR start "rule__BESet__Group__5__Impl"
    // InternalSecureUML2SQL.g:1156:1: rule__BESet__Group__5__Impl : ( '}' ) ;
    public final void rule__BESet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1160:1: ( ( '}' ) )
            // InternalSecureUML2SQL.g:1161:1: ( '}' )
            {
            // InternalSecureUML2SQL.g:1161:1: ( '}' )
            // InternalSecureUML2SQL.g:1162:2: '}'
            {
             before(grammarAccess.getBESetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBESetAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group__5__Impl"


    // $ANTLR start "rule__BESet__Group_4__0"
    // InternalSecureUML2SQL.g:1172:1: rule__BESet__Group_4__0 : rule__BESet__Group_4__0__Impl rule__BESet__Group_4__1 ;
    public final void rule__BESet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1176:1: ( rule__BESet__Group_4__0__Impl rule__BESet__Group_4__1 )
            // InternalSecureUML2SQL.g:1177:2: rule__BESet__Group_4__0__Impl rule__BESet__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__BESet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BESet__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group_4__0"


    // $ANTLR start "rule__BESet__Group_4__0__Impl"
    // InternalSecureUML2SQL.g:1184:1: rule__BESet__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BESet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1188:1: ( ( ',' ) )
            // InternalSecureUML2SQL.g:1189:1: ( ',' )
            {
            // InternalSecureUML2SQL.g:1189:1: ( ',' )
            // InternalSecureUML2SQL.g:1190:2: ','
            {
             before(grammarAccess.getBESetAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBESetAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group_4__0__Impl"


    // $ANTLR start "rule__BESet__Group_4__1"
    // InternalSecureUML2SQL.g:1199:1: rule__BESet__Group_4__1 : rule__BESet__Group_4__1__Impl ;
    public final void rule__BESet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1203:1: ( rule__BESet__Group_4__1__Impl )
            // InternalSecureUML2SQL.g:1204:2: rule__BESet__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BESet__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group_4__1"


    // $ANTLR start "rule__BESet__Group_4__1__Impl"
    // InternalSecureUML2SQL.g:1210:1: rule__BESet__Group_4__1__Impl : ( ( rule__BESet__ValuesAssignment_4_1 ) ) ;
    public final void rule__BESet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1214:1: ( ( ( rule__BESet__ValuesAssignment_4_1 ) ) )
            // InternalSecureUML2SQL.g:1215:1: ( ( rule__BESet__ValuesAssignment_4_1 ) )
            {
            // InternalSecureUML2SQL.g:1215:1: ( ( rule__BESet__ValuesAssignment_4_1 ) )
            // InternalSecureUML2SQL.g:1216:2: ( rule__BESet__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getBESetAccess().getValuesAssignment_4_1()); 
            // InternalSecureUML2SQL.g:1217:2: ( rule__BESet__ValuesAssignment_4_1 )
            // InternalSecureUML2SQL.g:1217:3: rule__BESet__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BESet__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBESetAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Group_4__1__Impl"


    // $ANTLR start "rule__BMachine__M_nameAssignment_1"
    // InternalSecureUML2SQL.g:1226:1: rule__BMachine__M_nameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BMachine__M_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1230:1: ( ( RULE_ID ) )
            // InternalSecureUML2SQL.g:1231:2: ( RULE_ID )
            {
            // InternalSecureUML2SQL.g:1231:2: ( RULE_ID )
            // InternalSecureUML2SQL.g:1232:3: RULE_ID
            {
             before(grammarAccess.getBMachineAccess().getM_nameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getM_nameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__M_nameAssignment_1"


    // $ANTLR start "rule__BMachine__EsetsAssignment_3"
    // InternalSecureUML2SQL.g:1241:1: rule__BMachine__EsetsAssignment_3 : ( ruleBESet ) ;
    public final void rule__BMachine__EsetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1245:1: ( ( ruleBESet ) )
            // InternalSecureUML2SQL.g:1246:2: ( ruleBESet )
            {
            // InternalSecureUML2SQL.g:1246:2: ( ruleBESet )
            // InternalSecureUML2SQL.g:1247:3: ruleBESet
            {
             before(grammarAccess.getBMachineAccess().getEsetsBESetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBESet();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getEsetsBESetParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__EsetsAssignment_3"


    // $ANTLR start "rule__BMachine__EsetsAssignment_4_1"
    // InternalSecureUML2SQL.g:1256:1: rule__BMachine__EsetsAssignment_4_1 : ( ruleBESet ) ;
    public final void rule__BMachine__EsetsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1260:1: ( ( ruleBESet ) )
            // InternalSecureUML2SQL.g:1261:2: ( ruleBESet )
            {
            // InternalSecureUML2SQL.g:1261:2: ( ruleBESet )
            // InternalSecureUML2SQL.g:1262:3: ruleBESet
            {
             before(grammarAccess.getBMachineAccess().getEsetsBESetParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBESet();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getEsetsBESetParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__EsetsAssignment_4_1"


    // $ANTLR start "rule__BMachine__ConsAssignment_6"
    // InternalSecureUML2SQL.g:1271:1: rule__BMachine__ConsAssignment_6 : ( ruleBConstant ) ;
    public final void rule__BMachine__ConsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1275:1: ( ( ruleBConstant ) )
            // InternalSecureUML2SQL.g:1276:2: ( ruleBConstant )
            {
            // InternalSecureUML2SQL.g:1276:2: ( ruleBConstant )
            // InternalSecureUML2SQL.g:1277:3: ruleBConstant
            {
             before(grammarAccess.getBMachineAccess().getConsBConstantParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBConstant();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getConsBConstantParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__ConsAssignment_6"


    // $ANTLR start "rule__BMachine__ConsAssignment_7_1"
    // InternalSecureUML2SQL.g:1286:1: rule__BMachine__ConsAssignment_7_1 : ( ruleBConstant ) ;
    public final void rule__BMachine__ConsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1290:1: ( ( ruleBConstant ) )
            // InternalSecureUML2SQL.g:1291:2: ( ruleBConstant )
            {
            // InternalSecureUML2SQL.g:1291:2: ( ruleBConstant )
            // InternalSecureUML2SQL.g:1292:3: ruleBConstant
            {
             before(grammarAccess.getBMachineAccess().getConsBConstantParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBConstant();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getConsBConstantParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__ConsAssignment_7_1"


    // $ANTLR start "rule__BMachine__ProsAssignment_9"
    // InternalSecureUML2SQL.g:1301:1: rule__BMachine__ProsAssignment_9 : ( ruleBProperties ) ;
    public final void rule__BMachine__ProsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1305:1: ( ( ruleBProperties ) )
            // InternalSecureUML2SQL.g:1306:2: ( ruleBProperties )
            {
            // InternalSecureUML2SQL.g:1306:2: ( ruleBProperties )
            // InternalSecureUML2SQL.g:1307:3: ruleBProperties
            {
             before(grammarAccess.getBMachineAccess().getProsBPropertiesParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBProperties();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getProsBPropertiesParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__ProsAssignment_9"


    // $ANTLR start "rule__BMachine__ProsAssignment_10_1"
    // InternalSecureUML2SQL.g:1316:1: rule__BMachine__ProsAssignment_10_1 : ( ruleBProperties ) ;
    public final void rule__BMachine__ProsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1320:1: ( ( ruleBProperties ) )
            // InternalSecureUML2SQL.g:1321:2: ( ruleBProperties )
            {
            // InternalSecureUML2SQL.g:1321:2: ( ruleBProperties )
            // InternalSecureUML2SQL.g:1322:3: ruleBProperties
            {
             before(grammarAccess.getBMachineAccess().getProsBPropertiesParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBProperties();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getProsBPropertiesParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BMachine__ProsAssignment_10_1"


    // $ANTLR start "rule__BProperties__ConsAssignment_0"
    // InternalSecureUML2SQL.g:1331:1: rule__BProperties__ConsAssignment_0 : ( RULE_ID ) ;
    public final void rule__BProperties__ConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1335:1: ( ( RULE_ID ) )
            // InternalSecureUML2SQL.g:1336:2: ( RULE_ID )
            {
            // InternalSecureUML2SQL.g:1336:2: ( RULE_ID )
            // InternalSecureUML2SQL.g:1337:3: RULE_ID
            {
             before(grammarAccess.getBPropertiesAccess().getConsIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBPropertiesAccess().getConsIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__ConsAssignment_0"


    // $ANTLR start "rule__BProperties__PropAssignment_2"
    // InternalSecureUML2SQL.g:1346:1: rule__BProperties__PropAssignment_2 : ( ( '{' ) ) ;
    public final void rule__BProperties__PropAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1350:1: ( ( ( '{' ) ) )
            // InternalSecureUML2SQL.g:1351:2: ( ( '{' ) )
            {
            // InternalSecureUML2SQL.g:1351:2: ( ( '{' ) )
            // InternalSecureUML2SQL.g:1352:3: ( '{' )
            {
             before(grammarAccess.getBPropertiesAccess().getPropLeftCurlyBracketKeyword_2_0()); 
            // InternalSecureUML2SQL.g:1353:3: ( '{' )
            // InternalSecureUML2SQL.g:1354:4: '{'
            {
             before(grammarAccess.getBPropertiesAccess().getPropLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBPropertiesAccess().getPropLeftCurlyBracketKeyword_2_0()); 

            }

             after(grammarAccess.getBPropertiesAccess().getPropLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__PropAssignment_2"


    // $ANTLR start "rule__BProperties__PairsAssignment_3"
    // InternalSecureUML2SQL.g:1365:1: rule__BProperties__PairsAssignment_3 : ( ruleBTuple ) ;
    public final void rule__BProperties__PairsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1369:1: ( ( ruleBTuple ) )
            // InternalSecureUML2SQL.g:1370:2: ( ruleBTuple )
            {
            // InternalSecureUML2SQL.g:1370:2: ( ruleBTuple )
            // InternalSecureUML2SQL.g:1371:3: ruleBTuple
            {
             before(grammarAccess.getBPropertiesAccess().getPairsBTupleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBTuple();

            state._fsp--;

             after(grammarAccess.getBPropertiesAccess().getPairsBTupleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__PairsAssignment_3"


    // $ANTLR start "rule__BProperties__PairsAssignment_4_1"
    // InternalSecureUML2SQL.g:1380:1: rule__BProperties__PairsAssignment_4_1 : ( ruleBTuple ) ;
    public final void rule__BProperties__PairsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1384:1: ( ( ruleBTuple ) )
            // InternalSecureUML2SQL.g:1385:2: ( ruleBTuple )
            {
            // InternalSecureUML2SQL.g:1385:2: ( ruleBTuple )
            // InternalSecureUML2SQL.g:1386:3: ruleBTuple
            {
             before(grammarAccess.getBPropertiesAccess().getPairsBTupleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBTuple();

            state._fsp--;

             after(grammarAccess.getBPropertiesAccess().getPairsBTupleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BProperties__PairsAssignment_4_1"


    // $ANTLR start "rule__BTuple__RanAssignment_0"
    // InternalSecureUML2SQL.g:1395:1: rule__BTuple__RanAssignment_0 : ( RULE_ID ) ;
    public final void rule__BTuple__RanAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1399:1: ( ( RULE_ID ) )
            // InternalSecureUML2SQL.g:1400:2: ( RULE_ID )
            {
            // InternalSecureUML2SQL.g:1400:2: ( RULE_ID )
            // InternalSecureUML2SQL.g:1401:3: RULE_ID
            {
             before(grammarAccess.getBTupleAccess().getRanIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBTupleAccess().getRanIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTuple__RanAssignment_0"


    // $ANTLR start "rule__BTuple__DomAssignment_2"
    // InternalSecureUML2SQL.g:1410:1: rule__BTuple__DomAssignment_2 : ( RULE_ID ) ;
    public final void rule__BTuple__DomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1414:1: ( ( RULE_ID ) )
            // InternalSecureUML2SQL.g:1415:2: ( RULE_ID )
            {
            // InternalSecureUML2SQL.g:1415:2: ( RULE_ID )
            // InternalSecureUML2SQL.g:1416:3: RULE_ID
            {
             before(grammarAccess.getBTupleAccess().getDomIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBTupleAccess().getDomIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTuple__DomAssignment_2"


    // $ANTLR start "rule__BESet__Set_nameAssignment_0"
    // InternalSecureUML2SQL.g:1425:1: rule__BESet__Set_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BESet__Set_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1429:1: ( ( RULE_ID ) )
            // InternalSecureUML2SQL.g:1430:2: ( RULE_ID )
            {
            // InternalSecureUML2SQL.g:1430:2: ( RULE_ID )
            // InternalSecureUML2SQL.g:1431:3: RULE_ID
            {
             before(grammarAccess.getBESetAccess().getSet_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBESetAccess().getSet_nameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__Set_nameAssignment_0"


    // $ANTLR start "rule__BESet__ValuesAssignment_3"
    // InternalSecureUML2SQL.g:1440:1: rule__BESet__ValuesAssignment_3 : ( ruleBSetValue ) ;
    public final void rule__BESet__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1444:1: ( ( ruleBSetValue ) )
            // InternalSecureUML2SQL.g:1445:2: ( ruleBSetValue )
            {
            // InternalSecureUML2SQL.g:1445:2: ( ruleBSetValue )
            // InternalSecureUML2SQL.g:1446:3: ruleBSetValue
            {
             before(grammarAccess.getBESetAccess().getValuesBSetValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBSetValue();

            state._fsp--;

             after(grammarAccess.getBESetAccess().getValuesBSetValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__ValuesAssignment_3"


    // $ANTLR start "rule__BESet__ValuesAssignment_4_1"
    // InternalSecureUML2SQL.g:1455:1: rule__BESet__ValuesAssignment_4_1 : ( ruleBSetValue ) ;
    public final void rule__BESet__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1459:1: ( ( ruleBSetValue ) )
            // InternalSecureUML2SQL.g:1460:2: ( ruleBSetValue )
            {
            // InternalSecureUML2SQL.g:1460:2: ( ruleBSetValue )
            // InternalSecureUML2SQL.g:1461:3: ruleBSetValue
            {
             before(grammarAccess.getBESetAccess().getValuesBSetValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBSetValue();

            state._fsp--;

             after(grammarAccess.getBESetAccess().getValuesBSetValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BESet__ValuesAssignment_4_1"


    // $ANTLR start "rule__BSetValue__Value_nameAssignment"
    // InternalSecureUML2SQL.g:1470:1: rule__BSetValue__Value_nameAssignment : ( RULE_ID ) ;
    public final void rule__BSetValue__Value_nameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1474:1: ( ( RULE_ID ) )
            // InternalSecureUML2SQL.g:1475:2: ( RULE_ID )
            {
            // InternalSecureUML2SQL.g:1475:2: ( RULE_ID )
            // InternalSecureUML2SQL.g:1476:3: RULE_ID
            {
             before(grammarAccess.getBSetValueAccess().getValue_nameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSetValueAccess().getValue_nameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSetValue__Value_nameAssignment"


    // $ANTLR start "rule__BConstant__Constant_nameAssignment"
    // InternalSecureUML2SQL.g:1485:1: rule__BConstant__Constant_nameAssignment : ( RULE_ID ) ;
    public final void rule__BConstant__Constant_nameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2SQL.g:1489:1: ( ( RULE_ID ) )
            // InternalSecureUML2SQL.g:1490:2: ( RULE_ID )
            {
            // InternalSecureUML2SQL.g:1490:2: ( RULE_ID )
            // InternalSecureUML2SQL.g:1491:3: RULE_ID
            {
             before(grammarAccess.getBConstantAccess().getConstant_nameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBConstantAccess().getConstant_nameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BConstant__Constant_nameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});

}