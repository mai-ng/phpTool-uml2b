package bsql2sql.ide.contentassist.antlr.internal;

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
import bsql2sql.services.BSQL2SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSQL2SQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FALSE'", "'TRUE'", "'MACHINE'", "'VARIABLES'", "'INVARIANT'", "'INITIALISATION'", "':='", "'{}'", "'OPERATIONS'", "'<:'", "'struct'", "'('", "')'", "','", "':'", "'res'", "'<--'", "'='", "'PRE'", "'THEN'", "'bool('", "'#'", "'&'", "'END'", "'\\''", "'.('"
    };
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


        public InternalBSQL2SQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBSQL2SQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBSQL2SQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBSQL2SQL.g"; }


    	private BSQL2SQLGrammarAccess grammarAccess;

    	public void setGrammarAccess(BSQL2SQLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBSQL2SQL"
    // InternalBSQL2SQL.g:53:1: entryRuleBSQL2SQL : ruleBSQL2SQL EOF ;
    public final void entryRuleBSQL2SQL() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:54:1: ( ruleBSQL2SQL EOF )
            // InternalBSQL2SQL.g:55:1: ruleBSQL2SQL EOF
            {
             before(grammarAccess.getBSQL2SQLRule()); 
            pushFollow(FOLLOW_1);
            ruleBSQL2SQL();

            state._fsp--;

             after(grammarAccess.getBSQL2SQLRule()); 
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
    // $ANTLR end "entryRuleBSQL2SQL"


    // $ANTLR start "ruleBSQL2SQL"
    // InternalBSQL2SQL.g:62:1: ruleBSQL2SQL : ( ruleBSQLMachine ) ;
    public final void ruleBSQL2SQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:66:2: ( ( ruleBSQLMachine ) )
            // InternalBSQL2SQL.g:67:2: ( ruleBSQLMachine )
            {
            // InternalBSQL2SQL.g:67:2: ( ruleBSQLMachine )
            // InternalBSQL2SQL.g:68:3: ruleBSQLMachine
            {
             before(grammarAccess.getBSQL2SQLAccess().getBSQLMachineParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBSQLMachine();

            state._fsp--;

             after(grammarAccess.getBSQL2SQLAccess().getBSQLMachineParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSQL2SQL"


    // $ANTLR start "entryRuleBSQLMachine"
    // InternalBSQL2SQL.g:78:1: entryRuleBSQLMachine : ruleBSQLMachine EOF ;
    public final void entryRuleBSQLMachine() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:79:1: ( ruleBSQLMachine EOF )
            // InternalBSQL2SQL.g:80:1: ruleBSQLMachine EOF
            {
             before(grammarAccess.getBSQLMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleBSQLMachine();

            state._fsp--;

             after(grammarAccess.getBSQLMachineRule()); 
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
    // $ANTLR end "entryRuleBSQLMachine"


    // $ANTLR start "ruleBSQLMachine"
    // InternalBSQL2SQL.g:87:1: ruleBSQLMachine : ( ( rule__BSQLMachine__Group__0 ) ) ;
    public final void ruleBSQLMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:91:2: ( ( ( rule__BSQLMachine__Group__0 ) ) )
            // InternalBSQL2SQL.g:92:2: ( ( rule__BSQLMachine__Group__0 ) )
            {
            // InternalBSQL2SQL.g:92:2: ( ( rule__BSQLMachine__Group__0 ) )
            // InternalBSQL2SQL.g:93:3: ( rule__BSQLMachine__Group__0 )
            {
             before(grammarAccess.getBSQLMachineAccess().getGroup()); 
            // InternalBSQL2SQL.g:94:3: ( rule__BSQLMachine__Group__0 )
            // InternalBSQL2SQL.g:94:4: rule__BSQLMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSQLMachine"


    // $ANTLR start "entryRuleBTable"
    // InternalBSQL2SQL.g:103:1: entryRuleBTable : ruleBTable EOF ;
    public final void entryRuleBTable() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:104:1: ( ruleBTable EOF )
            // InternalBSQL2SQL.g:105:1: ruleBTable EOF
            {
             before(grammarAccess.getBTableRule()); 
            pushFollow(FOLLOW_1);
            ruleBTable();

            state._fsp--;

             after(grammarAccess.getBTableRule()); 
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
    // $ANTLR end "entryRuleBTable"


    // $ANTLR start "ruleBTable"
    // InternalBSQL2SQL.g:112:1: ruleBTable : ( ( rule__BTable__Group__0 ) ) ;
    public final void ruleBTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:116:2: ( ( ( rule__BTable__Group__0 ) ) )
            // InternalBSQL2SQL.g:117:2: ( ( rule__BTable__Group__0 ) )
            {
            // InternalBSQL2SQL.g:117:2: ( ( rule__BTable__Group__0 ) )
            // InternalBSQL2SQL.g:118:3: ( rule__BTable__Group__0 )
            {
             before(grammarAccess.getBTableAccess().getGroup()); 
            // InternalBSQL2SQL.g:119:3: ( rule__BTable__Group__0 )
            // InternalBSQL2SQL.g:119:4: rule__BTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BTable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTable"


    // $ANTLR start "entryRuleAttribute"
    // InternalBSQL2SQL.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:129:1: ( ruleAttribute EOF )
            // InternalBSQL2SQL.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalBSQL2SQL.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalBSQL2SQL.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalBSQL2SQL.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalBSQL2SQL.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalBSQL2SQL.g:144:3: ( rule__Attribute__Group__0 )
            // InternalBSQL2SQL.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleBType"
    // InternalBSQL2SQL.g:153:1: entryRuleBType : ruleBType EOF ;
    public final void entryRuleBType() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:154:1: ( ruleBType EOF )
            // InternalBSQL2SQL.g:155:1: ruleBType EOF
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
    // InternalBSQL2SQL.g:162:1: ruleBType : ( ( rule__BType__Type_nameAssignment ) ) ;
    public final void ruleBType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:166:2: ( ( ( rule__BType__Type_nameAssignment ) ) )
            // InternalBSQL2SQL.g:167:2: ( ( rule__BType__Type_nameAssignment ) )
            {
            // InternalBSQL2SQL.g:167:2: ( ( rule__BType__Type_nameAssignment ) )
            // InternalBSQL2SQL.g:168:3: ( rule__BType__Type_nameAssignment )
            {
             before(grammarAccess.getBTypeAccess().getType_nameAssignment()); 
            // InternalBSQL2SQL.g:169:3: ( rule__BType__Type_nameAssignment )
            // InternalBSQL2SQL.g:169:4: rule__BType__Type_nameAssignment
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


    // $ANTLR start "entryRuleBValue"
    // InternalBSQL2SQL.g:178:1: entryRuleBValue : ruleBValue EOF ;
    public final void entryRuleBValue() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:179:1: ( ruleBValue EOF )
            // InternalBSQL2SQL.g:180:1: ruleBValue EOF
            {
             before(grammarAccess.getBValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBValue();

            state._fsp--;

             after(grammarAccess.getBValueRule()); 
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
    // $ANTLR end "entryRuleBValue"


    // $ANTLR start "ruleBValue"
    // InternalBSQL2SQL.g:187:1: ruleBValue : ( ( rule__BValue__Alternatives ) ) ;
    public final void ruleBValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:191:2: ( ( ( rule__BValue__Alternatives ) ) )
            // InternalBSQL2SQL.g:192:2: ( ( rule__BValue__Alternatives ) )
            {
            // InternalBSQL2SQL.g:192:2: ( ( rule__BValue__Alternatives ) )
            // InternalBSQL2SQL.g:193:3: ( rule__BValue__Alternatives )
            {
             before(grammarAccess.getBValueAccess().getAlternatives()); 
            // InternalBSQL2SQL.g:194:3: ( rule__BValue__Alternatives )
            // InternalBSQL2SQL.g:194:4: rule__BValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBValue"


    // $ANTLR start "entryRuleBSOperation"
    // InternalBSQL2SQL.g:203:1: entryRuleBSOperation : ruleBSOperation EOF ;
    public final void entryRuleBSOperation() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:204:1: ( ruleBSOperation EOF )
            // InternalBSQL2SQL.g:205:1: ruleBSOperation EOF
            {
             before(grammarAccess.getBSOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleBSOperation();

            state._fsp--;

             after(grammarAccess.getBSOperationRule()); 
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
    // $ANTLR end "entryRuleBSOperation"


    // $ANTLR start "ruleBSOperation"
    // InternalBSQL2SQL.g:212:1: ruleBSOperation : ( ( rule__BSOperation__Alternatives ) ) ;
    public final void ruleBSOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:216:2: ( ( ( rule__BSOperation__Alternatives ) ) )
            // InternalBSQL2SQL.g:217:2: ( ( rule__BSOperation__Alternatives ) )
            {
            // InternalBSQL2SQL.g:217:2: ( ( rule__BSOperation__Alternatives ) )
            // InternalBSQL2SQL.g:218:3: ( rule__BSOperation__Alternatives )
            {
             before(grammarAccess.getBSOperationAccess().getAlternatives()); 
            // InternalBSQL2SQL.g:219:3: ( rule__BSOperation__Alternatives )
            // InternalBSQL2SQL.g:219:4: rule__BSOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BSOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBSOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSOperation"


    // $ANTLR start "entryRuleBoolOperation"
    // InternalBSQL2SQL.g:228:1: entryRuleBoolOperation : ruleBoolOperation EOF ;
    public final void entryRuleBoolOperation() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:229:1: ( ruleBoolOperation EOF )
            // InternalBSQL2SQL.g:230:1: ruleBoolOperation EOF
            {
             before(grammarAccess.getBoolOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolOperation();

            state._fsp--;

             after(grammarAccess.getBoolOperationRule()); 
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
    // $ANTLR end "entryRuleBoolOperation"


    // $ANTLR start "ruleBoolOperation"
    // InternalBSQL2SQL.g:237:1: ruleBoolOperation : ( ( rule__BoolOperation__Group__0 ) ) ;
    public final void ruleBoolOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:241:2: ( ( ( rule__BoolOperation__Group__0 ) ) )
            // InternalBSQL2SQL.g:242:2: ( ( rule__BoolOperation__Group__0 ) )
            {
            // InternalBSQL2SQL.g:242:2: ( ( rule__BoolOperation__Group__0 ) )
            // InternalBSQL2SQL.g:243:3: ( rule__BoolOperation__Group__0 )
            {
             before(grammarAccess.getBoolOperationAccess().getGroup()); 
            // InternalBSQL2SQL.g:244:3: ( rule__BoolOperation__Group__0 )
            // InternalBSQL2SQL.g:244:4: rule__BoolOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolOperation"


    // $ANTLR start "entryRuleVoidOperation"
    // InternalBSQL2SQL.g:253:1: entryRuleVoidOperation : ruleVoidOperation EOF ;
    public final void entryRuleVoidOperation() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:254:1: ( ruleVoidOperation EOF )
            // InternalBSQL2SQL.g:255:1: ruleVoidOperation EOF
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
    // InternalBSQL2SQL.g:262:1: ruleVoidOperation : ( ( rule__VoidOperation__Group__0 ) ) ;
    public final void ruleVoidOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:266:2: ( ( ( rule__VoidOperation__Group__0 ) ) )
            // InternalBSQL2SQL.g:267:2: ( ( rule__VoidOperation__Group__0 ) )
            {
            // InternalBSQL2SQL.g:267:2: ( ( rule__VoidOperation__Group__0 ) )
            // InternalBSQL2SQL.g:268:3: ( rule__VoidOperation__Group__0 )
            {
             before(grammarAccess.getVoidOperationAccess().getGroup()); 
            // InternalBSQL2SQL.g:269:3: ( rule__VoidOperation__Group__0 )
            // InternalBSQL2SQL.g:269:4: rule__VoidOperation__Group__0
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


    // $ANTLR start "entryRuleBPredicate"
    // InternalBSQL2SQL.g:278:1: entryRuleBPredicate : ruleBPredicate EOF ;
    public final void entryRuleBPredicate() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:279:1: ( ruleBPredicate EOF )
            // InternalBSQL2SQL.g:280:1: ruleBPredicate EOF
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
    // InternalBSQL2SQL.g:287:1: ruleBPredicate : ( ( rule__BPredicate__Group__0 ) ) ;
    public final void ruleBPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:291:2: ( ( ( rule__BPredicate__Group__0 ) ) )
            // InternalBSQL2SQL.g:292:2: ( ( rule__BPredicate__Group__0 ) )
            {
            // InternalBSQL2SQL.g:292:2: ( ( rule__BPredicate__Group__0 ) )
            // InternalBSQL2SQL.g:293:3: ( rule__BPredicate__Group__0 )
            {
             before(grammarAccess.getBPredicateAccess().getGroup()); 
            // InternalBSQL2SQL.g:294:3: ( rule__BPredicate__Group__0 )
            // InternalBSQL2SQL.g:294:4: rule__BPredicate__Group__0
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


    // $ANTLR start "entryRuleSQLCall"
    // InternalBSQL2SQL.g:303:1: entryRuleSQLCall : ruleSQLCall EOF ;
    public final void entryRuleSQLCall() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:304:1: ( ruleSQLCall EOF )
            // InternalBSQL2SQL.g:305:1: ruleSQLCall EOF
            {
             before(grammarAccess.getSQLCallRule()); 
            pushFollow(FOLLOW_1);
            ruleSQLCall();

            state._fsp--;

             after(grammarAccess.getSQLCallRule()); 
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
    // $ANTLR end "entryRuleSQLCall"


    // $ANTLR start "ruleSQLCall"
    // InternalBSQL2SQL.g:312:1: ruleSQLCall : ( ( rule__SQLCall__Group__0 ) ) ;
    public final void ruleSQLCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:316:2: ( ( ( rule__SQLCall__Group__0 ) ) )
            // InternalBSQL2SQL.g:317:2: ( ( rule__SQLCall__Group__0 ) )
            {
            // InternalBSQL2SQL.g:317:2: ( ( rule__SQLCall__Group__0 ) )
            // InternalBSQL2SQL.g:318:3: ( rule__SQLCall__Group__0 )
            {
             before(grammarAccess.getSQLCallAccess().getGroup()); 
            // InternalBSQL2SQL.g:319:3: ( rule__SQLCall__Group__0 )
            // InternalBSQL2SQL.g:319:4: rule__SQLCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SQLCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSQLCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSQLCall"


    // $ANTLR start "entryRuleTableInstance"
    // InternalBSQL2SQL.g:328:1: entryRuleTableInstance : ruleTableInstance EOF ;
    public final void entryRuleTableInstance() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:329:1: ( ruleTableInstance EOF )
            // InternalBSQL2SQL.g:330:1: ruleTableInstance EOF
            {
             before(grammarAccess.getTableInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleTableInstance();

            state._fsp--;

             after(grammarAccess.getTableInstanceRule()); 
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
    // $ANTLR end "entryRuleTableInstance"


    // $ANTLR start "ruleTableInstance"
    // InternalBSQL2SQL.g:337:1: ruleTableInstance : ( ( rule__TableInstance__Group__0 ) ) ;
    public final void ruleTableInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:341:2: ( ( ( rule__TableInstance__Group__0 ) ) )
            // InternalBSQL2SQL.g:342:2: ( ( rule__TableInstance__Group__0 ) )
            {
            // InternalBSQL2SQL.g:342:2: ( ( rule__TableInstance__Group__0 ) )
            // InternalBSQL2SQL.g:343:3: ( rule__TableInstance__Group__0 )
            {
             before(grammarAccess.getTableInstanceAccess().getGroup()); 
            // InternalBSQL2SQL.g:344:3: ( rule__TableInstance__Group__0 )
            // InternalBSQL2SQL.g:344:4: rule__TableInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableInstance"


    // $ANTLR start "entryRuleTIAssignment"
    // InternalBSQL2SQL.g:353:1: entryRuleTIAssignment : ruleTIAssignment EOF ;
    public final void entryRuleTIAssignment() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:354:1: ( ruleTIAssignment EOF )
            // InternalBSQL2SQL.g:355:1: ruleTIAssignment EOF
            {
             before(grammarAccess.getTIAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleTIAssignment();

            state._fsp--;

             after(grammarAccess.getTIAssignmentRule()); 
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
    // $ANTLR end "entryRuleTIAssignment"


    // $ANTLR start "ruleTIAssignment"
    // InternalBSQL2SQL.g:362:1: ruleTIAssignment : ( ( rule__TIAssignment__Group__0 ) ) ;
    public final void ruleTIAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:366:2: ( ( ( rule__TIAssignment__Group__0 ) ) )
            // InternalBSQL2SQL.g:367:2: ( ( rule__TIAssignment__Group__0 ) )
            {
            // InternalBSQL2SQL.g:367:2: ( ( rule__TIAssignment__Group__0 ) )
            // InternalBSQL2SQL.g:368:3: ( rule__TIAssignment__Group__0 )
            {
             before(grammarAccess.getTIAssignmentAccess().getGroup()); 
            // InternalBSQL2SQL.g:369:3: ( rule__TIAssignment__Group__0 )
            // InternalBSQL2SQL.g:369:4: rule__TIAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TIAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTIAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTIAssignment"


    // $ANTLR start "entryRuleBParameter"
    // InternalBSQL2SQL.g:378:1: entryRuleBParameter : ruleBParameter EOF ;
    public final void entryRuleBParameter() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:379:1: ( ruleBParameter EOF )
            // InternalBSQL2SQL.g:380:1: ruleBParameter EOF
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
    // InternalBSQL2SQL.g:387:1: ruleBParameter : ( ( rule__BParameter__Group__0 ) ) ;
    public final void ruleBParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:391:2: ( ( ( rule__BParameter__Group__0 ) ) )
            // InternalBSQL2SQL.g:392:2: ( ( rule__BParameter__Group__0 ) )
            {
            // InternalBSQL2SQL.g:392:2: ( ( rule__BParameter__Group__0 ) )
            // InternalBSQL2SQL.g:393:3: ( rule__BParameter__Group__0 )
            {
             before(grammarAccess.getBParameterAccess().getGroup()); 
            // InternalBSQL2SQL.g:394:3: ( rule__BParameter__Group__0 )
            // InternalBSQL2SQL.g:394:4: rule__BParameter__Group__0
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


    // $ANTLR start "entryRuleBSubstitution"
    // InternalBSQL2SQL.g:403:1: entryRuleBSubstitution : ruleBSubstitution EOF ;
    public final void entryRuleBSubstitution() throws RecognitionException {
        try {
            // InternalBSQL2SQL.g:404:1: ( ruleBSubstitution EOF )
            // InternalBSQL2SQL.g:405:1: ruleBSubstitution EOF
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
    // InternalBSQL2SQL.g:412:1: ruleBSubstitution : ( ( rule__BSubstitution__Group__0 ) ) ;
    public final void ruleBSubstitution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:416:2: ( ( ( rule__BSubstitution__Group__0 ) ) )
            // InternalBSQL2SQL.g:417:2: ( ( rule__BSubstitution__Group__0 ) )
            {
            // InternalBSQL2SQL.g:417:2: ( ( rule__BSubstitution__Group__0 ) )
            // InternalBSQL2SQL.g:418:3: ( rule__BSubstitution__Group__0 )
            {
             before(grammarAccess.getBSubstitutionAccess().getGroup()); 
            // InternalBSQL2SQL.g:419:3: ( rule__BSubstitution__Group__0 )
            // InternalBSQL2SQL.g:419:4: rule__BSubstitution__Group__0
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


    // $ANTLR start "rule__BValue__Alternatives"
    // InternalBSQL2SQL.g:427:1: rule__BValue__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) | ( 'FALSE' ) | ( 'TRUE' ) );
    public final void rule__BValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:431:1: ( ( RULE_ID ) | ( RULE_INT ) | ( 'FALSE' ) | ( 'TRUE' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                alt1=2;
                }
                break;
            case 11:
                {
                alt1=3;
                }
                break;
            case 12:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBSQL2SQL.g:432:2: ( RULE_ID )
                    {
                    // InternalBSQL2SQL.g:432:2: ( RULE_ID )
                    // InternalBSQL2SQL.g:433:3: RULE_ID
                    {
                     before(grammarAccess.getBValueAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getBValueAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSQL2SQL.g:438:2: ( RULE_INT )
                    {
                    // InternalBSQL2SQL.g:438:2: ( RULE_INT )
                    // InternalBSQL2SQL.g:439:3: RULE_INT
                    {
                     before(grammarAccess.getBValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getBValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSQL2SQL.g:444:2: ( 'FALSE' )
                    {
                    // InternalBSQL2SQL.g:444:2: ( 'FALSE' )
                    // InternalBSQL2SQL.g:445:3: 'FALSE'
                    {
                     before(grammarAccess.getBValueAccess().getFALSEKeyword_2()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBValueAccess().getFALSEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSQL2SQL.g:450:2: ( 'TRUE' )
                    {
                    // InternalBSQL2SQL.g:450:2: ( 'TRUE' )
                    // InternalBSQL2SQL.g:451:3: 'TRUE'
                    {
                     before(grammarAccess.getBValueAccess().getTRUEKeyword_3()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBValueAccess().getTRUEKeyword_3()); 

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
    // $ANTLR end "rule__BValue__Alternatives"


    // $ANTLR start "rule__BSOperation__Alternatives"
    // InternalBSQL2SQL.g:460:1: rule__BSOperation__Alternatives : ( ( ( rule__BSOperation__BopAssignment_0 ) ) | ( ( rule__BSOperation__VopAssignment_1 ) ) );
    public final void rule__BSOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:464:1: ( ( ( rule__BSOperation__BopAssignment_0 ) ) | ( ( rule__BSOperation__VopAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBSQL2SQL.g:465:2: ( ( rule__BSOperation__BopAssignment_0 ) )
                    {
                    // InternalBSQL2SQL.g:465:2: ( ( rule__BSOperation__BopAssignment_0 ) )
                    // InternalBSQL2SQL.g:466:3: ( rule__BSOperation__BopAssignment_0 )
                    {
                     before(grammarAccess.getBSOperationAccess().getBopAssignment_0()); 
                    // InternalBSQL2SQL.g:467:3: ( rule__BSOperation__BopAssignment_0 )
                    // InternalBSQL2SQL.g:467:4: rule__BSOperation__BopAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSOperation__BopAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBSOperationAccess().getBopAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSQL2SQL.g:471:2: ( ( rule__BSOperation__VopAssignment_1 ) )
                    {
                    // InternalBSQL2SQL.g:471:2: ( ( rule__BSOperation__VopAssignment_1 ) )
                    // InternalBSQL2SQL.g:472:3: ( rule__BSOperation__VopAssignment_1 )
                    {
                     before(grammarAccess.getBSOperationAccess().getVopAssignment_1()); 
                    // InternalBSQL2SQL.g:473:3: ( rule__BSOperation__VopAssignment_1 )
                    // InternalBSQL2SQL.g:473:4: rule__BSOperation__VopAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSOperation__VopAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBSOperationAccess().getVopAssignment_1()); 

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
    // $ANTLR end "rule__BSOperation__Alternatives"


    // $ANTLR start "rule__BSQLMachine__Group__0"
    // InternalBSQL2SQL.g:481:1: rule__BSQLMachine__Group__0 : rule__BSQLMachine__Group__0__Impl rule__BSQLMachine__Group__1 ;
    public final void rule__BSQLMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:485:1: ( rule__BSQLMachine__Group__0__Impl rule__BSQLMachine__Group__1 )
            // InternalBSQL2SQL.g:486:2: rule__BSQLMachine__Group__0__Impl rule__BSQLMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BSQLMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__1();

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
    // $ANTLR end "rule__BSQLMachine__Group__0"


    // $ANTLR start "rule__BSQLMachine__Group__0__Impl"
    // InternalBSQL2SQL.g:493:1: rule__BSQLMachine__Group__0__Impl : ( 'MACHINE' ) ;
    public final void rule__BSQLMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:497:1: ( ( 'MACHINE' ) )
            // InternalBSQL2SQL.g:498:1: ( 'MACHINE' )
            {
            // InternalBSQL2SQL.g:498:1: ( 'MACHINE' )
            // InternalBSQL2SQL.g:499:2: 'MACHINE'
            {
             before(grammarAccess.getBSQLMachineAccess().getMACHINEKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getMACHINEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__0__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__1"
    // InternalBSQL2SQL.g:508:1: rule__BSQLMachine__Group__1 : rule__BSQLMachine__Group__1__Impl rule__BSQLMachine__Group__2 ;
    public final void rule__BSQLMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:512:1: ( rule__BSQLMachine__Group__1__Impl rule__BSQLMachine__Group__2 )
            // InternalBSQL2SQL.g:513:2: rule__BSQLMachine__Group__1__Impl rule__BSQLMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BSQLMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__2();

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
    // $ANTLR end "rule__BSQLMachine__Group__1"


    // $ANTLR start "rule__BSQLMachine__Group__1__Impl"
    // InternalBSQL2SQL.g:520:1: rule__BSQLMachine__Group__1__Impl : ( ( rule__BSQLMachine__M_nameAssignment_1 ) ) ;
    public final void rule__BSQLMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:524:1: ( ( ( rule__BSQLMachine__M_nameAssignment_1 ) ) )
            // InternalBSQL2SQL.g:525:1: ( ( rule__BSQLMachine__M_nameAssignment_1 ) )
            {
            // InternalBSQL2SQL.g:525:1: ( ( rule__BSQLMachine__M_nameAssignment_1 ) )
            // InternalBSQL2SQL.g:526:2: ( rule__BSQLMachine__M_nameAssignment_1 )
            {
             before(grammarAccess.getBSQLMachineAccess().getM_nameAssignment_1()); 
            // InternalBSQL2SQL.g:527:2: ( rule__BSQLMachine__M_nameAssignment_1 )
            // InternalBSQL2SQL.g:527:3: rule__BSQLMachine__M_nameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__M_nameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getM_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__1__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__2"
    // InternalBSQL2SQL.g:535:1: rule__BSQLMachine__Group__2 : rule__BSQLMachine__Group__2__Impl rule__BSQLMachine__Group__3 ;
    public final void rule__BSQLMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:539:1: ( rule__BSQLMachine__Group__2__Impl rule__BSQLMachine__Group__3 )
            // InternalBSQL2SQL.g:540:2: rule__BSQLMachine__Group__2__Impl rule__BSQLMachine__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__BSQLMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__3();

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
    // $ANTLR end "rule__BSQLMachine__Group__2"


    // $ANTLR start "rule__BSQLMachine__Group__2__Impl"
    // InternalBSQL2SQL.g:547:1: rule__BSQLMachine__Group__2__Impl : ( 'VARIABLES' ) ;
    public final void rule__BSQLMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:551:1: ( ( 'VARIABLES' ) )
            // InternalBSQL2SQL.g:552:1: ( 'VARIABLES' )
            {
            // InternalBSQL2SQL.g:552:1: ( 'VARIABLES' )
            // InternalBSQL2SQL.g:553:2: 'VARIABLES'
            {
             before(grammarAccess.getBSQLMachineAccess().getVARIABLESKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getVARIABLESKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__2__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__3"
    // InternalBSQL2SQL.g:562:1: rule__BSQLMachine__Group__3 : rule__BSQLMachine__Group__3__Impl rule__BSQLMachine__Group__4 ;
    public final void rule__BSQLMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:566:1: ( rule__BSQLMachine__Group__3__Impl rule__BSQLMachine__Group__4 )
            // InternalBSQL2SQL.g:567:2: rule__BSQLMachine__Group__3__Impl rule__BSQLMachine__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__BSQLMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__4();

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
    // $ANTLR end "rule__BSQLMachine__Group__3"


    // $ANTLR start "rule__BSQLMachine__Group__3__Impl"
    // InternalBSQL2SQL.g:574:1: rule__BSQLMachine__Group__3__Impl : ( ( rule__BSQLMachine__VarsAssignment_3 ) ) ;
    public final void rule__BSQLMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:578:1: ( ( ( rule__BSQLMachine__VarsAssignment_3 ) ) )
            // InternalBSQL2SQL.g:579:1: ( ( rule__BSQLMachine__VarsAssignment_3 ) )
            {
            // InternalBSQL2SQL.g:579:1: ( ( rule__BSQLMachine__VarsAssignment_3 ) )
            // InternalBSQL2SQL.g:580:2: ( rule__BSQLMachine__VarsAssignment_3 )
            {
             before(grammarAccess.getBSQLMachineAccess().getVarsAssignment_3()); 
            // InternalBSQL2SQL.g:581:2: ( rule__BSQLMachine__VarsAssignment_3 )
            // InternalBSQL2SQL.g:581:3: rule__BSQLMachine__VarsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__VarsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getVarsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__3__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__4"
    // InternalBSQL2SQL.g:589:1: rule__BSQLMachine__Group__4 : rule__BSQLMachine__Group__4__Impl rule__BSQLMachine__Group__5 ;
    public final void rule__BSQLMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:593:1: ( rule__BSQLMachine__Group__4__Impl rule__BSQLMachine__Group__5 )
            // InternalBSQL2SQL.g:594:2: rule__BSQLMachine__Group__4__Impl rule__BSQLMachine__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__BSQLMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__5();

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
    // $ANTLR end "rule__BSQLMachine__Group__4"


    // $ANTLR start "rule__BSQLMachine__Group__4__Impl"
    // InternalBSQL2SQL.g:601:1: rule__BSQLMachine__Group__4__Impl : ( 'INVARIANT' ) ;
    public final void rule__BSQLMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:605:1: ( ( 'INVARIANT' ) )
            // InternalBSQL2SQL.g:606:1: ( 'INVARIANT' )
            {
            // InternalBSQL2SQL.g:606:1: ( 'INVARIANT' )
            // InternalBSQL2SQL.g:607:2: 'INVARIANT'
            {
             before(grammarAccess.getBSQLMachineAccess().getINVARIANTKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getINVARIANTKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__4__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__5"
    // InternalBSQL2SQL.g:616:1: rule__BSQLMachine__Group__5 : rule__BSQLMachine__Group__5__Impl rule__BSQLMachine__Group__6 ;
    public final void rule__BSQLMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:620:1: ( rule__BSQLMachine__Group__5__Impl rule__BSQLMachine__Group__6 )
            // InternalBSQL2SQL.g:621:2: rule__BSQLMachine__Group__5__Impl rule__BSQLMachine__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__BSQLMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__6();

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
    // $ANTLR end "rule__BSQLMachine__Group__5"


    // $ANTLR start "rule__BSQLMachine__Group__5__Impl"
    // InternalBSQL2SQL.g:628:1: rule__BSQLMachine__Group__5__Impl : ( ( rule__BSQLMachine__InvAssignment_5 ) ) ;
    public final void rule__BSQLMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:632:1: ( ( ( rule__BSQLMachine__InvAssignment_5 ) ) )
            // InternalBSQL2SQL.g:633:1: ( ( rule__BSQLMachine__InvAssignment_5 ) )
            {
            // InternalBSQL2SQL.g:633:1: ( ( rule__BSQLMachine__InvAssignment_5 ) )
            // InternalBSQL2SQL.g:634:2: ( rule__BSQLMachine__InvAssignment_5 )
            {
             before(grammarAccess.getBSQLMachineAccess().getInvAssignment_5()); 
            // InternalBSQL2SQL.g:635:2: ( rule__BSQLMachine__InvAssignment_5 )
            // InternalBSQL2SQL.g:635:3: rule__BSQLMachine__InvAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__InvAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getInvAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__5__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__6"
    // InternalBSQL2SQL.g:643:1: rule__BSQLMachine__Group__6 : rule__BSQLMachine__Group__6__Impl rule__BSQLMachine__Group__7 ;
    public final void rule__BSQLMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:647:1: ( rule__BSQLMachine__Group__6__Impl rule__BSQLMachine__Group__7 )
            // InternalBSQL2SQL.g:648:2: rule__BSQLMachine__Group__6__Impl rule__BSQLMachine__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__BSQLMachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__7();

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
    // $ANTLR end "rule__BSQLMachine__Group__6"


    // $ANTLR start "rule__BSQLMachine__Group__6__Impl"
    // InternalBSQL2SQL.g:655:1: rule__BSQLMachine__Group__6__Impl : ( 'INITIALISATION' ) ;
    public final void rule__BSQLMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:659:1: ( ( 'INITIALISATION' ) )
            // InternalBSQL2SQL.g:660:1: ( 'INITIALISATION' )
            {
            // InternalBSQL2SQL.g:660:1: ( 'INITIALISATION' )
            // InternalBSQL2SQL.g:661:2: 'INITIALISATION'
            {
             before(grammarAccess.getBSQLMachineAccess().getINITIALISATIONKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getINITIALISATIONKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__6__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__7"
    // InternalBSQL2SQL.g:670:1: rule__BSQLMachine__Group__7 : rule__BSQLMachine__Group__7__Impl rule__BSQLMachine__Group__8 ;
    public final void rule__BSQLMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:674:1: ( rule__BSQLMachine__Group__7__Impl rule__BSQLMachine__Group__8 )
            // InternalBSQL2SQL.g:675:2: rule__BSQLMachine__Group__7__Impl rule__BSQLMachine__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__BSQLMachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__8();

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
    // $ANTLR end "rule__BSQLMachine__Group__7"


    // $ANTLR start "rule__BSQLMachine__Group__7__Impl"
    // InternalBSQL2SQL.g:682:1: rule__BSQLMachine__Group__7__Impl : ( ( rule__BSQLMachine__InitAssignment_7 ) ) ;
    public final void rule__BSQLMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:686:1: ( ( ( rule__BSQLMachine__InitAssignment_7 ) ) )
            // InternalBSQL2SQL.g:687:1: ( ( rule__BSQLMachine__InitAssignment_7 ) )
            {
            // InternalBSQL2SQL.g:687:1: ( ( rule__BSQLMachine__InitAssignment_7 ) )
            // InternalBSQL2SQL.g:688:2: ( rule__BSQLMachine__InitAssignment_7 )
            {
             before(grammarAccess.getBSQLMachineAccess().getInitAssignment_7()); 
            // InternalBSQL2SQL.g:689:2: ( rule__BSQLMachine__InitAssignment_7 )
            // InternalBSQL2SQL.g:689:3: rule__BSQLMachine__InitAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__InitAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getInitAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__7__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__8"
    // InternalBSQL2SQL.g:697:1: rule__BSQLMachine__Group__8 : rule__BSQLMachine__Group__8__Impl rule__BSQLMachine__Group__9 ;
    public final void rule__BSQLMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:701:1: ( rule__BSQLMachine__Group__8__Impl rule__BSQLMachine__Group__9 )
            // InternalBSQL2SQL.g:702:2: rule__BSQLMachine__Group__8__Impl rule__BSQLMachine__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__BSQLMachine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__9();

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
    // $ANTLR end "rule__BSQLMachine__Group__8"


    // $ANTLR start "rule__BSQLMachine__Group__8__Impl"
    // InternalBSQL2SQL.g:709:1: rule__BSQLMachine__Group__8__Impl : ( ':=' ) ;
    public final void rule__BSQLMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:713:1: ( ( ':=' ) )
            // InternalBSQL2SQL.g:714:1: ( ':=' )
            {
            // InternalBSQL2SQL.g:714:1: ( ':=' )
            // InternalBSQL2SQL.g:715:2: ':='
            {
             before(grammarAccess.getBSQLMachineAccess().getColonEqualsSignKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getColonEqualsSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__8__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__9"
    // InternalBSQL2SQL.g:724:1: rule__BSQLMachine__Group__9 : rule__BSQLMachine__Group__9__Impl rule__BSQLMachine__Group__10 ;
    public final void rule__BSQLMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:728:1: ( rule__BSQLMachine__Group__9__Impl rule__BSQLMachine__Group__10 )
            // InternalBSQL2SQL.g:729:2: rule__BSQLMachine__Group__9__Impl rule__BSQLMachine__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__BSQLMachine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__10();

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
    // $ANTLR end "rule__BSQLMachine__Group__9"


    // $ANTLR start "rule__BSQLMachine__Group__9__Impl"
    // InternalBSQL2SQL.g:736:1: rule__BSQLMachine__Group__9__Impl : ( '{}' ) ;
    public final void rule__BSQLMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:740:1: ( ( '{}' ) )
            // InternalBSQL2SQL.g:741:1: ( '{}' )
            {
            // InternalBSQL2SQL.g:741:1: ( '{}' )
            // InternalBSQL2SQL.g:742:2: '{}'
            {
             before(grammarAccess.getBSQLMachineAccess().getLeftCurlyBracketRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getLeftCurlyBracketRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__9__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__10"
    // InternalBSQL2SQL.g:751:1: rule__BSQLMachine__Group__10 : rule__BSQLMachine__Group__10__Impl rule__BSQLMachine__Group__11 ;
    public final void rule__BSQLMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:755:1: ( rule__BSQLMachine__Group__10__Impl rule__BSQLMachine__Group__11 )
            // InternalBSQL2SQL.g:756:2: rule__BSQLMachine__Group__10__Impl rule__BSQLMachine__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__BSQLMachine__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__11();

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
    // $ANTLR end "rule__BSQLMachine__Group__10"


    // $ANTLR start "rule__BSQLMachine__Group__10__Impl"
    // InternalBSQL2SQL.g:763:1: rule__BSQLMachine__Group__10__Impl : ( 'OPERATIONS' ) ;
    public final void rule__BSQLMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:767:1: ( ( 'OPERATIONS' ) )
            // InternalBSQL2SQL.g:768:1: ( 'OPERATIONS' )
            {
            // InternalBSQL2SQL.g:768:1: ( 'OPERATIONS' )
            // InternalBSQL2SQL.g:769:2: 'OPERATIONS'
            {
             before(grammarAccess.getBSQLMachineAccess().getOPERATIONSKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getOPERATIONSKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__10__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__11"
    // InternalBSQL2SQL.g:778:1: rule__BSQLMachine__Group__11 : rule__BSQLMachine__Group__11__Impl ;
    public final void rule__BSQLMachine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:782:1: ( rule__BSQLMachine__Group__11__Impl )
            // InternalBSQL2SQL.g:783:2: rule__BSQLMachine__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__11__Impl();

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
    // $ANTLR end "rule__BSQLMachine__Group__11"


    // $ANTLR start "rule__BSQLMachine__Group__11__Impl"
    // InternalBSQL2SQL.g:789:1: rule__BSQLMachine__Group__11__Impl : ( ( ( rule__BSQLMachine__OpsAssignment_11 ) ) ( ( rule__BSQLMachine__OpsAssignment_11 )* ) ) ;
    public final void rule__BSQLMachine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:793:1: ( ( ( ( rule__BSQLMachine__OpsAssignment_11 ) ) ( ( rule__BSQLMachine__OpsAssignment_11 )* ) ) )
            // InternalBSQL2SQL.g:794:1: ( ( ( rule__BSQLMachine__OpsAssignment_11 ) ) ( ( rule__BSQLMachine__OpsAssignment_11 )* ) )
            {
            // InternalBSQL2SQL.g:794:1: ( ( ( rule__BSQLMachine__OpsAssignment_11 ) ) ( ( rule__BSQLMachine__OpsAssignment_11 )* ) )
            // InternalBSQL2SQL.g:795:2: ( ( rule__BSQLMachine__OpsAssignment_11 ) ) ( ( rule__BSQLMachine__OpsAssignment_11 )* )
            {
            // InternalBSQL2SQL.g:795:2: ( ( rule__BSQLMachine__OpsAssignment_11 ) )
            // InternalBSQL2SQL.g:796:3: ( rule__BSQLMachine__OpsAssignment_11 )
            {
             before(grammarAccess.getBSQLMachineAccess().getOpsAssignment_11()); 
            // InternalBSQL2SQL.g:797:3: ( rule__BSQLMachine__OpsAssignment_11 )
            // InternalBSQL2SQL.g:797:4: rule__BSQLMachine__OpsAssignment_11
            {
            pushFollow(FOLLOW_11);
            rule__BSQLMachine__OpsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getOpsAssignment_11()); 

            }

            // InternalBSQL2SQL.g:800:2: ( ( rule__BSQLMachine__OpsAssignment_11 )* )
            // InternalBSQL2SQL.g:801:3: ( rule__BSQLMachine__OpsAssignment_11 )*
            {
             before(grammarAccess.getBSQLMachineAccess().getOpsAssignment_11()); 
            // InternalBSQL2SQL.g:802:3: ( rule__BSQLMachine__OpsAssignment_11 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBSQL2SQL.g:802:4: rule__BSQLMachine__OpsAssignment_11
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BSQLMachine__OpsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBSQLMachineAccess().getOpsAssignment_11()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__11__Impl"


    // $ANTLR start "rule__BTable__Group__0"
    // InternalBSQL2SQL.g:812:1: rule__BTable__Group__0 : rule__BTable__Group__0__Impl rule__BTable__Group__1 ;
    public final void rule__BTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:816:1: ( rule__BTable__Group__0__Impl rule__BTable__Group__1 )
            // InternalBSQL2SQL.g:817:2: rule__BTable__Group__0__Impl rule__BTable__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__BTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BTable__Group__1();

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
    // $ANTLR end "rule__BTable__Group__0"


    // $ANTLR start "rule__BTable__Group__0__Impl"
    // InternalBSQL2SQL.g:824:1: rule__BTable__Group__0__Impl : ( ( rule__BTable__Table_nameAssignment_0 ) ) ;
    public final void rule__BTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:828:1: ( ( ( rule__BTable__Table_nameAssignment_0 ) ) )
            // InternalBSQL2SQL.g:829:1: ( ( rule__BTable__Table_nameAssignment_0 ) )
            {
            // InternalBSQL2SQL.g:829:1: ( ( rule__BTable__Table_nameAssignment_0 ) )
            // InternalBSQL2SQL.g:830:2: ( rule__BTable__Table_nameAssignment_0 )
            {
             before(grammarAccess.getBTableAccess().getTable_nameAssignment_0()); 
            // InternalBSQL2SQL.g:831:2: ( rule__BTable__Table_nameAssignment_0 )
            // InternalBSQL2SQL.g:831:3: rule__BTable__Table_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BTable__Table_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBTableAccess().getTable_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Group__0__Impl"


    // $ANTLR start "rule__BTable__Group__1"
    // InternalBSQL2SQL.g:839:1: rule__BTable__Group__1 : rule__BTable__Group__1__Impl rule__BTable__Group__2 ;
    public final void rule__BTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:843:1: ( rule__BTable__Group__1__Impl rule__BTable__Group__2 )
            // InternalBSQL2SQL.g:844:2: rule__BTable__Group__1__Impl rule__BTable__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BTable__Group__2();

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
    // $ANTLR end "rule__BTable__Group__1"


    // $ANTLR start "rule__BTable__Group__1__Impl"
    // InternalBSQL2SQL.g:851:1: rule__BTable__Group__1__Impl : ( '<:' ) ;
    public final void rule__BTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:855:1: ( ( '<:' ) )
            // InternalBSQL2SQL.g:856:1: ( '<:' )
            {
            // InternalBSQL2SQL.g:856:1: ( '<:' )
            // InternalBSQL2SQL.g:857:2: '<:'
            {
             before(grammarAccess.getBTableAccess().getLessThanSignColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBTableAccess().getLessThanSignColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Group__1__Impl"


    // $ANTLR start "rule__BTable__Group__2"
    // InternalBSQL2SQL.g:866:1: rule__BTable__Group__2 : rule__BTable__Group__2__Impl rule__BTable__Group__3 ;
    public final void rule__BTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:870:1: ( rule__BTable__Group__2__Impl rule__BTable__Group__3 )
            // InternalBSQL2SQL.g:871:2: rule__BTable__Group__2__Impl rule__BTable__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__BTable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BTable__Group__3();

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
    // $ANTLR end "rule__BTable__Group__2"


    // $ANTLR start "rule__BTable__Group__2__Impl"
    // InternalBSQL2SQL.g:878:1: rule__BTable__Group__2__Impl : ( 'struct' ) ;
    public final void rule__BTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:882:1: ( ( 'struct' ) )
            // InternalBSQL2SQL.g:883:1: ( 'struct' )
            {
            // InternalBSQL2SQL.g:883:1: ( 'struct' )
            // InternalBSQL2SQL.g:884:2: 'struct'
            {
             before(grammarAccess.getBTableAccess().getStructKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBTableAccess().getStructKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Group__2__Impl"


    // $ANTLR start "rule__BTable__Group__3"
    // InternalBSQL2SQL.g:893:1: rule__BTable__Group__3 : rule__BTable__Group__3__Impl rule__BTable__Group__4 ;
    public final void rule__BTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:897:1: ( rule__BTable__Group__3__Impl rule__BTable__Group__4 )
            // InternalBSQL2SQL.g:898:2: rule__BTable__Group__3__Impl rule__BTable__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__BTable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BTable__Group__4();

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
    // $ANTLR end "rule__BTable__Group__3"


    // $ANTLR start "rule__BTable__Group__3__Impl"
    // InternalBSQL2SQL.g:905:1: rule__BTable__Group__3__Impl : ( '(' ) ;
    public final void rule__BTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:909:1: ( ( '(' ) )
            // InternalBSQL2SQL.g:910:1: ( '(' )
            {
            // InternalBSQL2SQL.g:910:1: ( '(' )
            // InternalBSQL2SQL.g:911:2: '('
            {
             before(grammarAccess.getBTableAccess().getLeftParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBTableAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Group__3__Impl"


    // $ANTLR start "rule__BTable__Group__4"
    // InternalBSQL2SQL.g:920:1: rule__BTable__Group__4 : rule__BTable__Group__4__Impl rule__BTable__Group__5 ;
    public final void rule__BTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:924:1: ( rule__BTable__Group__4__Impl rule__BTable__Group__5 )
            // InternalBSQL2SQL.g:925:2: rule__BTable__Group__4__Impl rule__BTable__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__BTable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BTable__Group__5();

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
    // $ANTLR end "rule__BTable__Group__4"


    // $ANTLR start "rule__BTable__Group__4__Impl"
    // InternalBSQL2SQL.g:932:1: rule__BTable__Group__4__Impl : ( ( rule__BTable__AttributesAssignment_4 ) ) ;
    public final void rule__BTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:936:1: ( ( ( rule__BTable__AttributesAssignment_4 ) ) )
            // InternalBSQL2SQL.g:937:1: ( ( rule__BTable__AttributesAssignment_4 ) )
            {
            // InternalBSQL2SQL.g:937:1: ( ( rule__BTable__AttributesAssignment_4 ) )
            // InternalBSQL2SQL.g:938:2: ( rule__BTable__AttributesAssignment_4 )
            {
             before(grammarAccess.getBTableAccess().getAttributesAssignment_4()); 
            // InternalBSQL2SQL.g:939:2: ( rule__BTable__AttributesAssignment_4 )
            // InternalBSQL2SQL.g:939:3: rule__BTable__AttributesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BTable__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBTableAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Group__4__Impl"


    // $ANTLR start "rule__BTable__Group__5"
    // InternalBSQL2SQL.g:947:1: rule__BTable__Group__5 : rule__BTable__Group__5__Impl rule__BTable__Group__6 ;
    public final void rule__BTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:951:1: ( rule__BTable__Group__5__Impl rule__BTable__Group__6 )
            // InternalBSQL2SQL.g:952:2: rule__BTable__Group__5__Impl rule__BTable__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__BTable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BTable__Group__6();

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
    // $ANTLR end "rule__BTable__Group__5"


    // $ANTLR start "rule__BTable__Group__5__Impl"
    // InternalBSQL2SQL.g:959:1: rule__BTable__Group__5__Impl : ( ( rule__BTable__Group_5__0 )* ) ;
    public final void rule__BTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:963:1: ( ( ( rule__BTable__Group_5__0 )* ) )
            // InternalBSQL2SQL.g:964:1: ( ( rule__BTable__Group_5__0 )* )
            {
            // InternalBSQL2SQL.g:964:1: ( ( rule__BTable__Group_5__0 )* )
            // InternalBSQL2SQL.g:965:2: ( rule__BTable__Group_5__0 )*
            {
             before(grammarAccess.getBTableAccess().getGroup_5()); 
            // InternalBSQL2SQL.g:966:2: ( rule__BTable__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBSQL2SQL.g:966:3: rule__BTable__Group_5__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__BTable__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBTableAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Group__5__Impl"


    // $ANTLR start "rule__BTable__Group__6"
    // InternalBSQL2SQL.g:974:1: rule__BTable__Group__6 : rule__BTable__Group__6__Impl ;
    public final void rule__BTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:978:1: ( rule__BTable__Group__6__Impl )
            // InternalBSQL2SQL.g:979:2: rule__BTable__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BTable__Group__6__Impl();

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
    // $ANTLR end "rule__BTable__Group__6"


    // $ANTLR start "rule__BTable__Group__6__Impl"
    // InternalBSQL2SQL.g:985:1: rule__BTable__Group__6__Impl : ( ')' ) ;
    public final void rule__BTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:989:1: ( ( ')' ) )
            // InternalBSQL2SQL.g:990:1: ( ')' )
            {
            // InternalBSQL2SQL.g:990:1: ( ')' )
            // InternalBSQL2SQL.g:991:2: ')'
            {
             before(grammarAccess.getBTableAccess().getRightParenthesisKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBTableAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Group__6__Impl"


    // $ANTLR start "rule__BTable__Group_5__0"
    // InternalBSQL2SQL.g:1001:1: rule__BTable__Group_5__0 : rule__BTable__Group_5__0__Impl rule__BTable__Group_5__1 ;
    public final void rule__BTable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1005:1: ( rule__BTable__Group_5__0__Impl rule__BTable__Group_5__1 )
            // InternalBSQL2SQL.g:1006:2: rule__BTable__Group_5__0__Impl rule__BTable__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__BTable__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BTable__Group_5__1();

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
    // $ANTLR end "rule__BTable__Group_5__0"


    // $ANTLR start "rule__BTable__Group_5__0__Impl"
    // InternalBSQL2SQL.g:1013:1: rule__BTable__Group_5__0__Impl : ( ',' ) ;
    public final void rule__BTable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1017:1: ( ( ',' ) )
            // InternalBSQL2SQL.g:1018:1: ( ',' )
            {
            // InternalBSQL2SQL.g:1018:1: ( ',' )
            // InternalBSQL2SQL.g:1019:2: ','
            {
             before(grammarAccess.getBTableAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBTableAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Group_5__0__Impl"


    // $ANTLR start "rule__BTable__Group_5__1"
    // InternalBSQL2SQL.g:1028:1: rule__BTable__Group_5__1 : rule__BTable__Group_5__1__Impl ;
    public final void rule__BTable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1032:1: ( rule__BTable__Group_5__1__Impl )
            // InternalBSQL2SQL.g:1033:2: rule__BTable__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BTable__Group_5__1__Impl();

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
    // $ANTLR end "rule__BTable__Group_5__1"


    // $ANTLR start "rule__BTable__Group_5__1__Impl"
    // InternalBSQL2SQL.g:1039:1: rule__BTable__Group_5__1__Impl : ( ( rule__BTable__AttributesAssignment_5_1 ) ) ;
    public final void rule__BTable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1043:1: ( ( ( rule__BTable__AttributesAssignment_5_1 ) ) )
            // InternalBSQL2SQL.g:1044:1: ( ( rule__BTable__AttributesAssignment_5_1 ) )
            {
            // InternalBSQL2SQL.g:1044:1: ( ( rule__BTable__AttributesAssignment_5_1 ) )
            // InternalBSQL2SQL.g:1045:2: ( rule__BTable__AttributesAssignment_5_1 )
            {
             before(grammarAccess.getBTableAccess().getAttributesAssignment_5_1()); 
            // InternalBSQL2SQL.g:1046:2: ( rule__BTable__AttributesAssignment_5_1 )
            // InternalBSQL2SQL.g:1046:3: rule__BTable__AttributesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BTable__AttributesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBTableAccess().getAttributesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalBSQL2SQL.g:1055:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1059:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalBSQL2SQL.g:1060:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalBSQL2SQL.g:1067:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__Att_nameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1071:1: ( ( ( rule__Attribute__Att_nameAssignment_0 ) ) )
            // InternalBSQL2SQL.g:1072:1: ( ( rule__Attribute__Att_nameAssignment_0 ) )
            {
            // InternalBSQL2SQL.g:1072:1: ( ( rule__Attribute__Att_nameAssignment_0 ) )
            // InternalBSQL2SQL.g:1073:2: ( rule__Attribute__Att_nameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAtt_nameAssignment_0()); 
            // InternalBSQL2SQL.g:1074:2: ( rule__Attribute__Att_nameAssignment_0 )
            // InternalBSQL2SQL.g:1074:3: rule__Attribute__Att_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Att_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAtt_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalBSQL2SQL.g:1082:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1086:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalBSQL2SQL.g:1087:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalBSQL2SQL.g:1094:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1098:1: ( ( ':' ) )
            // InternalBSQL2SQL.g:1099:1: ( ':' )
            {
            // InternalBSQL2SQL.g:1099:1: ( ':' )
            // InternalBSQL2SQL.g:1100:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalBSQL2SQL.g:1109:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1113:1: ( rule__Attribute__Group__2__Impl )
            // InternalBSQL2SQL.g:1114:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalBSQL2SQL.g:1120:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1124:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalBSQL2SQL.g:1125:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalBSQL2SQL.g:1125:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalBSQL2SQL.g:1126:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalBSQL2SQL.g:1127:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalBSQL2SQL.g:1127:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__BoolOperation__Group__0"
    // InternalBSQL2SQL.g:1136:1: rule__BoolOperation__Group__0 : rule__BoolOperation__Group__0__Impl rule__BoolOperation__Group__1 ;
    public final void rule__BoolOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1140:1: ( rule__BoolOperation__Group__0__Impl rule__BoolOperation__Group__1 )
            // InternalBSQL2SQL.g:1141:2: rule__BoolOperation__Group__0__Impl rule__BoolOperation__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__BoolOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__1();

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
    // $ANTLR end "rule__BoolOperation__Group__0"


    // $ANTLR start "rule__BoolOperation__Group__0__Impl"
    // InternalBSQL2SQL.g:1148:1: rule__BoolOperation__Group__0__Impl : ( 'res' ) ;
    public final void rule__BoolOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1152:1: ( ( 'res' ) )
            // InternalBSQL2SQL.g:1153:1: ( 'res' )
            {
            // InternalBSQL2SQL.g:1153:1: ( 'res' )
            // InternalBSQL2SQL.g:1154:2: 'res'
            {
             before(grammarAccess.getBoolOperationAccess().getResKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getResKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__0__Impl"


    // $ANTLR start "rule__BoolOperation__Group__1"
    // InternalBSQL2SQL.g:1163:1: rule__BoolOperation__Group__1 : rule__BoolOperation__Group__1__Impl rule__BoolOperation__Group__2 ;
    public final void rule__BoolOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1167:1: ( rule__BoolOperation__Group__1__Impl rule__BoolOperation__Group__2 )
            // InternalBSQL2SQL.g:1168:2: rule__BoolOperation__Group__1__Impl rule__BoolOperation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BoolOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__2();

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
    // $ANTLR end "rule__BoolOperation__Group__1"


    // $ANTLR start "rule__BoolOperation__Group__1__Impl"
    // InternalBSQL2SQL.g:1175:1: rule__BoolOperation__Group__1__Impl : ( '<--' ) ;
    public final void rule__BoolOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1179:1: ( ( '<--' ) )
            // InternalBSQL2SQL.g:1180:1: ( '<--' )
            {
            // InternalBSQL2SQL.g:1180:1: ( '<--' )
            // InternalBSQL2SQL.g:1181:2: '<--'
            {
             before(grammarAccess.getBoolOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__1__Impl"


    // $ANTLR start "rule__BoolOperation__Group__2"
    // InternalBSQL2SQL.g:1190:1: rule__BoolOperation__Group__2 : rule__BoolOperation__Group__2__Impl rule__BoolOperation__Group__3 ;
    public final void rule__BoolOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1194:1: ( rule__BoolOperation__Group__2__Impl rule__BoolOperation__Group__3 )
            // InternalBSQL2SQL.g:1195:2: rule__BoolOperation__Group__2__Impl rule__BoolOperation__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__BoolOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__3();

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
    // $ANTLR end "rule__BoolOperation__Group__2"


    // $ANTLR start "rule__BoolOperation__Group__2__Impl"
    // InternalBSQL2SQL.g:1202:1: rule__BoolOperation__Group__2__Impl : ( ( rule__BoolOperation__Op_nameAssignment_2 ) ) ;
    public final void rule__BoolOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1206:1: ( ( ( rule__BoolOperation__Op_nameAssignment_2 ) ) )
            // InternalBSQL2SQL.g:1207:1: ( ( rule__BoolOperation__Op_nameAssignment_2 ) )
            {
            // InternalBSQL2SQL.g:1207:1: ( ( rule__BoolOperation__Op_nameAssignment_2 ) )
            // InternalBSQL2SQL.g:1208:2: ( rule__BoolOperation__Op_nameAssignment_2 )
            {
             before(grammarAccess.getBoolOperationAccess().getOp_nameAssignment_2()); 
            // InternalBSQL2SQL.g:1209:2: ( rule__BoolOperation__Op_nameAssignment_2 )
            // InternalBSQL2SQL.g:1209:3: rule__BoolOperation__Op_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Op_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getOp_nameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__2__Impl"


    // $ANTLR start "rule__BoolOperation__Group__3"
    // InternalBSQL2SQL.g:1217:1: rule__BoolOperation__Group__3 : rule__BoolOperation__Group__3__Impl rule__BoolOperation__Group__4 ;
    public final void rule__BoolOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1221:1: ( rule__BoolOperation__Group__3__Impl rule__BoolOperation__Group__4 )
            // InternalBSQL2SQL.g:1222:2: rule__BoolOperation__Group__3__Impl rule__BoolOperation__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__BoolOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__4();

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
    // $ANTLR end "rule__BoolOperation__Group__3"


    // $ANTLR start "rule__BoolOperation__Group__3__Impl"
    // InternalBSQL2SQL.g:1229:1: rule__BoolOperation__Group__3__Impl : ( '(' ) ;
    public final void rule__BoolOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1233:1: ( ( '(' ) )
            // InternalBSQL2SQL.g:1234:1: ( '(' )
            {
            // InternalBSQL2SQL.g:1234:1: ( '(' )
            // InternalBSQL2SQL.g:1235:2: '('
            {
             before(grammarAccess.getBoolOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__3__Impl"


    // $ANTLR start "rule__BoolOperation__Group__4"
    // InternalBSQL2SQL.g:1244:1: rule__BoolOperation__Group__4 : rule__BoolOperation__Group__4__Impl rule__BoolOperation__Group__5 ;
    public final void rule__BoolOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1248:1: ( rule__BoolOperation__Group__4__Impl rule__BoolOperation__Group__5 )
            // InternalBSQL2SQL.g:1249:2: rule__BoolOperation__Group__4__Impl rule__BoolOperation__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__BoolOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__5();

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
    // $ANTLR end "rule__BoolOperation__Group__4"


    // $ANTLR start "rule__BoolOperation__Group__4__Impl"
    // InternalBSQL2SQL.g:1256:1: rule__BoolOperation__Group__4__Impl : ( ( rule__BoolOperation__Group_4__0 )? ) ;
    public final void rule__BoolOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1260:1: ( ( ( rule__BoolOperation__Group_4__0 )? ) )
            // InternalBSQL2SQL.g:1261:1: ( ( rule__BoolOperation__Group_4__0 )? )
            {
            // InternalBSQL2SQL.g:1261:1: ( ( rule__BoolOperation__Group_4__0 )? )
            // InternalBSQL2SQL.g:1262:2: ( rule__BoolOperation__Group_4__0 )?
            {
             before(grammarAccess.getBoolOperationAccess().getGroup_4()); 
            // InternalBSQL2SQL.g:1263:2: ( rule__BoolOperation__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBSQL2SQL.g:1263:3: rule__BoolOperation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolOperation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__4__Impl"


    // $ANTLR start "rule__BoolOperation__Group__5"
    // InternalBSQL2SQL.g:1271:1: rule__BoolOperation__Group__5 : rule__BoolOperation__Group__5__Impl rule__BoolOperation__Group__6 ;
    public final void rule__BoolOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1275:1: ( rule__BoolOperation__Group__5__Impl rule__BoolOperation__Group__6 )
            // InternalBSQL2SQL.g:1276:2: rule__BoolOperation__Group__5__Impl rule__BoolOperation__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__BoolOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__6();

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
    // $ANTLR end "rule__BoolOperation__Group__5"


    // $ANTLR start "rule__BoolOperation__Group__5__Impl"
    // InternalBSQL2SQL.g:1283:1: rule__BoolOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__BoolOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1287:1: ( ( ')' ) )
            // InternalBSQL2SQL.g:1288:1: ( ')' )
            {
            // InternalBSQL2SQL.g:1288:1: ( ')' )
            // InternalBSQL2SQL.g:1289:2: ')'
            {
             before(grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__5__Impl"


    // $ANTLR start "rule__BoolOperation__Group__6"
    // InternalBSQL2SQL.g:1298:1: rule__BoolOperation__Group__6 : rule__BoolOperation__Group__6__Impl rule__BoolOperation__Group__7 ;
    public final void rule__BoolOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1302:1: ( rule__BoolOperation__Group__6__Impl rule__BoolOperation__Group__7 )
            // InternalBSQL2SQL.g:1303:2: rule__BoolOperation__Group__6__Impl rule__BoolOperation__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__BoolOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__7();

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
    // $ANTLR end "rule__BoolOperation__Group__6"


    // $ANTLR start "rule__BoolOperation__Group__6__Impl"
    // InternalBSQL2SQL.g:1310:1: rule__BoolOperation__Group__6__Impl : ( '=' ) ;
    public final void rule__BoolOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1314:1: ( ( '=' ) )
            // InternalBSQL2SQL.g:1315:1: ( '=' )
            {
            // InternalBSQL2SQL.g:1315:1: ( '=' )
            // InternalBSQL2SQL.g:1316:2: '='
            {
             before(grammarAccess.getBoolOperationAccess().getEqualsSignKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__6__Impl"


    // $ANTLR start "rule__BoolOperation__Group__7"
    // InternalBSQL2SQL.g:1325:1: rule__BoolOperation__Group__7 : rule__BoolOperation__Group__7__Impl rule__BoolOperation__Group__8 ;
    public final void rule__BoolOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1329:1: ( rule__BoolOperation__Group__7__Impl rule__BoolOperation__Group__8 )
            // InternalBSQL2SQL.g:1330:2: rule__BoolOperation__Group__7__Impl rule__BoolOperation__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__BoolOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__8();

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
    // $ANTLR end "rule__BoolOperation__Group__7"


    // $ANTLR start "rule__BoolOperation__Group__7__Impl"
    // InternalBSQL2SQL.g:1337:1: rule__BoolOperation__Group__7__Impl : ( 'PRE' ) ;
    public final void rule__BoolOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1341:1: ( ( 'PRE' ) )
            // InternalBSQL2SQL.g:1342:1: ( 'PRE' )
            {
            // InternalBSQL2SQL.g:1342:1: ( 'PRE' )
            // InternalBSQL2SQL.g:1343:2: 'PRE'
            {
             before(grammarAccess.getBoolOperationAccess().getPREKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getPREKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__7__Impl"


    // $ANTLR start "rule__BoolOperation__Group__8"
    // InternalBSQL2SQL.g:1352:1: rule__BoolOperation__Group__8 : rule__BoolOperation__Group__8__Impl rule__BoolOperation__Group__9 ;
    public final void rule__BoolOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1356:1: ( rule__BoolOperation__Group__8__Impl rule__BoolOperation__Group__9 )
            // InternalBSQL2SQL.g:1357:2: rule__BoolOperation__Group__8__Impl rule__BoolOperation__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__BoolOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__9();

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
    // $ANTLR end "rule__BoolOperation__Group__8"


    // $ANTLR start "rule__BoolOperation__Group__8__Impl"
    // InternalBSQL2SQL.g:1364:1: rule__BoolOperation__Group__8__Impl : ( ( rule__BoolOperation__Group_8__0 ) ) ;
    public final void rule__BoolOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1368:1: ( ( ( rule__BoolOperation__Group_8__0 ) ) )
            // InternalBSQL2SQL.g:1369:1: ( ( rule__BoolOperation__Group_8__0 ) )
            {
            // InternalBSQL2SQL.g:1369:1: ( ( rule__BoolOperation__Group_8__0 ) )
            // InternalBSQL2SQL.g:1370:2: ( rule__BoolOperation__Group_8__0 )
            {
             before(grammarAccess.getBoolOperationAccess().getGroup_8()); 
            // InternalBSQL2SQL.g:1371:2: ( rule__BoolOperation__Group_8__0 )
            // InternalBSQL2SQL.g:1371:3: rule__BoolOperation__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__8__Impl"


    // $ANTLR start "rule__BoolOperation__Group__9"
    // InternalBSQL2SQL.g:1379:1: rule__BoolOperation__Group__9 : rule__BoolOperation__Group__9__Impl rule__BoolOperation__Group__10 ;
    public final void rule__BoolOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1383:1: ( rule__BoolOperation__Group__9__Impl rule__BoolOperation__Group__10 )
            // InternalBSQL2SQL.g:1384:2: rule__BoolOperation__Group__9__Impl rule__BoolOperation__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__BoolOperation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__10();

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
    // $ANTLR end "rule__BoolOperation__Group__9"


    // $ANTLR start "rule__BoolOperation__Group__9__Impl"
    // InternalBSQL2SQL.g:1391:1: rule__BoolOperation__Group__9__Impl : ( 'THEN' ) ;
    public final void rule__BoolOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1395:1: ( ( 'THEN' ) )
            // InternalBSQL2SQL.g:1396:1: ( 'THEN' )
            {
            // InternalBSQL2SQL.g:1396:1: ( 'THEN' )
            // InternalBSQL2SQL.g:1397:2: 'THEN'
            {
             before(grammarAccess.getBoolOperationAccess().getTHENKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getTHENKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__9__Impl"


    // $ANTLR start "rule__BoolOperation__Group__10"
    // InternalBSQL2SQL.g:1406:1: rule__BoolOperation__Group__10 : rule__BoolOperation__Group__10__Impl rule__BoolOperation__Group__11 ;
    public final void rule__BoolOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1410:1: ( rule__BoolOperation__Group__10__Impl rule__BoolOperation__Group__11 )
            // InternalBSQL2SQL.g:1411:2: rule__BoolOperation__Group__10__Impl rule__BoolOperation__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__BoolOperation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__11();

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
    // $ANTLR end "rule__BoolOperation__Group__10"


    // $ANTLR start "rule__BoolOperation__Group__10__Impl"
    // InternalBSQL2SQL.g:1418:1: rule__BoolOperation__Group__10__Impl : ( 'res' ) ;
    public final void rule__BoolOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1422:1: ( ( 'res' ) )
            // InternalBSQL2SQL.g:1423:1: ( 'res' )
            {
            // InternalBSQL2SQL.g:1423:1: ( 'res' )
            // InternalBSQL2SQL.g:1424:2: 'res'
            {
             before(grammarAccess.getBoolOperationAccess().getResKeyword_10()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getResKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__10__Impl"


    // $ANTLR start "rule__BoolOperation__Group__11"
    // InternalBSQL2SQL.g:1433:1: rule__BoolOperation__Group__11 : rule__BoolOperation__Group__11__Impl rule__BoolOperation__Group__12 ;
    public final void rule__BoolOperation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1437:1: ( rule__BoolOperation__Group__11__Impl rule__BoolOperation__Group__12 )
            // InternalBSQL2SQL.g:1438:2: rule__BoolOperation__Group__11__Impl rule__BoolOperation__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__BoolOperation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__12();

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
    // $ANTLR end "rule__BoolOperation__Group__11"


    // $ANTLR start "rule__BoolOperation__Group__11__Impl"
    // InternalBSQL2SQL.g:1445:1: rule__BoolOperation__Group__11__Impl : ( ':=' ) ;
    public final void rule__BoolOperation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1449:1: ( ( ':=' ) )
            // InternalBSQL2SQL.g:1450:1: ( ':=' )
            {
            // InternalBSQL2SQL.g:1450:1: ( ':=' )
            // InternalBSQL2SQL.g:1451:2: ':='
            {
             before(grammarAccess.getBoolOperationAccess().getColonEqualsSignKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getColonEqualsSignKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__11__Impl"


    // $ANTLR start "rule__BoolOperation__Group__12"
    // InternalBSQL2SQL.g:1460:1: rule__BoolOperation__Group__12 : rule__BoolOperation__Group__12__Impl rule__BoolOperation__Group__13 ;
    public final void rule__BoolOperation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1464:1: ( rule__BoolOperation__Group__12__Impl rule__BoolOperation__Group__13 )
            // InternalBSQL2SQL.g:1465:2: rule__BoolOperation__Group__12__Impl rule__BoolOperation__Group__13
            {
            pushFollow(FOLLOW_25);
            rule__BoolOperation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__13();

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
    // $ANTLR end "rule__BoolOperation__Group__12"


    // $ANTLR start "rule__BoolOperation__Group__12__Impl"
    // InternalBSQL2SQL.g:1472:1: rule__BoolOperation__Group__12__Impl : ( 'bool(' ) ;
    public final void rule__BoolOperation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1476:1: ( ( 'bool(' ) )
            // InternalBSQL2SQL.g:1477:1: ( 'bool(' )
            {
            // InternalBSQL2SQL.g:1477:1: ( 'bool(' )
            // InternalBSQL2SQL.g:1478:2: 'bool('
            {
             before(grammarAccess.getBoolOperationAccess().getBoolKeyword_12()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getBoolKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__12__Impl"


    // $ANTLR start "rule__BoolOperation__Group__13"
    // InternalBSQL2SQL.g:1487:1: rule__BoolOperation__Group__13 : rule__BoolOperation__Group__13__Impl rule__BoolOperation__Group__14 ;
    public final void rule__BoolOperation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1491:1: ( rule__BoolOperation__Group__13__Impl rule__BoolOperation__Group__14 )
            // InternalBSQL2SQL.g:1492:2: rule__BoolOperation__Group__13__Impl rule__BoolOperation__Group__14
            {
            pushFollow(FOLLOW_3);
            rule__BoolOperation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__14();

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
    // $ANTLR end "rule__BoolOperation__Group__13"


    // $ANTLR start "rule__BoolOperation__Group__13__Impl"
    // InternalBSQL2SQL.g:1499:1: rule__BoolOperation__Group__13__Impl : ( '#' ) ;
    public final void rule__BoolOperation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1503:1: ( ( '#' ) )
            // InternalBSQL2SQL.g:1504:1: ( '#' )
            {
            // InternalBSQL2SQL.g:1504:1: ( '#' )
            // InternalBSQL2SQL.g:1505:2: '#'
            {
             before(grammarAccess.getBoolOperationAccess().getNumberSignKeyword_13()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getNumberSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__13__Impl"


    // $ANTLR start "rule__BoolOperation__Group__14"
    // InternalBSQL2SQL.g:1514:1: rule__BoolOperation__Group__14 : rule__BoolOperation__Group__14__Impl rule__BoolOperation__Group__15 ;
    public final void rule__BoolOperation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1518:1: ( rule__BoolOperation__Group__14__Impl rule__BoolOperation__Group__15 )
            // InternalBSQL2SQL.g:1519:2: rule__BoolOperation__Group__14__Impl rule__BoolOperation__Group__15
            {
            pushFollow(FOLLOW_26);
            rule__BoolOperation__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__15();

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
    // $ANTLR end "rule__BoolOperation__Group__14"


    // $ANTLR start "rule__BoolOperation__Group__14__Impl"
    // InternalBSQL2SQL.g:1526:1: rule__BoolOperation__Group__14__Impl : ( ( rule__BoolOperation__ObjTableAssignment_14 ) ) ;
    public final void rule__BoolOperation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1530:1: ( ( ( rule__BoolOperation__ObjTableAssignment_14 ) ) )
            // InternalBSQL2SQL.g:1531:1: ( ( rule__BoolOperation__ObjTableAssignment_14 ) )
            {
            // InternalBSQL2SQL.g:1531:1: ( ( rule__BoolOperation__ObjTableAssignment_14 ) )
            // InternalBSQL2SQL.g:1532:2: ( rule__BoolOperation__ObjTableAssignment_14 )
            {
             before(grammarAccess.getBoolOperationAccess().getObjTableAssignment_14()); 
            // InternalBSQL2SQL.g:1533:2: ( rule__BoolOperation__ObjTableAssignment_14 )
            // InternalBSQL2SQL.g:1533:3: rule__BoolOperation__ObjTableAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__ObjTableAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getObjTableAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__14__Impl"


    // $ANTLR start "rule__BoolOperation__Group__15"
    // InternalBSQL2SQL.g:1541:1: rule__BoolOperation__Group__15 : rule__BoolOperation__Group__15__Impl rule__BoolOperation__Group__16 ;
    public final void rule__BoolOperation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1545:1: ( rule__BoolOperation__Group__15__Impl rule__BoolOperation__Group__16 )
            // InternalBSQL2SQL.g:1546:2: rule__BoolOperation__Group__15__Impl rule__BoolOperation__Group__16
            {
            pushFollow(FOLLOW_3);
            rule__BoolOperation__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__16();

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
    // $ANTLR end "rule__BoolOperation__Group__15"


    // $ANTLR start "rule__BoolOperation__Group__15__Impl"
    // InternalBSQL2SQL.g:1553:1: rule__BoolOperation__Group__15__Impl : ( '&' ) ;
    public final void rule__BoolOperation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1557:1: ( ( '&' ) )
            // InternalBSQL2SQL.g:1558:1: ( '&' )
            {
            // InternalBSQL2SQL.g:1558:1: ( '&' )
            // InternalBSQL2SQL.g:1559:2: '&'
            {
             before(grammarAccess.getBoolOperationAccess().getAmpersandKeyword_15()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getAmpersandKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__15__Impl"


    // $ANTLR start "rule__BoolOperation__Group__16"
    // InternalBSQL2SQL.g:1568:1: rule__BoolOperation__Group__16 : rule__BoolOperation__Group__16__Impl rule__BoolOperation__Group__17 ;
    public final void rule__BoolOperation__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1572:1: ( rule__BoolOperation__Group__16__Impl rule__BoolOperation__Group__17 )
            // InternalBSQL2SQL.g:1573:2: rule__BoolOperation__Group__16__Impl rule__BoolOperation__Group__17
            {
            pushFollow(FOLLOW_27);
            rule__BoolOperation__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__17();

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
    // $ANTLR end "rule__BoolOperation__Group__16"


    // $ANTLR start "rule__BoolOperation__Group__16__Impl"
    // InternalBSQL2SQL.g:1580:1: rule__BoolOperation__Group__16__Impl : ( ( rule__BoolOperation__PresAssignment_16 ) ) ;
    public final void rule__BoolOperation__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1584:1: ( ( ( rule__BoolOperation__PresAssignment_16 ) ) )
            // InternalBSQL2SQL.g:1585:1: ( ( rule__BoolOperation__PresAssignment_16 ) )
            {
            // InternalBSQL2SQL.g:1585:1: ( ( rule__BoolOperation__PresAssignment_16 ) )
            // InternalBSQL2SQL.g:1586:2: ( rule__BoolOperation__PresAssignment_16 )
            {
             before(grammarAccess.getBoolOperationAccess().getPresAssignment_16()); 
            // InternalBSQL2SQL.g:1587:2: ( rule__BoolOperation__PresAssignment_16 )
            // InternalBSQL2SQL.g:1587:3: rule__BoolOperation__PresAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__PresAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getPresAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__16__Impl"


    // $ANTLR start "rule__BoolOperation__Group__17"
    // InternalBSQL2SQL.g:1595:1: rule__BoolOperation__Group__17 : rule__BoolOperation__Group__17__Impl rule__BoolOperation__Group__18 ;
    public final void rule__BoolOperation__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1599:1: ( rule__BoolOperation__Group__17__Impl rule__BoolOperation__Group__18 )
            // InternalBSQL2SQL.g:1600:2: rule__BoolOperation__Group__17__Impl rule__BoolOperation__Group__18
            {
            pushFollow(FOLLOW_27);
            rule__BoolOperation__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__18();

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
    // $ANTLR end "rule__BoolOperation__Group__17"


    // $ANTLR start "rule__BoolOperation__Group__17__Impl"
    // InternalBSQL2SQL.g:1607:1: rule__BoolOperation__Group__17__Impl : ( ( rule__BoolOperation__Group_17__0 )* ) ;
    public final void rule__BoolOperation__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1611:1: ( ( ( rule__BoolOperation__Group_17__0 )* ) )
            // InternalBSQL2SQL.g:1612:1: ( ( rule__BoolOperation__Group_17__0 )* )
            {
            // InternalBSQL2SQL.g:1612:1: ( ( rule__BoolOperation__Group_17__0 )* )
            // InternalBSQL2SQL.g:1613:2: ( rule__BoolOperation__Group_17__0 )*
            {
             before(grammarAccess.getBoolOperationAccess().getGroup_17()); 
            // InternalBSQL2SQL.g:1614:2: ( rule__BoolOperation__Group_17__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBSQL2SQL.g:1614:3: rule__BoolOperation__Group_17__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__BoolOperation__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBoolOperationAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__17__Impl"


    // $ANTLR start "rule__BoolOperation__Group__18"
    // InternalBSQL2SQL.g:1622:1: rule__BoolOperation__Group__18 : rule__BoolOperation__Group__18__Impl rule__BoolOperation__Group__19 ;
    public final void rule__BoolOperation__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1626:1: ( rule__BoolOperation__Group__18__Impl rule__BoolOperation__Group__19 )
            // InternalBSQL2SQL.g:1627:2: rule__BoolOperation__Group__18__Impl rule__BoolOperation__Group__19
            {
            pushFollow(FOLLOW_29);
            rule__BoolOperation__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__19();

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
    // $ANTLR end "rule__BoolOperation__Group__18"


    // $ANTLR start "rule__BoolOperation__Group__18__Impl"
    // InternalBSQL2SQL.g:1634:1: rule__BoolOperation__Group__18__Impl : ( ')' ) ;
    public final void rule__BoolOperation__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1638:1: ( ( ')' ) )
            // InternalBSQL2SQL.g:1639:1: ( ')' )
            {
            // InternalBSQL2SQL.g:1639:1: ( ')' )
            // InternalBSQL2SQL.g:1640:2: ')'
            {
             before(grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_18()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__18__Impl"


    // $ANTLR start "rule__BoolOperation__Group__19"
    // InternalBSQL2SQL.g:1649:1: rule__BoolOperation__Group__19 : rule__BoolOperation__Group__19__Impl rule__BoolOperation__Group__20 ;
    public final void rule__BoolOperation__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1653:1: ( rule__BoolOperation__Group__19__Impl rule__BoolOperation__Group__20 )
            // InternalBSQL2SQL.g:1654:2: rule__BoolOperation__Group__19__Impl rule__BoolOperation__Group__20
            {
            pushFollow(FOLLOW_30);
            rule__BoolOperation__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__20();

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
    // $ANTLR end "rule__BoolOperation__Group__19"


    // $ANTLR start "rule__BoolOperation__Group__19__Impl"
    // InternalBSQL2SQL.g:1661:1: rule__BoolOperation__Group__19__Impl : ( ')' ) ;
    public final void rule__BoolOperation__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1665:1: ( ( ')' ) )
            // InternalBSQL2SQL.g:1666:1: ( ')' )
            {
            // InternalBSQL2SQL.g:1666:1: ( ')' )
            // InternalBSQL2SQL.g:1667:2: ')'
            {
             before(grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_19()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__19__Impl"


    // $ANTLR start "rule__BoolOperation__Group__20"
    // InternalBSQL2SQL.g:1676:1: rule__BoolOperation__Group__20 : rule__BoolOperation__Group__20__Impl ;
    public final void rule__BoolOperation__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1680:1: ( rule__BoolOperation__Group__20__Impl )
            // InternalBSQL2SQL.g:1681:2: rule__BoolOperation__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__20__Impl();

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
    // $ANTLR end "rule__BoolOperation__Group__20"


    // $ANTLR start "rule__BoolOperation__Group__20__Impl"
    // InternalBSQL2SQL.g:1687:1: rule__BoolOperation__Group__20__Impl : ( 'END' ) ;
    public final void rule__BoolOperation__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1691:1: ( ( 'END' ) )
            // InternalBSQL2SQL.g:1692:1: ( 'END' )
            {
            // InternalBSQL2SQL.g:1692:1: ( 'END' )
            // InternalBSQL2SQL.g:1693:2: 'END'
            {
             before(grammarAccess.getBoolOperationAccess().getENDKeyword_20()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getENDKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group__20__Impl"


    // $ANTLR start "rule__BoolOperation__Group_4__0"
    // InternalBSQL2SQL.g:1703:1: rule__BoolOperation__Group_4__0 : rule__BoolOperation__Group_4__0__Impl rule__BoolOperation__Group_4__1 ;
    public final void rule__BoolOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1707:1: ( rule__BoolOperation__Group_4__0__Impl rule__BoolOperation__Group_4__1 )
            // InternalBSQL2SQL.g:1708:2: rule__BoolOperation__Group_4__0__Impl rule__BoolOperation__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__BoolOperation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_4__1();

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
    // $ANTLR end "rule__BoolOperation__Group_4__0"


    // $ANTLR start "rule__BoolOperation__Group_4__0__Impl"
    // InternalBSQL2SQL.g:1715:1: rule__BoolOperation__Group_4__0__Impl : ( ( rule__BoolOperation__PListAssignment_4_0 ) ) ;
    public final void rule__BoolOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1719:1: ( ( ( rule__BoolOperation__PListAssignment_4_0 ) ) )
            // InternalBSQL2SQL.g:1720:1: ( ( rule__BoolOperation__PListAssignment_4_0 ) )
            {
            // InternalBSQL2SQL.g:1720:1: ( ( rule__BoolOperation__PListAssignment_4_0 ) )
            // InternalBSQL2SQL.g:1721:2: ( rule__BoolOperation__PListAssignment_4_0 )
            {
             before(grammarAccess.getBoolOperationAccess().getPListAssignment_4_0()); 
            // InternalBSQL2SQL.g:1722:2: ( rule__BoolOperation__PListAssignment_4_0 )
            // InternalBSQL2SQL.g:1722:3: rule__BoolOperation__PListAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__PListAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getPListAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_4__0__Impl"


    // $ANTLR start "rule__BoolOperation__Group_4__1"
    // InternalBSQL2SQL.g:1730:1: rule__BoolOperation__Group_4__1 : rule__BoolOperation__Group_4__1__Impl ;
    public final void rule__BoolOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1734:1: ( rule__BoolOperation__Group_4__1__Impl )
            // InternalBSQL2SQL.g:1735:2: rule__BoolOperation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_4__1__Impl();

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
    // $ANTLR end "rule__BoolOperation__Group_4__1"


    // $ANTLR start "rule__BoolOperation__Group_4__1__Impl"
    // InternalBSQL2SQL.g:1741:1: rule__BoolOperation__Group_4__1__Impl : ( ( rule__BoolOperation__Group_4_1__0 )* ) ;
    public final void rule__BoolOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1745:1: ( ( ( rule__BoolOperation__Group_4_1__0 )* ) )
            // InternalBSQL2SQL.g:1746:1: ( ( rule__BoolOperation__Group_4_1__0 )* )
            {
            // InternalBSQL2SQL.g:1746:1: ( ( rule__BoolOperation__Group_4_1__0 )* )
            // InternalBSQL2SQL.g:1747:2: ( rule__BoolOperation__Group_4_1__0 )*
            {
             before(grammarAccess.getBoolOperationAccess().getGroup_4_1()); 
            // InternalBSQL2SQL.g:1748:2: ( rule__BoolOperation__Group_4_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBSQL2SQL.g:1748:3: rule__BoolOperation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__BoolOperation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBoolOperationAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_4__1__Impl"


    // $ANTLR start "rule__BoolOperation__Group_4_1__0"
    // InternalBSQL2SQL.g:1757:1: rule__BoolOperation__Group_4_1__0 : rule__BoolOperation__Group_4_1__0__Impl rule__BoolOperation__Group_4_1__1 ;
    public final void rule__BoolOperation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1761:1: ( rule__BoolOperation__Group_4_1__0__Impl rule__BoolOperation__Group_4_1__1 )
            // InternalBSQL2SQL.g:1762:2: rule__BoolOperation__Group_4_1__0__Impl rule__BoolOperation__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BoolOperation__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_4_1__1();

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
    // $ANTLR end "rule__BoolOperation__Group_4_1__0"


    // $ANTLR start "rule__BoolOperation__Group_4_1__0__Impl"
    // InternalBSQL2SQL.g:1769:1: rule__BoolOperation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__BoolOperation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1773:1: ( ( ',' ) )
            // InternalBSQL2SQL.g:1774:1: ( ',' )
            {
            // InternalBSQL2SQL.g:1774:1: ( ',' )
            // InternalBSQL2SQL.g:1775:2: ','
            {
             before(grammarAccess.getBoolOperationAccess().getCommaKeyword_4_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_4_1__0__Impl"


    // $ANTLR start "rule__BoolOperation__Group_4_1__1"
    // InternalBSQL2SQL.g:1784:1: rule__BoolOperation__Group_4_1__1 : rule__BoolOperation__Group_4_1__1__Impl ;
    public final void rule__BoolOperation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1788:1: ( rule__BoolOperation__Group_4_1__1__Impl )
            // InternalBSQL2SQL.g:1789:2: rule__BoolOperation__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__BoolOperation__Group_4_1__1"


    // $ANTLR start "rule__BoolOperation__Group_4_1__1__Impl"
    // InternalBSQL2SQL.g:1795:1: rule__BoolOperation__Group_4_1__1__Impl : ( ( rule__BoolOperation__PListAssignment_4_1_1 ) ) ;
    public final void rule__BoolOperation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1799:1: ( ( ( rule__BoolOperation__PListAssignment_4_1_1 ) ) )
            // InternalBSQL2SQL.g:1800:1: ( ( rule__BoolOperation__PListAssignment_4_1_1 ) )
            {
            // InternalBSQL2SQL.g:1800:1: ( ( rule__BoolOperation__PListAssignment_4_1_1 ) )
            // InternalBSQL2SQL.g:1801:2: ( rule__BoolOperation__PListAssignment_4_1_1 )
            {
             before(grammarAccess.getBoolOperationAccess().getPListAssignment_4_1_1()); 
            // InternalBSQL2SQL.g:1802:2: ( rule__BoolOperation__PListAssignment_4_1_1 )
            // InternalBSQL2SQL.g:1802:3: rule__BoolOperation__PListAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__PListAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getPListAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_4_1__1__Impl"


    // $ANTLR start "rule__BoolOperation__Group_8__0"
    // InternalBSQL2SQL.g:1811:1: rule__BoolOperation__Group_8__0 : rule__BoolOperation__Group_8__0__Impl rule__BoolOperation__Group_8__1 ;
    public final void rule__BoolOperation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1815:1: ( rule__BoolOperation__Group_8__0__Impl rule__BoolOperation__Group_8__1 )
            // InternalBSQL2SQL.g:1816:2: rule__BoolOperation__Group_8__0__Impl rule__BoolOperation__Group_8__1
            {
            pushFollow(FOLLOW_26);
            rule__BoolOperation__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_8__1();

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
    // $ANTLR end "rule__BoolOperation__Group_8__0"


    // $ANTLR start "rule__BoolOperation__Group_8__0__Impl"
    // InternalBSQL2SQL.g:1823:1: rule__BoolOperation__Group_8__0__Impl : ( ( rule__BoolOperation__ParamsAssignment_8_0 ) ) ;
    public final void rule__BoolOperation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1827:1: ( ( ( rule__BoolOperation__ParamsAssignment_8_0 ) ) )
            // InternalBSQL2SQL.g:1828:1: ( ( rule__BoolOperation__ParamsAssignment_8_0 ) )
            {
            // InternalBSQL2SQL.g:1828:1: ( ( rule__BoolOperation__ParamsAssignment_8_0 ) )
            // InternalBSQL2SQL.g:1829:2: ( rule__BoolOperation__ParamsAssignment_8_0 )
            {
             before(grammarAccess.getBoolOperationAccess().getParamsAssignment_8_0()); 
            // InternalBSQL2SQL.g:1830:2: ( rule__BoolOperation__ParamsAssignment_8_0 )
            // InternalBSQL2SQL.g:1830:3: rule__BoolOperation__ParamsAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__ParamsAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getParamsAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_8__0__Impl"


    // $ANTLR start "rule__BoolOperation__Group_8__1"
    // InternalBSQL2SQL.g:1838:1: rule__BoolOperation__Group_8__1 : rule__BoolOperation__Group_8__1__Impl ;
    public final void rule__BoolOperation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1842:1: ( rule__BoolOperation__Group_8__1__Impl )
            // InternalBSQL2SQL.g:1843:2: rule__BoolOperation__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_8__1__Impl();

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
    // $ANTLR end "rule__BoolOperation__Group_8__1"


    // $ANTLR start "rule__BoolOperation__Group_8__1__Impl"
    // InternalBSQL2SQL.g:1849:1: rule__BoolOperation__Group_8__1__Impl : ( ( rule__BoolOperation__Group_8_1__0 )* ) ;
    public final void rule__BoolOperation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1853:1: ( ( ( rule__BoolOperation__Group_8_1__0 )* ) )
            // InternalBSQL2SQL.g:1854:1: ( ( rule__BoolOperation__Group_8_1__0 )* )
            {
            // InternalBSQL2SQL.g:1854:1: ( ( rule__BoolOperation__Group_8_1__0 )* )
            // InternalBSQL2SQL.g:1855:2: ( rule__BoolOperation__Group_8_1__0 )*
            {
             before(grammarAccess.getBoolOperationAccess().getGroup_8_1()); 
            // InternalBSQL2SQL.g:1856:2: ( rule__BoolOperation__Group_8_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBSQL2SQL.g:1856:3: rule__BoolOperation__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__BoolOperation__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBoolOperationAccess().getGroup_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_8__1__Impl"


    // $ANTLR start "rule__BoolOperation__Group_8_1__0"
    // InternalBSQL2SQL.g:1865:1: rule__BoolOperation__Group_8_1__0 : rule__BoolOperation__Group_8_1__0__Impl rule__BoolOperation__Group_8_1__1 ;
    public final void rule__BoolOperation__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1869:1: ( rule__BoolOperation__Group_8_1__0__Impl rule__BoolOperation__Group_8_1__1 )
            // InternalBSQL2SQL.g:1870:2: rule__BoolOperation__Group_8_1__0__Impl rule__BoolOperation__Group_8_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BoolOperation__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_8_1__1();

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
    // $ANTLR end "rule__BoolOperation__Group_8_1__0"


    // $ANTLR start "rule__BoolOperation__Group_8_1__0__Impl"
    // InternalBSQL2SQL.g:1877:1: rule__BoolOperation__Group_8_1__0__Impl : ( '&' ) ;
    public final void rule__BoolOperation__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1881:1: ( ( '&' ) )
            // InternalBSQL2SQL.g:1882:1: ( '&' )
            {
            // InternalBSQL2SQL.g:1882:1: ( '&' )
            // InternalBSQL2SQL.g:1883:2: '&'
            {
             before(grammarAccess.getBoolOperationAccess().getAmpersandKeyword_8_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getAmpersandKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_8_1__0__Impl"


    // $ANTLR start "rule__BoolOperation__Group_8_1__1"
    // InternalBSQL2SQL.g:1892:1: rule__BoolOperation__Group_8_1__1 : rule__BoolOperation__Group_8_1__1__Impl ;
    public final void rule__BoolOperation__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1896:1: ( rule__BoolOperation__Group_8_1__1__Impl )
            // InternalBSQL2SQL.g:1897:2: rule__BoolOperation__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_8_1__1__Impl();

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
    // $ANTLR end "rule__BoolOperation__Group_8_1__1"


    // $ANTLR start "rule__BoolOperation__Group_8_1__1__Impl"
    // InternalBSQL2SQL.g:1903:1: rule__BoolOperation__Group_8_1__1__Impl : ( ( rule__BoolOperation__ParamsAssignment_8_1_1 ) ) ;
    public final void rule__BoolOperation__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1907:1: ( ( ( rule__BoolOperation__ParamsAssignment_8_1_1 ) ) )
            // InternalBSQL2SQL.g:1908:1: ( ( rule__BoolOperation__ParamsAssignment_8_1_1 ) )
            {
            // InternalBSQL2SQL.g:1908:1: ( ( rule__BoolOperation__ParamsAssignment_8_1_1 ) )
            // InternalBSQL2SQL.g:1909:2: ( rule__BoolOperation__ParamsAssignment_8_1_1 )
            {
             before(grammarAccess.getBoolOperationAccess().getParamsAssignment_8_1_1()); 
            // InternalBSQL2SQL.g:1910:2: ( rule__BoolOperation__ParamsAssignment_8_1_1 )
            // InternalBSQL2SQL.g:1910:3: rule__BoolOperation__ParamsAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__ParamsAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getParamsAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_8_1__1__Impl"


    // $ANTLR start "rule__BoolOperation__Group_17__0"
    // InternalBSQL2SQL.g:1919:1: rule__BoolOperation__Group_17__0 : rule__BoolOperation__Group_17__0__Impl rule__BoolOperation__Group_17__1 ;
    public final void rule__BoolOperation__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1923:1: ( rule__BoolOperation__Group_17__0__Impl rule__BoolOperation__Group_17__1 )
            // InternalBSQL2SQL.g:1924:2: rule__BoolOperation__Group_17__0__Impl rule__BoolOperation__Group_17__1
            {
            pushFollow(FOLLOW_3);
            rule__BoolOperation__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_17__1();

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
    // $ANTLR end "rule__BoolOperation__Group_17__0"


    // $ANTLR start "rule__BoolOperation__Group_17__0__Impl"
    // InternalBSQL2SQL.g:1931:1: rule__BoolOperation__Group_17__0__Impl : ( '&' ) ;
    public final void rule__BoolOperation__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1935:1: ( ( '&' ) )
            // InternalBSQL2SQL.g:1936:1: ( '&' )
            {
            // InternalBSQL2SQL.g:1936:1: ( '&' )
            // InternalBSQL2SQL.g:1937:2: '&'
            {
             before(grammarAccess.getBoolOperationAccess().getAmpersandKeyword_17_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getAmpersandKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_17__0__Impl"


    // $ANTLR start "rule__BoolOperation__Group_17__1"
    // InternalBSQL2SQL.g:1946:1: rule__BoolOperation__Group_17__1 : rule__BoolOperation__Group_17__1__Impl ;
    public final void rule__BoolOperation__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1950:1: ( rule__BoolOperation__Group_17__1__Impl )
            // InternalBSQL2SQL.g:1951:2: rule__BoolOperation__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group_17__1__Impl();

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
    // $ANTLR end "rule__BoolOperation__Group_17__1"


    // $ANTLR start "rule__BoolOperation__Group_17__1__Impl"
    // InternalBSQL2SQL.g:1957:1: rule__BoolOperation__Group_17__1__Impl : ( ( rule__BoolOperation__PresAssignment_17_1 ) ) ;
    public final void rule__BoolOperation__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1961:1: ( ( ( rule__BoolOperation__PresAssignment_17_1 ) ) )
            // InternalBSQL2SQL.g:1962:1: ( ( rule__BoolOperation__PresAssignment_17_1 ) )
            {
            // InternalBSQL2SQL.g:1962:1: ( ( rule__BoolOperation__PresAssignment_17_1 ) )
            // InternalBSQL2SQL.g:1963:2: ( rule__BoolOperation__PresAssignment_17_1 )
            {
             before(grammarAccess.getBoolOperationAccess().getPresAssignment_17_1()); 
            // InternalBSQL2SQL.g:1964:2: ( rule__BoolOperation__PresAssignment_17_1 )
            // InternalBSQL2SQL.g:1964:3: rule__BoolOperation__PresAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__PresAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getPresAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Group_17__1__Impl"


    // $ANTLR start "rule__VoidOperation__Group__0"
    // InternalBSQL2SQL.g:1973:1: rule__VoidOperation__Group__0 : rule__VoidOperation__Group__0__Impl rule__VoidOperation__Group__1 ;
    public final void rule__VoidOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1977:1: ( rule__VoidOperation__Group__0__Impl rule__VoidOperation__Group__1 )
            // InternalBSQL2SQL.g:1978:2: rule__VoidOperation__Group__0__Impl rule__VoidOperation__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBSQL2SQL.g:1985:1: rule__VoidOperation__Group__0__Impl : ( ( rule__VoidOperation__Op_nameAssignment_0 ) ) ;
    public final void rule__VoidOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:1989:1: ( ( ( rule__VoidOperation__Op_nameAssignment_0 ) ) )
            // InternalBSQL2SQL.g:1990:1: ( ( rule__VoidOperation__Op_nameAssignment_0 ) )
            {
            // InternalBSQL2SQL.g:1990:1: ( ( rule__VoidOperation__Op_nameAssignment_0 ) )
            // InternalBSQL2SQL.g:1991:2: ( rule__VoidOperation__Op_nameAssignment_0 )
            {
             before(grammarAccess.getVoidOperationAccess().getOp_nameAssignment_0()); 
            // InternalBSQL2SQL.g:1992:2: ( rule__VoidOperation__Op_nameAssignment_0 )
            // InternalBSQL2SQL.g:1992:3: rule__VoidOperation__Op_nameAssignment_0
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
    // InternalBSQL2SQL.g:2000:1: rule__VoidOperation__Group__1 : rule__VoidOperation__Group__1__Impl rule__VoidOperation__Group__2 ;
    public final void rule__VoidOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2004:1: ( rule__VoidOperation__Group__1__Impl rule__VoidOperation__Group__2 )
            // InternalBSQL2SQL.g:2005:2: rule__VoidOperation__Group__1__Impl rule__VoidOperation__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSQL2SQL.g:2012:1: rule__VoidOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__VoidOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2016:1: ( ( '(' ) )
            // InternalBSQL2SQL.g:2017:1: ( '(' )
            {
            // InternalBSQL2SQL.g:2017:1: ( '(' )
            // InternalBSQL2SQL.g:2018:2: '('
            {
             before(grammarAccess.getVoidOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBSQL2SQL.g:2027:1: rule__VoidOperation__Group__2 : rule__VoidOperation__Group__2__Impl rule__VoidOperation__Group__3 ;
    public final void rule__VoidOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2031:1: ( rule__VoidOperation__Group__2__Impl rule__VoidOperation__Group__3 )
            // InternalBSQL2SQL.g:2032:2: rule__VoidOperation__Group__2__Impl rule__VoidOperation__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSQL2SQL.g:2039:1: rule__VoidOperation__Group__2__Impl : ( ( rule__VoidOperation__Group_2__0 )? ) ;
    public final void rule__VoidOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2043:1: ( ( ( rule__VoidOperation__Group_2__0 )? ) )
            // InternalBSQL2SQL.g:2044:1: ( ( rule__VoidOperation__Group_2__0 )? )
            {
            // InternalBSQL2SQL.g:2044:1: ( ( rule__VoidOperation__Group_2__0 )? )
            // InternalBSQL2SQL.g:2045:2: ( rule__VoidOperation__Group_2__0 )?
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_2()); 
            // InternalBSQL2SQL.g:2046:2: ( rule__VoidOperation__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBSQL2SQL.g:2046:3: rule__VoidOperation__Group_2__0
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
    // InternalBSQL2SQL.g:2054:1: rule__VoidOperation__Group__3 : rule__VoidOperation__Group__3__Impl rule__VoidOperation__Group__4 ;
    public final void rule__VoidOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2058:1: ( rule__VoidOperation__Group__3__Impl rule__VoidOperation__Group__4 )
            // InternalBSQL2SQL.g:2059:2: rule__VoidOperation__Group__3__Impl rule__VoidOperation__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSQL2SQL.g:2066:1: rule__VoidOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__VoidOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2070:1: ( ( ')' ) )
            // InternalBSQL2SQL.g:2071:1: ( ')' )
            {
            // InternalBSQL2SQL.g:2071:1: ( ')' )
            // InternalBSQL2SQL.g:2072:2: ')'
            {
             before(grammarAccess.getVoidOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBSQL2SQL.g:2081:1: rule__VoidOperation__Group__4 : rule__VoidOperation__Group__4__Impl rule__VoidOperation__Group__5 ;
    public final void rule__VoidOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2085:1: ( rule__VoidOperation__Group__4__Impl rule__VoidOperation__Group__5 )
            // InternalBSQL2SQL.g:2086:2: rule__VoidOperation__Group__4__Impl rule__VoidOperation__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalBSQL2SQL.g:2093:1: rule__VoidOperation__Group__4__Impl : ( '=' ) ;
    public final void rule__VoidOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2097:1: ( ( '=' ) )
            // InternalBSQL2SQL.g:2098:1: ( '=' )
            {
            // InternalBSQL2SQL.g:2098:1: ( '=' )
            // InternalBSQL2SQL.g:2099:2: '='
            {
             before(grammarAccess.getVoidOperationAccess().getEqualsSignKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBSQL2SQL.g:2108:1: rule__VoidOperation__Group__5 : rule__VoidOperation__Group__5__Impl rule__VoidOperation__Group__6 ;
    public final void rule__VoidOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2112:1: ( rule__VoidOperation__Group__5__Impl rule__VoidOperation__Group__6 )
            // InternalBSQL2SQL.g:2113:2: rule__VoidOperation__Group__5__Impl rule__VoidOperation__Group__6
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
    // InternalBSQL2SQL.g:2120:1: rule__VoidOperation__Group__5__Impl : ( 'PRE' ) ;
    public final void rule__VoidOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2124:1: ( ( 'PRE' ) )
            // InternalBSQL2SQL.g:2125:1: ( 'PRE' )
            {
            // InternalBSQL2SQL.g:2125:1: ( 'PRE' )
            // InternalBSQL2SQL.g:2126:2: 'PRE'
            {
             before(grammarAccess.getVoidOperationAccess().getPREKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBSQL2SQL.g:2135:1: rule__VoidOperation__Group__6 : rule__VoidOperation__Group__6__Impl rule__VoidOperation__Group__7 ;
    public final void rule__VoidOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2139:1: ( rule__VoidOperation__Group__6__Impl rule__VoidOperation__Group__7 )
            // InternalBSQL2SQL.g:2140:2: rule__VoidOperation__Group__6__Impl rule__VoidOperation__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSQL2SQL.g:2147:1: rule__VoidOperation__Group__6__Impl : ( ( rule__VoidOperation__Group_6__0 ) ) ;
    public final void rule__VoidOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2151:1: ( ( ( rule__VoidOperation__Group_6__0 ) ) )
            // InternalBSQL2SQL.g:2152:1: ( ( rule__VoidOperation__Group_6__0 ) )
            {
            // InternalBSQL2SQL.g:2152:1: ( ( rule__VoidOperation__Group_6__0 ) )
            // InternalBSQL2SQL.g:2153:2: ( rule__VoidOperation__Group_6__0 )
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_6()); 
            // InternalBSQL2SQL.g:2154:2: ( rule__VoidOperation__Group_6__0 )
            // InternalBSQL2SQL.g:2154:3: rule__VoidOperation__Group_6__0
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
    // InternalBSQL2SQL.g:2162:1: rule__VoidOperation__Group__7 : rule__VoidOperation__Group__7__Impl rule__VoidOperation__Group__8 ;
    public final void rule__VoidOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2166:1: ( rule__VoidOperation__Group__7__Impl rule__VoidOperation__Group__8 )
            // InternalBSQL2SQL.g:2167:2: rule__VoidOperation__Group__7__Impl rule__VoidOperation__Group__8
            {
            pushFollow(FOLLOW_32);
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
    // InternalBSQL2SQL.g:2174:1: rule__VoidOperation__Group__7__Impl : ( 'THEN' ) ;
    public final void rule__VoidOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2178:1: ( ( 'THEN' ) )
            // InternalBSQL2SQL.g:2179:1: ( 'THEN' )
            {
            // InternalBSQL2SQL.g:2179:1: ( 'THEN' )
            // InternalBSQL2SQL.g:2180:2: 'THEN'
            {
             before(grammarAccess.getVoidOperationAccess().getTHENKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getTHENKeyword_7()); 

            }


            }

        }
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
    // InternalBSQL2SQL.g:2189:1: rule__VoidOperation__Group__8 : rule__VoidOperation__Group__8__Impl rule__VoidOperation__Group__9 ;
    public final void rule__VoidOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2193:1: ( rule__VoidOperation__Group__8__Impl rule__VoidOperation__Group__9 )
            // InternalBSQL2SQL.g:2194:2: rule__VoidOperation__Group__8__Impl rule__VoidOperation__Group__9
            {
            pushFollow(FOLLOW_32);
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
    // InternalBSQL2SQL.g:2201:1: rule__VoidOperation__Group__8__Impl : ( ( rule__VoidOperation__SubsAssignment_8 )* ) ;
    public final void rule__VoidOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2205:1: ( ( ( rule__VoidOperation__SubsAssignment_8 )* ) )
            // InternalBSQL2SQL.g:2206:1: ( ( rule__VoidOperation__SubsAssignment_8 )* )
            {
            // InternalBSQL2SQL.g:2206:1: ( ( rule__VoidOperation__SubsAssignment_8 )* )
            // InternalBSQL2SQL.g:2207:2: ( rule__VoidOperation__SubsAssignment_8 )*
            {
             before(grammarAccess.getVoidOperationAccess().getSubsAssignment_8()); 
            // InternalBSQL2SQL.g:2208:2: ( rule__VoidOperation__SubsAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBSQL2SQL.g:2208:3: rule__VoidOperation__SubsAssignment_8
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__VoidOperation__SubsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getVoidOperationAccess().getSubsAssignment_8()); 

            }


            }

        }
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
    // InternalBSQL2SQL.g:2216:1: rule__VoidOperation__Group__9 : rule__VoidOperation__Group__9__Impl ;
    public final void rule__VoidOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2220:1: ( rule__VoidOperation__Group__9__Impl )
            // InternalBSQL2SQL.g:2221:2: rule__VoidOperation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__9__Impl();

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
    // InternalBSQL2SQL.g:2227:1: rule__VoidOperation__Group__9__Impl : ( 'END' ) ;
    public final void rule__VoidOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2231:1: ( ( 'END' ) )
            // InternalBSQL2SQL.g:2232:1: ( 'END' )
            {
            // InternalBSQL2SQL.g:2232:1: ( 'END' )
            // InternalBSQL2SQL.g:2233:2: 'END'
            {
             before(grammarAccess.getVoidOperationAccess().getENDKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getENDKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__VoidOperation__Group_2__0"
    // InternalBSQL2SQL.g:2243:1: rule__VoidOperation__Group_2__0 : rule__VoidOperation__Group_2__0__Impl rule__VoidOperation__Group_2__1 ;
    public final void rule__VoidOperation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2247:1: ( rule__VoidOperation__Group_2__0__Impl rule__VoidOperation__Group_2__1 )
            // InternalBSQL2SQL.g:2248:2: rule__VoidOperation__Group_2__0__Impl rule__VoidOperation__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBSQL2SQL.g:2255:1: rule__VoidOperation__Group_2__0__Impl : ( ( rule__VoidOperation__PListAssignment_2_0 ) ) ;
    public final void rule__VoidOperation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2259:1: ( ( ( rule__VoidOperation__PListAssignment_2_0 ) ) )
            // InternalBSQL2SQL.g:2260:1: ( ( rule__VoidOperation__PListAssignment_2_0 ) )
            {
            // InternalBSQL2SQL.g:2260:1: ( ( rule__VoidOperation__PListAssignment_2_0 ) )
            // InternalBSQL2SQL.g:2261:2: ( rule__VoidOperation__PListAssignment_2_0 )
            {
             before(grammarAccess.getVoidOperationAccess().getPListAssignment_2_0()); 
            // InternalBSQL2SQL.g:2262:2: ( rule__VoidOperation__PListAssignment_2_0 )
            // InternalBSQL2SQL.g:2262:3: rule__VoidOperation__PListAssignment_2_0
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
    // InternalBSQL2SQL.g:2270:1: rule__VoidOperation__Group_2__1 : rule__VoidOperation__Group_2__1__Impl ;
    public final void rule__VoidOperation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2274:1: ( rule__VoidOperation__Group_2__1__Impl )
            // InternalBSQL2SQL.g:2275:2: rule__VoidOperation__Group_2__1__Impl
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
    // InternalBSQL2SQL.g:2281:1: rule__VoidOperation__Group_2__1__Impl : ( ( rule__VoidOperation__Group_2_1__0 )* ) ;
    public final void rule__VoidOperation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2285:1: ( ( ( rule__VoidOperation__Group_2_1__0 )* ) )
            // InternalBSQL2SQL.g:2286:1: ( ( rule__VoidOperation__Group_2_1__0 )* )
            {
            // InternalBSQL2SQL.g:2286:1: ( ( rule__VoidOperation__Group_2_1__0 )* )
            // InternalBSQL2SQL.g:2287:2: ( rule__VoidOperation__Group_2_1__0 )*
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_2_1()); 
            // InternalBSQL2SQL.g:2288:2: ( rule__VoidOperation__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBSQL2SQL.g:2288:3: rule__VoidOperation__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__VoidOperation__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBSQL2SQL.g:2297:1: rule__VoidOperation__Group_2_1__0 : rule__VoidOperation__Group_2_1__0__Impl rule__VoidOperation__Group_2_1__1 ;
    public final void rule__VoidOperation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2301:1: ( rule__VoidOperation__Group_2_1__0__Impl rule__VoidOperation__Group_2_1__1 )
            // InternalBSQL2SQL.g:2302:2: rule__VoidOperation__Group_2_1__0__Impl rule__VoidOperation__Group_2_1__1
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
    // InternalBSQL2SQL.g:2309:1: rule__VoidOperation__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__VoidOperation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2313:1: ( ( ',' ) )
            // InternalBSQL2SQL.g:2314:1: ( ',' )
            {
            // InternalBSQL2SQL.g:2314:1: ( ',' )
            // InternalBSQL2SQL.g:2315:2: ','
            {
             before(grammarAccess.getVoidOperationAccess().getCommaKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBSQL2SQL.g:2324:1: rule__VoidOperation__Group_2_1__1 : rule__VoidOperation__Group_2_1__1__Impl ;
    public final void rule__VoidOperation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2328:1: ( rule__VoidOperation__Group_2_1__1__Impl )
            // InternalBSQL2SQL.g:2329:2: rule__VoidOperation__Group_2_1__1__Impl
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
    // InternalBSQL2SQL.g:2335:1: rule__VoidOperation__Group_2_1__1__Impl : ( ( rule__VoidOperation__PListAssignment_2_1_1 ) ) ;
    public final void rule__VoidOperation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2339:1: ( ( ( rule__VoidOperation__PListAssignment_2_1_1 ) ) )
            // InternalBSQL2SQL.g:2340:1: ( ( rule__VoidOperation__PListAssignment_2_1_1 ) )
            {
            // InternalBSQL2SQL.g:2340:1: ( ( rule__VoidOperation__PListAssignment_2_1_1 ) )
            // InternalBSQL2SQL.g:2341:2: ( rule__VoidOperation__PListAssignment_2_1_1 )
            {
             before(grammarAccess.getVoidOperationAccess().getPListAssignment_2_1_1()); 
            // InternalBSQL2SQL.g:2342:2: ( rule__VoidOperation__PListAssignment_2_1_1 )
            // InternalBSQL2SQL.g:2342:3: rule__VoidOperation__PListAssignment_2_1_1
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
    // InternalBSQL2SQL.g:2351:1: rule__VoidOperation__Group_6__0 : rule__VoidOperation__Group_6__0__Impl rule__VoidOperation__Group_6__1 ;
    public final void rule__VoidOperation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2355:1: ( rule__VoidOperation__Group_6__0__Impl rule__VoidOperation__Group_6__1 )
            // InternalBSQL2SQL.g:2356:2: rule__VoidOperation__Group_6__0__Impl rule__VoidOperation__Group_6__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSQL2SQL.g:2363:1: rule__VoidOperation__Group_6__0__Impl : ( ( rule__VoidOperation__ParamsAssignment_6_0 ) ) ;
    public final void rule__VoidOperation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2367:1: ( ( ( rule__VoidOperation__ParamsAssignment_6_0 ) ) )
            // InternalBSQL2SQL.g:2368:1: ( ( rule__VoidOperation__ParamsAssignment_6_0 ) )
            {
            // InternalBSQL2SQL.g:2368:1: ( ( rule__VoidOperation__ParamsAssignment_6_0 ) )
            // InternalBSQL2SQL.g:2369:2: ( rule__VoidOperation__ParamsAssignment_6_0 )
            {
             before(grammarAccess.getVoidOperationAccess().getParamsAssignment_6_0()); 
            // InternalBSQL2SQL.g:2370:2: ( rule__VoidOperation__ParamsAssignment_6_0 )
            // InternalBSQL2SQL.g:2370:3: rule__VoidOperation__ParamsAssignment_6_0
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
    // InternalBSQL2SQL.g:2378:1: rule__VoidOperation__Group_6__1 : rule__VoidOperation__Group_6__1__Impl ;
    public final void rule__VoidOperation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2382:1: ( rule__VoidOperation__Group_6__1__Impl )
            // InternalBSQL2SQL.g:2383:2: rule__VoidOperation__Group_6__1__Impl
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
    // InternalBSQL2SQL.g:2389:1: rule__VoidOperation__Group_6__1__Impl : ( ( rule__VoidOperation__Group_6_1__0 )* ) ;
    public final void rule__VoidOperation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2393:1: ( ( ( rule__VoidOperation__Group_6_1__0 )* ) )
            // InternalBSQL2SQL.g:2394:1: ( ( rule__VoidOperation__Group_6_1__0 )* )
            {
            // InternalBSQL2SQL.g:2394:1: ( ( rule__VoidOperation__Group_6_1__0 )* )
            // InternalBSQL2SQL.g:2395:2: ( rule__VoidOperation__Group_6_1__0 )*
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_6_1()); 
            // InternalBSQL2SQL.g:2396:2: ( rule__VoidOperation__Group_6_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBSQL2SQL.g:2396:3: rule__VoidOperation__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__VoidOperation__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalBSQL2SQL.g:2405:1: rule__VoidOperation__Group_6_1__0 : rule__VoidOperation__Group_6_1__0__Impl rule__VoidOperation__Group_6_1__1 ;
    public final void rule__VoidOperation__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2409:1: ( rule__VoidOperation__Group_6_1__0__Impl rule__VoidOperation__Group_6_1__1 )
            // InternalBSQL2SQL.g:2410:2: rule__VoidOperation__Group_6_1__0__Impl rule__VoidOperation__Group_6_1__1
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
    // InternalBSQL2SQL.g:2417:1: rule__VoidOperation__Group_6_1__0__Impl : ( '&' ) ;
    public final void rule__VoidOperation__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2421:1: ( ( '&' ) )
            // InternalBSQL2SQL.g:2422:1: ( '&' )
            {
            // InternalBSQL2SQL.g:2422:1: ( '&' )
            // InternalBSQL2SQL.g:2423:2: '&'
            {
             before(grammarAccess.getVoidOperationAccess().getAmpersandKeyword_6_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBSQL2SQL.g:2432:1: rule__VoidOperation__Group_6_1__1 : rule__VoidOperation__Group_6_1__1__Impl ;
    public final void rule__VoidOperation__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2436:1: ( rule__VoidOperation__Group_6_1__1__Impl )
            // InternalBSQL2SQL.g:2437:2: rule__VoidOperation__Group_6_1__1__Impl
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
    // InternalBSQL2SQL.g:2443:1: rule__VoidOperation__Group_6_1__1__Impl : ( ( rule__VoidOperation__ParamsAssignment_6_1_1 ) ) ;
    public final void rule__VoidOperation__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2447:1: ( ( ( rule__VoidOperation__ParamsAssignment_6_1_1 ) ) )
            // InternalBSQL2SQL.g:2448:1: ( ( rule__VoidOperation__ParamsAssignment_6_1_1 ) )
            {
            // InternalBSQL2SQL.g:2448:1: ( ( rule__VoidOperation__ParamsAssignment_6_1_1 ) )
            // InternalBSQL2SQL.g:2449:2: ( rule__VoidOperation__ParamsAssignment_6_1_1 )
            {
             before(grammarAccess.getVoidOperationAccess().getParamsAssignment_6_1_1()); 
            // InternalBSQL2SQL.g:2450:2: ( rule__VoidOperation__ParamsAssignment_6_1_1 )
            // InternalBSQL2SQL.g:2450:3: rule__VoidOperation__ParamsAssignment_6_1_1
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


    // $ANTLR start "rule__BPredicate__Group__0"
    // InternalBSQL2SQL.g:2459:1: rule__BPredicate__Group__0 : rule__BPredicate__Group__0__Impl rule__BPredicate__Group__1 ;
    public final void rule__BPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2463:1: ( rule__BPredicate__Group__0__Impl rule__BPredicate__Group__1 )
            // InternalBSQL2SQL.g:2464:2: rule__BPredicate__Group__0__Impl rule__BPredicate__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBSQL2SQL.g:2471:1: rule__BPredicate__Group__0__Impl : ( () ) ;
    public final void rule__BPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2475:1: ( ( () ) )
            // InternalBSQL2SQL.g:2476:1: ( () )
            {
            // InternalBSQL2SQL.g:2476:1: ( () )
            // InternalBSQL2SQL.g:2477:2: ()
            {
             before(grammarAccess.getBPredicateAccess().getBPredicateAction_0()); 
            // InternalBSQL2SQL.g:2478:2: ()
            // InternalBSQL2SQL.g:2478:3: 
            {
            }

             after(grammarAccess.getBPredicateAccess().getBPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BPredicate__Group__0__Impl"


    // $ANTLR start "rule__BPredicate__Group__1"
    // InternalBSQL2SQL.g:2486:1: rule__BPredicate__Group__1 : rule__BPredicate__Group__1__Impl ;
    public final void rule__BPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2490:1: ( rule__BPredicate__Group__1__Impl )
            // InternalBSQL2SQL.g:2491:2: rule__BPredicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__Group__1__Impl();

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
    // InternalBSQL2SQL.g:2497:1: rule__BPredicate__Group__1__Impl : ( ( rule__BPredicate__Group_1__0 ) ) ;
    public final void rule__BPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2501:1: ( ( ( rule__BPredicate__Group_1__0 ) ) )
            // InternalBSQL2SQL.g:2502:1: ( ( rule__BPredicate__Group_1__0 ) )
            {
            // InternalBSQL2SQL.g:2502:1: ( ( rule__BPredicate__Group_1__0 ) )
            // InternalBSQL2SQL.g:2503:2: ( rule__BPredicate__Group_1__0 )
            {
             before(grammarAccess.getBPredicateAccess().getGroup_1()); 
            // InternalBSQL2SQL.g:2504:2: ( rule__BPredicate__Group_1__0 )
            // InternalBSQL2SQL.g:2504:3: rule__BPredicate__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBPredicateAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BPredicate__Group_1__0"
    // InternalBSQL2SQL.g:2513:1: rule__BPredicate__Group_1__0 : rule__BPredicate__Group_1__0__Impl rule__BPredicate__Group_1__1 ;
    public final void rule__BPredicate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2517:1: ( rule__BPredicate__Group_1__0__Impl rule__BPredicate__Group_1__1 )
            // InternalBSQL2SQL.g:2518:2: rule__BPredicate__Group_1__0__Impl rule__BPredicate__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__BPredicate__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BPredicate__Group_1__1();

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
    // $ANTLR end "rule__BPredicate__Group_1__0"


    // $ANTLR start "rule__BPredicate__Group_1__0__Impl"
    // InternalBSQL2SQL.g:2525:1: rule__BPredicate__Group_1__0__Impl : ( ( rule__BPredicate__PLeftAssignment_1_0 ) ) ;
    public final void rule__BPredicate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2529:1: ( ( ( rule__BPredicate__PLeftAssignment_1_0 ) ) )
            // InternalBSQL2SQL.g:2530:1: ( ( rule__BPredicate__PLeftAssignment_1_0 ) )
            {
            // InternalBSQL2SQL.g:2530:1: ( ( rule__BPredicate__PLeftAssignment_1_0 ) )
            // InternalBSQL2SQL.g:2531:2: ( rule__BPredicate__PLeftAssignment_1_0 )
            {
             before(grammarAccess.getBPredicateAccess().getPLeftAssignment_1_0()); 
            // InternalBSQL2SQL.g:2532:2: ( rule__BPredicate__PLeftAssignment_1_0 )
            // InternalBSQL2SQL.g:2532:3: rule__BPredicate__PLeftAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__PLeftAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBPredicateAccess().getPLeftAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BPredicate__Group_1__0__Impl"


    // $ANTLR start "rule__BPredicate__Group_1__1"
    // InternalBSQL2SQL.g:2540:1: rule__BPredicate__Group_1__1 : rule__BPredicate__Group_1__1__Impl rule__BPredicate__Group_1__2 ;
    public final void rule__BPredicate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2544:1: ( rule__BPredicate__Group_1__1__Impl rule__BPredicate__Group_1__2 )
            // InternalBSQL2SQL.g:2545:2: rule__BPredicate__Group_1__1__Impl rule__BPredicate__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__BPredicate__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BPredicate__Group_1__2();

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
    // $ANTLR end "rule__BPredicate__Group_1__1"


    // $ANTLR start "rule__BPredicate__Group_1__1__Impl"
    // InternalBSQL2SQL.g:2552:1: rule__BPredicate__Group_1__1__Impl : ( '=' ) ;
    public final void rule__BPredicate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2556:1: ( ( '=' ) )
            // InternalBSQL2SQL.g:2557:1: ( '=' )
            {
            // InternalBSQL2SQL.g:2557:1: ( '=' )
            // InternalBSQL2SQL.g:2558:2: '='
            {
             before(grammarAccess.getBPredicateAccess().getEqualsSignKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBPredicateAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BPredicate__Group_1__1__Impl"


    // $ANTLR start "rule__BPredicate__Group_1__2"
    // InternalBSQL2SQL.g:2567:1: rule__BPredicate__Group_1__2 : rule__BPredicate__Group_1__2__Impl ;
    public final void rule__BPredicate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2571:1: ( rule__BPredicate__Group_1__2__Impl )
            // InternalBSQL2SQL.g:2572:2: rule__BPredicate__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__Group_1__2__Impl();

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
    // $ANTLR end "rule__BPredicate__Group_1__2"


    // $ANTLR start "rule__BPredicate__Group_1__2__Impl"
    // InternalBSQL2SQL.g:2578:1: rule__BPredicate__Group_1__2__Impl : ( ( rule__BPredicate__PRightAssignment_1_2 ) ) ;
    public final void rule__BPredicate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2582:1: ( ( ( rule__BPredicate__PRightAssignment_1_2 ) ) )
            // InternalBSQL2SQL.g:2583:1: ( ( rule__BPredicate__PRightAssignment_1_2 ) )
            {
            // InternalBSQL2SQL.g:2583:1: ( ( rule__BPredicate__PRightAssignment_1_2 ) )
            // InternalBSQL2SQL.g:2584:2: ( rule__BPredicate__PRightAssignment_1_2 )
            {
             before(grammarAccess.getBPredicateAccess().getPRightAssignment_1_2()); 
            // InternalBSQL2SQL.g:2585:2: ( rule__BPredicate__PRightAssignment_1_2 )
            // InternalBSQL2SQL.g:2585:3: rule__BPredicate__PRightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BPredicate__PRightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBPredicateAccess().getPRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BPredicate__Group_1__2__Impl"


    // $ANTLR start "rule__SQLCall__Group__0"
    // InternalBSQL2SQL.g:2594:1: rule__SQLCall__Group__0 : rule__SQLCall__Group__0__Impl rule__SQLCall__Group__1 ;
    public final void rule__SQLCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2598:1: ( rule__SQLCall__Group__0__Impl rule__SQLCall__Group__1 )
            // InternalBSQL2SQL.g:2599:2: rule__SQLCall__Group__0__Impl rule__SQLCall__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__SQLCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQLCall__Group__1();

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
    // $ANTLR end "rule__SQLCall__Group__0"


    // $ANTLR start "rule__SQLCall__Group__0__Impl"
    // InternalBSQL2SQL.g:2606:1: rule__SQLCall__Group__0__Impl : ( ( rule__SQLCall__SLeftAssignment_0 ) ) ;
    public final void rule__SQLCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2610:1: ( ( ( rule__SQLCall__SLeftAssignment_0 ) ) )
            // InternalBSQL2SQL.g:2611:1: ( ( rule__SQLCall__SLeftAssignment_0 ) )
            {
            // InternalBSQL2SQL.g:2611:1: ( ( rule__SQLCall__SLeftAssignment_0 ) )
            // InternalBSQL2SQL.g:2612:2: ( rule__SQLCall__SLeftAssignment_0 )
            {
             before(grammarAccess.getSQLCallAccess().getSLeftAssignment_0()); 
            // InternalBSQL2SQL.g:2613:2: ( rule__SQLCall__SLeftAssignment_0 )
            // InternalBSQL2SQL.g:2613:3: rule__SQLCall__SLeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SQLCall__SLeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSQLCallAccess().getSLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQLCall__Group__0__Impl"


    // $ANTLR start "rule__SQLCall__Group__1"
    // InternalBSQL2SQL.g:2621:1: rule__SQLCall__Group__1 : rule__SQLCall__Group__1__Impl rule__SQLCall__Group__2 ;
    public final void rule__SQLCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2625:1: ( rule__SQLCall__Group__1__Impl rule__SQLCall__Group__2 )
            // InternalBSQL2SQL.g:2626:2: rule__SQLCall__Group__1__Impl rule__SQLCall__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SQLCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQLCall__Group__2();

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
    // $ANTLR end "rule__SQLCall__Group__1"


    // $ANTLR start "rule__SQLCall__Group__1__Impl"
    // InternalBSQL2SQL.g:2633:1: rule__SQLCall__Group__1__Impl : ( '\\'' ) ;
    public final void rule__SQLCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2637:1: ( ( '\\'' ) )
            // InternalBSQL2SQL.g:2638:1: ( '\\'' )
            {
            // InternalBSQL2SQL.g:2638:1: ( '\\'' )
            // InternalBSQL2SQL.g:2639:2: '\\''
            {
             before(grammarAccess.getSQLCallAccess().getApostropheKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSQLCallAccess().getApostropheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQLCall__Group__1__Impl"


    // $ANTLR start "rule__SQLCall__Group__2"
    // InternalBSQL2SQL.g:2648:1: rule__SQLCall__Group__2 : rule__SQLCall__Group__2__Impl ;
    public final void rule__SQLCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2652:1: ( rule__SQLCall__Group__2__Impl )
            // InternalBSQL2SQL.g:2653:2: rule__SQLCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQLCall__Group__2__Impl();

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
    // $ANTLR end "rule__SQLCall__Group__2"


    // $ANTLR start "rule__SQLCall__Group__2__Impl"
    // InternalBSQL2SQL.g:2659:1: rule__SQLCall__Group__2__Impl : ( ( rule__SQLCall__SRightAssignment_2 ) ) ;
    public final void rule__SQLCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2663:1: ( ( ( rule__SQLCall__SRightAssignment_2 ) ) )
            // InternalBSQL2SQL.g:2664:1: ( ( rule__SQLCall__SRightAssignment_2 ) )
            {
            // InternalBSQL2SQL.g:2664:1: ( ( rule__SQLCall__SRightAssignment_2 ) )
            // InternalBSQL2SQL.g:2665:2: ( rule__SQLCall__SRightAssignment_2 )
            {
             before(grammarAccess.getSQLCallAccess().getSRightAssignment_2()); 
            // InternalBSQL2SQL.g:2666:2: ( rule__SQLCall__SRightAssignment_2 )
            // InternalBSQL2SQL.g:2666:3: rule__SQLCall__SRightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SQLCall__SRightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSQLCallAccess().getSRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQLCall__Group__2__Impl"


    // $ANTLR start "rule__TableInstance__Group__0"
    // InternalBSQL2SQL.g:2675:1: rule__TableInstance__Group__0 : rule__TableInstance__Group__0__Impl rule__TableInstance__Group__1 ;
    public final void rule__TableInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2679:1: ( rule__TableInstance__Group__0__Impl rule__TableInstance__Group__1 )
            // InternalBSQL2SQL.g:2680:2: rule__TableInstance__Group__0__Impl rule__TableInstance__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__TableInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableInstance__Group__1();

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
    // $ANTLR end "rule__TableInstance__Group__0"


    // $ANTLR start "rule__TableInstance__Group__0__Impl"
    // InternalBSQL2SQL.g:2687:1: rule__TableInstance__Group__0__Impl : ( ( rule__TableInstance__Ti_nameAssignment_0 ) ) ;
    public final void rule__TableInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2691:1: ( ( ( rule__TableInstance__Ti_nameAssignment_0 ) ) )
            // InternalBSQL2SQL.g:2692:1: ( ( rule__TableInstance__Ti_nameAssignment_0 ) )
            {
            // InternalBSQL2SQL.g:2692:1: ( ( rule__TableInstance__Ti_nameAssignment_0 ) )
            // InternalBSQL2SQL.g:2693:2: ( rule__TableInstance__Ti_nameAssignment_0 )
            {
             before(grammarAccess.getTableInstanceAccess().getTi_nameAssignment_0()); 
            // InternalBSQL2SQL.g:2694:2: ( rule__TableInstance__Ti_nameAssignment_0 )
            // InternalBSQL2SQL.g:2694:3: rule__TableInstance__Ti_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TableInstance__Ti_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableInstanceAccess().getTi_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInstance__Group__0__Impl"


    // $ANTLR start "rule__TableInstance__Group__1"
    // InternalBSQL2SQL.g:2702:1: rule__TableInstance__Group__1 : rule__TableInstance__Group__1__Impl rule__TableInstance__Group__2 ;
    public final void rule__TableInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2706:1: ( rule__TableInstance__Group__1__Impl rule__TableInstance__Group__2 )
            // InternalBSQL2SQL.g:2707:2: rule__TableInstance__Group__1__Impl rule__TableInstance__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__TableInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableInstance__Group__2();

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
    // $ANTLR end "rule__TableInstance__Group__1"


    // $ANTLR start "rule__TableInstance__Group__1__Impl"
    // InternalBSQL2SQL.g:2714:1: rule__TableInstance__Group__1__Impl : ( '.(' ) ;
    public final void rule__TableInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2718:1: ( ( '.(' ) )
            // InternalBSQL2SQL.g:2719:1: ( '.(' )
            {
            // InternalBSQL2SQL.g:2719:1: ( '.(' )
            // InternalBSQL2SQL.g:2720:2: '.('
            {
             before(grammarAccess.getTableInstanceAccess().getFullStopLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTableInstanceAccess().getFullStopLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInstance__Group__1__Impl"


    // $ANTLR start "rule__TableInstance__Group__2"
    // InternalBSQL2SQL.g:2729:1: rule__TableInstance__Group__2 : rule__TableInstance__Group__2__Impl ;
    public final void rule__TableInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2733:1: ( rule__TableInstance__Group__2__Impl )
            // InternalBSQL2SQL.g:2734:2: rule__TableInstance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableInstance__Group__2__Impl();

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
    // $ANTLR end "rule__TableInstance__Group__2"


    // $ANTLR start "rule__TableInstance__Group__2__Impl"
    // InternalBSQL2SQL.g:2740:1: rule__TableInstance__Group__2__Impl : ( ( rule__TableInstance__Ti_typeAssignment_2 ) ) ;
    public final void rule__TableInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2744:1: ( ( ( rule__TableInstance__Ti_typeAssignment_2 ) ) )
            // InternalBSQL2SQL.g:2745:1: ( ( rule__TableInstance__Ti_typeAssignment_2 ) )
            {
            // InternalBSQL2SQL.g:2745:1: ( ( rule__TableInstance__Ti_typeAssignment_2 ) )
            // InternalBSQL2SQL.g:2746:2: ( rule__TableInstance__Ti_typeAssignment_2 )
            {
             before(grammarAccess.getTableInstanceAccess().getTi_typeAssignment_2()); 
            // InternalBSQL2SQL.g:2747:2: ( rule__TableInstance__Ti_typeAssignment_2 )
            // InternalBSQL2SQL.g:2747:3: rule__TableInstance__Ti_typeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableInstance__Ti_typeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableInstanceAccess().getTi_typeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInstance__Group__2__Impl"


    // $ANTLR start "rule__TIAssignment__Group__0"
    // InternalBSQL2SQL.g:2756:1: rule__TIAssignment__Group__0 : rule__TIAssignment__Group__0__Impl rule__TIAssignment__Group__1 ;
    public final void rule__TIAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2760:1: ( rule__TIAssignment__Group__0__Impl rule__TIAssignment__Group__1 )
            // InternalBSQL2SQL.g:2761:2: rule__TIAssignment__Group__0__Impl rule__TIAssignment__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TIAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TIAssignment__Group__1();

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
    // $ANTLR end "rule__TIAssignment__Group__0"


    // $ANTLR start "rule__TIAssignment__Group__0__Impl"
    // InternalBSQL2SQL.g:2768:1: rule__TIAssignment__Group__0__Impl : ( ( rule__TIAssignment__Instance_nameAssignment_0 ) ) ;
    public final void rule__TIAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2772:1: ( ( ( rule__TIAssignment__Instance_nameAssignment_0 ) ) )
            // InternalBSQL2SQL.g:2773:1: ( ( rule__TIAssignment__Instance_nameAssignment_0 ) )
            {
            // InternalBSQL2SQL.g:2773:1: ( ( rule__TIAssignment__Instance_nameAssignment_0 ) )
            // InternalBSQL2SQL.g:2774:2: ( rule__TIAssignment__Instance_nameAssignment_0 )
            {
             before(grammarAccess.getTIAssignmentAccess().getInstance_nameAssignment_0()); 
            // InternalBSQL2SQL.g:2775:2: ( rule__TIAssignment__Instance_nameAssignment_0 )
            // InternalBSQL2SQL.g:2775:3: rule__TIAssignment__Instance_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TIAssignment__Instance_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTIAssignmentAccess().getInstance_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIAssignment__Group__0__Impl"


    // $ANTLR start "rule__TIAssignment__Group__1"
    // InternalBSQL2SQL.g:2783:1: rule__TIAssignment__Group__1 : rule__TIAssignment__Group__1__Impl rule__TIAssignment__Group__2 ;
    public final void rule__TIAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2787:1: ( rule__TIAssignment__Group__1__Impl rule__TIAssignment__Group__2 )
            // InternalBSQL2SQL.g:2788:2: rule__TIAssignment__Group__1__Impl rule__TIAssignment__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__TIAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TIAssignment__Group__2();

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
    // $ANTLR end "rule__TIAssignment__Group__1"


    // $ANTLR start "rule__TIAssignment__Group__1__Impl"
    // InternalBSQL2SQL.g:2795:1: rule__TIAssignment__Group__1__Impl : ( ':' ) ;
    public final void rule__TIAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2799:1: ( ( ':' ) )
            // InternalBSQL2SQL.g:2800:1: ( ':' )
            {
            // InternalBSQL2SQL.g:2800:1: ( ':' )
            // InternalBSQL2SQL.g:2801:2: ':'
            {
             before(grammarAccess.getTIAssignmentAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTIAssignmentAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIAssignment__Group__1__Impl"


    // $ANTLR start "rule__TIAssignment__Group__2"
    // InternalBSQL2SQL.g:2810:1: rule__TIAssignment__Group__2 : rule__TIAssignment__Group__2__Impl ;
    public final void rule__TIAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2814:1: ( rule__TIAssignment__Group__2__Impl )
            // InternalBSQL2SQL.g:2815:2: rule__TIAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TIAssignment__Group__2__Impl();

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
    // $ANTLR end "rule__TIAssignment__Group__2"


    // $ANTLR start "rule__TIAssignment__Group__2__Impl"
    // InternalBSQL2SQL.g:2821:1: rule__TIAssignment__Group__2__Impl : ( ( rule__TIAssignment__Instance_typeAssignment_2 ) ) ;
    public final void rule__TIAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2825:1: ( ( ( rule__TIAssignment__Instance_typeAssignment_2 ) ) )
            // InternalBSQL2SQL.g:2826:1: ( ( rule__TIAssignment__Instance_typeAssignment_2 ) )
            {
            // InternalBSQL2SQL.g:2826:1: ( ( rule__TIAssignment__Instance_typeAssignment_2 ) )
            // InternalBSQL2SQL.g:2827:2: ( rule__TIAssignment__Instance_typeAssignment_2 )
            {
             before(grammarAccess.getTIAssignmentAccess().getInstance_typeAssignment_2()); 
            // InternalBSQL2SQL.g:2828:2: ( rule__TIAssignment__Instance_typeAssignment_2 )
            // InternalBSQL2SQL.g:2828:3: rule__TIAssignment__Instance_typeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TIAssignment__Instance_typeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTIAssignmentAccess().getInstance_typeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIAssignment__Group__2__Impl"


    // $ANTLR start "rule__BParameter__Group__0"
    // InternalBSQL2SQL.g:2837:1: rule__BParameter__Group__0 : rule__BParameter__Group__0__Impl rule__BParameter__Group__1 ;
    public final void rule__BParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2841:1: ( rule__BParameter__Group__0__Impl rule__BParameter__Group__1 )
            // InternalBSQL2SQL.g:2842:2: rule__BParameter__Group__0__Impl rule__BParameter__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBSQL2SQL.g:2849:1: rule__BParameter__Group__0__Impl : ( ( rule__BParameter__P_nameAssignment_0 ) ) ;
    public final void rule__BParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2853:1: ( ( ( rule__BParameter__P_nameAssignment_0 ) ) )
            // InternalBSQL2SQL.g:2854:1: ( ( rule__BParameter__P_nameAssignment_0 ) )
            {
            // InternalBSQL2SQL.g:2854:1: ( ( rule__BParameter__P_nameAssignment_0 ) )
            // InternalBSQL2SQL.g:2855:2: ( rule__BParameter__P_nameAssignment_0 )
            {
             before(grammarAccess.getBParameterAccess().getP_nameAssignment_0()); 
            // InternalBSQL2SQL.g:2856:2: ( rule__BParameter__P_nameAssignment_0 )
            // InternalBSQL2SQL.g:2856:3: rule__BParameter__P_nameAssignment_0
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
    // InternalBSQL2SQL.g:2864:1: rule__BParameter__Group__1 : rule__BParameter__Group__1__Impl rule__BParameter__Group__2 ;
    public final void rule__BParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2868:1: ( rule__BParameter__Group__1__Impl rule__BParameter__Group__2 )
            // InternalBSQL2SQL.g:2869:2: rule__BParameter__Group__1__Impl rule__BParameter__Group__2
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
    // InternalBSQL2SQL.g:2876:1: rule__BParameter__Group__1__Impl : ( ':' ) ;
    public final void rule__BParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2880:1: ( ( ':' ) )
            // InternalBSQL2SQL.g:2881:1: ( ':' )
            {
            // InternalBSQL2SQL.g:2881:1: ( ':' )
            // InternalBSQL2SQL.g:2882:2: ':'
            {
             before(grammarAccess.getBParameterAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBSQL2SQL.g:2891:1: rule__BParameter__Group__2 : rule__BParameter__Group__2__Impl ;
    public final void rule__BParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2895:1: ( rule__BParameter__Group__2__Impl )
            // InternalBSQL2SQL.g:2896:2: rule__BParameter__Group__2__Impl
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
    // InternalBSQL2SQL.g:2902:1: rule__BParameter__Group__2__Impl : ( ( rule__BParameter__TypeAssignment_2 ) ) ;
    public final void rule__BParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2906:1: ( ( ( rule__BParameter__TypeAssignment_2 ) ) )
            // InternalBSQL2SQL.g:2907:1: ( ( rule__BParameter__TypeAssignment_2 ) )
            {
            // InternalBSQL2SQL.g:2907:1: ( ( rule__BParameter__TypeAssignment_2 ) )
            // InternalBSQL2SQL.g:2908:2: ( rule__BParameter__TypeAssignment_2 )
            {
             before(grammarAccess.getBParameterAccess().getTypeAssignment_2()); 
            // InternalBSQL2SQL.g:2909:2: ( rule__BParameter__TypeAssignment_2 )
            // InternalBSQL2SQL.g:2909:3: rule__BParameter__TypeAssignment_2
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


    // $ANTLR start "rule__BSubstitution__Group__0"
    // InternalBSQL2SQL.g:2918:1: rule__BSubstitution__Group__0 : rule__BSubstitution__Group__0__Impl rule__BSubstitution__Group__1 ;
    public final void rule__BSubstitution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2922:1: ( rule__BSubstitution__Group__0__Impl rule__BSubstitution__Group__1 )
            // InternalBSQL2SQL.g:2923:2: rule__BSubstitution__Group__0__Impl rule__BSubstitution__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBSQL2SQL.g:2930:1: rule__BSubstitution__Group__0__Impl : ( ( rule__BSubstitution__LeftAssignment_0 ) ) ;
    public final void rule__BSubstitution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2934:1: ( ( ( rule__BSubstitution__LeftAssignment_0 ) ) )
            // InternalBSQL2SQL.g:2935:1: ( ( rule__BSubstitution__LeftAssignment_0 ) )
            {
            // InternalBSQL2SQL.g:2935:1: ( ( rule__BSubstitution__LeftAssignment_0 ) )
            // InternalBSQL2SQL.g:2936:2: ( rule__BSubstitution__LeftAssignment_0 )
            {
             before(grammarAccess.getBSubstitutionAccess().getLeftAssignment_0()); 
            // InternalBSQL2SQL.g:2937:2: ( rule__BSubstitution__LeftAssignment_0 )
            // InternalBSQL2SQL.g:2937:3: rule__BSubstitution__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BSubstitution__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBSubstitutionAccess().getLeftAssignment_0()); 

            }


            }

        }
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
    // InternalBSQL2SQL.g:2945:1: rule__BSubstitution__Group__1 : rule__BSubstitution__Group__1__Impl rule__BSubstitution__Group__2 ;
    public final void rule__BSubstitution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2949:1: ( rule__BSubstitution__Group__1__Impl rule__BSubstitution__Group__2 )
            // InternalBSQL2SQL.g:2950:2: rule__BSubstitution__Group__1__Impl rule__BSubstitution__Group__2
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
    // InternalBSQL2SQL.g:2957:1: rule__BSubstitution__Group__1__Impl : ( ':=' ) ;
    public final void rule__BSubstitution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2961:1: ( ( ':=' ) )
            // InternalBSQL2SQL.g:2962:1: ( ':=' )
            {
            // InternalBSQL2SQL.g:2962:1: ( ':=' )
            // InternalBSQL2SQL.g:2963:2: ':='
            {
             before(grammarAccess.getBSubstitutionAccess().getColonEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBSQL2SQL.g:2972:1: rule__BSubstitution__Group__2 : rule__BSubstitution__Group__2__Impl ;
    public final void rule__BSubstitution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2976:1: ( rule__BSubstitution__Group__2__Impl )
            // InternalBSQL2SQL.g:2977:2: rule__BSubstitution__Group__2__Impl
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
    // InternalBSQL2SQL.g:2983:1: rule__BSubstitution__Group__2__Impl : ( ( rule__BSubstitution__RightAssignment_2 ) ) ;
    public final void rule__BSubstitution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:2987:1: ( ( ( rule__BSubstitution__RightAssignment_2 ) ) )
            // InternalBSQL2SQL.g:2988:1: ( ( rule__BSubstitution__RightAssignment_2 ) )
            {
            // InternalBSQL2SQL.g:2988:1: ( ( rule__BSubstitution__RightAssignment_2 ) )
            // InternalBSQL2SQL.g:2989:2: ( rule__BSubstitution__RightAssignment_2 )
            {
             before(grammarAccess.getBSubstitutionAccess().getRightAssignment_2()); 
            // InternalBSQL2SQL.g:2990:2: ( rule__BSubstitution__RightAssignment_2 )
            // InternalBSQL2SQL.g:2990:3: rule__BSubstitution__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BSubstitution__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBSubstitutionAccess().getRightAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__BSQLMachine__M_nameAssignment_1"
    // InternalBSQL2SQL.g:2999:1: rule__BSQLMachine__M_nameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BSQLMachine__M_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3003:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3004:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3004:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3005:3: RULE_ID
            {
             before(grammarAccess.getBSQLMachineAccess().getM_nameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getM_nameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__M_nameAssignment_1"


    // $ANTLR start "rule__BSQLMachine__VarsAssignment_3"
    // InternalBSQL2SQL.g:3014:1: rule__BSQLMachine__VarsAssignment_3 : ( RULE_ID ) ;
    public final void rule__BSQLMachine__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3018:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3019:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3019:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3020:3: RULE_ID
            {
             before(grammarAccess.getBSQLMachineAccess().getVarsIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getVarsIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__VarsAssignment_3"


    // $ANTLR start "rule__BSQLMachine__InvAssignment_5"
    // InternalBSQL2SQL.g:3029:1: rule__BSQLMachine__InvAssignment_5 : ( ruleBTable ) ;
    public final void rule__BSQLMachine__InvAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3033:1: ( ( ruleBTable ) )
            // InternalBSQL2SQL.g:3034:2: ( ruleBTable )
            {
            // InternalBSQL2SQL.g:3034:2: ( ruleBTable )
            // InternalBSQL2SQL.g:3035:3: ruleBTable
            {
             before(grammarAccess.getBSQLMachineAccess().getInvBTableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBTable();

            state._fsp--;

             after(grammarAccess.getBSQLMachineAccess().getInvBTableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__InvAssignment_5"


    // $ANTLR start "rule__BSQLMachine__InitAssignment_7"
    // InternalBSQL2SQL.g:3044:1: rule__BSQLMachine__InitAssignment_7 : ( RULE_ID ) ;
    public final void rule__BSQLMachine__InitAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3048:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3049:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3049:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3050:3: RULE_ID
            {
             before(grammarAccess.getBSQLMachineAccess().getInitIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getInitIDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__InitAssignment_7"


    // $ANTLR start "rule__BSQLMachine__OpsAssignment_11"
    // InternalBSQL2SQL.g:3059:1: rule__BSQLMachine__OpsAssignment_11 : ( ruleBSOperation ) ;
    public final void rule__BSQLMachine__OpsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3063:1: ( ( ruleBSOperation ) )
            // InternalBSQL2SQL.g:3064:2: ( ruleBSOperation )
            {
            // InternalBSQL2SQL.g:3064:2: ( ruleBSOperation )
            // InternalBSQL2SQL.g:3065:3: ruleBSOperation
            {
             before(grammarAccess.getBSQLMachineAccess().getOpsBSOperationParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleBSOperation();

            state._fsp--;

             after(grammarAccess.getBSQLMachineAccess().getOpsBSOperationParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__OpsAssignment_11"


    // $ANTLR start "rule__BTable__Table_nameAssignment_0"
    // InternalBSQL2SQL.g:3074:1: rule__BTable__Table_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BTable__Table_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3078:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3079:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3079:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3080:3: RULE_ID
            {
             before(grammarAccess.getBTableAccess().getTable_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBTableAccess().getTable_nameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__Table_nameAssignment_0"


    // $ANTLR start "rule__BTable__AttributesAssignment_4"
    // InternalBSQL2SQL.g:3089:1: rule__BTable__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__BTable__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3093:1: ( ( ruleAttribute ) )
            // InternalBSQL2SQL.g:3094:2: ( ruleAttribute )
            {
            // InternalBSQL2SQL.g:3094:2: ( ruleAttribute )
            // InternalBSQL2SQL.g:3095:3: ruleAttribute
            {
             before(grammarAccess.getBTableAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getBTableAccess().getAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__AttributesAssignment_4"


    // $ANTLR start "rule__BTable__AttributesAssignment_5_1"
    // InternalBSQL2SQL.g:3104:1: rule__BTable__AttributesAssignment_5_1 : ( ruleAttribute ) ;
    public final void rule__BTable__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3108:1: ( ( ruleAttribute ) )
            // InternalBSQL2SQL.g:3109:2: ( ruleAttribute )
            {
            // InternalBSQL2SQL.g:3109:2: ( ruleAttribute )
            // InternalBSQL2SQL.g:3110:3: ruleAttribute
            {
             before(grammarAccess.getBTableAccess().getAttributesAttributeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getBTableAccess().getAttributesAttributeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTable__AttributesAssignment_5_1"


    // $ANTLR start "rule__Attribute__Att_nameAssignment_0"
    // InternalBSQL2SQL.g:3119:1: rule__Attribute__Att_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__Att_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3123:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3124:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3124:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3125:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getAtt_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAtt_nameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Att_nameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalBSQL2SQL.g:3134:1: rule__Attribute__TypeAssignment_2 : ( ruleBType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3138:1: ( ( ruleBType ) )
            // InternalBSQL2SQL.g:3139:2: ( ruleBType )
            {
            // InternalBSQL2SQL.g:3139:2: ( ruleBType )
            // InternalBSQL2SQL.g:3140:3: ruleBType
            {
             before(grammarAccess.getAttributeAccess().getTypeBTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeBTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__BType__Type_nameAssignment"
    // InternalBSQL2SQL.g:3149:1: rule__BType__Type_nameAssignment : ( RULE_ID ) ;
    public final void rule__BType__Type_nameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3153:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3154:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3154:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3155:3: RULE_ID
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


    // $ANTLR start "rule__BSOperation__BopAssignment_0"
    // InternalBSQL2SQL.g:3164:1: rule__BSOperation__BopAssignment_0 : ( ruleBoolOperation ) ;
    public final void rule__BSOperation__BopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3168:1: ( ( ruleBoolOperation ) )
            // InternalBSQL2SQL.g:3169:2: ( ruleBoolOperation )
            {
            // InternalBSQL2SQL.g:3169:2: ( ruleBoolOperation )
            // InternalBSQL2SQL.g:3170:3: ruleBoolOperation
            {
             before(grammarAccess.getBSOperationAccess().getBopBoolOperationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOperation();

            state._fsp--;

             after(grammarAccess.getBSOperationAccess().getBopBoolOperationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSOperation__BopAssignment_0"


    // $ANTLR start "rule__BSOperation__VopAssignment_1"
    // InternalBSQL2SQL.g:3179:1: rule__BSOperation__VopAssignment_1 : ( ruleVoidOperation ) ;
    public final void rule__BSOperation__VopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3183:1: ( ( ruleVoidOperation ) )
            // InternalBSQL2SQL.g:3184:2: ( ruleVoidOperation )
            {
            // InternalBSQL2SQL.g:3184:2: ( ruleVoidOperation )
            // InternalBSQL2SQL.g:3185:3: ruleVoidOperation
            {
             before(grammarAccess.getBSOperationAccess().getVopVoidOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVoidOperation();

            state._fsp--;

             after(grammarAccess.getBSOperationAccess().getVopVoidOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSOperation__VopAssignment_1"


    // $ANTLR start "rule__BoolOperation__Op_nameAssignment_2"
    // InternalBSQL2SQL.g:3194:1: rule__BoolOperation__Op_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BoolOperation__Op_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3198:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3199:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3199:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3200:3: RULE_ID
            {
             before(grammarAccess.getBoolOperationAccess().getOp_nameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getOp_nameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Op_nameAssignment_2"


    // $ANTLR start "rule__BoolOperation__PListAssignment_4_0"
    // InternalBSQL2SQL.g:3209:1: rule__BoolOperation__PListAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__BoolOperation__PListAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3213:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3214:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3214:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3215:3: RULE_ID
            {
             before(grammarAccess.getBoolOperationAccess().getPListIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getPListIDTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__PListAssignment_4_0"


    // $ANTLR start "rule__BoolOperation__PListAssignment_4_1_1"
    // InternalBSQL2SQL.g:3224:1: rule__BoolOperation__PListAssignment_4_1_1 : ( RULE_ID ) ;
    public final void rule__BoolOperation__PListAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3228:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3229:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3229:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3230:3: RULE_ID
            {
             before(grammarAccess.getBoolOperationAccess().getPListIDTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getPListIDTerminalRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__PListAssignment_4_1_1"


    // $ANTLR start "rule__BoolOperation__ParamsAssignment_8_0"
    // InternalBSQL2SQL.g:3239:1: rule__BoolOperation__ParamsAssignment_8_0 : ( ruleBParameter ) ;
    public final void rule__BoolOperation__ParamsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3243:1: ( ( ruleBParameter ) )
            // InternalBSQL2SQL.g:3244:2: ( ruleBParameter )
            {
            // InternalBSQL2SQL.g:3244:2: ( ruleBParameter )
            // InternalBSQL2SQL.g:3245:3: ruleBParameter
            {
             before(grammarAccess.getBoolOperationAccess().getParamsBParameterParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameter();

            state._fsp--;

             after(grammarAccess.getBoolOperationAccess().getParamsBParameterParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__ParamsAssignment_8_0"


    // $ANTLR start "rule__BoolOperation__ParamsAssignment_8_1_1"
    // InternalBSQL2SQL.g:3254:1: rule__BoolOperation__ParamsAssignment_8_1_1 : ( ruleBParameter ) ;
    public final void rule__BoolOperation__ParamsAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3258:1: ( ( ruleBParameter ) )
            // InternalBSQL2SQL.g:3259:2: ( ruleBParameter )
            {
            // InternalBSQL2SQL.g:3259:2: ( ruleBParameter )
            // InternalBSQL2SQL.g:3260:3: ruleBParameter
            {
             before(grammarAccess.getBoolOperationAccess().getParamsBParameterParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameter();

            state._fsp--;

             after(grammarAccess.getBoolOperationAccess().getParamsBParameterParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__ParamsAssignment_8_1_1"


    // $ANTLR start "rule__BoolOperation__ObjTableAssignment_14"
    // InternalBSQL2SQL.g:3269:1: rule__BoolOperation__ObjTableAssignment_14 : ( ruleTableInstance ) ;
    public final void rule__BoolOperation__ObjTableAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3273:1: ( ( ruleTableInstance ) )
            // InternalBSQL2SQL.g:3274:2: ( ruleTableInstance )
            {
            // InternalBSQL2SQL.g:3274:2: ( ruleTableInstance )
            // InternalBSQL2SQL.g:3275:3: ruleTableInstance
            {
             before(grammarAccess.getBoolOperationAccess().getObjTableTableInstanceParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleTableInstance();

            state._fsp--;

             after(grammarAccess.getBoolOperationAccess().getObjTableTableInstanceParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__ObjTableAssignment_14"


    // $ANTLR start "rule__BoolOperation__PresAssignment_16"
    // InternalBSQL2SQL.g:3284:1: rule__BoolOperation__PresAssignment_16 : ( ruleBPredicate ) ;
    public final void rule__BoolOperation__PresAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3288:1: ( ( ruleBPredicate ) )
            // InternalBSQL2SQL.g:3289:2: ( ruleBPredicate )
            {
            // InternalBSQL2SQL.g:3289:2: ( ruleBPredicate )
            // InternalBSQL2SQL.g:3290:3: ruleBPredicate
            {
             before(grammarAccess.getBoolOperationAccess().getPresBPredicateParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBoolOperationAccess().getPresBPredicateParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__PresAssignment_16"


    // $ANTLR start "rule__BoolOperation__PresAssignment_17_1"
    // InternalBSQL2SQL.g:3299:1: rule__BoolOperation__PresAssignment_17_1 : ( ruleBPredicate ) ;
    public final void rule__BoolOperation__PresAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3303:1: ( ( ruleBPredicate ) )
            // InternalBSQL2SQL.g:3304:2: ( ruleBPredicate )
            {
            // InternalBSQL2SQL.g:3304:2: ( ruleBPredicate )
            // InternalBSQL2SQL.g:3305:3: ruleBPredicate
            {
             before(grammarAccess.getBoolOperationAccess().getPresBPredicateParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBoolOperationAccess().getPresBPredicateParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__PresAssignment_17_1"


    // $ANTLR start "rule__VoidOperation__Op_nameAssignment_0"
    // InternalBSQL2SQL.g:3314:1: rule__VoidOperation__Op_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VoidOperation__Op_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3318:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3319:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3319:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3320:3: RULE_ID
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
    // InternalBSQL2SQL.g:3329:1: rule__VoidOperation__PListAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__VoidOperation__PListAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3333:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3334:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3334:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3335:3: RULE_ID
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
    // InternalBSQL2SQL.g:3344:1: rule__VoidOperation__PListAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__VoidOperation__PListAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3348:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3349:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3349:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3350:3: RULE_ID
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
    // InternalBSQL2SQL.g:3359:1: rule__VoidOperation__ParamsAssignment_6_0 : ( ruleBParameter ) ;
    public final void rule__VoidOperation__ParamsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3363:1: ( ( ruleBParameter ) )
            // InternalBSQL2SQL.g:3364:2: ( ruleBParameter )
            {
            // InternalBSQL2SQL.g:3364:2: ( ruleBParameter )
            // InternalBSQL2SQL.g:3365:3: ruleBParameter
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
    // InternalBSQL2SQL.g:3374:1: rule__VoidOperation__ParamsAssignment_6_1_1 : ( ruleBParameter ) ;
    public final void rule__VoidOperation__ParamsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3378:1: ( ( ruleBParameter ) )
            // InternalBSQL2SQL.g:3379:2: ( ruleBParameter )
            {
            // InternalBSQL2SQL.g:3379:2: ( ruleBParameter )
            // InternalBSQL2SQL.g:3380:3: ruleBParameter
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


    // $ANTLR start "rule__VoidOperation__SubsAssignment_8"
    // InternalBSQL2SQL.g:3389:1: rule__VoidOperation__SubsAssignment_8 : ( ruleBSubstitution ) ;
    public final void rule__VoidOperation__SubsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3393:1: ( ( ruleBSubstitution ) )
            // InternalBSQL2SQL.g:3394:2: ( ruleBSubstitution )
            {
            // InternalBSQL2SQL.g:3394:2: ( ruleBSubstitution )
            // InternalBSQL2SQL.g:3395:3: ruleBSubstitution
            {
             before(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidOperation__SubsAssignment_8"


    // $ANTLR start "rule__BPredicate__PLeftAssignment_1_0"
    // InternalBSQL2SQL.g:3404:1: rule__BPredicate__PLeftAssignment_1_0 : ( ruleSQLCall ) ;
    public final void rule__BPredicate__PLeftAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3408:1: ( ( ruleSQLCall ) )
            // InternalBSQL2SQL.g:3409:2: ( ruleSQLCall )
            {
            // InternalBSQL2SQL.g:3409:2: ( ruleSQLCall )
            // InternalBSQL2SQL.g:3410:3: ruleSQLCall
            {
             before(grammarAccess.getBPredicateAccess().getPLeftSQLCallParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSQLCall();

            state._fsp--;

             after(grammarAccess.getBPredicateAccess().getPLeftSQLCallParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BPredicate__PLeftAssignment_1_0"


    // $ANTLR start "rule__BPredicate__PRightAssignment_1_2"
    // InternalBSQL2SQL.g:3419:1: rule__BPredicate__PRightAssignment_1_2 : ( ruleBValue ) ;
    public final void rule__BPredicate__PRightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3423:1: ( ( ruleBValue ) )
            // InternalBSQL2SQL.g:3424:2: ( ruleBValue )
            {
            // InternalBSQL2SQL.g:3424:2: ( ruleBValue )
            // InternalBSQL2SQL.g:3425:3: ruleBValue
            {
             before(grammarAccess.getBPredicateAccess().getPRightBValueParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBValue();

            state._fsp--;

             after(grammarAccess.getBPredicateAccess().getPRightBValueParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BPredicate__PRightAssignment_1_2"


    // $ANTLR start "rule__SQLCall__SLeftAssignment_0"
    // InternalBSQL2SQL.g:3434:1: rule__SQLCall__SLeftAssignment_0 : ( RULE_ID ) ;
    public final void rule__SQLCall__SLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3438:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3439:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3439:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3440:3: RULE_ID
            {
             before(grammarAccess.getSQLCallAccess().getSLeftIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQLCallAccess().getSLeftIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQLCall__SLeftAssignment_0"


    // $ANTLR start "rule__SQLCall__SRightAssignment_2"
    // InternalBSQL2SQL.g:3449:1: rule__SQLCall__SRightAssignment_2 : ( RULE_ID ) ;
    public final void rule__SQLCall__SRightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3453:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3454:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3454:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3455:3: RULE_ID
            {
             before(grammarAccess.getSQLCallAccess().getSRightIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQLCallAccess().getSRightIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQLCall__SRightAssignment_2"


    // $ANTLR start "rule__TableInstance__Ti_nameAssignment_0"
    // InternalBSQL2SQL.g:3464:1: rule__TableInstance__Ti_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TableInstance__Ti_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3468:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3469:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3469:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3470:3: RULE_ID
            {
             before(grammarAccess.getTableInstanceAccess().getTi_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableInstanceAccess().getTi_nameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInstance__Ti_nameAssignment_0"


    // $ANTLR start "rule__TableInstance__Ti_typeAssignment_2"
    // InternalBSQL2SQL.g:3479:1: rule__TableInstance__Ti_typeAssignment_2 : ( ruleTIAssignment ) ;
    public final void rule__TableInstance__Ti_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3483:1: ( ( ruleTIAssignment ) )
            // InternalBSQL2SQL.g:3484:2: ( ruleTIAssignment )
            {
            // InternalBSQL2SQL.g:3484:2: ( ruleTIAssignment )
            // InternalBSQL2SQL.g:3485:3: ruleTIAssignment
            {
             before(grammarAccess.getTableInstanceAccess().getTi_typeTIAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTIAssignment();

            state._fsp--;

             after(grammarAccess.getTableInstanceAccess().getTi_typeTIAssignmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInstance__Ti_typeAssignment_2"


    // $ANTLR start "rule__TIAssignment__Instance_nameAssignment_0"
    // InternalBSQL2SQL.g:3494:1: rule__TIAssignment__Instance_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TIAssignment__Instance_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3498:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3499:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3499:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3500:3: RULE_ID
            {
             before(grammarAccess.getTIAssignmentAccess().getInstance_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTIAssignmentAccess().getInstance_nameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIAssignment__Instance_nameAssignment_0"


    // $ANTLR start "rule__TIAssignment__Instance_typeAssignment_2"
    // InternalBSQL2SQL.g:3509:1: rule__TIAssignment__Instance_typeAssignment_2 : ( RULE_ID ) ;
    public final void rule__TIAssignment__Instance_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3513:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3514:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3514:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3515:3: RULE_ID
            {
             before(grammarAccess.getTIAssignmentAccess().getInstance_typeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTIAssignmentAccess().getInstance_typeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIAssignment__Instance_typeAssignment_2"


    // $ANTLR start "rule__BParameter__P_nameAssignment_0"
    // InternalBSQL2SQL.g:3524:1: rule__BParameter__P_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BParameter__P_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3528:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3529:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3529:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3530:3: RULE_ID
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
    // InternalBSQL2SQL.g:3539:1: rule__BParameter__TypeAssignment_2 : ( ruleBType ) ;
    public final void rule__BParameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3543:1: ( ( ruleBType ) )
            // InternalBSQL2SQL.g:3544:2: ( ruleBType )
            {
            // InternalBSQL2SQL.g:3544:2: ( ruleBType )
            // InternalBSQL2SQL.g:3545:3: ruleBType
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


    // $ANTLR start "rule__BSubstitution__LeftAssignment_0"
    // InternalBSQL2SQL.g:3554:1: rule__BSubstitution__LeftAssignment_0 : ( RULE_ID ) ;
    public final void rule__BSubstitution__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3558:1: ( ( RULE_ID ) )
            // InternalBSQL2SQL.g:3559:2: ( RULE_ID )
            {
            // InternalBSQL2SQL.g:3559:2: ( RULE_ID )
            // InternalBSQL2SQL.g:3560:3: RULE_ID
            {
             before(grammarAccess.getBSubstitutionAccess().getLeftIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSubstitutionAccess().getLeftIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubstitution__LeftAssignment_0"


    // $ANTLR start "rule__BSubstitution__RightAssignment_2"
    // InternalBSQL2SQL.g:3569:1: rule__BSubstitution__RightAssignment_2 : ( ruleBPredicate ) ;
    public final void rule__BSubstitution__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQL2SQL.g:3573:1: ( ( ruleBPredicate ) )
            // InternalBSQL2SQL.g:3574:2: ( ruleBPredicate )
            {
            // InternalBSQL2SQL.g:3574:2: ( ruleBPredicate )
            // InternalBSQL2SQL.g:3575:3: ruleBPredicate
            {
             before(grammarAccess.getBSubstitutionAccess().getRightBPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBSubstitutionAccess().getRightBPredicateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubstitution__RightAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});

}