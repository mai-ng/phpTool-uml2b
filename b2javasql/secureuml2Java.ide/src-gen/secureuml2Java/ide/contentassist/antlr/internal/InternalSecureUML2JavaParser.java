package secureuml2Java.ide.contentassist.antlr.internal;

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
import secureuml2Java.services.SecureUML2JavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecureUML2JavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-->'", "'+->'", "'<->'", "'MACHINE'", "'SEES'", "'VARIABLES'", "'INVARIANT'", "'INITIALISATION'", "'OPERATIONS'", "';'", "'END'", "','", "'&'", "'||'", "'('", "')'", "'='", "'PRE'", "'THEN'", "'<--'", "'IF'", "'ELSE'", "':='", "':'", "'dom'", "'{'", "'}'", "'|->'", "'<:'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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


        public InternalSecureUML2JavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSecureUML2JavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSecureUML2JavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSecureUML2Java.g"; }


    	private SecureUML2JavaGrammarAccess grammarAccess;

    	public void setGrammarAccess(SecureUML2JavaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSecureUML2Java"
    // InternalSecureUML2Java.g:53:1: entryRuleSecureUML2Java : ruleSecureUML2Java EOF ;
    public final void entryRuleSecureUML2Java() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:54:1: ( ruleSecureUML2Java EOF )
            // InternalSecureUML2Java.g:55:1: ruleSecureUML2Java EOF
            {
             before(grammarAccess.getSecureUML2JavaRule()); 
            pushFollow(FOLLOW_1);
            ruleSecureUML2Java();

            state._fsp--;

             after(grammarAccess.getSecureUML2JavaRule()); 
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
    // $ANTLR end "entryRuleSecureUML2Java"


    // $ANTLR start "ruleSecureUML2Java"
    // InternalSecureUML2Java.g:62:1: ruleSecureUML2Java : ( ruleBMachine ) ;
    public final void ruleSecureUML2Java() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:66:2: ( ( ruleBMachine ) )
            // InternalSecureUML2Java.g:67:2: ( ruleBMachine )
            {
            // InternalSecureUML2Java.g:67:2: ( ruleBMachine )
            // InternalSecureUML2Java.g:68:3: ruleBMachine
            {
             before(grammarAccess.getSecureUML2JavaAccess().getBMachineParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBMachine();

            state._fsp--;

             after(grammarAccess.getSecureUML2JavaAccess().getBMachineParserRuleCall()); 

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
    // $ANTLR end "ruleSecureUML2Java"


    // $ANTLR start "entryRuleBMachine"
    // InternalSecureUML2Java.g:78:1: entryRuleBMachine : ruleBMachine EOF ;
    public final void entryRuleBMachine() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:79:1: ( ruleBMachine EOF )
            // InternalSecureUML2Java.g:80:1: ruleBMachine EOF
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
    // InternalSecureUML2Java.g:87:1: ruleBMachine : ( ( rule__BMachine__Group__0 ) ) ;
    public final void ruleBMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:91:2: ( ( ( rule__BMachine__Group__0 ) ) )
            // InternalSecureUML2Java.g:92:2: ( ( rule__BMachine__Group__0 ) )
            {
            // InternalSecureUML2Java.g:92:2: ( ( rule__BMachine__Group__0 ) )
            // InternalSecureUML2Java.g:93:3: ( rule__BMachine__Group__0 )
            {
             before(grammarAccess.getBMachineAccess().getGroup()); 
            // InternalSecureUML2Java.g:94:3: ( rule__BMachine__Group__0 )
            // InternalSecureUML2Java.g:94:4: rule__BMachine__Group__0
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


    // $ANTLR start "entryRuleVoidOperation"
    // InternalSecureUML2Java.g:103:1: entryRuleVoidOperation : ruleVoidOperation EOF ;
    public final void entryRuleVoidOperation() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:104:1: ( ruleVoidOperation EOF )
            // InternalSecureUML2Java.g:105:1: ruleVoidOperation EOF
            {
             before(grammarAccess.getVoidOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleVoidOperation();

            state._fsp--;

             after(grammarAccess.getVoidOperationRule()); 
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
    // $ANTLR end "entryRuleVoidOperation"


    // $ANTLR start "ruleVoidOperation"
    // InternalSecureUML2Java.g:112:1: ruleVoidOperation : ( ( rule__VoidOperation__Group__0 ) ) ;
    public final void ruleVoidOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:116:2: ( ( ( rule__VoidOperation__Group__0 ) ) )
            // InternalSecureUML2Java.g:117:2: ( ( rule__VoidOperation__Group__0 ) )
            {
            // InternalSecureUML2Java.g:117:2: ( ( rule__VoidOperation__Group__0 ) )
            // InternalSecureUML2Java.g:118:3: ( rule__VoidOperation__Group__0 )
            {
             before(grammarAccess.getVoidOperationAccess().getGroup()); 
            // InternalSecureUML2Java.g:119:3: ( rule__VoidOperation__Group__0 )
            // InternalSecureUML2Java.g:119:4: rule__VoidOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleVoidOperation"


    // $ANTLR start "entryRuleStringOperation"
    // InternalSecureUML2Java.g:128:1: entryRuleStringOperation : ruleStringOperation EOF ;
    public final void entryRuleStringOperation() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:129:1: ( ruleStringOperation EOF )
            // InternalSecureUML2Java.g:130:1: ruleStringOperation EOF
            {
             before(grammarAccess.getStringOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleStringOperation();

            state._fsp--;

             after(grammarAccess.getStringOperationRule()); 
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
    // $ANTLR end "entryRuleStringOperation"


    // $ANTLR start "ruleStringOperation"
    // InternalSecureUML2Java.g:137:1: ruleStringOperation : ( ( rule__StringOperation__Group__0 ) ) ;
    public final void ruleStringOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:141:2: ( ( ( rule__StringOperation__Group__0 ) ) )
            // InternalSecureUML2Java.g:142:2: ( ( rule__StringOperation__Group__0 ) )
            {
            // InternalSecureUML2Java.g:142:2: ( ( rule__StringOperation__Group__0 ) )
            // InternalSecureUML2Java.g:143:3: ( rule__StringOperation__Group__0 )
            {
             before(grammarAccess.getStringOperationAccess().getGroup()); 
            // InternalSecureUML2Java.g:144:3: ( rule__StringOperation__Group__0 )
            // InternalSecureUML2Java.g:144:4: rule__StringOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleStringOperation"


    // $ANTLR start "entryRuleBSubstitution"
    // InternalSecureUML2Java.g:153:1: entryRuleBSubstitution : ruleBSubstitution EOF ;
    public final void entryRuleBSubstitution() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:154:1: ( ruleBSubstitution EOF )
            // InternalSecureUML2Java.g:155:1: ruleBSubstitution EOF
            {
             before(grammarAccess.getBSubstitutionRule()); 
            pushFollow(FOLLOW_1);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getBSubstitutionRule()); 
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
    // $ANTLR end "entryRuleBSubstitution"


    // $ANTLR start "ruleBSubstitution"
    // InternalSecureUML2Java.g:162:1: ruleBSubstitution : ( ( rule__BSubstitution__Group__0 ) ) ;
    public final void ruleBSubstitution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:166:2: ( ( ( rule__BSubstitution__Group__0 ) ) )
            // InternalSecureUML2Java.g:167:2: ( ( rule__BSubstitution__Group__0 ) )
            {
            // InternalSecureUML2Java.g:167:2: ( ( rule__BSubstitution__Group__0 ) )
            // InternalSecureUML2Java.g:168:3: ( rule__BSubstitution__Group__0 )
            {
             before(grammarAccess.getBSubstitutionAccess().getGroup()); 
            // InternalSecureUML2Java.g:169:3: ( rule__BSubstitution__Group__0 )
            // InternalSecureUML2Java.g:169:4: rule__BSubstitution__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BSubstitution__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBSubstitutionAccess().getGroup()); 

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
    // $ANTLR end "ruleBSubstitution"


    // $ANTLR start "entryRuleBPredicate"
    // InternalSecureUML2Java.g:178:1: entryRuleBPredicate : ruleBPredicate EOF ;
    public final void entryRuleBPredicate() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:179:1: ( ruleBPredicate EOF )
            // InternalSecureUML2Java.g:180:1: ruleBPredicate EOF
            {
             before(grammarAccess.getBPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBPredicateRule()); 
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
    // $ANTLR end "entryRuleBPredicate"


    // $ANTLR start "ruleBPredicate"
    // InternalSecureUML2Java.g:187:1: ruleBPredicate : ( ( rule__BPredicate__Group__0 ) ) ;
    public final void ruleBPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:191:2: ( ( ( rule__BPredicate__Group__0 ) ) )
            // InternalSecureUML2Java.g:192:2: ( ( rule__BPredicate__Group__0 ) )
            {
            // InternalSecureUML2Java.g:192:2: ( ( rule__BPredicate__Group__0 ) )
            // InternalSecureUML2Java.g:193:3: ( rule__BPredicate__Group__0 )
            {
             before(grammarAccess.getBPredicateAccess().getGroup()); 
            // InternalSecureUML2Java.g:194:3: ( rule__BPredicate__Group__0 )
            // InternalSecureUML2Java.g:194:4: rule__BPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBPredicateAccess().getGroup()); 

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
    // $ANTLR end "ruleBPredicate"


    // $ANTLR start "entryRuleBDom"
    // InternalSecureUML2Java.g:203:1: entryRuleBDom : ruleBDom EOF ;
    public final void entryRuleBDom() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:204:1: ( ruleBDom EOF )
            // InternalSecureUML2Java.g:205:1: ruleBDom EOF
            {
             before(grammarAccess.getBDomRule()); 
            pushFollow(FOLLOW_1);
            ruleBDom();

            state._fsp--;

             after(grammarAccess.getBDomRule()); 
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
    // $ANTLR end "entryRuleBDom"


    // $ANTLR start "ruleBDom"
    // InternalSecureUML2Java.g:212:1: ruleBDom : ( ( rule__BDom__Group__0 ) ) ;
    public final void ruleBDom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:216:2: ( ( ( rule__BDom__Group__0 ) ) )
            // InternalSecureUML2Java.g:217:2: ( ( rule__BDom__Group__0 ) )
            {
            // InternalSecureUML2Java.g:217:2: ( ( rule__BDom__Group__0 ) )
            // InternalSecureUML2Java.g:218:3: ( rule__BDom__Group__0 )
            {
             before(grammarAccess.getBDomAccess().getGroup()); 
            // InternalSecureUML2Java.g:219:3: ( rule__BDom__Group__0 )
            // InternalSecureUML2Java.g:219:4: rule__BDom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BDom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBDomAccess().getGroup()); 

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
    // $ANTLR end "ruleBDom"


    // $ANTLR start "entryRuleBParameter"
    // InternalSecureUML2Java.g:228:1: entryRuleBParameter : ruleBParameter EOF ;
    public final void entryRuleBParameter() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:229:1: ( ruleBParameter EOF )
            // InternalSecureUML2Java.g:230:1: ruleBParameter EOF
            {
             before(grammarAccess.getBParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleBParameter();

            state._fsp--;

             after(grammarAccess.getBParameterRule()); 
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
    // $ANTLR end "entryRuleBParameter"


    // $ANTLR start "ruleBParameter"
    // InternalSecureUML2Java.g:237:1: ruleBParameter : ( ( rule__BParameter__Group__0 ) ) ;
    public final void ruleBParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:241:2: ( ( ( rule__BParameter__Group__0 ) ) )
            // InternalSecureUML2Java.g:242:2: ( ( rule__BParameter__Group__0 ) )
            {
            // InternalSecureUML2Java.g:242:2: ( ( rule__BParameter__Group__0 ) )
            // InternalSecureUML2Java.g:243:3: ( rule__BParameter__Group__0 )
            {
             before(grammarAccess.getBParameterAccess().getGroup()); 
            // InternalSecureUML2Java.g:244:3: ( rule__BParameter__Group__0 )
            // InternalSecureUML2Java.g:244:4: rule__BParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleBParameter"


    // $ANTLR start "entryRuleBType"
    // InternalSecureUML2Java.g:253:1: entryRuleBType : ruleBType EOF ;
    public final void entryRuleBType() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:254:1: ( ruleBType EOF )
            // InternalSecureUML2Java.g:255:1: ruleBType EOF
            {
             before(grammarAccess.getBTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBType();

            state._fsp--;

             after(grammarAccess.getBTypeRule()); 
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
    // $ANTLR end "entryRuleBType"


    // $ANTLR start "ruleBType"
    // InternalSecureUML2Java.g:262:1: ruleBType : ( ( rule__BType__Type_nameAssignment ) ) ;
    public final void ruleBType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:266:2: ( ( ( rule__BType__Type_nameAssignment ) ) )
            // InternalSecureUML2Java.g:267:2: ( ( rule__BType__Type_nameAssignment ) )
            {
            // InternalSecureUML2Java.g:267:2: ( ( rule__BType__Type_nameAssignment ) )
            // InternalSecureUML2Java.g:268:3: ( rule__BType__Type_nameAssignment )
            {
             before(grammarAccess.getBTypeAccess().getType_nameAssignment()); 
            // InternalSecureUML2Java.g:269:3: ( rule__BType__Type_nameAssignment )
            // InternalSecureUML2Java.g:269:4: rule__BType__Type_nameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BType__Type_nameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBTypeAccess().getType_nameAssignment()); 

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
    // $ANTLR end "ruleBType"


    // $ANTLR start "entryRuleBInit"
    // InternalSecureUML2Java.g:278:1: entryRuleBInit : ruleBInit EOF ;
    public final void entryRuleBInit() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:279:1: ( ruleBInit EOF )
            // InternalSecureUML2Java.g:280:1: ruleBInit EOF
            {
             before(grammarAccess.getBInitRule()); 
            pushFollow(FOLLOW_1);
            ruleBInit();

            state._fsp--;

             after(grammarAccess.getBInitRule()); 
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
    // $ANTLR end "entryRuleBInit"


    // $ANTLR start "ruleBInit"
    // InternalSecureUML2Java.g:287:1: ruleBInit : ( ( rule__BInit__Group__0 ) ) ;
    public final void ruleBInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:291:2: ( ( ( rule__BInit__Group__0 ) ) )
            // InternalSecureUML2Java.g:292:2: ( ( rule__BInit__Group__0 ) )
            {
            // InternalSecureUML2Java.g:292:2: ( ( rule__BInit__Group__0 ) )
            // InternalSecureUML2Java.g:293:3: ( rule__BInit__Group__0 )
            {
             before(grammarAccess.getBInitAccess().getGroup()); 
            // InternalSecureUML2Java.g:294:3: ( rule__BInit__Group__0 )
            // InternalSecureUML2Java.g:294:4: rule__BInit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BInit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBInitAccess().getGroup()); 

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
    // $ANTLR end "ruleBInit"


    // $ANTLR start "entryRuleBTuple"
    // InternalSecureUML2Java.g:303:1: entryRuleBTuple : ruleBTuple EOF ;
    public final void entryRuleBTuple() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:304:1: ( ruleBTuple EOF )
            // InternalSecureUML2Java.g:305:1: ruleBTuple EOF
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
    // InternalSecureUML2Java.g:312:1: ruleBTuple : ( ( rule__BTuple__Group__0 ) ) ;
    public final void ruleBTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:316:2: ( ( ( rule__BTuple__Group__0 ) ) )
            // InternalSecureUML2Java.g:317:2: ( ( rule__BTuple__Group__0 ) )
            {
            // InternalSecureUML2Java.g:317:2: ( ( rule__BTuple__Group__0 ) )
            // InternalSecureUML2Java.g:318:3: ( rule__BTuple__Group__0 )
            {
             before(grammarAccess.getBTupleAccess().getGroup()); 
            // InternalSecureUML2Java.g:319:3: ( rule__BTuple__Group__0 )
            // InternalSecureUML2Java.g:319:4: rule__BTuple__Group__0
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


    // $ANTLR start "entryRuleBOperationCall"
    // InternalSecureUML2Java.g:328:1: entryRuleBOperationCall : ruleBOperationCall EOF ;
    public final void entryRuleBOperationCall() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:329:1: ( ruleBOperationCall EOF )
            // InternalSecureUML2Java.g:330:1: ruleBOperationCall EOF
            {
             before(grammarAccess.getBOperationCallRule()); 
            pushFollow(FOLLOW_1);
            ruleBOperationCall();

            state._fsp--;

             after(grammarAccess.getBOperationCallRule()); 
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
    // $ANTLR end "entryRuleBOperationCall"


    // $ANTLR start "ruleBOperationCall"
    // InternalSecureUML2Java.g:337:1: ruleBOperationCall : ( ( rule__BOperationCall__Group__0 ) ) ;
    public final void ruleBOperationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:341:2: ( ( ( rule__BOperationCall__Group__0 ) ) )
            // InternalSecureUML2Java.g:342:2: ( ( rule__BOperationCall__Group__0 ) )
            {
            // InternalSecureUML2Java.g:342:2: ( ( rule__BOperationCall__Group__0 ) )
            // InternalSecureUML2Java.g:343:3: ( rule__BOperationCall__Group__0 )
            {
             before(grammarAccess.getBOperationCallAccess().getGroup()); 
            // InternalSecureUML2Java.g:344:3: ( rule__BOperationCall__Group__0 )
            // InternalSecureUML2Java.g:344:4: rule__BOperationCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BOperationCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBOperationCallAccess().getGroup()); 

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
    // $ANTLR end "ruleBOperationCall"


    // $ANTLR start "entryRuleBInvariant"
    // InternalSecureUML2Java.g:353:1: entryRuleBInvariant : ruleBInvariant EOF ;
    public final void entryRuleBInvariant() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:354:1: ( ruleBInvariant EOF )
            // InternalSecureUML2Java.g:355:1: ruleBInvariant EOF
            {
             before(grammarAccess.getBInvariantRule()); 
            pushFollow(FOLLOW_1);
            ruleBInvariant();

            state._fsp--;

             after(grammarAccess.getBInvariantRule()); 
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
    // $ANTLR end "entryRuleBInvariant"


    // $ANTLR start "ruleBInvariant"
    // InternalSecureUML2Java.g:362:1: ruleBInvariant : ( ( rule__BInvariant__Alternatives ) ) ;
    public final void ruleBInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:366:2: ( ( ( rule__BInvariant__Alternatives ) ) )
            // InternalSecureUML2Java.g:367:2: ( ( rule__BInvariant__Alternatives ) )
            {
            // InternalSecureUML2Java.g:367:2: ( ( rule__BInvariant__Alternatives ) )
            // InternalSecureUML2Java.g:368:3: ( rule__BInvariant__Alternatives )
            {
             before(grammarAccess.getBInvariantAccess().getAlternatives()); 
            // InternalSecureUML2Java.g:369:3: ( rule__BInvariant__Alternatives )
            // InternalSecureUML2Java.g:369:4: rule__BInvariant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BInvariant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBInvariantAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBInvariant"


    // $ANTLR start "entryRuleBFunction"
    // InternalSecureUML2Java.g:378:1: entryRuleBFunction : ruleBFunction EOF ;
    public final void entryRuleBFunction() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:379:1: ( ruleBFunction EOF )
            // InternalSecureUML2Java.g:380:1: ruleBFunction EOF
            {
             before(grammarAccess.getBFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleBFunction();

            state._fsp--;

             after(grammarAccess.getBFunctionRule()); 
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
    // $ANTLR end "entryRuleBFunction"


    // $ANTLR start "ruleBFunction"
    // InternalSecureUML2Java.g:387:1: ruleBFunction : ( ( rule__BFunction__Group__0 ) ) ;
    public final void ruleBFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:391:2: ( ( ( rule__BFunction__Group__0 ) ) )
            // InternalSecureUML2Java.g:392:2: ( ( rule__BFunction__Group__0 ) )
            {
            // InternalSecureUML2Java.g:392:2: ( ( rule__BFunction__Group__0 ) )
            // InternalSecureUML2Java.g:393:3: ( rule__BFunction__Group__0 )
            {
             before(grammarAccess.getBFunctionAccess().getGroup()); 
            // InternalSecureUML2Java.g:394:3: ( rule__BFunction__Group__0 )
            // InternalSecureUML2Java.g:394:4: rule__BFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleBFunction"


    // $ANTLR start "entryRuleBVariable"
    // InternalSecureUML2Java.g:403:1: entryRuleBVariable : ruleBVariable EOF ;
    public final void entryRuleBVariable() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:404:1: ( ruleBVariable EOF )
            // InternalSecureUML2Java.g:405:1: ruleBVariable EOF
            {
             before(grammarAccess.getBVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleBVariable();

            state._fsp--;

             after(grammarAccess.getBVariableRule()); 
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
    // $ANTLR end "entryRuleBVariable"


    // $ANTLR start "ruleBVariable"
    // InternalSecureUML2Java.g:412:1: ruleBVariable : ( ( rule__BVariable__Var_nameAssignment ) ) ;
    public final void ruleBVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:416:2: ( ( ( rule__BVariable__Var_nameAssignment ) ) )
            // InternalSecureUML2Java.g:417:2: ( ( rule__BVariable__Var_nameAssignment ) )
            {
            // InternalSecureUML2Java.g:417:2: ( ( rule__BVariable__Var_nameAssignment ) )
            // InternalSecureUML2Java.g:418:3: ( rule__BVariable__Var_nameAssignment )
            {
             before(grammarAccess.getBVariableAccess().getVar_nameAssignment()); 
            // InternalSecureUML2Java.g:419:3: ( rule__BVariable__Var_nameAssignment )
            // InternalSecureUML2Java.g:419:4: rule__BVariable__Var_nameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BVariable__Var_nameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBVariableAccess().getVar_nameAssignment()); 

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
    // $ANTLR end "ruleBVariable"


    // $ANTLR start "entryRuleBSees"
    // InternalSecureUML2Java.g:428:1: entryRuleBSees : ruleBSees EOF ;
    public final void entryRuleBSees() throws RecognitionException {
        try {
            // InternalSecureUML2Java.g:429:1: ( ruleBSees EOF )
            // InternalSecureUML2Java.g:430:1: ruleBSees EOF
            {
             before(grammarAccess.getBSeesRule()); 
            pushFollow(FOLLOW_1);
            ruleBSees();

            state._fsp--;

             after(grammarAccess.getBSeesRule()); 
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
    // $ANTLR end "entryRuleBSees"


    // $ANTLR start "ruleBSees"
    // InternalSecureUML2Java.g:437:1: ruleBSees : ( ( rule__BSees__M_nameAssignment ) ) ;
    public final void ruleBSees() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:441:2: ( ( ( rule__BSees__M_nameAssignment ) ) )
            // InternalSecureUML2Java.g:442:2: ( ( rule__BSees__M_nameAssignment ) )
            {
            // InternalSecureUML2Java.g:442:2: ( ( rule__BSees__M_nameAssignment ) )
            // InternalSecureUML2Java.g:443:3: ( rule__BSees__M_nameAssignment )
            {
             before(grammarAccess.getBSeesAccess().getM_nameAssignment()); 
            // InternalSecureUML2Java.g:444:3: ( rule__BSees__M_nameAssignment )
            // InternalSecureUML2Java.g:444:4: rule__BSees__M_nameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BSees__M_nameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBSeesAccess().getM_nameAssignment()); 

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
    // $ANTLR end "ruleBSees"


    // $ANTLR start "rule__BSubstitution__SleftAlternatives_0_0"
    // InternalSecureUML2Java.g:452:1: rule__BSubstitution__SleftAlternatives_0_0 : ( ( ruleBType ) | ( ruleBOperationCall ) );
    public final void rule__BSubstitution__SleftAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:456:1: ( ( ruleBType ) | ( ruleBOperationCall ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==33) ) {
                    alt1=1;
                }
                else if ( (LA1_1==25) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSecureUML2Java.g:457:2: ( ruleBType )
                    {
                    // InternalSecureUML2Java.g:457:2: ( ruleBType )
                    // InternalSecureUML2Java.g:458:3: ruleBType
                    {
                     before(grammarAccess.getBSubstitutionAccess().getSleftBTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBType();

                    state._fsp--;

                     after(grammarAccess.getBSubstitutionAccess().getSleftBTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:463:2: ( ruleBOperationCall )
                    {
                    // InternalSecureUML2Java.g:463:2: ( ruleBOperationCall )
                    // InternalSecureUML2Java.g:464:3: ruleBOperationCall
                    {
                     before(grammarAccess.getBSubstitutionAccess().getSleftBOperationCallParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBOperationCall();

                    state._fsp--;

                     after(grammarAccess.getBSubstitutionAccess().getSleftBOperationCallParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BSubstitution__SleftAlternatives_0_0"


    // $ANTLR start "rule__BPredicate__PleftAlternatives_0_0"
    // InternalSecureUML2Java.g:473:1: rule__BPredicate__PleftAlternatives_0_0 : ( ( ruleBType ) | ( ruleBTuple ) );
    public final void rule__BPredicate__PleftAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:477:1: ( ( ruleBType ) | ( ruleBTuple ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==25||LA2_1==38) ) {
                    alt2=2;
                }
                else if ( (LA2_1==34) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSecureUML2Java.g:478:2: ( ruleBType )
                    {
                    // InternalSecureUML2Java.g:478:2: ( ruleBType )
                    // InternalSecureUML2Java.g:479:3: ruleBType
                    {
                     before(grammarAccess.getBPredicateAccess().getPleftBTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBType();

                    state._fsp--;

                     after(grammarAccess.getBPredicateAccess().getPleftBTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:484:2: ( ruleBTuple )
                    {
                    // InternalSecureUML2Java.g:484:2: ( ruleBTuple )
                    // InternalSecureUML2Java.g:485:3: ruleBTuple
                    {
                     before(grammarAccess.getBPredicateAccess().getPleftBTupleParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBTuple();

                    state._fsp--;

                     after(grammarAccess.getBPredicateAccess().getPleftBTupleParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BPredicate__PleftAlternatives_0_0"


    // $ANTLR start "rule__BPredicate__PrightAlternatives_2_0"
    // InternalSecureUML2Java.g:494:1: rule__BPredicate__PrightAlternatives_2_0 : ( ( ruleBDom ) | ( ruleBType ) );
    public final void rule__BPredicate__PrightAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:498:1: ( ( ruleBDom ) | ( ruleBType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSecureUML2Java.g:499:2: ( ruleBDom )
                    {
                    // InternalSecureUML2Java.g:499:2: ( ruleBDom )
                    // InternalSecureUML2Java.g:500:3: ruleBDom
                    {
                     before(grammarAccess.getBPredicateAccess().getPrightBDomParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBDom();

                    state._fsp--;

                     after(grammarAccess.getBPredicateAccess().getPrightBDomParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:505:2: ( ruleBType )
                    {
                    // InternalSecureUML2Java.g:505:2: ( ruleBType )
                    // InternalSecureUML2Java.g:506:3: ruleBType
                    {
                     before(grammarAccess.getBPredicateAccess().getPrightBTypeParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBType();

                    state._fsp--;

                     after(grammarAccess.getBPredicateAccess().getPrightBTypeParserRuleCall_2_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BPredicate__PrightAlternatives_2_0"


    // $ANTLR start "rule__BTuple__RanAlternatives_0_0"
    // InternalSecureUML2Java.g:515:1: rule__BTuple__RanAlternatives_0_0 : ( ( ruleBType ) | ( ruleBOperationCall ) );
    public final void rule__BTuple__RanAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:519:1: ( ( ruleBType ) | ( ruleBOperationCall ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=2;
                }
                else if ( (LA4_1==38) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSecureUML2Java.g:520:2: ( ruleBType )
                    {
                    // InternalSecureUML2Java.g:520:2: ( ruleBType )
                    // InternalSecureUML2Java.g:521:3: ruleBType
                    {
                     before(grammarAccess.getBTupleAccess().getRanBTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBType();

                    state._fsp--;

                     after(grammarAccess.getBTupleAccess().getRanBTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:526:2: ( ruleBOperationCall )
                    {
                    // InternalSecureUML2Java.g:526:2: ( ruleBOperationCall )
                    // InternalSecureUML2Java.g:527:3: ruleBOperationCall
                    {
                     before(grammarAccess.getBTupleAccess().getRanBOperationCallParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBOperationCall();

                    state._fsp--;

                     after(grammarAccess.getBTupleAccess().getRanBOperationCallParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BTuple__RanAlternatives_0_0"


    // $ANTLR start "rule__BInvariant__Alternatives"
    // InternalSecureUML2Java.g:536:1: rule__BInvariant__Alternatives : ( ( ( rule__BInvariant__Group_0__0 ) ) | ( ( rule__BInvariant__Group_1__0 ) ) );
    public final void rule__BInvariant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:540:1: ( ( ( rule__BInvariant__Group_0__0 ) ) | ( ( rule__BInvariant__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==34) ) {
                    alt5=1;
                }
                else if ( (LA5_1==39) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecureUML2Java.g:541:2: ( ( rule__BInvariant__Group_0__0 ) )
                    {
                    // InternalSecureUML2Java.g:541:2: ( ( rule__BInvariant__Group_0__0 ) )
                    // InternalSecureUML2Java.g:542:3: ( rule__BInvariant__Group_0__0 )
                    {
                     before(grammarAccess.getBInvariantAccess().getGroup_0()); 
                    // InternalSecureUML2Java.g:543:3: ( rule__BInvariant__Group_0__0 )
                    // InternalSecureUML2Java.g:543:4: rule__BInvariant__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BInvariant__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBInvariantAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:547:2: ( ( rule__BInvariant__Group_1__0 ) )
                    {
                    // InternalSecureUML2Java.g:547:2: ( ( rule__BInvariant__Group_1__0 ) )
                    // InternalSecureUML2Java.g:548:3: ( rule__BInvariant__Group_1__0 )
                    {
                     before(grammarAccess.getBInvariantAccess().getGroup_1()); 
                    // InternalSecureUML2Java.g:549:3: ( rule__BInvariant__Group_1__0 )
                    // InternalSecureUML2Java.g:549:4: rule__BInvariant__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BInvariant__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBInvariantAccess().getGroup_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BInvariant__Alternatives"


    // $ANTLR start "rule__BFunction__Alternatives_1"
    // InternalSecureUML2Java.g:557:1: rule__BFunction__Alternatives_1 : ( ( '-->' ) | ( '+->' ) | ( '<->' ) );
    public final void rule__BFunction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:561:1: ( ( '-->' ) | ( '+->' ) | ( '<->' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSecureUML2Java.g:562:2: ( '-->' )
                    {
                    // InternalSecureUML2Java.g:562:2: ( '-->' )
                    // InternalSecureUML2Java.g:563:3: '-->'
                    {
                     before(grammarAccess.getBFunctionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBFunctionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:568:2: ( '+->' )
                    {
                    // InternalSecureUML2Java.g:568:2: ( '+->' )
                    // InternalSecureUML2Java.g:569:3: '+->'
                    {
                     before(grammarAccess.getBFunctionAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBFunctionAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecureUML2Java.g:574:2: ( '<->' )
                    {
                    // InternalSecureUML2Java.g:574:2: ( '<->' )
                    // InternalSecureUML2Java.g:575:3: '<->'
                    {
                     before(grammarAccess.getBFunctionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBFunctionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BFunction__Alternatives_1"


    // $ANTLR start "rule__BMachine__Group__0"
    // InternalSecureUML2Java.g:584:1: rule__BMachine__Group__0 : rule__BMachine__Group__0__Impl rule__BMachine__Group__1 ;
    public final void rule__BMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:588:1: ( rule__BMachine__Group__0__Impl rule__BMachine__Group__1 )
            // InternalSecureUML2Java.g:589:2: rule__BMachine__Group__0__Impl rule__BMachine__Group__1
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
    // InternalSecureUML2Java.g:596:1: rule__BMachine__Group__0__Impl : ( 'MACHINE' ) ;
    public final void rule__BMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:600:1: ( ( 'MACHINE' ) )
            // InternalSecureUML2Java.g:601:1: ( 'MACHINE' )
            {
            // InternalSecureUML2Java.g:601:1: ( 'MACHINE' )
            // InternalSecureUML2Java.g:602:2: 'MACHINE'
            {
             before(grammarAccess.getBMachineAccess().getMACHINEKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSecureUML2Java.g:611:1: rule__BMachine__Group__1 : rule__BMachine__Group__1__Impl rule__BMachine__Group__2 ;
    public final void rule__BMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:615:1: ( rule__BMachine__Group__1__Impl rule__BMachine__Group__2 )
            // InternalSecureUML2Java.g:616:2: rule__BMachine__Group__1__Impl rule__BMachine__Group__2
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
    // InternalSecureUML2Java.g:623:1: rule__BMachine__Group__1__Impl : ( ( rule__BMachine__M_nameAssignment_1 ) ) ;
    public final void rule__BMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:627:1: ( ( ( rule__BMachine__M_nameAssignment_1 ) ) )
            // InternalSecureUML2Java.g:628:1: ( ( rule__BMachine__M_nameAssignment_1 ) )
            {
            // InternalSecureUML2Java.g:628:1: ( ( rule__BMachine__M_nameAssignment_1 ) )
            // InternalSecureUML2Java.g:629:2: ( rule__BMachine__M_nameAssignment_1 )
            {
             before(grammarAccess.getBMachineAccess().getM_nameAssignment_1()); 
            // InternalSecureUML2Java.g:630:2: ( rule__BMachine__M_nameAssignment_1 )
            // InternalSecureUML2Java.g:630:3: rule__BMachine__M_nameAssignment_1
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
    // InternalSecureUML2Java.g:638:1: rule__BMachine__Group__2 : rule__BMachine__Group__2__Impl rule__BMachine__Group__3 ;
    public final void rule__BMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:642:1: ( rule__BMachine__Group__2__Impl rule__BMachine__Group__3 )
            // InternalSecureUML2Java.g:643:2: rule__BMachine__Group__2__Impl rule__BMachine__Group__3
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
    // InternalSecureUML2Java.g:650:1: rule__BMachine__Group__2__Impl : ( 'SEES' ) ;
    public final void rule__BMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:654:1: ( ( 'SEES' ) )
            // InternalSecureUML2Java.g:655:1: ( 'SEES' )
            {
            // InternalSecureUML2Java.g:655:1: ( 'SEES' )
            // InternalSecureUML2Java.g:656:2: 'SEES'
            {
             before(grammarAccess.getBMachineAccess().getSEESKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getSEESKeyword_2()); 

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
    // InternalSecureUML2Java.g:665:1: rule__BMachine__Group__3 : rule__BMachine__Group__3__Impl rule__BMachine__Group__4 ;
    public final void rule__BMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:669:1: ( rule__BMachine__Group__3__Impl rule__BMachine__Group__4 )
            // InternalSecureUML2Java.g:670:2: rule__BMachine__Group__3__Impl rule__BMachine__Group__4
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
    // InternalSecureUML2Java.g:677:1: rule__BMachine__Group__3__Impl : ( ( rule__BMachine__SeesAssignment_3 ) ) ;
    public final void rule__BMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:681:1: ( ( ( rule__BMachine__SeesAssignment_3 ) ) )
            // InternalSecureUML2Java.g:682:1: ( ( rule__BMachine__SeesAssignment_3 ) )
            {
            // InternalSecureUML2Java.g:682:1: ( ( rule__BMachine__SeesAssignment_3 ) )
            // InternalSecureUML2Java.g:683:2: ( rule__BMachine__SeesAssignment_3 )
            {
             before(grammarAccess.getBMachineAccess().getSeesAssignment_3()); 
            // InternalSecureUML2Java.g:684:2: ( rule__BMachine__SeesAssignment_3 )
            // InternalSecureUML2Java.g:684:3: rule__BMachine__SeesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__SeesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getSeesAssignment_3()); 

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
    // InternalSecureUML2Java.g:692:1: rule__BMachine__Group__4 : rule__BMachine__Group__4__Impl rule__BMachine__Group__5 ;
    public final void rule__BMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:696:1: ( rule__BMachine__Group__4__Impl rule__BMachine__Group__5 )
            // InternalSecureUML2Java.g:697:2: rule__BMachine__Group__4__Impl rule__BMachine__Group__5
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
    // InternalSecureUML2Java.g:704:1: rule__BMachine__Group__4__Impl : ( ( rule__BMachine__Group_4__0 )* ) ;
    public final void rule__BMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:708:1: ( ( ( rule__BMachine__Group_4__0 )* ) )
            // InternalSecureUML2Java.g:709:1: ( ( rule__BMachine__Group_4__0 )* )
            {
            // InternalSecureUML2Java.g:709:1: ( ( rule__BMachine__Group_4__0 )* )
            // InternalSecureUML2Java.g:710:2: ( rule__BMachine__Group_4__0 )*
            {
             before(grammarAccess.getBMachineAccess().getGroup_4()); 
            // InternalSecureUML2Java.g:711:2: ( rule__BMachine__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSecureUML2Java.g:711:3: rule__BMachine__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__BMachine__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSecureUML2Java.g:719:1: rule__BMachine__Group__5 : rule__BMachine__Group__5__Impl rule__BMachine__Group__6 ;
    public final void rule__BMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:723:1: ( rule__BMachine__Group__5__Impl rule__BMachine__Group__6 )
            // InternalSecureUML2Java.g:724:2: rule__BMachine__Group__5__Impl rule__BMachine__Group__6
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
    // InternalSecureUML2Java.g:731:1: rule__BMachine__Group__5__Impl : ( 'VARIABLES' ) ;
    public final void rule__BMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:735:1: ( ( 'VARIABLES' ) )
            // InternalSecureUML2Java.g:736:1: ( 'VARIABLES' )
            {
            // InternalSecureUML2Java.g:736:1: ( 'VARIABLES' )
            // InternalSecureUML2Java.g:737:2: 'VARIABLES'
            {
             before(grammarAccess.getBMachineAccess().getVARIABLESKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getVARIABLESKeyword_5()); 

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
    // InternalSecureUML2Java.g:746:1: rule__BMachine__Group__6 : rule__BMachine__Group__6__Impl rule__BMachine__Group__7 ;
    public final void rule__BMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:750:1: ( rule__BMachine__Group__6__Impl rule__BMachine__Group__7 )
            // InternalSecureUML2Java.g:751:2: rule__BMachine__Group__6__Impl rule__BMachine__Group__7
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
    // InternalSecureUML2Java.g:758:1: rule__BMachine__Group__6__Impl : ( ( rule__BMachine__VarsAssignment_6 ) ) ;
    public final void rule__BMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:762:1: ( ( ( rule__BMachine__VarsAssignment_6 ) ) )
            // InternalSecureUML2Java.g:763:1: ( ( rule__BMachine__VarsAssignment_6 ) )
            {
            // InternalSecureUML2Java.g:763:1: ( ( rule__BMachine__VarsAssignment_6 ) )
            // InternalSecureUML2Java.g:764:2: ( rule__BMachine__VarsAssignment_6 )
            {
             before(grammarAccess.getBMachineAccess().getVarsAssignment_6()); 
            // InternalSecureUML2Java.g:765:2: ( rule__BMachine__VarsAssignment_6 )
            // InternalSecureUML2Java.g:765:3: rule__BMachine__VarsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__VarsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getVarsAssignment_6()); 

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
    // InternalSecureUML2Java.g:773:1: rule__BMachine__Group__7 : rule__BMachine__Group__7__Impl rule__BMachine__Group__8 ;
    public final void rule__BMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:777:1: ( rule__BMachine__Group__7__Impl rule__BMachine__Group__8 )
            // InternalSecureUML2Java.g:778:2: rule__BMachine__Group__7__Impl rule__BMachine__Group__8
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
    // InternalSecureUML2Java.g:785:1: rule__BMachine__Group__7__Impl : ( ( rule__BMachine__Group_7__0 )* ) ;
    public final void rule__BMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:789:1: ( ( ( rule__BMachine__Group_7__0 )* ) )
            // InternalSecureUML2Java.g:790:1: ( ( rule__BMachine__Group_7__0 )* )
            {
            // InternalSecureUML2Java.g:790:1: ( ( rule__BMachine__Group_7__0 )* )
            // InternalSecureUML2Java.g:791:2: ( rule__BMachine__Group_7__0 )*
            {
             before(grammarAccess.getBMachineAccess().getGroup_7()); 
            // InternalSecureUML2Java.g:792:2: ( rule__BMachine__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSecureUML2Java.g:792:3: rule__BMachine__Group_7__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__BMachine__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSecureUML2Java.g:800:1: rule__BMachine__Group__8 : rule__BMachine__Group__8__Impl rule__BMachine__Group__9 ;
    public final void rule__BMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:804:1: ( rule__BMachine__Group__8__Impl rule__BMachine__Group__9 )
            // InternalSecureUML2Java.g:805:2: rule__BMachine__Group__8__Impl rule__BMachine__Group__9
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
    // InternalSecureUML2Java.g:812:1: rule__BMachine__Group__8__Impl : ( 'INVARIANT' ) ;
    public final void rule__BMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:816:1: ( ( 'INVARIANT' ) )
            // InternalSecureUML2Java.g:817:1: ( 'INVARIANT' )
            {
            // InternalSecureUML2Java.g:817:1: ( 'INVARIANT' )
            // InternalSecureUML2Java.g:818:2: 'INVARIANT'
            {
             before(grammarAccess.getBMachineAccess().getINVARIANTKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getINVARIANTKeyword_8()); 

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
    // InternalSecureUML2Java.g:827:1: rule__BMachine__Group__9 : rule__BMachine__Group__9__Impl rule__BMachine__Group__10 ;
    public final void rule__BMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:831:1: ( rule__BMachine__Group__9__Impl rule__BMachine__Group__10 )
            // InternalSecureUML2Java.g:832:2: rule__BMachine__Group__9__Impl rule__BMachine__Group__10
            {
            pushFollow(FOLLOW_8);
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
    // InternalSecureUML2Java.g:839:1: rule__BMachine__Group__9__Impl : ( ( rule__BMachine__InvsAssignment_9 ) ) ;
    public final void rule__BMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:843:1: ( ( ( rule__BMachine__InvsAssignment_9 ) ) )
            // InternalSecureUML2Java.g:844:1: ( ( rule__BMachine__InvsAssignment_9 ) )
            {
            // InternalSecureUML2Java.g:844:1: ( ( rule__BMachine__InvsAssignment_9 ) )
            // InternalSecureUML2Java.g:845:2: ( rule__BMachine__InvsAssignment_9 )
            {
             before(grammarAccess.getBMachineAccess().getInvsAssignment_9()); 
            // InternalSecureUML2Java.g:846:2: ( rule__BMachine__InvsAssignment_9 )
            // InternalSecureUML2Java.g:846:3: rule__BMachine__InvsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__InvsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getInvsAssignment_9()); 

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
    // InternalSecureUML2Java.g:854:1: rule__BMachine__Group__10 : rule__BMachine__Group__10__Impl rule__BMachine__Group__11 ;
    public final void rule__BMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:858:1: ( rule__BMachine__Group__10__Impl rule__BMachine__Group__11 )
            // InternalSecureUML2Java.g:859:2: rule__BMachine__Group__10__Impl rule__BMachine__Group__11
            {
            pushFollow(FOLLOW_8);
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
    // InternalSecureUML2Java.g:866:1: rule__BMachine__Group__10__Impl : ( ( rule__BMachine__Group_10__0 )* ) ;
    public final void rule__BMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:870:1: ( ( ( rule__BMachine__Group_10__0 )* ) )
            // InternalSecureUML2Java.g:871:1: ( ( rule__BMachine__Group_10__0 )* )
            {
            // InternalSecureUML2Java.g:871:1: ( ( rule__BMachine__Group_10__0 )* )
            // InternalSecureUML2Java.g:872:2: ( rule__BMachine__Group_10__0 )*
            {
             before(grammarAccess.getBMachineAccess().getGroup_10()); 
            // InternalSecureUML2Java.g:873:2: ( rule__BMachine__Group_10__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSecureUML2Java.g:873:3: rule__BMachine__Group_10__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BMachine__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSecureUML2Java.g:881:1: rule__BMachine__Group__11 : rule__BMachine__Group__11__Impl rule__BMachine__Group__12 ;
    public final void rule__BMachine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:885:1: ( rule__BMachine__Group__11__Impl rule__BMachine__Group__12 )
            // InternalSecureUML2Java.g:886:2: rule__BMachine__Group__11__Impl rule__BMachine__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__12();

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
    // InternalSecureUML2Java.g:893:1: rule__BMachine__Group__11__Impl : ( 'INITIALISATION' ) ;
    public final void rule__BMachine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:897:1: ( ( 'INITIALISATION' ) )
            // InternalSecureUML2Java.g:898:1: ( 'INITIALISATION' )
            {
            // InternalSecureUML2Java.g:898:1: ( 'INITIALISATION' )
            // InternalSecureUML2Java.g:899:2: 'INITIALISATION'
            {
             before(grammarAccess.getBMachineAccess().getINITIALISATIONKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getINITIALISATIONKeyword_11()); 

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


    // $ANTLR start "rule__BMachine__Group__12"
    // InternalSecureUML2Java.g:908:1: rule__BMachine__Group__12 : rule__BMachine__Group__12__Impl rule__BMachine__Group__13 ;
    public final void rule__BMachine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:912:1: ( rule__BMachine__Group__12__Impl rule__BMachine__Group__13 )
            // InternalSecureUML2Java.g:913:2: rule__BMachine__Group__12__Impl rule__BMachine__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__BMachine__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__13();

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
    // $ANTLR end "rule__BMachine__Group__12"


    // $ANTLR start "rule__BMachine__Group__12__Impl"
    // InternalSecureUML2Java.g:920:1: rule__BMachine__Group__12__Impl : ( ( rule__BMachine__InitsAssignment_12 ) ) ;
    public final void rule__BMachine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:924:1: ( ( ( rule__BMachine__InitsAssignment_12 ) ) )
            // InternalSecureUML2Java.g:925:1: ( ( rule__BMachine__InitsAssignment_12 ) )
            {
            // InternalSecureUML2Java.g:925:1: ( ( rule__BMachine__InitsAssignment_12 ) )
            // InternalSecureUML2Java.g:926:2: ( rule__BMachine__InitsAssignment_12 )
            {
             before(grammarAccess.getBMachineAccess().getInitsAssignment_12()); 
            // InternalSecureUML2Java.g:927:2: ( rule__BMachine__InitsAssignment_12 )
            // InternalSecureUML2Java.g:927:3: rule__BMachine__InitsAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__InitsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getInitsAssignment_12()); 

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
    // $ANTLR end "rule__BMachine__Group__12__Impl"


    // $ANTLR start "rule__BMachine__Group__13"
    // InternalSecureUML2Java.g:935:1: rule__BMachine__Group__13 : rule__BMachine__Group__13__Impl rule__BMachine__Group__14 ;
    public final void rule__BMachine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:939:1: ( rule__BMachine__Group__13__Impl rule__BMachine__Group__14 )
            // InternalSecureUML2Java.g:940:2: rule__BMachine__Group__13__Impl rule__BMachine__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__BMachine__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__14();

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
    // $ANTLR end "rule__BMachine__Group__13"


    // $ANTLR start "rule__BMachine__Group__13__Impl"
    // InternalSecureUML2Java.g:947:1: rule__BMachine__Group__13__Impl : ( ( rule__BMachine__Group_13__0 )* ) ;
    public final void rule__BMachine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:951:1: ( ( ( rule__BMachine__Group_13__0 )* ) )
            // InternalSecureUML2Java.g:952:1: ( ( rule__BMachine__Group_13__0 )* )
            {
            // InternalSecureUML2Java.g:952:1: ( ( rule__BMachine__Group_13__0 )* )
            // InternalSecureUML2Java.g:953:2: ( rule__BMachine__Group_13__0 )*
            {
             before(grammarAccess.getBMachineAccess().getGroup_13()); 
            // InternalSecureUML2Java.g:954:2: ( rule__BMachine__Group_13__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSecureUML2Java.g:954:3: rule__BMachine__Group_13__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BMachine__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBMachineAccess().getGroup_13()); 

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
    // $ANTLR end "rule__BMachine__Group__13__Impl"


    // $ANTLR start "rule__BMachine__Group__14"
    // InternalSecureUML2Java.g:962:1: rule__BMachine__Group__14 : rule__BMachine__Group__14__Impl rule__BMachine__Group__15 ;
    public final void rule__BMachine__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:966:1: ( rule__BMachine__Group__14__Impl rule__BMachine__Group__15 )
            // InternalSecureUML2Java.g:967:2: rule__BMachine__Group__14__Impl rule__BMachine__Group__15
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__15();

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
    // $ANTLR end "rule__BMachine__Group__14"


    // $ANTLR start "rule__BMachine__Group__14__Impl"
    // InternalSecureUML2Java.g:974:1: rule__BMachine__Group__14__Impl : ( 'OPERATIONS' ) ;
    public final void rule__BMachine__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:978:1: ( ( 'OPERATIONS' ) )
            // InternalSecureUML2Java.g:979:1: ( 'OPERATIONS' )
            {
            // InternalSecureUML2Java.g:979:1: ( 'OPERATIONS' )
            // InternalSecureUML2Java.g:980:2: 'OPERATIONS'
            {
             before(grammarAccess.getBMachineAccess().getOPERATIONSKeyword_14()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getOPERATIONSKeyword_14()); 

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
    // $ANTLR end "rule__BMachine__Group__14__Impl"


    // $ANTLR start "rule__BMachine__Group__15"
    // InternalSecureUML2Java.g:989:1: rule__BMachine__Group__15 : rule__BMachine__Group__15__Impl rule__BMachine__Group__16 ;
    public final void rule__BMachine__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:993:1: ( rule__BMachine__Group__15__Impl rule__BMachine__Group__16 )
            // InternalSecureUML2Java.g:994:2: rule__BMachine__Group__15__Impl rule__BMachine__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__BMachine__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__16();

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
    // $ANTLR end "rule__BMachine__Group__15"


    // $ANTLR start "rule__BMachine__Group__15__Impl"
    // InternalSecureUML2Java.g:1001:1: rule__BMachine__Group__15__Impl : ( ( rule__BMachine__VopsAssignment_15 ) ) ;
    public final void rule__BMachine__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1005:1: ( ( ( rule__BMachine__VopsAssignment_15 ) ) )
            // InternalSecureUML2Java.g:1006:1: ( ( rule__BMachine__VopsAssignment_15 ) )
            {
            // InternalSecureUML2Java.g:1006:1: ( ( rule__BMachine__VopsAssignment_15 ) )
            // InternalSecureUML2Java.g:1007:2: ( rule__BMachine__VopsAssignment_15 )
            {
             before(grammarAccess.getBMachineAccess().getVopsAssignment_15()); 
            // InternalSecureUML2Java.g:1008:2: ( rule__BMachine__VopsAssignment_15 )
            // InternalSecureUML2Java.g:1008:3: rule__BMachine__VopsAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__VopsAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getVopsAssignment_15()); 

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
    // $ANTLR end "rule__BMachine__Group__15__Impl"


    // $ANTLR start "rule__BMachine__Group__16"
    // InternalSecureUML2Java.g:1016:1: rule__BMachine__Group__16 : rule__BMachine__Group__16__Impl rule__BMachine__Group__17 ;
    public final void rule__BMachine__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1020:1: ( rule__BMachine__Group__16__Impl rule__BMachine__Group__17 )
            // InternalSecureUML2Java.g:1021:2: rule__BMachine__Group__16__Impl rule__BMachine__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__BMachine__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__17();

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
    // $ANTLR end "rule__BMachine__Group__16"


    // $ANTLR start "rule__BMachine__Group__16__Impl"
    // InternalSecureUML2Java.g:1028:1: rule__BMachine__Group__16__Impl : ( ( rule__BMachine__Group_16__0 )* ) ;
    public final void rule__BMachine__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1032:1: ( ( ( rule__BMachine__Group_16__0 )* ) )
            // InternalSecureUML2Java.g:1033:1: ( ( rule__BMachine__Group_16__0 )* )
            {
            // InternalSecureUML2Java.g:1033:1: ( ( rule__BMachine__Group_16__0 )* )
            // InternalSecureUML2Java.g:1034:2: ( rule__BMachine__Group_16__0 )*
            {
             before(grammarAccess.getBMachineAccess().getGroup_16()); 
            // InternalSecureUML2Java.g:1035:2: ( rule__BMachine__Group_16__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        int LA11_2 = input.LA(3);

                        if ( (LA11_2==25) ) {
                            alt11=1;
                        }


                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalSecureUML2Java.g:1035:3: rule__BMachine__Group_16__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BMachine__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBMachineAccess().getGroup_16()); 

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
    // $ANTLR end "rule__BMachine__Group__16__Impl"


    // $ANTLR start "rule__BMachine__Group__17"
    // InternalSecureUML2Java.g:1043:1: rule__BMachine__Group__17 : rule__BMachine__Group__17__Impl rule__BMachine__Group__18 ;
    public final void rule__BMachine__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1047:1: ( rule__BMachine__Group__17__Impl rule__BMachine__Group__18 )
            // InternalSecureUML2Java.g:1048:2: rule__BMachine__Group__17__Impl rule__BMachine__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__18();

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
    // $ANTLR end "rule__BMachine__Group__17"


    // $ANTLR start "rule__BMachine__Group__17__Impl"
    // InternalSecureUML2Java.g:1055:1: rule__BMachine__Group__17__Impl : ( ';' ) ;
    public final void rule__BMachine__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1059:1: ( ( ';' ) )
            // InternalSecureUML2Java.g:1060:1: ( ';' )
            {
            // InternalSecureUML2Java.g:1060:1: ( ';' )
            // InternalSecureUML2Java.g:1061:2: ';'
            {
             before(grammarAccess.getBMachineAccess().getSemicolonKeyword_17()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getSemicolonKeyword_17()); 

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
    // $ANTLR end "rule__BMachine__Group__17__Impl"


    // $ANTLR start "rule__BMachine__Group__18"
    // InternalSecureUML2Java.g:1070:1: rule__BMachine__Group__18 : rule__BMachine__Group__18__Impl rule__BMachine__Group__19 ;
    public final void rule__BMachine__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1074:1: ( rule__BMachine__Group__18__Impl rule__BMachine__Group__19 )
            // InternalSecureUML2Java.g:1075:2: rule__BMachine__Group__18__Impl rule__BMachine__Group__19
            {
            pushFollow(FOLLOW_14);
            rule__BMachine__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__19();

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
    // $ANTLR end "rule__BMachine__Group__18"


    // $ANTLR start "rule__BMachine__Group__18__Impl"
    // InternalSecureUML2Java.g:1082:1: rule__BMachine__Group__18__Impl : ( ( rule__BMachine__SopsAssignment_18 ) ) ;
    public final void rule__BMachine__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1086:1: ( ( ( rule__BMachine__SopsAssignment_18 ) ) )
            // InternalSecureUML2Java.g:1087:1: ( ( rule__BMachine__SopsAssignment_18 ) )
            {
            // InternalSecureUML2Java.g:1087:1: ( ( rule__BMachine__SopsAssignment_18 ) )
            // InternalSecureUML2Java.g:1088:2: ( rule__BMachine__SopsAssignment_18 )
            {
             before(grammarAccess.getBMachineAccess().getSopsAssignment_18()); 
            // InternalSecureUML2Java.g:1089:2: ( rule__BMachine__SopsAssignment_18 )
            // InternalSecureUML2Java.g:1089:3: rule__BMachine__SopsAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__SopsAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getSopsAssignment_18()); 

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
    // $ANTLR end "rule__BMachine__Group__18__Impl"


    // $ANTLR start "rule__BMachine__Group__19"
    // InternalSecureUML2Java.g:1097:1: rule__BMachine__Group__19 : rule__BMachine__Group__19__Impl rule__BMachine__Group__20 ;
    public final void rule__BMachine__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1101:1: ( rule__BMachine__Group__19__Impl rule__BMachine__Group__20 )
            // InternalSecureUML2Java.g:1102:2: rule__BMachine__Group__19__Impl rule__BMachine__Group__20
            {
            pushFollow(FOLLOW_14);
            rule__BMachine__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group__20();

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
    // $ANTLR end "rule__BMachine__Group__19"


    // $ANTLR start "rule__BMachine__Group__19__Impl"
    // InternalSecureUML2Java.g:1109:1: rule__BMachine__Group__19__Impl : ( ( rule__BMachine__Group_19__0 )* ) ;
    public final void rule__BMachine__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1113:1: ( ( ( rule__BMachine__Group_19__0 )* ) )
            // InternalSecureUML2Java.g:1114:1: ( ( rule__BMachine__Group_19__0 )* )
            {
            // InternalSecureUML2Java.g:1114:1: ( ( rule__BMachine__Group_19__0 )* )
            // InternalSecureUML2Java.g:1115:2: ( rule__BMachine__Group_19__0 )*
            {
             before(grammarAccess.getBMachineAccess().getGroup_19()); 
            // InternalSecureUML2Java.g:1116:2: ( rule__BMachine__Group_19__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSecureUML2Java.g:1116:3: rule__BMachine__Group_19__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BMachine__Group_19__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBMachineAccess().getGroup_19()); 

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
    // $ANTLR end "rule__BMachine__Group__19__Impl"


    // $ANTLR start "rule__BMachine__Group__20"
    // InternalSecureUML2Java.g:1124:1: rule__BMachine__Group__20 : rule__BMachine__Group__20__Impl ;
    public final void rule__BMachine__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1128:1: ( rule__BMachine__Group__20__Impl )
            // InternalSecureUML2Java.g:1129:2: rule__BMachine__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__Group__20__Impl();

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
    // $ANTLR end "rule__BMachine__Group__20"


    // $ANTLR start "rule__BMachine__Group__20__Impl"
    // InternalSecureUML2Java.g:1135:1: rule__BMachine__Group__20__Impl : ( 'END' ) ;
    public final void rule__BMachine__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1139:1: ( ( 'END' ) )
            // InternalSecureUML2Java.g:1140:1: ( 'END' )
            {
            // InternalSecureUML2Java.g:1140:1: ( 'END' )
            // InternalSecureUML2Java.g:1141:2: 'END'
            {
             before(grammarAccess.getBMachineAccess().getENDKeyword_20()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getENDKeyword_20()); 

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
    // $ANTLR end "rule__BMachine__Group__20__Impl"


    // $ANTLR start "rule__BMachine__Group_4__0"
    // InternalSecureUML2Java.g:1151:1: rule__BMachine__Group_4__0 : rule__BMachine__Group_4__0__Impl rule__BMachine__Group_4__1 ;
    public final void rule__BMachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1155:1: ( rule__BMachine__Group_4__0__Impl rule__BMachine__Group_4__1 )
            // InternalSecureUML2Java.g:1156:2: rule__BMachine__Group_4__0__Impl rule__BMachine__Group_4__1
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
    // InternalSecureUML2Java.g:1163:1: rule__BMachine__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BMachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1167:1: ( ( ',' ) )
            // InternalSecureUML2Java.g:1168:1: ( ',' )
            {
            // InternalSecureUML2Java.g:1168:1: ( ',' )
            // InternalSecureUML2Java.g:1169:2: ','
            {
             before(grammarAccess.getBMachineAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getCommaKeyword_4_0()); 

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
    // InternalSecureUML2Java.g:1178:1: rule__BMachine__Group_4__1 : rule__BMachine__Group_4__1__Impl ;
    public final void rule__BMachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1182:1: ( rule__BMachine__Group_4__1__Impl )
            // InternalSecureUML2Java.g:1183:2: rule__BMachine__Group_4__1__Impl
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
    // InternalSecureUML2Java.g:1189:1: rule__BMachine__Group_4__1__Impl : ( ( rule__BMachine__SeesAssignment_4_1 ) ) ;
    public final void rule__BMachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1193:1: ( ( ( rule__BMachine__SeesAssignment_4_1 ) ) )
            // InternalSecureUML2Java.g:1194:1: ( ( rule__BMachine__SeesAssignment_4_1 ) )
            {
            // InternalSecureUML2Java.g:1194:1: ( ( rule__BMachine__SeesAssignment_4_1 ) )
            // InternalSecureUML2Java.g:1195:2: ( rule__BMachine__SeesAssignment_4_1 )
            {
             before(grammarAccess.getBMachineAccess().getSeesAssignment_4_1()); 
            // InternalSecureUML2Java.g:1196:2: ( rule__BMachine__SeesAssignment_4_1 )
            // InternalSecureUML2Java.g:1196:3: rule__BMachine__SeesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__SeesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getSeesAssignment_4_1()); 

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
    // InternalSecureUML2Java.g:1205:1: rule__BMachine__Group_7__0 : rule__BMachine__Group_7__0__Impl rule__BMachine__Group_7__1 ;
    public final void rule__BMachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1209:1: ( rule__BMachine__Group_7__0__Impl rule__BMachine__Group_7__1 )
            // InternalSecureUML2Java.g:1210:2: rule__BMachine__Group_7__0__Impl rule__BMachine__Group_7__1
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
    // InternalSecureUML2Java.g:1217:1: rule__BMachine__Group_7__0__Impl : ( ',' ) ;
    public final void rule__BMachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1221:1: ( ( ',' ) )
            // InternalSecureUML2Java.g:1222:1: ( ',' )
            {
            // InternalSecureUML2Java.g:1222:1: ( ',' )
            // InternalSecureUML2Java.g:1223:2: ','
            {
             before(grammarAccess.getBMachineAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSecureUML2Java.g:1232:1: rule__BMachine__Group_7__1 : rule__BMachine__Group_7__1__Impl ;
    public final void rule__BMachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1236:1: ( rule__BMachine__Group_7__1__Impl )
            // InternalSecureUML2Java.g:1237:2: rule__BMachine__Group_7__1__Impl
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
    // InternalSecureUML2Java.g:1243:1: rule__BMachine__Group_7__1__Impl : ( ( rule__BMachine__VarsAssignment_7_1 ) ) ;
    public final void rule__BMachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1247:1: ( ( ( rule__BMachine__VarsAssignment_7_1 ) ) )
            // InternalSecureUML2Java.g:1248:1: ( ( rule__BMachine__VarsAssignment_7_1 ) )
            {
            // InternalSecureUML2Java.g:1248:1: ( ( rule__BMachine__VarsAssignment_7_1 ) )
            // InternalSecureUML2Java.g:1249:2: ( rule__BMachine__VarsAssignment_7_1 )
            {
             before(grammarAccess.getBMachineAccess().getVarsAssignment_7_1()); 
            // InternalSecureUML2Java.g:1250:2: ( rule__BMachine__VarsAssignment_7_1 )
            // InternalSecureUML2Java.g:1250:3: rule__BMachine__VarsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__VarsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getVarsAssignment_7_1()); 

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
    // InternalSecureUML2Java.g:1259:1: rule__BMachine__Group_10__0 : rule__BMachine__Group_10__0__Impl rule__BMachine__Group_10__1 ;
    public final void rule__BMachine__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1263:1: ( rule__BMachine__Group_10__0__Impl rule__BMachine__Group_10__1 )
            // InternalSecureUML2Java.g:1264:2: rule__BMachine__Group_10__0__Impl rule__BMachine__Group_10__1
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
    // InternalSecureUML2Java.g:1271:1: rule__BMachine__Group_10__0__Impl : ( '&' ) ;
    public final void rule__BMachine__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1275:1: ( ( '&' ) )
            // InternalSecureUML2Java.g:1276:1: ( '&' )
            {
            // InternalSecureUML2Java.g:1276:1: ( '&' )
            // InternalSecureUML2Java.g:1277:2: '&'
            {
             before(grammarAccess.getBMachineAccess().getAmpersandKeyword_10_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSecureUML2Java.g:1286:1: rule__BMachine__Group_10__1 : rule__BMachine__Group_10__1__Impl ;
    public final void rule__BMachine__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1290:1: ( rule__BMachine__Group_10__1__Impl )
            // InternalSecureUML2Java.g:1291:2: rule__BMachine__Group_10__1__Impl
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
    // InternalSecureUML2Java.g:1297:1: rule__BMachine__Group_10__1__Impl : ( ( rule__BMachine__InvsAssignment_10_1 ) ) ;
    public final void rule__BMachine__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1301:1: ( ( ( rule__BMachine__InvsAssignment_10_1 ) ) )
            // InternalSecureUML2Java.g:1302:1: ( ( rule__BMachine__InvsAssignment_10_1 ) )
            {
            // InternalSecureUML2Java.g:1302:1: ( ( rule__BMachine__InvsAssignment_10_1 ) )
            // InternalSecureUML2Java.g:1303:2: ( rule__BMachine__InvsAssignment_10_1 )
            {
             before(grammarAccess.getBMachineAccess().getInvsAssignment_10_1()); 
            // InternalSecureUML2Java.g:1304:2: ( rule__BMachine__InvsAssignment_10_1 )
            // InternalSecureUML2Java.g:1304:3: rule__BMachine__InvsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__InvsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getInvsAssignment_10_1()); 

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


    // $ANTLR start "rule__BMachine__Group_13__0"
    // InternalSecureUML2Java.g:1313:1: rule__BMachine__Group_13__0 : rule__BMachine__Group_13__0__Impl rule__BMachine__Group_13__1 ;
    public final void rule__BMachine__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1317:1: ( rule__BMachine__Group_13__0__Impl rule__BMachine__Group_13__1 )
            // InternalSecureUML2Java.g:1318:2: rule__BMachine__Group_13__0__Impl rule__BMachine__Group_13__1
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group_13__1();

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
    // $ANTLR end "rule__BMachine__Group_13__0"


    // $ANTLR start "rule__BMachine__Group_13__0__Impl"
    // InternalSecureUML2Java.g:1325:1: rule__BMachine__Group_13__0__Impl : ( '||' ) ;
    public final void rule__BMachine__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1329:1: ( ( '||' ) )
            // InternalSecureUML2Java.g:1330:1: ( '||' )
            {
            // InternalSecureUML2Java.g:1330:1: ( '||' )
            // InternalSecureUML2Java.g:1331:2: '||'
            {
             before(grammarAccess.getBMachineAccess().getVerticalLineVerticalLineKeyword_13_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getVerticalLineVerticalLineKeyword_13_0()); 

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
    // $ANTLR end "rule__BMachine__Group_13__0__Impl"


    // $ANTLR start "rule__BMachine__Group_13__1"
    // InternalSecureUML2Java.g:1340:1: rule__BMachine__Group_13__1 : rule__BMachine__Group_13__1__Impl ;
    public final void rule__BMachine__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1344:1: ( rule__BMachine__Group_13__1__Impl )
            // InternalSecureUML2Java.g:1345:2: rule__BMachine__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__Group_13__1__Impl();

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
    // $ANTLR end "rule__BMachine__Group_13__1"


    // $ANTLR start "rule__BMachine__Group_13__1__Impl"
    // InternalSecureUML2Java.g:1351:1: rule__BMachine__Group_13__1__Impl : ( ( rule__BMachine__InitsAssignment_13_1 ) ) ;
    public final void rule__BMachine__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1355:1: ( ( ( rule__BMachine__InitsAssignment_13_1 ) ) )
            // InternalSecureUML2Java.g:1356:1: ( ( rule__BMachine__InitsAssignment_13_1 ) )
            {
            // InternalSecureUML2Java.g:1356:1: ( ( rule__BMachine__InitsAssignment_13_1 ) )
            // InternalSecureUML2Java.g:1357:2: ( rule__BMachine__InitsAssignment_13_1 )
            {
             before(grammarAccess.getBMachineAccess().getInitsAssignment_13_1()); 
            // InternalSecureUML2Java.g:1358:2: ( rule__BMachine__InitsAssignment_13_1 )
            // InternalSecureUML2Java.g:1358:3: rule__BMachine__InitsAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__InitsAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getInitsAssignment_13_1()); 

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
    // $ANTLR end "rule__BMachine__Group_13__1__Impl"


    // $ANTLR start "rule__BMachine__Group_16__0"
    // InternalSecureUML2Java.g:1367:1: rule__BMachine__Group_16__0 : rule__BMachine__Group_16__0__Impl rule__BMachine__Group_16__1 ;
    public final void rule__BMachine__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1371:1: ( rule__BMachine__Group_16__0__Impl rule__BMachine__Group_16__1 )
            // InternalSecureUML2Java.g:1372:2: rule__BMachine__Group_16__0__Impl rule__BMachine__Group_16__1
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group_16__1();

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
    // $ANTLR end "rule__BMachine__Group_16__0"


    // $ANTLR start "rule__BMachine__Group_16__0__Impl"
    // InternalSecureUML2Java.g:1379:1: rule__BMachine__Group_16__0__Impl : ( ';' ) ;
    public final void rule__BMachine__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1383:1: ( ( ';' ) )
            // InternalSecureUML2Java.g:1384:1: ( ';' )
            {
            // InternalSecureUML2Java.g:1384:1: ( ';' )
            // InternalSecureUML2Java.g:1385:2: ';'
            {
             before(grammarAccess.getBMachineAccess().getSemicolonKeyword_16_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getSemicolonKeyword_16_0()); 

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
    // $ANTLR end "rule__BMachine__Group_16__0__Impl"


    // $ANTLR start "rule__BMachine__Group_16__1"
    // InternalSecureUML2Java.g:1394:1: rule__BMachine__Group_16__1 : rule__BMachine__Group_16__1__Impl ;
    public final void rule__BMachine__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1398:1: ( rule__BMachine__Group_16__1__Impl )
            // InternalSecureUML2Java.g:1399:2: rule__BMachine__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__Group_16__1__Impl();

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
    // $ANTLR end "rule__BMachine__Group_16__1"


    // $ANTLR start "rule__BMachine__Group_16__1__Impl"
    // InternalSecureUML2Java.g:1405:1: rule__BMachine__Group_16__1__Impl : ( ( rule__BMachine__VopsAssignment_16_1 ) ) ;
    public final void rule__BMachine__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1409:1: ( ( ( rule__BMachine__VopsAssignment_16_1 ) ) )
            // InternalSecureUML2Java.g:1410:1: ( ( rule__BMachine__VopsAssignment_16_1 ) )
            {
            // InternalSecureUML2Java.g:1410:1: ( ( rule__BMachine__VopsAssignment_16_1 ) )
            // InternalSecureUML2Java.g:1411:2: ( rule__BMachine__VopsAssignment_16_1 )
            {
             before(grammarAccess.getBMachineAccess().getVopsAssignment_16_1()); 
            // InternalSecureUML2Java.g:1412:2: ( rule__BMachine__VopsAssignment_16_1 )
            // InternalSecureUML2Java.g:1412:3: rule__BMachine__VopsAssignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__VopsAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getVopsAssignment_16_1()); 

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
    // $ANTLR end "rule__BMachine__Group_16__1__Impl"


    // $ANTLR start "rule__BMachine__Group_19__0"
    // InternalSecureUML2Java.g:1421:1: rule__BMachine__Group_19__0 : rule__BMachine__Group_19__0__Impl rule__BMachine__Group_19__1 ;
    public final void rule__BMachine__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1425:1: ( rule__BMachine__Group_19__0__Impl rule__BMachine__Group_19__1 )
            // InternalSecureUML2Java.g:1426:2: rule__BMachine__Group_19__0__Impl rule__BMachine__Group_19__1
            {
            pushFollow(FOLLOW_3);
            rule__BMachine__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BMachine__Group_19__1();

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
    // $ANTLR end "rule__BMachine__Group_19__0"


    // $ANTLR start "rule__BMachine__Group_19__0__Impl"
    // InternalSecureUML2Java.g:1433:1: rule__BMachine__Group_19__0__Impl : ( ';' ) ;
    public final void rule__BMachine__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1437:1: ( ( ';' ) )
            // InternalSecureUML2Java.g:1438:1: ( ';' )
            {
            // InternalSecureUML2Java.g:1438:1: ( ';' )
            // InternalSecureUML2Java.g:1439:2: ';'
            {
             before(grammarAccess.getBMachineAccess().getSemicolonKeyword_19_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBMachineAccess().getSemicolonKeyword_19_0()); 

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
    // $ANTLR end "rule__BMachine__Group_19__0__Impl"


    // $ANTLR start "rule__BMachine__Group_19__1"
    // InternalSecureUML2Java.g:1448:1: rule__BMachine__Group_19__1 : rule__BMachine__Group_19__1__Impl ;
    public final void rule__BMachine__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1452:1: ( rule__BMachine__Group_19__1__Impl )
            // InternalSecureUML2Java.g:1453:2: rule__BMachine__Group_19__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__Group_19__1__Impl();

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
    // $ANTLR end "rule__BMachine__Group_19__1"


    // $ANTLR start "rule__BMachine__Group_19__1__Impl"
    // InternalSecureUML2Java.g:1459:1: rule__BMachine__Group_19__1__Impl : ( ( rule__BMachine__SopsAssignment_19_1 ) ) ;
    public final void rule__BMachine__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1463:1: ( ( ( rule__BMachine__SopsAssignment_19_1 ) ) )
            // InternalSecureUML2Java.g:1464:1: ( ( rule__BMachine__SopsAssignment_19_1 ) )
            {
            // InternalSecureUML2Java.g:1464:1: ( ( rule__BMachine__SopsAssignment_19_1 ) )
            // InternalSecureUML2Java.g:1465:2: ( rule__BMachine__SopsAssignment_19_1 )
            {
             before(grammarAccess.getBMachineAccess().getSopsAssignment_19_1()); 
            // InternalSecureUML2Java.g:1466:2: ( rule__BMachine__SopsAssignment_19_1 )
            // InternalSecureUML2Java.g:1466:3: rule__BMachine__SopsAssignment_19_1
            {
            pushFollow(FOLLOW_2);
            rule__BMachine__SopsAssignment_19_1();

            state._fsp--;


            }

             after(grammarAccess.getBMachineAccess().getSopsAssignment_19_1()); 

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
    // $ANTLR end "rule__BMachine__Group_19__1__Impl"


    // $ANTLR start "rule__VoidOperation__Group__0"
    // InternalSecureUML2Java.g:1475:1: rule__VoidOperation__Group__0 : rule__VoidOperation__Group__0__Impl rule__VoidOperation__Group__1 ;
    public final void rule__VoidOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1479:1: ( rule__VoidOperation__Group__0__Impl rule__VoidOperation__Group__1 )
            // InternalSecureUML2Java.g:1480:2: rule__VoidOperation__Group__0__Impl rule__VoidOperation__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__VoidOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__1();

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
    // $ANTLR end "rule__VoidOperation__Group__0"


    // $ANTLR start "rule__VoidOperation__Group__0__Impl"
    // InternalSecureUML2Java.g:1487:1: rule__VoidOperation__Group__0__Impl : ( ( rule__VoidOperation__Op_nameAssignment_0 ) ) ;
    public final void rule__VoidOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1491:1: ( ( ( rule__VoidOperation__Op_nameAssignment_0 ) ) )
            // InternalSecureUML2Java.g:1492:1: ( ( rule__VoidOperation__Op_nameAssignment_0 ) )
            {
            // InternalSecureUML2Java.g:1492:1: ( ( rule__VoidOperation__Op_nameAssignment_0 ) )
            // InternalSecureUML2Java.g:1493:2: ( rule__VoidOperation__Op_nameAssignment_0 )
            {
             before(grammarAccess.getVoidOperationAccess().getOp_nameAssignment_0()); 
            // InternalSecureUML2Java.g:1494:2: ( rule__VoidOperation__Op_nameAssignment_0 )
            // InternalSecureUML2Java.g:1494:3: rule__VoidOperation__Op_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Op_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getOp_nameAssignment_0()); 

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
    // $ANTLR end "rule__VoidOperation__Group__0__Impl"


    // $ANTLR start "rule__VoidOperation__Group__1"
    // InternalSecureUML2Java.g:1502:1: rule__VoidOperation__Group__1 : rule__VoidOperation__Group__1__Impl rule__VoidOperation__Group__2 ;
    public final void rule__VoidOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1506:1: ( rule__VoidOperation__Group__1__Impl rule__VoidOperation__Group__2 )
            // InternalSecureUML2Java.g:1507:2: rule__VoidOperation__Group__1__Impl rule__VoidOperation__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__VoidOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__2();

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
    // $ANTLR end "rule__VoidOperation__Group__1"


    // $ANTLR start "rule__VoidOperation__Group__1__Impl"
    // InternalSecureUML2Java.g:1514:1: rule__VoidOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__VoidOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1518:1: ( ( '(' ) )
            // InternalSecureUML2Java.g:1519:1: ( '(' )
            {
            // InternalSecureUML2Java.g:1519:1: ( '(' )
            // InternalSecureUML2Java.g:1520:2: '('
            {
             before(grammarAccess.getVoidOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__VoidOperation__Group__1__Impl"


    // $ANTLR start "rule__VoidOperation__Group__2"
    // InternalSecureUML2Java.g:1529:1: rule__VoidOperation__Group__2 : rule__VoidOperation__Group__2__Impl rule__VoidOperation__Group__3 ;
    public final void rule__VoidOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1533:1: ( rule__VoidOperation__Group__2__Impl rule__VoidOperation__Group__3 )
            // InternalSecureUML2Java.g:1534:2: rule__VoidOperation__Group__2__Impl rule__VoidOperation__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__VoidOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__3();

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
    // $ANTLR end "rule__VoidOperation__Group__2"


    // $ANTLR start "rule__VoidOperation__Group__2__Impl"
    // InternalSecureUML2Java.g:1541:1: rule__VoidOperation__Group__2__Impl : ( ( rule__VoidOperation__Group_2__0 )? ) ;
    public final void rule__VoidOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1545:1: ( ( ( rule__VoidOperation__Group_2__0 )? ) )
            // InternalSecureUML2Java.g:1546:1: ( ( rule__VoidOperation__Group_2__0 )? )
            {
            // InternalSecureUML2Java.g:1546:1: ( ( rule__VoidOperation__Group_2__0 )? )
            // InternalSecureUML2Java.g:1547:2: ( rule__VoidOperation__Group_2__0 )?
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_2()); 
            // InternalSecureUML2Java.g:1548:2: ( rule__VoidOperation__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecureUML2Java.g:1548:3: rule__VoidOperation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VoidOperation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVoidOperationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VoidOperation__Group__2__Impl"


    // $ANTLR start "rule__VoidOperation__Group__3"
    // InternalSecureUML2Java.g:1556:1: rule__VoidOperation__Group__3 : rule__VoidOperation__Group__3__Impl rule__VoidOperation__Group__4 ;
    public final void rule__VoidOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1560:1: ( rule__VoidOperation__Group__3__Impl rule__VoidOperation__Group__4 )
            // InternalSecureUML2Java.g:1561:2: rule__VoidOperation__Group__3__Impl rule__VoidOperation__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__VoidOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__4();

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
    // $ANTLR end "rule__VoidOperation__Group__3"


    // $ANTLR start "rule__VoidOperation__Group__3__Impl"
    // InternalSecureUML2Java.g:1568:1: rule__VoidOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__VoidOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1572:1: ( ( ')' ) )
            // InternalSecureUML2Java.g:1573:1: ( ')' )
            {
            // InternalSecureUML2Java.g:1573:1: ( ')' )
            // InternalSecureUML2Java.g:1574:2: ')'
            {
             before(grammarAccess.getVoidOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__VoidOperation__Group__3__Impl"


    // $ANTLR start "rule__VoidOperation__Group__4"
    // InternalSecureUML2Java.g:1583:1: rule__VoidOperation__Group__4 : rule__VoidOperation__Group__4__Impl rule__VoidOperation__Group__5 ;
    public final void rule__VoidOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1587:1: ( rule__VoidOperation__Group__4__Impl rule__VoidOperation__Group__5 )
            // InternalSecureUML2Java.g:1588:2: rule__VoidOperation__Group__4__Impl rule__VoidOperation__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__VoidOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__5();

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
    // $ANTLR end "rule__VoidOperation__Group__4"


    // $ANTLR start "rule__VoidOperation__Group__4__Impl"
    // InternalSecureUML2Java.g:1595:1: rule__VoidOperation__Group__4__Impl : ( '=' ) ;
    public final void rule__VoidOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1599:1: ( ( '=' ) )
            // InternalSecureUML2Java.g:1600:1: ( '=' )
            {
            // InternalSecureUML2Java.g:1600:1: ( '=' )
            // InternalSecureUML2Java.g:1601:2: '='
            {
             before(grammarAccess.getVoidOperationAccess().getEqualsSignKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__VoidOperation__Group__4__Impl"


    // $ANTLR start "rule__VoidOperation__Group__5"
    // InternalSecureUML2Java.g:1610:1: rule__VoidOperation__Group__5 : rule__VoidOperation__Group__5__Impl rule__VoidOperation__Group__6 ;
    public final void rule__VoidOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1614:1: ( rule__VoidOperation__Group__5__Impl rule__VoidOperation__Group__6 )
            // InternalSecureUML2Java.g:1615:2: rule__VoidOperation__Group__5__Impl rule__VoidOperation__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__VoidOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__6();

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
    // $ANTLR end "rule__VoidOperation__Group__5"


    // $ANTLR start "rule__VoidOperation__Group__5__Impl"
    // InternalSecureUML2Java.g:1622:1: rule__VoidOperation__Group__5__Impl : ( 'PRE' ) ;
    public final void rule__VoidOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1626:1: ( ( 'PRE' ) )
            // InternalSecureUML2Java.g:1627:1: ( 'PRE' )
            {
            // InternalSecureUML2Java.g:1627:1: ( 'PRE' )
            // InternalSecureUML2Java.g:1628:2: 'PRE'
            {
             before(grammarAccess.getVoidOperationAccess().getPREKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getPREKeyword_5()); 

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
    // $ANTLR end "rule__VoidOperation__Group__5__Impl"


    // $ANTLR start "rule__VoidOperation__Group__6"
    // InternalSecureUML2Java.g:1637:1: rule__VoidOperation__Group__6 : rule__VoidOperation__Group__6__Impl rule__VoidOperation__Group__7 ;
    public final void rule__VoidOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1641:1: ( rule__VoidOperation__Group__6__Impl rule__VoidOperation__Group__7 )
            // InternalSecureUML2Java.g:1642:2: rule__VoidOperation__Group__6__Impl rule__VoidOperation__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__VoidOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__7();

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
    // $ANTLR end "rule__VoidOperation__Group__6"


    // $ANTLR start "rule__VoidOperation__Group__6__Impl"
    // InternalSecureUML2Java.g:1649:1: rule__VoidOperation__Group__6__Impl : ( ( rule__VoidOperation__Group_6__0 ) ) ;
    public final void rule__VoidOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1653:1: ( ( ( rule__VoidOperation__Group_6__0 ) ) )
            // InternalSecureUML2Java.g:1654:1: ( ( rule__VoidOperation__Group_6__0 ) )
            {
            // InternalSecureUML2Java.g:1654:1: ( ( rule__VoidOperation__Group_6__0 ) )
            // InternalSecureUML2Java.g:1655:2: ( rule__VoidOperation__Group_6__0 )
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_6()); 
            // InternalSecureUML2Java.g:1656:2: ( rule__VoidOperation__Group_6__0 )
            // InternalSecureUML2Java.g:1656:3: rule__VoidOperation__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getGroup_6()); 

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
    // $ANTLR end "rule__VoidOperation__Group__6__Impl"


    // $ANTLR start "rule__VoidOperation__Group__7"
    // InternalSecureUML2Java.g:1664:1: rule__VoidOperation__Group__7 : rule__VoidOperation__Group__7__Impl rule__VoidOperation__Group__8 ;
    public final void rule__VoidOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1668:1: ( rule__VoidOperation__Group__7__Impl rule__VoidOperation__Group__8 )
            // InternalSecureUML2Java.g:1669:2: rule__VoidOperation__Group__7__Impl rule__VoidOperation__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__VoidOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__8();

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
    // $ANTLR end "rule__VoidOperation__Group__7"


    // $ANTLR start "rule__VoidOperation__Group__7__Impl"
    // InternalSecureUML2Java.g:1676:1: rule__VoidOperation__Group__7__Impl : ( ( rule__VoidOperation__Group_7__0 )* ) ;
    public final void rule__VoidOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1680:1: ( ( ( rule__VoidOperation__Group_7__0 )* ) )
            // InternalSecureUML2Java.g:1681:1: ( ( rule__VoidOperation__Group_7__0 )* )
            {
            // InternalSecureUML2Java.g:1681:1: ( ( rule__VoidOperation__Group_7__0 )* )
            // InternalSecureUML2Java.g:1682:2: ( rule__VoidOperation__Group_7__0 )*
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_7()); 
            // InternalSecureUML2Java.g:1683:2: ( rule__VoidOperation__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSecureUML2Java.g:1683:3: rule__VoidOperation__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__VoidOperation__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getVoidOperationAccess().getGroup_7()); 

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
    // $ANTLR end "rule__VoidOperation__Group__7__Impl"


    // $ANTLR start "rule__VoidOperation__Group__8"
    // InternalSecureUML2Java.g:1691:1: rule__VoidOperation__Group__8 : rule__VoidOperation__Group__8__Impl rule__VoidOperation__Group__9 ;
    public final void rule__VoidOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1695:1: ( rule__VoidOperation__Group__8__Impl rule__VoidOperation__Group__9 )
            // InternalSecureUML2Java.g:1696:2: rule__VoidOperation__Group__8__Impl rule__VoidOperation__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__VoidOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__9();

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
    // $ANTLR end "rule__VoidOperation__Group__8"


    // $ANTLR start "rule__VoidOperation__Group__8__Impl"
    // InternalSecureUML2Java.g:1703:1: rule__VoidOperation__Group__8__Impl : ( 'THEN' ) ;
    public final void rule__VoidOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1707:1: ( ( 'THEN' ) )
            // InternalSecureUML2Java.g:1708:1: ( 'THEN' )
            {
            // InternalSecureUML2Java.g:1708:1: ( 'THEN' )
            // InternalSecureUML2Java.g:1709:2: 'THEN'
            {
             before(grammarAccess.getVoidOperationAccess().getTHENKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getTHENKeyword_8()); 

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
    // $ANTLR end "rule__VoidOperation__Group__8__Impl"


    // $ANTLR start "rule__VoidOperation__Group__9"
    // InternalSecureUML2Java.g:1718:1: rule__VoidOperation__Group__9 : rule__VoidOperation__Group__9__Impl rule__VoidOperation__Group__10 ;
    public final void rule__VoidOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1722:1: ( rule__VoidOperation__Group__9__Impl rule__VoidOperation__Group__10 )
            // InternalSecureUML2Java.g:1723:2: rule__VoidOperation__Group__9__Impl rule__VoidOperation__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__VoidOperation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__10();

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
    // $ANTLR end "rule__VoidOperation__Group__9"


    // $ANTLR start "rule__VoidOperation__Group__9__Impl"
    // InternalSecureUML2Java.g:1730:1: rule__VoidOperation__Group__9__Impl : ( ( rule__VoidOperation__SubsAssignment_9 ) ) ;
    public final void rule__VoidOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1734:1: ( ( ( rule__VoidOperation__SubsAssignment_9 ) ) )
            // InternalSecureUML2Java.g:1735:1: ( ( rule__VoidOperation__SubsAssignment_9 ) )
            {
            // InternalSecureUML2Java.g:1735:1: ( ( rule__VoidOperation__SubsAssignment_9 ) )
            // InternalSecureUML2Java.g:1736:2: ( rule__VoidOperation__SubsAssignment_9 )
            {
             before(grammarAccess.getVoidOperationAccess().getSubsAssignment_9()); 
            // InternalSecureUML2Java.g:1737:2: ( rule__VoidOperation__SubsAssignment_9 )
            // InternalSecureUML2Java.g:1737:3: rule__VoidOperation__SubsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__SubsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getSubsAssignment_9()); 

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
    // $ANTLR end "rule__VoidOperation__Group__9__Impl"


    // $ANTLR start "rule__VoidOperation__Group__10"
    // InternalSecureUML2Java.g:1745:1: rule__VoidOperation__Group__10 : rule__VoidOperation__Group__10__Impl rule__VoidOperation__Group__11 ;
    public final void rule__VoidOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1749:1: ( rule__VoidOperation__Group__10__Impl rule__VoidOperation__Group__11 )
            // InternalSecureUML2Java.g:1750:2: rule__VoidOperation__Group__10__Impl rule__VoidOperation__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__VoidOperation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__11();

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
    // $ANTLR end "rule__VoidOperation__Group__10"


    // $ANTLR start "rule__VoidOperation__Group__10__Impl"
    // InternalSecureUML2Java.g:1757:1: rule__VoidOperation__Group__10__Impl : ( ( rule__VoidOperation__Group_10__0 )* ) ;
    public final void rule__VoidOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1761:1: ( ( ( rule__VoidOperation__Group_10__0 )* ) )
            // InternalSecureUML2Java.g:1762:1: ( ( rule__VoidOperation__Group_10__0 )* )
            {
            // InternalSecureUML2Java.g:1762:1: ( ( rule__VoidOperation__Group_10__0 )* )
            // InternalSecureUML2Java.g:1763:2: ( rule__VoidOperation__Group_10__0 )*
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_10()); 
            // InternalSecureUML2Java.g:1764:2: ( rule__VoidOperation__Group_10__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSecureUML2Java.g:1764:3: rule__VoidOperation__Group_10__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__VoidOperation__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getVoidOperationAccess().getGroup_10()); 

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
    // $ANTLR end "rule__VoidOperation__Group__10__Impl"


    // $ANTLR start "rule__VoidOperation__Group__11"
    // InternalSecureUML2Java.g:1772:1: rule__VoidOperation__Group__11 : rule__VoidOperation__Group__11__Impl ;
    public final void rule__VoidOperation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1776:1: ( rule__VoidOperation__Group__11__Impl )
            // InternalSecureUML2Java.g:1777:2: rule__VoidOperation__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__11__Impl();

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
    // $ANTLR end "rule__VoidOperation__Group__11"


    // $ANTLR start "rule__VoidOperation__Group__11__Impl"
    // InternalSecureUML2Java.g:1783:1: rule__VoidOperation__Group__11__Impl : ( 'END' ) ;
    public final void rule__VoidOperation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1787:1: ( ( 'END' ) )
            // InternalSecureUML2Java.g:1788:1: ( 'END' )
            {
            // InternalSecureUML2Java.g:1788:1: ( 'END' )
            // InternalSecureUML2Java.g:1789:2: 'END'
            {
             before(grammarAccess.getVoidOperationAccess().getENDKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getENDKeyword_11()); 

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
    // $ANTLR end "rule__VoidOperation__Group__11__Impl"


    // $ANTLR start "rule__VoidOperation__Group_2__0"
    // InternalSecureUML2Java.g:1799:1: rule__VoidOperation__Group_2__0 : rule__VoidOperation__Group_2__0__Impl rule__VoidOperation__Group_2__1 ;
    public final void rule__VoidOperation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1803:1: ( rule__VoidOperation__Group_2__0__Impl rule__VoidOperation__Group_2__1 )
            // InternalSecureUML2Java.g:1804:2: rule__VoidOperation__Group_2__0__Impl rule__VoidOperation__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__VoidOperation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_2__1();

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
    // $ANTLR end "rule__VoidOperation__Group_2__0"


    // $ANTLR start "rule__VoidOperation__Group_2__0__Impl"
    // InternalSecureUML2Java.g:1811:1: rule__VoidOperation__Group_2__0__Impl : ( ( rule__VoidOperation__PListAssignment_2_0 ) ) ;
    public final void rule__VoidOperation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1815:1: ( ( ( rule__VoidOperation__PListAssignment_2_0 ) ) )
            // InternalSecureUML2Java.g:1816:1: ( ( rule__VoidOperation__PListAssignment_2_0 ) )
            {
            // InternalSecureUML2Java.g:1816:1: ( ( rule__VoidOperation__PListAssignment_2_0 ) )
            // InternalSecureUML2Java.g:1817:2: ( rule__VoidOperation__PListAssignment_2_0 )
            {
             before(grammarAccess.getVoidOperationAccess().getPListAssignment_2_0()); 
            // InternalSecureUML2Java.g:1818:2: ( rule__VoidOperation__PListAssignment_2_0 )
            // InternalSecureUML2Java.g:1818:3: rule__VoidOperation__PListAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__PListAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getPListAssignment_2_0()); 

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
    // $ANTLR end "rule__VoidOperation__Group_2__0__Impl"


    // $ANTLR start "rule__VoidOperation__Group_2__1"
    // InternalSecureUML2Java.g:1826:1: rule__VoidOperation__Group_2__1 : rule__VoidOperation__Group_2__1__Impl ;
    public final void rule__VoidOperation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1830:1: ( rule__VoidOperation__Group_2__1__Impl )
            // InternalSecureUML2Java.g:1831:2: rule__VoidOperation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_2__1__Impl();

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
    // $ANTLR end "rule__VoidOperation__Group_2__1"


    // $ANTLR start "rule__VoidOperation__Group_2__1__Impl"
    // InternalSecureUML2Java.g:1837:1: rule__VoidOperation__Group_2__1__Impl : ( ( rule__VoidOperation__Group_2_1__0 )* ) ;
    public final void rule__VoidOperation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1841:1: ( ( ( rule__VoidOperation__Group_2_1__0 )* ) )
            // InternalSecureUML2Java.g:1842:1: ( ( rule__VoidOperation__Group_2_1__0 )* )
            {
            // InternalSecureUML2Java.g:1842:1: ( ( rule__VoidOperation__Group_2_1__0 )* )
            // InternalSecureUML2Java.g:1843:2: ( rule__VoidOperation__Group_2_1__0 )*
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_2_1()); 
            // InternalSecureUML2Java.g:1844:2: ( rule__VoidOperation__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSecureUML2Java.g:1844:3: rule__VoidOperation__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__VoidOperation__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getVoidOperationAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__VoidOperation__Group_2__1__Impl"


    // $ANTLR start "rule__VoidOperation__Group_2_1__0"
    // InternalSecureUML2Java.g:1853:1: rule__VoidOperation__Group_2_1__0 : rule__VoidOperation__Group_2_1__0__Impl rule__VoidOperation__Group_2_1__1 ;
    public final void rule__VoidOperation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1857:1: ( rule__VoidOperation__Group_2_1__0__Impl rule__VoidOperation__Group_2_1__1 )
            // InternalSecureUML2Java.g:1858:2: rule__VoidOperation__Group_2_1__0__Impl rule__VoidOperation__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__VoidOperation__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_2_1__1();

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
    // $ANTLR end "rule__VoidOperation__Group_2_1__0"


    // $ANTLR start "rule__VoidOperation__Group_2_1__0__Impl"
    // InternalSecureUML2Java.g:1865:1: rule__VoidOperation__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__VoidOperation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1869:1: ( ( ',' ) )
            // InternalSecureUML2Java.g:1870:1: ( ',' )
            {
            // InternalSecureUML2Java.g:1870:1: ( ',' )
            // InternalSecureUML2Java.g:1871:2: ','
            {
             before(grammarAccess.getVoidOperationAccess().getCommaKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__VoidOperation__Group_2_1__0__Impl"


    // $ANTLR start "rule__VoidOperation__Group_2_1__1"
    // InternalSecureUML2Java.g:1880:1: rule__VoidOperation__Group_2_1__1 : rule__VoidOperation__Group_2_1__1__Impl ;
    public final void rule__VoidOperation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1884:1: ( rule__VoidOperation__Group_2_1__1__Impl )
            // InternalSecureUML2Java.g:1885:2: rule__VoidOperation__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__VoidOperation__Group_2_1__1"


    // $ANTLR start "rule__VoidOperation__Group_2_1__1__Impl"
    // InternalSecureUML2Java.g:1891:1: rule__VoidOperation__Group_2_1__1__Impl : ( ( rule__VoidOperation__PListAssignment_2_1_1 ) ) ;
    public final void rule__VoidOperation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1895:1: ( ( ( rule__VoidOperation__PListAssignment_2_1_1 ) ) )
            // InternalSecureUML2Java.g:1896:1: ( ( rule__VoidOperation__PListAssignment_2_1_1 ) )
            {
            // InternalSecureUML2Java.g:1896:1: ( ( rule__VoidOperation__PListAssignment_2_1_1 ) )
            // InternalSecureUML2Java.g:1897:2: ( rule__VoidOperation__PListAssignment_2_1_1 )
            {
             before(grammarAccess.getVoidOperationAccess().getPListAssignment_2_1_1()); 
            // InternalSecureUML2Java.g:1898:2: ( rule__VoidOperation__PListAssignment_2_1_1 )
            // InternalSecureUML2Java.g:1898:3: rule__VoidOperation__PListAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__PListAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getPListAssignment_2_1_1()); 

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
    // $ANTLR end "rule__VoidOperation__Group_2_1__1__Impl"


    // $ANTLR start "rule__VoidOperation__Group_6__0"
    // InternalSecureUML2Java.g:1907:1: rule__VoidOperation__Group_6__0 : rule__VoidOperation__Group_6__0__Impl rule__VoidOperation__Group_6__1 ;
    public final void rule__VoidOperation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1911:1: ( rule__VoidOperation__Group_6__0__Impl rule__VoidOperation__Group_6__1 )
            // InternalSecureUML2Java.g:1912:2: rule__VoidOperation__Group_6__0__Impl rule__VoidOperation__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__VoidOperation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_6__1();

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
    // $ANTLR end "rule__VoidOperation__Group_6__0"


    // $ANTLR start "rule__VoidOperation__Group_6__0__Impl"
    // InternalSecureUML2Java.g:1919:1: rule__VoidOperation__Group_6__0__Impl : ( ( rule__VoidOperation__ParamsAssignment_6_0 ) ) ;
    public final void rule__VoidOperation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1923:1: ( ( ( rule__VoidOperation__ParamsAssignment_6_0 ) ) )
            // InternalSecureUML2Java.g:1924:1: ( ( rule__VoidOperation__ParamsAssignment_6_0 ) )
            {
            // InternalSecureUML2Java.g:1924:1: ( ( rule__VoidOperation__ParamsAssignment_6_0 ) )
            // InternalSecureUML2Java.g:1925:2: ( rule__VoidOperation__ParamsAssignment_6_0 )
            {
             before(grammarAccess.getVoidOperationAccess().getParamsAssignment_6_0()); 
            // InternalSecureUML2Java.g:1926:2: ( rule__VoidOperation__ParamsAssignment_6_0 )
            // InternalSecureUML2Java.g:1926:3: rule__VoidOperation__ParamsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__ParamsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getParamsAssignment_6_0()); 

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
    // $ANTLR end "rule__VoidOperation__Group_6__0__Impl"


    // $ANTLR start "rule__VoidOperation__Group_6__1"
    // InternalSecureUML2Java.g:1934:1: rule__VoidOperation__Group_6__1 : rule__VoidOperation__Group_6__1__Impl ;
    public final void rule__VoidOperation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1938:1: ( rule__VoidOperation__Group_6__1__Impl )
            // InternalSecureUML2Java.g:1939:2: rule__VoidOperation__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_6__1__Impl();

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
    // $ANTLR end "rule__VoidOperation__Group_6__1"


    // $ANTLR start "rule__VoidOperation__Group_6__1__Impl"
    // InternalSecureUML2Java.g:1945:1: rule__VoidOperation__Group_6__1__Impl : ( ( rule__VoidOperation__Group_6_1__0 )* ) ;
    public final void rule__VoidOperation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1949:1: ( ( ( rule__VoidOperation__Group_6_1__0 )* ) )
            // InternalSecureUML2Java.g:1950:1: ( ( rule__VoidOperation__Group_6_1__0 )* )
            {
            // InternalSecureUML2Java.g:1950:1: ( ( rule__VoidOperation__Group_6_1__0 )* )
            // InternalSecureUML2Java.g:1951:2: ( rule__VoidOperation__Group_6_1__0 )*
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_6_1()); 
            // InternalSecureUML2Java.g:1952:2: ( rule__VoidOperation__Group_6_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_ID) ) {
                        int LA17_3 = input.LA(3);

                        if ( (LA17_3==34) ) {
                            int LA17_4 = input.LA(4);

                            if ( (LA17_4==RULE_ID) ) {
                                alt17=1;
                            }


                        }


                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalSecureUML2Java.g:1952:3: rule__VoidOperation__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__VoidOperation__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getVoidOperationAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__VoidOperation__Group_6__1__Impl"


    // $ANTLR start "rule__VoidOperation__Group_6_1__0"
    // InternalSecureUML2Java.g:1961:1: rule__VoidOperation__Group_6_1__0 : rule__VoidOperation__Group_6_1__0__Impl rule__VoidOperation__Group_6_1__1 ;
    public final void rule__VoidOperation__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1965:1: ( rule__VoidOperation__Group_6_1__0__Impl rule__VoidOperation__Group_6_1__1 )
            // InternalSecureUML2Java.g:1966:2: rule__VoidOperation__Group_6_1__0__Impl rule__VoidOperation__Group_6_1__1
            {
            pushFollow(FOLLOW_3);
            rule__VoidOperation__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_6_1__1();

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
    // $ANTLR end "rule__VoidOperation__Group_6_1__0"


    // $ANTLR start "rule__VoidOperation__Group_6_1__0__Impl"
    // InternalSecureUML2Java.g:1973:1: rule__VoidOperation__Group_6_1__0__Impl : ( '&' ) ;
    public final void rule__VoidOperation__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1977:1: ( ( '&' ) )
            // InternalSecureUML2Java.g:1978:1: ( '&' )
            {
            // InternalSecureUML2Java.g:1978:1: ( '&' )
            // InternalSecureUML2Java.g:1979:2: '&'
            {
             before(grammarAccess.getVoidOperationAccess().getAmpersandKeyword_6_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getAmpersandKeyword_6_1_0()); 

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
    // $ANTLR end "rule__VoidOperation__Group_6_1__0__Impl"


    // $ANTLR start "rule__VoidOperation__Group_6_1__1"
    // InternalSecureUML2Java.g:1988:1: rule__VoidOperation__Group_6_1__1 : rule__VoidOperation__Group_6_1__1__Impl ;
    public final void rule__VoidOperation__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:1992:1: ( rule__VoidOperation__Group_6_1__1__Impl )
            // InternalSecureUML2Java.g:1993:2: rule__VoidOperation__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__VoidOperation__Group_6_1__1"


    // $ANTLR start "rule__VoidOperation__Group_6_1__1__Impl"
    // InternalSecureUML2Java.g:1999:1: rule__VoidOperation__Group_6_1__1__Impl : ( ( rule__VoidOperation__ParamsAssignment_6_1_1 ) ) ;
    public final void rule__VoidOperation__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2003:1: ( ( ( rule__VoidOperation__ParamsAssignment_6_1_1 ) ) )
            // InternalSecureUML2Java.g:2004:1: ( ( rule__VoidOperation__ParamsAssignment_6_1_1 ) )
            {
            // InternalSecureUML2Java.g:2004:1: ( ( rule__VoidOperation__ParamsAssignment_6_1_1 ) )
            // InternalSecureUML2Java.g:2005:2: ( rule__VoidOperation__ParamsAssignment_6_1_1 )
            {
             before(grammarAccess.getVoidOperationAccess().getParamsAssignment_6_1_1()); 
            // InternalSecureUML2Java.g:2006:2: ( rule__VoidOperation__ParamsAssignment_6_1_1 )
            // InternalSecureUML2Java.g:2006:3: rule__VoidOperation__ParamsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__ParamsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getParamsAssignment_6_1_1()); 

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
    // $ANTLR end "rule__VoidOperation__Group_6_1__1__Impl"


    // $ANTLR start "rule__VoidOperation__Group_7__0"
    // InternalSecureUML2Java.g:2015:1: rule__VoidOperation__Group_7__0 : rule__VoidOperation__Group_7__0__Impl rule__VoidOperation__Group_7__1 ;
    public final void rule__VoidOperation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2019:1: ( rule__VoidOperation__Group_7__0__Impl rule__VoidOperation__Group_7__1 )
            // InternalSecureUML2Java.g:2020:2: rule__VoidOperation__Group_7__0__Impl rule__VoidOperation__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__VoidOperation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_7__1();

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
    // $ANTLR end "rule__VoidOperation__Group_7__0"


    // $ANTLR start "rule__VoidOperation__Group_7__0__Impl"
    // InternalSecureUML2Java.g:2027:1: rule__VoidOperation__Group_7__0__Impl : ( '&' ) ;
    public final void rule__VoidOperation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2031:1: ( ( '&' ) )
            // InternalSecureUML2Java.g:2032:1: ( '&' )
            {
            // InternalSecureUML2Java.g:2032:1: ( '&' )
            // InternalSecureUML2Java.g:2033:2: '&'
            {
             before(grammarAccess.getVoidOperationAccess().getAmpersandKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getAmpersandKeyword_7_0()); 

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
    // $ANTLR end "rule__VoidOperation__Group_7__0__Impl"


    // $ANTLR start "rule__VoidOperation__Group_7__1"
    // InternalSecureUML2Java.g:2042:1: rule__VoidOperation__Group_7__1 : rule__VoidOperation__Group_7__1__Impl ;
    public final void rule__VoidOperation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2046:1: ( rule__VoidOperation__Group_7__1__Impl )
            // InternalSecureUML2Java.g:2047:2: rule__VoidOperation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_7__1__Impl();

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
    // $ANTLR end "rule__VoidOperation__Group_7__1"


    // $ANTLR start "rule__VoidOperation__Group_7__1__Impl"
    // InternalSecureUML2Java.g:2053:1: rule__VoidOperation__Group_7__1__Impl : ( ( rule__VoidOperation__PreAssignment_7_1 ) ) ;
    public final void rule__VoidOperation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2057:1: ( ( ( rule__VoidOperation__PreAssignment_7_1 ) ) )
            // InternalSecureUML2Java.g:2058:1: ( ( rule__VoidOperation__PreAssignment_7_1 ) )
            {
            // InternalSecureUML2Java.g:2058:1: ( ( rule__VoidOperation__PreAssignment_7_1 ) )
            // InternalSecureUML2Java.g:2059:2: ( rule__VoidOperation__PreAssignment_7_1 )
            {
             before(grammarAccess.getVoidOperationAccess().getPreAssignment_7_1()); 
            // InternalSecureUML2Java.g:2060:2: ( rule__VoidOperation__PreAssignment_7_1 )
            // InternalSecureUML2Java.g:2060:3: rule__VoidOperation__PreAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__PreAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getPreAssignment_7_1()); 

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
    // $ANTLR end "rule__VoidOperation__Group_7__1__Impl"


    // $ANTLR start "rule__VoidOperation__Group_10__0"
    // InternalSecureUML2Java.g:2069:1: rule__VoidOperation__Group_10__0 : rule__VoidOperation__Group_10__0__Impl rule__VoidOperation__Group_10__1 ;
    public final void rule__VoidOperation__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2073:1: ( rule__VoidOperation__Group_10__0__Impl rule__VoidOperation__Group_10__1 )
            // InternalSecureUML2Java.g:2074:2: rule__VoidOperation__Group_10__0__Impl rule__VoidOperation__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__VoidOperation__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_10__1();

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
    // $ANTLR end "rule__VoidOperation__Group_10__0"


    // $ANTLR start "rule__VoidOperation__Group_10__0__Impl"
    // InternalSecureUML2Java.g:2081:1: rule__VoidOperation__Group_10__0__Impl : ( '||' ) ;
    public final void rule__VoidOperation__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2085:1: ( ( '||' ) )
            // InternalSecureUML2Java.g:2086:1: ( '||' )
            {
            // InternalSecureUML2Java.g:2086:1: ( '||' )
            // InternalSecureUML2Java.g:2087:2: '||'
            {
             before(grammarAccess.getVoidOperationAccess().getVerticalLineVerticalLineKeyword_10_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getVerticalLineVerticalLineKeyword_10_0()); 

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
    // $ANTLR end "rule__VoidOperation__Group_10__0__Impl"


    // $ANTLR start "rule__VoidOperation__Group_10__1"
    // InternalSecureUML2Java.g:2096:1: rule__VoidOperation__Group_10__1 : rule__VoidOperation__Group_10__1__Impl ;
    public final void rule__VoidOperation__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2100:1: ( rule__VoidOperation__Group_10__1__Impl )
            // InternalSecureUML2Java.g:2101:2: rule__VoidOperation__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_10__1__Impl();

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
    // $ANTLR end "rule__VoidOperation__Group_10__1"


    // $ANTLR start "rule__VoidOperation__Group_10__1__Impl"
    // InternalSecureUML2Java.g:2107:1: rule__VoidOperation__Group_10__1__Impl : ( ( rule__VoidOperation__SubsAssignment_10_1 ) ) ;
    public final void rule__VoidOperation__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2111:1: ( ( ( rule__VoidOperation__SubsAssignment_10_1 ) ) )
            // InternalSecureUML2Java.g:2112:1: ( ( rule__VoidOperation__SubsAssignment_10_1 ) )
            {
            // InternalSecureUML2Java.g:2112:1: ( ( rule__VoidOperation__SubsAssignment_10_1 ) )
            // InternalSecureUML2Java.g:2113:2: ( rule__VoidOperation__SubsAssignment_10_1 )
            {
             before(grammarAccess.getVoidOperationAccess().getSubsAssignment_10_1()); 
            // InternalSecureUML2Java.g:2114:2: ( rule__VoidOperation__SubsAssignment_10_1 )
            // InternalSecureUML2Java.g:2114:3: rule__VoidOperation__SubsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__SubsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getSubsAssignment_10_1()); 

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
    // $ANTLR end "rule__VoidOperation__Group_10__1__Impl"


    // $ANTLR start "rule__StringOperation__Group__0"
    // InternalSecureUML2Java.g:2123:1: rule__StringOperation__Group__0 : rule__StringOperation__Group__0__Impl rule__StringOperation__Group__1 ;
    public final void rule__StringOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2127:1: ( rule__StringOperation__Group__0__Impl rule__StringOperation__Group__1 )
            // InternalSecureUML2Java.g:2128:2: rule__StringOperation__Group__0__Impl rule__StringOperation__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__StringOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__1();

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
    // $ANTLR end "rule__StringOperation__Group__0"


    // $ANTLR start "rule__StringOperation__Group__0__Impl"
    // InternalSecureUML2Java.g:2135:1: rule__StringOperation__Group__0__Impl : ( ( rule__StringOperation__Res1Assignment_0 ) ) ;
    public final void rule__StringOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2139:1: ( ( ( rule__StringOperation__Res1Assignment_0 ) ) )
            // InternalSecureUML2Java.g:2140:1: ( ( rule__StringOperation__Res1Assignment_0 ) )
            {
            // InternalSecureUML2Java.g:2140:1: ( ( rule__StringOperation__Res1Assignment_0 ) )
            // InternalSecureUML2Java.g:2141:2: ( rule__StringOperation__Res1Assignment_0 )
            {
             before(grammarAccess.getStringOperationAccess().getRes1Assignment_0()); 
            // InternalSecureUML2Java.g:2142:2: ( rule__StringOperation__Res1Assignment_0 )
            // InternalSecureUML2Java.g:2142:3: rule__StringOperation__Res1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Res1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getRes1Assignment_0()); 

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
    // $ANTLR end "rule__StringOperation__Group__0__Impl"


    // $ANTLR start "rule__StringOperation__Group__1"
    // InternalSecureUML2Java.g:2150:1: rule__StringOperation__Group__1 : rule__StringOperation__Group__1__Impl rule__StringOperation__Group__2 ;
    public final void rule__StringOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2154:1: ( rule__StringOperation__Group__1__Impl rule__StringOperation__Group__2 )
            // InternalSecureUML2Java.g:2155:2: rule__StringOperation__Group__1__Impl rule__StringOperation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__2();

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
    // $ANTLR end "rule__StringOperation__Group__1"


    // $ANTLR start "rule__StringOperation__Group__1__Impl"
    // InternalSecureUML2Java.g:2162:1: rule__StringOperation__Group__1__Impl : ( '<--' ) ;
    public final void rule__StringOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2166:1: ( ( '<--' ) )
            // InternalSecureUML2Java.g:2167:1: ( '<--' )
            {
            // InternalSecureUML2Java.g:2167:1: ( '<--' )
            // InternalSecureUML2Java.g:2168:2: '<--'
            {
             before(grammarAccess.getStringOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__StringOperation__Group__1__Impl"


    // $ANTLR start "rule__StringOperation__Group__2"
    // InternalSecureUML2Java.g:2177:1: rule__StringOperation__Group__2 : rule__StringOperation__Group__2__Impl rule__StringOperation__Group__3 ;
    public final void rule__StringOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2181:1: ( rule__StringOperation__Group__2__Impl rule__StringOperation__Group__3 )
            // InternalSecureUML2Java.g:2182:2: rule__StringOperation__Group__2__Impl rule__StringOperation__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__StringOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__3();

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
    // $ANTLR end "rule__StringOperation__Group__2"


    // $ANTLR start "rule__StringOperation__Group__2__Impl"
    // InternalSecureUML2Java.g:2189:1: rule__StringOperation__Group__2__Impl : ( ( rule__StringOperation__Op_nameAssignment_2 ) ) ;
    public final void rule__StringOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2193:1: ( ( ( rule__StringOperation__Op_nameAssignment_2 ) ) )
            // InternalSecureUML2Java.g:2194:1: ( ( rule__StringOperation__Op_nameAssignment_2 ) )
            {
            // InternalSecureUML2Java.g:2194:1: ( ( rule__StringOperation__Op_nameAssignment_2 ) )
            // InternalSecureUML2Java.g:2195:2: ( rule__StringOperation__Op_nameAssignment_2 )
            {
             before(grammarAccess.getStringOperationAccess().getOp_nameAssignment_2()); 
            // InternalSecureUML2Java.g:2196:2: ( rule__StringOperation__Op_nameAssignment_2 )
            // InternalSecureUML2Java.g:2196:3: rule__StringOperation__Op_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Op_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getOp_nameAssignment_2()); 

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
    // $ANTLR end "rule__StringOperation__Group__2__Impl"


    // $ANTLR start "rule__StringOperation__Group__3"
    // InternalSecureUML2Java.g:2204:1: rule__StringOperation__Group__3 : rule__StringOperation__Group__3__Impl rule__StringOperation__Group__4 ;
    public final void rule__StringOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2208:1: ( rule__StringOperation__Group__3__Impl rule__StringOperation__Group__4 )
            // InternalSecureUML2Java.g:2209:2: rule__StringOperation__Group__3__Impl rule__StringOperation__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__StringOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__4();

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
    // $ANTLR end "rule__StringOperation__Group__3"


    // $ANTLR start "rule__StringOperation__Group__3__Impl"
    // InternalSecureUML2Java.g:2216:1: rule__StringOperation__Group__3__Impl : ( '(' ) ;
    public final void rule__StringOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2220:1: ( ( '(' ) )
            // InternalSecureUML2Java.g:2221:1: ( '(' )
            {
            // InternalSecureUML2Java.g:2221:1: ( '(' )
            // InternalSecureUML2Java.g:2222:2: '('
            {
             before(grammarAccess.getStringOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__StringOperation__Group__3__Impl"


    // $ANTLR start "rule__StringOperation__Group__4"
    // InternalSecureUML2Java.g:2231:1: rule__StringOperation__Group__4 : rule__StringOperation__Group__4__Impl rule__StringOperation__Group__5 ;
    public final void rule__StringOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2235:1: ( rule__StringOperation__Group__4__Impl rule__StringOperation__Group__5 )
            // InternalSecureUML2Java.g:2236:2: rule__StringOperation__Group__4__Impl rule__StringOperation__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__StringOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__5();

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
    // $ANTLR end "rule__StringOperation__Group__4"


    // $ANTLR start "rule__StringOperation__Group__4__Impl"
    // InternalSecureUML2Java.g:2243:1: rule__StringOperation__Group__4__Impl : ( ( rule__StringOperation__Group_4__0 )? ) ;
    public final void rule__StringOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2247:1: ( ( ( rule__StringOperation__Group_4__0 )? ) )
            // InternalSecureUML2Java.g:2248:1: ( ( rule__StringOperation__Group_4__0 )? )
            {
            // InternalSecureUML2Java.g:2248:1: ( ( rule__StringOperation__Group_4__0 )? )
            // InternalSecureUML2Java.g:2249:2: ( rule__StringOperation__Group_4__0 )?
            {
             before(grammarAccess.getStringOperationAccess().getGroup_4()); 
            // InternalSecureUML2Java.g:2250:2: ( rule__StringOperation__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecureUML2Java.g:2250:3: rule__StringOperation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringOperation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringOperationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__StringOperation__Group__4__Impl"


    // $ANTLR start "rule__StringOperation__Group__5"
    // InternalSecureUML2Java.g:2258:1: rule__StringOperation__Group__5 : rule__StringOperation__Group__5__Impl rule__StringOperation__Group__6 ;
    public final void rule__StringOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2262:1: ( rule__StringOperation__Group__5__Impl rule__StringOperation__Group__6 )
            // InternalSecureUML2Java.g:2263:2: rule__StringOperation__Group__5__Impl rule__StringOperation__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__StringOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__6();

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
    // $ANTLR end "rule__StringOperation__Group__5"


    // $ANTLR start "rule__StringOperation__Group__5__Impl"
    // InternalSecureUML2Java.g:2270:1: rule__StringOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__StringOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2274:1: ( ( ')' ) )
            // InternalSecureUML2Java.g:2275:1: ( ')' )
            {
            // InternalSecureUML2Java.g:2275:1: ( ')' )
            // InternalSecureUML2Java.g:2276:2: ')'
            {
             before(grammarAccess.getStringOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__StringOperation__Group__5__Impl"


    // $ANTLR start "rule__StringOperation__Group__6"
    // InternalSecureUML2Java.g:2285:1: rule__StringOperation__Group__6 : rule__StringOperation__Group__6__Impl rule__StringOperation__Group__7 ;
    public final void rule__StringOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2289:1: ( rule__StringOperation__Group__6__Impl rule__StringOperation__Group__7 )
            // InternalSecureUML2Java.g:2290:2: rule__StringOperation__Group__6__Impl rule__StringOperation__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__StringOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__7();

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
    // $ANTLR end "rule__StringOperation__Group__6"


    // $ANTLR start "rule__StringOperation__Group__6__Impl"
    // InternalSecureUML2Java.g:2297:1: rule__StringOperation__Group__6__Impl : ( '=' ) ;
    public final void rule__StringOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2301:1: ( ( '=' ) )
            // InternalSecureUML2Java.g:2302:1: ( '=' )
            {
            // InternalSecureUML2Java.g:2302:1: ( '=' )
            // InternalSecureUML2Java.g:2303:2: '='
            {
             before(grammarAccess.getStringOperationAccess().getEqualsSignKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__StringOperation__Group__6__Impl"


    // $ANTLR start "rule__StringOperation__Group__7"
    // InternalSecureUML2Java.g:2312:1: rule__StringOperation__Group__7 : rule__StringOperation__Group__7__Impl rule__StringOperation__Group__8 ;
    public final void rule__StringOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2316:1: ( rule__StringOperation__Group__7__Impl rule__StringOperation__Group__8 )
            // InternalSecureUML2Java.g:2317:2: rule__StringOperation__Group__7__Impl rule__StringOperation__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__8();

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
    // $ANTLR end "rule__StringOperation__Group__7"


    // $ANTLR start "rule__StringOperation__Group__7__Impl"
    // InternalSecureUML2Java.g:2324:1: rule__StringOperation__Group__7__Impl : ( 'PRE' ) ;
    public final void rule__StringOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2328:1: ( ( 'PRE' ) )
            // InternalSecureUML2Java.g:2329:1: ( 'PRE' )
            {
            // InternalSecureUML2Java.g:2329:1: ( 'PRE' )
            // InternalSecureUML2Java.g:2330:2: 'PRE'
            {
             before(grammarAccess.getStringOperationAccess().getPREKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getPREKeyword_7()); 

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
    // $ANTLR end "rule__StringOperation__Group__7__Impl"


    // $ANTLR start "rule__StringOperation__Group__8"
    // InternalSecureUML2Java.g:2339:1: rule__StringOperation__Group__8 : rule__StringOperation__Group__8__Impl rule__StringOperation__Group__9 ;
    public final void rule__StringOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2343:1: ( rule__StringOperation__Group__8__Impl rule__StringOperation__Group__9 )
            // InternalSecureUML2Java.g:2344:2: rule__StringOperation__Group__8__Impl rule__StringOperation__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__StringOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__9();

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
    // $ANTLR end "rule__StringOperation__Group__8"


    // $ANTLR start "rule__StringOperation__Group__8__Impl"
    // InternalSecureUML2Java.g:2351:1: rule__StringOperation__Group__8__Impl : ( ( rule__StringOperation__Group_8__0 ) ) ;
    public final void rule__StringOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2355:1: ( ( ( rule__StringOperation__Group_8__0 ) ) )
            // InternalSecureUML2Java.g:2356:1: ( ( rule__StringOperation__Group_8__0 ) )
            {
            // InternalSecureUML2Java.g:2356:1: ( ( rule__StringOperation__Group_8__0 ) )
            // InternalSecureUML2Java.g:2357:2: ( rule__StringOperation__Group_8__0 )
            {
             before(grammarAccess.getStringOperationAccess().getGroup_8()); 
            // InternalSecureUML2Java.g:2358:2: ( rule__StringOperation__Group_8__0 )
            // InternalSecureUML2Java.g:2358:3: rule__StringOperation__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getGroup_8()); 

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
    // $ANTLR end "rule__StringOperation__Group__8__Impl"


    // $ANTLR start "rule__StringOperation__Group__9"
    // InternalSecureUML2Java.g:2366:1: rule__StringOperation__Group__9 : rule__StringOperation__Group__9__Impl rule__StringOperation__Group__10 ;
    public final void rule__StringOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2370:1: ( rule__StringOperation__Group__9__Impl rule__StringOperation__Group__10 )
            // InternalSecureUML2Java.g:2371:2: rule__StringOperation__Group__9__Impl rule__StringOperation__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__StringOperation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__10();

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
    // $ANTLR end "rule__StringOperation__Group__9"


    // $ANTLR start "rule__StringOperation__Group__9__Impl"
    // InternalSecureUML2Java.g:2378:1: rule__StringOperation__Group__9__Impl : ( 'THEN' ) ;
    public final void rule__StringOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2382:1: ( ( 'THEN' ) )
            // InternalSecureUML2Java.g:2383:1: ( 'THEN' )
            {
            // InternalSecureUML2Java.g:2383:1: ( 'THEN' )
            // InternalSecureUML2Java.g:2384:2: 'THEN'
            {
             before(grammarAccess.getStringOperationAccess().getTHENKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getTHENKeyword_9()); 

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
    // $ANTLR end "rule__StringOperation__Group__9__Impl"


    // $ANTLR start "rule__StringOperation__Group__10"
    // InternalSecureUML2Java.g:2393:1: rule__StringOperation__Group__10 : rule__StringOperation__Group__10__Impl rule__StringOperation__Group__11 ;
    public final void rule__StringOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2397:1: ( rule__StringOperation__Group__10__Impl rule__StringOperation__Group__11 )
            // InternalSecureUML2Java.g:2398:2: rule__StringOperation__Group__10__Impl rule__StringOperation__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__11();

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
    // $ANTLR end "rule__StringOperation__Group__10"


    // $ANTLR start "rule__StringOperation__Group__10__Impl"
    // InternalSecureUML2Java.g:2405:1: rule__StringOperation__Group__10__Impl : ( 'IF' ) ;
    public final void rule__StringOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2409:1: ( ( 'IF' ) )
            // InternalSecureUML2Java.g:2410:1: ( 'IF' )
            {
            // InternalSecureUML2Java.g:2410:1: ( 'IF' )
            // InternalSecureUML2Java.g:2411:2: 'IF'
            {
             before(grammarAccess.getStringOperationAccess().getIFKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getIFKeyword_10()); 

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
    // $ANTLR end "rule__StringOperation__Group__10__Impl"


    // $ANTLR start "rule__StringOperation__Group__11"
    // InternalSecureUML2Java.g:2420:1: rule__StringOperation__Group__11 : rule__StringOperation__Group__11__Impl rule__StringOperation__Group__12 ;
    public final void rule__StringOperation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2424:1: ( rule__StringOperation__Group__11__Impl rule__StringOperation__Group__12 )
            // InternalSecureUML2Java.g:2425:2: rule__StringOperation__Group__11__Impl rule__StringOperation__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__StringOperation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__12();

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
    // $ANTLR end "rule__StringOperation__Group__11"


    // $ANTLR start "rule__StringOperation__Group__11__Impl"
    // InternalSecureUML2Java.g:2432:1: rule__StringOperation__Group__11__Impl : ( ( rule__StringOperation__Pres1Assignment_11 ) ) ;
    public final void rule__StringOperation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2436:1: ( ( ( rule__StringOperation__Pres1Assignment_11 ) ) )
            // InternalSecureUML2Java.g:2437:1: ( ( rule__StringOperation__Pres1Assignment_11 ) )
            {
            // InternalSecureUML2Java.g:2437:1: ( ( rule__StringOperation__Pres1Assignment_11 ) )
            // InternalSecureUML2Java.g:2438:2: ( rule__StringOperation__Pres1Assignment_11 )
            {
             before(grammarAccess.getStringOperationAccess().getPres1Assignment_11()); 
            // InternalSecureUML2Java.g:2439:2: ( rule__StringOperation__Pres1Assignment_11 )
            // InternalSecureUML2Java.g:2439:3: rule__StringOperation__Pres1Assignment_11
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Pres1Assignment_11();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getPres1Assignment_11()); 

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
    // $ANTLR end "rule__StringOperation__Group__11__Impl"


    // $ANTLR start "rule__StringOperation__Group__12"
    // InternalSecureUML2Java.g:2447:1: rule__StringOperation__Group__12 : rule__StringOperation__Group__12__Impl rule__StringOperation__Group__13 ;
    public final void rule__StringOperation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2451:1: ( rule__StringOperation__Group__12__Impl rule__StringOperation__Group__13 )
            // InternalSecureUML2Java.g:2452:2: rule__StringOperation__Group__12__Impl rule__StringOperation__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__StringOperation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__13();

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
    // $ANTLR end "rule__StringOperation__Group__12"


    // $ANTLR start "rule__StringOperation__Group__12__Impl"
    // InternalSecureUML2Java.g:2459:1: rule__StringOperation__Group__12__Impl : ( ( rule__StringOperation__Group_12__0 )* ) ;
    public final void rule__StringOperation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2463:1: ( ( ( rule__StringOperation__Group_12__0 )* ) )
            // InternalSecureUML2Java.g:2464:1: ( ( rule__StringOperation__Group_12__0 )* )
            {
            // InternalSecureUML2Java.g:2464:1: ( ( rule__StringOperation__Group_12__0 )* )
            // InternalSecureUML2Java.g:2465:2: ( rule__StringOperation__Group_12__0 )*
            {
             before(grammarAccess.getStringOperationAccess().getGroup_12()); 
            // InternalSecureUML2Java.g:2466:2: ( rule__StringOperation__Group_12__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSecureUML2Java.g:2466:3: rule__StringOperation__Group_12__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StringOperation__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getStringOperationAccess().getGroup_12()); 

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
    // $ANTLR end "rule__StringOperation__Group__12__Impl"


    // $ANTLR start "rule__StringOperation__Group__13"
    // InternalSecureUML2Java.g:2474:1: rule__StringOperation__Group__13 : rule__StringOperation__Group__13__Impl rule__StringOperation__Group__14 ;
    public final void rule__StringOperation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2478:1: ( rule__StringOperation__Group__13__Impl rule__StringOperation__Group__14 )
            // InternalSecureUML2Java.g:2479:2: rule__StringOperation__Group__13__Impl rule__StringOperation__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__StringOperation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__14();

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
    // $ANTLR end "rule__StringOperation__Group__13"


    // $ANTLR start "rule__StringOperation__Group__13__Impl"
    // InternalSecureUML2Java.g:2486:1: rule__StringOperation__Group__13__Impl : ( 'THEN' ) ;
    public final void rule__StringOperation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2490:1: ( ( 'THEN' ) )
            // InternalSecureUML2Java.g:2491:1: ( 'THEN' )
            {
            // InternalSecureUML2Java.g:2491:1: ( 'THEN' )
            // InternalSecureUML2Java.g:2492:2: 'THEN'
            {
             before(grammarAccess.getStringOperationAccess().getTHENKeyword_13()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getTHENKeyword_13()); 

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
    // $ANTLR end "rule__StringOperation__Group__13__Impl"


    // $ANTLR start "rule__StringOperation__Group__14"
    // InternalSecureUML2Java.g:2501:1: rule__StringOperation__Group__14 : rule__StringOperation__Group__14__Impl rule__StringOperation__Group__15 ;
    public final void rule__StringOperation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2505:1: ( rule__StringOperation__Group__14__Impl rule__StringOperation__Group__15 )
            // InternalSecureUML2Java.g:2506:2: rule__StringOperation__Group__14__Impl rule__StringOperation__Group__15
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__15();

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
    // $ANTLR end "rule__StringOperation__Group__14"


    // $ANTLR start "rule__StringOperation__Group__14__Impl"
    // InternalSecureUML2Java.g:2513:1: rule__StringOperation__Group__14__Impl : ( 'IF' ) ;
    public final void rule__StringOperation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2517:1: ( ( 'IF' ) )
            // InternalSecureUML2Java.g:2518:1: ( 'IF' )
            {
            // InternalSecureUML2Java.g:2518:1: ( 'IF' )
            // InternalSecureUML2Java.g:2519:2: 'IF'
            {
             before(grammarAccess.getStringOperationAccess().getIFKeyword_14()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getIFKeyword_14()); 

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
    // $ANTLR end "rule__StringOperation__Group__14__Impl"


    // $ANTLR start "rule__StringOperation__Group__15"
    // InternalSecureUML2Java.g:2528:1: rule__StringOperation__Group__15 : rule__StringOperation__Group__15__Impl rule__StringOperation__Group__16 ;
    public final void rule__StringOperation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2532:1: ( rule__StringOperation__Group__15__Impl rule__StringOperation__Group__16 )
            // InternalSecureUML2Java.g:2533:2: rule__StringOperation__Group__15__Impl rule__StringOperation__Group__16
            {
            pushFollow(FOLLOW_19);
            rule__StringOperation__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__16();

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
    // $ANTLR end "rule__StringOperation__Group__15"


    // $ANTLR start "rule__StringOperation__Group__15__Impl"
    // InternalSecureUML2Java.g:2540:1: rule__StringOperation__Group__15__Impl : ( ( rule__StringOperation__Pres2Assignment_15 ) ) ;
    public final void rule__StringOperation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2544:1: ( ( ( rule__StringOperation__Pres2Assignment_15 ) ) )
            // InternalSecureUML2Java.g:2545:1: ( ( rule__StringOperation__Pres2Assignment_15 ) )
            {
            // InternalSecureUML2Java.g:2545:1: ( ( rule__StringOperation__Pres2Assignment_15 ) )
            // InternalSecureUML2Java.g:2546:2: ( rule__StringOperation__Pres2Assignment_15 )
            {
             before(grammarAccess.getStringOperationAccess().getPres2Assignment_15()); 
            // InternalSecureUML2Java.g:2547:2: ( rule__StringOperation__Pres2Assignment_15 )
            // InternalSecureUML2Java.g:2547:3: rule__StringOperation__Pres2Assignment_15
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Pres2Assignment_15();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getPres2Assignment_15()); 

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
    // $ANTLR end "rule__StringOperation__Group__15__Impl"


    // $ANTLR start "rule__StringOperation__Group__16"
    // InternalSecureUML2Java.g:2555:1: rule__StringOperation__Group__16 : rule__StringOperation__Group__16__Impl rule__StringOperation__Group__17 ;
    public final void rule__StringOperation__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2559:1: ( rule__StringOperation__Group__16__Impl rule__StringOperation__Group__17 )
            // InternalSecureUML2Java.g:2560:2: rule__StringOperation__Group__16__Impl rule__StringOperation__Group__17
            {
            pushFollow(FOLLOW_19);
            rule__StringOperation__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__17();

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
    // $ANTLR end "rule__StringOperation__Group__16"


    // $ANTLR start "rule__StringOperation__Group__16__Impl"
    // InternalSecureUML2Java.g:2567:1: rule__StringOperation__Group__16__Impl : ( ( rule__StringOperation__Group_16__0 )* ) ;
    public final void rule__StringOperation__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2571:1: ( ( ( rule__StringOperation__Group_16__0 )* ) )
            // InternalSecureUML2Java.g:2572:1: ( ( rule__StringOperation__Group_16__0 )* )
            {
            // InternalSecureUML2Java.g:2572:1: ( ( rule__StringOperation__Group_16__0 )* )
            // InternalSecureUML2Java.g:2573:2: ( rule__StringOperation__Group_16__0 )*
            {
             before(grammarAccess.getStringOperationAccess().getGroup_16()); 
            // InternalSecureUML2Java.g:2574:2: ( rule__StringOperation__Group_16__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSecureUML2Java.g:2574:3: rule__StringOperation__Group_16__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StringOperation__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStringOperationAccess().getGroup_16()); 

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
    // $ANTLR end "rule__StringOperation__Group__16__Impl"


    // $ANTLR start "rule__StringOperation__Group__17"
    // InternalSecureUML2Java.g:2582:1: rule__StringOperation__Group__17 : rule__StringOperation__Group__17__Impl rule__StringOperation__Group__18 ;
    public final void rule__StringOperation__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2586:1: ( rule__StringOperation__Group__17__Impl rule__StringOperation__Group__18 )
            // InternalSecureUML2Java.g:2587:2: rule__StringOperation__Group__17__Impl rule__StringOperation__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__18();

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
    // $ANTLR end "rule__StringOperation__Group__17"


    // $ANTLR start "rule__StringOperation__Group__17__Impl"
    // InternalSecureUML2Java.g:2594:1: rule__StringOperation__Group__17__Impl : ( 'THEN' ) ;
    public final void rule__StringOperation__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2598:1: ( ( 'THEN' ) )
            // InternalSecureUML2Java.g:2599:1: ( 'THEN' )
            {
            // InternalSecureUML2Java.g:2599:1: ( 'THEN' )
            // InternalSecureUML2Java.g:2600:2: 'THEN'
            {
             before(grammarAccess.getStringOperationAccess().getTHENKeyword_17()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getTHENKeyword_17()); 

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
    // $ANTLR end "rule__StringOperation__Group__17__Impl"


    // $ANTLR start "rule__StringOperation__Group__18"
    // InternalSecureUML2Java.g:2609:1: rule__StringOperation__Group__18 : rule__StringOperation__Group__18__Impl rule__StringOperation__Group__19 ;
    public final void rule__StringOperation__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2613:1: ( rule__StringOperation__Group__18__Impl rule__StringOperation__Group__19 )
            // InternalSecureUML2Java.g:2614:2: rule__StringOperation__Group__18__Impl rule__StringOperation__Group__19
            {
            pushFollow(FOLLOW_26);
            rule__StringOperation__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__19();

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
    // $ANTLR end "rule__StringOperation__Group__18"


    // $ANTLR start "rule__StringOperation__Group__18__Impl"
    // InternalSecureUML2Java.g:2621:1: rule__StringOperation__Group__18__Impl : ( ( rule__StringOperation__SubifAssignment_18 ) ) ;
    public final void rule__StringOperation__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2625:1: ( ( ( rule__StringOperation__SubifAssignment_18 ) ) )
            // InternalSecureUML2Java.g:2626:1: ( ( rule__StringOperation__SubifAssignment_18 ) )
            {
            // InternalSecureUML2Java.g:2626:1: ( ( rule__StringOperation__SubifAssignment_18 ) )
            // InternalSecureUML2Java.g:2627:2: ( rule__StringOperation__SubifAssignment_18 )
            {
             before(grammarAccess.getStringOperationAccess().getSubifAssignment_18()); 
            // InternalSecureUML2Java.g:2628:2: ( rule__StringOperation__SubifAssignment_18 )
            // InternalSecureUML2Java.g:2628:3: rule__StringOperation__SubifAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__SubifAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getSubifAssignment_18()); 

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
    // $ANTLR end "rule__StringOperation__Group__18__Impl"


    // $ANTLR start "rule__StringOperation__Group__19"
    // InternalSecureUML2Java.g:2636:1: rule__StringOperation__Group__19 : rule__StringOperation__Group__19__Impl rule__StringOperation__Group__20 ;
    public final void rule__StringOperation__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2640:1: ( rule__StringOperation__Group__19__Impl rule__StringOperation__Group__20 )
            // InternalSecureUML2Java.g:2641:2: rule__StringOperation__Group__19__Impl rule__StringOperation__Group__20
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__20();

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
    // $ANTLR end "rule__StringOperation__Group__19"


    // $ANTLR start "rule__StringOperation__Group__19__Impl"
    // InternalSecureUML2Java.g:2648:1: rule__StringOperation__Group__19__Impl : ( 'ELSE' ) ;
    public final void rule__StringOperation__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2652:1: ( ( 'ELSE' ) )
            // InternalSecureUML2Java.g:2653:1: ( 'ELSE' )
            {
            // InternalSecureUML2Java.g:2653:1: ( 'ELSE' )
            // InternalSecureUML2Java.g:2654:2: 'ELSE'
            {
             before(grammarAccess.getStringOperationAccess().getELSEKeyword_19()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getELSEKeyword_19()); 

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
    // $ANTLR end "rule__StringOperation__Group__19__Impl"


    // $ANTLR start "rule__StringOperation__Group__20"
    // InternalSecureUML2Java.g:2663:1: rule__StringOperation__Group__20 : rule__StringOperation__Group__20__Impl rule__StringOperation__Group__21 ;
    public final void rule__StringOperation__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2667:1: ( rule__StringOperation__Group__20__Impl rule__StringOperation__Group__21 )
            // InternalSecureUML2Java.g:2668:2: rule__StringOperation__Group__20__Impl rule__StringOperation__Group__21
            {
            pushFollow(FOLLOW_27);
            rule__StringOperation__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__21();

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
    // $ANTLR end "rule__StringOperation__Group__20"


    // $ANTLR start "rule__StringOperation__Group__20__Impl"
    // InternalSecureUML2Java.g:2675:1: rule__StringOperation__Group__20__Impl : ( ( rule__StringOperation__Subelse2Assignment_20 ) ) ;
    public final void rule__StringOperation__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2679:1: ( ( ( rule__StringOperation__Subelse2Assignment_20 ) ) )
            // InternalSecureUML2Java.g:2680:1: ( ( rule__StringOperation__Subelse2Assignment_20 ) )
            {
            // InternalSecureUML2Java.g:2680:1: ( ( rule__StringOperation__Subelse2Assignment_20 ) )
            // InternalSecureUML2Java.g:2681:2: ( rule__StringOperation__Subelse2Assignment_20 )
            {
             before(grammarAccess.getStringOperationAccess().getSubelse2Assignment_20()); 
            // InternalSecureUML2Java.g:2682:2: ( rule__StringOperation__Subelse2Assignment_20 )
            // InternalSecureUML2Java.g:2682:3: rule__StringOperation__Subelse2Assignment_20
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Subelse2Assignment_20();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getSubelse2Assignment_20()); 

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
    // $ANTLR end "rule__StringOperation__Group__20__Impl"


    // $ANTLR start "rule__StringOperation__Group__21"
    // InternalSecureUML2Java.g:2690:1: rule__StringOperation__Group__21 : rule__StringOperation__Group__21__Impl rule__StringOperation__Group__22 ;
    public final void rule__StringOperation__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2694:1: ( rule__StringOperation__Group__21__Impl rule__StringOperation__Group__22 )
            // InternalSecureUML2Java.g:2695:2: rule__StringOperation__Group__21__Impl rule__StringOperation__Group__22
            {
            pushFollow(FOLLOW_26);
            rule__StringOperation__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__22();

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
    // $ANTLR end "rule__StringOperation__Group__21"


    // $ANTLR start "rule__StringOperation__Group__21__Impl"
    // InternalSecureUML2Java.g:2702:1: rule__StringOperation__Group__21__Impl : ( 'END' ) ;
    public final void rule__StringOperation__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2706:1: ( ( 'END' ) )
            // InternalSecureUML2Java.g:2707:1: ( 'END' )
            {
            // InternalSecureUML2Java.g:2707:1: ( 'END' )
            // InternalSecureUML2Java.g:2708:2: 'END'
            {
             before(grammarAccess.getStringOperationAccess().getENDKeyword_21()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getENDKeyword_21()); 

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
    // $ANTLR end "rule__StringOperation__Group__21__Impl"


    // $ANTLR start "rule__StringOperation__Group__22"
    // InternalSecureUML2Java.g:2717:1: rule__StringOperation__Group__22 : rule__StringOperation__Group__22__Impl rule__StringOperation__Group__23 ;
    public final void rule__StringOperation__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2721:1: ( rule__StringOperation__Group__22__Impl rule__StringOperation__Group__23 )
            // InternalSecureUML2Java.g:2722:2: rule__StringOperation__Group__22__Impl rule__StringOperation__Group__23
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__23();

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
    // $ANTLR end "rule__StringOperation__Group__22"


    // $ANTLR start "rule__StringOperation__Group__22__Impl"
    // InternalSecureUML2Java.g:2729:1: rule__StringOperation__Group__22__Impl : ( 'ELSE' ) ;
    public final void rule__StringOperation__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2733:1: ( ( 'ELSE' ) )
            // InternalSecureUML2Java.g:2734:1: ( 'ELSE' )
            {
            // InternalSecureUML2Java.g:2734:1: ( 'ELSE' )
            // InternalSecureUML2Java.g:2735:2: 'ELSE'
            {
             before(grammarAccess.getStringOperationAccess().getELSEKeyword_22()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getELSEKeyword_22()); 

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
    // $ANTLR end "rule__StringOperation__Group__22__Impl"


    // $ANTLR start "rule__StringOperation__Group__23"
    // InternalSecureUML2Java.g:2744:1: rule__StringOperation__Group__23 : rule__StringOperation__Group__23__Impl rule__StringOperation__Group__24 ;
    public final void rule__StringOperation__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2748:1: ( rule__StringOperation__Group__23__Impl rule__StringOperation__Group__24 )
            // InternalSecureUML2Java.g:2749:2: rule__StringOperation__Group__23__Impl rule__StringOperation__Group__24
            {
            pushFollow(FOLLOW_27);
            rule__StringOperation__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__24();

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
    // $ANTLR end "rule__StringOperation__Group__23"


    // $ANTLR start "rule__StringOperation__Group__23__Impl"
    // InternalSecureUML2Java.g:2756:1: rule__StringOperation__Group__23__Impl : ( ( rule__StringOperation__Subelse1Assignment_23 ) ) ;
    public final void rule__StringOperation__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2760:1: ( ( ( rule__StringOperation__Subelse1Assignment_23 ) ) )
            // InternalSecureUML2Java.g:2761:1: ( ( rule__StringOperation__Subelse1Assignment_23 ) )
            {
            // InternalSecureUML2Java.g:2761:1: ( ( rule__StringOperation__Subelse1Assignment_23 ) )
            // InternalSecureUML2Java.g:2762:2: ( rule__StringOperation__Subelse1Assignment_23 )
            {
             before(grammarAccess.getStringOperationAccess().getSubelse1Assignment_23()); 
            // InternalSecureUML2Java.g:2763:2: ( rule__StringOperation__Subelse1Assignment_23 )
            // InternalSecureUML2Java.g:2763:3: rule__StringOperation__Subelse1Assignment_23
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Subelse1Assignment_23();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getSubelse1Assignment_23()); 

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
    // $ANTLR end "rule__StringOperation__Group__23__Impl"


    // $ANTLR start "rule__StringOperation__Group__24"
    // InternalSecureUML2Java.g:2771:1: rule__StringOperation__Group__24 : rule__StringOperation__Group__24__Impl rule__StringOperation__Group__25 ;
    public final void rule__StringOperation__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2775:1: ( rule__StringOperation__Group__24__Impl rule__StringOperation__Group__25 )
            // InternalSecureUML2Java.g:2776:2: rule__StringOperation__Group__24__Impl rule__StringOperation__Group__25
            {
            pushFollow(FOLLOW_27);
            rule__StringOperation__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__25();

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
    // $ANTLR end "rule__StringOperation__Group__24"


    // $ANTLR start "rule__StringOperation__Group__24__Impl"
    // InternalSecureUML2Java.g:2783:1: rule__StringOperation__Group__24__Impl : ( 'END' ) ;
    public final void rule__StringOperation__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2787:1: ( ( 'END' ) )
            // InternalSecureUML2Java.g:2788:1: ( 'END' )
            {
            // InternalSecureUML2Java.g:2788:1: ( 'END' )
            // InternalSecureUML2Java.g:2789:2: 'END'
            {
             before(grammarAccess.getStringOperationAccess().getENDKeyword_24()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getENDKeyword_24()); 

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
    // $ANTLR end "rule__StringOperation__Group__24__Impl"


    // $ANTLR start "rule__StringOperation__Group__25"
    // InternalSecureUML2Java.g:2798:1: rule__StringOperation__Group__25 : rule__StringOperation__Group__25__Impl ;
    public final void rule__StringOperation__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2802:1: ( rule__StringOperation__Group__25__Impl )
            // InternalSecureUML2Java.g:2803:2: rule__StringOperation__Group__25__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__25__Impl();

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
    // $ANTLR end "rule__StringOperation__Group__25"


    // $ANTLR start "rule__StringOperation__Group__25__Impl"
    // InternalSecureUML2Java.g:2809:1: rule__StringOperation__Group__25__Impl : ( 'END' ) ;
    public final void rule__StringOperation__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2813:1: ( ( 'END' ) )
            // InternalSecureUML2Java.g:2814:1: ( 'END' )
            {
            // InternalSecureUML2Java.g:2814:1: ( 'END' )
            // InternalSecureUML2Java.g:2815:2: 'END'
            {
             before(grammarAccess.getStringOperationAccess().getENDKeyword_25()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getENDKeyword_25()); 

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
    // $ANTLR end "rule__StringOperation__Group__25__Impl"


    // $ANTLR start "rule__StringOperation__Group_4__0"
    // InternalSecureUML2Java.g:2825:1: rule__StringOperation__Group_4__0 : rule__StringOperation__Group_4__0__Impl rule__StringOperation__Group_4__1 ;
    public final void rule__StringOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2829:1: ( rule__StringOperation__Group_4__0__Impl rule__StringOperation__Group_4__1 )
            // InternalSecureUML2Java.g:2830:2: rule__StringOperation__Group_4__0__Impl rule__StringOperation__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__StringOperation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_4__1();

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
    // $ANTLR end "rule__StringOperation__Group_4__0"


    // $ANTLR start "rule__StringOperation__Group_4__0__Impl"
    // InternalSecureUML2Java.g:2837:1: rule__StringOperation__Group_4__0__Impl : ( ( rule__StringOperation__PListAssignment_4_0 ) ) ;
    public final void rule__StringOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2841:1: ( ( ( rule__StringOperation__PListAssignment_4_0 ) ) )
            // InternalSecureUML2Java.g:2842:1: ( ( rule__StringOperation__PListAssignment_4_0 ) )
            {
            // InternalSecureUML2Java.g:2842:1: ( ( rule__StringOperation__PListAssignment_4_0 ) )
            // InternalSecureUML2Java.g:2843:2: ( rule__StringOperation__PListAssignment_4_0 )
            {
             before(grammarAccess.getStringOperationAccess().getPListAssignment_4_0()); 
            // InternalSecureUML2Java.g:2844:2: ( rule__StringOperation__PListAssignment_4_0 )
            // InternalSecureUML2Java.g:2844:3: rule__StringOperation__PListAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__PListAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getPListAssignment_4_0()); 

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
    // $ANTLR end "rule__StringOperation__Group_4__0__Impl"


    // $ANTLR start "rule__StringOperation__Group_4__1"
    // InternalSecureUML2Java.g:2852:1: rule__StringOperation__Group_4__1 : rule__StringOperation__Group_4__1__Impl ;
    public final void rule__StringOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2856:1: ( rule__StringOperation__Group_4__1__Impl )
            // InternalSecureUML2Java.g:2857:2: rule__StringOperation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_4__1__Impl();

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
    // $ANTLR end "rule__StringOperation__Group_4__1"


    // $ANTLR start "rule__StringOperation__Group_4__1__Impl"
    // InternalSecureUML2Java.g:2863:1: rule__StringOperation__Group_4__1__Impl : ( ( rule__StringOperation__Group_4_1__0 )* ) ;
    public final void rule__StringOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2867:1: ( ( ( rule__StringOperation__Group_4_1__0 )* ) )
            // InternalSecureUML2Java.g:2868:1: ( ( rule__StringOperation__Group_4_1__0 )* )
            {
            // InternalSecureUML2Java.g:2868:1: ( ( rule__StringOperation__Group_4_1__0 )* )
            // InternalSecureUML2Java.g:2869:2: ( rule__StringOperation__Group_4_1__0 )*
            {
             before(grammarAccess.getStringOperationAccess().getGroup_4_1()); 
            // InternalSecureUML2Java.g:2870:2: ( rule__StringOperation__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSecureUML2Java.g:2870:3: rule__StringOperation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StringOperation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStringOperationAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__StringOperation__Group_4__1__Impl"


    // $ANTLR start "rule__StringOperation__Group_4_1__0"
    // InternalSecureUML2Java.g:2879:1: rule__StringOperation__Group_4_1__0 : rule__StringOperation__Group_4_1__0__Impl rule__StringOperation__Group_4_1__1 ;
    public final void rule__StringOperation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2883:1: ( rule__StringOperation__Group_4_1__0__Impl rule__StringOperation__Group_4_1__1 )
            // InternalSecureUML2Java.g:2884:2: rule__StringOperation__Group_4_1__0__Impl rule__StringOperation__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_4_1__1();

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
    // $ANTLR end "rule__StringOperation__Group_4_1__0"


    // $ANTLR start "rule__StringOperation__Group_4_1__0__Impl"
    // InternalSecureUML2Java.g:2891:1: rule__StringOperation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__StringOperation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2895:1: ( ( ',' ) )
            // InternalSecureUML2Java.g:2896:1: ( ',' )
            {
            // InternalSecureUML2Java.g:2896:1: ( ',' )
            // InternalSecureUML2Java.g:2897:2: ','
            {
             before(grammarAccess.getStringOperationAccess().getCommaKeyword_4_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__StringOperation__Group_4_1__0__Impl"


    // $ANTLR start "rule__StringOperation__Group_4_1__1"
    // InternalSecureUML2Java.g:2906:1: rule__StringOperation__Group_4_1__1 : rule__StringOperation__Group_4_1__1__Impl ;
    public final void rule__StringOperation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2910:1: ( rule__StringOperation__Group_4_1__1__Impl )
            // InternalSecureUML2Java.g:2911:2: rule__StringOperation__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__StringOperation__Group_4_1__1"


    // $ANTLR start "rule__StringOperation__Group_4_1__1__Impl"
    // InternalSecureUML2Java.g:2917:1: rule__StringOperation__Group_4_1__1__Impl : ( ( rule__StringOperation__PListAssignment_4_1_1 ) ) ;
    public final void rule__StringOperation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2921:1: ( ( ( rule__StringOperation__PListAssignment_4_1_1 ) ) )
            // InternalSecureUML2Java.g:2922:1: ( ( rule__StringOperation__PListAssignment_4_1_1 ) )
            {
            // InternalSecureUML2Java.g:2922:1: ( ( rule__StringOperation__PListAssignment_4_1_1 ) )
            // InternalSecureUML2Java.g:2923:2: ( rule__StringOperation__PListAssignment_4_1_1 )
            {
             before(grammarAccess.getStringOperationAccess().getPListAssignment_4_1_1()); 
            // InternalSecureUML2Java.g:2924:2: ( rule__StringOperation__PListAssignment_4_1_1 )
            // InternalSecureUML2Java.g:2924:3: rule__StringOperation__PListAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__PListAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getPListAssignment_4_1_1()); 

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
    // $ANTLR end "rule__StringOperation__Group_4_1__1__Impl"


    // $ANTLR start "rule__StringOperation__Group_8__0"
    // InternalSecureUML2Java.g:2933:1: rule__StringOperation__Group_8__0 : rule__StringOperation__Group_8__0__Impl rule__StringOperation__Group_8__1 ;
    public final void rule__StringOperation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2937:1: ( rule__StringOperation__Group_8__0__Impl rule__StringOperation__Group_8__1 )
            // InternalSecureUML2Java.g:2938:2: rule__StringOperation__Group_8__0__Impl rule__StringOperation__Group_8__1
            {
            pushFollow(FOLLOW_22);
            rule__StringOperation__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_8__1();

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
    // $ANTLR end "rule__StringOperation__Group_8__0"


    // $ANTLR start "rule__StringOperation__Group_8__0__Impl"
    // InternalSecureUML2Java.g:2945:1: rule__StringOperation__Group_8__0__Impl : ( ( rule__StringOperation__ParamsAssignment_8_0 ) ) ;
    public final void rule__StringOperation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2949:1: ( ( ( rule__StringOperation__ParamsAssignment_8_0 ) ) )
            // InternalSecureUML2Java.g:2950:1: ( ( rule__StringOperation__ParamsAssignment_8_0 ) )
            {
            // InternalSecureUML2Java.g:2950:1: ( ( rule__StringOperation__ParamsAssignment_8_0 ) )
            // InternalSecureUML2Java.g:2951:2: ( rule__StringOperation__ParamsAssignment_8_0 )
            {
             before(grammarAccess.getStringOperationAccess().getParamsAssignment_8_0()); 
            // InternalSecureUML2Java.g:2952:2: ( rule__StringOperation__ParamsAssignment_8_0 )
            // InternalSecureUML2Java.g:2952:3: rule__StringOperation__ParamsAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__ParamsAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getParamsAssignment_8_0()); 

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
    // $ANTLR end "rule__StringOperation__Group_8__0__Impl"


    // $ANTLR start "rule__StringOperation__Group_8__1"
    // InternalSecureUML2Java.g:2960:1: rule__StringOperation__Group_8__1 : rule__StringOperation__Group_8__1__Impl ;
    public final void rule__StringOperation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2964:1: ( rule__StringOperation__Group_8__1__Impl )
            // InternalSecureUML2Java.g:2965:2: rule__StringOperation__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_8__1__Impl();

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
    // $ANTLR end "rule__StringOperation__Group_8__1"


    // $ANTLR start "rule__StringOperation__Group_8__1__Impl"
    // InternalSecureUML2Java.g:2971:1: rule__StringOperation__Group_8__1__Impl : ( ( rule__StringOperation__Group_8_1__0 )* ) ;
    public final void rule__StringOperation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2975:1: ( ( ( rule__StringOperation__Group_8_1__0 )* ) )
            // InternalSecureUML2Java.g:2976:1: ( ( rule__StringOperation__Group_8_1__0 )* )
            {
            // InternalSecureUML2Java.g:2976:1: ( ( rule__StringOperation__Group_8_1__0 )* )
            // InternalSecureUML2Java.g:2977:2: ( rule__StringOperation__Group_8_1__0 )*
            {
             before(grammarAccess.getStringOperationAccess().getGroup_8_1()); 
            // InternalSecureUML2Java.g:2978:2: ( rule__StringOperation__Group_8_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSecureUML2Java.g:2978:3: rule__StringOperation__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StringOperation__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getStringOperationAccess().getGroup_8_1()); 

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
    // $ANTLR end "rule__StringOperation__Group_8__1__Impl"


    // $ANTLR start "rule__StringOperation__Group_8_1__0"
    // InternalSecureUML2Java.g:2987:1: rule__StringOperation__Group_8_1__0 : rule__StringOperation__Group_8_1__0__Impl rule__StringOperation__Group_8_1__1 ;
    public final void rule__StringOperation__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:2991:1: ( rule__StringOperation__Group_8_1__0__Impl rule__StringOperation__Group_8_1__1 )
            // InternalSecureUML2Java.g:2992:2: rule__StringOperation__Group_8_1__0__Impl rule__StringOperation__Group_8_1__1
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_8_1__1();

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
    // $ANTLR end "rule__StringOperation__Group_8_1__0"


    // $ANTLR start "rule__StringOperation__Group_8_1__0__Impl"
    // InternalSecureUML2Java.g:2999:1: rule__StringOperation__Group_8_1__0__Impl : ( '&' ) ;
    public final void rule__StringOperation__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3003:1: ( ( '&' ) )
            // InternalSecureUML2Java.g:3004:1: ( '&' )
            {
            // InternalSecureUML2Java.g:3004:1: ( '&' )
            // InternalSecureUML2Java.g:3005:2: '&'
            {
             before(grammarAccess.getStringOperationAccess().getAmpersandKeyword_8_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getAmpersandKeyword_8_1_0()); 

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
    // $ANTLR end "rule__StringOperation__Group_8_1__0__Impl"


    // $ANTLR start "rule__StringOperation__Group_8_1__1"
    // InternalSecureUML2Java.g:3014:1: rule__StringOperation__Group_8_1__1 : rule__StringOperation__Group_8_1__1__Impl ;
    public final void rule__StringOperation__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3018:1: ( rule__StringOperation__Group_8_1__1__Impl )
            // InternalSecureUML2Java.g:3019:2: rule__StringOperation__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_8_1__1__Impl();

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
    // $ANTLR end "rule__StringOperation__Group_8_1__1"


    // $ANTLR start "rule__StringOperation__Group_8_1__1__Impl"
    // InternalSecureUML2Java.g:3025:1: rule__StringOperation__Group_8_1__1__Impl : ( ( rule__StringOperation__ParamsAssignment_8_1_1 ) ) ;
    public final void rule__StringOperation__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3029:1: ( ( ( rule__StringOperation__ParamsAssignment_8_1_1 ) ) )
            // InternalSecureUML2Java.g:3030:1: ( ( rule__StringOperation__ParamsAssignment_8_1_1 ) )
            {
            // InternalSecureUML2Java.g:3030:1: ( ( rule__StringOperation__ParamsAssignment_8_1_1 ) )
            // InternalSecureUML2Java.g:3031:2: ( rule__StringOperation__ParamsAssignment_8_1_1 )
            {
             before(grammarAccess.getStringOperationAccess().getParamsAssignment_8_1_1()); 
            // InternalSecureUML2Java.g:3032:2: ( rule__StringOperation__ParamsAssignment_8_1_1 )
            // InternalSecureUML2Java.g:3032:3: rule__StringOperation__ParamsAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__ParamsAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getParamsAssignment_8_1_1()); 

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
    // $ANTLR end "rule__StringOperation__Group_8_1__1__Impl"


    // $ANTLR start "rule__StringOperation__Group_12__0"
    // InternalSecureUML2Java.g:3041:1: rule__StringOperation__Group_12__0 : rule__StringOperation__Group_12__0__Impl rule__StringOperation__Group_12__1 ;
    public final void rule__StringOperation__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3045:1: ( rule__StringOperation__Group_12__0__Impl rule__StringOperation__Group_12__1 )
            // InternalSecureUML2Java.g:3046:2: rule__StringOperation__Group_12__0__Impl rule__StringOperation__Group_12__1
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_12__1();

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
    // $ANTLR end "rule__StringOperation__Group_12__0"


    // $ANTLR start "rule__StringOperation__Group_12__0__Impl"
    // InternalSecureUML2Java.g:3053:1: rule__StringOperation__Group_12__0__Impl : ( '&' ) ;
    public final void rule__StringOperation__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3057:1: ( ( '&' ) )
            // InternalSecureUML2Java.g:3058:1: ( '&' )
            {
            // InternalSecureUML2Java.g:3058:1: ( '&' )
            // InternalSecureUML2Java.g:3059:2: '&'
            {
             before(grammarAccess.getStringOperationAccess().getAmpersandKeyword_12_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getAmpersandKeyword_12_0()); 

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
    // $ANTLR end "rule__StringOperation__Group_12__0__Impl"


    // $ANTLR start "rule__StringOperation__Group_12__1"
    // InternalSecureUML2Java.g:3068:1: rule__StringOperation__Group_12__1 : rule__StringOperation__Group_12__1__Impl ;
    public final void rule__StringOperation__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3072:1: ( rule__StringOperation__Group_12__1__Impl )
            // InternalSecureUML2Java.g:3073:2: rule__StringOperation__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_12__1__Impl();

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
    // $ANTLR end "rule__StringOperation__Group_12__1"


    // $ANTLR start "rule__StringOperation__Group_12__1__Impl"
    // InternalSecureUML2Java.g:3079:1: rule__StringOperation__Group_12__1__Impl : ( ( rule__StringOperation__Pres1Assignment_12_1 ) ) ;
    public final void rule__StringOperation__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3083:1: ( ( ( rule__StringOperation__Pres1Assignment_12_1 ) ) )
            // InternalSecureUML2Java.g:3084:1: ( ( rule__StringOperation__Pres1Assignment_12_1 ) )
            {
            // InternalSecureUML2Java.g:3084:1: ( ( rule__StringOperation__Pres1Assignment_12_1 ) )
            // InternalSecureUML2Java.g:3085:2: ( rule__StringOperation__Pres1Assignment_12_1 )
            {
             before(grammarAccess.getStringOperationAccess().getPres1Assignment_12_1()); 
            // InternalSecureUML2Java.g:3086:2: ( rule__StringOperation__Pres1Assignment_12_1 )
            // InternalSecureUML2Java.g:3086:3: rule__StringOperation__Pres1Assignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Pres1Assignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getPres1Assignment_12_1()); 

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
    // $ANTLR end "rule__StringOperation__Group_12__1__Impl"


    // $ANTLR start "rule__StringOperation__Group_16__0"
    // InternalSecureUML2Java.g:3095:1: rule__StringOperation__Group_16__0 : rule__StringOperation__Group_16__0__Impl rule__StringOperation__Group_16__1 ;
    public final void rule__StringOperation__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3099:1: ( rule__StringOperation__Group_16__0__Impl rule__StringOperation__Group_16__1 )
            // InternalSecureUML2Java.g:3100:2: rule__StringOperation__Group_16__0__Impl rule__StringOperation__Group_16__1
            {
            pushFollow(FOLLOW_3);
            rule__StringOperation__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_16__1();

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
    // $ANTLR end "rule__StringOperation__Group_16__0"


    // $ANTLR start "rule__StringOperation__Group_16__0__Impl"
    // InternalSecureUML2Java.g:3107:1: rule__StringOperation__Group_16__0__Impl : ( '&' ) ;
    public final void rule__StringOperation__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3111:1: ( ( '&' ) )
            // InternalSecureUML2Java.g:3112:1: ( '&' )
            {
            // InternalSecureUML2Java.g:3112:1: ( '&' )
            // InternalSecureUML2Java.g:3113:2: '&'
            {
             before(grammarAccess.getStringOperationAccess().getAmpersandKeyword_16_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getAmpersandKeyword_16_0()); 

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
    // $ANTLR end "rule__StringOperation__Group_16__0__Impl"


    // $ANTLR start "rule__StringOperation__Group_16__1"
    // InternalSecureUML2Java.g:3122:1: rule__StringOperation__Group_16__1 : rule__StringOperation__Group_16__1__Impl ;
    public final void rule__StringOperation__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3126:1: ( rule__StringOperation__Group_16__1__Impl )
            // InternalSecureUML2Java.g:3127:2: rule__StringOperation__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group_16__1__Impl();

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
    // $ANTLR end "rule__StringOperation__Group_16__1"


    // $ANTLR start "rule__StringOperation__Group_16__1__Impl"
    // InternalSecureUML2Java.g:3133:1: rule__StringOperation__Group_16__1__Impl : ( ( rule__StringOperation__Pres2Assignment_16_1 ) ) ;
    public final void rule__StringOperation__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3137:1: ( ( ( rule__StringOperation__Pres2Assignment_16_1 ) ) )
            // InternalSecureUML2Java.g:3138:1: ( ( rule__StringOperation__Pres2Assignment_16_1 ) )
            {
            // InternalSecureUML2Java.g:3138:1: ( ( rule__StringOperation__Pres2Assignment_16_1 ) )
            // InternalSecureUML2Java.g:3139:2: ( rule__StringOperation__Pres2Assignment_16_1 )
            {
             before(grammarAccess.getStringOperationAccess().getPres2Assignment_16_1()); 
            // InternalSecureUML2Java.g:3140:2: ( rule__StringOperation__Pres2Assignment_16_1 )
            // InternalSecureUML2Java.g:3140:3: rule__StringOperation__Pres2Assignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Pres2Assignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getPres2Assignment_16_1()); 

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
    // $ANTLR end "rule__StringOperation__Group_16__1__Impl"


    // $ANTLR start "rule__BSubstitution__Group__0"
    // InternalSecureUML2Java.g:3149:1: rule__BSubstitution__Group__0 : rule__BSubstitution__Group__0__Impl rule__BSubstitution__Group__1 ;
    public final void rule__BSubstitution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3153:1: ( rule__BSubstitution__Group__0__Impl rule__BSubstitution__Group__1 )
            // InternalSecureUML2Java.g:3154:2: rule__BSubstitution__Group__0__Impl rule__BSubstitution__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__BSubstitution__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubstitution__Group__1();

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
    // $ANTLR end "rule__BSubstitution__Group__0"


    // $ANTLR start "rule__BSubstitution__Group__0__Impl"
    // InternalSecureUML2Java.g:3161:1: rule__BSubstitution__Group__0__Impl : ( ( rule__BSubstitution__SleftAssignment_0 ) ) ;
    public final void rule__BSubstitution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3165:1: ( ( ( rule__BSubstitution__SleftAssignment_0 ) ) )
            // InternalSecureUML2Java.g:3166:1: ( ( rule__BSubstitution__SleftAssignment_0 ) )
            {
            // InternalSecureUML2Java.g:3166:1: ( ( rule__BSubstitution__SleftAssignment_0 ) )
            // InternalSecureUML2Java.g:3167:2: ( rule__BSubstitution__SleftAssignment_0 )
            {
             before(grammarAccess.getBSubstitutionAccess().getSleftAssignment_0()); 
            // InternalSecureUML2Java.g:3168:2: ( rule__BSubstitution__SleftAssignment_0 )
            // InternalSecureUML2Java.g:3168:3: rule__BSubstitution__SleftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BSubstitution__SleftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBSubstitutionAccess().getSleftAssignment_0()); 

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
    // $ANTLR end "rule__BSubstitution__Group__0__Impl"


    // $ANTLR start "rule__BSubstitution__Group__1"
    // InternalSecureUML2Java.g:3176:1: rule__BSubstitution__Group__1 : rule__BSubstitution__Group__1__Impl rule__BSubstitution__Group__2 ;
    public final void rule__BSubstitution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3180:1: ( rule__BSubstitution__Group__1__Impl rule__BSubstitution__Group__2 )
            // InternalSecureUML2Java.g:3181:2: rule__BSubstitution__Group__1__Impl rule__BSubstitution__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BSubstitution__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubstitution__Group__2();

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
    // $ANTLR end "rule__BSubstitution__Group__1"


    // $ANTLR start "rule__BSubstitution__Group__1__Impl"
    // InternalSecureUML2Java.g:3188:1: rule__BSubstitution__Group__1__Impl : ( ':=' ) ;
    public final void rule__BSubstitution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3192:1: ( ( ':=' ) )
            // InternalSecureUML2Java.g:3193:1: ( ':=' )
            {
            // InternalSecureUML2Java.g:3193:1: ( ':=' )
            // InternalSecureUML2Java.g:3194:2: ':='
            {
             before(grammarAccess.getBSubstitutionAccess().getColonEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBSubstitutionAccess().getColonEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__BSubstitution__Group__1__Impl"


    // $ANTLR start "rule__BSubstitution__Group__2"
    // InternalSecureUML2Java.g:3203:1: rule__BSubstitution__Group__2 : rule__BSubstitution__Group__2__Impl ;
    public final void rule__BSubstitution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3207:1: ( rule__BSubstitution__Group__2__Impl )
            // InternalSecureUML2Java.g:3208:2: rule__BSubstitution__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSubstitution__Group__2__Impl();

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
    // $ANTLR end "rule__BSubstitution__Group__2"


    // $ANTLR start "rule__BSubstitution__Group__2__Impl"
    // InternalSecureUML2Java.g:3214:1: rule__BSubstitution__Group__2__Impl : ( ( rule__BSubstitution__SrightAssignment_2 ) ) ;
    public final void rule__BSubstitution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3218:1: ( ( ( rule__BSubstitution__SrightAssignment_2 ) ) )
            // InternalSecureUML2Java.g:3219:1: ( ( rule__BSubstitution__SrightAssignment_2 ) )
            {
            // InternalSecureUML2Java.g:3219:1: ( ( rule__BSubstitution__SrightAssignment_2 ) )
            // InternalSecureUML2Java.g:3220:2: ( rule__BSubstitution__SrightAssignment_2 )
            {
             before(grammarAccess.getBSubstitutionAccess().getSrightAssignment_2()); 
            // InternalSecureUML2Java.g:3221:2: ( rule__BSubstitution__SrightAssignment_2 )
            // InternalSecureUML2Java.g:3221:3: rule__BSubstitution__SrightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BSubstitution__SrightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBSubstitutionAccess().getSrightAssignment_2()); 

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
    // $ANTLR end "rule__BSubstitution__Group__2__Impl"


    // $ANTLR start "rule__BPredicate__Group__0"
    // InternalSecureUML2Java.g:3230:1: rule__BPredicate__Group__0 : rule__BPredicate__Group__0__Impl rule__BPredicate__Group__1 ;
    public final void rule__BPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3234:1: ( rule__BPredicate__Group__0__Impl rule__BPredicate__Group__1 )
            // InternalSecureUML2Java.g:3235:2: rule__BPredicate__Group__0__Impl rule__BPredicate__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__BPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BPredicate__Group__1();

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
    // $ANTLR end "rule__BPredicate__Group__0"


    // $ANTLR start "rule__BPredicate__Group__0__Impl"
    // InternalSecureUML2Java.g:3242:1: rule__BPredicate__Group__0__Impl : ( ( rule__BPredicate__PleftAssignment_0 ) ) ;
    public final void rule__BPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3246:1: ( ( ( rule__BPredicate__PleftAssignment_0 ) ) )
            // InternalSecureUML2Java.g:3247:1: ( ( rule__BPredicate__PleftAssignment_0 ) )
            {
            // InternalSecureUML2Java.g:3247:1: ( ( rule__BPredicate__PleftAssignment_0 ) )
            // InternalSecureUML2Java.g:3248:2: ( rule__BPredicate__PleftAssignment_0 )
            {
             before(grammarAccess.getBPredicateAccess().getPleftAssignment_0()); 
            // InternalSecureUML2Java.g:3249:2: ( rule__BPredicate__PleftAssignment_0 )
            // InternalSecureUML2Java.g:3249:3: rule__BPredicate__PleftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__PleftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBPredicateAccess().getPleftAssignment_0()); 

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
    // $ANTLR end "rule__BPredicate__Group__0__Impl"


    // $ANTLR start "rule__BPredicate__Group__1"
    // InternalSecureUML2Java.g:3257:1: rule__BPredicate__Group__1 : rule__BPredicate__Group__1__Impl rule__BPredicate__Group__2 ;
    public final void rule__BPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3261:1: ( rule__BPredicate__Group__1__Impl rule__BPredicate__Group__2 )
            // InternalSecureUML2Java.g:3262:2: rule__BPredicate__Group__1__Impl rule__BPredicate__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__BPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BPredicate__Group__2();

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
    // $ANTLR end "rule__BPredicate__Group__1"


    // $ANTLR start "rule__BPredicate__Group__1__Impl"
    // InternalSecureUML2Java.g:3269:1: rule__BPredicate__Group__1__Impl : ( ':' ) ;
    public final void rule__BPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3273:1: ( ( ':' ) )
            // InternalSecureUML2Java.g:3274:1: ( ':' )
            {
            // InternalSecureUML2Java.g:3274:1: ( ':' )
            // InternalSecureUML2Java.g:3275:2: ':'
            {
             before(grammarAccess.getBPredicateAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBPredicateAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__BPredicate__Group__1__Impl"


    // $ANTLR start "rule__BPredicate__Group__2"
    // InternalSecureUML2Java.g:3284:1: rule__BPredicate__Group__2 : rule__BPredicate__Group__2__Impl ;
    public final void rule__BPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3288:1: ( rule__BPredicate__Group__2__Impl )
            // InternalSecureUML2Java.g:3289:2: rule__BPredicate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__Group__2__Impl();

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
    // $ANTLR end "rule__BPredicate__Group__2"


    // $ANTLR start "rule__BPredicate__Group__2__Impl"
    // InternalSecureUML2Java.g:3295:1: rule__BPredicate__Group__2__Impl : ( ( rule__BPredicate__PrightAssignment_2 ) ) ;
    public final void rule__BPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3299:1: ( ( ( rule__BPredicate__PrightAssignment_2 ) ) )
            // InternalSecureUML2Java.g:3300:1: ( ( rule__BPredicate__PrightAssignment_2 ) )
            {
            // InternalSecureUML2Java.g:3300:1: ( ( rule__BPredicate__PrightAssignment_2 ) )
            // InternalSecureUML2Java.g:3301:2: ( rule__BPredicate__PrightAssignment_2 )
            {
             before(grammarAccess.getBPredicateAccess().getPrightAssignment_2()); 
            // InternalSecureUML2Java.g:3302:2: ( rule__BPredicate__PrightAssignment_2 )
            // InternalSecureUML2Java.g:3302:3: rule__BPredicate__PrightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__PrightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBPredicateAccess().getPrightAssignment_2()); 

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
    // $ANTLR end "rule__BPredicate__Group__2__Impl"


    // $ANTLR start "rule__BDom__Group__0"
    // InternalSecureUML2Java.g:3311:1: rule__BDom__Group__0 : rule__BDom__Group__0__Impl rule__BDom__Group__1 ;
    public final void rule__BDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3315:1: ( rule__BDom__Group__0__Impl rule__BDom__Group__1 )
            // InternalSecureUML2Java.g:3316:2: rule__BDom__Group__0__Impl rule__BDom__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BDom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDom__Group__1();

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
    // $ANTLR end "rule__BDom__Group__0"


    // $ANTLR start "rule__BDom__Group__0__Impl"
    // InternalSecureUML2Java.g:3323:1: rule__BDom__Group__0__Impl : ( 'dom' ) ;
    public final void rule__BDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3327:1: ( ( 'dom' ) )
            // InternalSecureUML2Java.g:3328:1: ( 'dom' )
            {
            // InternalSecureUML2Java.g:3328:1: ( 'dom' )
            // InternalSecureUML2Java.g:3329:2: 'dom'
            {
             before(grammarAccess.getBDomAccess().getDomKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBDomAccess().getDomKeyword_0()); 

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
    // $ANTLR end "rule__BDom__Group__0__Impl"


    // $ANTLR start "rule__BDom__Group__1"
    // InternalSecureUML2Java.g:3338:1: rule__BDom__Group__1 : rule__BDom__Group__1__Impl rule__BDom__Group__2 ;
    public final void rule__BDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3342:1: ( rule__BDom__Group__1__Impl rule__BDom__Group__2 )
            // InternalSecureUML2Java.g:3343:2: rule__BDom__Group__1__Impl rule__BDom__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BDom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDom__Group__2();

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
    // $ANTLR end "rule__BDom__Group__1"


    // $ANTLR start "rule__BDom__Group__1__Impl"
    // InternalSecureUML2Java.g:3350:1: rule__BDom__Group__1__Impl : ( '(' ) ;
    public final void rule__BDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3354:1: ( ( '(' ) )
            // InternalSecureUML2Java.g:3355:1: ( '(' )
            {
            // InternalSecureUML2Java.g:3355:1: ( '(' )
            // InternalSecureUML2Java.g:3356:2: '('
            {
             before(grammarAccess.getBDomAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBDomAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__BDom__Group__1__Impl"


    // $ANTLR start "rule__BDom__Group__2"
    // InternalSecureUML2Java.g:3365:1: rule__BDom__Group__2 : rule__BDom__Group__2__Impl rule__BDom__Group__3 ;
    public final void rule__BDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3369:1: ( rule__BDom__Group__2__Impl rule__BDom__Group__3 )
            // InternalSecureUML2Java.g:3370:2: rule__BDom__Group__2__Impl rule__BDom__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__BDom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BDom__Group__3();

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
    // $ANTLR end "rule__BDom__Group__2"


    // $ANTLR start "rule__BDom__Group__2__Impl"
    // InternalSecureUML2Java.g:3377:1: rule__BDom__Group__2__Impl : ( ( rule__BDom__ObjAssignment_2 ) ) ;
    public final void rule__BDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3381:1: ( ( ( rule__BDom__ObjAssignment_2 ) ) )
            // InternalSecureUML2Java.g:3382:1: ( ( rule__BDom__ObjAssignment_2 ) )
            {
            // InternalSecureUML2Java.g:3382:1: ( ( rule__BDom__ObjAssignment_2 ) )
            // InternalSecureUML2Java.g:3383:2: ( rule__BDom__ObjAssignment_2 )
            {
             before(grammarAccess.getBDomAccess().getObjAssignment_2()); 
            // InternalSecureUML2Java.g:3384:2: ( rule__BDom__ObjAssignment_2 )
            // InternalSecureUML2Java.g:3384:3: rule__BDom__ObjAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BDom__ObjAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBDomAccess().getObjAssignment_2()); 

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
    // $ANTLR end "rule__BDom__Group__2__Impl"


    // $ANTLR start "rule__BDom__Group__3"
    // InternalSecureUML2Java.g:3392:1: rule__BDom__Group__3 : rule__BDom__Group__3__Impl ;
    public final void rule__BDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3396:1: ( rule__BDom__Group__3__Impl )
            // InternalSecureUML2Java.g:3397:2: rule__BDom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BDom__Group__3__Impl();

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
    // $ANTLR end "rule__BDom__Group__3"


    // $ANTLR start "rule__BDom__Group__3__Impl"
    // InternalSecureUML2Java.g:3403:1: rule__BDom__Group__3__Impl : ( ')' ) ;
    public final void rule__BDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3407:1: ( ( ')' ) )
            // InternalSecureUML2Java.g:3408:1: ( ')' )
            {
            // InternalSecureUML2Java.g:3408:1: ( ')' )
            // InternalSecureUML2Java.g:3409:2: ')'
            {
             before(grammarAccess.getBDomAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBDomAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__BDom__Group__3__Impl"


    // $ANTLR start "rule__BParameter__Group__0"
    // InternalSecureUML2Java.g:3419:1: rule__BParameter__Group__0 : rule__BParameter__Group__0__Impl rule__BParameter__Group__1 ;
    public final void rule__BParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3423:1: ( rule__BParameter__Group__0__Impl rule__BParameter__Group__1 )
            // InternalSecureUML2Java.g:3424:2: rule__BParameter__Group__0__Impl rule__BParameter__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__BParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BParameter__Group__1();

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
    // $ANTLR end "rule__BParameter__Group__0"


    // $ANTLR start "rule__BParameter__Group__0__Impl"
    // InternalSecureUML2Java.g:3431:1: rule__BParameter__Group__0__Impl : ( ( rule__BParameter__P_nameAssignment_0 ) ) ;
    public final void rule__BParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3435:1: ( ( ( rule__BParameter__P_nameAssignment_0 ) ) )
            // InternalSecureUML2Java.g:3436:1: ( ( rule__BParameter__P_nameAssignment_0 ) )
            {
            // InternalSecureUML2Java.g:3436:1: ( ( rule__BParameter__P_nameAssignment_0 ) )
            // InternalSecureUML2Java.g:3437:2: ( rule__BParameter__P_nameAssignment_0 )
            {
             before(grammarAccess.getBParameterAccess().getP_nameAssignment_0()); 
            // InternalSecureUML2Java.g:3438:2: ( rule__BParameter__P_nameAssignment_0 )
            // InternalSecureUML2Java.g:3438:3: rule__BParameter__P_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BParameter__P_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBParameterAccess().getP_nameAssignment_0()); 

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
    // $ANTLR end "rule__BParameter__Group__0__Impl"


    // $ANTLR start "rule__BParameter__Group__1"
    // InternalSecureUML2Java.g:3446:1: rule__BParameter__Group__1 : rule__BParameter__Group__1__Impl rule__BParameter__Group__2 ;
    public final void rule__BParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3450:1: ( rule__BParameter__Group__1__Impl rule__BParameter__Group__2 )
            // InternalSecureUML2Java.g:3451:2: rule__BParameter__Group__1__Impl rule__BParameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BParameter__Group__2();

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
    // $ANTLR end "rule__BParameter__Group__1"


    // $ANTLR start "rule__BParameter__Group__1__Impl"
    // InternalSecureUML2Java.g:3458:1: rule__BParameter__Group__1__Impl : ( ':' ) ;
    public final void rule__BParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3462:1: ( ( ':' ) )
            // InternalSecureUML2Java.g:3463:1: ( ':' )
            {
            // InternalSecureUML2Java.g:3463:1: ( ':' )
            // InternalSecureUML2Java.g:3464:2: ':'
            {
             before(grammarAccess.getBParameterAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBParameterAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__BParameter__Group__1__Impl"


    // $ANTLR start "rule__BParameter__Group__2"
    // InternalSecureUML2Java.g:3473:1: rule__BParameter__Group__2 : rule__BParameter__Group__2__Impl ;
    public final void rule__BParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3477:1: ( rule__BParameter__Group__2__Impl )
            // InternalSecureUML2Java.g:3478:2: rule__BParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BParameter__Group__2__Impl();

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
    // $ANTLR end "rule__BParameter__Group__2"


    // $ANTLR start "rule__BParameter__Group__2__Impl"
    // InternalSecureUML2Java.g:3484:1: rule__BParameter__Group__2__Impl : ( ( rule__BParameter__TypeAssignment_2 ) ) ;
    public final void rule__BParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3488:1: ( ( ( rule__BParameter__TypeAssignment_2 ) ) )
            // InternalSecureUML2Java.g:3489:1: ( ( rule__BParameter__TypeAssignment_2 ) )
            {
            // InternalSecureUML2Java.g:3489:1: ( ( rule__BParameter__TypeAssignment_2 ) )
            // InternalSecureUML2Java.g:3490:2: ( rule__BParameter__TypeAssignment_2 )
            {
             before(grammarAccess.getBParameterAccess().getTypeAssignment_2()); 
            // InternalSecureUML2Java.g:3491:2: ( rule__BParameter__TypeAssignment_2 )
            // InternalSecureUML2Java.g:3491:3: rule__BParameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BParameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBParameterAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__BParameter__Group__2__Impl"


    // $ANTLR start "rule__BInit__Group__0"
    // InternalSecureUML2Java.g:3500:1: rule__BInit__Group__0 : rule__BInit__Group__0__Impl rule__BInit__Group__1 ;
    public final void rule__BInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3504:1: ( rule__BInit__Group__0__Impl rule__BInit__Group__1 )
            // InternalSecureUML2Java.g:3505:2: rule__BInit__Group__0__Impl rule__BInit__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__BInit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BInit__Group__1();

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
    // $ANTLR end "rule__BInit__Group__0"


    // $ANTLR start "rule__BInit__Group__0__Impl"
    // InternalSecureUML2Java.g:3512:1: rule__BInit__Group__0__Impl : ( ( rule__BInit__VarAssignment_0 ) ) ;
    public final void rule__BInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3516:1: ( ( ( rule__BInit__VarAssignment_0 ) ) )
            // InternalSecureUML2Java.g:3517:1: ( ( rule__BInit__VarAssignment_0 ) )
            {
            // InternalSecureUML2Java.g:3517:1: ( ( rule__BInit__VarAssignment_0 ) )
            // InternalSecureUML2Java.g:3518:2: ( rule__BInit__VarAssignment_0 )
            {
             before(grammarAccess.getBInitAccess().getVarAssignment_0()); 
            // InternalSecureUML2Java.g:3519:2: ( rule__BInit__VarAssignment_0 )
            // InternalSecureUML2Java.g:3519:3: rule__BInit__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BInit__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBInitAccess().getVarAssignment_0()); 

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
    // $ANTLR end "rule__BInit__Group__0__Impl"


    // $ANTLR start "rule__BInit__Group__1"
    // InternalSecureUML2Java.g:3527:1: rule__BInit__Group__1 : rule__BInit__Group__1__Impl rule__BInit__Group__2 ;
    public final void rule__BInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3531:1: ( rule__BInit__Group__1__Impl rule__BInit__Group__2 )
            // InternalSecureUML2Java.g:3532:2: rule__BInit__Group__1__Impl rule__BInit__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__BInit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BInit__Group__2();

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
    // $ANTLR end "rule__BInit__Group__1"


    // $ANTLR start "rule__BInit__Group__1__Impl"
    // InternalSecureUML2Java.g:3539:1: rule__BInit__Group__1__Impl : ( ':=' ) ;
    public final void rule__BInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3543:1: ( ( ':=' ) )
            // InternalSecureUML2Java.g:3544:1: ( ':=' )
            {
            // InternalSecureUML2Java.g:3544:1: ( ':=' )
            // InternalSecureUML2Java.g:3545:2: ':='
            {
             before(grammarAccess.getBInitAccess().getColonEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBInitAccess().getColonEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__BInit__Group__1__Impl"


    // $ANTLR start "rule__BInit__Group__2"
    // InternalSecureUML2Java.g:3554:1: rule__BInit__Group__2 : rule__BInit__Group__2__Impl rule__BInit__Group__3 ;
    public final void rule__BInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3558:1: ( rule__BInit__Group__2__Impl rule__BInit__Group__3 )
            // InternalSecureUML2Java.g:3559:2: rule__BInit__Group__2__Impl rule__BInit__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__BInit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BInit__Group__3();

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
    // $ANTLR end "rule__BInit__Group__2"


    // $ANTLR start "rule__BInit__Group__2__Impl"
    // InternalSecureUML2Java.g:3566:1: rule__BInit__Group__2__Impl : ( '{' ) ;
    public final void rule__BInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3570:1: ( ( '{' ) )
            // InternalSecureUML2Java.g:3571:1: ( '{' )
            {
            // InternalSecureUML2Java.g:3571:1: ( '{' )
            // InternalSecureUML2Java.g:3572:2: '{'
            {
             before(grammarAccess.getBInitAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBInitAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BInit__Group__2__Impl"


    // $ANTLR start "rule__BInit__Group__3"
    // InternalSecureUML2Java.g:3581:1: rule__BInit__Group__3 : rule__BInit__Group__3__Impl rule__BInit__Group__4 ;
    public final void rule__BInit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3585:1: ( rule__BInit__Group__3__Impl rule__BInit__Group__4 )
            // InternalSecureUML2Java.g:3586:2: rule__BInit__Group__3__Impl rule__BInit__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__BInit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BInit__Group__4();

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
    // $ANTLR end "rule__BInit__Group__3"


    // $ANTLR start "rule__BInit__Group__3__Impl"
    // InternalSecureUML2Java.g:3593:1: rule__BInit__Group__3__Impl : ( ( rule__BInit__PairAssignment_3 ) ) ;
    public final void rule__BInit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3597:1: ( ( ( rule__BInit__PairAssignment_3 ) ) )
            // InternalSecureUML2Java.g:3598:1: ( ( rule__BInit__PairAssignment_3 ) )
            {
            // InternalSecureUML2Java.g:3598:1: ( ( rule__BInit__PairAssignment_3 ) )
            // InternalSecureUML2Java.g:3599:2: ( rule__BInit__PairAssignment_3 )
            {
             before(grammarAccess.getBInitAccess().getPairAssignment_3()); 
            // InternalSecureUML2Java.g:3600:2: ( rule__BInit__PairAssignment_3 )
            // InternalSecureUML2Java.g:3600:3: rule__BInit__PairAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BInit__PairAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBInitAccess().getPairAssignment_3()); 

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
    // $ANTLR end "rule__BInit__Group__3__Impl"


    // $ANTLR start "rule__BInit__Group__4"
    // InternalSecureUML2Java.g:3608:1: rule__BInit__Group__4 : rule__BInit__Group__4__Impl ;
    public final void rule__BInit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3612:1: ( rule__BInit__Group__4__Impl )
            // InternalSecureUML2Java.g:3613:2: rule__BInit__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BInit__Group__4__Impl();

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
    // $ANTLR end "rule__BInit__Group__4"


    // $ANTLR start "rule__BInit__Group__4__Impl"
    // InternalSecureUML2Java.g:3619:1: rule__BInit__Group__4__Impl : ( '}' ) ;
    public final void rule__BInit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3623:1: ( ( '}' ) )
            // InternalSecureUML2Java.g:3624:1: ( '}' )
            {
            // InternalSecureUML2Java.g:3624:1: ( '}' )
            // InternalSecureUML2Java.g:3625:2: '}'
            {
             before(grammarAccess.getBInitAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBInitAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__BInit__Group__4__Impl"


    // $ANTLR start "rule__BTuple__Group__0"
    // InternalSecureUML2Java.g:3635:1: rule__BTuple__Group__0 : rule__BTuple__Group__0__Impl rule__BTuple__Group__1 ;
    public final void rule__BTuple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3639:1: ( rule__BTuple__Group__0__Impl rule__BTuple__Group__1 )
            // InternalSecureUML2Java.g:3640:2: rule__BTuple__Group__0__Impl rule__BTuple__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSecureUML2Java.g:3647:1: rule__BTuple__Group__0__Impl : ( ( rule__BTuple__RanAssignment_0 ) ) ;
    public final void rule__BTuple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3651:1: ( ( ( rule__BTuple__RanAssignment_0 ) ) )
            // InternalSecureUML2Java.g:3652:1: ( ( rule__BTuple__RanAssignment_0 ) )
            {
            // InternalSecureUML2Java.g:3652:1: ( ( rule__BTuple__RanAssignment_0 ) )
            // InternalSecureUML2Java.g:3653:2: ( rule__BTuple__RanAssignment_0 )
            {
             before(grammarAccess.getBTupleAccess().getRanAssignment_0()); 
            // InternalSecureUML2Java.g:3654:2: ( rule__BTuple__RanAssignment_0 )
            // InternalSecureUML2Java.g:3654:3: rule__BTuple__RanAssignment_0
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
    // InternalSecureUML2Java.g:3662:1: rule__BTuple__Group__1 : rule__BTuple__Group__1__Impl rule__BTuple__Group__2 ;
    public final void rule__BTuple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3666:1: ( rule__BTuple__Group__1__Impl rule__BTuple__Group__2 )
            // InternalSecureUML2Java.g:3667:2: rule__BTuple__Group__1__Impl rule__BTuple__Group__2
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
    // InternalSecureUML2Java.g:3674:1: rule__BTuple__Group__1__Impl : ( '|->' ) ;
    public final void rule__BTuple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3678:1: ( ( '|->' ) )
            // InternalSecureUML2Java.g:3679:1: ( '|->' )
            {
            // InternalSecureUML2Java.g:3679:1: ( '|->' )
            // InternalSecureUML2Java.g:3680:2: '|->'
            {
             before(grammarAccess.getBTupleAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSecureUML2Java.g:3689:1: rule__BTuple__Group__2 : rule__BTuple__Group__2__Impl ;
    public final void rule__BTuple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3693:1: ( rule__BTuple__Group__2__Impl )
            // InternalSecureUML2Java.g:3694:2: rule__BTuple__Group__2__Impl
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
    // InternalSecureUML2Java.g:3700:1: rule__BTuple__Group__2__Impl : ( ( rule__BTuple__DomAssignment_2 ) ) ;
    public final void rule__BTuple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3704:1: ( ( ( rule__BTuple__DomAssignment_2 ) ) )
            // InternalSecureUML2Java.g:3705:1: ( ( rule__BTuple__DomAssignment_2 ) )
            {
            // InternalSecureUML2Java.g:3705:1: ( ( rule__BTuple__DomAssignment_2 ) )
            // InternalSecureUML2Java.g:3706:2: ( rule__BTuple__DomAssignment_2 )
            {
             before(grammarAccess.getBTupleAccess().getDomAssignment_2()); 
            // InternalSecureUML2Java.g:3707:2: ( rule__BTuple__DomAssignment_2 )
            // InternalSecureUML2Java.g:3707:3: rule__BTuple__DomAssignment_2
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


    // $ANTLR start "rule__BOperationCall__Group__0"
    // InternalSecureUML2Java.g:3716:1: rule__BOperationCall__Group__0 : rule__BOperationCall__Group__0__Impl rule__BOperationCall__Group__1 ;
    public final void rule__BOperationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3720:1: ( rule__BOperationCall__Group__0__Impl rule__BOperationCall__Group__1 )
            // InternalSecureUML2Java.g:3721:2: rule__BOperationCall__Group__0__Impl rule__BOperationCall__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BOperationCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOperationCall__Group__1();

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
    // $ANTLR end "rule__BOperationCall__Group__0"


    // $ANTLR start "rule__BOperationCall__Group__0__Impl"
    // InternalSecureUML2Java.g:3728:1: rule__BOperationCall__Group__0__Impl : ( ( rule__BOperationCall__OpAssignment_0 ) ) ;
    public final void rule__BOperationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3732:1: ( ( ( rule__BOperationCall__OpAssignment_0 ) ) )
            // InternalSecureUML2Java.g:3733:1: ( ( rule__BOperationCall__OpAssignment_0 ) )
            {
            // InternalSecureUML2Java.g:3733:1: ( ( rule__BOperationCall__OpAssignment_0 ) )
            // InternalSecureUML2Java.g:3734:2: ( rule__BOperationCall__OpAssignment_0 )
            {
             before(grammarAccess.getBOperationCallAccess().getOpAssignment_0()); 
            // InternalSecureUML2Java.g:3735:2: ( rule__BOperationCall__OpAssignment_0 )
            // InternalSecureUML2Java.g:3735:3: rule__BOperationCall__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BOperationCall__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBOperationCallAccess().getOpAssignment_0()); 

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
    // $ANTLR end "rule__BOperationCall__Group__0__Impl"


    // $ANTLR start "rule__BOperationCall__Group__1"
    // InternalSecureUML2Java.g:3743:1: rule__BOperationCall__Group__1 : rule__BOperationCall__Group__1__Impl rule__BOperationCall__Group__2 ;
    public final void rule__BOperationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3747:1: ( rule__BOperationCall__Group__1__Impl rule__BOperationCall__Group__2 )
            // InternalSecureUML2Java.g:3748:2: rule__BOperationCall__Group__1__Impl rule__BOperationCall__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BOperationCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOperationCall__Group__2();

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
    // $ANTLR end "rule__BOperationCall__Group__1"


    // $ANTLR start "rule__BOperationCall__Group__1__Impl"
    // InternalSecureUML2Java.g:3755:1: rule__BOperationCall__Group__1__Impl : ( '(' ) ;
    public final void rule__BOperationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3759:1: ( ( '(' ) )
            // InternalSecureUML2Java.g:3760:1: ( '(' )
            {
            // InternalSecureUML2Java.g:3760:1: ( '(' )
            // InternalSecureUML2Java.g:3761:2: '('
            {
             before(grammarAccess.getBOperationCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBOperationCallAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__BOperationCall__Group__1__Impl"


    // $ANTLR start "rule__BOperationCall__Group__2"
    // InternalSecureUML2Java.g:3770:1: rule__BOperationCall__Group__2 : rule__BOperationCall__Group__2__Impl rule__BOperationCall__Group__3 ;
    public final void rule__BOperationCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3774:1: ( rule__BOperationCall__Group__2__Impl rule__BOperationCall__Group__3 )
            // InternalSecureUML2Java.g:3775:2: rule__BOperationCall__Group__2__Impl rule__BOperationCall__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__BOperationCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOperationCall__Group__3();

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
    // $ANTLR end "rule__BOperationCall__Group__2"


    // $ANTLR start "rule__BOperationCall__Group__2__Impl"
    // InternalSecureUML2Java.g:3782:1: rule__BOperationCall__Group__2__Impl : ( ( rule__BOperationCall__ParAssignment_2 ) ) ;
    public final void rule__BOperationCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3786:1: ( ( ( rule__BOperationCall__ParAssignment_2 ) ) )
            // InternalSecureUML2Java.g:3787:1: ( ( rule__BOperationCall__ParAssignment_2 ) )
            {
            // InternalSecureUML2Java.g:3787:1: ( ( rule__BOperationCall__ParAssignment_2 ) )
            // InternalSecureUML2Java.g:3788:2: ( rule__BOperationCall__ParAssignment_2 )
            {
             before(grammarAccess.getBOperationCallAccess().getParAssignment_2()); 
            // InternalSecureUML2Java.g:3789:2: ( rule__BOperationCall__ParAssignment_2 )
            // InternalSecureUML2Java.g:3789:3: rule__BOperationCall__ParAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BOperationCall__ParAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBOperationCallAccess().getParAssignment_2()); 

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
    // $ANTLR end "rule__BOperationCall__Group__2__Impl"


    // $ANTLR start "rule__BOperationCall__Group__3"
    // InternalSecureUML2Java.g:3797:1: rule__BOperationCall__Group__3 : rule__BOperationCall__Group__3__Impl ;
    public final void rule__BOperationCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3801:1: ( rule__BOperationCall__Group__3__Impl )
            // InternalSecureUML2Java.g:3802:2: rule__BOperationCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOperationCall__Group__3__Impl();

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
    // $ANTLR end "rule__BOperationCall__Group__3"


    // $ANTLR start "rule__BOperationCall__Group__3__Impl"
    // InternalSecureUML2Java.g:3808:1: rule__BOperationCall__Group__3__Impl : ( ')' ) ;
    public final void rule__BOperationCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3812:1: ( ( ')' ) )
            // InternalSecureUML2Java.g:3813:1: ( ')' )
            {
            // InternalSecureUML2Java.g:3813:1: ( ')' )
            // InternalSecureUML2Java.g:3814:2: ')'
            {
             before(grammarAccess.getBOperationCallAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBOperationCallAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__BOperationCall__Group__3__Impl"


    // $ANTLR start "rule__BInvariant__Group_0__0"
    // InternalSecureUML2Java.g:3824:1: rule__BInvariant__Group_0__0 : rule__BInvariant__Group_0__0__Impl rule__BInvariant__Group_0__1 ;
    public final void rule__BInvariant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3828:1: ( rule__BInvariant__Group_0__0__Impl rule__BInvariant__Group_0__1 )
            // InternalSecureUML2Java.g:3829:2: rule__BInvariant__Group_0__0__Impl rule__BInvariant__Group_0__1
            {
            pushFollow(FOLLOW_29);
            rule__BInvariant__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BInvariant__Group_0__1();

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
    // $ANTLR end "rule__BInvariant__Group_0__0"


    // $ANTLR start "rule__BInvariant__Group_0__0__Impl"
    // InternalSecureUML2Java.g:3836:1: rule__BInvariant__Group_0__0__Impl : ( ( rule__BInvariant__VarAssignment_0_0 ) ) ;
    public final void rule__BInvariant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3840:1: ( ( ( rule__BInvariant__VarAssignment_0_0 ) ) )
            // InternalSecureUML2Java.g:3841:1: ( ( rule__BInvariant__VarAssignment_0_0 ) )
            {
            // InternalSecureUML2Java.g:3841:1: ( ( rule__BInvariant__VarAssignment_0_0 ) )
            // InternalSecureUML2Java.g:3842:2: ( rule__BInvariant__VarAssignment_0_0 )
            {
             before(grammarAccess.getBInvariantAccess().getVarAssignment_0_0()); 
            // InternalSecureUML2Java.g:3843:2: ( rule__BInvariant__VarAssignment_0_0 )
            // InternalSecureUML2Java.g:3843:3: rule__BInvariant__VarAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BInvariant__VarAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBInvariantAccess().getVarAssignment_0_0()); 

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
    // $ANTLR end "rule__BInvariant__Group_0__0__Impl"


    // $ANTLR start "rule__BInvariant__Group_0__1"
    // InternalSecureUML2Java.g:3851:1: rule__BInvariant__Group_0__1 : rule__BInvariant__Group_0__1__Impl rule__BInvariant__Group_0__2 ;
    public final void rule__BInvariant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3855:1: ( rule__BInvariant__Group_0__1__Impl rule__BInvariant__Group_0__2 )
            // InternalSecureUML2Java.g:3856:2: rule__BInvariant__Group_0__1__Impl rule__BInvariant__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__BInvariant__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BInvariant__Group_0__2();

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
    // $ANTLR end "rule__BInvariant__Group_0__1"


    // $ANTLR start "rule__BInvariant__Group_0__1__Impl"
    // InternalSecureUML2Java.g:3863:1: rule__BInvariant__Group_0__1__Impl : ( ':' ) ;
    public final void rule__BInvariant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3867:1: ( ( ':' ) )
            // InternalSecureUML2Java.g:3868:1: ( ':' )
            {
            // InternalSecureUML2Java.g:3868:1: ( ':' )
            // InternalSecureUML2Java.g:3869:2: ':'
            {
             before(grammarAccess.getBInvariantAccess().getColonKeyword_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBInvariantAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__BInvariant__Group_0__1__Impl"


    // $ANTLR start "rule__BInvariant__Group_0__2"
    // InternalSecureUML2Java.g:3878:1: rule__BInvariant__Group_0__2 : rule__BInvariant__Group_0__2__Impl ;
    public final void rule__BInvariant__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3882:1: ( rule__BInvariant__Group_0__2__Impl )
            // InternalSecureUML2Java.g:3883:2: rule__BInvariant__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BInvariant__Group_0__2__Impl();

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
    // $ANTLR end "rule__BInvariant__Group_0__2"


    // $ANTLR start "rule__BInvariant__Group_0__2__Impl"
    // InternalSecureUML2Java.g:3889:1: rule__BInvariant__Group_0__2__Impl : ( ( rule__BInvariant__VardifAssignment_0_2 ) ) ;
    public final void rule__BInvariant__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3893:1: ( ( ( rule__BInvariant__VardifAssignment_0_2 ) ) )
            // InternalSecureUML2Java.g:3894:1: ( ( rule__BInvariant__VardifAssignment_0_2 ) )
            {
            // InternalSecureUML2Java.g:3894:1: ( ( rule__BInvariant__VardifAssignment_0_2 ) )
            // InternalSecureUML2Java.g:3895:2: ( rule__BInvariant__VardifAssignment_0_2 )
            {
             before(grammarAccess.getBInvariantAccess().getVardifAssignment_0_2()); 
            // InternalSecureUML2Java.g:3896:2: ( rule__BInvariant__VardifAssignment_0_2 )
            // InternalSecureUML2Java.g:3896:3: rule__BInvariant__VardifAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__BInvariant__VardifAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getBInvariantAccess().getVardifAssignment_0_2()); 

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
    // $ANTLR end "rule__BInvariant__Group_0__2__Impl"


    // $ANTLR start "rule__BInvariant__Group_1__0"
    // InternalSecureUML2Java.g:3905:1: rule__BInvariant__Group_1__0 : rule__BInvariant__Group_1__0__Impl rule__BInvariant__Group_1__1 ;
    public final void rule__BInvariant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3909:1: ( rule__BInvariant__Group_1__0__Impl rule__BInvariant__Group_1__1 )
            // InternalSecureUML2Java.g:3910:2: rule__BInvariant__Group_1__0__Impl rule__BInvariant__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__BInvariant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BInvariant__Group_1__1();

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
    // $ANTLR end "rule__BInvariant__Group_1__0"


    // $ANTLR start "rule__BInvariant__Group_1__0__Impl"
    // InternalSecureUML2Java.g:3917:1: rule__BInvariant__Group_1__0__Impl : ( ( rule__BInvariant__DomAssignment_1_0 ) ) ;
    public final void rule__BInvariant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3921:1: ( ( ( rule__BInvariant__DomAssignment_1_0 ) ) )
            // InternalSecureUML2Java.g:3922:1: ( ( rule__BInvariant__DomAssignment_1_0 ) )
            {
            // InternalSecureUML2Java.g:3922:1: ( ( rule__BInvariant__DomAssignment_1_0 ) )
            // InternalSecureUML2Java.g:3923:2: ( rule__BInvariant__DomAssignment_1_0 )
            {
             before(grammarAccess.getBInvariantAccess().getDomAssignment_1_0()); 
            // InternalSecureUML2Java.g:3924:2: ( rule__BInvariant__DomAssignment_1_0 )
            // InternalSecureUML2Java.g:3924:3: rule__BInvariant__DomAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BInvariant__DomAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBInvariantAccess().getDomAssignment_1_0()); 

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
    // $ANTLR end "rule__BInvariant__Group_1__0__Impl"


    // $ANTLR start "rule__BInvariant__Group_1__1"
    // InternalSecureUML2Java.g:3932:1: rule__BInvariant__Group_1__1 : rule__BInvariant__Group_1__1__Impl rule__BInvariant__Group_1__2 ;
    public final void rule__BInvariant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3936:1: ( rule__BInvariant__Group_1__1__Impl rule__BInvariant__Group_1__2 )
            // InternalSecureUML2Java.g:3937:2: rule__BInvariant__Group_1__1__Impl rule__BInvariant__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__BInvariant__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BInvariant__Group_1__2();

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
    // $ANTLR end "rule__BInvariant__Group_1__1"


    // $ANTLR start "rule__BInvariant__Group_1__1__Impl"
    // InternalSecureUML2Java.g:3944:1: rule__BInvariant__Group_1__1__Impl : ( '<:' ) ;
    public final void rule__BInvariant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3948:1: ( ( '<:' ) )
            // InternalSecureUML2Java.g:3949:1: ( '<:' )
            {
            // InternalSecureUML2Java.g:3949:1: ( '<:' )
            // InternalSecureUML2Java.g:3950:2: '<:'
            {
             before(grammarAccess.getBInvariantAccess().getLessThanSignColonKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBInvariantAccess().getLessThanSignColonKeyword_1_1()); 

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
    // $ANTLR end "rule__BInvariant__Group_1__1__Impl"


    // $ANTLR start "rule__BInvariant__Group_1__2"
    // InternalSecureUML2Java.g:3959:1: rule__BInvariant__Group_1__2 : rule__BInvariant__Group_1__2__Impl ;
    public final void rule__BInvariant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3963:1: ( rule__BInvariant__Group_1__2__Impl )
            // InternalSecureUML2Java.g:3964:2: rule__BInvariant__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BInvariant__Group_1__2__Impl();

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
    // $ANTLR end "rule__BInvariant__Group_1__2"


    // $ANTLR start "rule__BInvariant__Group_1__2__Impl"
    // InternalSecureUML2Java.g:3970:1: rule__BInvariant__Group_1__2__Impl : ( ( rule__BInvariant__RanAssignment_1_2 ) ) ;
    public final void rule__BInvariant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3974:1: ( ( ( rule__BInvariant__RanAssignment_1_2 ) ) )
            // InternalSecureUML2Java.g:3975:1: ( ( rule__BInvariant__RanAssignment_1_2 ) )
            {
            // InternalSecureUML2Java.g:3975:1: ( ( rule__BInvariant__RanAssignment_1_2 ) )
            // InternalSecureUML2Java.g:3976:2: ( rule__BInvariant__RanAssignment_1_2 )
            {
             before(grammarAccess.getBInvariantAccess().getRanAssignment_1_2()); 
            // InternalSecureUML2Java.g:3977:2: ( rule__BInvariant__RanAssignment_1_2 )
            // InternalSecureUML2Java.g:3977:3: rule__BInvariant__RanAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BInvariant__RanAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBInvariantAccess().getRanAssignment_1_2()); 

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
    // $ANTLR end "rule__BInvariant__Group_1__2__Impl"


    // $ANTLR start "rule__BFunction__Group__0"
    // InternalSecureUML2Java.g:3986:1: rule__BFunction__Group__0 : rule__BFunction__Group__0__Impl rule__BFunction__Group__1 ;
    public final void rule__BFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:3990:1: ( rule__BFunction__Group__0__Impl rule__BFunction__Group__1 )
            // InternalSecureUML2Java.g:3991:2: rule__BFunction__Group__0__Impl rule__BFunction__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__BFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BFunction__Group__1();

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
    // $ANTLR end "rule__BFunction__Group__0"


    // $ANTLR start "rule__BFunction__Group__0__Impl"
    // InternalSecureUML2Java.g:3998:1: rule__BFunction__Group__0__Impl : ( ( rule__BFunction__RanAssignment_0 ) ) ;
    public final void rule__BFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4002:1: ( ( ( rule__BFunction__RanAssignment_0 ) ) )
            // InternalSecureUML2Java.g:4003:1: ( ( rule__BFunction__RanAssignment_0 ) )
            {
            // InternalSecureUML2Java.g:4003:1: ( ( rule__BFunction__RanAssignment_0 ) )
            // InternalSecureUML2Java.g:4004:2: ( rule__BFunction__RanAssignment_0 )
            {
             before(grammarAccess.getBFunctionAccess().getRanAssignment_0()); 
            // InternalSecureUML2Java.g:4005:2: ( rule__BFunction__RanAssignment_0 )
            // InternalSecureUML2Java.g:4005:3: rule__BFunction__RanAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BFunction__RanAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBFunctionAccess().getRanAssignment_0()); 

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
    // $ANTLR end "rule__BFunction__Group__0__Impl"


    // $ANTLR start "rule__BFunction__Group__1"
    // InternalSecureUML2Java.g:4013:1: rule__BFunction__Group__1 : rule__BFunction__Group__1__Impl rule__BFunction__Group__2 ;
    public final void rule__BFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4017:1: ( rule__BFunction__Group__1__Impl rule__BFunction__Group__2 )
            // InternalSecureUML2Java.g:4018:2: rule__BFunction__Group__1__Impl rule__BFunction__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BFunction__Group__2();

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
    // $ANTLR end "rule__BFunction__Group__1"


    // $ANTLR start "rule__BFunction__Group__1__Impl"
    // InternalSecureUML2Java.g:4025:1: rule__BFunction__Group__1__Impl : ( ( rule__BFunction__Alternatives_1 ) ) ;
    public final void rule__BFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4029:1: ( ( ( rule__BFunction__Alternatives_1 ) ) )
            // InternalSecureUML2Java.g:4030:1: ( ( rule__BFunction__Alternatives_1 ) )
            {
            // InternalSecureUML2Java.g:4030:1: ( ( rule__BFunction__Alternatives_1 ) )
            // InternalSecureUML2Java.g:4031:2: ( rule__BFunction__Alternatives_1 )
            {
             before(grammarAccess.getBFunctionAccess().getAlternatives_1()); 
            // InternalSecureUML2Java.g:4032:2: ( rule__BFunction__Alternatives_1 )
            // InternalSecureUML2Java.g:4032:3: rule__BFunction__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__BFunction__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBFunctionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__BFunction__Group__1__Impl"


    // $ANTLR start "rule__BFunction__Group__2"
    // InternalSecureUML2Java.g:4040:1: rule__BFunction__Group__2 : rule__BFunction__Group__2__Impl ;
    public final void rule__BFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4044:1: ( rule__BFunction__Group__2__Impl )
            // InternalSecureUML2Java.g:4045:2: rule__BFunction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BFunction__Group__2__Impl();

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
    // $ANTLR end "rule__BFunction__Group__2"


    // $ANTLR start "rule__BFunction__Group__2__Impl"
    // InternalSecureUML2Java.g:4051:1: rule__BFunction__Group__2__Impl : ( ( rule__BFunction__DomAssignment_2 ) ) ;
    public final void rule__BFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4055:1: ( ( ( rule__BFunction__DomAssignment_2 ) ) )
            // InternalSecureUML2Java.g:4056:1: ( ( rule__BFunction__DomAssignment_2 ) )
            {
            // InternalSecureUML2Java.g:4056:1: ( ( rule__BFunction__DomAssignment_2 ) )
            // InternalSecureUML2Java.g:4057:2: ( rule__BFunction__DomAssignment_2 )
            {
             before(grammarAccess.getBFunctionAccess().getDomAssignment_2()); 
            // InternalSecureUML2Java.g:4058:2: ( rule__BFunction__DomAssignment_2 )
            // InternalSecureUML2Java.g:4058:3: rule__BFunction__DomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BFunction__DomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBFunctionAccess().getDomAssignment_2()); 

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
    // $ANTLR end "rule__BFunction__Group__2__Impl"


    // $ANTLR start "rule__BMachine__M_nameAssignment_1"
    // InternalSecureUML2Java.g:4067:1: rule__BMachine__M_nameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BMachine__M_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4071:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4072:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4072:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4073:3: RULE_ID
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


    // $ANTLR start "rule__BMachine__SeesAssignment_3"
    // InternalSecureUML2Java.g:4082:1: rule__BMachine__SeesAssignment_3 : ( ruleBSees ) ;
    public final void rule__BMachine__SeesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4086:1: ( ( ruleBSees ) )
            // InternalSecureUML2Java.g:4087:2: ( ruleBSees )
            {
            // InternalSecureUML2Java.g:4087:2: ( ruleBSees )
            // InternalSecureUML2Java.g:4088:3: ruleBSees
            {
             before(grammarAccess.getBMachineAccess().getSeesBSeesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBSees();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getSeesBSeesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BMachine__SeesAssignment_3"


    // $ANTLR start "rule__BMachine__SeesAssignment_4_1"
    // InternalSecureUML2Java.g:4097:1: rule__BMachine__SeesAssignment_4_1 : ( ruleBSees ) ;
    public final void rule__BMachine__SeesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4101:1: ( ( ruleBSees ) )
            // InternalSecureUML2Java.g:4102:2: ( ruleBSees )
            {
            // InternalSecureUML2Java.g:4102:2: ( ruleBSees )
            // InternalSecureUML2Java.g:4103:3: ruleBSees
            {
             before(grammarAccess.getBMachineAccess().getSeesBSeesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBSees();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getSeesBSeesParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__BMachine__SeesAssignment_4_1"


    // $ANTLR start "rule__BMachine__VarsAssignment_6"
    // InternalSecureUML2Java.g:4112:1: rule__BMachine__VarsAssignment_6 : ( ruleBVariable ) ;
    public final void rule__BMachine__VarsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4116:1: ( ( ruleBVariable ) )
            // InternalSecureUML2Java.g:4117:2: ( ruleBVariable )
            {
            // InternalSecureUML2Java.g:4117:2: ( ruleBVariable )
            // InternalSecureUML2Java.g:4118:3: ruleBVariable
            {
             before(grammarAccess.getBMachineAccess().getVarsBVariableParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBVariable();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getVarsBVariableParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__BMachine__VarsAssignment_6"


    // $ANTLR start "rule__BMachine__VarsAssignment_7_1"
    // InternalSecureUML2Java.g:4127:1: rule__BMachine__VarsAssignment_7_1 : ( ruleBVariable ) ;
    public final void rule__BMachine__VarsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4131:1: ( ( ruleBVariable ) )
            // InternalSecureUML2Java.g:4132:2: ( ruleBVariable )
            {
            // InternalSecureUML2Java.g:4132:2: ( ruleBVariable )
            // InternalSecureUML2Java.g:4133:3: ruleBVariable
            {
             before(grammarAccess.getBMachineAccess().getVarsBVariableParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBVariable();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getVarsBVariableParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__BMachine__VarsAssignment_7_1"


    // $ANTLR start "rule__BMachine__InvsAssignment_9"
    // InternalSecureUML2Java.g:4142:1: rule__BMachine__InvsAssignment_9 : ( ruleBInvariant ) ;
    public final void rule__BMachine__InvsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4146:1: ( ( ruleBInvariant ) )
            // InternalSecureUML2Java.g:4147:2: ( ruleBInvariant )
            {
            // InternalSecureUML2Java.g:4147:2: ( ruleBInvariant )
            // InternalSecureUML2Java.g:4148:3: ruleBInvariant
            {
             before(grammarAccess.getBMachineAccess().getInvsBInvariantParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBInvariant();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getInvsBInvariantParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__BMachine__InvsAssignment_9"


    // $ANTLR start "rule__BMachine__InvsAssignment_10_1"
    // InternalSecureUML2Java.g:4157:1: rule__BMachine__InvsAssignment_10_1 : ( ruleBInvariant ) ;
    public final void rule__BMachine__InvsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4161:1: ( ( ruleBInvariant ) )
            // InternalSecureUML2Java.g:4162:2: ( ruleBInvariant )
            {
            // InternalSecureUML2Java.g:4162:2: ( ruleBInvariant )
            // InternalSecureUML2Java.g:4163:3: ruleBInvariant
            {
             before(grammarAccess.getBMachineAccess().getInvsBInvariantParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBInvariant();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getInvsBInvariantParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__BMachine__InvsAssignment_10_1"


    // $ANTLR start "rule__BMachine__InitsAssignment_12"
    // InternalSecureUML2Java.g:4172:1: rule__BMachine__InitsAssignment_12 : ( ruleBInit ) ;
    public final void rule__BMachine__InitsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4176:1: ( ( ruleBInit ) )
            // InternalSecureUML2Java.g:4177:2: ( ruleBInit )
            {
            // InternalSecureUML2Java.g:4177:2: ( ruleBInit )
            // InternalSecureUML2Java.g:4178:3: ruleBInit
            {
             before(grammarAccess.getBMachineAccess().getInitsBInitParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleBInit();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getInitsBInitParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__BMachine__InitsAssignment_12"


    // $ANTLR start "rule__BMachine__InitsAssignment_13_1"
    // InternalSecureUML2Java.g:4187:1: rule__BMachine__InitsAssignment_13_1 : ( ruleBInit ) ;
    public final void rule__BMachine__InitsAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4191:1: ( ( ruleBInit ) )
            // InternalSecureUML2Java.g:4192:2: ( ruleBInit )
            {
            // InternalSecureUML2Java.g:4192:2: ( ruleBInit )
            // InternalSecureUML2Java.g:4193:3: ruleBInit
            {
             before(grammarAccess.getBMachineAccess().getInitsBInitParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBInit();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getInitsBInitParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__BMachine__InitsAssignment_13_1"


    // $ANTLR start "rule__BMachine__VopsAssignment_15"
    // InternalSecureUML2Java.g:4202:1: rule__BMachine__VopsAssignment_15 : ( ruleVoidOperation ) ;
    public final void rule__BMachine__VopsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4206:1: ( ( ruleVoidOperation ) )
            // InternalSecureUML2Java.g:4207:2: ( ruleVoidOperation )
            {
            // InternalSecureUML2Java.g:4207:2: ( ruleVoidOperation )
            // InternalSecureUML2Java.g:4208:3: ruleVoidOperation
            {
             before(grammarAccess.getBMachineAccess().getVopsVoidOperationParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleVoidOperation();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getVopsVoidOperationParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__BMachine__VopsAssignment_15"


    // $ANTLR start "rule__BMachine__VopsAssignment_16_1"
    // InternalSecureUML2Java.g:4217:1: rule__BMachine__VopsAssignment_16_1 : ( ruleVoidOperation ) ;
    public final void rule__BMachine__VopsAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4221:1: ( ( ruleVoidOperation ) )
            // InternalSecureUML2Java.g:4222:2: ( ruleVoidOperation )
            {
            // InternalSecureUML2Java.g:4222:2: ( ruleVoidOperation )
            // InternalSecureUML2Java.g:4223:3: ruleVoidOperation
            {
             before(grammarAccess.getBMachineAccess().getVopsVoidOperationParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVoidOperation();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getVopsVoidOperationParserRuleCall_16_1_0()); 

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
    // $ANTLR end "rule__BMachine__VopsAssignment_16_1"


    // $ANTLR start "rule__BMachine__SopsAssignment_18"
    // InternalSecureUML2Java.g:4232:1: rule__BMachine__SopsAssignment_18 : ( ruleStringOperation ) ;
    public final void rule__BMachine__SopsAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4236:1: ( ( ruleStringOperation ) )
            // InternalSecureUML2Java.g:4237:2: ( ruleStringOperation )
            {
            // InternalSecureUML2Java.g:4237:2: ( ruleStringOperation )
            // InternalSecureUML2Java.g:4238:3: ruleStringOperation
            {
             before(grammarAccess.getBMachineAccess().getSopsStringOperationParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOperation();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getSopsStringOperationParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__BMachine__SopsAssignment_18"


    // $ANTLR start "rule__BMachine__SopsAssignment_19_1"
    // InternalSecureUML2Java.g:4247:1: rule__BMachine__SopsAssignment_19_1 : ( ruleStringOperation ) ;
    public final void rule__BMachine__SopsAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4251:1: ( ( ruleStringOperation ) )
            // InternalSecureUML2Java.g:4252:2: ( ruleStringOperation )
            {
            // InternalSecureUML2Java.g:4252:2: ( ruleStringOperation )
            // InternalSecureUML2Java.g:4253:3: ruleStringOperation
            {
             before(grammarAccess.getBMachineAccess().getSopsStringOperationParserRuleCall_19_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOperation();

            state._fsp--;

             after(grammarAccess.getBMachineAccess().getSopsStringOperationParserRuleCall_19_1_0()); 

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
    // $ANTLR end "rule__BMachine__SopsAssignment_19_1"


    // $ANTLR start "rule__VoidOperation__Op_nameAssignment_0"
    // InternalSecureUML2Java.g:4262:1: rule__VoidOperation__Op_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VoidOperation__Op_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4266:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4267:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4267:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4268:3: RULE_ID
            {
             before(grammarAccess.getVoidOperationAccess().getOp_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getOp_nameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__VoidOperation__Op_nameAssignment_0"


    // $ANTLR start "rule__VoidOperation__PListAssignment_2_0"
    // InternalSecureUML2Java.g:4277:1: rule__VoidOperation__PListAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__VoidOperation__PListAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4281:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4282:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4282:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4283:3: RULE_ID
            {
             before(grammarAccess.getVoidOperationAccess().getPListIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getPListIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__VoidOperation__PListAssignment_2_0"


    // $ANTLR start "rule__VoidOperation__PListAssignment_2_1_1"
    // InternalSecureUML2Java.g:4292:1: rule__VoidOperation__PListAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__VoidOperation__PListAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4296:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4297:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4297:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4298:3: RULE_ID
            {
             before(grammarAccess.getVoidOperationAccess().getPListIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getPListIDTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__VoidOperation__PListAssignment_2_1_1"


    // $ANTLR start "rule__VoidOperation__ParamsAssignment_6_0"
    // InternalSecureUML2Java.g:4307:1: rule__VoidOperation__ParamsAssignment_6_0 : ( ruleBParameter ) ;
    public final void rule__VoidOperation__ParamsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4311:1: ( ( ruleBParameter ) )
            // InternalSecureUML2Java.g:4312:2: ( ruleBParameter )
            {
            // InternalSecureUML2Java.g:4312:2: ( ruleBParameter )
            // InternalSecureUML2Java.g:4313:3: ruleBParameter
            {
             before(grammarAccess.getVoidOperationAccess().getParamsBParameterParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameter();

            state._fsp--;

             after(grammarAccess.getVoidOperationAccess().getParamsBParameterParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__VoidOperation__ParamsAssignment_6_0"


    // $ANTLR start "rule__VoidOperation__ParamsAssignment_6_1_1"
    // InternalSecureUML2Java.g:4322:1: rule__VoidOperation__ParamsAssignment_6_1_1 : ( ruleBParameter ) ;
    public final void rule__VoidOperation__ParamsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4326:1: ( ( ruleBParameter ) )
            // InternalSecureUML2Java.g:4327:2: ( ruleBParameter )
            {
            // InternalSecureUML2Java.g:4327:2: ( ruleBParameter )
            // InternalSecureUML2Java.g:4328:3: ruleBParameter
            {
             before(grammarAccess.getVoidOperationAccess().getParamsBParameterParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameter();

            state._fsp--;

             after(grammarAccess.getVoidOperationAccess().getParamsBParameterParserRuleCall_6_1_1_0()); 

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
    // $ANTLR end "rule__VoidOperation__ParamsAssignment_6_1_1"


    // $ANTLR start "rule__VoidOperation__PreAssignment_7_1"
    // InternalSecureUML2Java.g:4337:1: rule__VoidOperation__PreAssignment_7_1 : ( ruleBPredicate ) ;
    public final void rule__VoidOperation__PreAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4341:1: ( ( ruleBPredicate ) )
            // InternalSecureUML2Java.g:4342:2: ( ruleBPredicate )
            {
            // InternalSecureUML2Java.g:4342:2: ( ruleBPredicate )
            // InternalSecureUML2Java.g:4343:3: ruleBPredicate
            {
             before(grammarAccess.getVoidOperationAccess().getPreBPredicateParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getVoidOperationAccess().getPreBPredicateParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__VoidOperation__PreAssignment_7_1"


    // $ANTLR start "rule__VoidOperation__SubsAssignment_9"
    // InternalSecureUML2Java.g:4352:1: rule__VoidOperation__SubsAssignment_9 : ( ruleBSubstitution ) ;
    public final void rule__VoidOperation__SubsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4356:1: ( ( ruleBSubstitution ) )
            // InternalSecureUML2Java.g:4357:2: ( ruleBSubstitution )
            {
            // InternalSecureUML2Java.g:4357:2: ( ruleBSubstitution )
            // InternalSecureUML2Java.g:4358:3: ruleBSubstitution
            {
             before(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__VoidOperation__SubsAssignment_9"


    // $ANTLR start "rule__VoidOperation__SubsAssignment_10_1"
    // InternalSecureUML2Java.g:4367:1: rule__VoidOperation__SubsAssignment_10_1 : ( ruleBSubstitution ) ;
    public final void rule__VoidOperation__SubsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4371:1: ( ( ruleBSubstitution ) )
            // InternalSecureUML2Java.g:4372:2: ( ruleBSubstitution )
            {
            // InternalSecureUML2Java.g:4372:2: ( ruleBSubstitution )
            // InternalSecureUML2Java.g:4373:3: ruleBSubstitution
            {
             before(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__VoidOperation__SubsAssignment_10_1"


    // $ANTLR start "rule__StringOperation__Res1Assignment_0"
    // InternalSecureUML2Java.g:4382:1: rule__StringOperation__Res1Assignment_0 : ( RULE_ID ) ;
    public final void rule__StringOperation__Res1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4386:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4387:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4387:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4388:3: RULE_ID
            {
             before(grammarAccess.getStringOperationAccess().getRes1IDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getRes1IDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__StringOperation__Res1Assignment_0"


    // $ANTLR start "rule__StringOperation__Op_nameAssignment_2"
    // InternalSecureUML2Java.g:4397:1: rule__StringOperation__Op_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringOperation__Op_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4401:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4402:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4402:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4403:3: RULE_ID
            {
             before(grammarAccess.getStringOperationAccess().getOp_nameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getOp_nameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__StringOperation__Op_nameAssignment_2"


    // $ANTLR start "rule__StringOperation__PListAssignment_4_0"
    // InternalSecureUML2Java.g:4412:1: rule__StringOperation__PListAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__StringOperation__PListAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4416:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4417:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4417:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4418:3: RULE_ID
            {
             before(grammarAccess.getStringOperationAccess().getPListIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getPListIDTerminalRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__StringOperation__PListAssignment_4_0"


    // $ANTLR start "rule__StringOperation__PListAssignment_4_1_1"
    // InternalSecureUML2Java.g:4427:1: rule__StringOperation__PListAssignment_4_1_1 : ( RULE_ID ) ;
    public final void rule__StringOperation__PListAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4431:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4432:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4432:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4433:3: RULE_ID
            {
             before(grammarAccess.getStringOperationAccess().getPListIDTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getPListIDTerminalRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__StringOperation__PListAssignment_4_1_1"


    // $ANTLR start "rule__StringOperation__ParamsAssignment_8_0"
    // InternalSecureUML2Java.g:4442:1: rule__StringOperation__ParamsAssignment_8_0 : ( ruleBParameter ) ;
    public final void rule__StringOperation__ParamsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4446:1: ( ( ruleBParameter ) )
            // InternalSecureUML2Java.g:4447:2: ( ruleBParameter )
            {
            // InternalSecureUML2Java.g:4447:2: ( ruleBParameter )
            // InternalSecureUML2Java.g:4448:3: ruleBParameter
            {
             before(grammarAccess.getStringOperationAccess().getParamsBParameterParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameter();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getParamsBParameterParserRuleCall_8_0_0()); 

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
    // $ANTLR end "rule__StringOperation__ParamsAssignment_8_0"


    // $ANTLR start "rule__StringOperation__ParamsAssignment_8_1_1"
    // InternalSecureUML2Java.g:4457:1: rule__StringOperation__ParamsAssignment_8_1_1 : ( ruleBParameter ) ;
    public final void rule__StringOperation__ParamsAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4461:1: ( ( ruleBParameter ) )
            // InternalSecureUML2Java.g:4462:2: ( ruleBParameter )
            {
            // InternalSecureUML2Java.g:4462:2: ( ruleBParameter )
            // InternalSecureUML2Java.g:4463:3: ruleBParameter
            {
             before(grammarAccess.getStringOperationAccess().getParamsBParameterParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameter();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getParamsBParameterParserRuleCall_8_1_1_0()); 

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
    // $ANTLR end "rule__StringOperation__ParamsAssignment_8_1_1"


    // $ANTLR start "rule__StringOperation__Pres1Assignment_11"
    // InternalSecureUML2Java.g:4472:1: rule__StringOperation__Pres1Assignment_11 : ( ruleBPredicate ) ;
    public final void rule__StringOperation__Pres1Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4476:1: ( ( ruleBPredicate ) )
            // InternalSecureUML2Java.g:4477:2: ( ruleBPredicate )
            {
            // InternalSecureUML2Java.g:4477:2: ( ruleBPredicate )
            // InternalSecureUML2Java.g:4478:3: ruleBPredicate
            {
             before(grammarAccess.getStringOperationAccess().getPres1BPredicateParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getPres1BPredicateParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__StringOperation__Pres1Assignment_11"


    // $ANTLR start "rule__StringOperation__Pres1Assignment_12_1"
    // InternalSecureUML2Java.g:4487:1: rule__StringOperation__Pres1Assignment_12_1 : ( ruleBPredicate ) ;
    public final void rule__StringOperation__Pres1Assignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4491:1: ( ( ruleBPredicate ) )
            // InternalSecureUML2Java.g:4492:2: ( ruleBPredicate )
            {
            // InternalSecureUML2Java.g:4492:2: ( ruleBPredicate )
            // InternalSecureUML2Java.g:4493:3: ruleBPredicate
            {
             before(grammarAccess.getStringOperationAccess().getPres1BPredicateParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getPres1BPredicateParserRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__StringOperation__Pres1Assignment_12_1"


    // $ANTLR start "rule__StringOperation__Pres2Assignment_15"
    // InternalSecureUML2Java.g:4502:1: rule__StringOperation__Pres2Assignment_15 : ( ruleBPredicate ) ;
    public final void rule__StringOperation__Pres2Assignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4506:1: ( ( ruleBPredicate ) )
            // InternalSecureUML2Java.g:4507:2: ( ruleBPredicate )
            {
            // InternalSecureUML2Java.g:4507:2: ( ruleBPredicate )
            // InternalSecureUML2Java.g:4508:3: ruleBPredicate
            {
             before(grammarAccess.getStringOperationAccess().getPres2BPredicateParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getPres2BPredicateParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__StringOperation__Pres2Assignment_15"


    // $ANTLR start "rule__StringOperation__Pres2Assignment_16_1"
    // InternalSecureUML2Java.g:4517:1: rule__StringOperation__Pres2Assignment_16_1 : ( ruleBPredicate ) ;
    public final void rule__StringOperation__Pres2Assignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4521:1: ( ( ruleBPredicate ) )
            // InternalSecureUML2Java.g:4522:2: ( ruleBPredicate )
            {
            // InternalSecureUML2Java.g:4522:2: ( ruleBPredicate )
            // InternalSecureUML2Java.g:4523:3: ruleBPredicate
            {
             before(grammarAccess.getStringOperationAccess().getPres2BPredicateParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getPres2BPredicateParserRuleCall_16_1_0()); 

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
    // $ANTLR end "rule__StringOperation__Pres2Assignment_16_1"


    // $ANTLR start "rule__StringOperation__SubifAssignment_18"
    // InternalSecureUML2Java.g:4532:1: rule__StringOperation__SubifAssignment_18 : ( ruleBSubstitution ) ;
    public final void rule__StringOperation__SubifAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4536:1: ( ( ruleBSubstitution ) )
            // InternalSecureUML2Java.g:4537:2: ( ruleBSubstitution )
            {
            // InternalSecureUML2Java.g:4537:2: ( ruleBSubstitution )
            // InternalSecureUML2Java.g:4538:3: ruleBSubstitution
            {
             before(grammarAccess.getStringOperationAccess().getSubifBSubstitutionParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getSubifBSubstitutionParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__StringOperation__SubifAssignment_18"


    // $ANTLR start "rule__StringOperation__Subelse2Assignment_20"
    // InternalSecureUML2Java.g:4547:1: rule__StringOperation__Subelse2Assignment_20 : ( ruleBSubstitution ) ;
    public final void rule__StringOperation__Subelse2Assignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4551:1: ( ( ruleBSubstitution ) )
            // InternalSecureUML2Java.g:4552:2: ( ruleBSubstitution )
            {
            // InternalSecureUML2Java.g:4552:2: ( ruleBSubstitution )
            // InternalSecureUML2Java.g:4553:3: ruleBSubstitution
            {
             before(grammarAccess.getStringOperationAccess().getSubelse2BSubstitutionParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getSubelse2BSubstitutionParserRuleCall_20_0()); 

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
    // $ANTLR end "rule__StringOperation__Subelse2Assignment_20"


    // $ANTLR start "rule__StringOperation__Subelse1Assignment_23"
    // InternalSecureUML2Java.g:4562:1: rule__StringOperation__Subelse1Assignment_23 : ( ruleBSubstitution ) ;
    public final void rule__StringOperation__Subelse1Assignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4566:1: ( ( ruleBSubstitution ) )
            // InternalSecureUML2Java.g:4567:2: ( ruleBSubstitution )
            {
            // InternalSecureUML2Java.g:4567:2: ( ruleBSubstitution )
            // InternalSecureUML2Java.g:4568:3: ruleBSubstitution
            {
             before(grammarAccess.getStringOperationAccess().getSubelse1BSubstitutionParserRuleCall_23_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getSubelse1BSubstitutionParserRuleCall_23_0()); 

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
    // $ANTLR end "rule__StringOperation__Subelse1Assignment_23"


    // $ANTLR start "rule__BSubstitution__SleftAssignment_0"
    // InternalSecureUML2Java.g:4577:1: rule__BSubstitution__SleftAssignment_0 : ( ( rule__BSubstitution__SleftAlternatives_0_0 ) ) ;
    public final void rule__BSubstitution__SleftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4581:1: ( ( ( rule__BSubstitution__SleftAlternatives_0_0 ) ) )
            // InternalSecureUML2Java.g:4582:2: ( ( rule__BSubstitution__SleftAlternatives_0_0 ) )
            {
            // InternalSecureUML2Java.g:4582:2: ( ( rule__BSubstitution__SleftAlternatives_0_0 ) )
            // InternalSecureUML2Java.g:4583:3: ( rule__BSubstitution__SleftAlternatives_0_0 )
            {
             before(grammarAccess.getBSubstitutionAccess().getSleftAlternatives_0_0()); 
            // InternalSecureUML2Java.g:4584:3: ( rule__BSubstitution__SleftAlternatives_0_0 )
            // InternalSecureUML2Java.g:4584:4: rule__BSubstitution__SleftAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BSubstitution__SleftAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBSubstitutionAccess().getSleftAlternatives_0_0()); 

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
    // $ANTLR end "rule__BSubstitution__SleftAssignment_0"


    // $ANTLR start "rule__BSubstitution__SrightAssignment_2"
    // InternalSecureUML2Java.g:4592:1: rule__BSubstitution__SrightAssignment_2 : ( RULE_ID ) ;
    public final void rule__BSubstitution__SrightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4596:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4597:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4597:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4598:3: RULE_ID
            {
             before(grammarAccess.getBSubstitutionAccess().getSrightIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSubstitutionAccess().getSrightIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BSubstitution__SrightAssignment_2"


    // $ANTLR start "rule__BPredicate__PleftAssignment_0"
    // InternalSecureUML2Java.g:4607:1: rule__BPredicate__PleftAssignment_0 : ( ( rule__BPredicate__PleftAlternatives_0_0 ) ) ;
    public final void rule__BPredicate__PleftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4611:1: ( ( ( rule__BPredicate__PleftAlternatives_0_0 ) ) )
            // InternalSecureUML2Java.g:4612:2: ( ( rule__BPredicate__PleftAlternatives_0_0 ) )
            {
            // InternalSecureUML2Java.g:4612:2: ( ( rule__BPredicate__PleftAlternatives_0_0 ) )
            // InternalSecureUML2Java.g:4613:3: ( rule__BPredicate__PleftAlternatives_0_0 )
            {
             before(grammarAccess.getBPredicateAccess().getPleftAlternatives_0_0()); 
            // InternalSecureUML2Java.g:4614:3: ( rule__BPredicate__PleftAlternatives_0_0 )
            // InternalSecureUML2Java.g:4614:4: rule__BPredicate__PleftAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__PleftAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBPredicateAccess().getPleftAlternatives_0_0()); 

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
    // $ANTLR end "rule__BPredicate__PleftAssignment_0"


    // $ANTLR start "rule__BPredicate__PrightAssignment_2"
    // InternalSecureUML2Java.g:4622:1: rule__BPredicate__PrightAssignment_2 : ( ( rule__BPredicate__PrightAlternatives_2_0 ) ) ;
    public final void rule__BPredicate__PrightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4626:1: ( ( ( rule__BPredicate__PrightAlternatives_2_0 ) ) )
            // InternalSecureUML2Java.g:4627:2: ( ( rule__BPredicate__PrightAlternatives_2_0 ) )
            {
            // InternalSecureUML2Java.g:4627:2: ( ( rule__BPredicate__PrightAlternatives_2_0 ) )
            // InternalSecureUML2Java.g:4628:3: ( rule__BPredicate__PrightAlternatives_2_0 )
            {
             before(grammarAccess.getBPredicateAccess().getPrightAlternatives_2_0()); 
            // InternalSecureUML2Java.g:4629:3: ( rule__BPredicate__PrightAlternatives_2_0 )
            // InternalSecureUML2Java.g:4629:4: rule__BPredicate__PrightAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__PrightAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBPredicateAccess().getPrightAlternatives_2_0()); 

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
    // $ANTLR end "rule__BPredicate__PrightAssignment_2"


    // $ANTLR start "rule__BDom__ObjAssignment_2"
    // InternalSecureUML2Java.g:4637:1: rule__BDom__ObjAssignment_2 : ( ruleBType ) ;
    public final void rule__BDom__ObjAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4641:1: ( ( ruleBType ) )
            // InternalSecureUML2Java.g:4642:2: ( ruleBType )
            {
            // InternalSecureUML2Java.g:4642:2: ( ruleBType )
            // InternalSecureUML2Java.g:4643:3: ruleBType
            {
             before(grammarAccess.getBDomAccess().getObjBTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBType();

            state._fsp--;

             after(grammarAccess.getBDomAccess().getObjBTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BDom__ObjAssignment_2"


    // $ANTLR start "rule__BParameter__P_nameAssignment_0"
    // InternalSecureUML2Java.g:4652:1: rule__BParameter__P_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BParameter__P_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4656:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4657:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4657:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4658:3: RULE_ID
            {
             before(grammarAccess.getBParameterAccess().getP_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBParameterAccess().getP_nameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BParameter__P_nameAssignment_0"


    // $ANTLR start "rule__BParameter__TypeAssignment_2"
    // InternalSecureUML2Java.g:4667:1: rule__BParameter__TypeAssignment_2 : ( ruleBType ) ;
    public final void rule__BParameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4671:1: ( ( ruleBType ) )
            // InternalSecureUML2Java.g:4672:2: ( ruleBType )
            {
            // InternalSecureUML2Java.g:4672:2: ( ruleBType )
            // InternalSecureUML2Java.g:4673:3: ruleBType
            {
             before(grammarAccess.getBParameterAccess().getTypeBTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBType();

            state._fsp--;

             after(grammarAccess.getBParameterAccess().getTypeBTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BParameter__TypeAssignment_2"


    // $ANTLR start "rule__BType__Type_nameAssignment"
    // InternalSecureUML2Java.g:4682:1: rule__BType__Type_nameAssignment : ( RULE_ID ) ;
    public final void rule__BType__Type_nameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4686:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4687:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4687:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4688:3: RULE_ID
            {
             before(grammarAccess.getBTypeAccess().getType_nameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBTypeAccess().getType_nameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__BType__Type_nameAssignment"


    // $ANTLR start "rule__BInit__VarAssignment_0"
    // InternalSecureUML2Java.g:4697:1: rule__BInit__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__BInit__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4701:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4702:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4702:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4703:3: RULE_ID
            {
             before(grammarAccess.getBInitAccess().getVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBInitAccess().getVarIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BInit__VarAssignment_0"


    // $ANTLR start "rule__BInit__PairAssignment_3"
    // InternalSecureUML2Java.g:4712:1: rule__BInit__PairAssignment_3 : ( ruleBTuple ) ;
    public final void rule__BInit__PairAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4716:1: ( ( ruleBTuple ) )
            // InternalSecureUML2Java.g:4717:2: ( ruleBTuple )
            {
            // InternalSecureUML2Java.g:4717:2: ( ruleBTuple )
            // InternalSecureUML2Java.g:4718:3: ruleBTuple
            {
             before(grammarAccess.getBInitAccess().getPairBTupleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBTuple();

            state._fsp--;

             after(grammarAccess.getBInitAccess().getPairBTupleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BInit__PairAssignment_3"


    // $ANTLR start "rule__BTuple__RanAssignment_0"
    // InternalSecureUML2Java.g:4727:1: rule__BTuple__RanAssignment_0 : ( ( rule__BTuple__RanAlternatives_0_0 ) ) ;
    public final void rule__BTuple__RanAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4731:1: ( ( ( rule__BTuple__RanAlternatives_0_0 ) ) )
            // InternalSecureUML2Java.g:4732:2: ( ( rule__BTuple__RanAlternatives_0_0 ) )
            {
            // InternalSecureUML2Java.g:4732:2: ( ( rule__BTuple__RanAlternatives_0_0 ) )
            // InternalSecureUML2Java.g:4733:3: ( rule__BTuple__RanAlternatives_0_0 )
            {
             before(grammarAccess.getBTupleAccess().getRanAlternatives_0_0()); 
            // InternalSecureUML2Java.g:4734:3: ( rule__BTuple__RanAlternatives_0_0 )
            // InternalSecureUML2Java.g:4734:4: rule__BTuple__RanAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BTuple__RanAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBTupleAccess().getRanAlternatives_0_0()); 

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
    // InternalSecureUML2Java.g:4742:1: rule__BTuple__DomAssignment_2 : ( RULE_ID ) ;
    public final void rule__BTuple__DomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4746:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4747:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4747:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4748:3: RULE_ID
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


    // $ANTLR start "rule__BOperationCall__OpAssignment_0"
    // InternalSecureUML2Java.g:4757:1: rule__BOperationCall__OpAssignment_0 : ( RULE_ID ) ;
    public final void rule__BOperationCall__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4761:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4762:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4762:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4763:3: RULE_ID
            {
             before(grammarAccess.getBOperationCallAccess().getOpIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBOperationCallAccess().getOpIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BOperationCall__OpAssignment_0"


    // $ANTLR start "rule__BOperationCall__ParAssignment_2"
    // InternalSecureUML2Java.g:4772:1: rule__BOperationCall__ParAssignment_2 : ( RULE_ID ) ;
    public final void rule__BOperationCall__ParAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4776:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4777:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4777:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4778:3: RULE_ID
            {
             before(grammarAccess.getBOperationCallAccess().getParIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBOperationCallAccess().getParIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BOperationCall__ParAssignment_2"


    // $ANTLR start "rule__BInvariant__VarAssignment_0_0"
    // InternalSecureUML2Java.g:4787:1: rule__BInvariant__VarAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__BInvariant__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4791:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4792:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4792:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4793:3: RULE_ID
            {
             before(grammarAccess.getBInvariantAccess().getVarIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBInvariantAccess().getVarIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__BInvariant__VarAssignment_0_0"


    // $ANTLR start "rule__BInvariant__VardifAssignment_0_2"
    // InternalSecureUML2Java.g:4802:1: rule__BInvariant__VardifAssignment_0_2 : ( ruleBFunction ) ;
    public final void rule__BInvariant__VardifAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4806:1: ( ( ruleBFunction ) )
            // InternalSecureUML2Java.g:4807:2: ( ruleBFunction )
            {
            // InternalSecureUML2Java.g:4807:2: ( ruleBFunction )
            // InternalSecureUML2Java.g:4808:3: ruleBFunction
            {
             before(grammarAccess.getBInvariantAccess().getVardifBFunctionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBFunction();

            state._fsp--;

             after(grammarAccess.getBInvariantAccess().getVardifBFunctionParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__BInvariant__VardifAssignment_0_2"


    // $ANTLR start "rule__BInvariant__DomAssignment_1_0"
    // InternalSecureUML2Java.g:4817:1: rule__BInvariant__DomAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__BInvariant__DomAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4821:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4822:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4822:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4823:3: RULE_ID
            {
             before(grammarAccess.getBInvariantAccess().getDomIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBInvariantAccess().getDomIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__BInvariant__DomAssignment_1_0"


    // $ANTLR start "rule__BInvariant__RanAssignment_1_2"
    // InternalSecureUML2Java.g:4832:1: rule__BInvariant__RanAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__BInvariant__RanAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4836:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4837:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4837:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4838:3: RULE_ID
            {
             before(grammarAccess.getBInvariantAccess().getRanIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBInvariantAccess().getRanIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__BInvariant__RanAssignment_1_2"


    // $ANTLR start "rule__BFunction__RanAssignment_0"
    // InternalSecureUML2Java.g:4847:1: rule__BFunction__RanAssignment_0 : ( RULE_ID ) ;
    public final void rule__BFunction__RanAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4851:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4852:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4852:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4853:3: RULE_ID
            {
             before(grammarAccess.getBFunctionAccess().getRanIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBFunctionAccess().getRanIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BFunction__RanAssignment_0"


    // $ANTLR start "rule__BFunction__DomAssignment_2"
    // InternalSecureUML2Java.g:4862:1: rule__BFunction__DomAssignment_2 : ( RULE_ID ) ;
    public final void rule__BFunction__DomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4866:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4867:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4867:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4868:3: RULE_ID
            {
             before(grammarAccess.getBFunctionAccess().getDomIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBFunctionAccess().getDomIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BFunction__DomAssignment_2"


    // $ANTLR start "rule__BVariable__Var_nameAssignment"
    // InternalSecureUML2Java.g:4877:1: rule__BVariable__Var_nameAssignment : ( RULE_ID ) ;
    public final void rule__BVariable__Var_nameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4881:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4882:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4882:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4883:3: RULE_ID
            {
             before(grammarAccess.getBVariableAccess().getVar_nameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBVariableAccess().getVar_nameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__BVariable__Var_nameAssignment"


    // $ANTLR start "rule__BSees__M_nameAssignment"
    // InternalSecureUML2Java.g:4892:1: rule__BSees__M_nameAssignment : ( RULE_ID ) ;
    public final void rule__BSees__M_nameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecureUML2Java.g:4896:1: ( ( RULE_ID ) )
            // InternalSecureUML2Java.g:4897:2: ( RULE_ID )
            {
            // InternalSecureUML2Java.g:4897:2: ( RULE_ID )
            // InternalSecureUML2Java.g:4898:3: RULE_ID
            {
             before(grammarAccess.getBSeesAccess().getM_nameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSeesAccess().getM_nameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__BSees__M_nameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000003800L});

}