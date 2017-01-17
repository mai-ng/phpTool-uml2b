package bsqllog2java.ide.contentassist.antlr.internal;

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
import bsqllog2java.services.BSQLLog2JavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSQLLog2JavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FALSE'", "'TRUE'", "'MACHINE'", "'VARIABLES'", "'INVARIANT'", "'INITIALISATION'", "':='", "'{}'", "'OPERATIONS'", "'END'", "'SEES'", "','", "';'", "'<:'", "'struct'", "'('", "')'", "':'", "'<--'", "'='", "'PRE'", "'THEN'", "'&'", "'bool('", "'#'", "'not'", "'ANY'", "'WHERE'", "'||'", "'\\''", "'.('", "'\\\\/'", "'{'", "'rec('", "')}'"
    };
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


        public InternalBSQLLog2JavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBSQLLog2JavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBSQLLog2JavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBSQLLog2Java.g"; }


    	private BSQLLog2JavaGrammarAccess grammarAccess;

    	public void setGrammarAccess(BSQLLog2JavaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBSQLLog2Java"
    // InternalBSQLLog2Java.g:53:1: entryRuleBSQLLog2Java : ruleBSQLLog2Java EOF ;
    public final void entryRuleBSQLLog2Java() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:54:1: ( ruleBSQLLog2Java EOF )
            // InternalBSQLLog2Java.g:55:1: ruleBSQLLog2Java EOF
            {
             before(grammarAccess.getBSQLLog2JavaRule()); 
            pushFollow(FOLLOW_1);
            ruleBSQLLog2Java();

            state._fsp--;

             after(grammarAccess.getBSQLLog2JavaRule()); 
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
    // $ANTLR end "entryRuleBSQLLog2Java"


    // $ANTLR start "ruleBSQLLog2Java"
    // InternalBSQLLog2Java.g:62:1: ruleBSQLLog2Java : ( ruleBSQLMachine ) ;
    public final void ruleBSQLLog2Java() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:66:2: ( ( ruleBSQLMachine ) )
            // InternalBSQLLog2Java.g:67:2: ( ruleBSQLMachine )
            {
            // InternalBSQLLog2Java.g:67:2: ( ruleBSQLMachine )
            // InternalBSQLLog2Java.g:68:3: ruleBSQLMachine
            {
             before(grammarAccess.getBSQLLog2JavaAccess().getBSQLMachineParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBSQLMachine();

            state._fsp--;

             after(grammarAccess.getBSQLLog2JavaAccess().getBSQLMachineParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSQLLog2Java"


    // $ANTLR start "entryRuleBSQLMachine"
    // InternalBSQLLog2Java.g:78:1: entryRuleBSQLMachine : ruleBSQLMachine EOF ;
    public final void entryRuleBSQLMachine() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:79:1: ( ruleBSQLMachine EOF )
            // InternalBSQLLog2Java.g:80:1: ruleBSQLMachine EOF
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
    // InternalBSQLLog2Java.g:87:1: ruleBSQLMachine : ( ( rule__BSQLMachine__Group__0 ) ) ;
    public final void ruleBSQLMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:91:2: ( ( ( rule__BSQLMachine__Group__0 ) ) )
            // InternalBSQLLog2Java.g:92:2: ( ( rule__BSQLMachine__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:92:2: ( ( rule__BSQLMachine__Group__0 ) )
            // InternalBSQLLog2Java.g:93:3: ( rule__BSQLMachine__Group__0 )
            {
             before(grammarAccess.getBSQLMachineAccess().getGroup()); 
            // InternalBSQLLog2Java.g:94:3: ( rule__BSQLMachine__Group__0 )
            // InternalBSQLLog2Java.g:94:4: rule__BSQLMachine__Group__0
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


    // $ANTLR start "entryRuleBOperation"
    // InternalBSQLLog2Java.g:103:1: entryRuleBOperation : ruleBOperation EOF ;
    public final void entryRuleBOperation() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:104:1: ( ruleBOperation EOF )
            // InternalBSQLLog2Java.g:105:1: ruleBOperation EOF
            {
             before(grammarAccess.getBOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleBOperation();

            state._fsp--;

             after(grammarAccess.getBOperationRule()); 
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
    // $ANTLR end "entryRuleBOperation"


    // $ANTLR start "ruleBOperation"
    // InternalBSQLLog2Java.g:112:1: ruleBOperation : ( ( rule__BOperation__Alternatives ) ) ;
    public final void ruleBOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:116:2: ( ( ( rule__BOperation__Alternatives ) ) )
            // InternalBSQLLog2Java.g:117:2: ( ( rule__BOperation__Alternatives ) )
            {
            // InternalBSQLLog2Java.g:117:2: ( ( rule__BOperation__Alternatives ) )
            // InternalBSQLLog2Java.g:118:3: ( rule__BOperation__Alternatives )
            {
             before(grammarAccess.getBOperationAccess().getAlternatives()); 
            // InternalBSQLLog2Java.g:119:3: ( rule__BOperation__Alternatives )
            // InternalBSQLLog2Java.g:119:4: rule__BOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOperation"


    // $ANTLR start "entryRuleBTable"
    // InternalBSQLLog2Java.g:128:1: entryRuleBTable : ruleBTable EOF ;
    public final void entryRuleBTable() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:129:1: ( ruleBTable EOF )
            // InternalBSQLLog2Java.g:130:1: ruleBTable EOF
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
    // InternalBSQLLog2Java.g:137:1: ruleBTable : ( ( rule__BTable__Group__0 ) ) ;
    public final void ruleBTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:141:2: ( ( ( rule__BTable__Group__0 ) ) )
            // InternalBSQLLog2Java.g:142:2: ( ( rule__BTable__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:142:2: ( ( rule__BTable__Group__0 ) )
            // InternalBSQLLog2Java.g:143:3: ( rule__BTable__Group__0 )
            {
             before(grammarAccess.getBTableAccess().getGroup()); 
            // InternalBSQLLog2Java.g:144:3: ( rule__BTable__Group__0 )
            // InternalBSQLLog2Java.g:144:4: rule__BTable__Group__0
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
    // InternalBSQLLog2Java.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:154:1: ( ruleAttribute EOF )
            // InternalBSQLLog2Java.g:155:1: ruleAttribute EOF
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
    // InternalBSQLLog2Java.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalBSQLLog2Java.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalBSQLLog2Java.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalBSQLLog2Java.g:169:3: ( rule__Attribute__Group__0 )
            // InternalBSQLLog2Java.g:169:4: rule__Attribute__Group__0
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
    // InternalBSQLLog2Java.g:178:1: entryRuleBType : ruleBType EOF ;
    public final void entryRuleBType() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:179:1: ( ruleBType EOF )
            // InternalBSQLLog2Java.g:180:1: ruleBType EOF
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
    // InternalBSQLLog2Java.g:187:1: ruleBType : ( ( rule__BType__Type_nameAssignment ) ) ;
    public final void ruleBType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:191:2: ( ( ( rule__BType__Type_nameAssignment ) ) )
            // InternalBSQLLog2Java.g:192:2: ( ( rule__BType__Type_nameAssignment ) )
            {
            // InternalBSQLLog2Java.g:192:2: ( ( rule__BType__Type_nameAssignment ) )
            // InternalBSQLLog2Java.g:193:3: ( rule__BType__Type_nameAssignment )
            {
             before(grammarAccess.getBTypeAccess().getType_nameAssignment()); 
            // InternalBSQLLog2Java.g:194:3: ( rule__BType__Type_nameAssignment )
            // InternalBSQLLog2Java.g:194:4: rule__BType__Type_nameAssignment
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
    // InternalBSQLLog2Java.g:203:1: entryRuleBValue : ruleBValue EOF ;
    public final void entryRuleBValue() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:204:1: ( ruleBValue EOF )
            // InternalBSQLLog2Java.g:205:1: ruleBValue EOF
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
    // InternalBSQLLog2Java.g:212:1: ruleBValue : ( ( rule__BValue__Alternatives ) ) ;
    public final void ruleBValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:216:2: ( ( ( rule__BValue__Alternatives ) ) )
            // InternalBSQLLog2Java.g:217:2: ( ( rule__BValue__Alternatives ) )
            {
            // InternalBSQLLog2Java.g:217:2: ( ( rule__BValue__Alternatives ) )
            // InternalBSQLLog2Java.g:218:3: ( rule__BValue__Alternatives )
            {
             before(grammarAccess.getBValueAccess().getAlternatives()); 
            // InternalBSQLLog2Java.g:219:3: ( rule__BValue__Alternatives )
            // InternalBSQLLog2Java.g:219:4: rule__BValue__Alternatives
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


    // $ANTLR start "entryRuleBoolOperation"
    // InternalBSQLLog2Java.g:228:1: entryRuleBoolOperation : ruleBoolOperation EOF ;
    public final void entryRuleBoolOperation() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:229:1: ( ruleBoolOperation EOF )
            // InternalBSQLLog2Java.g:230:1: ruleBoolOperation EOF
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
    // InternalBSQLLog2Java.g:237:1: ruleBoolOperation : ( ( rule__BoolOperation__Group__0 ) ) ;
    public final void ruleBoolOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:241:2: ( ( ( rule__BoolOperation__Group__0 ) ) )
            // InternalBSQLLog2Java.g:242:2: ( ( rule__BoolOperation__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:242:2: ( ( rule__BoolOperation__Group__0 ) )
            // InternalBSQLLog2Java.g:243:3: ( rule__BoolOperation__Group__0 )
            {
             before(grammarAccess.getBoolOperationAccess().getGroup()); 
            // InternalBSQLLog2Java.g:244:3: ( rule__BoolOperation__Group__0 )
            // InternalBSQLLog2Java.g:244:4: rule__BoolOperation__Group__0
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


    // $ANTLR start "entryRuleBSubTrue"
    // InternalBSQLLog2Java.g:253:1: entryRuleBSubTrue : ruleBSubTrue EOF ;
    public final void entryRuleBSubTrue() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:254:1: ( ruleBSubTrue EOF )
            // InternalBSQLLog2Java.g:255:1: ruleBSubTrue EOF
            {
             before(grammarAccess.getBSubTrueRule()); 
            pushFollow(FOLLOW_1);
            ruleBSubTrue();

            state._fsp--;

             after(grammarAccess.getBSubTrueRule()); 
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
    // $ANTLR end "entryRuleBSubTrue"


    // $ANTLR start "ruleBSubTrue"
    // InternalBSQLLog2Java.g:262:1: ruleBSubTrue : ( ( rule__BSubTrue__Group__0 ) ) ;
    public final void ruleBSubTrue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:266:2: ( ( ( rule__BSubTrue__Group__0 ) ) )
            // InternalBSQLLog2Java.g:267:2: ( ( rule__BSubTrue__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:267:2: ( ( rule__BSubTrue__Group__0 ) )
            // InternalBSQLLog2Java.g:268:3: ( rule__BSubTrue__Group__0 )
            {
             before(grammarAccess.getBSubTrueAccess().getGroup()); 
            // InternalBSQLLog2Java.g:269:3: ( rule__BSubTrue__Group__0 )
            // InternalBSQLLog2Java.g:269:4: rule__BSubTrue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBSubTrueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSubTrue"


    // $ANTLR start "entryRuleBSubFalse"
    // InternalBSQLLog2Java.g:278:1: entryRuleBSubFalse : ruleBSubFalse EOF ;
    public final void entryRuleBSubFalse() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:279:1: ( ruleBSubFalse EOF )
            // InternalBSQLLog2Java.g:280:1: ruleBSubFalse EOF
            {
             before(grammarAccess.getBSubFalseRule()); 
            pushFollow(FOLLOW_1);
            ruleBSubFalse();

            state._fsp--;

             after(grammarAccess.getBSubFalseRule()); 
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
    // $ANTLR end "entryRuleBSubFalse"


    // $ANTLR start "ruleBSubFalse"
    // InternalBSQLLog2Java.g:287:1: ruleBSubFalse : ( ( rule__BSubFalse__Group__0 ) ) ;
    public final void ruleBSubFalse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:291:2: ( ( ( rule__BSubFalse__Group__0 ) ) )
            // InternalBSQLLog2Java.g:292:2: ( ( rule__BSubFalse__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:292:2: ( ( rule__BSubFalse__Group__0 ) )
            // InternalBSQLLog2Java.g:293:3: ( rule__BSubFalse__Group__0 )
            {
             before(grammarAccess.getBSubFalseAccess().getGroup()); 
            // InternalBSQLLog2Java.g:294:3: ( rule__BSubFalse__Group__0 )
            // InternalBSQLLog2Java.g:294:4: rule__BSubFalse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBSubFalseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSubFalse"


    // $ANTLR start "entryRuleStringOperation"
    // InternalBSQLLog2Java.g:303:1: entryRuleStringOperation : ruleStringOperation EOF ;
    public final void entryRuleStringOperation() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:304:1: ( ruleStringOperation EOF )
            // InternalBSQLLog2Java.g:305:1: ruleStringOperation EOF
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
    // InternalBSQLLog2Java.g:312:1: ruleStringOperation : ( ( rule__StringOperation__Group__0 ) ) ;
    public final void ruleStringOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:316:2: ( ( ( rule__StringOperation__Group__0 ) ) )
            // InternalBSQLLog2Java.g:317:2: ( ( rule__StringOperation__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:317:2: ( ( rule__StringOperation__Group__0 ) )
            // InternalBSQLLog2Java.g:318:3: ( rule__StringOperation__Group__0 )
            {
             before(grammarAccess.getStringOperationAccess().getGroup()); 
            // InternalBSQLLog2Java.g:319:3: ( rule__StringOperation__Group__0 )
            // InternalBSQLLog2Java.g:319:4: rule__StringOperation__Group__0
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


    // $ANTLR start "entryRuleBAnyBlock"
    // InternalBSQLLog2Java.g:328:1: entryRuleBAnyBlock : ruleBAnyBlock EOF ;
    public final void entryRuleBAnyBlock() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:329:1: ( ruleBAnyBlock EOF )
            // InternalBSQLLog2Java.g:330:1: ruleBAnyBlock EOF
            {
             before(grammarAccess.getBAnyBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBAnyBlock();

            state._fsp--;

             after(grammarAccess.getBAnyBlockRule()); 
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
    // $ANTLR end "entryRuleBAnyBlock"


    // $ANTLR start "ruleBAnyBlock"
    // InternalBSQLLog2Java.g:337:1: ruleBAnyBlock : ( ( rule__BAnyBlock__Group__0 ) ) ;
    public final void ruleBAnyBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:341:2: ( ( ( rule__BAnyBlock__Group__0 ) ) )
            // InternalBSQLLog2Java.g:342:2: ( ( rule__BAnyBlock__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:342:2: ( ( rule__BAnyBlock__Group__0 ) )
            // InternalBSQLLog2Java.g:343:3: ( rule__BAnyBlock__Group__0 )
            {
             before(grammarAccess.getBAnyBlockAccess().getGroup()); 
            // InternalBSQLLog2Java.g:344:3: ( rule__BAnyBlock__Group__0 )
            // InternalBSQLLog2Java.g:344:4: rule__BAnyBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBAnyBlock"


    // $ANTLR start "entryRuleVoidOperation"
    // InternalBSQLLog2Java.g:353:1: entryRuleVoidOperation : ruleVoidOperation EOF ;
    public final void entryRuleVoidOperation() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:354:1: ( ruleVoidOperation EOF )
            // InternalBSQLLog2Java.g:355:1: ruleVoidOperation EOF
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
    // InternalBSQLLog2Java.g:362:1: ruleVoidOperation : ( ( rule__VoidOperation__Group__0 ) ) ;
    public final void ruleVoidOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:366:2: ( ( ( rule__VoidOperation__Group__0 ) ) )
            // InternalBSQLLog2Java.g:367:2: ( ( rule__VoidOperation__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:367:2: ( ( rule__VoidOperation__Group__0 ) )
            // InternalBSQLLog2Java.g:368:3: ( rule__VoidOperation__Group__0 )
            {
             before(grammarAccess.getVoidOperationAccess().getGroup()); 
            // InternalBSQLLog2Java.g:369:3: ( rule__VoidOperation__Group__0 )
            // InternalBSQLLog2Java.g:369:4: rule__VoidOperation__Group__0
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
    // InternalBSQLLog2Java.g:378:1: entryRuleBPredicate : ruleBPredicate EOF ;
    public final void entryRuleBPredicate() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:379:1: ( ruleBPredicate EOF )
            // InternalBSQLLog2Java.g:380:1: ruleBPredicate EOF
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
    // InternalBSQLLog2Java.g:387:1: ruleBPredicate : ( ( rule__BPredicate__Group__0 ) ) ;
    public final void ruleBPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:391:2: ( ( ( rule__BPredicate__Group__0 ) ) )
            // InternalBSQLLog2Java.g:392:2: ( ( rule__BPredicate__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:392:2: ( ( rule__BPredicate__Group__0 ) )
            // InternalBSQLLog2Java.g:393:3: ( rule__BPredicate__Group__0 )
            {
             before(grammarAccess.getBPredicateAccess().getGroup()); 
            // InternalBSQLLog2Java.g:394:3: ( rule__BPredicate__Group__0 )
            // InternalBSQLLog2Java.g:394:4: rule__BPredicate__Group__0
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
    // InternalBSQLLog2Java.g:403:1: entryRuleSQLCall : ruleSQLCall EOF ;
    public final void entryRuleSQLCall() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:404:1: ( ruleSQLCall EOF )
            // InternalBSQLLog2Java.g:405:1: ruleSQLCall EOF
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
    // InternalBSQLLog2Java.g:412:1: ruleSQLCall : ( ( rule__SQLCall__Group__0 ) ) ;
    public final void ruleSQLCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:416:2: ( ( ( rule__SQLCall__Group__0 ) ) )
            // InternalBSQLLog2Java.g:417:2: ( ( rule__SQLCall__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:417:2: ( ( rule__SQLCall__Group__0 ) )
            // InternalBSQLLog2Java.g:418:3: ( rule__SQLCall__Group__0 )
            {
             before(grammarAccess.getSQLCallAccess().getGroup()); 
            // InternalBSQLLog2Java.g:419:3: ( rule__SQLCall__Group__0 )
            // InternalBSQLLog2Java.g:419:4: rule__SQLCall__Group__0
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
    // InternalBSQLLog2Java.g:428:1: entryRuleTableInstance : ruleTableInstance EOF ;
    public final void entryRuleTableInstance() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:429:1: ( ruleTableInstance EOF )
            // InternalBSQLLog2Java.g:430:1: ruleTableInstance EOF
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
    // InternalBSQLLog2Java.g:437:1: ruleTableInstance : ( ( rule__TableInstance__Group__0 ) ) ;
    public final void ruleTableInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:441:2: ( ( ( rule__TableInstance__Group__0 ) ) )
            // InternalBSQLLog2Java.g:442:2: ( ( rule__TableInstance__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:442:2: ( ( rule__TableInstance__Group__0 ) )
            // InternalBSQLLog2Java.g:443:3: ( rule__TableInstance__Group__0 )
            {
             before(grammarAccess.getTableInstanceAccess().getGroup()); 
            // InternalBSQLLog2Java.g:444:3: ( rule__TableInstance__Group__0 )
            // InternalBSQLLog2Java.g:444:4: rule__TableInstance__Group__0
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
    // InternalBSQLLog2Java.g:453:1: entryRuleTIAssignment : ruleTIAssignment EOF ;
    public final void entryRuleTIAssignment() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:454:1: ( ruleTIAssignment EOF )
            // InternalBSQLLog2Java.g:455:1: ruleTIAssignment EOF
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
    // InternalBSQLLog2Java.g:462:1: ruleTIAssignment : ( ( rule__TIAssignment__Group__0 ) ) ;
    public final void ruleTIAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:466:2: ( ( ( rule__TIAssignment__Group__0 ) ) )
            // InternalBSQLLog2Java.g:467:2: ( ( rule__TIAssignment__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:467:2: ( ( rule__TIAssignment__Group__0 ) )
            // InternalBSQLLog2Java.g:468:3: ( rule__TIAssignment__Group__0 )
            {
             before(grammarAccess.getTIAssignmentAccess().getGroup()); 
            // InternalBSQLLog2Java.g:469:3: ( rule__TIAssignment__Group__0 )
            // InternalBSQLLog2Java.g:469:4: rule__TIAssignment__Group__0
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


    // $ANTLR start "entryRuleBParameterTyping"
    // InternalBSQLLog2Java.g:478:1: entryRuleBParameterTyping : ruleBParameterTyping EOF ;
    public final void entryRuleBParameterTyping() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:479:1: ( ruleBParameterTyping EOF )
            // InternalBSQLLog2Java.g:480:1: ruleBParameterTyping EOF
            {
             before(grammarAccess.getBParameterTypingRule()); 
            pushFollow(FOLLOW_1);
            ruleBParameterTyping();

            state._fsp--;

             after(grammarAccess.getBParameterTypingRule()); 
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
    // $ANTLR end "entryRuleBParameterTyping"


    // $ANTLR start "ruleBParameterTyping"
    // InternalBSQLLog2Java.g:487:1: ruleBParameterTyping : ( ( rule__BParameterTyping__Group__0 ) ) ;
    public final void ruleBParameterTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:491:2: ( ( ( rule__BParameterTyping__Group__0 ) ) )
            // InternalBSQLLog2Java.g:492:2: ( ( rule__BParameterTyping__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:492:2: ( ( rule__BParameterTyping__Group__0 ) )
            // InternalBSQLLog2Java.g:493:3: ( rule__BParameterTyping__Group__0 )
            {
             before(grammarAccess.getBParameterTypingAccess().getGroup()); 
            // InternalBSQLLog2Java.g:494:3: ( rule__BParameterTyping__Group__0 )
            // InternalBSQLLog2Java.g:494:4: rule__BParameterTyping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BParameterTyping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBParameterTypingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBParameterTyping"


    // $ANTLR start "entryRuleBSubstitution"
    // InternalBSQLLog2Java.g:503:1: entryRuleBSubstitution : ruleBSubstitution EOF ;
    public final void entryRuleBSubstitution() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:504:1: ( ruleBSubstitution EOF )
            // InternalBSQLLog2Java.g:505:1: ruleBSubstitution EOF
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
    // InternalBSQLLog2Java.g:512:1: ruleBSubstitution : ( ( rule__BSubstitution__Group__0 ) ) ;
    public final void ruleBSubstitution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:516:2: ( ( ( rule__BSubstitution__Group__0 ) ) )
            // InternalBSQLLog2Java.g:517:2: ( ( rule__BSubstitution__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:517:2: ( ( rule__BSubstitution__Group__0 ) )
            // InternalBSQLLog2Java.g:518:3: ( rule__BSubstitution__Group__0 )
            {
             before(grammarAccess.getBSubstitutionAccess().getGroup()); 
            // InternalBSQLLog2Java.g:519:3: ( rule__BSubstitution__Group__0 )
            // InternalBSQLLog2Java.g:519:4: rule__BSubstitution__Group__0
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


    // $ANTLR start "entryRuleBUnion"
    // InternalBSQLLog2Java.g:528:1: entryRuleBUnion : ruleBUnion EOF ;
    public final void entryRuleBUnion() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:529:1: ( ruleBUnion EOF )
            // InternalBSQLLog2Java.g:530:1: ruleBUnion EOF
            {
             before(grammarAccess.getBUnionRule()); 
            pushFollow(FOLLOW_1);
            ruleBUnion();

            state._fsp--;

             after(grammarAccess.getBUnionRule()); 
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
    // $ANTLR end "entryRuleBUnion"


    // $ANTLR start "ruleBUnion"
    // InternalBSQLLog2Java.g:537:1: ruleBUnion : ( ( rule__BUnion__Group__0 ) ) ;
    public final void ruleBUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:541:2: ( ( ( rule__BUnion__Group__0 ) ) )
            // InternalBSQLLog2Java.g:542:2: ( ( rule__BUnion__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:542:2: ( ( rule__BUnion__Group__0 ) )
            // InternalBSQLLog2Java.g:543:3: ( rule__BUnion__Group__0 )
            {
             before(grammarAccess.getBUnionAccess().getGroup()); 
            // InternalBSQLLog2Java.g:544:3: ( rule__BUnion__Group__0 )
            // InternalBSQLLog2Java.g:544:4: rule__BUnion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BUnion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBUnionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBUnion"


    // $ANTLR start "entryRuleBElementStructure"
    // InternalBSQLLog2Java.g:553:1: entryRuleBElementStructure : ruleBElementStructure EOF ;
    public final void entryRuleBElementStructure() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:554:1: ( ruleBElementStructure EOF )
            // InternalBSQLLog2Java.g:555:1: ruleBElementStructure EOF
            {
             before(grammarAccess.getBElementStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleBElementStructure();

            state._fsp--;

             after(grammarAccess.getBElementStructureRule()); 
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
    // $ANTLR end "entryRuleBElementStructure"


    // $ANTLR start "ruleBElementStructure"
    // InternalBSQLLog2Java.g:562:1: ruleBElementStructure : ( ( rule__BElementStructure__Group__0 ) ) ;
    public final void ruleBElementStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:566:2: ( ( ( rule__BElementStructure__Group__0 ) ) )
            // InternalBSQLLog2Java.g:567:2: ( ( rule__BElementStructure__Group__0 ) )
            {
            // InternalBSQLLog2Java.g:567:2: ( ( rule__BElementStructure__Group__0 ) )
            // InternalBSQLLog2Java.g:568:3: ( rule__BElementStructure__Group__0 )
            {
             before(grammarAccess.getBElementStructureAccess().getGroup()); 
            // InternalBSQLLog2Java.g:569:3: ( rule__BElementStructure__Group__0 )
            // InternalBSQLLog2Java.g:569:4: rule__BElementStructure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BElementStructure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBElementStructureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBElementStructure"


    // $ANTLR start "entryRuleBElement"
    // InternalBSQLLog2Java.g:578:1: entryRuleBElement : ruleBElement EOF ;
    public final void entryRuleBElement() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:579:1: ( ruleBElement EOF )
            // InternalBSQLLog2Java.g:580:1: ruleBElement EOF
            {
             before(grammarAccess.getBElementRule()); 
            pushFollow(FOLLOW_1);
            ruleBElement();

            state._fsp--;

             after(grammarAccess.getBElementRule()); 
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
    // $ANTLR end "entryRuleBElement"


    // $ANTLR start "ruleBElement"
    // InternalBSQLLog2Java.g:587:1: ruleBElement : ( ( rule__BElement__EnameAssignment ) ) ;
    public final void ruleBElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:591:2: ( ( ( rule__BElement__EnameAssignment ) ) )
            // InternalBSQLLog2Java.g:592:2: ( ( rule__BElement__EnameAssignment ) )
            {
            // InternalBSQLLog2Java.g:592:2: ( ( rule__BElement__EnameAssignment ) )
            // InternalBSQLLog2Java.g:593:3: ( rule__BElement__EnameAssignment )
            {
             before(grammarAccess.getBElementAccess().getEnameAssignment()); 
            // InternalBSQLLog2Java.g:594:3: ( rule__BElement__EnameAssignment )
            // InternalBSQLLog2Java.g:594:4: rule__BElement__EnameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BElement__EnameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBElementAccess().getEnameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBElement"


    // $ANTLR start "entryRuleBSet"
    // InternalBSQLLog2Java.g:603:1: entryRuleBSet : ruleBSet EOF ;
    public final void entryRuleBSet() throws RecognitionException {
        try {
            // InternalBSQLLog2Java.g:604:1: ( ruleBSet EOF )
            // InternalBSQLLog2Java.g:605:1: ruleBSet EOF
            {
             before(grammarAccess.getBSetRule()); 
            pushFollow(FOLLOW_1);
            ruleBSet();

            state._fsp--;

             after(grammarAccess.getBSetRule()); 
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
    // $ANTLR end "entryRuleBSet"


    // $ANTLR start "ruleBSet"
    // InternalBSQLLog2Java.g:612:1: ruleBSet : ( ( rule__BSet__Set_nameAssignment ) ) ;
    public final void ruleBSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:616:2: ( ( ( rule__BSet__Set_nameAssignment ) ) )
            // InternalBSQLLog2Java.g:617:2: ( ( rule__BSet__Set_nameAssignment ) )
            {
            // InternalBSQLLog2Java.g:617:2: ( ( rule__BSet__Set_nameAssignment ) )
            // InternalBSQLLog2Java.g:618:3: ( rule__BSet__Set_nameAssignment )
            {
             before(grammarAccess.getBSetAccess().getSet_nameAssignment()); 
            // InternalBSQLLog2Java.g:619:3: ( rule__BSet__Set_nameAssignment )
            // InternalBSQLLog2Java.g:619:4: rule__BSet__Set_nameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BSet__Set_nameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBSetAccess().getSet_nameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSet"


    // $ANTLR start "rule__BOperation__Alternatives"
    // InternalBSQLLog2Java.g:627:1: rule__BOperation__Alternatives : ( ( ( rule__BOperation__BopsAssignment_0 ) ) | ( ( rule__BOperation__VopsAssignment_1 ) ) | ( ( rule__BOperation__SopsAssignment_2 ) ) );
    public final void rule__BOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:631:1: ( ( ( rule__BOperation__BopsAssignment_0 ) ) | ( ( rule__BOperation__VopsAssignment_1 ) ) | ( ( rule__BOperation__SopsAssignment_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalBSQLLog2Java.g:632:2: ( ( rule__BOperation__BopsAssignment_0 ) )
                    {
                    // InternalBSQLLog2Java.g:632:2: ( ( rule__BOperation__BopsAssignment_0 ) )
                    // InternalBSQLLog2Java.g:633:3: ( rule__BOperation__BopsAssignment_0 )
                    {
                     before(grammarAccess.getBOperationAccess().getBopsAssignment_0()); 
                    // InternalBSQLLog2Java.g:634:3: ( rule__BOperation__BopsAssignment_0 )
                    // InternalBSQLLog2Java.g:634:4: rule__BOperation__BopsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOperation__BopsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBOperationAccess().getBopsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:638:2: ( ( rule__BOperation__VopsAssignment_1 ) )
                    {
                    // InternalBSQLLog2Java.g:638:2: ( ( rule__BOperation__VopsAssignment_1 ) )
                    // InternalBSQLLog2Java.g:639:3: ( rule__BOperation__VopsAssignment_1 )
                    {
                     before(grammarAccess.getBOperationAccess().getVopsAssignment_1()); 
                    // InternalBSQLLog2Java.g:640:3: ( rule__BOperation__VopsAssignment_1 )
                    // InternalBSQLLog2Java.g:640:4: rule__BOperation__VopsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOperation__VopsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBOperationAccess().getVopsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSQLLog2Java.g:644:2: ( ( rule__BOperation__SopsAssignment_2 ) )
                    {
                    // InternalBSQLLog2Java.g:644:2: ( ( rule__BOperation__SopsAssignment_2 ) )
                    // InternalBSQLLog2Java.g:645:3: ( rule__BOperation__SopsAssignment_2 )
                    {
                     before(grammarAccess.getBOperationAccess().getSopsAssignment_2()); 
                    // InternalBSQLLog2Java.g:646:3: ( rule__BOperation__SopsAssignment_2 )
                    // InternalBSQLLog2Java.g:646:4: rule__BOperation__SopsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOperation__SopsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBOperationAccess().getSopsAssignment_2()); 

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
    // $ANTLR end "rule__BOperation__Alternatives"


    // $ANTLR start "rule__BValue__Alternatives"
    // InternalBSQLLog2Java.g:654:1: rule__BValue__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) | ( 'FALSE' ) | ( 'TRUE' ) );
    public final void rule__BValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:658:1: ( ( RULE_ID ) | ( RULE_INT ) | ( 'FALSE' ) | ( 'TRUE' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            case 12:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBSQLLog2Java.g:659:2: ( RULE_ID )
                    {
                    // InternalBSQLLog2Java.g:659:2: ( RULE_ID )
                    // InternalBSQLLog2Java.g:660:3: RULE_ID
                    {
                     before(grammarAccess.getBValueAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getBValueAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:665:2: ( RULE_INT )
                    {
                    // InternalBSQLLog2Java.g:665:2: ( RULE_INT )
                    // InternalBSQLLog2Java.g:666:3: RULE_INT
                    {
                     before(grammarAccess.getBValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getBValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSQLLog2Java.g:671:2: ( 'FALSE' )
                    {
                    // InternalBSQLLog2Java.g:671:2: ( 'FALSE' )
                    // InternalBSQLLog2Java.g:672:3: 'FALSE'
                    {
                     before(grammarAccess.getBValueAccess().getFALSEKeyword_2()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBValueAccess().getFALSEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSQLLog2Java.g:677:2: ( 'TRUE' )
                    {
                    // InternalBSQLLog2Java.g:677:2: ( 'TRUE' )
                    // InternalBSQLLog2Java.g:678:3: 'TRUE'
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


    // $ANTLR start "rule__BoolOperation__Alternatives_10"
    // InternalBSQLLog2Java.g:687:1: rule__BoolOperation__Alternatives_10 : ( ( ( rule__BoolOperation__ReshasAssignment_10_0 ) ) | ( ( rule__BoolOperation__ResnoAssignment_10_1 ) ) );
    public final void rule__BoolOperation__Alternatives_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:691:1: ( ( ( rule__BoolOperation__ReshasAssignment_10_0 ) ) | ( ( rule__BoolOperation__ResnoAssignment_10_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==17) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==34) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==35) ) {
                            alt3=1;
                        }
                        else if ( (LA3_3==36) ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBSQLLog2Java.g:692:2: ( ( rule__BoolOperation__ReshasAssignment_10_0 ) )
                    {
                    // InternalBSQLLog2Java.g:692:2: ( ( rule__BoolOperation__ReshasAssignment_10_0 ) )
                    // InternalBSQLLog2Java.g:693:3: ( rule__BoolOperation__ReshasAssignment_10_0 )
                    {
                     before(grammarAccess.getBoolOperationAccess().getReshasAssignment_10_0()); 
                    // InternalBSQLLog2Java.g:694:3: ( rule__BoolOperation__ReshasAssignment_10_0 )
                    // InternalBSQLLog2Java.g:694:4: rule__BoolOperation__ReshasAssignment_10_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolOperation__ReshasAssignment_10_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoolOperationAccess().getReshasAssignment_10_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:698:2: ( ( rule__BoolOperation__ResnoAssignment_10_1 ) )
                    {
                    // InternalBSQLLog2Java.g:698:2: ( ( rule__BoolOperation__ResnoAssignment_10_1 ) )
                    // InternalBSQLLog2Java.g:699:3: ( rule__BoolOperation__ResnoAssignment_10_1 )
                    {
                     before(grammarAccess.getBoolOperationAccess().getResnoAssignment_10_1()); 
                    // InternalBSQLLog2Java.g:700:3: ( rule__BoolOperation__ResnoAssignment_10_1 )
                    // InternalBSQLLog2Java.g:700:4: rule__BoolOperation__ResnoAssignment_10_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolOperation__ResnoAssignment_10_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoolOperationAccess().getResnoAssignment_10_1()); 

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
    // $ANTLR end "rule__BoolOperation__Alternatives_10"


    // $ANTLR start "rule__BSubstitution__Alternatives_2"
    // InternalBSQLLog2Java.g:708:1: rule__BSubstitution__Alternatives_2 : ( ( ( rule__BSubstitution__PrightAssignment_2_0 ) ) | ( ( rule__BSubstitution__UrightAssignment_2_1 ) ) | ( ( rule__BSubstitution__SrightAssignment_2_2 ) ) );
    public final void rule__BSubstitution__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:712:1: ( ( ( rule__BSubstitution__PrightAssignment_2_0 ) ) | ( ( rule__BSubstitution__UrightAssignment_2_1 ) ) | ( ( rule__BSubstitution__SrightAssignment_2_2 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==42) ) {
                    alt4=2;
                }
                else if ( (LA4_1==40) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==RULE_ID) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==30) ) {
                            alt4=1;
                        }
                        else if ( (LA4_4==EOF||LA4_4==20||LA4_4==39) ) {
                            alt4=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
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
                    // InternalBSQLLog2Java.g:713:2: ( ( rule__BSubstitution__PrightAssignment_2_0 ) )
                    {
                    // InternalBSQLLog2Java.g:713:2: ( ( rule__BSubstitution__PrightAssignment_2_0 ) )
                    // InternalBSQLLog2Java.g:714:3: ( rule__BSubstitution__PrightAssignment_2_0 )
                    {
                     before(grammarAccess.getBSubstitutionAccess().getPrightAssignment_2_0()); 
                    // InternalBSQLLog2Java.g:715:3: ( rule__BSubstitution__PrightAssignment_2_0 )
                    // InternalBSQLLog2Java.g:715:4: rule__BSubstitution__PrightAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSubstitution__PrightAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBSubstitutionAccess().getPrightAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:719:2: ( ( rule__BSubstitution__UrightAssignment_2_1 ) )
                    {
                    // InternalBSQLLog2Java.g:719:2: ( ( rule__BSubstitution__UrightAssignment_2_1 ) )
                    // InternalBSQLLog2Java.g:720:3: ( rule__BSubstitution__UrightAssignment_2_1 )
                    {
                     before(grammarAccess.getBSubstitutionAccess().getUrightAssignment_2_1()); 
                    // InternalBSQLLog2Java.g:721:3: ( rule__BSubstitution__UrightAssignment_2_1 )
                    // InternalBSQLLog2Java.g:721:4: rule__BSubstitution__UrightAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSubstitution__UrightAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBSubstitutionAccess().getUrightAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSQLLog2Java.g:725:2: ( ( rule__BSubstitution__SrightAssignment_2_2 ) )
                    {
                    // InternalBSQLLog2Java.g:725:2: ( ( rule__BSubstitution__SrightAssignment_2_2 ) )
                    // InternalBSQLLog2Java.g:726:3: ( rule__BSubstitution__SrightAssignment_2_2 )
                    {
                     before(grammarAccess.getBSubstitutionAccess().getSrightAssignment_2_2()); 
                    // InternalBSQLLog2Java.g:727:3: ( rule__BSubstitution__SrightAssignment_2_2 )
                    // InternalBSQLLog2Java.g:727:4: rule__BSubstitution__SrightAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSubstitution__SrightAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBSubstitutionAccess().getSrightAssignment_2_2()); 

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
    // $ANTLR end "rule__BSubstitution__Alternatives_2"


    // $ANTLR start "rule__BUnion__Alternatives_2"
    // InternalBSQLLog2Java.g:735:1: rule__BUnion__Alternatives_2 : ( ( ( rule__BUnion__AddedSetAssignment_2_0 ) ) | ( ( rule__BUnion__AddedEAssignment_2_1 ) ) );
    public final void rule__BUnion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:739:1: ( ( ( rule__BUnion__AddedSetAssignment_2_0 ) ) | ( ( rule__BUnion__AddedEAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBSQLLog2Java.g:740:2: ( ( rule__BUnion__AddedSetAssignment_2_0 ) )
                    {
                    // InternalBSQLLog2Java.g:740:2: ( ( rule__BUnion__AddedSetAssignment_2_0 ) )
                    // InternalBSQLLog2Java.g:741:3: ( rule__BUnion__AddedSetAssignment_2_0 )
                    {
                     before(grammarAccess.getBUnionAccess().getAddedSetAssignment_2_0()); 
                    // InternalBSQLLog2Java.g:742:3: ( rule__BUnion__AddedSetAssignment_2_0 )
                    // InternalBSQLLog2Java.g:742:4: rule__BUnion__AddedSetAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BUnion__AddedSetAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBUnionAccess().getAddedSetAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:746:2: ( ( rule__BUnion__AddedEAssignment_2_1 ) )
                    {
                    // InternalBSQLLog2Java.g:746:2: ( ( rule__BUnion__AddedEAssignment_2_1 ) )
                    // InternalBSQLLog2Java.g:747:3: ( rule__BUnion__AddedEAssignment_2_1 )
                    {
                     before(grammarAccess.getBUnionAccess().getAddedEAssignment_2_1()); 
                    // InternalBSQLLog2Java.g:748:3: ( rule__BUnion__AddedEAssignment_2_1 )
                    // InternalBSQLLog2Java.g:748:4: rule__BUnion__AddedEAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BUnion__AddedEAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBUnionAccess().getAddedEAssignment_2_1()); 

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
    // $ANTLR end "rule__BUnion__Alternatives_2"


    // $ANTLR start "rule__BSQLMachine__Group__0"
    // InternalBSQLLog2Java.g:756:1: rule__BSQLMachine__Group__0 : rule__BSQLMachine__Group__0__Impl rule__BSQLMachine__Group__1 ;
    public final void rule__BSQLMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:760:1: ( rule__BSQLMachine__Group__0__Impl rule__BSQLMachine__Group__1 )
            // InternalBSQLLog2Java.g:761:2: rule__BSQLMachine__Group__0__Impl rule__BSQLMachine__Group__1
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
    // InternalBSQLLog2Java.g:768:1: rule__BSQLMachine__Group__0__Impl : ( 'MACHINE' ) ;
    public final void rule__BSQLMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:772:1: ( ( 'MACHINE' ) )
            // InternalBSQLLog2Java.g:773:1: ( 'MACHINE' )
            {
            // InternalBSQLLog2Java.g:773:1: ( 'MACHINE' )
            // InternalBSQLLog2Java.g:774:2: 'MACHINE'
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
    // InternalBSQLLog2Java.g:783:1: rule__BSQLMachine__Group__1 : rule__BSQLMachine__Group__1__Impl rule__BSQLMachine__Group__2 ;
    public final void rule__BSQLMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:787:1: ( rule__BSQLMachine__Group__1__Impl rule__BSQLMachine__Group__2 )
            // InternalBSQLLog2Java.g:788:2: rule__BSQLMachine__Group__1__Impl rule__BSQLMachine__Group__2
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
    // InternalBSQLLog2Java.g:795:1: rule__BSQLMachine__Group__1__Impl : ( ( rule__BSQLMachine__M_nameAssignment_1 ) ) ;
    public final void rule__BSQLMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:799:1: ( ( ( rule__BSQLMachine__M_nameAssignment_1 ) ) )
            // InternalBSQLLog2Java.g:800:1: ( ( rule__BSQLMachine__M_nameAssignment_1 ) )
            {
            // InternalBSQLLog2Java.g:800:1: ( ( rule__BSQLMachine__M_nameAssignment_1 ) )
            // InternalBSQLLog2Java.g:801:2: ( rule__BSQLMachine__M_nameAssignment_1 )
            {
             before(grammarAccess.getBSQLMachineAccess().getM_nameAssignment_1()); 
            // InternalBSQLLog2Java.g:802:2: ( rule__BSQLMachine__M_nameAssignment_1 )
            // InternalBSQLLog2Java.g:802:3: rule__BSQLMachine__M_nameAssignment_1
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
    // InternalBSQLLog2Java.g:810:1: rule__BSQLMachine__Group__2 : rule__BSQLMachine__Group__2__Impl rule__BSQLMachine__Group__3 ;
    public final void rule__BSQLMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:814:1: ( rule__BSQLMachine__Group__2__Impl rule__BSQLMachine__Group__3 )
            // InternalBSQLLog2Java.g:815:2: rule__BSQLMachine__Group__2__Impl rule__BSQLMachine__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSQLLog2Java.g:822:1: rule__BSQLMachine__Group__2__Impl : ( ( rule__BSQLMachine__Group_2__0 )? ) ;
    public final void rule__BSQLMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:826:1: ( ( ( rule__BSQLMachine__Group_2__0 )? ) )
            // InternalBSQLLog2Java.g:827:1: ( ( rule__BSQLMachine__Group_2__0 )? )
            {
            // InternalBSQLLog2Java.g:827:1: ( ( rule__BSQLMachine__Group_2__0 )? )
            // InternalBSQLLog2Java.g:828:2: ( rule__BSQLMachine__Group_2__0 )?
            {
             before(grammarAccess.getBSQLMachineAccess().getGroup_2()); 
            // InternalBSQLLog2Java.g:829:2: ( rule__BSQLMachine__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBSQLLog2Java.g:829:3: rule__BSQLMachine__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSQLMachine__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBSQLMachineAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:837:1: rule__BSQLMachine__Group__3 : rule__BSQLMachine__Group__3__Impl rule__BSQLMachine__Group__4 ;
    public final void rule__BSQLMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:841:1: ( rule__BSQLMachine__Group__3__Impl rule__BSQLMachine__Group__4 )
            // InternalBSQLLog2Java.g:842:2: rule__BSQLMachine__Group__3__Impl rule__BSQLMachine__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalBSQLLog2Java.g:849:1: rule__BSQLMachine__Group__3__Impl : ( 'VARIABLES' ) ;
    public final void rule__BSQLMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:853:1: ( ( 'VARIABLES' ) )
            // InternalBSQLLog2Java.g:854:1: ( 'VARIABLES' )
            {
            // InternalBSQLLog2Java.g:854:1: ( 'VARIABLES' )
            // InternalBSQLLog2Java.g:855:2: 'VARIABLES'
            {
             before(grammarAccess.getBSQLMachineAccess().getVARIABLESKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getVARIABLESKeyword_3()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:864:1: rule__BSQLMachine__Group__4 : rule__BSQLMachine__Group__4__Impl rule__BSQLMachine__Group__5 ;
    public final void rule__BSQLMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:868:1: ( rule__BSQLMachine__Group__4__Impl rule__BSQLMachine__Group__5 )
            // InternalBSQLLog2Java.g:869:2: rule__BSQLMachine__Group__4__Impl rule__BSQLMachine__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalBSQLLog2Java.g:876:1: rule__BSQLMachine__Group__4__Impl : ( ( rule__BSQLMachine__VarsAssignment_4 ) ) ;
    public final void rule__BSQLMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:880:1: ( ( ( rule__BSQLMachine__VarsAssignment_4 ) ) )
            // InternalBSQLLog2Java.g:881:1: ( ( rule__BSQLMachine__VarsAssignment_4 ) )
            {
            // InternalBSQLLog2Java.g:881:1: ( ( rule__BSQLMachine__VarsAssignment_4 ) )
            // InternalBSQLLog2Java.g:882:2: ( rule__BSQLMachine__VarsAssignment_4 )
            {
             before(grammarAccess.getBSQLMachineAccess().getVarsAssignment_4()); 
            // InternalBSQLLog2Java.g:883:2: ( rule__BSQLMachine__VarsAssignment_4 )
            // InternalBSQLLog2Java.g:883:3: rule__BSQLMachine__VarsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__VarsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getVarsAssignment_4()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:891:1: rule__BSQLMachine__Group__5 : rule__BSQLMachine__Group__5__Impl rule__BSQLMachine__Group__6 ;
    public final void rule__BSQLMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:895:1: ( rule__BSQLMachine__Group__5__Impl rule__BSQLMachine__Group__6 )
            // InternalBSQLLog2Java.g:896:2: rule__BSQLMachine__Group__5__Impl rule__BSQLMachine__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalBSQLLog2Java.g:903:1: rule__BSQLMachine__Group__5__Impl : ( 'INVARIANT' ) ;
    public final void rule__BSQLMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:907:1: ( ( 'INVARIANT' ) )
            // InternalBSQLLog2Java.g:908:1: ( 'INVARIANT' )
            {
            // InternalBSQLLog2Java.g:908:1: ( 'INVARIANT' )
            // InternalBSQLLog2Java.g:909:2: 'INVARIANT'
            {
             before(grammarAccess.getBSQLMachineAccess().getINVARIANTKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getINVARIANTKeyword_5()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:918:1: rule__BSQLMachine__Group__6 : rule__BSQLMachine__Group__6__Impl rule__BSQLMachine__Group__7 ;
    public final void rule__BSQLMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:922:1: ( rule__BSQLMachine__Group__6__Impl rule__BSQLMachine__Group__7 )
            // InternalBSQLLog2Java.g:923:2: rule__BSQLMachine__Group__6__Impl rule__BSQLMachine__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalBSQLLog2Java.g:930:1: rule__BSQLMachine__Group__6__Impl : ( ( rule__BSQLMachine__InvAssignment_6 ) ) ;
    public final void rule__BSQLMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:934:1: ( ( ( rule__BSQLMachine__InvAssignment_6 ) ) )
            // InternalBSQLLog2Java.g:935:1: ( ( rule__BSQLMachine__InvAssignment_6 ) )
            {
            // InternalBSQLLog2Java.g:935:1: ( ( rule__BSQLMachine__InvAssignment_6 ) )
            // InternalBSQLLog2Java.g:936:2: ( rule__BSQLMachine__InvAssignment_6 )
            {
             before(grammarAccess.getBSQLMachineAccess().getInvAssignment_6()); 
            // InternalBSQLLog2Java.g:937:2: ( rule__BSQLMachine__InvAssignment_6 )
            // InternalBSQLLog2Java.g:937:3: rule__BSQLMachine__InvAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__InvAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getInvAssignment_6()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:945:1: rule__BSQLMachine__Group__7 : rule__BSQLMachine__Group__7__Impl rule__BSQLMachine__Group__8 ;
    public final void rule__BSQLMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:949:1: ( rule__BSQLMachine__Group__7__Impl rule__BSQLMachine__Group__8 )
            // InternalBSQLLog2Java.g:950:2: rule__BSQLMachine__Group__7__Impl rule__BSQLMachine__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalBSQLLog2Java.g:957:1: rule__BSQLMachine__Group__7__Impl : ( 'INITIALISATION' ) ;
    public final void rule__BSQLMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:961:1: ( ( 'INITIALISATION' ) )
            // InternalBSQLLog2Java.g:962:1: ( 'INITIALISATION' )
            {
            // InternalBSQLLog2Java.g:962:1: ( 'INITIALISATION' )
            // InternalBSQLLog2Java.g:963:2: 'INITIALISATION'
            {
             before(grammarAccess.getBSQLMachineAccess().getINITIALISATIONKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getINITIALISATIONKeyword_7()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:972:1: rule__BSQLMachine__Group__8 : rule__BSQLMachine__Group__8__Impl rule__BSQLMachine__Group__9 ;
    public final void rule__BSQLMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:976:1: ( rule__BSQLMachine__Group__8__Impl rule__BSQLMachine__Group__9 )
            // InternalBSQLLog2Java.g:977:2: rule__BSQLMachine__Group__8__Impl rule__BSQLMachine__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalBSQLLog2Java.g:984:1: rule__BSQLMachine__Group__8__Impl : ( ( rule__BSQLMachine__InitAssignment_8 ) ) ;
    public final void rule__BSQLMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:988:1: ( ( ( rule__BSQLMachine__InitAssignment_8 ) ) )
            // InternalBSQLLog2Java.g:989:1: ( ( rule__BSQLMachine__InitAssignment_8 ) )
            {
            // InternalBSQLLog2Java.g:989:1: ( ( rule__BSQLMachine__InitAssignment_8 ) )
            // InternalBSQLLog2Java.g:990:2: ( rule__BSQLMachine__InitAssignment_8 )
            {
             before(grammarAccess.getBSQLMachineAccess().getInitAssignment_8()); 
            // InternalBSQLLog2Java.g:991:2: ( rule__BSQLMachine__InitAssignment_8 )
            // InternalBSQLLog2Java.g:991:3: rule__BSQLMachine__InitAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__InitAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getInitAssignment_8()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:999:1: rule__BSQLMachine__Group__9 : rule__BSQLMachine__Group__9__Impl rule__BSQLMachine__Group__10 ;
    public final void rule__BSQLMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1003:1: ( rule__BSQLMachine__Group__9__Impl rule__BSQLMachine__Group__10 )
            // InternalBSQLLog2Java.g:1004:2: rule__BSQLMachine__Group__9__Impl rule__BSQLMachine__Group__10
            {
            pushFollow(FOLLOW_8);
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
    // InternalBSQLLog2Java.g:1011:1: rule__BSQLMachine__Group__9__Impl : ( ':=' ) ;
    public final void rule__BSQLMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1015:1: ( ( ':=' ) )
            // InternalBSQLLog2Java.g:1016:1: ( ':=' )
            {
            // InternalBSQLLog2Java.g:1016:1: ( ':=' )
            // InternalBSQLLog2Java.g:1017:2: ':='
            {
             before(grammarAccess.getBSQLMachineAccess().getColonEqualsSignKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getColonEqualsSignKeyword_9()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:1026:1: rule__BSQLMachine__Group__10 : rule__BSQLMachine__Group__10__Impl rule__BSQLMachine__Group__11 ;
    public final void rule__BSQLMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1030:1: ( rule__BSQLMachine__Group__10__Impl rule__BSQLMachine__Group__11 )
            // InternalBSQLLog2Java.g:1031:2: rule__BSQLMachine__Group__10__Impl rule__BSQLMachine__Group__11
            {
            pushFollow(FOLLOW_9);
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
    // InternalBSQLLog2Java.g:1038:1: rule__BSQLMachine__Group__10__Impl : ( '{}' ) ;
    public final void rule__BSQLMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1042:1: ( ( '{}' ) )
            // InternalBSQLLog2Java.g:1043:1: ( '{}' )
            {
            // InternalBSQLLog2Java.g:1043:1: ( '{}' )
            // InternalBSQLLog2Java.g:1044:2: '{}'
            {
             before(grammarAccess.getBSQLMachineAccess().getLeftCurlyBracketRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getLeftCurlyBracketRightCurlyBracketKeyword_10()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:1053:1: rule__BSQLMachine__Group__11 : rule__BSQLMachine__Group__11__Impl rule__BSQLMachine__Group__12 ;
    public final void rule__BSQLMachine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1057:1: ( rule__BSQLMachine__Group__11__Impl rule__BSQLMachine__Group__12 )
            // InternalBSQLLog2Java.g:1058:2: rule__BSQLMachine__Group__11__Impl rule__BSQLMachine__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__BSQLMachine__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__12();

            state._fsp--;


            }

        }
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
    // InternalBSQLLog2Java.g:1065:1: rule__BSQLMachine__Group__11__Impl : ( 'OPERATIONS' ) ;
    public final void rule__BSQLMachine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1069:1: ( ( 'OPERATIONS' ) )
            // InternalBSQLLog2Java.g:1070:1: ( 'OPERATIONS' )
            {
            // InternalBSQLLog2Java.g:1070:1: ( 'OPERATIONS' )
            // InternalBSQLLog2Java.g:1071:2: 'OPERATIONS'
            {
             before(grammarAccess.getBSQLMachineAccess().getOPERATIONSKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getOPERATIONSKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__BSQLMachine__Group__12"
    // InternalBSQLLog2Java.g:1080:1: rule__BSQLMachine__Group__12 : rule__BSQLMachine__Group__12__Impl rule__BSQLMachine__Group__13 ;
    public final void rule__BSQLMachine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1084:1: ( rule__BSQLMachine__Group__12__Impl rule__BSQLMachine__Group__13 )
            // InternalBSQLLog2Java.g:1085:2: rule__BSQLMachine__Group__12__Impl rule__BSQLMachine__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__BSQLMachine__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__12"


    // $ANTLR start "rule__BSQLMachine__Group__12__Impl"
    // InternalBSQLLog2Java.g:1092:1: rule__BSQLMachine__Group__12__Impl : ( ( rule__BSQLMachine__BopsAssignment_12 ) ) ;
    public final void rule__BSQLMachine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1096:1: ( ( ( rule__BSQLMachine__BopsAssignment_12 ) ) )
            // InternalBSQLLog2Java.g:1097:1: ( ( rule__BSQLMachine__BopsAssignment_12 ) )
            {
            // InternalBSQLLog2Java.g:1097:1: ( ( rule__BSQLMachine__BopsAssignment_12 ) )
            // InternalBSQLLog2Java.g:1098:2: ( rule__BSQLMachine__BopsAssignment_12 )
            {
             before(grammarAccess.getBSQLMachineAccess().getBopsAssignment_12()); 
            // InternalBSQLLog2Java.g:1099:2: ( rule__BSQLMachine__BopsAssignment_12 )
            // InternalBSQLLog2Java.g:1099:3: rule__BSQLMachine__BopsAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__BopsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getBopsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__12__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__13"
    // InternalBSQLLog2Java.g:1107:1: rule__BSQLMachine__Group__13 : rule__BSQLMachine__Group__13__Impl rule__BSQLMachine__Group__14 ;
    public final void rule__BSQLMachine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1111:1: ( rule__BSQLMachine__Group__13__Impl rule__BSQLMachine__Group__14 )
            // InternalBSQLLog2Java.g:1112:2: rule__BSQLMachine__Group__13__Impl rule__BSQLMachine__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__BSQLMachine__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__13"


    // $ANTLR start "rule__BSQLMachine__Group__13__Impl"
    // InternalBSQLLog2Java.g:1119:1: rule__BSQLMachine__Group__13__Impl : ( ( rule__BSQLMachine__Group_13__0 )* ) ;
    public final void rule__BSQLMachine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1123:1: ( ( ( rule__BSQLMachine__Group_13__0 )* ) )
            // InternalBSQLLog2Java.g:1124:1: ( ( rule__BSQLMachine__Group_13__0 )* )
            {
            // InternalBSQLLog2Java.g:1124:1: ( ( rule__BSQLMachine__Group_13__0 )* )
            // InternalBSQLLog2Java.g:1125:2: ( rule__BSQLMachine__Group_13__0 )*
            {
             before(grammarAccess.getBSQLMachineAccess().getGroup_13()); 
            // InternalBSQLLog2Java.g:1126:2: ( rule__BSQLMachine__Group_13__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1126:3: rule__BSQLMachine__Group_13__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BSQLMachine__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBSQLMachineAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__13__Impl"


    // $ANTLR start "rule__BSQLMachine__Group__14"
    // InternalBSQLLog2Java.g:1134:1: rule__BSQLMachine__Group__14 : rule__BSQLMachine__Group__14__Impl ;
    public final void rule__BSQLMachine__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1138:1: ( rule__BSQLMachine__Group__14__Impl )
            // InternalBSQLLog2Java.g:1139:2: rule__BSQLMachine__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__14"


    // $ANTLR start "rule__BSQLMachine__Group__14__Impl"
    // InternalBSQLLog2Java.g:1145:1: rule__BSQLMachine__Group__14__Impl : ( 'END' ) ;
    public final void rule__BSQLMachine__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1149:1: ( ( 'END' ) )
            // InternalBSQLLog2Java.g:1150:1: ( 'END' )
            {
            // InternalBSQLLog2Java.g:1150:1: ( 'END' )
            // InternalBSQLLog2Java.g:1151:2: 'END'
            {
             before(grammarAccess.getBSQLMachineAccess().getENDKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getENDKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group__14__Impl"


    // $ANTLR start "rule__BSQLMachine__Group_2__0"
    // InternalBSQLLog2Java.g:1161:1: rule__BSQLMachine__Group_2__0 : rule__BSQLMachine__Group_2__0__Impl rule__BSQLMachine__Group_2__1 ;
    public final void rule__BSQLMachine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1165:1: ( rule__BSQLMachine__Group_2__0__Impl rule__BSQLMachine__Group_2__1 )
            // InternalBSQLLog2Java.g:1166:2: rule__BSQLMachine__Group_2__0__Impl rule__BSQLMachine__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__BSQLMachine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2__0"


    // $ANTLR start "rule__BSQLMachine__Group_2__0__Impl"
    // InternalBSQLLog2Java.g:1173:1: rule__BSQLMachine__Group_2__0__Impl : ( 'SEES' ) ;
    public final void rule__BSQLMachine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1177:1: ( ( 'SEES' ) )
            // InternalBSQLLog2Java.g:1178:1: ( 'SEES' )
            {
            // InternalBSQLLog2Java.g:1178:1: ( 'SEES' )
            // InternalBSQLLog2Java.g:1179:2: 'SEES'
            {
             before(grammarAccess.getBSQLMachineAccess().getSEESKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getSEESKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2__0__Impl"


    // $ANTLR start "rule__BSQLMachine__Group_2__1"
    // InternalBSQLLog2Java.g:1188:1: rule__BSQLMachine__Group_2__1 : rule__BSQLMachine__Group_2__1__Impl rule__BSQLMachine__Group_2__2 ;
    public final void rule__BSQLMachine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1192:1: ( rule__BSQLMachine__Group_2__1__Impl rule__BSQLMachine__Group_2__2 )
            // InternalBSQLLog2Java.g:1193:2: rule__BSQLMachine__Group_2__1__Impl rule__BSQLMachine__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__BSQLMachine__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2__1"


    // $ANTLR start "rule__BSQLMachine__Group_2__1__Impl"
    // InternalBSQLLog2Java.g:1200:1: rule__BSQLMachine__Group_2__1__Impl : ( ( rule__BSQLMachine__SeenameAssignment_2_1 ) ) ;
    public final void rule__BSQLMachine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1204:1: ( ( ( rule__BSQLMachine__SeenameAssignment_2_1 ) ) )
            // InternalBSQLLog2Java.g:1205:1: ( ( rule__BSQLMachine__SeenameAssignment_2_1 ) )
            {
            // InternalBSQLLog2Java.g:1205:1: ( ( rule__BSQLMachine__SeenameAssignment_2_1 ) )
            // InternalBSQLLog2Java.g:1206:2: ( rule__BSQLMachine__SeenameAssignment_2_1 )
            {
             before(grammarAccess.getBSQLMachineAccess().getSeenameAssignment_2_1()); 
            // InternalBSQLLog2Java.g:1207:2: ( rule__BSQLMachine__SeenameAssignment_2_1 )
            // InternalBSQLLog2Java.g:1207:3: rule__BSQLMachine__SeenameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__SeenameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getSeenameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2__1__Impl"


    // $ANTLR start "rule__BSQLMachine__Group_2__2"
    // InternalBSQLLog2Java.g:1215:1: rule__BSQLMachine__Group_2__2 : rule__BSQLMachine__Group_2__2__Impl ;
    public final void rule__BSQLMachine__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1219:1: ( rule__BSQLMachine__Group_2__2__Impl )
            // InternalBSQLLog2Java.g:1220:2: rule__BSQLMachine__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2__2"


    // $ANTLR start "rule__BSQLMachine__Group_2__2__Impl"
    // InternalBSQLLog2Java.g:1226:1: rule__BSQLMachine__Group_2__2__Impl : ( ( rule__BSQLMachine__Group_2_2__0 )* ) ;
    public final void rule__BSQLMachine__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1230:1: ( ( ( rule__BSQLMachine__Group_2_2__0 )* ) )
            // InternalBSQLLog2Java.g:1231:1: ( ( rule__BSQLMachine__Group_2_2__0 )* )
            {
            // InternalBSQLLog2Java.g:1231:1: ( ( rule__BSQLMachine__Group_2_2__0 )* )
            // InternalBSQLLog2Java.g:1232:2: ( rule__BSQLMachine__Group_2_2__0 )*
            {
             before(grammarAccess.getBSQLMachineAccess().getGroup_2_2()); 
            // InternalBSQLLog2Java.g:1233:2: ( rule__BSQLMachine__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1233:3: rule__BSQLMachine__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BSQLMachine__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBSQLMachineAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2__2__Impl"


    // $ANTLR start "rule__BSQLMachine__Group_2_2__0"
    // InternalBSQLLog2Java.g:1242:1: rule__BSQLMachine__Group_2_2__0 : rule__BSQLMachine__Group_2_2__0__Impl rule__BSQLMachine__Group_2_2__1 ;
    public final void rule__BSQLMachine__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1246:1: ( rule__BSQLMachine__Group_2_2__0__Impl rule__BSQLMachine__Group_2_2__1 )
            // InternalBSQLLog2Java.g:1247:2: rule__BSQLMachine__Group_2_2__0__Impl rule__BSQLMachine__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__BSQLMachine__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2_2__0"


    // $ANTLR start "rule__BSQLMachine__Group_2_2__0__Impl"
    // InternalBSQLLog2Java.g:1254:1: rule__BSQLMachine__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__BSQLMachine__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1258:1: ( ( ',' ) )
            // InternalBSQLLog2Java.g:1259:1: ( ',' )
            {
            // InternalBSQLLog2Java.g:1259:1: ( ',' )
            // InternalBSQLLog2Java.g:1260:2: ','
            {
             before(grammarAccess.getBSQLMachineAccess().getCommaKeyword_2_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2_2__0__Impl"


    // $ANTLR start "rule__BSQLMachine__Group_2_2__1"
    // InternalBSQLLog2Java.g:1269:1: rule__BSQLMachine__Group_2_2__1 : rule__BSQLMachine__Group_2_2__1__Impl ;
    public final void rule__BSQLMachine__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1273:1: ( rule__BSQLMachine__Group_2_2__1__Impl )
            // InternalBSQLLog2Java.g:1274:2: rule__BSQLMachine__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2_2__1"


    // $ANTLR start "rule__BSQLMachine__Group_2_2__1__Impl"
    // InternalBSQLLog2Java.g:1280:1: rule__BSQLMachine__Group_2_2__1__Impl : ( ( rule__BSQLMachine__SeenameAssignment_2_2_1 ) ) ;
    public final void rule__BSQLMachine__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1284:1: ( ( ( rule__BSQLMachine__SeenameAssignment_2_2_1 ) ) )
            // InternalBSQLLog2Java.g:1285:1: ( ( rule__BSQLMachine__SeenameAssignment_2_2_1 ) )
            {
            // InternalBSQLLog2Java.g:1285:1: ( ( rule__BSQLMachine__SeenameAssignment_2_2_1 ) )
            // InternalBSQLLog2Java.g:1286:2: ( rule__BSQLMachine__SeenameAssignment_2_2_1 )
            {
             before(grammarAccess.getBSQLMachineAccess().getSeenameAssignment_2_2_1()); 
            // InternalBSQLLog2Java.g:1287:2: ( rule__BSQLMachine__SeenameAssignment_2_2_1 )
            // InternalBSQLLog2Java.g:1287:3: rule__BSQLMachine__SeenameAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__SeenameAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getSeenameAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_2_2__1__Impl"


    // $ANTLR start "rule__BSQLMachine__Group_13__0"
    // InternalBSQLLog2Java.g:1296:1: rule__BSQLMachine__Group_13__0 : rule__BSQLMachine__Group_13__0__Impl rule__BSQLMachine__Group_13__1 ;
    public final void rule__BSQLMachine__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1300:1: ( rule__BSQLMachine__Group_13__0__Impl rule__BSQLMachine__Group_13__1 )
            // InternalBSQLLog2Java.g:1301:2: rule__BSQLMachine__Group_13__0__Impl rule__BSQLMachine__Group_13__1
            {
            pushFollow(FOLLOW_3);
            rule__BSQLMachine__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_13__0"


    // $ANTLR start "rule__BSQLMachine__Group_13__0__Impl"
    // InternalBSQLLog2Java.g:1308:1: rule__BSQLMachine__Group_13__0__Impl : ( ';' ) ;
    public final void rule__BSQLMachine__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1312:1: ( ( ';' ) )
            // InternalBSQLLog2Java.g:1313:1: ( ';' )
            {
            // InternalBSQLLog2Java.g:1313:1: ( ';' )
            // InternalBSQLLog2Java.g:1314:2: ';'
            {
             before(grammarAccess.getBSQLMachineAccess().getSemicolonKeyword_13_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getSemicolonKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_13__0__Impl"


    // $ANTLR start "rule__BSQLMachine__Group_13__1"
    // InternalBSQLLog2Java.g:1323:1: rule__BSQLMachine__Group_13__1 : rule__BSQLMachine__Group_13__1__Impl ;
    public final void rule__BSQLMachine__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1327:1: ( rule__BSQLMachine__Group_13__1__Impl )
            // InternalBSQLLog2Java.g:1328:2: rule__BSQLMachine__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_13__1"


    // $ANTLR start "rule__BSQLMachine__Group_13__1__Impl"
    // InternalBSQLLog2Java.g:1334:1: rule__BSQLMachine__Group_13__1__Impl : ( ( rule__BSQLMachine__BopsAssignment_13_1 ) ) ;
    public final void rule__BSQLMachine__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1338:1: ( ( ( rule__BSQLMachine__BopsAssignment_13_1 ) ) )
            // InternalBSQLLog2Java.g:1339:1: ( ( rule__BSQLMachine__BopsAssignment_13_1 ) )
            {
            // InternalBSQLLog2Java.g:1339:1: ( ( rule__BSQLMachine__BopsAssignment_13_1 ) )
            // InternalBSQLLog2Java.g:1340:2: ( rule__BSQLMachine__BopsAssignment_13_1 )
            {
             before(grammarAccess.getBSQLMachineAccess().getBopsAssignment_13_1()); 
            // InternalBSQLLog2Java.g:1341:2: ( rule__BSQLMachine__BopsAssignment_13_1 )
            // InternalBSQLLog2Java.g:1341:3: rule__BSQLMachine__BopsAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__BSQLMachine__BopsAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getBSQLMachineAccess().getBopsAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__Group_13__1__Impl"


    // $ANTLR start "rule__BTable__Group__0"
    // InternalBSQLLog2Java.g:1350:1: rule__BTable__Group__0 : rule__BTable__Group__0__Impl rule__BTable__Group__1 ;
    public final void rule__BTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1354:1: ( rule__BTable__Group__0__Impl rule__BTable__Group__1 )
            // InternalBSQLLog2Java.g:1355:2: rule__BTable__Group__0__Impl rule__BTable__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBSQLLog2Java.g:1362:1: rule__BTable__Group__0__Impl : ( ( rule__BTable__Table_nameAssignment_0 ) ) ;
    public final void rule__BTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1366:1: ( ( ( rule__BTable__Table_nameAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:1367:1: ( ( rule__BTable__Table_nameAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:1367:1: ( ( rule__BTable__Table_nameAssignment_0 ) )
            // InternalBSQLLog2Java.g:1368:2: ( rule__BTable__Table_nameAssignment_0 )
            {
             before(grammarAccess.getBTableAccess().getTable_nameAssignment_0()); 
            // InternalBSQLLog2Java.g:1369:2: ( rule__BTable__Table_nameAssignment_0 )
            // InternalBSQLLog2Java.g:1369:3: rule__BTable__Table_nameAssignment_0
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
    // InternalBSQLLog2Java.g:1377:1: rule__BTable__Group__1 : rule__BTable__Group__1__Impl rule__BTable__Group__2 ;
    public final void rule__BTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1381:1: ( rule__BTable__Group__1__Impl rule__BTable__Group__2 )
            // InternalBSQLLog2Java.g:1382:2: rule__BTable__Group__1__Impl rule__BTable__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBSQLLog2Java.g:1389:1: rule__BTable__Group__1__Impl : ( '<:' ) ;
    public final void rule__BTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1393:1: ( ( '<:' ) )
            // InternalBSQLLog2Java.g:1394:1: ( '<:' )
            {
            // InternalBSQLLog2Java.g:1394:1: ( '<:' )
            // InternalBSQLLog2Java.g:1395:2: '<:'
            {
             before(grammarAccess.getBTableAccess().getLessThanSignColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1404:1: rule__BTable__Group__2 : rule__BTable__Group__2__Impl rule__BTable__Group__3 ;
    public final void rule__BTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1408:1: ( rule__BTable__Group__2__Impl rule__BTable__Group__3 )
            // InternalBSQLLog2Java.g:1409:2: rule__BTable__Group__2__Impl rule__BTable__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalBSQLLog2Java.g:1416:1: rule__BTable__Group__2__Impl : ( 'struct' ) ;
    public final void rule__BTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1420:1: ( ( 'struct' ) )
            // InternalBSQLLog2Java.g:1421:1: ( 'struct' )
            {
            // InternalBSQLLog2Java.g:1421:1: ( 'struct' )
            // InternalBSQLLog2Java.g:1422:2: 'struct'
            {
             before(grammarAccess.getBTableAccess().getStructKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1431:1: rule__BTable__Group__3 : rule__BTable__Group__3__Impl rule__BTable__Group__4 ;
    public final void rule__BTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1435:1: ( rule__BTable__Group__3__Impl rule__BTable__Group__4 )
            // InternalBSQLLog2Java.g:1436:2: rule__BTable__Group__3__Impl rule__BTable__Group__4
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
    // InternalBSQLLog2Java.g:1443:1: rule__BTable__Group__3__Impl : ( '(' ) ;
    public final void rule__BTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1447:1: ( ( '(' ) )
            // InternalBSQLLog2Java.g:1448:1: ( '(' )
            {
            // InternalBSQLLog2Java.g:1448:1: ( '(' )
            // InternalBSQLLog2Java.g:1449:2: '('
            {
             before(grammarAccess.getBTableAccess().getLeftParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1458:1: rule__BTable__Group__4 : rule__BTable__Group__4__Impl rule__BTable__Group__5 ;
    public final void rule__BTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1462:1: ( rule__BTable__Group__4__Impl rule__BTable__Group__5 )
            // InternalBSQLLog2Java.g:1463:2: rule__BTable__Group__4__Impl rule__BTable__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalBSQLLog2Java.g:1470:1: rule__BTable__Group__4__Impl : ( ( rule__BTable__AttributesAssignment_4 ) ) ;
    public final void rule__BTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1474:1: ( ( ( rule__BTable__AttributesAssignment_4 ) ) )
            // InternalBSQLLog2Java.g:1475:1: ( ( rule__BTable__AttributesAssignment_4 ) )
            {
            // InternalBSQLLog2Java.g:1475:1: ( ( rule__BTable__AttributesAssignment_4 ) )
            // InternalBSQLLog2Java.g:1476:2: ( rule__BTable__AttributesAssignment_4 )
            {
             before(grammarAccess.getBTableAccess().getAttributesAssignment_4()); 
            // InternalBSQLLog2Java.g:1477:2: ( rule__BTable__AttributesAssignment_4 )
            // InternalBSQLLog2Java.g:1477:3: rule__BTable__AttributesAssignment_4
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
    // InternalBSQLLog2Java.g:1485:1: rule__BTable__Group__5 : rule__BTable__Group__5__Impl rule__BTable__Group__6 ;
    public final void rule__BTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1489:1: ( rule__BTable__Group__5__Impl rule__BTable__Group__6 )
            // InternalBSQLLog2Java.g:1490:2: rule__BTable__Group__5__Impl rule__BTable__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalBSQLLog2Java.g:1497:1: rule__BTable__Group__5__Impl : ( ( rule__BTable__Group_5__0 )* ) ;
    public final void rule__BTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1501:1: ( ( ( rule__BTable__Group_5__0 )* ) )
            // InternalBSQLLog2Java.g:1502:1: ( ( rule__BTable__Group_5__0 )* )
            {
            // InternalBSQLLog2Java.g:1502:1: ( ( rule__BTable__Group_5__0 )* )
            // InternalBSQLLog2Java.g:1503:2: ( rule__BTable__Group_5__0 )*
            {
             before(grammarAccess.getBTableAccess().getGroup_5()); 
            // InternalBSQLLog2Java.g:1504:2: ( rule__BTable__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1504:3: rule__BTable__Group_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BTable__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalBSQLLog2Java.g:1512:1: rule__BTable__Group__6 : rule__BTable__Group__6__Impl ;
    public final void rule__BTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1516:1: ( rule__BTable__Group__6__Impl )
            // InternalBSQLLog2Java.g:1517:2: rule__BTable__Group__6__Impl
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
    // InternalBSQLLog2Java.g:1523:1: rule__BTable__Group__6__Impl : ( ')' ) ;
    public final void rule__BTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1527:1: ( ( ')' ) )
            // InternalBSQLLog2Java.g:1528:1: ( ')' )
            {
            // InternalBSQLLog2Java.g:1528:1: ( ')' )
            // InternalBSQLLog2Java.g:1529:2: ')'
            {
             before(grammarAccess.getBTableAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1539:1: rule__BTable__Group_5__0 : rule__BTable__Group_5__0__Impl rule__BTable__Group_5__1 ;
    public final void rule__BTable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1543:1: ( rule__BTable__Group_5__0__Impl rule__BTable__Group_5__1 )
            // InternalBSQLLog2Java.g:1544:2: rule__BTable__Group_5__0__Impl rule__BTable__Group_5__1
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
    // InternalBSQLLog2Java.g:1551:1: rule__BTable__Group_5__0__Impl : ( ',' ) ;
    public final void rule__BTable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1555:1: ( ( ',' ) )
            // InternalBSQLLog2Java.g:1556:1: ( ',' )
            {
            // InternalBSQLLog2Java.g:1556:1: ( ',' )
            // InternalBSQLLog2Java.g:1557:2: ','
            {
             before(grammarAccess.getBTableAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1566:1: rule__BTable__Group_5__1 : rule__BTable__Group_5__1__Impl ;
    public final void rule__BTable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1570:1: ( rule__BTable__Group_5__1__Impl )
            // InternalBSQLLog2Java.g:1571:2: rule__BTable__Group_5__1__Impl
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
    // InternalBSQLLog2Java.g:1577:1: rule__BTable__Group_5__1__Impl : ( ( rule__BTable__AttributesAssignment_5_1 ) ) ;
    public final void rule__BTable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1581:1: ( ( ( rule__BTable__AttributesAssignment_5_1 ) ) )
            // InternalBSQLLog2Java.g:1582:1: ( ( rule__BTable__AttributesAssignment_5_1 ) )
            {
            // InternalBSQLLog2Java.g:1582:1: ( ( rule__BTable__AttributesAssignment_5_1 ) )
            // InternalBSQLLog2Java.g:1583:2: ( rule__BTable__AttributesAssignment_5_1 )
            {
             before(grammarAccess.getBTableAccess().getAttributesAssignment_5_1()); 
            // InternalBSQLLog2Java.g:1584:2: ( rule__BTable__AttributesAssignment_5_1 )
            // InternalBSQLLog2Java.g:1584:3: rule__BTable__AttributesAssignment_5_1
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
    // InternalBSQLLog2Java.g:1593:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1597:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalBSQLLog2Java.g:1598:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBSQLLog2Java.g:1605:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__Att_nameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1609:1: ( ( ( rule__Attribute__Att_nameAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:1610:1: ( ( rule__Attribute__Att_nameAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:1610:1: ( ( rule__Attribute__Att_nameAssignment_0 ) )
            // InternalBSQLLog2Java.g:1611:2: ( rule__Attribute__Att_nameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAtt_nameAssignment_0()); 
            // InternalBSQLLog2Java.g:1612:2: ( rule__Attribute__Att_nameAssignment_0 )
            // InternalBSQLLog2Java.g:1612:3: rule__Attribute__Att_nameAssignment_0
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
    // InternalBSQLLog2Java.g:1620:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1624:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalBSQLLog2Java.g:1625:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalBSQLLog2Java.g:1632:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1636:1: ( ( ':' ) )
            // InternalBSQLLog2Java.g:1637:1: ( ':' )
            {
            // InternalBSQLLog2Java.g:1637:1: ( ':' )
            // InternalBSQLLog2Java.g:1638:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1647:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1651:1: ( rule__Attribute__Group__2__Impl )
            // InternalBSQLLog2Java.g:1652:2: rule__Attribute__Group__2__Impl
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
    // InternalBSQLLog2Java.g:1658:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1662:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalBSQLLog2Java.g:1663:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalBSQLLog2Java.g:1663:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalBSQLLog2Java.g:1664:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalBSQLLog2Java.g:1665:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalBSQLLog2Java.g:1665:3: rule__Attribute__TypeAssignment_2
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
    // InternalBSQLLog2Java.g:1674:1: rule__BoolOperation__Group__0 : rule__BoolOperation__Group__0__Impl rule__BoolOperation__Group__1 ;
    public final void rule__BoolOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1678:1: ( rule__BoolOperation__Group__0__Impl rule__BoolOperation__Group__1 )
            // InternalBSQLLog2Java.g:1679:2: rule__BoolOperation__Group__0__Impl rule__BoolOperation__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSQLLog2Java.g:1686:1: rule__BoolOperation__Group__0__Impl : ( ( rule__BoolOperation__ResAssignment_0 ) ) ;
    public final void rule__BoolOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1690:1: ( ( ( rule__BoolOperation__ResAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:1691:1: ( ( rule__BoolOperation__ResAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:1691:1: ( ( rule__BoolOperation__ResAssignment_0 ) )
            // InternalBSQLLog2Java.g:1692:2: ( rule__BoolOperation__ResAssignment_0 )
            {
             before(grammarAccess.getBoolOperationAccess().getResAssignment_0()); 
            // InternalBSQLLog2Java.g:1693:2: ( rule__BoolOperation__ResAssignment_0 )
            // InternalBSQLLog2Java.g:1693:3: rule__BoolOperation__ResAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__ResAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getResAssignment_0()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:1701:1: rule__BoolOperation__Group__1 : rule__BoolOperation__Group__1__Impl rule__BoolOperation__Group__2 ;
    public final void rule__BoolOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1705:1: ( rule__BoolOperation__Group__1__Impl rule__BoolOperation__Group__2 )
            // InternalBSQLLog2Java.g:1706:2: rule__BoolOperation__Group__1__Impl rule__BoolOperation__Group__2
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
    // InternalBSQLLog2Java.g:1713:1: rule__BoolOperation__Group__1__Impl : ( '<--' ) ;
    public final void rule__BoolOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1717:1: ( ( '<--' ) )
            // InternalBSQLLog2Java.g:1718:1: ( '<--' )
            {
            // InternalBSQLLog2Java.g:1718:1: ( '<--' )
            // InternalBSQLLog2Java.g:1719:2: '<--'
            {
             before(grammarAccess.getBoolOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1728:1: rule__BoolOperation__Group__2 : rule__BoolOperation__Group__2__Impl rule__BoolOperation__Group__3 ;
    public final void rule__BoolOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1732:1: ( rule__BoolOperation__Group__2__Impl rule__BoolOperation__Group__3 )
            // InternalBSQLLog2Java.g:1733:2: rule__BoolOperation__Group__2__Impl rule__BoolOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalBSQLLog2Java.g:1740:1: rule__BoolOperation__Group__2__Impl : ( ( rule__BoolOperation__Op_nameAssignment_2 ) ) ;
    public final void rule__BoolOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1744:1: ( ( ( rule__BoolOperation__Op_nameAssignment_2 ) ) )
            // InternalBSQLLog2Java.g:1745:1: ( ( rule__BoolOperation__Op_nameAssignment_2 ) )
            {
            // InternalBSQLLog2Java.g:1745:1: ( ( rule__BoolOperation__Op_nameAssignment_2 ) )
            // InternalBSQLLog2Java.g:1746:2: ( rule__BoolOperation__Op_nameAssignment_2 )
            {
             before(grammarAccess.getBoolOperationAccess().getOp_nameAssignment_2()); 
            // InternalBSQLLog2Java.g:1747:2: ( rule__BoolOperation__Op_nameAssignment_2 )
            // InternalBSQLLog2Java.g:1747:3: rule__BoolOperation__Op_nameAssignment_2
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
    // InternalBSQLLog2Java.g:1755:1: rule__BoolOperation__Group__3 : rule__BoolOperation__Group__3__Impl rule__BoolOperation__Group__4 ;
    public final void rule__BoolOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1759:1: ( rule__BoolOperation__Group__3__Impl rule__BoolOperation__Group__4 )
            // InternalBSQLLog2Java.g:1760:2: rule__BoolOperation__Group__3__Impl rule__BoolOperation__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSQLLog2Java.g:1767:1: rule__BoolOperation__Group__3__Impl : ( '(' ) ;
    public final void rule__BoolOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1771:1: ( ( '(' ) )
            // InternalBSQLLog2Java.g:1772:1: ( '(' )
            {
            // InternalBSQLLog2Java.g:1772:1: ( '(' )
            // InternalBSQLLog2Java.g:1773:2: '('
            {
             before(grammarAccess.getBoolOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1782:1: rule__BoolOperation__Group__4 : rule__BoolOperation__Group__4__Impl rule__BoolOperation__Group__5 ;
    public final void rule__BoolOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1786:1: ( rule__BoolOperation__Group__4__Impl rule__BoolOperation__Group__5 )
            // InternalBSQLLog2Java.g:1787:2: rule__BoolOperation__Group__4__Impl rule__BoolOperation__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSQLLog2Java.g:1794:1: rule__BoolOperation__Group__4__Impl : ( ( rule__BoolOperation__Group_4__0 )? ) ;
    public final void rule__BoolOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1798:1: ( ( ( rule__BoolOperation__Group_4__0 )? ) )
            // InternalBSQLLog2Java.g:1799:1: ( ( rule__BoolOperation__Group_4__0 )? )
            {
            // InternalBSQLLog2Java.g:1799:1: ( ( rule__BoolOperation__Group_4__0 )? )
            // InternalBSQLLog2Java.g:1800:2: ( rule__BoolOperation__Group_4__0 )?
            {
             before(grammarAccess.getBoolOperationAccess().getGroup_4()); 
            // InternalBSQLLog2Java.g:1801:2: ( rule__BoolOperation__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBSQLLog2Java.g:1801:3: rule__BoolOperation__Group_4__0
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
    // InternalBSQLLog2Java.g:1809:1: rule__BoolOperation__Group__5 : rule__BoolOperation__Group__5__Impl rule__BoolOperation__Group__6 ;
    public final void rule__BoolOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1813:1: ( rule__BoolOperation__Group__5__Impl rule__BoolOperation__Group__6 )
            // InternalBSQLLog2Java.g:1814:2: rule__BoolOperation__Group__5__Impl rule__BoolOperation__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalBSQLLog2Java.g:1821:1: rule__BoolOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__BoolOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1825:1: ( ( ')' ) )
            // InternalBSQLLog2Java.g:1826:1: ( ')' )
            {
            // InternalBSQLLog2Java.g:1826:1: ( ')' )
            // InternalBSQLLog2Java.g:1827:2: ')'
            {
             before(grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1836:1: rule__BoolOperation__Group__6 : rule__BoolOperation__Group__6__Impl rule__BoolOperation__Group__7 ;
    public final void rule__BoolOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1840:1: ( rule__BoolOperation__Group__6__Impl rule__BoolOperation__Group__7 )
            // InternalBSQLLog2Java.g:1841:2: rule__BoolOperation__Group__6__Impl rule__BoolOperation__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSQLLog2Java.g:1848:1: rule__BoolOperation__Group__6__Impl : ( '=' ) ;
    public final void rule__BoolOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1852:1: ( ( '=' ) )
            // InternalBSQLLog2Java.g:1853:1: ( '=' )
            {
            // InternalBSQLLog2Java.g:1853:1: ( '=' )
            // InternalBSQLLog2Java.g:1854:2: '='
            {
             before(grammarAccess.getBoolOperationAccess().getEqualsSignKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1863:1: rule__BoolOperation__Group__7 : rule__BoolOperation__Group__7__Impl rule__BoolOperation__Group__8 ;
    public final void rule__BoolOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1867:1: ( rule__BoolOperation__Group__7__Impl rule__BoolOperation__Group__8 )
            // InternalBSQLLog2Java.g:1868:2: rule__BoolOperation__Group__7__Impl rule__BoolOperation__Group__8
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
    // InternalBSQLLog2Java.g:1875:1: rule__BoolOperation__Group__7__Impl : ( 'PRE' ) ;
    public final void rule__BoolOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1879:1: ( ( 'PRE' ) )
            // InternalBSQLLog2Java.g:1880:1: ( 'PRE' )
            {
            // InternalBSQLLog2Java.g:1880:1: ( 'PRE' )
            // InternalBSQLLog2Java.g:1881:2: 'PRE'
            {
             before(grammarAccess.getBoolOperationAccess().getPREKeyword_7()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1890:1: rule__BoolOperation__Group__8 : rule__BoolOperation__Group__8__Impl rule__BoolOperation__Group__9 ;
    public final void rule__BoolOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1894:1: ( rule__BoolOperation__Group__8__Impl rule__BoolOperation__Group__9 )
            // InternalBSQLLog2Java.g:1895:2: rule__BoolOperation__Group__8__Impl rule__BoolOperation__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalBSQLLog2Java.g:1902:1: rule__BoolOperation__Group__8__Impl : ( ( rule__BoolOperation__Group_8__0 ) ) ;
    public final void rule__BoolOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1906:1: ( ( ( rule__BoolOperation__Group_8__0 ) ) )
            // InternalBSQLLog2Java.g:1907:1: ( ( rule__BoolOperation__Group_8__0 ) )
            {
            // InternalBSQLLog2Java.g:1907:1: ( ( rule__BoolOperation__Group_8__0 ) )
            // InternalBSQLLog2Java.g:1908:2: ( rule__BoolOperation__Group_8__0 )
            {
             before(grammarAccess.getBoolOperationAccess().getGroup_8()); 
            // InternalBSQLLog2Java.g:1909:2: ( rule__BoolOperation__Group_8__0 )
            // InternalBSQLLog2Java.g:1909:3: rule__BoolOperation__Group_8__0
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
    // InternalBSQLLog2Java.g:1917:1: rule__BoolOperation__Group__9 : rule__BoolOperation__Group__9__Impl rule__BoolOperation__Group__10 ;
    public final void rule__BoolOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1921:1: ( rule__BoolOperation__Group__9__Impl rule__BoolOperation__Group__10 )
            // InternalBSQLLog2Java.g:1922:2: rule__BoolOperation__Group__9__Impl rule__BoolOperation__Group__10
            {
            pushFollow(FOLLOW_3);
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
    // InternalBSQLLog2Java.g:1929:1: rule__BoolOperation__Group__9__Impl : ( 'THEN' ) ;
    public final void rule__BoolOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1933:1: ( ( 'THEN' ) )
            // InternalBSQLLog2Java.g:1934:1: ( 'THEN' )
            {
            // InternalBSQLLog2Java.g:1934:1: ( 'THEN' )
            // InternalBSQLLog2Java.g:1935:2: 'THEN'
            {
             before(grammarAccess.getBoolOperationAccess().getTHENKeyword_9()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:1944:1: rule__BoolOperation__Group__10 : rule__BoolOperation__Group__10__Impl rule__BoolOperation__Group__11 ;
    public final void rule__BoolOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1948:1: ( rule__BoolOperation__Group__10__Impl rule__BoolOperation__Group__11 )
            // InternalBSQLLog2Java.g:1949:2: rule__BoolOperation__Group__10__Impl rule__BoolOperation__Group__11
            {
            pushFollow(FOLLOW_24);
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
    // InternalBSQLLog2Java.g:1956:1: rule__BoolOperation__Group__10__Impl : ( ( rule__BoolOperation__Alternatives_10 ) ) ;
    public final void rule__BoolOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1960:1: ( ( ( rule__BoolOperation__Alternatives_10 ) ) )
            // InternalBSQLLog2Java.g:1961:1: ( ( rule__BoolOperation__Alternatives_10 ) )
            {
            // InternalBSQLLog2Java.g:1961:1: ( ( rule__BoolOperation__Alternatives_10 ) )
            // InternalBSQLLog2Java.g:1962:2: ( rule__BoolOperation__Alternatives_10 )
            {
             before(grammarAccess.getBoolOperationAccess().getAlternatives_10()); 
            // InternalBSQLLog2Java.g:1963:2: ( rule__BoolOperation__Alternatives_10 )
            // InternalBSQLLog2Java.g:1963:3: rule__BoolOperation__Alternatives_10
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Alternatives_10();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getAlternatives_10()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:1971:1: rule__BoolOperation__Group__11 : rule__BoolOperation__Group__11__Impl ;
    public final void rule__BoolOperation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1975:1: ( rule__BoolOperation__Group__11__Impl )
            // InternalBSQLLog2Java.g:1976:2: rule__BoolOperation__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Group__11__Impl();

            state._fsp--;


            }

        }
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
    // InternalBSQLLog2Java.g:1982:1: rule__BoolOperation__Group__11__Impl : ( 'END' ) ;
    public final void rule__BoolOperation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:1986:1: ( ( 'END' ) )
            // InternalBSQLLog2Java.g:1987:1: ( 'END' )
            {
            // InternalBSQLLog2Java.g:1987:1: ( 'END' )
            // InternalBSQLLog2Java.g:1988:2: 'END'
            {
             before(grammarAccess.getBoolOperationAccess().getENDKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getENDKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__BoolOperation__Group_4__0"
    // InternalBSQLLog2Java.g:1998:1: rule__BoolOperation__Group_4__0 : rule__BoolOperation__Group_4__0__Impl rule__BoolOperation__Group_4__1 ;
    public final void rule__BoolOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2002:1: ( rule__BoolOperation__Group_4__0__Impl rule__BoolOperation__Group_4__1 )
            // InternalBSQLLog2Java.g:2003:2: rule__BoolOperation__Group_4__0__Impl rule__BoolOperation__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBSQLLog2Java.g:2010:1: rule__BoolOperation__Group_4__0__Impl : ( ( rule__BoolOperation__PListAssignment_4_0 ) ) ;
    public final void rule__BoolOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2014:1: ( ( ( rule__BoolOperation__PListAssignment_4_0 ) ) )
            // InternalBSQLLog2Java.g:2015:1: ( ( rule__BoolOperation__PListAssignment_4_0 ) )
            {
            // InternalBSQLLog2Java.g:2015:1: ( ( rule__BoolOperation__PListAssignment_4_0 ) )
            // InternalBSQLLog2Java.g:2016:2: ( rule__BoolOperation__PListAssignment_4_0 )
            {
             before(grammarAccess.getBoolOperationAccess().getPListAssignment_4_0()); 
            // InternalBSQLLog2Java.g:2017:2: ( rule__BoolOperation__PListAssignment_4_0 )
            // InternalBSQLLog2Java.g:2017:3: rule__BoolOperation__PListAssignment_4_0
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
    // InternalBSQLLog2Java.g:2025:1: rule__BoolOperation__Group_4__1 : rule__BoolOperation__Group_4__1__Impl ;
    public final void rule__BoolOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2029:1: ( rule__BoolOperation__Group_4__1__Impl )
            // InternalBSQLLog2Java.g:2030:2: rule__BoolOperation__Group_4__1__Impl
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
    // InternalBSQLLog2Java.g:2036:1: rule__BoolOperation__Group_4__1__Impl : ( ( rule__BoolOperation__Group_4_1__0 )* ) ;
    public final void rule__BoolOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2040:1: ( ( ( rule__BoolOperation__Group_4_1__0 )* ) )
            // InternalBSQLLog2Java.g:2041:1: ( ( rule__BoolOperation__Group_4_1__0 )* )
            {
            // InternalBSQLLog2Java.g:2041:1: ( ( rule__BoolOperation__Group_4_1__0 )* )
            // InternalBSQLLog2Java.g:2042:2: ( rule__BoolOperation__Group_4_1__0 )*
            {
             before(grammarAccess.getBoolOperationAccess().getGroup_4_1()); 
            // InternalBSQLLog2Java.g:2043:2: ( rule__BoolOperation__Group_4_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:2043:3: rule__BoolOperation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BoolOperation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBSQLLog2Java.g:2052:1: rule__BoolOperation__Group_4_1__0 : rule__BoolOperation__Group_4_1__0__Impl rule__BoolOperation__Group_4_1__1 ;
    public final void rule__BoolOperation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2056:1: ( rule__BoolOperation__Group_4_1__0__Impl rule__BoolOperation__Group_4_1__1 )
            // InternalBSQLLog2Java.g:2057:2: rule__BoolOperation__Group_4_1__0__Impl rule__BoolOperation__Group_4_1__1
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
    // InternalBSQLLog2Java.g:2064:1: rule__BoolOperation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__BoolOperation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2068:1: ( ( ',' ) )
            // InternalBSQLLog2Java.g:2069:1: ( ',' )
            {
            // InternalBSQLLog2Java.g:2069:1: ( ',' )
            // InternalBSQLLog2Java.g:2070:2: ','
            {
             before(grammarAccess.getBoolOperationAccess().getCommaKeyword_4_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:2079:1: rule__BoolOperation__Group_4_1__1 : rule__BoolOperation__Group_4_1__1__Impl ;
    public final void rule__BoolOperation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2083:1: ( rule__BoolOperation__Group_4_1__1__Impl )
            // InternalBSQLLog2Java.g:2084:2: rule__BoolOperation__Group_4_1__1__Impl
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
    // InternalBSQLLog2Java.g:2090:1: rule__BoolOperation__Group_4_1__1__Impl : ( ( rule__BoolOperation__PListAssignment_4_1_1 ) ) ;
    public final void rule__BoolOperation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2094:1: ( ( ( rule__BoolOperation__PListAssignment_4_1_1 ) ) )
            // InternalBSQLLog2Java.g:2095:1: ( ( rule__BoolOperation__PListAssignment_4_1_1 ) )
            {
            // InternalBSQLLog2Java.g:2095:1: ( ( rule__BoolOperation__PListAssignment_4_1_1 ) )
            // InternalBSQLLog2Java.g:2096:2: ( rule__BoolOperation__PListAssignment_4_1_1 )
            {
             before(grammarAccess.getBoolOperationAccess().getPListAssignment_4_1_1()); 
            // InternalBSQLLog2Java.g:2097:2: ( rule__BoolOperation__PListAssignment_4_1_1 )
            // InternalBSQLLog2Java.g:2097:3: rule__BoolOperation__PListAssignment_4_1_1
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
    // InternalBSQLLog2Java.g:2106:1: rule__BoolOperation__Group_8__0 : rule__BoolOperation__Group_8__0__Impl rule__BoolOperation__Group_8__1 ;
    public final void rule__BoolOperation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2110:1: ( rule__BoolOperation__Group_8__0__Impl rule__BoolOperation__Group_8__1 )
            // InternalBSQLLog2Java.g:2111:2: rule__BoolOperation__Group_8__0__Impl rule__BoolOperation__Group_8__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBSQLLog2Java.g:2118:1: rule__BoolOperation__Group_8__0__Impl : ( ( rule__BoolOperation__PTypingAssignment_8_0 ) ) ;
    public final void rule__BoolOperation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2122:1: ( ( ( rule__BoolOperation__PTypingAssignment_8_0 ) ) )
            // InternalBSQLLog2Java.g:2123:1: ( ( rule__BoolOperation__PTypingAssignment_8_0 ) )
            {
            // InternalBSQLLog2Java.g:2123:1: ( ( rule__BoolOperation__PTypingAssignment_8_0 ) )
            // InternalBSQLLog2Java.g:2124:2: ( rule__BoolOperation__PTypingAssignment_8_0 )
            {
             before(grammarAccess.getBoolOperationAccess().getPTypingAssignment_8_0()); 
            // InternalBSQLLog2Java.g:2125:2: ( rule__BoolOperation__PTypingAssignment_8_0 )
            // InternalBSQLLog2Java.g:2125:3: rule__BoolOperation__PTypingAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__PTypingAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getPTypingAssignment_8_0()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:2133:1: rule__BoolOperation__Group_8__1 : rule__BoolOperation__Group_8__1__Impl ;
    public final void rule__BoolOperation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2137:1: ( rule__BoolOperation__Group_8__1__Impl )
            // InternalBSQLLog2Java.g:2138:2: rule__BoolOperation__Group_8__1__Impl
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
    // InternalBSQLLog2Java.g:2144:1: rule__BoolOperation__Group_8__1__Impl : ( ( rule__BoolOperation__Group_8_1__0 )* ) ;
    public final void rule__BoolOperation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2148:1: ( ( ( rule__BoolOperation__Group_8_1__0 )* ) )
            // InternalBSQLLog2Java.g:2149:1: ( ( rule__BoolOperation__Group_8_1__0 )* )
            {
            // InternalBSQLLog2Java.g:2149:1: ( ( rule__BoolOperation__Group_8_1__0 )* )
            // InternalBSQLLog2Java.g:2150:2: ( rule__BoolOperation__Group_8_1__0 )*
            {
             before(grammarAccess.getBoolOperationAccess().getGroup_8_1()); 
            // InternalBSQLLog2Java.g:2151:2: ( rule__BoolOperation__Group_8_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:2151:3: rule__BoolOperation__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__BoolOperation__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalBSQLLog2Java.g:2160:1: rule__BoolOperation__Group_8_1__0 : rule__BoolOperation__Group_8_1__0__Impl rule__BoolOperation__Group_8_1__1 ;
    public final void rule__BoolOperation__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2164:1: ( rule__BoolOperation__Group_8_1__0__Impl rule__BoolOperation__Group_8_1__1 )
            // InternalBSQLLog2Java.g:2165:2: rule__BoolOperation__Group_8_1__0__Impl rule__BoolOperation__Group_8_1__1
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
    // InternalBSQLLog2Java.g:2172:1: rule__BoolOperation__Group_8_1__0__Impl : ( '&' ) ;
    public final void rule__BoolOperation__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2176:1: ( ( '&' ) )
            // InternalBSQLLog2Java.g:2177:1: ( '&' )
            {
            // InternalBSQLLog2Java.g:2177:1: ( '&' )
            // InternalBSQLLog2Java.g:2178:2: '&'
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
    // InternalBSQLLog2Java.g:2187:1: rule__BoolOperation__Group_8_1__1 : rule__BoolOperation__Group_8_1__1__Impl ;
    public final void rule__BoolOperation__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2191:1: ( rule__BoolOperation__Group_8_1__1__Impl )
            // InternalBSQLLog2Java.g:2192:2: rule__BoolOperation__Group_8_1__1__Impl
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
    // InternalBSQLLog2Java.g:2198:1: rule__BoolOperation__Group_8_1__1__Impl : ( ( rule__BoolOperation__PTypingAssignment_8_1_1 ) ) ;
    public final void rule__BoolOperation__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2202:1: ( ( ( rule__BoolOperation__PTypingAssignment_8_1_1 ) ) )
            // InternalBSQLLog2Java.g:2203:1: ( ( rule__BoolOperation__PTypingAssignment_8_1_1 ) )
            {
            // InternalBSQLLog2Java.g:2203:1: ( ( rule__BoolOperation__PTypingAssignment_8_1_1 ) )
            // InternalBSQLLog2Java.g:2204:2: ( rule__BoolOperation__PTypingAssignment_8_1_1 )
            {
             before(grammarAccess.getBoolOperationAccess().getPTypingAssignment_8_1_1()); 
            // InternalBSQLLog2Java.g:2205:2: ( rule__BoolOperation__PTypingAssignment_8_1_1 )
            // InternalBSQLLog2Java.g:2205:3: rule__BoolOperation__PTypingAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__PTypingAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getPTypingAssignment_8_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BSubTrue__Group__0"
    // InternalBSQLLog2Java.g:2214:1: rule__BSubTrue__Group__0 : rule__BSubTrue__Group__0__Impl rule__BSubTrue__Group__1 ;
    public final void rule__BSubTrue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2218:1: ( rule__BSubTrue__Group__0__Impl rule__BSubTrue__Group__1 )
            // InternalBSQLLog2Java.g:2219:2: rule__BSubTrue__Group__0__Impl rule__BSubTrue__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__BSubTrue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__0"


    // $ANTLR start "rule__BSubTrue__Group__0__Impl"
    // InternalBSQLLog2Java.g:2226:1: rule__BSubTrue__Group__0__Impl : ( ( rule__BSubTrue__ResAssignment_0 ) ) ;
    public final void rule__BSubTrue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2230:1: ( ( ( rule__BSubTrue__ResAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:2231:1: ( ( rule__BSubTrue__ResAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:2231:1: ( ( rule__BSubTrue__ResAssignment_0 ) )
            // InternalBSQLLog2Java.g:2232:2: ( rule__BSubTrue__ResAssignment_0 )
            {
             before(grammarAccess.getBSubTrueAccess().getResAssignment_0()); 
            // InternalBSQLLog2Java.g:2233:2: ( rule__BSubTrue__ResAssignment_0 )
            // InternalBSQLLog2Java.g:2233:3: rule__BSubTrue__ResAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BSubTrue__ResAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBSubTrueAccess().getResAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__0__Impl"


    // $ANTLR start "rule__BSubTrue__Group__1"
    // InternalBSQLLog2Java.g:2241:1: rule__BSubTrue__Group__1 : rule__BSubTrue__Group__1__Impl rule__BSubTrue__Group__2 ;
    public final void rule__BSubTrue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2245:1: ( rule__BSubTrue__Group__1__Impl rule__BSubTrue__Group__2 )
            // InternalBSQLLog2Java.g:2246:2: rule__BSubTrue__Group__1__Impl rule__BSubTrue__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__BSubTrue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__1"


    // $ANTLR start "rule__BSubTrue__Group__1__Impl"
    // InternalBSQLLog2Java.g:2253:1: rule__BSubTrue__Group__1__Impl : ( ':=' ) ;
    public final void rule__BSubTrue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2257:1: ( ( ':=' ) )
            // InternalBSQLLog2Java.g:2258:1: ( ':=' )
            {
            // InternalBSQLLog2Java.g:2258:1: ( ':=' )
            // InternalBSQLLog2Java.g:2259:2: ':='
            {
             before(grammarAccess.getBSubTrueAccess().getColonEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBSubTrueAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__1__Impl"


    // $ANTLR start "rule__BSubTrue__Group__2"
    // InternalBSQLLog2Java.g:2268:1: rule__BSubTrue__Group__2 : rule__BSubTrue__Group__2__Impl rule__BSubTrue__Group__3 ;
    public final void rule__BSubTrue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2272:1: ( rule__BSubTrue__Group__2__Impl rule__BSubTrue__Group__3 )
            // InternalBSQLLog2Java.g:2273:2: rule__BSubTrue__Group__2__Impl rule__BSubTrue__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__BSubTrue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__2"


    // $ANTLR start "rule__BSubTrue__Group__2__Impl"
    // InternalBSQLLog2Java.g:2280:1: rule__BSubTrue__Group__2__Impl : ( 'bool(' ) ;
    public final void rule__BSubTrue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2284:1: ( ( 'bool(' ) )
            // InternalBSQLLog2Java.g:2285:1: ( 'bool(' )
            {
            // InternalBSQLLog2Java.g:2285:1: ( 'bool(' )
            // InternalBSQLLog2Java.g:2286:2: 'bool('
            {
             before(grammarAccess.getBSubTrueAccess().getBoolKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBSubTrueAccess().getBoolKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__2__Impl"


    // $ANTLR start "rule__BSubTrue__Group__3"
    // InternalBSQLLog2Java.g:2295:1: rule__BSubTrue__Group__3 : rule__BSubTrue__Group__3__Impl rule__BSubTrue__Group__4 ;
    public final void rule__BSubTrue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2299:1: ( rule__BSubTrue__Group__3__Impl rule__BSubTrue__Group__4 )
            // InternalBSQLLog2Java.g:2300:2: rule__BSubTrue__Group__3__Impl rule__BSubTrue__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__BSubTrue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__3"


    // $ANTLR start "rule__BSubTrue__Group__3__Impl"
    // InternalBSQLLog2Java.g:2307:1: rule__BSubTrue__Group__3__Impl : ( '#' ) ;
    public final void rule__BSubTrue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2311:1: ( ( '#' ) )
            // InternalBSQLLog2Java.g:2312:1: ( '#' )
            {
            // InternalBSQLLog2Java.g:2312:1: ( '#' )
            // InternalBSQLLog2Java.g:2313:2: '#'
            {
             before(grammarAccess.getBSubTrueAccess().getNumberSignKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBSubTrueAccess().getNumberSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__3__Impl"


    // $ANTLR start "rule__BSubTrue__Group__4"
    // InternalBSQLLog2Java.g:2322:1: rule__BSubTrue__Group__4 : rule__BSubTrue__Group__4__Impl rule__BSubTrue__Group__5 ;
    public final void rule__BSubTrue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2326:1: ( rule__BSubTrue__Group__4__Impl rule__BSubTrue__Group__5 )
            // InternalBSQLLog2Java.g:2327:2: rule__BSubTrue__Group__4__Impl rule__BSubTrue__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__BSubTrue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__4"


    // $ANTLR start "rule__BSubTrue__Group__4__Impl"
    // InternalBSQLLog2Java.g:2334:1: rule__BSubTrue__Group__4__Impl : ( ( rule__BSubTrue__ObjTableAssignment_4 ) ) ;
    public final void rule__BSubTrue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2338:1: ( ( ( rule__BSubTrue__ObjTableAssignment_4 ) ) )
            // InternalBSQLLog2Java.g:2339:1: ( ( rule__BSubTrue__ObjTableAssignment_4 ) )
            {
            // InternalBSQLLog2Java.g:2339:1: ( ( rule__BSubTrue__ObjTableAssignment_4 ) )
            // InternalBSQLLog2Java.g:2340:2: ( rule__BSubTrue__ObjTableAssignment_4 )
            {
             before(grammarAccess.getBSubTrueAccess().getObjTableAssignment_4()); 
            // InternalBSQLLog2Java.g:2341:2: ( rule__BSubTrue__ObjTableAssignment_4 )
            // InternalBSQLLog2Java.g:2341:3: rule__BSubTrue__ObjTableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BSubTrue__ObjTableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBSubTrueAccess().getObjTableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__4__Impl"


    // $ANTLR start "rule__BSubTrue__Group__5"
    // InternalBSQLLog2Java.g:2349:1: rule__BSubTrue__Group__5 : rule__BSubTrue__Group__5__Impl rule__BSubTrue__Group__6 ;
    public final void rule__BSubTrue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2353:1: ( rule__BSubTrue__Group__5__Impl rule__BSubTrue__Group__6 )
            // InternalBSQLLog2Java.g:2354:2: rule__BSubTrue__Group__5__Impl rule__BSubTrue__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__BSubTrue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__5"


    // $ANTLR start "rule__BSubTrue__Group__5__Impl"
    // InternalBSQLLog2Java.g:2361:1: rule__BSubTrue__Group__5__Impl : ( '&' ) ;
    public final void rule__BSubTrue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2365:1: ( ( '&' ) )
            // InternalBSQLLog2Java.g:2366:1: ( '&' )
            {
            // InternalBSQLLog2Java.g:2366:1: ( '&' )
            // InternalBSQLLog2Java.g:2367:2: '&'
            {
             before(grammarAccess.getBSubTrueAccess().getAmpersandKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBSubTrueAccess().getAmpersandKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__5__Impl"


    // $ANTLR start "rule__BSubTrue__Group__6"
    // InternalBSQLLog2Java.g:2376:1: rule__BSubTrue__Group__6 : rule__BSubTrue__Group__6__Impl rule__BSubTrue__Group__7 ;
    public final void rule__BSubTrue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2380:1: ( rule__BSubTrue__Group__6__Impl rule__BSubTrue__Group__7 )
            // InternalBSQLLog2Java.g:2381:2: rule__BSubTrue__Group__6__Impl rule__BSubTrue__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__BSubTrue__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__6"


    // $ANTLR start "rule__BSubTrue__Group__6__Impl"
    // InternalBSQLLog2Java.g:2388:1: rule__BSubTrue__Group__6__Impl : ( ( rule__BSubTrue__PresAssignment_6 ) ) ;
    public final void rule__BSubTrue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2392:1: ( ( ( rule__BSubTrue__PresAssignment_6 ) ) )
            // InternalBSQLLog2Java.g:2393:1: ( ( rule__BSubTrue__PresAssignment_6 ) )
            {
            // InternalBSQLLog2Java.g:2393:1: ( ( rule__BSubTrue__PresAssignment_6 ) )
            // InternalBSQLLog2Java.g:2394:2: ( rule__BSubTrue__PresAssignment_6 )
            {
             before(grammarAccess.getBSubTrueAccess().getPresAssignment_6()); 
            // InternalBSQLLog2Java.g:2395:2: ( rule__BSubTrue__PresAssignment_6 )
            // InternalBSQLLog2Java.g:2395:3: rule__BSubTrue__PresAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BSubTrue__PresAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBSubTrueAccess().getPresAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__6__Impl"


    // $ANTLR start "rule__BSubTrue__Group__7"
    // InternalBSQLLog2Java.g:2403:1: rule__BSubTrue__Group__7 : rule__BSubTrue__Group__7__Impl rule__BSubTrue__Group__8 ;
    public final void rule__BSubTrue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2407:1: ( rule__BSubTrue__Group__7__Impl rule__BSubTrue__Group__8 )
            // InternalBSQLLog2Java.g:2408:2: rule__BSubTrue__Group__7__Impl rule__BSubTrue__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__BSubTrue__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__7"


    // $ANTLR start "rule__BSubTrue__Group__7__Impl"
    // InternalBSQLLog2Java.g:2415:1: rule__BSubTrue__Group__7__Impl : ( ( rule__BSubTrue__Group_7__0 )* ) ;
    public final void rule__BSubTrue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2419:1: ( ( ( rule__BSubTrue__Group_7__0 )* ) )
            // InternalBSQLLog2Java.g:2420:1: ( ( rule__BSubTrue__Group_7__0 )* )
            {
            // InternalBSQLLog2Java.g:2420:1: ( ( rule__BSubTrue__Group_7__0 )* )
            // InternalBSQLLog2Java.g:2421:2: ( rule__BSubTrue__Group_7__0 )*
            {
             before(grammarAccess.getBSubTrueAccess().getGroup_7()); 
            // InternalBSQLLog2Java.g:2422:2: ( rule__BSubTrue__Group_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:2422:3: rule__BSubTrue__Group_7__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__BSubTrue__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBSubTrueAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__7__Impl"


    // $ANTLR start "rule__BSubTrue__Group__8"
    // InternalBSQLLog2Java.g:2430:1: rule__BSubTrue__Group__8 : rule__BSubTrue__Group__8__Impl rule__BSubTrue__Group__9 ;
    public final void rule__BSubTrue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2434:1: ( rule__BSubTrue__Group__8__Impl rule__BSubTrue__Group__9 )
            // InternalBSQLLog2Java.g:2435:2: rule__BSubTrue__Group__8__Impl rule__BSubTrue__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__BSubTrue__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__8"


    // $ANTLR start "rule__BSubTrue__Group__8__Impl"
    // InternalBSQLLog2Java.g:2442:1: rule__BSubTrue__Group__8__Impl : ( ')' ) ;
    public final void rule__BSubTrue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2446:1: ( ( ')' ) )
            // InternalBSQLLog2Java.g:2447:1: ( ')' )
            {
            // InternalBSQLLog2Java.g:2447:1: ( ')' )
            // InternalBSQLLog2Java.g:2448:2: ')'
            {
             before(grammarAccess.getBSubTrueAccess().getRightParenthesisKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBSubTrueAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__8__Impl"


    // $ANTLR start "rule__BSubTrue__Group__9"
    // InternalBSQLLog2Java.g:2457:1: rule__BSubTrue__Group__9 : rule__BSubTrue__Group__9__Impl ;
    public final void rule__BSubTrue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2461:1: ( rule__BSubTrue__Group__9__Impl )
            // InternalBSQLLog2Java.g:2462:2: rule__BSubTrue__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__9"


    // $ANTLR start "rule__BSubTrue__Group__9__Impl"
    // InternalBSQLLog2Java.g:2468:1: rule__BSubTrue__Group__9__Impl : ( ')' ) ;
    public final void rule__BSubTrue__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2472:1: ( ( ')' ) )
            // InternalBSQLLog2Java.g:2473:1: ( ')' )
            {
            // InternalBSQLLog2Java.g:2473:1: ( ')' )
            // InternalBSQLLog2Java.g:2474:2: ')'
            {
             before(grammarAccess.getBSubTrueAccess().getRightParenthesisKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBSubTrueAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group__9__Impl"


    // $ANTLR start "rule__BSubTrue__Group_7__0"
    // InternalBSQLLog2Java.g:2484:1: rule__BSubTrue__Group_7__0 : rule__BSubTrue__Group_7__0__Impl rule__BSubTrue__Group_7__1 ;
    public final void rule__BSubTrue__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2488:1: ( rule__BSubTrue__Group_7__0__Impl rule__BSubTrue__Group_7__1 )
            // InternalBSQLLog2Java.g:2489:2: rule__BSubTrue__Group_7__0__Impl rule__BSubTrue__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__BSubTrue__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group_7__0"


    // $ANTLR start "rule__BSubTrue__Group_7__0__Impl"
    // InternalBSQLLog2Java.g:2496:1: rule__BSubTrue__Group_7__0__Impl : ( '&' ) ;
    public final void rule__BSubTrue__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2500:1: ( ( '&' ) )
            // InternalBSQLLog2Java.g:2501:1: ( '&' )
            {
            // InternalBSQLLog2Java.g:2501:1: ( '&' )
            // InternalBSQLLog2Java.g:2502:2: '&'
            {
             before(grammarAccess.getBSubTrueAccess().getAmpersandKeyword_7_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBSubTrueAccess().getAmpersandKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group_7__0__Impl"


    // $ANTLR start "rule__BSubTrue__Group_7__1"
    // InternalBSQLLog2Java.g:2511:1: rule__BSubTrue__Group_7__1 : rule__BSubTrue__Group_7__1__Impl ;
    public final void rule__BSubTrue__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2515:1: ( rule__BSubTrue__Group_7__1__Impl )
            // InternalBSQLLog2Java.g:2516:2: rule__BSubTrue__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSubTrue__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group_7__1"


    // $ANTLR start "rule__BSubTrue__Group_7__1__Impl"
    // InternalBSQLLog2Java.g:2522:1: rule__BSubTrue__Group_7__1__Impl : ( ( rule__BSubTrue__PresAssignment_7_1 ) ) ;
    public final void rule__BSubTrue__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2526:1: ( ( ( rule__BSubTrue__PresAssignment_7_1 ) ) )
            // InternalBSQLLog2Java.g:2527:1: ( ( rule__BSubTrue__PresAssignment_7_1 ) )
            {
            // InternalBSQLLog2Java.g:2527:1: ( ( rule__BSubTrue__PresAssignment_7_1 ) )
            // InternalBSQLLog2Java.g:2528:2: ( rule__BSubTrue__PresAssignment_7_1 )
            {
             before(grammarAccess.getBSubTrueAccess().getPresAssignment_7_1()); 
            // InternalBSQLLog2Java.g:2529:2: ( rule__BSubTrue__PresAssignment_7_1 )
            // InternalBSQLLog2Java.g:2529:3: rule__BSubTrue__PresAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BSubTrue__PresAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBSubTrueAccess().getPresAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__Group_7__1__Impl"


    // $ANTLR start "rule__BSubFalse__Group__0"
    // InternalBSQLLog2Java.g:2538:1: rule__BSubFalse__Group__0 : rule__BSubFalse__Group__0__Impl rule__BSubFalse__Group__1 ;
    public final void rule__BSubFalse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2542:1: ( rule__BSubFalse__Group__0__Impl rule__BSubFalse__Group__1 )
            // InternalBSQLLog2Java.g:2543:2: rule__BSubFalse__Group__0__Impl rule__BSubFalse__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__BSubFalse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__0"


    // $ANTLR start "rule__BSubFalse__Group__0__Impl"
    // InternalBSQLLog2Java.g:2550:1: rule__BSubFalse__Group__0__Impl : ( ( rule__BSubFalse__ResAssignment_0 ) ) ;
    public final void rule__BSubFalse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2554:1: ( ( ( rule__BSubFalse__ResAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:2555:1: ( ( rule__BSubFalse__ResAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:2555:1: ( ( rule__BSubFalse__ResAssignment_0 ) )
            // InternalBSQLLog2Java.g:2556:2: ( rule__BSubFalse__ResAssignment_0 )
            {
             before(grammarAccess.getBSubFalseAccess().getResAssignment_0()); 
            // InternalBSQLLog2Java.g:2557:2: ( rule__BSubFalse__ResAssignment_0 )
            // InternalBSQLLog2Java.g:2557:3: rule__BSubFalse__ResAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BSubFalse__ResAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBSubFalseAccess().getResAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__0__Impl"


    // $ANTLR start "rule__BSubFalse__Group__1"
    // InternalBSQLLog2Java.g:2565:1: rule__BSubFalse__Group__1 : rule__BSubFalse__Group__1__Impl rule__BSubFalse__Group__2 ;
    public final void rule__BSubFalse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2569:1: ( rule__BSubFalse__Group__1__Impl rule__BSubFalse__Group__2 )
            // InternalBSQLLog2Java.g:2570:2: rule__BSubFalse__Group__1__Impl rule__BSubFalse__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__BSubFalse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__1"


    // $ANTLR start "rule__BSubFalse__Group__1__Impl"
    // InternalBSQLLog2Java.g:2577:1: rule__BSubFalse__Group__1__Impl : ( ':=' ) ;
    public final void rule__BSubFalse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2581:1: ( ( ':=' ) )
            // InternalBSQLLog2Java.g:2582:1: ( ':=' )
            {
            // InternalBSQLLog2Java.g:2582:1: ( ':=' )
            // InternalBSQLLog2Java.g:2583:2: ':='
            {
             before(grammarAccess.getBSubFalseAccess().getColonEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__1__Impl"


    // $ANTLR start "rule__BSubFalse__Group__2"
    // InternalBSQLLog2Java.g:2592:1: rule__BSubFalse__Group__2 : rule__BSubFalse__Group__2__Impl rule__BSubFalse__Group__3 ;
    public final void rule__BSubFalse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2596:1: ( rule__BSubFalse__Group__2__Impl rule__BSubFalse__Group__3 )
            // InternalBSQLLog2Java.g:2597:2: rule__BSubFalse__Group__2__Impl rule__BSubFalse__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__BSubFalse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__2"


    // $ANTLR start "rule__BSubFalse__Group__2__Impl"
    // InternalBSQLLog2Java.g:2604:1: rule__BSubFalse__Group__2__Impl : ( 'bool(' ) ;
    public final void rule__BSubFalse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2608:1: ( ( 'bool(' ) )
            // InternalBSQLLog2Java.g:2609:1: ( 'bool(' )
            {
            // InternalBSQLLog2Java.g:2609:1: ( 'bool(' )
            // InternalBSQLLog2Java.g:2610:2: 'bool('
            {
             before(grammarAccess.getBSubFalseAccess().getBoolKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getBoolKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__2__Impl"


    // $ANTLR start "rule__BSubFalse__Group__3"
    // InternalBSQLLog2Java.g:2619:1: rule__BSubFalse__Group__3 : rule__BSubFalse__Group__3__Impl rule__BSubFalse__Group__4 ;
    public final void rule__BSubFalse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2623:1: ( rule__BSubFalse__Group__3__Impl rule__BSubFalse__Group__4 )
            // InternalBSQLLog2Java.g:2624:2: rule__BSubFalse__Group__3__Impl rule__BSubFalse__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__BSubFalse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__3"


    // $ANTLR start "rule__BSubFalse__Group__3__Impl"
    // InternalBSQLLog2Java.g:2631:1: rule__BSubFalse__Group__3__Impl : ( 'not' ) ;
    public final void rule__BSubFalse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2635:1: ( ( 'not' ) )
            // InternalBSQLLog2Java.g:2636:1: ( 'not' )
            {
            // InternalBSQLLog2Java.g:2636:1: ( 'not' )
            // InternalBSQLLog2Java.g:2637:2: 'not'
            {
             before(grammarAccess.getBSubFalseAccess().getNotKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getNotKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__3__Impl"


    // $ANTLR start "rule__BSubFalse__Group__4"
    // InternalBSQLLog2Java.g:2646:1: rule__BSubFalse__Group__4 : rule__BSubFalse__Group__4__Impl rule__BSubFalse__Group__5 ;
    public final void rule__BSubFalse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2650:1: ( rule__BSubFalse__Group__4__Impl rule__BSubFalse__Group__5 )
            // InternalBSQLLog2Java.g:2651:2: rule__BSubFalse__Group__4__Impl rule__BSubFalse__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__BSubFalse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__4"


    // $ANTLR start "rule__BSubFalse__Group__4__Impl"
    // InternalBSQLLog2Java.g:2658:1: rule__BSubFalse__Group__4__Impl : ( '(' ) ;
    public final void rule__BSubFalse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2662:1: ( ( '(' ) )
            // InternalBSQLLog2Java.g:2663:1: ( '(' )
            {
            // InternalBSQLLog2Java.g:2663:1: ( '(' )
            // InternalBSQLLog2Java.g:2664:2: '('
            {
             before(grammarAccess.getBSubFalseAccess().getLeftParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__4__Impl"


    // $ANTLR start "rule__BSubFalse__Group__5"
    // InternalBSQLLog2Java.g:2673:1: rule__BSubFalse__Group__5 : rule__BSubFalse__Group__5__Impl rule__BSubFalse__Group__6 ;
    public final void rule__BSubFalse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2677:1: ( rule__BSubFalse__Group__5__Impl rule__BSubFalse__Group__6 )
            // InternalBSQLLog2Java.g:2678:2: rule__BSubFalse__Group__5__Impl rule__BSubFalse__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__BSubFalse__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__5"


    // $ANTLR start "rule__BSubFalse__Group__5__Impl"
    // InternalBSQLLog2Java.g:2685:1: rule__BSubFalse__Group__5__Impl : ( '#' ) ;
    public final void rule__BSubFalse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2689:1: ( ( '#' ) )
            // InternalBSQLLog2Java.g:2690:1: ( '#' )
            {
            // InternalBSQLLog2Java.g:2690:1: ( '#' )
            // InternalBSQLLog2Java.g:2691:2: '#'
            {
             before(grammarAccess.getBSubFalseAccess().getNumberSignKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getNumberSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__5__Impl"


    // $ANTLR start "rule__BSubFalse__Group__6"
    // InternalBSQLLog2Java.g:2700:1: rule__BSubFalse__Group__6 : rule__BSubFalse__Group__6__Impl rule__BSubFalse__Group__7 ;
    public final void rule__BSubFalse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2704:1: ( rule__BSubFalse__Group__6__Impl rule__BSubFalse__Group__7 )
            // InternalBSQLLog2Java.g:2705:2: rule__BSubFalse__Group__6__Impl rule__BSubFalse__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__BSubFalse__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__6"


    // $ANTLR start "rule__BSubFalse__Group__6__Impl"
    // InternalBSQLLog2Java.g:2712:1: rule__BSubFalse__Group__6__Impl : ( ( rule__BSubFalse__ObjTableAssignment_6 ) ) ;
    public final void rule__BSubFalse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2716:1: ( ( ( rule__BSubFalse__ObjTableAssignment_6 ) ) )
            // InternalBSQLLog2Java.g:2717:1: ( ( rule__BSubFalse__ObjTableAssignment_6 ) )
            {
            // InternalBSQLLog2Java.g:2717:1: ( ( rule__BSubFalse__ObjTableAssignment_6 ) )
            // InternalBSQLLog2Java.g:2718:2: ( rule__BSubFalse__ObjTableAssignment_6 )
            {
             before(grammarAccess.getBSubFalseAccess().getObjTableAssignment_6()); 
            // InternalBSQLLog2Java.g:2719:2: ( rule__BSubFalse__ObjTableAssignment_6 )
            // InternalBSQLLog2Java.g:2719:3: rule__BSubFalse__ObjTableAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BSubFalse__ObjTableAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBSubFalseAccess().getObjTableAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__6__Impl"


    // $ANTLR start "rule__BSubFalse__Group__7"
    // InternalBSQLLog2Java.g:2727:1: rule__BSubFalse__Group__7 : rule__BSubFalse__Group__7__Impl rule__BSubFalse__Group__8 ;
    public final void rule__BSubFalse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2731:1: ( rule__BSubFalse__Group__7__Impl rule__BSubFalse__Group__8 )
            // InternalBSQLLog2Java.g:2732:2: rule__BSubFalse__Group__7__Impl rule__BSubFalse__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__BSubFalse__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__7"


    // $ANTLR start "rule__BSubFalse__Group__7__Impl"
    // InternalBSQLLog2Java.g:2739:1: rule__BSubFalse__Group__7__Impl : ( '&' ) ;
    public final void rule__BSubFalse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2743:1: ( ( '&' ) )
            // InternalBSQLLog2Java.g:2744:1: ( '&' )
            {
            // InternalBSQLLog2Java.g:2744:1: ( '&' )
            // InternalBSQLLog2Java.g:2745:2: '&'
            {
             before(grammarAccess.getBSubFalseAccess().getAmpersandKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getAmpersandKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__7__Impl"


    // $ANTLR start "rule__BSubFalse__Group__8"
    // InternalBSQLLog2Java.g:2754:1: rule__BSubFalse__Group__8 : rule__BSubFalse__Group__8__Impl rule__BSubFalse__Group__9 ;
    public final void rule__BSubFalse__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2758:1: ( rule__BSubFalse__Group__8__Impl rule__BSubFalse__Group__9 )
            // InternalBSQLLog2Java.g:2759:2: rule__BSubFalse__Group__8__Impl rule__BSubFalse__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__BSubFalse__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__8"


    // $ANTLR start "rule__BSubFalse__Group__8__Impl"
    // InternalBSQLLog2Java.g:2766:1: rule__BSubFalse__Group__8__Impl : ( ( rule__BSubFalse__PresAssignment_8 ) ) ;
    public final void rule__BSubFalse__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2770:1: ( ( ( rule__BSubFalse__PresAssignment_8 ) ) )
            // InternalBSQLLog2Java.g:2771:1: ( ( rule__BSubFalse__PresAssignment_8 ) )
            {
            // InternalBSQLLog2Java.g:2771:1: ( ( rule__BSubFalse__PresAssignment_8 ) )
            // InternalBSQLLog2Java.g:2772:2: ( rule__BSubFalse__PresAssignment_8 )
            {
             before(grammarAccess.getBSubFalseAccess().getPresAssignment_8()); 
            // InternalBSQLLog2Java.g:2773:2: ( rule__BSubFalse__PresAssignment_8 )
            // InternalBSQLLog2Java.g:2773:3: rule__BSubFalse__PresAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BSubFalse__PresAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBSubFalseAccess().getPresAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__8__Impl"


    // $ANTLR start "rule__BSubFalse__Group__9"
    // InternalBSQLLog2Java.g:2781:1: rule__BSubFalse__Group__9 : rule__BSubFalse__Group__9__Impl rule__BSubFalse__Group__10 ;
    public final void rule__BSubFalse__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2785:1: ( rule__BSubFalse__Group__9__Impl rule__BSubFalse__Group__10 )
            // InternalBSQLLog2Java.g:2786:2: rule__BSubFalse__Group__9__Impl rule__BSubFalse__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__BSubFalse__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__9"


    // $ANTLR start "rule__BSubFalse__Group__9__Impl"
    // InternalBSQLLog2Java.g:2793:1: rule__BSubFalse__Group__9__Impl : ( ( rule__BSubFalse__Group_9__0 )* ) ;
    public final void rule__BSubFalse__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2797:1: ( ( ( rule__BSubFalse__Group_9__0 )* ) )
            // InternalBSQLLog2Java.g:2798:1: ( ( rule__BSubFalse__Group_9__0 )* )
            {
            // InternalBSQLLog2Java.g:2798:1: ( ( rule__BSubFalse__Group_9__0 )* )
            // InternalBSQLLog2Java.g:2799:2: ( rule__BSubFalse__Group_9__0 )*
            {
             before(grammarAccess.getBSubFalseAccess().getGroup_9()); 
            // InternalBSQLLog2Java.g:2800:2: ( rule__BSubFalse__Group_9__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:2800:3: rule__BSubFalse__Group_9__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__BSubFalse__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBSubFalseAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__9__Impl"


    // $ANTLR start "rule__BSubFalse__Group__10"
    // InternalBSQLLog2Java.g:2808:1: rule__BSubFalse__Group__10 : rule__BSubFalse__Group__10__Impl rule__BSubFalse__Group__11 ;
    public final void rule__BSubFalse__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2812:1: ( rule__BSubFalse__Group__10__Impl rule__BSubFalse__Group__11 )
            // InternalBSQLLog2Java.g:2813:2: rule__BSubFalse__Group__10__Impl rule__BSubFalse__Group__11
            {
            pushFollow(FOLLOW_30);
            rule__BSubFalse__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__10"


    // $ANTLR start "rule__BSubFalse__Group__10__Impl"
    // InternalBSQLLog2Java.g:2820:1: rule__BSubFalse__Group__10__Impl : ( ')' ) ;
    public final void rule__BSubFalse__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2824:1: ( ( ')' ) )
            // InternalBSQLLog2Java.g:2825:1: ( ')' )
            {
            // InternalBSQLLog2Java.g:2825:1: ( ')' )
            // InternalBSQLLog2Java.g:2826:2: ')'
            {
             before(grammarAccess.getBSubFalseAccess().getRightParenthesisKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__10__Impl"


    // $ANTLR start "rule__BSubFalse__Group__11"
    // InternalBSQLLog2Java.g:2835:1: rule__BSubFalse__Group__11 : rule__BSubFalse__Group__11__Impl rule__BSubFalse__Group__12 ;
    public final void rule__BSubFalse__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2839:1: ( rule__BSubFalse__Group__11__Impl rule__BSubFalse__Group__12 )
            // InternalBSQLLog2Java.g:2840:2: rule__BSubFalse__Group__11__Impl rule__BSubFalse__Group__12
            {
            pushFollow(FOLLOW_30);
            rule__BSubFalse__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__11"


    // $ANTLR start "rule__BSubFalse__Group__11__Impl"
    // InternalBSQLLog2Java.g:2847:1: rule__BSubFalse__Group__11__Impl : ( ')' ) ;
    public final void rule__BSubFalse__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2851:1: ( ( ')' ) )
            // InternalBSQLLog2Java.g:2852:1: ( ')' )
            {
            // InternalBSQLLog2Java.g:2852:1: ( ')' )
            // InternalBSQLLog2Java.g:2853:2: ')'
            {
             before(grammarAccess.getBSubFalseAccess().getRightParenthesisKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__11__Impl"


    // $ANTLR start "rule__BSubFalse__Group__12"
    // InternalBSQLLog2Java.g:2862:1: rule__BSubFalse__Group__12 : rule__BSubFalse__Group__12__Impl ;
    public final void rule__BSubFalse__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2866:1: ( rule__BSubFalse__Group__12__Impl )
            // InternalBSQLLog2Java.g:2867:2: rule__BSubFalse__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__12"


    // $ANTLR start "rule__BSubFalse__Group__12__Impl"
    // InternalBSQLLog2Java.g:2873:1: rule__BSubFalse__Group__12__Impl : ( ')' ) ;
    public final void rule__BSubFalse__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2877:1: ( ( ')' ) )
            // InternalBSQLLog2Java.g:2878:1: ( ')' )
            {
            // InternalBSQLLog2Java.g:2878:1: ( ')' )
            // InternalBSQLLog2Java.g:2879:2: ')'
            {
             before(grammarAccess.getBSubFalseAccess().getRightParenthesisKeyword_12()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group__12__Impl"


    // $ANTLR start "rule__BSubFalse__Group_9__0"
    // InternalBSQLLog2Java.g:2889:1: rule__BSubFalse__Group_9__0 : rule__BSubFalse__Group_9__0__Impl rule__BSubFalse__Group_9__1 ;
    public final void rule__BSubFalse__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2893:1: ( rule__BSubFalse__Group_9__0__Impl rule__BSubFalse__Group_9__1 )
            // InternalBSQLLog2Java.g:2894:2: rule__BSubFalse__Group_9__0__Impl rule__BSubFalse__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__BSubFalse__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group_9__0"


    // $ANTLR start "rule__BSubFalse__Group_9__0__Impl"
    // InternalBSQLLog2Java.g:2901:1: rule__BSubFalse__Group_9__0__Impl : ( '&' ) ;
    public final void rule__BSubFalse__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2905:1: ( ( '&' ) )
            // InternalBSQLLog2Java.g:2906:1: ( '&' )
            {
            // InternalBSQLLog2Java.g:2906:1: ( '&' )
            // InternalBSQLLog2Java.g:2907:2: '&'
            {
             before(grammarAccess.getBSubFalseAccess().getAmpersandKeyword_9_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getAmpersandKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group_9__0__Impl"


    // $ANTLR start "rule__BSubFalse__Group_9__1"
    // InternalBSQLLog2Java.g:2916:1: rule__BSubFalse__Group_9__1 : rule__BSubFalse__Group_9__1__Impl ;
    public final void rule__BSubFalse__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2920:1: ( rule__BSubFalse__Group_9__1__Impl )
            // InternalBSQLLog2Java.g:2921:2: rule__BSubFalse__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSubFalse__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group_9__1"


    // $ANTLR start "rule__BSubFalse__Group_9__1__Impl"
    // InternalBSQLLog2Java.g:2927:1: rule__BSubFalse__Group_9__1__Impl : ( ( rule__BSubFalse__PresAssignment_9_1 ) ) ;
    public final void rule__BSubFalse__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2931:1: ( ( ( rule__BSubFalse__PresAssignment_9_1 ) ) )
            // InternalBSQLLog2Java.g:2932:1: ( ( rule__BSubFalse__PresAssignment_9_1 ) )
            {
            // InternalBSQLLog2Java.g:2932:1: ( ( rule__BSubFalse__PresAssignment_9_1 ) )
            // InternalBSQLLog2Java.g:2933:2: ( rule__BSubFalse__PresAssignment_9_1 )
            {
             before(grammarAccess.getBSubFalseAccess().getPresAssignment_9_1()); 
            // InternalBSQLLog2Java.g:2934:2: ( rule__BSubFalse__PresAssignment_9_1 )
            // InternalBSQLLog2Java.g:2934:3: rule__BSubFalse__PresAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__BSubFalse__PresAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBSubFalseAccess().getPresAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__Group_9__1__Impl"


    // $ANTLR start "rule__StringOperation__Group__0"
    // InternalBSQLLog2Java.g:2943:1: rule__StringOperation__Group__0 : rule__StringOperation__Group__0__Impl rule__StringOperation__Group__1 ;
    public final void rule__StringOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2947:1: ( rule__StringOperation__Group__0__Impl rule__StringOperation__Group__1 )
            // InternalBSQLLog2Java.g:2948:2: rule__StringOperation__Group__0__Impl rule__StringOperation__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSQLLog2Java.g:2955:1: rule__StringOperation__Group__0__Impl : ( ( rule__StringOperation__ResAssignment_0 ) ) ;
    public final void rule__StringOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2959:1: ( ( ( rule__StringOperation__ResAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:2960:1: ( ( rule__StringOperation__ResAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:2960:1: ( ( rule__StringOperation__ResAssignment_0 ) )
            // InternalBSQLLog2Java.g:2961:2: ( rule__StringOperation__ResAssignment_0 )
            {
             before(grammarAccess.getStringOperationAccess().getResAssignment_0()); 
            // InternalBSQLLog2Java.g:2962:2: ( rule__StringOperation__ResAssignment_0 )
            // InternalBSQLLog2Java.g:2962:3: rule__StringOperation__ResAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__ResAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getResAssignment_0()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:2970:1: rule__StringOperation__Group__1 : rule__StringOperation__Group__1__Impl rule__StringOperation__Group__2 ;
    public final void rule__StringOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2974:1: ( rule__StringOperation__Group__1__Impl rule__StringOperation__Group__2 )
            // InternalBSQLLog2Java.g:2975:2: rule__StringOperation__Group__1__Impl rule__StringOperation__Group__2
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
    // InternalBSQLLog2Java.g:2982:1: rule__StringOperation__Group__1__Impl : ( '<--' ) ;
    public final void rule__StringOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:2986:1: ( ( '<--' ) )
            // InternalBSQLLog2Java.g:2987:1: ( '<--' )
            {
            // InternalBSQLLog2Java.g:2987:1: ( '<--' )
            // InternalBSQLLog2Java.g:2988:2: '<--'
            {
             before(grammarAccess.getStringOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:2997:1: rule__StringOperation__Group__2 : rule__StringOperation__Group__2__Impl rule__StringOperation__Group__3 ;
    public final void rule__StringOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3001:1: ( rule__StringOperation__Group__2__Impl rule__StringOperation__Group__3 )
            // InternalBSQLLog2Java.g:3002:2: rule__StringOperation__Group__2__Impl rule__StringOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalBSQLLog2Java.g:3009:1: rule__StringOperation__Group__2__Impl : ( ( rule__StringOperation__Op_nameAssignment_2 ) ) ;
    public final void rule__StringOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3013:1: ( ( ( rule__StringOperation__Op_nameAssignment_2 ) ) )
            // InternalBSQLLog2Java.g:3014:1: ( ( rule__StringOperation__Op_nameAssignment_2 ) )
            {
            // InternalBSQLLog2Java.g:3014:1: ( ( rule__StringOperation__Op_nameAssignment_2 ) )
            // InternalBSQLLog2Java.g:3015:2: ( rule__StringOperation__Op_nameAssignment_2 )
            {
             before(grammarAccess.getStringOperationAccess().getOp_nameAssignment_2()); 
            // InternalBSQLLog2Java.g:3016:2: ( rule__StringOperation__Op_nameAssignment_2 )
            // InternalBSQLLog2Java.g:3016:3: rule__StringOperation__Op_nameAssignment_2
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
    // InternalBSQLLog2Java.g:3024:1: rule__StringOperation__Group__3 : rule__StringOperation__Group__3__Impl rule__StringOperation__Group__4 ;
    public final void rule__StringOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3028:1: ( rule__StringOperation__Group__3__Impl rule__StringOperation__Group__4 )
            // InternalBSQLLog2Java.g:3029:2: rule__StringOperation__Group__3__Impl rule__StringOperation__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSQLLog2Java.g:3036:1: rule__StringOperation__Group__3__Impl : ( '(' ) ;
    public final void rule__StringOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3040:1: ( ( '(' ) )
            // InternalBSQLLog2Java.g:3041:1: ( '(' )
            {
            // InternalBSQLLog2Java.g:3041:1: ( '(' )
            // InternalBSQLLog2Java.g:3042:2: '('
            {
             before(grammarAccess.getStringOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:3051:1: rule__StringOperation__Group__4 : rule__StringOperation__Group__4__Impl rule__StringOperation__Group__5 ;
    public final void rule__StringOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3055:1: ( rule__StringOperation__Group__4__Impl rule__StringOperation__Group__5 )
            // InternalBSQLLog2Java.g:3056:2: rule__StringOperation__Group__4__Impl rule__StringOperation__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSQLLog2Java.g:3063:1: rule__StringOperation__Group__4__Impl : ( ( rule__StringOperation__Group_4__0 )? ) ;
    public final void rule__StringOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3067:1: ( ( ( rule__StringOperation__Group_4__0 )? ) )
            // InternalBSQLLog2Java.g:3068:1: ( ( rule__StringOperation__Group_4__0 )? )
            {
            // InternalBSQLLog2Java.g:3068:1: ( ( rule__StringOperation__Group_4__0 )? )
            // InternalBSQLLog2Java.g:3069:2: ( rule__StringOperation__Group_4__0 )?
            {
             before(grammarAccess.getStringOperationAccess().getGroup_4()); 
            // InternalBSQLLog2Java.g:3070:2: ( rule__StringOperation__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBSQLLog2Java.g:3070:3: rule__StringOperation__Group_4__0
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
    // InternalBSQLLog2Java.g:3078:1: rule__StringOperation__Group__5 : rule__StringOperation__Group__5__Impl rule__StringOperation__Group__6 ;
    public final void rule__StringOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3082:1: ( rule__StringOperation__Group__5__Impl rule__StringOperation__Group__6 )
            // InternalBSQLLog2Java.g:3083:2: rule__StringOperation__Group__5__Impl rule__StringOperation__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalBSQLLog2Java.g:3090:1: rule__StringOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__StringOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3094:1: ( ( ')' ) )
            // InternalBSQLLog2Java.g:3095:1: ( ')' )
            {
            // InternalBSQLLog2Java.g:3095:1: ( ')' )
            // InternalBSQLLog2Java.g:3096:2: ')'
            {
             before(grammarAccess.getStringOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:3105:1: rule__StringOperation__Group__6 : rule__StringOperation__Group__6__Impl rule__StringOperation__Group__7 ;
    public final void rule__StringOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3109:1: ( rule__StringOperation__Group__6__Impl rule__StringOperation__Group__7 )
            // InternalBSQLLog2Java.g:3110:2: rule__StringOperation__Group__6__Impl rule__StringOperation__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSQLLog2Java.g:3117:1: rule__StringOperation__Group__6__Impl : ( '=' ) ;
    public final void rule__StringOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3121:1: ( ( '=' ) )
            // InternalBSQLLog2Java.g:3122:1: ( '=' )
            {
            // InternalBSQLLog2Java.g:3122:1: ( '=' )
            // InternalBSQLLog2Java.g:3123:2: '='
            {
             before(grammarAccess.getStringOperationAccess().getEqualsSignKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:3132:1: rule__StringOperation__Group__7 : rule__StringOperation__Group__7__Impl rule__StringOperation__Group__8 ;
    public final void rule__StringOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3136:1: ( rule__StringOperation__Group__7__Impl rule__StringOperation__Group__8 )
            // InternalBSQLLog2Java.g:3137:2: rule__StringOperation__Group__7__Impl rule__StringOperation__Group__8
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
    // InternalBSQLLog2Java.g:3144:1: rule__StringOperation__Group__7__Impl : ( 'PRE' ) ;
    public final void rule__StringOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3148:1: ( ( 'PRE' ) )
            // InternalBSQLLog2Java.g:3149:1: ( 'PRE' )
            {
            // InternalBSQLLog2Java.g:3149:1: ( 'PRE' )
            // InternalBSQLLog2Java.g:3150:2: 'PRE'
            {
             before(grammarAccess.getStringOperationAccess().getPREKeyword_7()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:3159:1: rule__StringOperation__Group__8 : rule__StringOperation__Group__8__Impl rule__StringOperation__Group__9 ;
    public final void rule__StringOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3163:1: ( rule__StringOperation__Group__8__Impl rule__StringOperation__Group__9 )
            // InternalBSQLLog2Java.g:3164:2: rule__StringOperation__Group__8__Impl rule__StringOperation__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalBSQLLog2Java.g:3171:1: rule__StringOperation__Group__8__Impl : ( ( rule__StringOperation__Group_8__0 ) ) ;
    public final void rule__StringOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3175:1: ( ( ( rule__StringOperation__Group_8__0 ) ) )
            // InternalBSQLLog2Java.g:3176:1: ( ( rule__StringOperation__Group_8__0 ) )
            {
            // InternalBSQLLog2Java.g:3176:1: ( ( rule__StringOperation__Group_8__0 ) )
            // InternalBSQLLog2Java.g:3177:2: ( rule__StringOperation__Group_8__0 )
            {
             before(grammarAccess.getStringOperationAccess().getGroup_8()); 
            // InternalBSQLLog2Java.g:3178:2: ( rule__StringOperation__Group_8__0 )
            // InternalBSQLLog2Java.g:3178:3: rule__StringOperation__Group_8__0
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
    // InternalBSQLLog2Java.g:3186:1: rule__StringOperation__Group__9 : rule__StringOperation__Group__9__Impl rule__StringOperation__Group__10 ;
    public final void rule__StringOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3190:1: ( rule__StringOperation__Group__9__Impl rule__StringOperation__Group__10 )
            // InternalBSQLLog2Java.g:3191:2: rule__StringOperation__Group__9__Impl rule__StringOperation__Group__10
            {
            pushFollow(FOLLOW_32);
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
    // InternalBSQLLog2Java.g:3198:1: rule__StringOperation__Group__9__Impl : ( 'THEN' ) ;
    public final void rule__StringOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3202:1: ( ( 'THEN' ) )
            // InternalBSQLLog2Java.g:3203:1: ( 'THEN' )
            {
            // InternalBSQLLog2Java.g:3203:1: ( 'THEN' )
            // InternalBSQLLog2Java.g:3204:2: 'THEN'
            {
             before(grammarAccess.getStringOperationAccess().getTHENKeyword_9()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:3213:1: rule__StringOperation__Group__10 : rule__StringOperation__Group__10__Impl rule__StringOperation__Group__11 ;
    public final void rule__StringOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3217:1: ( rule__StringOperation__Group__10__Impl rule__StringOperation__Group__11 )
            // InternalBSQLLog2Java.g:3218:2: rule__StringOperation__Group__10__Impl rule__StringOperation__Group__11
            {
            pushFollow(FOLLOW_24);
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
    // InternalBSQLLog2Java.g:3225:1: rule__StringOperation__Group__10__Impl : ( ( rule__StringOperation__AnyblockAssignment_10 ) ) ;
    public final void rule__StringOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3229:1: ( ( ( rule__StringOperation__AnyblockAssignment_10 ) ) )
            // InternalBSQLLog2Java.g:3230:1: ( ( rule__StringOperation__AnyblockAssignment_10 ) )
            {
            // InternalBSQLLog2Java.g:3230:1: ( ( rule__StringOperation__AnyblockAssignment_10 ) )
            // InternalBSQLLog2Java.g:3231:2: ( rule__StringOperation__AnyblockAssignment_10 )
            {
             before(grammarAccess.getStringOperationAccess().getAnyblockAssignment_10()); 
            // InternalBSQLLog2Java.g:3232:2: ( rule__StringOperation__AnyblockAssignment_10 )
            // InternalBSQLLog2Java.g:3232:3: rule__StringOperation__AnyblockAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__AnyblockAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getAnyblockAssignment_10()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:3240:1: rule__StringOperation__Group__11 : rule__StringOperation__Group__11__Impl ;
    public final void rule__StringOperation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3244:1: ( rule__StringOperation__Group__11__Impl )
            // InternalBSQLLog2Java.g:3245:2: rule__StringOperation__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__Group__11__Impl();

            state._fsp--;


            }

        }
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
    // InternalBSQLLog2Java.g:3251:1: rule__StringOperation__Group__11__Impl : ( 'END' ) ;
    public final void rule__StringOperation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3255:1: ( ( 'END' ) )
            // InternalBSQLLog2Java.g:3256:1: ( 'END' )
            {
            // InternalBSQLLog2Java.g:3256:1: ( 'END' )
            // InternalBSQLLog2Java.g:3257:2: 'END'
            {
             before(grammarAccess.getStringOperationAccess().getENDKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getENDKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__StringOperation__Group_4__0"
    // InternalBSQLLog2Java.g:3267:1: rule__StringOperation__Group_4__0 : rule__StringOperation__Group_4__0__Impl rule__StringOperation__Group_4__1 ;
    public final void rule__StringOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3271:1: ( rule__StringOperation__Group_4__0__Impl rule__StringOperation__Group_4__1 )
            // InternalBSQLLog2Java.g:3272:2: rule__StringOperation__Group_4__0__Impl rule__StringOperation__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBSQLLog2Java.g:3279:1: rule__StringOperation__Group_4__0__Impl : ( ( rule__StringOperation__PListAssignment_4_0 ) ) ;
    public final void rule__StringOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3283:1: ( ( ( rule__StringOperation__PListAssignment_4_0 ) ) )
            // InternalBSQLLog2Java.g:3284:1: ( ( rule__StringOperation__PListAssignment_4_0 ) )
            {
            // InternalBSQLLog2Java.g:3284:1: ( ( rule__StringOperation__PListAssignment_4_0 ) )
            // InternalBSQLLog2Java.g:3285:2: ( rule__StringOperation__PListAssignment_4_0 )
            {
             before(grammarAccess.getStringOperationAccess().getPListAssignment_4_0()); 
            // InternalBSQLLog2Java.g:3286:2: ( rule__StringOperation__PListAssignment_4_0 )
            // InternalBSQLLog2Java.g:3286:3: rule__StringOperation__PListAssignment_4_0
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
    // InternalBSQLLog2Java.g:3294:1: rule__StringOperation__Group_4__1 : rule__StringOperation__Group_4__1__Impl ;
    public final void rule__StringOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3298:1: ( rule__StringOperation__Group_4__1__Impl )
            // InternalBSQLLog2Java.g:3299:2: rule__StringOperation__Group_4__1__Impl
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
    // InternalBSQLLog2Java.g:3305:1: rule__StringOperation__Group_4__1__Impl : ( ( rule__StringOperation__Group_4_1__0 )* ) ;
    public final void rule__StringOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3309:1: ( ( ( rule__StringOperation__Group_4_1__0 )* ) )
            // InternalBSQLLog2Java.g:3310:1: ( ( rule__StringOperation__Group_4_1__0 )* )
            {
            // InternalBSQLLog2Java.g:3310:1: ( ( rule__StringOperation__Group_4_1__0 )* )
            // InternalBSQLLog2Java.g:3311:2: ( rule__StringOperation__Group_4_1__0 )*
            {
             before(grammarAccess.getStringOperationAccess().getGroup_4_1()); 
            // InternalBSQLLog2Java.g:3312:2: ( rule__StringOperation__Group_4_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:3312:3: rule__StringOperation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__StringOperation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBSQLLog2Java.g:3321:1: rule__StringOperation__Group_4_1__0 : rule__StringOperation__Group_4_1__0__Impl rule__StringOperation__Group_4_1__1 ;
    public final void rule__StringOperation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3325:1: ( rule__StringOperation__Group_4_1__0__Impl rule__StringOperation__Group_4_1__1 )
            // InternalBSQLLog2Java.g:3326:2: rule__StringOperation__Group_4_1__0__Impl rule__StringOperation__Group_4_1__1
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
    // InternalBSQLLog2Java.g:3333:1: rule__StringOperation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__StringOperation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3337:1: ( ( ',' ) )
            // InternalBSQLLog2Java.g:3338:1: ( ',' )
            {
            // InternalBSQLLog2Java.g:3338:1: ( ',' )
            // InternalBSQLLog2Java.g:3339:2: ','
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
    // InternalBSQLLog2Java.g:3348:1: rule__StringOperation__Group_4_1__1 : rule__StringOperation__Group_4_1__1__Impl ;
    public final void rule__StringOperation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3352:1: ( rule__StringOperation__Group_4_1__1__Impl )
            // InternalBSQLLog2Java.g:3353:2: rule__StringOperation__Group_4_1__1__Impl
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
    // InternalBSQLLog2Java.g:3359:1: rule__StringOperation__Group_4_1__1__Impl : ( ( rule__StringOperation__PListAssignment_4_1_1 ) ) ;
    public final void rule__StringOperation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3363:1: ( ( ( rule__StringOperation__PListAssignment_4_1_1 ) ) )
            // InternalBSQLLog2Java.g:3364:1: ( ( rule__StringOperation__PListAssignment_4_1_1 ) )
            {
            // InternalBSQLLog2Java.g:3364:1: ( ( rule__StringOperation__PListAssignment_4_1_1 ) )
            // InternalBSQLLog2Java.g:3365:2: ( rule__StringOperation__PListAssignment_4_1_1 )
            {
             before(grammarAccess.getStringOperationAccess().getPListAssignment_4_1_1()); 
            // InternalBSQLLog2Java.g:3366:2: ( rule__StringOperation__PListAssignment_4_1_1 )
            // InternalBSQLLog2Java.g:3366:3: rule__StringOperation__PListAssignment_4_1_1
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
    // InternalBSQLLog2Java.g:3375:1: rule__StringOperation__Group_8__0 : rule__StringOperation__Group_8__0__Impl rule__StringOperation__Group_8__1 ;
    public final void rule__StringOperation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3379:1: ( rule__StringOperation__Group_8__0__Impl rule__StringOperation__Group_8__1 )
            // InternalBSQLLog2Java.g:3380:2: rule__StringOperation__Group_8__0__Impl rule__StringOperation__Group_8__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBSQLLog2Java.g:3387:1: rule__StringOperation__Group_8__0__Impl : ( ( rule__StringOperation__PTypingAssignment_8_0 ) ) ;
    public final void rule__StringOperation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3391:1: ( ( ( rule__StringOperation__PTypingAssignment_8_0 ) ) )
            // InternalBSQLLog2Java.g:3392:1: ( ( rule__StringOperation__PTypingAssignment_8_0 ) )
            {
            // InternalBSQLLog2Java.g:3392:1: ( ( rule__StringOperation__PTypingAssignment_8_0 ) )
            // InternalBSQLLog2Java.g:3393:2: ( rule__StringOperation__PTypingAssignment_8_0 )
            {
             before(grammarAccess.getStringOperationAccess().getPTypingAssignment_8_0()); 
            // InternalBSQLLog2Java.g:3394:2: ( rule__StringOperation__PTypingAssignment_8_0 )
            // InternalBSQLLog2Java.g:3394:3: rule__StringOperation__PTypingAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__PTypingAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getPTypingAssignment_8_0()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:3402:1: rule__StringOperation__Group_8__1 : rule__StringOperation__Group_8__1__Impl ;
    public final void rule__StringOperation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3406:1: ( rule__StringOperation__Group_8__1__Impl )
            // InternalBSQLLog2Java.g:3407:2: rule__StringOperation__Group_8__1__Impl
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
    // InternalBSQLLog2Java.g:3413:1: rule__StringOperation__Group_8__1__Impl : ( ( rule__StringOperation__Group_8_1__0 )* ) ;
    public final void rule__StringOperation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3417:1: ( ( ( rule__StringOperation__Group_8_1__0 )* ) )
            // InternalBSQLLog2Java.g:3418:1: ( ( rule__StringOperation__Group_8_1__0 )* )
            {
            // InternalBSQLLog2Java.g:3418:1: ( ( rule__StringOperation__Group_8_1__0 )* )
            // InternalBSQLLog2Java.g:3419:2: ( rule__StringOperation__Group_8_1__0 )*
            {
             before(grammarAccess.getStringOperationAccess().getGroup_8_1()); 
            // InternalBSQLLog2Java.g:3420:2: ( rule__StringOperation__Group_8_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:3420:3: rule__StringOperation__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__StringOperation__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBSQLLog2Java.g:3429:1: rule__StringOperation__Group_8_1__0 : rule__StringOperation__Group_8_1__0__Impl rule__StringOperation__Group_8_1__1 ;
    public final void rule__StringOperation__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3433:1: ( rule__StringOperation__Group_8_1__0__Impl rule__StringOperation__Group_8_1__1 )
            // InternalBSQLLog2Java.g:3434:2: rule__StringOperation__Group_8_1__0__Impl rule__StringOperation__Group_8_1__1
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
    // InternalBSQLLog2Java.g:3441:1: rule__StringOperation__Group_8_1__0__Impl : ( '&' ) ;
    public final void rule__StringOperation__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3445:1: ( ( '&' ) )
            // InternalBSQLLog2Java.g:3446:1: ( '&' )
            {
            // InternalBSQLLog2Java.g:3446:1: ( '&' )
            // InternalBSQLLog2Java.g:3447:2: '&'
            {
             before(grammarAccess.getStringOperationAccess().getAmpersandKeyword_8_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:3456:1: rule__StringOperation__Group_8_1__1 : rule__StringOperation__Group_8_1__1__Impl ;
    public final void rule__StringOperation__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3460:1: ( rule__StringOperation__Group_8_1__1__Impl )
            // InternalBSQLLog2Java.g:3461:2: rule__StringOperation__Group_8_1__1__Impl
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
    // InternalBSQLLog2Java.g:3467:1: rule__StringOperation__Group_8_1__1__Impl : ( ( rule__StringOperation__PTypingAssignment_8_1_1 ) ) ;
    public final void rule__StringOperation__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3471:1: ( ( ( rule__StringOperation__PTypingAssignment_8_1_1 ) ) )
            // InternalBSQLLog2Java.g:3472:1: ( ( rule__StringOperation__PTypingAssignment_8_1_1 ) )
            {
            // InternalBSQLLog2Java.g:3472:1: ( ( rule__StringOperation__PTypingAssignment_8_1_1 ) )
            // InternalBSQLLog2Java.g:3473:2: ( rule__StringOperation__PTypingAssignment_8_1_1 )
            {
             before(grammarAccess.getStringOperationAccess().getPTypingAssignment_8_1_1()); 
            // InternalBSQLLog2Java.g:3474:2: ( rule__StringOperation__PTypingAssignment_8_1_1 )
            // InternalBSQLLog2Java.g:3474:3: rule__StringOperation__PTypingAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringOperation__PTypingAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringOperationAccess().getPTypingAssignment_8_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BAnyBlock__Group__0"
    // InternalBSQLLog2Java.g:3483:1: rule__BAnyBlock__Group__0 : rule__BAnyBlock__Group__0__Impl rule__BAnyBlock__Group__1 ;
    public final void rule__BAnyBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3487:1: ( rule__BAnyBlock__Group__0__Impl rule__BAnyBlock__Group__1 )
            // InternalBSQLLog2Java.g:3488:2: rule__BAnyBlock__Group__0__Impl rule__BAnyBlock__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BAnyBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__0"


    // $ANTLR start "rule__BAnyBlock__Group__0__Impl"
    // InternalBSQLLog2Java.g:3495:1: rule__BAnyBlock__Group__0__Impl : ( 'ANY' ) ;
    public final void rule__BAnyBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3499:1: ( ( 'ANY' ) )
            // InternalBSQLLog2Java.g:3500:1: ( 'ANY' )
            {
            // InternalBSQLLog2Java.g:3500:1: ( 'ANY' )
            // InternalBSQLLog2Java.g:3501:2: 'ANY'
            {
             before(grammarAccess.getBAnyBlockAccess().getANYKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getANYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__0__Impl"


    // $ANTLR start "rule__BAnyBlock__Group__1"
    // InternalBSQLLog2Java.g:3510:1: rule__BAnyBlock__Group__1 : rule__BAnyBlock__Group__1__Impl rule__BAnyBlock__Group__2 ;
    public final void rule__BAnyBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3514:1: ( rule__BAnyBlock__Group__1__Impl rule__BAnyBlock__Group__2 )
            // InternalBSQLLog2Java.g:3515:2: rule__BAnyBlock__Group__1__Impl rule__BAnyBlock__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__BAnyBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__1"


    // $ANTLR start "rule__BAnyBlock__Group__1__Impl"
    // InternalBSQLLog2Java.g:3522:1: rule__BAnyBlock__Group__1__Impl : ( ( rule__BAnyBlock__Group_1__0 ) ) ;
    public final void rule__BAnyBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3526:1: ( ( ( rule__BAnyBlock__Group_1__0 ) ) )
            // InternalBSQLLog2Java.g:3527:1: ( ( rule__BAnyBlock__Group_1__0 ) )
            {
            // InternalBSQLLog2Java.g:3527:1: ( ( rule__BAnyBlock__Group_1__0 ) )
            // InternalBSQLLog2Java.g:3528:2: ( rule__BAnyBlock__Group_1__0 )
            {
             before(grammarAccess.getBAnyBlockAccess().getGroup_1()); 
            // InternalBSQLLog2Java.g:3529:2: ( rule__BAnyBlock__Group_1__0 )
            // InternalBSQLLog2Java.g:3529:3: rule__BAnyBlock__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__1__Impl"


    // $ANTLR start "rule__BAnyBlock__Group__2"
    // InternalBSQLLog2Java.g:3537:1: rule__BAnyBlock__Group__2 : rule__BAnyBlock__Group__2__Impl rule__BAnyBlock__Group__3 ;
    public final void rule__BAnyBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3541:1: ( rule__BAnyBlock__Group__2__Impl rule__BAnyBlock__Group__3 )
            // InternalBSQLLog2Java.g:3542:2: rule__BAnyBlock__Group__2__Impl rule__BAnyBlock__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__BAnyBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__2"


    // $ANTLR start "rule__BAnyBlock__Group__2__Impl"
    // InternalBSQLLog2Java.g:3549:1: rule__BAnyBlock__Group__2__Impl : ( 'WHERE' ) ;
    public final void rule__BAnyBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3553:1: ( ( 'WHERE' ) )
            // InternalBSQLLog2Java.g:3554:1: ( 'WHERE' )
            {
            // InternalBSQLLog2Java.g:3554:1: ( 'WHERE' )
            // InternalBSQLLog2Java.g:3555:2: 'WHERE'
            {
             before(grammarAccess.getBAnyBlockAccess().getWHEREKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getWHEREKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__2__Impl"


    // $ANTLR start "rule__BAnyBlock__Group__3"
    // InternalBSQLLog2Java.g:3564:1: rule__BAnyBlock__Group__3 : rule__BAnyBlock__Group__3__Impl rule__BAnyBlock__Group__4 ;
    public final void rule__BAnyBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3568:1: ( rule__BAnyBlock__Group__3__Impl rule__BAnyBlock__Group__4 )
            // InternalBSQLLog2Java.g:3569:2: rule__BAnyBlock__Group__3__Impl rule__BAnyBlock__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__BAnyBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__3"


    // $ANTLR start "rule__BAnyBlock__Group__3__Impl"
    // InternalBSQLLog2Java.g:3576:1: rule__BAnyBlock__Group__3__Impl : ( ( rule__BAnyBlock__Group_3__0 ) ) ;
    public final void rule__BAnyBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3580:1: ( ( ( rule__BAnyBlock__Group_3__0 ) ) )
            // InternalBSQLLog2Java.g:3581:1: ( ( rule__BAnyBlock__Group_3__0 ) )
            {
            // InternalBSQLLog2Java.g:3581:1: ( ( rule__BAnyBlock__Group_3__0 ) )
            // InternalBSQLLog2Java.g:3582:2: ( rule__BAnyBlock__Group_3__0 )
            {
             before(grammarAccess.getBAnyBlockAccess().getGroup_3()); 
            // InternalBSQLLog2Java.g:3583:2: ( rule__BAnyBlock__Group_3__0 )
            // InternalBSQLLog2Java.g:3583:3: rule__BAnyBlock__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__3__Impl"


    // $ANTLR start "rule__BAnyBlock__Group__4"
    // InternalBSQLLog2Java.g:3591:1: rule__BAnyBlock__Group__4 : rule__BAnyBlock__Group__4__Impl rule__BAnyBlock__Group__5 ;
    public final void rule__BAnyBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3595:1: ( rule__BAnyBlock__Group__4__Impl rule__BAnyBlock__Group__5 )
            // InternalBSQLLog2Java.g:3596:2: rule__BAnyBlock__Group__4__Impl rule__BAnyBlock__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__BAnyBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__4"


    // $ANTLR start "rule__BAnyBlock__Group__4__Impl"
    // InternalBSQLLog2Java.g:3603:1: rule__BAnyBlock__Group__4__Impl : ( ( '&' )? ) ;
    public final void rule__BAnyBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3607:1: ( ( ( '&' )? ) )
            // InternalBSQLLog2Java.g:3608:1: ( ( '&' )? )
            {
            // InternalBSQLLog2Java.g:3608:1: ( ( '&' )? )
            // InternalBSQLLog2Java.g:3609:2: ( '&' )?
            {
             before(grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_4()); 
            // InternalBSQLLog2Java.g:3610:2: ( '&' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBSQLLog2Java.g:3610:3: '&'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__4__Impl"


    // $ANTLR start "rule__BAnyBlock__Group__5"
    // InternalBSQLLog2Java.g:3618:1: rule__BAnyBlock__Group__5 : rule__BAnyBlock__Group__5__Impl rule__BAnyBlock__Group__6 ;
    public final void rule__BAnyBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3622:1: ( rule__BAnyBlock__Group__5__Impl rule__BAnyBlock__Group__6 )
            // InternalBSQLLog2Java.g:3623:2: rule__BAnyBlock__Group__5__Impl rule__BAnyBlock__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__BAnyBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__5"


    // $ANTLR start "rule__BAnyBlock__Group__5__Impl"
    // InternalBSQLLog2Java.g:3630:1: rule__BAnyBlock__Group__5__Impl : ( ( rule__BAnyBlock__PresAssignment_5 ) ) ;
    public final void rule__BAnyBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3634:1: ( ( ( rule__BAnyBlock__PresAssignment_5 ) ) )
            // InternalBSQLLog2Java.g:3635:1: ( ( rule__BAnyBlock__PresAssignment_5 ) )
            {
            // InternalBSQLLog2Java.g:3635:1: ( ( rule__BAnyBlock__PresAssignment_5 ) )
            // InternalBSQLLog2Java.g:3636:2: ( rule__BAnyBlock__PresAssignment_5 )
            {
             before(grammarAccess.getBAnyBlockAccess().getPresAssignment_5()); 
            // InternalBSQLLog2Java.g:3637:2: ( rule__BAnyBlock__PresAssignment_5 )
            // InternalBSQLLog2Java.g:3637:3: rule__BAnyBlock__PresAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__PresAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getPresAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__5__Impl"


    // $ANTLR start "rule__BAnyBlock__Group__6"
    // InternalBSQLLog2Java.g:3645:1: rule__BAnyBlock__Group__6 : rule__BAnyBlock__Group__6__Impl rule__BAnyBlock__Group__7 ;
    public final void rule__BAnyBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3649:1: ( rule__BAnyBlock__Group__6__Impl rule__BAnyBlock__Group__7 )
            // InternalBSQLLog2Java.g:3650:2: rule__BAnyBlock__Group__6__Impl rule__BAnyBlock__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__BAnyBlock__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__6"


    // $ANTLR start "rule__BAnyBlock__Group__6__Impl"
    // InternalBSQLLog2Java.g:3657:1: rule__BAnyBlock__Group__6__Impl : ( ( rule__BAnyBlock__Group_6__0 )* ) ;
    public final void rule__BAnyBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3661:1: ( ( ( rule__BAnyBlock__Group_6__0 )* ) )
            // InternalBSQLLog2Java.g:3662:1: ( ( rule__BAnyBlock__Group_6__0 )* )
            {
            // InternalBSQLLog2Java.g:3662:1: ( ( rule__BAnyBlock__Group_6__0 )* )
            // InternalBSQLLog2Java.g:3663:2: ( rule__BAnyBlock__Group_6__0 )*
            {
             before(grammarAccess.getBAnyBlockAccess().getGroup_6()); 
            // InternalBSQLLog2Java.g:3664:2: ( rule__BAnyBlock__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:3664:3: rule__BAnyBlock__Group_6__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__BAnyBlock__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBAnyBlockAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__6__Impl"


    // $ANTLR start "rule__BAnyBlock__Group__7"
    // InternalBSQLLog2Java.g:3672:1: rule__BAnyBlock__Group__7 : rule__BAnyBlock__Group__7__Impl rule__BAnyBlock__Group__8 ;
    public final void rule__BAnyBlock__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3676:1: ( rule__BAnyBlock__Group__7__Impl rule__BAnyBlock__Group__8 )
            // InternalBSQLLog2Java.g:3677:2: rule__BAnyBlock__Group__7__Impl rule__BAnyBlock__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__BAnyBlock__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__7"


    // $ANTLR start "rule__BAnyBlock__Group__7__Impl"
    // InternalBSQLLog2Java.g:3684:1: rule__BAnyBlock__Group__7__Impl : ( 'THEN' ) ;
    public final void rule__BAnyBlock__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3688:1: ( ( 'THEN' ) )
            // InternalBSQLLog2Java.g:3689:1: ( 'THEN' )
            {
            // InternalBSQLLog2Java.g:3689:1: ( 'THEN' )
            // InternalBSQLLog2Java.g:3690:2: 'THEN'
            {
             before(grammarAccess.getBAnyBlockAccess().getTHENKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getTHENKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__7__Impl"


    // $ANTLR start "rule__BAnyBlock__Group__8"
    // InternalBSQLLog2Java.g:3699:1: rule__BAnyBlock__Group__8 : rule__BAnyBlock__Group__8__Impl rule__BAnyBlock__Group__9 ;
    public final void rule__BAnyBlock__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3703:1: ( rule__BAnyBlock__Group__8__Impl rule__BAnyBlock__Group__9 )
            // InternalBSQLLog2Java.g:3704:2: rule__BAnyBlock__Group__8__Impl rule__BAnyBlock__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__BAnyBlock__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__8"


    // $ANTLR start "rule__BAnyBlock__Group__8__Impl"
    // InternalBSQLLog2Java.g:3711:1: rule__BAnyBlock__Group__8__Impl : ( ( rule__BAnyBlock__Group_8__0 ) ) ;
    public final void rule__BAnyBlock__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3715:1: ( ( ( rule__BAnyBlock__Group_8__0 ) ) )
            // InternalBSQLLog2Java.g:3716:1: ( ( rule__BAnyBlock__Group_8__0 ) )
            {
            // InternalBSQLLog2Java.g:3716:1: ( ( rule__BAnyBlock__Group_8__0 ) )
            // InternalBSQLLog2Java.g:3717:2: ( rule__BAnyBlock__Group_8__0 )
            {
             before(grammarAccess.getBAnyBlockAccess().getGroup_8()); 
            // InternalBSQLLog2Java.g:3718:2: ( rule__BAnyBlock__Group_8__0 )
            // InternalBSQLLog2Java.g:3718:3: rule__BAnyBlock__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__8__Impl"


    // $ANTLR start "rule__BAnyBlock__Group__9"
    // InternalBSQLLog2Java.g:3726:1: rule__BAnyBlock__Group__9 : rule__BAnyBlock__Group__9__Impl ;
    public final void rule__BAnyBlock__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3730:1: ( rule__BAnyBlock__Group__9__Impl )
            // InternalBSQLLog2Java.g:3731:2: rule__BAnyBlock__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__9"


    // $ANTLR start "rule__BAnyBlock__Group__9__Impl"
    // InternalBSQLLog2Java.g:3737:1: rule__BAnyBlock__Group__9__Impl : ( 'END' ) ;
    public final void rule__BAnyBlock__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3741:1: ( ( 'END' ) )
            // InternalBSQLLog2Java.g:3742:1: ( 'END' )
            {
            // InternalBSQLLog2Java.g:3742:1: ( 'END' )
            // InternalBSQLLog2Java.g:3743:2: 'END'
            {
             before(grammarAccess.getBAnyBlockAccess().getENDKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getENDKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group__9__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_1__0"
    // InternalBSQLLog2Java.g:3753:1: rule__BAnyBlock__Group_1__0 : rule__BAnyBlock__Group_1__0__Impl rule__BAnyBlock__Group_1__1 ;
    public final void rule__BAnyBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3757:1: ( rule__BAnyBlock__Group_1__0__Impl rule__BAnyBlock__Group_1__1 )
            // InternalBSQLLog2Java.g:3758:2: rule__BAnyBlock__Group_1__0__Impl rule__BAnyBlock__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__BAnyBlock__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_1__0"


    // $ANTLR start "rule__BAnyBlock__Group_1__0__Impl"
    // InternalBSQLLog2Java.g:3765:1: rule__BAnyBlock__Group_1__0__Impl : ( ( rule__BAnyBlock__VarListAssignment_1_0 ) ) ;
    public final void rule__BAnyBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3769:1: ( ( ( rule__BAnyBlock__VarListAssignment_1_0 ) ) )
            // InternalBSQLLog2Java.g:3770:1: ( ( rule__BAnyBlock__VarListAssignment_1_0 ) )
            {
            // InternalBSQLLog2Java.g:3770:1: ( ( rule__BAnyBlock__VarListAssignment_1_0 ) )
            // InternalBSQLLog2Java.g:3771:2: ( rule__BAnyBlock__VarListAssignment_1_0 )
            {
             before(grammarAccess.getBAnyBlockAccess().getVarListAssignment_1_0()); 
            // InternalBSQLLog2Java.g:3772:2: ( rule__BAnyBlock__VarListAssignment_1_0 )
            // InternalBSQLLog2Java.g:3772:3: rule__BAnyBlock__VarListAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__VarListAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getVarListAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_1__0__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_1__1"
    // InternalBSQLLog2Java.g:3780:1: rule__BAnyBlock__Group_1__1 : rule__BAnyBlock__Group_1__1__Impl ;
    public final void rule__BAnyBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3784:1: ( rule__BAnyBlock__Group_1__1__Impl )
            // InternalBSQLLog2Java.g:3785:2: rule__BAnyBlock__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_1__1"


    // $ANTLR start "rule__BAnyBlock__Group_1__1__Impl"
    // InternalBSQLLog2Java.g:3791:1: rule__BAnyBlock__Group_1__1__Impl : ( ( rule__BAnyBlock__Group_1_1__0 )* ) ;
    public final void rule__BAnyBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3795:1: ( ( ( rule__BAnyBlock__Group_1_1__0 )* ) )
            // InternalBSQLLog2Java.g:3796:1: ( ( rule__BAnyBlock__Group_1_1__0 )* )
            {
            // InternalBSQLLog2Java.g:3796:1: ( ( rule__BAnyBlock__Group_1_1__0 )* )
            // InternalBSQLLog2Java.g:3797:2: ( rule__BAnyBlock__Group_1_1__0 )*
            {
             before(grammarAccess.getBAnyBlockAccess().getGroup_1_1()); 
            // InternalBSQLLog2Java.g:3798:2: ( rule__BAnyBlock__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:3798:3: rule__BAnyBlock__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BAnyBlock__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBAnyBlockAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_1__1__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_1_1__0"
    // InternalBSQLLog2Java.g:3807:1: rule__BAnyBlock__Group_1_1__0 : rule__BAnyBlock__Group_1_1__0__Impl rule__BAnyBlock__Group_1_1__1 ;
    public final void rule__BAnyBlock__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3811:1: ( rule__BAnyBlock__Group_1_1__0__Impl rule__BAnyBlock__Group_1_1__1 )
            // InternalBSQLLog2Java.g:3812:2: rule__BAnyBlock__Group_1_1__0__Impl rule__BAnyBlock__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BAnyBlock__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_1_1__0"


    // $ANTLR start "rule__BAnyBlock__Group_1_1__0__Impl"
    // InternalBSQLLog2Java.g:3819:1: rule__BAnyBlock__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__BAnyBlock__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3823:1: ( ( ',' ) )
            // InternalBSQLLog2Java.g:3824:1: ( ',' )
            {
            // InternalBSQLLog2Java.g:3824:1: ( ',' )
            // InternalBSQLLog2Java.g:3825:2: ','
            {
             before(grammarAccess.getBAnyBlockAccess().getCommaKeyword_1_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_1_1__0__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_1_1__1"
    // InternalBSQLLog2Java.g:3834:1: rule__BAnyBlock__Group_1_1__1 : rule__BAnyBlock__Group_1_1__1__Impl ;
    public final void rule__BAnyBlock__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3838:1: ( rule__BAnyBlock__Group_1_1__1__Impl )
            // InternalBSQLLog2Java.g:3839:2: rule__BAnyBlock__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_1_1__1"


    // $ANTLR start "rule__BAnyBlock__Group_1_1__1__Impl"
    // InternalBSQLLog2Java.g:3845:1: rule__BAnyBlock__Group_1_1__1__Impl : ( ( rule__BAnyBlock__VarListAssignment_1_1_1 ) ) ;
    public final void rule__BAnyBlock__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3849:1: ( ( ( rule__BAnyBlock__VarListAssignment_1_1_1 ) ) )
            // InternalBSQLLog2Java.g:3850:1: ( ( rule__BAnyBlock__VarListAssignment_1_1_1 ) )
            {
            // InternalBSQLLog2Java.g:3850:1: ( ( rule__BAnyBlock__VarListAssignment_1_1_1 ) )
            // InternalBSQLLog2Java.g:3851:2: ( rule__BAnyBlock__VarListAssignment_1_1_1 )
            {
             before(grammarAccess.getBAnyBlockAccess().getVarListAssignment_1_1_1()); 
            // InternalBSQLLog2Java.g:3852:2: ( rule__BAnyBlock__VarListAssignment_1_1_1 )
            // InternalBSQLLog2Java.g:3852:3: rule__BAnyBlock__VarListAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__VarListAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getVarListAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_1_1__1__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_3__0"
    // InternalBSQLLog2Java.g:3861:1: rule__BAnyBlock__Group_3__0 : rule__BAnyBlock__Group_3__0__Impl rule__BAnyBlock__Group_3__1 ;
    public final void rule__BAnyBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3865:1: ( rule__BAnyBlock__Group_3__0__Impl rule__BAnyBlock__Group_3__1 )
            // InternalBSQLLog2Java.g:3866:2: rule__BAnyBlock__Group_3__0__Impl rule__BAnyBlock__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__BAnyBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_3__0"


    // $ANTLR start "rule__BAnyBlock__Group_3__0__Impl"
    // InternalBSQLLog2Java.g:3873:1: rule__BAnyBlock__Group_3__0__Impl : ( ( rule__BAnyBlock__VarTypingAssignment_3_0 ) ) ;
    public final void rule__BAnyBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3877:1: ( ( ( rule__BAnyBlock__VarTypingAssignment_3_0 ) ) )
            // InternalBSQLLog2Java.g:3878:1: ( ( rule__BAnyBlock__VarTypingAssignment_3_0 ) )
            {
            // InternalBSQLLog2Java.g:3878:1: ( ( rule__BAnyBlock__VarTypingAssignment_3_0 ) )
            // InternalBSQLLog2Java.g:3879:2: ( rule__BAnyBlock__VarTypingAssignment_3_0 )
            {
             before(grammarAccess.getBAnyBlockAccess().getVarTypingAssignment_3_0()); 
            // InternalBSQLLog2Java.g:3880:2: ( rule__BAnyBlock__VarTypingAssignment_3_0 )
            // InternalBSQLLog2Java.g:3880:3: rule__BAnyBlock__VarTypingAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__VarTypingAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getVarTypingAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_3__0__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_3__1"
    // InternalBSQLLog2Java.g:3888:1: rule__BAnyBlock__Group_3__1 : rule__BAnyBlock__Group_3__1__Impl ;
    public final void rule__BAnyBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3892:1: ( rule__BAnyBlock__Group_3__1__Impl )
            // InternalBSQLLog2Java.g:3893:2: rule__BAnyBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_3__1"


    // $ANTLR start "rule__BAnyBlock__Group_3__1__Impl"
    // InternalBSQLLog2Java.g:3899:1: rule__BAnyBlock__Group_3__1__Impl : ( ( rule__BAnyBlock__Group_3_1__0 )* ) ;
    public final void rule__BAnyBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3903:1: ( ( ( rule__BAnyBlock__Group_3_1__0 )* ) )
            // InternalBSQLLog2Java.g:3904:1: ( ( rule__BAnyBlock__Group_3_1__0 )* )
            {
            // InternalBSQLLog2Java.g:3904:1: ( ( rule__BAnyBlock__Group_3_1__0 )* )
            // InternalBSQLLog2Java.g:3905:2: ( rule__BAnyBlock__Group_3_1__0 )*
            {
             before(grammarAccess.getBAnyBlockAccess().getGroup_3_1()); 
            // InternalBSQLLog2Java.g:3906:2: ( rule__BAnyBlock__Group_3_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==RULE_ID) ) {
                        int LA21_3 = input.LA(3);

                        if ( (LA21_3==28) ) {
                            alt21=1;
                        }


                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:3906:3: rule__BAnyBlock__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__BAnyBlock__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBAnyBlockAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_3__1__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_3_1__0"
    // InternalBSQLLog2Java.g:3915:1: rule__BAnyBlock__Group_3_1__0 : rule__BAnyBlock__Group_3_1__0__Impl rule__BAnyBlock__Group_3_1__1 ;
    public final void rule__BAnyBlock__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3919:1: ( rule__BAnyBlock__Group_3_1__0__Impl rule__BAnyBlock__Group_3_1__1 )
            // InternalBSQLLog2Java.g:3920:2: rule__BAnyBlock__Group_3_1__0__Impl rule__BAnyBlock__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BAnyBlock__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_3_1__0"


    // $ANTLR start "rule__BAnyBlock__Group_3_1__0__Impl"
    // InternalBSQLLog2Java.g:3927:1: rule__BAnyBlock__Group_3_1__0__Impl : ( '&' ) ;
    public final void rule__BAnyBlock__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3931:1: ( ( '&' ) )
            // InternalBSQLLog2Java.g:3932:1: ( '&' )
            {
            // InternalBSQLLog2Java.g:3932:1: ( '&' )
            // InternalBSQLLog2Java.g:3933:2: '&'
            {
             before(grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_3_1__0__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_3_1__1"
    // InternalBSQLLog2Java.g:3942:1: rule__BAnyBlock__Group_3_1__1 : rule__BAnyBlock__Group_3_1__1__Impl ;
    public final void rule__BAnyBlock__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3946:1: ( rule__BAnyBlock__Group_3_1__1__Impl )
            // InternalBSQLLog2Java.g:3947:2: rule__BAnyBlock__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_3_1__1"


    // $ANTLR start "rule__BAnyBlock__Group_3_1__1__Impl"
    // InternalBSQLLog2Java.g:3953:1: rule__BAnyBlock__Group_3_1__1__Impl : ( ( rule__BAnyBlock__VarTypingAssignment_3_1_1 ) ) ;
    public final void rule__BAnyBlock__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3957:1: ( ( ( rule__BAnyBlock__VarTypingAssignment_3_1_1 ) ) )
            // InternalBSQLLog2Java.g:3958:1: ( ( rule__BAnyBlock__VarTypingAssignment_3_1_1 ) )
            {
            // InternalBSQLLog2Java.g:3958:1: ( ( rule__BAnyBlock__VarTypingAssignment_3_1_1 ) )
            // InternalBSQLLog2Java.g:3959:2: ( rule__BAnyBlock__VarTypingAssignment_3_1_1 )
            {
             before(grammarAccess.getBAnyBlockAccess().getVarTypingAssignment_3_1_1()); 
            // InternalBSQLLog2Java.g:3960:2: ( rule__BAnyBlock__VarTypingAssignment_3_1_1 )
            // InternalBSQLLog2Java.g:3960:3: rule__BAnyBlock__VarTypingAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__VarTypingAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getVarTypingAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_3_1__1__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_6__0"
    // InternalBSQLLog2Java.g:3969:1: rule__BAnyBlock__Group_6__0 : rule__BAnyBlock__Group_6__0__Impl rule__BAnyBlock__Group_6__1 ;
    public final void rule__BAnyBlock__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3973:1: ( rule__BAnyBlock__Group_6__0__Impl rule__BAnyBlock__Group_6__1 )
            // InternalBSQLLog2Java.g:3974:2: rule__BAnyBlock__Group_6__0__Impl rule__BAnyBlock__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__BAnyBlock__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_6__0"


    // $ANTLR start "rule__BAnyBlock__Group_6__0__Impl"
    // InternalBSQLLog2Java.g:3981:1: rule__BAnyBlock__Group_6__0__Impl : ( '&' ) ;
    public final void rule__BAnyBlock__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:3985:1: ( ( '&' ) )
            // InternalBSQLLog2Java.g:3986:1: ( '&' )
            {
            // InternalBSQLLog2Java.g:3986:1: ( '&' )
            // InternalBSQLLog2Java.g:3987:2: '&'
            {
             before(grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_6__0__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_6__1"
    // InternalBSQLLog2Java.g:3996:1: rule__BAnyBlock__Group_6__1 : rule__BAnyBlock__Group_6__1__Impl ;
    public final void rule__BAnyBlock__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4000:1: ( rule__BAnyBlock__Group_6__1__Impl )
            // InternalBSQLLog2Java.g:4001:2: rule__BAnyBlock__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_6__1"


    // $ANTLR start "rule__BAnyBlock__Group_6__1__Impl"
    // InternalBSQLLog2Java.g:4007:1: rule__BAnyBlock__Group_6__1__Impl : ( ( rule__BAnyBlock__PresAssignment_6_1 ) ) ;
    public final void rule__BAnyBlock__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4011:1: ( ( ( rule__BAnyBlock__PresAssignment_6_1 ) ) )
            // InternalBSQLLog2Java.g:4012:1: ( ( rule__BAnyBlock__PresAssignment_6_1 ) )
            {
            // InternalBSQLLog2Java.g:4012:1: ( ( rule__BAnyBlock__PresAssignment_6_1 ) )
            // InternalBSQLLog2Java.g:4013:2: ( rule__BAnyBlock__PresAssignment_6_1 )
            {
             before(grammarAccess.getBAnyBlockAccess().getPresAssignment_6_1()); 
            // InternalBSQLLog2Java.g:4014:2: ( rule__BAnyBlock__PresAssignment_6_1 )
            // InternalBSQLLog2Java.g:4014:3: rule__BAnyBlock__PresAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__PresAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getPresAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_6__1__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_8__0"
    // InternalBSQLLog2Java.g:4023:1: rule__BAnyBlock__Group_8__0 : rule__BAnyBlock__Group_8__0__Impl rule__BAnyBlock__Group_8__1 ;
    public final void rule__BAnyBlock__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4027:1: ( rule__BAnyBlock__Group_8__0__Impl rule__BAnyBlock__Group_8__1 )
            // InternalBSQLLog2Java.g:4028:2: rule__BAnyBlock__Group_8__0__Impl rule__BAnyBlock__Group_8__1
            {
            pushFollow(FOLLOW_36);
            rule__BAnyBlock__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_8__0"


    // $ANTLR start "rule__BAnyBlock__Group_8__0__Impl"
    // InternalBSQLLog2Java.g:4035:1: rule__BAnyBlock__Group_8__0__Impl : ( ( rule__BAnyBlock__SubsAssignment_8_0 ) ) ;
    public final void rule__BAnyBlock__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4039:1: ( ( ( rule__BAnyBlock__SubsAssignment_8_0 ) ) )
            // InternalBSQLLog2Java.g:4040:1: ( ( rule__BAnyBlock__SubsAssignment_8_0 ) )
            {
            // InternalBSQLLog2Java.g:4040:1: ( ( rule__BAnyBlock__SubsAssignment_8_0 ) )
            // InternalBSQLLog2Java.g:4041:2: ( rule__BAnyBlock__SubsAssignment_8_0 )
            {
             before(grammarAccess.getBAnyBlockAccess().getSubsAssignment_8_0()); 
            // InternalBSQLLog2Java.g:4042:2: ( rule__BAnyBlock__SubsAssignment_8_0 )
            // InternalBSQLLog2Java.g:4042:3: rule__BAnyBlock__SubsAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__SubsAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getSubsAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_8__0__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_8__1"
    // InternalBSQLLog2Java.g:4050:1: rule__BAnyBlock__Group_8__1 : rule__BAnyBlock__Group_8__1__Impl ;
    public final void rule__BAnyBlock__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4054:1: ( rule__BAnyBlock__Group_8__1__Impl )
            // InternalBSQLLog2Java.g:4055:2: rule__BAnyBlock__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_8__1"


    // $ANTLR start "rule__BAnyBlock__Group_8__1__Impl"
    // InternalBSQLLog2Java.g:4061:1: rule__BAnyBlock__Group_8__1__Impl : ( ( rule__BAnyBlock__Group_8_1__0 )* ) ;
    public final void rule__BAnyBlock__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4065:1: ( ( ( rule__BAnyBlock__Group_8_1__0 )* ) )
            // InternalBSQLLog2Java.g:4066:1: ( ( rule__BAnyBlock__Group_8_1__0 )* )
            {
            // InternalBSQLLog2Java.g:4066:1: ( ( rule__BAnyBlock__Group_8_1__0 )* )
            // InternalBSQLLog2Java.g:4067:2: ( rule__BAnyBlock__Group_8_1__0 )*
            {
             before(grammarAccess.getBAnyBlockAccess().getGroup_8_1()); 
            // InternalBSQLLog2Java.g:4068:2: ( rule__BAnyBlock__Group_8_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:4068:3: rule__BAnyBlock__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__BAnyBlock__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBAnyBlockAccess().getGroup_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_8__1__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_8_1__0"
    // InternalBSQLLog2Java.g:4077:1: rule__BAnyBlock__Group_8_1__0 : rule__BAnyBlock__Group_8_1__0__Impl rule__BAnyBlock__Group_8_1__1 ;
    public final void rule__BAnyBlock__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4081:1: ( rule__BAnyBlock__Group_8_1__0__Impl rule__BAnyBlock__Group_8_1__1 )
            // InternalBSQLLog2Java.g:4082:2: rule__BAnyBlock__Group_8_1__0__Impl rule__BAnyBlock__Group_8_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BAnyBlock__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_8_1__0"


    // $ANTLR start "rule__BAnyBlock__Group_8_1__0__Impl"
    // InternalBSQLLog2Java.g:4089:1: rule__BAnyBlock__Group_8_1__0__Impl : ( '||' ) ;
    public final void rule__BAnyBlock__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4093:1: ( ( '||' ) )
            // InternalBSQLLog2Java.g:4094:1: ( '||' )
            {
            // InternalBSQLLog2Java.g:4094:1: ( '||' )
            // InternalBSQLLog2Java.g:4095:2: '||'
            {
             before(grammarAccess.getBAnyBlockAccess().getVerticalLineVerticalLineKeyword_8_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getVerticalLineVerticalLineKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_8_1__0__Impl"


    // $ANTLR start "rule__BAnyBlock__Group_8_1__1"
    // InternalBSQLLog2Java.g:4104:1: rule__BAnyBlock__Group_8_1__1 : rule__BAnyBlock__Group_8_1__1__Impl ;
    public final void rule__BAnyBlock__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4108:1: ( rule__BAnyBlock__Group_8_1__1__Impl )
            // InternalBSQLLog2Java.g:4109:2: rule__BAnyBlock__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_8_1__1"


    // $ANTLR start "rule__BAnyBlock__Group_8_1__1__Impl"
    // InternalBSQLLog2Java.g:4115:1: rule__BAnyBlock__Group_8_1__1__Impl : ( ( rule__BAnyBlock__SubsAssignment_8_1_1 ) ) ;
    public final void rule__BAnyBlock__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4119:1: ( ( ( rule__BAnyBlock__SubsAssignment_8_1_1 ) ) )
            // InternalBSQLLog2Java.g:4120:1: ( ( rule__BAnyBlock__SubsAssignment_8_1_1 ) )
            {
            // InternalBSQLLog2Java.g:4120:1: ( ( rule__BAnyBlock__SubsAssignment_8_1_1 ) )
            // InternalBSQLLog2Java.g:4121:2: ( rule__BAnyBlock__SubsAssignment_8_1_1 )
            {
             before(grammarAccess.getBAnyBlockAccess().getSubsAssignment_8_1_1()); 
            // InternalBSQLLog2Java.g:4122:2: ( rule__BAnyBlock__SubsAssignment_8_1_1 )
            // InternalBSQLLog2Java.g:4122:3: rule__BAnyBlock__SubsAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BAnyBlock__SubsAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBAnyBlockAccess().getSubsAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__Group_8_1__1__Impl"


    // $ANTLR start "rule__VoidOperation__Group__0"
    // InternalBSQLLog2Java.g:4131:1: rule__VoidOperation__Group__0 : rule__VoidOperation__Group__0__Impl rule__VoidOperation__Group__1 ;
    public final void rule__VoidOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4135:1: ( rule__VoidOperation__Group__0__Impl rule__VoidOperation__Group__1 )
            // InternalBSQLLog2Java.g:4136:2: rule__VoidOperation__Group__0__Impl rule__VoidOperation__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBSQLLog2Java.g:4143:1: rule__VoidOperation__Group__0__Impl : ( ( rule__VoidOperation__Op_nameAssignment_0 ) ) ;
    public final void rule__VoidOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4147:1: ( ( ( rule__VoidOperation__Op_nameAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:4148:1: ( ( rule__VoidOperation__Op_nameAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:4148:1: ( ( rule__VoidOperation__Op_nameAssignment_0 ) )
            // InternalBSQLLog2Java.g:4149:2: ( rule__VoidOperation__Op_nameAssignment_0 )
            {
             before(grammarAccess.getVoidOperationAccess().getOp_nameAssignment_0()); 
            // InternalBSQLLog2Java.g:4150:2: ( rule__VoidOperation__Op_nameAssignment_0 )
            // InternalBSQLLog2Java.g:4150:3: rule__VoidOperation__Op_nameAssignment_0
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
    // InternalBSQLLog2Java.g:4158:1: rule__VoidOperation__Group__1 : rule__VoidOperation__Group__1__Impl rule__VoidOperation__Group__2 ;
    public final void rule__VoidOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4162:1: ( rule__VoidOperation__Group__1__Impl rule__VoidOperation__Group__2 )
            // InternalBSQLLog2Java.g:4163:2: rule__VoidOperation__Group__1__Impl rule__VoidOperation__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSQLLog2Java.g:4170:1: rule__VoidOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__VoidOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4174:1: ( ( '(' ) )
            // InternalBSQLLog2Java.g:4175:1: ( '(' )
            {
            // InternalBSQLLog2Java.g:4175:1: ( '(' )
            // InternalBSQLLog2Java.g:4176:2: '('
            {
             before(grammarAccess.getVoidOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:4185:1: rule__VoidOperation__Group__2 : rule__VoidOperation__Group__2__Impl rule__VoidOperation__Group__3 ;
    public final void rule__VoidOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4189:1: ( rule__VoidOperation__Group__2__Impl rule__VoidOperation__Group__3 )
            // InternalBSQLLog2Java.g:4190:2: rule__VoidOperation__Group__2__Impl rule__VoidOperation__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSQLLog2Java.g:4197:1: rule__VoidOperation__Group__2__Impl : ( ( rule__VoidOperation__Group_2__0 )? ) ;
    public final void rule__VoidOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4201:1: ( ( ( rule__VoidOperation__Group_2__0 )? ) )
            // InternalBSQLLog2Java.g:4202:1: ( ( rule__VoidOperation__Group_2__0 )? )
            {
            // InternalBSQLLog2Java.g:4202:1: ( ( rule__VoidOperation__Group_2__0 )? )
            // InternalBSQLLog2Java.g:4203:2: ( rule__VoidOperation__Group_2__0 )?
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_2()); 
            // InternalBSQLLog2Java.g:4204:2: ( rule__VoidOperation__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBSQLLog2Java.g:4204:3: rule__VoidOperation__Group_2__0
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
    // InternalBSQLLog2Java.g:4212:1: rule__VoidOperation__Group__3 : rule__VoidOperation__Group__3__Impl rule__VoidOperation__Group__4 ;
    public final void rule__VoidOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4216:1: ( rule__VoidOperation__Group__3__Impl rule__VoidOperation__Group__4 )
            // InternalBSQLLog2Java.g:4217:2: rule__VoidOperation__Group__3__Impl rule__VoidOperation__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalBSQLLog2Java.g:4224:1: rule__VoidOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__VoidOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4228:1: ( ( ')' ) )
            // InternalBSQLLog2Java.g:4229:1: ( ')' )
            {
            // InternalBSQLLog2Java.g:4229:1: ( ')' )
            // InternalBSQLLog2Java.g:4230:2: ')'
            {
             before(grammarAccess.getVoidOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:4239:1: rule__VoidOperation__Group__4 : rule__VoidOperation__Group__4__Impl rule__VoidOperation__Group__5 ;
    public final void rule__VoidOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4243:1: ( rule__VoidOperation__Group__4__Impl rule__VoidOperation__Group__5 )
            // InternalBSQLLog2Java.g:4244:2: rule__VoidOperation__Group__4__Impl rule__VoidOperation__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSQLLog2Java.g:4251:1: rule__VoidOperation__Group__4__Impl : ( '=' ) ;
    public final void rule__VoidOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4255:1: ( ( '=' ) )
            // InternalBSQLLog2Java.g:4256:1: ( '=' )
            {
            // InternalBSQLLog2Java.g:4256:1: ( '=' )
            // InternalBSQLLog2Java.g:4257:2: '='
            {
             before(grammarAccess.getVoidOperationAccess().getEqualsSignKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:4266:1: rule__VoidOperation__Group__5 : rule__VoidOperation__Group__5__Impl rule__VoidOperation__Group__6 ;
    public final void rule__VoidOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4270:1: ( rule__VoidOperation__Group__5__Impl rule__VoidOperation__Group__6 )
            // InternalBSQLLog2Java.g:4271:2: rule__VoidOperation__Group__5__Impl rule__VoidOperation__Group__6
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
    // InternalBSQLLog2Java.g:4278:1: rule__VoidOperation__Group__5__Impl : ( 'PRE' ) ;
    public final void rule__VoidOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4282:1: ( ( 'PRE' ) )
            // InternalBSQLLog2Java.g:4283:1: ( 'PRE' )
            {
            // InternalBSQLLog2Java.g:4283:1: ( 'PRE' )
            // InternalBSQLLog2Java.g:4284:2: 'PRE'
            {
             before(grammarAccess.getVoidOperationAccess().getPREKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:4293:1: rule__VoidOperation__Group__6 : rule__VoidOperation__Group__6__Impl rule__VoidOperation__Group__7 ;
    public final void rule__VoidOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4297:1: ( rule__VoidOperation__Group__6__Impl rule__VoidOperation__Group__7 )
            // InternalBSQLLog2Java.g:4298:2: rule__VoidOperation__Group__6__Impl rule__VoidOperation__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalBSQLLog2Java.g:4305:1: rule__VoidOperation__Group__6__Impl : ( ( rule__VoidOperation__Group_6__0 ) ) ;
    public final void rule__VoidOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4309:1: ( ( ( rule__VoidOperation__Group_6__0 ) ) )
            // InternalBSQLLog2Java.g:4310:1: ( ( rule__VoidOperation__Group_6__0 ) )
            {
            // InternalBSQLLog2Java.g:4310:1: ( ( rule__VoidOperation__Group_6__0 ) )
            // InternalBSQLLog2Java.g:4311:2: ( rule__VoidOperation__Group_6__0 )
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_6()); 
            // InternalBSQLLog2Java.g:4312:2: ( rule__VoidOperation__Group_6__0 )
            // InternalBSQLLog2Java.g:4312:3: rule__VoidOperation__Group_6__0
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
    // InternalBSQLLog2Java.g:4320:1: rule__VoidOperation__Group__7 : rule__VoidOperation__Group__7__Impl rule__VoidOperation__Group__8 ;
    public final void rule__VoidOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4324:1: ( rule__VoidOperation__Group__7__Impl rule__VoidOperation__Group__8 )
            // InternalBSQLLog2Java.g:4325:2: rule__VoidOperation__Group__7__Impl rule__VoidOperation__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalBSQLLog2Java.g:4332:1: rule__VoidOperation__Group__7__Impl : ( 'THEN' ) ;
    public final void rule__VoidOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4336:1: ( ( 'THEN' ) )
            // InternalBSQLLog2Java.g:4337:1: ( 'THEN' )
            {
            // InternalBSQLLog2Java.g:4337:1: ( 'THEN' )
            // InternalBSQLLog2Java.g:4338:2: 'THEN'
            {
             before(grammarAccess.getVoidOperationAccess().getTHENKeyword_7()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:4347:1: rule__VoidOperation__Group__8 : rule__VoidOperation__Group__8__Impl rule__VoidOperation__Group__9 ;
    public final void rule__VoidOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4351:1: ( rule__VoidOperation__Group__8__Impl rule__VoidOperation__Group__9 )
            // InternalBSQLLog2Java.g:4352:2: rule__VoidOperation__Group__8__Impl rule__VoidOperation__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalBSQLLog2Java.g:4359:1: rule__VoidOperation__Group__8__Impl : ( ( rule__VoidOperation__SubsAssignment_8 ) ) ;
    public final void rule__VoidOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4363:1: ( ( ( rule__VoidOperation__SubsAssignment_8 ) ) )
            // InternalBSQLLog2Java.g:4364:1: ( ( rule__VoidOperation__SubsAssignment_8 ) )
            {
            // InternalBSQLLog2Java.g:4364:1: ( ( rule__VoidOperation__SubsAssignment_8 ) )
            // InternalBSQLLog2Java.g:4365:2: ( rule__VoidOperation__SubsAssignment_8 )
            {
             before(grammarAccess.getVoidOperationAccess().getSubsAssignment_8()); 
            // InternalBSQLLog2Java.g:4366:2: ( rule__VoidOperation__SubsAssignment_8 )
            // InternalBSQLLog2Java.g:4366:3: rule__VoidOperation__SubsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__SubsAssignment_8();

            state._fsp--;


            }

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
    // InternalBSQLLog2Java.g:4374:1: rule__VoidOperation__Group__9 : rule__VoidOperation__Group__9__Impl rule__VoidOperation__Group__10 ;
    public final void rule__VoidOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4378:1: ( rule__VoidOperation__Group__9__Impl rule__VoidOperation__Group__10 )
            // InternalBSQLLog2Java.g:4379:2: rule__VoidOperation__Group__9__Impl rule__VoidOperation__Group__10
            {
            pushFollow(FOLLOW_38);
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
    // InternalBSQLLog2Java.g:4386:1: rule__VoidOperation__Group__9__Impl : ( ( rule__VoidOperation__Group_9__0 )* ) ;
    public final void rule__VoidOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4390:1: ( ( ( rule__VoidOperation__Group_9__0 )* ) )
            // InternalBSQLLog2Java.g:4391:1: ( ( rule__VoidOperation__Group_9__0 )* )
            {
            // InternalBSQLLog2Java.g:4391:1: ( ( rule__VoidOperation__Group_9__0 )* )
            // InternalBSQLLog2Java.g:4392:2: ( rule__VoidOperation__Group_9__0 )*
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_9()); 
            // InternalBSQLLog2Java.g:4393:2: ( rule__VoidOperation__Group_9__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:4393:3: rule__VoidOperation__Group_9__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__VoidOperation__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getVoidOperationAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:4401:1: rule__VoidOperation__Group__10 : rule__VoidOperation__Group__10__Impl ;
    public final void rule__VoidOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4405:1: ( rule__VoidOperation__Group__10__Impl )
            // InternalBSQLLog2Java.g:4406:2: rule__VoidOperation__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group__10__Impl();

            state._fsp--;


            }

        }
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
    // InternalBSQLLog2Java.g:4412:1: rule__VoidOperation__Group__10__Impl : ( 'END' ) ;
    public final void rule__VoidOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4416:1: ( ( 'END' ) )
            // InternalBSQLLog2Java.g:4417:1: ( 'END' )
            {
            // InternalBSQLLog2Java.g:4417:1: ( 'END' )
            // InternalBSQLLog2Java.g:4418:2: 'END'
            {
             before(grammarAccess.getVoidOperationAccess().getENDKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getENDKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__VoidOperation__Group_2__0"
    // InternalBSQLLog2Java.g:4428:1: rule__VoidOperation__Group_2__0 : rule__VoidOperation__Group_2__0__Impl rule__VoidOperation__Group_2__1 ;
    public final void rule__VoidOperation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4432:1: ( rule__VoidOperation__Group_2__0__Impl rule__VoidOperation__Group_2__1 )
            // InternalBSQLLog2Java.g:4433:2: rule__VoidOperation__Group_2__0__Impl rule__VoidOperation__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBSQLLog2Java.g:4440:1: rule__VoidOperation__Group_2__0__Impl : ( ( rule__VoidOperation__PListAssignment_2_0 ) ) ;
    public final void rule__VoidOperation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4444:1: ( ( ( rule__VoidOperation__PListAssignment_2_0 ) ) )
            // InternalBSQLLog2Java.g:4445:1: ( ( rule__VoidOperation__PListAssignment_2_0 ) )
            {
            // InternalBSQLLog2Java.g:4445:1: ( ( rule__VoidOperation__PListAssignment_2_0 ) )
            // InternalBSQLLog2Java.g:4446:2: ( rule__VoidOperation__PListAssignment_2_0 )
            {
             before(grammarAccess.getVoidOperationAccess().getPListAssignment_2_0()); 
            // InternalBSQLLog2Java.g:4447:2: ( rule__VoidOperation__PListAssignment_2_0 )
            // InternalBSQLLog2Java.g:4447:3: rule__VoidOperation__PListAssignment_2_0
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
    // InternalBSQLLog2Java.g:4455:1: rule__VoidOperation__Group_2__1 : rule__VoidOperation__Group_2__1__Impl ;
    public final void rule__VoidOperation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4459:1: ( rule__VoidOperation__Group_2__1__Impl )
            // InternalBSQLLog2Java.g:4460:2: rule__VoidOperation__Group_2__1__Impl
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
    // InternalBSQLLog2Java.g:4466:1: rule__VoidOperation__Group_2__1__Impl : ( ( rule__VoidOperation__Group_2_1__0 )* ) ;
    public final void rule__VoidOperation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4470:1: ( ( ( rule__VoidOperation__Group_2_1__0 )* ) )
            // InternalBSQLLog2Java.g:4471:1: ( ( rule__VoidOperation__Group_2_1__0 )* )
            {
            // InternalBSQLLog2Java.g:4471:1: ( ( rule__VoidOperation__Group_2_1__0 )* )
            // InternalBSQLLog2Java.g:4472:2: ( rule__VoidOperation__Group_2_1__0 )*
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_2_1()); 
            // InternalBSQLLog2Java.g:4473:2: ( rule__VoidOperation__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:4473:3: rule__VoidOperation__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VoidOperation__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalBSQLLog2Java.g:4482:1: rule__VoidOperation__Group_2_1__0 : rule__VoidOperation__Group_2_1__0__Impl rule__VoidOperation__Group_2_1__1 ;
    public final void rule__VoidOperation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4486:1: ( rule__VoidOperation__Group_2_1__0__Impl rule__VoidOperation__Group_2_1__1 )
            // InternalBSQLLog2Java.g:4487:2: rule__VoidOperation__Group_2_1__0__Impl rule__VoidOperation__Group_2_1__1
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
    // InternalBSQLLog2Java.g:4494:1: rule__VoidOperation__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__VoidOperation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4498:1: ( ( ',' ) )
            // InternalBSQLLog2Java.g:4499:1: ( ',' )
            {
            // InternalBSQLLog2Java.g:4499:1: ( ',' )
            // InternalBSQLLog2Java.g:4500:2: ','
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
    // InternalBSQLLog2Java.g:4509:1: rule__VoidOperation__Group_2_1__1 : rule__VoidOperation__Group_2_1__1__Impl ;
    public final void rule__VoidOperation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4513:1: ( rule__VoidOperation__Group_2_1__1__Impl )
            // InternalBSQLLog2Java.g:4514:2: rule__VoidOperation__Group_2_1__1__Impl
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
    // InternalBSQLLog2Java.g:4520:1: rule__VoidOperation__Group_2_1__1__Impl : ( ( rule__VoidOperation__PListAssignment_2_1_1 ) ) ;
    public final void rule__VoidOperation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4524:1: ( ( ( rule__VoidOperation__PListAssignment_2_1_1 ) ) )
            // InternalBSQLLog2Java.g:4525:1: ( ( rule__VoidOperation__PListAssignment_2_1_1 ) )
            {
            // InternalBSQLLog2Java.g:4525:1: ( ( rule__VoidOperation__PListAssignment_2_1_1 ) )
            // InternalBSQLLog2Java.g:4526:2: ( rule__VoidOperation__PListAssignment_2_1_1 )
            {
             before(grammarAccess.getVoidOperationAccess().getPListAssignment_2_1_1()); 
            // InternalBSQLLog2Java.g:4527:2: ( rule__VoidOperation__PListAssignment_2_1_1 )
            // InternalBSQLLog2Java.g:4527:3: rule__VoidOperation__PListAssignment_2_1_1
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
    // InternalBSQLLog2Java.g:4536:1: rule__VoidOperation__Group_6__0 : rule__VoidOperation__Group_6__0__Impl rule__VoidOperation__Group_6__1 ;
    public final void rule__VoidOperation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4540:1: ( rule__VoidOperation__Group_6__0__Impl rule__VoidOperation__Group_6__1 )
            // InternalBSQLLog2Java.g:4541:2: rule__VoidOperation__Group_6__0__Impl rule__VoidOperation__Group_6__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBSQLLog2Java.g:4548:1: rule__VoidOperation__Group_6__0__Impl : ( ( rule__VoidOperation__PTypingAssignment_6_0 ) ) ;
    public final void rule__VoidOperation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4552:1: ( ( ( rule__VoidOperation__PTypingAssignment_6_0 ) ) )
            // InternalBSQLLog2Java.g:4553:1: ( ( rule__VoidOperation__PTypingAssignment_6_0 ) )
            {
            // InternalBSQLLog2Java.g:4553:1: ( ( rule__VoidOperation__PTypingAssignment_6_0 ) )
            // InternalBSQLLog2Java.g:4554:2: ( rule__VoidOperation__PTypingAssignment_6_0 )
            {
             before(grammarAccess.getVoidOperationAccess().getPTypingAssignment_6_0()); 
            // InternalBSQLLog2Java.g:4555:2: ( rule__VoidOperation__PTypingAssignment_6_0 )
            // InternalBSQLLog2Java.g:4555:3: rule__VoidOperation__PTypingAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__PTypingAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getPTypingAssignment_6_0()); 

            }


            }

        }
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
    // InternalBSQLLog2Java.g:4563:1: rule__VoidOperation__Group_6__1 : rule__VoidOperation__Group_6__1__Impl ;
    public final void rule__VoidOperation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4567:1: ( rule__VoidOperation__Group_6__1__Impl )
            // InternalBSQLLog2Java.g:4568:2: rule__VoidOperation__Group_6__1__Impl
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
    // InternalBSQLLog2Java.g:4574:1: rule__VoidOperation__Group_6__1__Impl : ( ( rule__VoidOperation__Group_6_1__0 )* ) ;
    public final void rule__VoidOperation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4578:1: ( ( ( rule__VoidOperation__Group_6_1__0 )* ) )
            // InternalBSQLLog2Java.g:4579:1: ( ( rule__VoidOperation__Group_6_1__0 )* )
            {
            // InternalBSQLLog2Java.g:4579:1: ( ( rule__VoidOperation__Group_6_1__0 )* )
            // InternalBSQLLog2Java.g:4580:2: ( rule__VoidOperation__Group_6_1__0 )*
            {
             before(grammarAccess.getVoidOperationAccess().getGroup_6_1()); 
            // InternalBSQLLog2Java.g:4581:2: ( rule__VoidOperation__Group_6_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:4581:3: rule__VoidOperation__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__VoidOperation__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalBSQLLog2Java.g:4590:1: rule__VoidOperation__Group_6_1__0 : rule__VoidOperation__Group_6_1__0__Impl rule__VoidOperation__Group_6_1__1 ;
    public final void rule__VoidOperation__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4594:1: ( rule__VoidOperation__Group_6_1__0__Impl rule__VoidOperation__Group_6_1__1 )
            // InternalBSQLLog2Java.g:4595:2: rule__VoidOperation__Group_6_1__0__Impl rule__VoidOperation__Group_6_1__1
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
    // InternalBSQLLog2Java.g:4602:1: rule__VoidOperation__Group_6_1__0__Impl : ( '&' ) ;
    public final void rule__VoidOperation__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4606:1: ( ( '&' ) )
            // InternalBSQLLog2Java.g:4607:1: ( '&' )
            {
            // InternalBSQLLog2Java.g:4607:1: ( '&' )
            // InternalBSQLLog2Java.g:4608:2: '&'
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
    // InternalBSQLLog2Java.g:4617:1: rule__VoidOperation__Group_6_1__1 : rule__VoidOperation__Group_6_1__1__Impl ;
    public final void rule__VoidOperation__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4621:1: ( rule__VoidOperation__Group_6_1__1__Impl )
            // InternalBSQLLog2Java.g:4622:2: rule__VoidOperation__Group_6_1__1__Impl
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
    // InternalBSQLLog2Java.g:4628:1: rule__VoidOperation__Group_6_1__1__Impl : ( ( rule__VoidOperation__PTypingAssignment_6_1_1 ) ) ;
    public final void rule__VoidOperation__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4632:1: ( ( ( rule__VoidOperation__PTypingAssignment_6_1_1 ) ) )
            // InternalBSQLLog2Java.g:4633:1: ( ( rule__VoidOperation__PTypingAssignment_6_1_1 ) )
            {
            // InternalBSQLLog2Java.g:4633:1: ( ( rule__VoidOperation__PTypingAssignment_6_1_1 ) )
            // InternalBSQLLog2Java.g:4634:2: ( rule__VoidOperation__PTypingAssignment_6_1_1 )
            {
             before(grammarAccess.getVoidOperationAccess().getPTypingAssignment_6_1_1()); 
            // InternalBSQLLog2Java.g:4635:2: ( rule__VoidOperation__PTypingAssignment_6_1_1 )
            // InternalBSQLLog2Java.g:4635:3: rule__VoidOperation__PTypingAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__PTypingAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getPTypingAssignment_6_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__VoidOperation__Group_9__0"
    // InternalBSQLLog2Java.g:4644:1: rule__VoidOperation__Group_9__0 : rule__VoidOperation__Group_9__0__Impl rule__VoidOperation__Group_9__1 ;
    public final void rule__VoidOperation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4648:1: ( rule__VoidOperation__Group_9__0__Impl rule__VoidOperation__Group_9__1 )
            // InternalBSQLLog2Java.g:4649:2: rule__VoidOperation__Group_9__0__Impl rule__VoidOperation__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__VoidOperation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidOperation__Group_9__0"


    // $ANTLR start "rule__VoidOperation__Group_9__0__Impl"
    // InternalBSQLLog2Java.g:4656:1: rule__VoidOperation__Group_9__0__Impl : ( '||' ) ;
    public final void rule__VoidOperation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4660:1: ( ( '||' ) )
            // InternalBSQLLog2Java.g:4661:1: ( '||' )
            {
            // InternalBSQLLog2Java.g:4661:1: ( '||' )
            // InternalBSQLLog2Java.g:4662:2: '||'
            {
             before(grammarAccess.getVoidOperationAccess().getVerticalLineVerticalLineKeyword_9_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVoidOperationAccess().getVerticalLineVerticalLineKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidOperation__Group_9__0__Impl"


    // $ANTLR start "rule__VoidOperation__Group_9__1"
    // InternalBSQLLog2Java.g:4671:1: rule__VoidOperation__Group_9__1 : rule__VoidOperation__Group_9__1__Impl ;
    public final void rule__VoidOperation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4675:1: ( rule__VoidOperation__Group_9__1__Impl )
            // InternalBSQLLog2Java.g:4676:2: rule__VoidOperation__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidOperation__Group_9__1"


    // $ANTLR start "rule__VoidOperation__Group_9__1__Impl"
    // InternalBSQLLog2Java.g:4682:1: rule__VoidOperation__Group_9__1__Impl : ( ( rule__VoidOperation__SubsAssignment_9_1 ) ) ;
    public final void rule__VoidOperation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4686:1: ( ( ( rule__VoidOperation__SubsAssignment_9_1 ) ) )
            // InternalBSQLLog2Java.g:4687:1: ( ( rule__VoidOperation__SubsAssignment_9_1 ) )
            {
            // InternalBSQLLog2Java.g:4687:1: ( ( rule__VoidOperation__SubsAssignment_9_1 ) )
            // InternalBSQLLog2Java.g:4688:2: ( rule__VoidOperation__SubsAssignment_9_1 )
            {
             before(grammarAccess.getVoidOperationAccess().getSubsAssignment_9_1()); 
            // InternalBSQLLog2Java.g:4689:2: ( rule__VoidOperation__SubsAssignment_9_1 )
            // InternalBSQLLog2Java.g:4689:3: rule__VoidOperation__SubsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__VoidOperation__SubsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getVoidOperationAccess().getSubsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidOperation__Group_9__1__Impl"


    // $ANTLR start "rule__BPredicate__Group__0"
    // InternalBSQLLog2Java.g:4698:1: rule__BPredicate__Group__0 : rule__BPredicate__Group__0__Impl rule__BPredicate__Group__1 ;
    public final void rule__BPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4702:1: ( rule__BPredicate__Group__0__Impl rule__BPredicate__Group__1 )
            // InternalBSQLLog2Java.g:4703:2: rule__BPredicate__Group__0__Impl rule__BPredicate__Group__1
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
    // InternalBSQLLog2Java.g:4710:1: rule__BPredicate__Group__0__Impl : ( () ) ;
    public final void rule__BPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4714:1: ( ( () ) )
            // InternalBSQLLog2Java.g:4715:1: ( () )
            {
            // InternalBSQLLog2Java.g:4715:1: ( () )
            // InternalBSQLLog2Java.g:4716:2: ()
            {
             before(grammarAccess.getBPredicateAccess().getBPredicateAction_0()); 
            // InternalBSQLLog2Java.g:4717:2: ()
            // InternalBSQLLog2Java.g:4717:3: 
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
    // InternalBSQLLog2Java.g:4725:1: rule__BPredicate__Group__1 : rule__BPredicate__Group__1__Impl ;
    public final void rule__BPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4729:1: ( rule__BPredicate__Group__1__Impl )
            // InternalBSQLLog2Java.g:4730:2: rule__BPredicate__Group__1__Impl
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
    // InternalBSQLLog2Java.g:4736:1: rule__BPredicate__Group__1__Impl : ( ( rule__BPredicate__Group_1__0 ) ) ;
    public final void rule__BPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4740:1: ( ( ( rule__BPredicate__Group_1__0 ) ) )
            // InternalBSQLLog2Java.g:4741:1: ( ( rule__BPredicate__Group_1__0 ) )
            {
            // InternalBSQLLog2Java.g:4741:1: ( ( rule__BPredicate__Group_1__0 ) )
            // InternalBSQLLog2Java.g:4742:2: ( rule__BPredicate__Group_1__0 )
            {
             before(grammarAccess.getBPredicateAccess().getGroup_1()); 
            // InternalBSQLLog2Java.g:4743:2: ( rule__BPredicate__Group_1__0 )
            // InternalBSQLLog2Java.g:4743:3: rule__BPredicate__Group_1__0
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
    // InternalBSQLLog2Java.g:4752:1: rule__BPredicate__Group_1__0 : rule__BPredicate__Group_1__0__Impl rule__BPredicate__Group_1__1 ;
    public final void rule__BPredicate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4756:1: ( rule__BPredicate__Group_1__0__Impl rule__BPredicate__Group_1__1 )
            // InternalBSQLLog2Java.g:4757:2: rule__BPredicate__Group_1__0__Impl rule__BPredicate__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBSQLLog2Java.g:4764:1: rule__BPredicate__Group_1__0__Impl : ( ( rule__BPredicate__PLeftAssignment_1_0 ) ) ;
    public final void rule__BPredicate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4768:1: ( ( ( rule__BPredicate__PLeftAssignment_1_0 ) ) )
            // InternalBSQLLog2Java.g:4769:1: ( ( rule__BPredicate__PLeftAssignment_1_0 ) )
            {
            // InternalBSQLLog2Java.g:4769:1: ( ( rule__BPredicate__PLeftAssignment_1_0 ) )
            // InternalBSQLLog2Java.g:4770:2: ( rule__BPredicate__PLeftAssignment_1_0 )
            {
             before(grammarAccess.getBPredicateAccess().getPLeftAssignment_1_0()); 
            // InternalBSQLLog2Java.g:4771:2: ( rule__BPredicate__PLeftAssignment_1_0 )
            // InternalBSQLLog2Java.g:4771:3: rule__BPredicate__PLeftAssignment_1_0
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
    // InternalBSQLLog2Java.g:4779:1: rule__BPredicate__Group_1__1 : rule__BPredicate__Group_1__1__Impl rule__BPredicate__Group_1__2 ;
    public final void rule__BPredicate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4783:1: ( rule__BPredicate__Group_1__1__Impl rule__BPredicate__Group_1__2 )
            // InternalBSQLLog2Java.g:4784:2: rule__BPredicate__Group_1__1__Impl rule__BPredicate__Group_1__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalBSQLLog2Java.g:4791:1: rule__BPredicate__Group_1__1__Impl : ( '=' ) ;
    public final void rule__BPredicate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4795:1: ( ( '=' ) )
            // InternalBSQLLog2Java.g:4796:1: ( '=' )
            {
            // InternalBSQLLog2Java.g:4796:1: ( '=' )
            // InternalBSQLLog2Java.g:4797:2: '='
            {
             before(grammarAccess.getBPredicateAccess().getEqualsSignKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:4806:1: rule__BPredicate__Group_1__2 : rule__BPredicate__Group_1__2__Impl ;
    public final void rule__BPredicate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4810:1: ( rule__BPredicate__Group_1__2__Impl )
            // InternalBSQLLog2Java.g:4811:2: rule__BPredicate__Group_1__2__Impl
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
    // InternalBSQLLog2Java.g:4817:1: rule__BPredicate__Group_1__2__Impl : ( ( rule__BPredicate__PRightAssignment_1_2 ) ) ;
    public final void rule__BPredicate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4821:1: ( ( ( rule__BPredicate__PRightAssignment_1_2 ) ) )
            // InternalBSQLLog2Java.g:4822:1: ( ( rule__BPredicate__PRightAssignment_1_2 ) )
            {
            // InternalBSQLLog2Java.g:4822:1: ( ( rule__BPredicate__PRightAssignment_1_2 ) )
            // InternalBSQLLog2Java.g:4823:2: ( rule__BPredicate__PRightAssignment_1_2 )
            {
             before(grammarAccess.getBPredicateAccess().getPRightAssignment_1_2()); 
            // InternalBSQLLog2Java.g:4824:2: ( rule__BPredicate__PRightAssignment_1_2 )
            // InternalBSQLLog2Java.g:4824:3: rule__BPredicate__PRightAssignment_1_2
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
    // InternalBSQLLog2Java.g:4833:1: rule__SQLCall__Group__0 : rule__SQLCall__Group__0__Impl rule__SQLCall__Group__1 ;
    public final void rule__SQLCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4837:1: ( rule__SQLCall__Group__0__Impl rule__SQLCall__Group__1 )
            // InternalBSQLLog2Java.g:4838:2: rule__SQLCall__Group__0__Impl rule__SQLCall__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalBSQLLog2Java.g:4845:1: rule__SQLCall__Group__0__Impl : ( ( rule__SQLCall__SLeftAssignment_0 ) ) ;
    public final void rule__SQLCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4849:1: ( ( ( rule__SQLCall__SLeftAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:4850:1: ( ( rule__SQLCall__SLeftAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:4850:1: ( ( rule__SQLCall__SLeftAssignment_0 ) )
            // InternalBSQLLog2Java.g:4851:2: ( rule__SQLCall__SLeftAssignment_0 )
            {
             before(grammarAccess.getSQLCallAccess().getSLeftAssignment_0()); 
            // InternalBSQLLog2Java.g:4852:2: ( rule__SQLCall__SLeftAssignment_0 )
            // InternalBSQLLog2Java.g:4852:3: rule__SQLCall__SLeftAssignment_0
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
    // InternalBSQLLog2Java.g:4860:1: rule__SQLCall__Group__1 : rule__SQLCall__Group__1__Impl rule__SQLCall__Group__2 ;
    public final void rule__SQLCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4864:1: ( rule__SQLCall__Group__1__Impl rule__SQLCall__Group__2 )
            // InternalBSQLLog2Java.g:4865:2: rule__SQLCall__Group__1__Impl rule__SQLCall__Group__2
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
    // InternalBSQLLog2Java.g:4872:1: rule__SQLCall__Group__1__Impl : ( '\\'' ) ;
    public final void rule__SQLCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4876:1: ( ( '\\'' ) )
            // InternalBSQLLog2Java.g:4877:1: ( '\\'' )
            {
            // InternalBSQLLog2Java.g:4877:1: ( '\\'' )
            // InternalBSQLLog2Java.g:4878:2: '\\''
            {
             before(grammarAccess.getSQLCallAccess().getApostropheKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:4887:1: rule__SQLCall__Group__2 : rule__SQLCall__Group__2__Impl ;
    public final void rule__SQLCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4891:1: ( rule__SQLCall__Group__2__Impl )
            // InternalBSQLLog2Java.g:4892:2: rule__SQLCall__Group__2__Impl
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
    // InternalBSQLLog2Java.g:4898:1: rule__SQLCall__Group__2__Impl : ( ( rule__SQLCall__SRightAssignment_2 ) ) ;
    public final void rule__SQLCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4902:1: ( ( ( rule__SQLCall__SRightAssignment_2 ) ) )
            // InternalBSQLLog2Java.g:4903:1: ( ( rule__SQLCall__SRightAssignment_2 ) )
            {
            // InternalBSQLLog2Java.g:4903:1: ( ( rule__SQLCall__SRightAssignment_2 ) )
            // InternalBSQLLog2Java.g:4904:2: ( rule__SQLCall__SRightAssignment_2 )
            {
             before(grammarAccess.getSQLCallAccess().getSRightAssignment_2()); 
            // InternalBSQLLog2Java.g:4905:2: ( rule__SQLCall__SRightAssignment_2 )
            // InternalBSQLLog2Java.g:4905:3: rule__SQLCall__SRightAssignment_2
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
    // InternalBSQLLog2Java.g:4914:1: rule__TableInstance__Group__0 : rule__TableInstance__Group__0__Impl rule__TableInstance__Group__1 ;
    public final void rule__TableInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4918:1: ( rule__TableInstance__Group__0__Impl rule__TableInstance__Group__1 )
            // InternalBSQLLog2Java.g:4919:2: rule__TableInstance__Group__0__Impl rule__TableInstance__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalBSQLLog2Java.g:4926:1: rule__TableInstance__Group__0__Impl : ( ( rule__TableInstance__Ti_nameAssignment_0 ) ) ;
    public final void rule__TableInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4930:1: ( ( ( rule__TableInstance__Ti_nameAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:4931:1: ( ( rule__TableInstance__Ti_nameAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:4931:1: ( ( rule__TableInstance__Ti_nameAssignment_0 ) )
            // InternalBSQLLog2Java.g:4932:2: ( rule__TableInstance__Ti_nameAssignment_0 )
            {
             before(grammarAccess.getTableInstanceAccess().getTi_nameAssignment_0()); 
            // InternalBSQLLog2Java.g:4933:2: ( rule__TableInstance__Ti_nameAssignment_0 )
            // InternalBSQLLog2Java.g:4933:3: rule__TableInstance__Ti_nameAssignment_0
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
    // InternalBSQLLog2Java.g:4941:1: rule__TableInstance__Group__1 : rule__TableInstance__Group__1__Impl rule__TableInstance__Group__2 ;
    public final void rule__TableInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4945:1: ( rule__TableInstance__Group__1__Impl rule__TableInstance__Group__2 )
            // InternalBSQLLog2Java.g:4946:2: rule__TableInstance__Group__1__Impl rule__TableInstance__Group__2
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
    // InternalBSQLLog2Java.g:4953:1: rule__TableInstance__Group__1__Impl : ( '.(' ) ;
    public final void rule__TableInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4957:1: ( ( '.(' ) )
            // InternalBSQLLog2Java.g:4958:1: ( '.(' )
            {
            // InternalBSQLLog2Java.g:4958:1: ( '.(' )
            // InternalBSQLLog2Java.g:4959:2: '.('
            {
             before(grammarAccess.getTableInstanceAccess().getFullStopLeftParenthesisKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:4968:1: rule__TableInstance__Group__2 : rule__TableInstance__Group__2__Impl ;
    public final void rule__TableInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4972:1: ( rule__TableInstance__Group__2__Impl )
            // InternalBSQLLog2Java.g:4973:2: rule__TableInstance__Group__2__Impl
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
    // InternalBSQLLog2Java.g:4979:1: rule__TableInstance__Group__2__Impl : ( ( rule__TableInstance__Ti_typeAssignment_2 ) ) ;
    public final void rule__TableInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4983:1: ( ( ( rule__TableInstance__Ti_typeAssignment_2 ) ) )
            // InternalBSQLLog2Java.g:4984:1: ( ( rule__TableInstance__Ti_typeAssignment_2 ) )
            {
            // InternalBSQLLog2Java.g:4984:1: ( ( rule__TableInstance__Ti_typeAssignment_2 ) )
            // InternalBSQLLog2Java.g:4985:2: ( rule__TableInstance__Ti_typeAssignment_2 )
            {
             before(grammarAccess.getTableInstanceAccess().getTi_typeAssignment_2()); 
            // InternalBSQLLog2Java.g:4986:2: ( rule__TableInstance__Ti_typeAssignment_2 )
            // InternalBSQLLog2Java.g:4986:3: rule__TableInstance__Ti_typeAssignment_2
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
    // InternalBSQLLog2Java.g:4995:1: rule__TIAssignment__Group__0 : rule__TIAssignment__Group__0__Impl rule__TIAssignment__Group__1 ;
    public final void rule__TIAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:4999:1: ( rule__TIAssignment__Group__0__Impl rule__TIAssignment__Group__1 )
            // InternalBSQLLog2Java.g:5000:2: rule__TIAssignment__Group__0__Impl rule__TIAssignment__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBSQLLog2Java.g:5007:1: rule__TIAssignment__Group__0__Impl : ( ( rule__TIAssignment__Instance_nameAssignment_0 ) ) ;
    public final void rule__TIAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5011:1: ( ( ( rule__TIAssignment__Instance_nameAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:5012:1: ( ( rule__TIAssignment__Instance_nameAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:5012:1: ( ( rule__TIAssignment__Instance_nameAssignment_0 ) )
            // InternalBSQLLog2Java.g:5013:2: ( rule__TIAssignment__Instance_nameAssignment_0 )
            {
             before(grammarAccess.getTIAssignmentAccess().getInstance_nameAssignment_0()); 
            // InternalBSQLLog2Java.g:5014:2: ( rule__TIAssignment__Instance_nameAssignment_0 )
            // InternalBSQLLog2Java.g:5014:3: rule__TIAssignment__Instance_nameAssignment_0
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
    // InternalBSQLLog2Java.g:5022:1: rule__TIAssignment__Group__1 : rule__TIAssignment__Group__1__Impl rule__TIAssignment__Group__2 ;
    public final void rule__TIAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5026:1: ( rule__TIAssignment__Group__1__Impl rule__TIAssignment__Group__2 )
            // InternalBSQLLog2Java.g:5027:2: rule__TIAssignment__Group__1__Impl rule__TIAssignment__Group__2
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
    // InternalBSQLLog2Java.g:5034:1: rule__TIAssignment__Group__1__Impl : ( ':' ) ;
    public final void rule__TIAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5038:1: ( ( ':' ) )
            // InternalBSQLLog2Java.g:5039:1: ( ':' )
            {
            // InternalBSQLLog2Java.g:5039:1: ( ':' )
            // InternalBSQLLog2Java.g:5040:2: ':'
            {
             before(grammarAccess.getTIAssignmentAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBSQLLog2Java.g:5049:1: rule__TIAssignment__Group__2 : rule__TIAssignment__Group__2__Impl ;
    public final void rule__TIAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5053:1: ( rule__TIAssignment__Group__2__Impl )
            // InternalBSQLLog2Java.g:5054:2: rule__TIAssignment__Group__2__Impl
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
    // InternalBSQLLog2Java.g:5060:1: rule__TIAssignment__Group__2__Impl : ( ( rule__TIAssignment__Instance_typeAssignment_2 ) ) ;
    public final void rule__TIAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5064:1: ( ( ( rule__TIAssignment__Instance_typeAssignment_2 ) ) )
            // InternalBSQLLog2Java.g:5065:1: ( ( rule__TIAssignment__Instance_typeAssignment_2 ) )
            {
            // InternalBSQLLog2Java.g:5065:1: ( ( rule__TIAssignment__Instance_typeAssignment_2 ) )
            // InternalBSQLLog2Java.g:5066:2: ( rule__TIAssignment__Instance_typeAssignment_2 )
            {
             before(grammarAccess.getTIAssignmentAccess().getInstance_typeAssignment_2()); 
            // InternalBSQLLog2Java.g:5067:2: ( rule__TIAssignment__Instance_typeAssignment_2 )
            // InternalBSQLLog2Java.g:5067:3: rule__TIAssignment__Instance_typeAssignment_2
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


    // $ANTLR start "rule__BParameterTyping__Group__0"
    // InternalBSQLLog2Java.g:5076:1: rule__BParameterTyping__Group__0 : rule__BParameterTyping__Group__0__Impl rule__BParameterTyping__Group__1 ;
    public final void rule__BParameterTyping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5080:1: ( rule__BParameterTyping__Group__0__Impl rule__BParameterTyping__Group__1 )
            // InternalBSQLLog2Java.g:5081:2: rule__BParameterTyping__Group__0__Impl rule__BParameterTyping__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__BParameterTyping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BParameterTyping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BParameterTyping__Group__0"


    // $ANTLR start "rule__BParameterTyping__Group__0__Impl"
    // InternalBSQLLog2Java.g:5088:1: rule__BParameterTyping__Group__0__Impl : ( ( rule__BParameterTyping__P_nameAssignment_0 ) ) ;
    public final void rule__BParameterTyping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5092:1: ( ( ( rule__BParameterTyping__P_nameAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:5093:1: ( ( rule__BParameterTyping__P_nameAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:5093:1: ( ( rule__BParameterTyping__P_nameAssignment_0 ) )
            // InternalBSQLLog2Java.g:5094:2: ( rule__BParameterTyping__P_nameAssignment_0 )
            {
             before(grammarAccess.getBParameterTypingAccess().getP_nameAssignment_0()); 
            // InternalBSQLLog2Java.g:5095:2: ( rule__BParameterTyping__P_nameAssignment_0 )
            // InternalBSQLLog2Java.g:5095:3: rule__BParameterTyping__P_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BParameterTyping__P_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBParameterTypingAccess().getP_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BParameterTyping__Group__0__Impl"


    // $ANTLR start "rule__BParameterTyping__Group__1"
    // InternalBSQLLog2Java.g:5103:1: rule__BParameterTyping__Group__1 : rule__BParameterTyping__Group__1__Impl rule__BParameterTyping__Group__2 ;
    public final void rule__BParameterTyping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5107:1: ( rule__BParameterTyping__Group__1__Impl rule__BParameterTyping__Group__2 )
            // InternalBSQLLog2Java.g:5108:2: rule__BParameterTyping__Group__1__Impl rule__BParameterTyping__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BParameterTyping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BParameterTyping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BParameterTyping__Group__1"


    // $ANTLR start "rule__BParameterTyping__Group__1__Impl"
    // InternalBSQLLog2Java.g:5115:1: rule__BParameterTyping__Group__1__Impl : ( ':' ) ;
    public final void rule__BParameterTyping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5119:1: ( ( ':' ) )
            // InternalBSQLLog2Java.g:5120:1: ( ':' )
            {
            // InternalBSQLLog2Java.g:5120:1: ( ':' )
            // InternalBSQLLog2Java.g:5121:2: ':'
            {
             before(grammarAccess.getBParameterTypingAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBParameterTypingAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BParameterTyping__Group__1__Impl"


    // $ANTLR start "rule__BParameterTyping__Group__2"
    // InternalBSQLLog2Java.g:5130:1: rule__BParameterTyping__Group__2 : rule__BParameterTyping__Group__2__Impl ;
    public final void rule__BParameterTyping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5134:1: ( rule__BParameterTyping__Group__2__Impl )
            // InternalBSQLLog2Java.g:5135:2: rule__BParameterTyping__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BParameterTyping__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BParameterTyping__Group__2"


    // $ANTLR start "rule__BParameterTyping__Group__2__Impl"
    // InternalBSQLLog2Java.g:5141:1: rule__BParameterTyping__Group__2__Impl : ( ( rule__BParameterTyping__TypeAssignment_2 ) ) ;
    public final void rule__BParameterTyping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5145:1: ( ( ( rule__BParameterTyping__TypeAssignment_2 ) ) )
            // InternalBSQLLog2Java.g:5146:1: ( ( rule__BParameterTyping__TypeAssignment_2 ) )
            {
            // InternalBSQLLog2Java.g:5146:1: ( ( rule__BParameterTyping__TypeAssignment_2 ) )
            // InternalBSQLLog2Java.g:5147:2: ( rule__BParameterTyping__TypeAssignment_2 )
            {
             before(grammarAccess.getBParameterTypingAccess().getTypeAssignment_2()); 
            // InternalBSQLLog2Java.g:5148:2: ( rule__BParameterTyping__TypeAssignment_2 )
            // InternalBSQLLog2Java.g:5148:3: rule__BParameterTyping__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BParameterTyping__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBParameterTypingAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BParameterTyping__Group__2__Impl"


    // $ANTLR start "rule__BSubstitution__Group__0"
    // InternalBSQLLog2Java.g:5157:1: rule__BSubstitution__Group__0 : rule__BSubstitution__Group__0__Impl rule__BSubstitution__Group__1 ;
    public final void rule__BSubstitution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5161:1: ( rule__BSubstitution__Group__0__Impl rule__BSubstitution__Group__1 )
            // InternalBSQLLog2Java.g:5162:2: rule__BSubstitution__Group__0__Impl rule__BSubstitution__Group__1
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
    // InternalBSQLLog2Java.g:5169:1: rule__BSubstitution__Group__0__Impl : ( ( rule__BSubstitution__LeftAssignment_0 ) ) ;
    public final void rule__BSubstitution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5173:1: ( ( ( rule__BSubstitution__LeftAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:5174:1: ( ( rule__BSubstitution__LeftAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:5174:1: ( ( rule__BSubstitution__LeftAssignment_0 ) )
            // InternalBSQLLog2Java.g:5175:2: ( rule__BSubstitution__LeftAssignment_0 )
            {
             before(grammarAccess.getBSubstitutionAccess().getLeftAssignment_0()); 
            // InternalBSQLLog2Java.g:5176:2: ( rule__BSubstitution__LeftAssignment_0 )
            // InternalBSQLLog2Java.g:5176:3: rule__BSubstitution__LeftAssignment_0
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
    // InternalBSQLLog2Java.g:5184:1: rule__BSubstitution__Group__1 : rule__BSubstitution__Group__1__Impl rule__BSubstitution__Group__2 ;
    public final void rule__BSubstitution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5188:1: ( rule__BSubstitution__Group__1__Impl rule__BSubstitution__Group__2 )
            // InternalBSQLLog2Java.g:5189:2: rule__BSubstitution__Group__1__Impl rule__BSubstitution__Group__2
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
    // InternalBSQLLog2Java.g:5196:1: rule__BSubstitution__Group__1__Impl : ( ':=' ) ;
    public final void rule__BSubstitution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5200:1: ( ( ':=' ) )
            // InternalBSQLLog2Java.g:5201:1: ( ':=' )
            {
            // InternalBSQLLog2Java.g:5201:1: ( ':=' )
            // InternalBSQLLog2Java.g:5202:2: ':='
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
    // InternalBSQLLog2Java.g:5211:1: rule__BSubstitution__Group__2 : rule__BSubstitution__Group__2__Impl ;
    public final void rule__BSubstitution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5215:1: ( rule__BSubstitution__Group__2__Impl )
            // InternalBSQLLog2Java.g:5216:2: rule__BSubstitution__Group__2__Impl
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
    // InternalBSQLLog2Java.g:5222:1: rule__BSubstitution__Group__2__Impl : ( ( rule__BSubstitution__Alternatives_2 ) ) ;
    public final void rule__BSubstitution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5226:1: ( ( ( rule__BSubstitution__Alternatives_2 ) ) )
            // InternalBSQLLog2Java.g:5227:1: ( ( rule__BSubstitution__Alternatives_2 ) )
            {
            // InternalBSQLLog2Java.g:5227:1: ( ( rule__BSubstitution__Alternatives_2 ) )
            // InternalBSQLLog2Java.g:5228:2: ( rule__BSubstitution__Alternatives_2 )
            {
             before(grammarAccess.getBSubstitutionAccess().getAlternatives_2()); 
            // InternalBSQLLog2Java.g:5229:2: ( rule__BSubstitution__Alternatives_2 )
            // InternalBSQLLog2Java.g:5229:3: rule__BSubstitution__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__BSubstitution__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getBSubstitutionAccess().getAlternatives_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__BUnion__Group__0"
    // InternalBSQLLog2Java.g:5238:1: rule__BUnion__Group__0 : rule__BUnion__Group__0__Impl rule__BUnion__Group__1 ;
    public final void rule__BUnion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5242:1: ( rule__BUnion__Group__0__Impl rule__BUnion__Group__1 )
            // InternalBSQLLog2Java.g:5243:2: rule__BUnion__Group__0__Impl rule__BUnion__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__BUnion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BUnion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUnion__Group__0"


    // $ANTLR start "rule__BUnion__Group__0__Impl"
    // InternalBSQLLog2Java.g:5250:1: rule__BUnion__Group__0__Impl : ( ( rule__BUnion__SetAssignment_0 ) ) ;
    public final void rule__BUnion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5254:1: ( ( ( rule__BUnion__SetAssignment_0 ) ) )
            // InternalBSQLLog2Java.g:5255:1: ( ( rule__BUnion__SetAssignment_0 ) )
            {
            // InternalBSQLLog2Java.g:5255:1: ( ( rule__BUnion__SetAssignment_0 ) )
            // InternalBSQLLog2Java.g:5256:2: ( rule__BUnion__SetAssignment_0 )
            {
             before(grammarAccess.getBUnionAccess().getSetAssignment_0()); 
            // InternalBSQLLog2Java.g:5257:2: ( rule__BUnion__SetAssignment_0 )
            // InternalBSQLLog2Java.g:5257:3: rule__BUnion__SetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BUnion__SetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBUnionAccess().getSetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUnion__Group__0__Impl"


    // $ANTLR start "rule__BUnion__Group__1"
    // InternalBSQLLog2Java.g:5265:1: rule__BUnion__Group__1 : rule__BUnion__Group__1__Impl rule__BUnion__Group__2 ;
    public final void rule__BUnion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5269:1: ( rule__BUnion__Group__1__Impl rule__BUnion__Group__2 )
            // InternalBSQLLog2Java.g:5270:2: rule__BUnion__Group__1__Impl rule__BUnion__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__BUnion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BUnion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUnion__Group__1"


    // $ANTLR start "rule__BUnion__Group__1__Impl"
    // InternalBSQLLog2Java.g:5277:1: rule__BUnion__Group__1__Impl : ( '\\\\/' ) ;
    public final void rule__BUnion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5281:1: ( ( '\\\\/' ) )
            // InternalBSQLLog2Java.g:5282:1: ( '\\\\/' )
            {
            // InternalBSQLLog2Java.g:5282:1: ( '\\\\/' )
            // InternalBSQLLog2Java.g:5283:2: '\\\\/'
            {
             before(grammarAccess.getBUnionAccess().getReverseSolidusSolidusKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBUnionAccess().getReverseSolidusSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUnion__Group__1__Impl"


    // $ANTLR start "rule__BUnion__Group__2"
    // InternalBSQLLog2Java.g:5292:1: rule__BUnion__Group__2 : rule__BUnion__Group__2__Impl ;
    public final void rule__BUnion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5296:1: ( rule__BUnion__Group__2__Impl )
            // InternalBSQLLog2Java.g:5297:2: rule__BUnion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BUnion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUnion__Group__2"


    // $ANTLR start "rule__BUnion__Group__2__Impl"
    // InternalBSQLLog2Java.g:5303:1: rule__BUnion__Group__2__Impl : ( ( rule__BUnion__Alternatives_2 ) ) ;
    public final void rule__BUnion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5307:1: ( ( ( rule__BUnion__Alternatives_2 ) ) )
            // InternalBSQLLog2Java.g:5308:1: ( ( rule__BUnion__Alternatives_2 ) )
            {
            // InternalBSQLLog2Java.g:5308:1: ( ( rule__BUnion__Alternatives_2 ) )
            // InternalBSQLLog2Java.g:5309:2: ( rule__BUnion__Alternatives_2 )
            {
             before(grammarAccess.getBUnionAccess().getAlternatives_2()); 
            // InternalBSQLLog2Java.g:5310:2: ( rule__BUnion__Alternatives_2 )
            // InternalBSQLLog2Java.g:5310:3: rule__BUnion__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__BUnion__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getBUnionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUnion__Group__2__Impl"


    // $ANTLR start "rule__BElementStructure__Group__0"
    // InternalBSQLLog2Java.g:5319:1: rule__BElementStructure__Group__0 : rule__BElementStructure__Group__0__Impl rule__BElementStructure__Group__1 ;
    public final void rule__BElementStructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5323:1: ( rule__BElementStructure__Group__0__Impl rule__BElementStructure__Group__1 )
            // InternalBSQLLog2Java.g:5324:2: rule__BElementStructure__Group__0__Impl rule__BElementStructure__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__BElementStructure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BElementStructure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__0"


    // $ANTLR start "rule__BElementStructure__Group__0__Impl"
    // InternalBSQLLog2Java.g:5331:1: rule__BElementStructure__Group__0__Impl : ( '{' ) ;
    public final void rule__BElementStructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5335:1: ( ( '{' ) )
            // InternalBSQLLog2Java.g:5336:1: ( '{' )
            {
            // InternalBSQLLog2Java.g:5336:1: ( '{' )
            // InternalBSQLLog2Java.g:5337:2: '{'
            {
             before(grammarAccess.getBElementStructureAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBElementStructureAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__0__Impl"


    // $ANTLR start "rule__BElementStructure__Group__1"
    // InternalBSQLLog2Java.g:5346:1: rule__BElementStructure__Group__1 : rule__BElementStructure__Group__1__Impl rule__BElementStructure__Group__2 ;
    public final void rule__BElementStructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5350:1: ( rule__BElementStructure__Group__1__Impl rule__BElementStructure__Group__2 )
            // InternalBSQLLog2Java.g:5351:2: rule__BElementStructure__Group__1__Impl rule__BElementStructure__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BElementStructure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BElementStructure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__1"


    // $ANTLR start "rule__BElementStructure__Group__1__Impl"
    // InternalBSQLLog2Java.g:5358:1: rule__BElementStructure__Group__1__Impl : ( 'rec(' ) ;
    public final void rule__BElementStructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5362:1: ( ( 'rec(' ) )
            // InternalBSQLLog2Java.g:5363:1: ( 'rec(' )
            {
            // InternalBSQLLog2Java.g:5363:1: ( 'rec(' )
            // InternalBSQLLog2Java.g:5364:2: 'rec('
            {
             before(grammarAccess.getBElementStructureAccess().getRecKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBElementStructureAccess().getRecKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__1__Impl"


    // $ANTLR start "rule__BElementStructure__Group__2"
    // InternalBSQLLog2Java.g:5373:1: rule__BElementStructure__Group__2 : rule__BElementStructure__Group__2__Impl rule__BElementStructure__Group__3 ;
    public final void rule__BElementStructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5377:1: ( rule__BElementStructure__Group__2__Impl rule__BElementStructure__Group__3 )
            // InternalBSQLLog2Java.g:5378:2: rule__BElementStructure__Group__2__Impl rule__BElementStructure__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__BElementStructure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BElementStructure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__2"


    // $ANTLR start "rule__BElementStructure__Group__2__Impl"
    // InternalBSQLLog2Java.g:5385:1: rule__BElementStructure__Group__2__Impl : ( ( rule__BElementStructure__EAssignment_2 ) ) ;
    public final void rule__BElementStructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5389:1: ( ( ( rule__BElementStructure__EAssignment_2 ) ) )
            // InternalBSQLLog2Java.g:5390:1: ( ( rule__BElementStructure__EAssignment_2 ) )
            {
            // InternalBSQLLog2Java.g:5390:1: ( ( rule__BElementStructure__EAssignment_2 ) )
            // InternalBSQLLog2Java.g:5391:2: ( rule__BElementStructure__EAssignment_2 )
            {
             before(grammarAccess.getBElementStructureAccess().getEAssignment_2()); 
            // InternalBSQLLog2Java.g:5392:2: ( rule__BElementStructure__EAssignment_2 )
            // InternalBSQLLog2Java.g:5392:3: rule__BElementStructure__EAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BElementStructure__EAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBElementStructureAccess().getEAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__2__Impl"


    // $ANTLR start "rule__BElementStructure__Group__3"
    // InternalBSQLLog2Java.g:5400:1: rule__BElementStructure__Group__3 : rule__BElementStructure__Group__3__Impl rule__BElementStructure__Group__4 ;
    public final void rule__BElementStructure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5404:1: ( rule__BElementStructure__Group__3__Impl rule__BElementStructure__Group__4 )
            // InternalBSQLLog2Java.g:5405:2: rule__BElementStructure__Group__3__Impl rule__BElementStructure__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__BElementStructure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BElementStructure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__3"


    // $ANTLR start "rule__BElementStructure__Group__3__Impl"
    // InternalBSQLLog2Java.g:5412:1: rule__BElementStructure__Group__3__Impl : ( ( rule__BElementStructure__Group_3__0 )* ) ;
    public final void rule__BElementStructure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5416:1: ( ( ( rule__BElementStructure__Group_3__0 )* ) )
            // InternalBSQLLog2Java.g:5417:1: ( ( rule__BElementStructure__Group_3__0 )* )
            {
            // InternalBSQLLog2Java.g:5417:1: ( ( rule__BElementStructure__Group_3__0 )* )
            // InternalBSQLLog2Java.g:5418:2: ( rule__BElementStructure__Group_3__0 )*
            {
             before(grammarAccess.getBElementStructureAccess().getGroup_3()); 
            // InternalBSQLLog2Java.g:5419:2: ( rule__BElementStructure__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:5419:3: rule__BElementStructure__Group_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BElementStructure__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getBElementStructureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__3__Impl"


    // $ANTLR start "rule__BElementStructure__Group__4"
    // InternalBSQLLog2Java.g:5427:1: rule__BElementStructure__Group__4 : rule__BElementStructure__Group__4__Impl ;
    public final void rule__BElementStructure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5431:1: ( rule__BElementStructure__Group__4__Impl )
            // InternalBSQLLog2Java.g:5432:2: rule__BElementStructure__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BElementStructure__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__4"


    // $ANTLR start "rule__BElementStructure__Group__4__Impl"
    // InternalBSQLLog2Java.g:5438:1: rule__BElementStructure__Group__4__Impl : ( ')}' ) ;
    public final void rule__BElementStructure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5442:1: ( ( ')}' ) )
            // InternalBSQLLog2Java.g:5443:1: ( ')}' )
            {
            // InternalBSQLLog2Java.g:5443:1: ( ')}' )
            // InternalBSQLLog2Java.g:5444:2: ')}'
            {
             before(grammarAccess.getBElementStructureAccess().getRightParenthesisRightCurlyBracketKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBElementStructureAccess().getRightParenthesisRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group__4__Impl"


    // $ANTLR start "rule__BElementStructure__Group_3__0"
    // InternalBSQLLog2Java.g:5454:1: rule__BElementStructure__Group_3__0 : rule__BElementStructure__Group_3__0__Impl rule__BElementStructure__Group_3__1 ;
    public final void rule__BElementStructure__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5458:1: ( rule__BElementStructure__Group_3__0__Impl rule__BElementStructure__Group_3__1 )
            // InternalBSQLLog2Java.g:5459:2: rule__BElementStructure__Group_3__0__Impl rule__BElementStructure__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__BElementStructure__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BElementStructure__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group_3__0"


    // $ANTLR start "rule__BElementStructure__Group_3__0__Impl"
    // InternalBSQLLog2Java.g:5466:1: rule__BElementStructure__Group_3__0__Impl : ( ',' ) ;
    public final void rule__BElementStructure__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5470:1: ( ( ',' ) )
            // InternalBSQLLog2Java.g:5471:1: ( ',' )
            {
            // InternalBSQLLog2Java.g:5471:1: ( ',' )
            // InternalBSQLLog2Java.g:5472:2: ','
            {
             before(grammarAccess.getBElementStructureAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBElementStructureAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group_3__0__Impl"


    // $ANTLR start "rule__BElementStructure__Group_3__1"
    // InternalBSQLLog2Java.g:5481:1: rule__BElementStructure__Group_3__1 : rule__BElementStructure__Group_3__1__Impl ;
    public final void rule__BElementStructure__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5485:1: ( rule__BElementStructure__Group_3__1__Impl )
            // InternalBSQLLog2Java.g:5486:2: rule__BElementStructure__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BElementStructure__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group_3__1"


    // $ANTLR start "rule__BElementStructure__Group_3__1__Impl"
    // InternalBSQLLog2Java.g:5492:1: rule__BElementStructure__Group_3__1__Impl : ( ( rule__BElementStructure__EAssignment_3_1 ) ) ;
    public final void rule__BElementStructure__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5496:1: ( ( ( rule__BElementStructure__EAssignment_3_1 ) ) )
            // InternalBSQLLog2Java.g:5497:1: ( ( rule__BElementStructure__EAssignment_3_1 ) )
            {
            // InternalBSQLLog2Java.g:5497:1: ( ( rule__BElementStructure__EAssignment_3_1 ) )
            // InternalBSQLLog2Java.g:5498:2: ( rule__BElementStructure__EAssignment_3_1 )
            {
             before(grammarAccess.getBElementStructureAccess().getEAssignment_3_1()); 
            // InternalBSQLLog2Java.g:5499:2: ( rule__BElementStructure__EAssignment_3_1 )
            // InternalBSQLLog2Java.g:5499:3: rule__BElementStructure__EAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BElementStructure__EAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBElementStructureAccess().getEAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__Group_3__1__Impl"


    // $ANTLR start "rule__BSQLMachine__M_nameAssignment_1"
    // InternalBSQLLog2Java.g:5508:1: rule__BSQLMachine__M_nameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BSQLMachine__M_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5512:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5513:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5513:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5514:3: RULE_ID
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


    // $ANTLR start "rule__BSQLMachine__SeenameAssignment_2_1"
    // InternalBSQLLog2Java.g:5523:1: rule__BSQLMachine__SeenameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__BSQLMachine__SeenameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5527:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5528:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5528:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5529:3: RULE_ID
            {
             before(grammarAccess.getBSQLMachineAccess().getSeenameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getSeenameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__SeenameAssignment_2_1"


    // $ANTLR start "rule__BSQLMachine__SeenameAssignment_2_2_1"
    // InternalBSQLLog2Java.g:5538:1: rule__BSQLMachine__SeenameAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__BSQLMachine__SeenameAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5542:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5543:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5543:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5544:3: RULE_ID
            {
             before(grammarAccess.getBSQLMachineAccess().getSeenameIDTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getSeenameIDTerminalRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__SeenameAssignment_2_2_1"


    // $ANTLR start "rule__BSQLMachine__VarsAssignment_4"
    // InternalBSQLLog2Java.g:5553:1: rule__BSQLMachine__VarsAssignment_4 : ( RULE_ID ) ;
    public final void rule__BSQLMachine__VarsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5557:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5558:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5558:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5559:3: RULE_ID
            {
             before(grammarAccess.getBSQLMachineAccess().getVarsIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getVarsIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__VarsAssignment_4"


    // $ANTLR start "rule__BSQLMachine__InvAssignment_6"
    // InternalBSQLLog2Java.g:5568:1: rule__BSQLMachine__InvAssignment_6 : ( ruleBTable ) ;
    public final void rule__BSQLMachine__InvAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5572:1: ( ( ruleBTable ) )
            // InternalBSQLLog2Java.g:5573:2: ( ruleBTable )
            {
            // InternalBSQLLog2Java.g:5573:2: ( ruleBTable )
            // InternalBSQLLog2Java.g:5574:3: ruleBTable
            {
             before(grammarAccess.getBSQLMachineAccess().getInvBTableParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBTable();

            state._fsp--;

             after(grammarAccess.getBSQLMachineAccess().getInvBTableParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__InvAssignment_6"


    // $ANTLR start "rule__BSQLMachine__InitAssignment_8"
    // InternalBSQLLog2Java.g:5583:1: rule__BSQLMachine__InitAssignment_8 : ( RULE_ID ) ;
    public final void rule__BSQLMachine__InitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5587:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5588:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5588:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5589:3: RULE_ID
            {
             before(grammarAccess.getBSQLMachineAccess().getInitIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSQLMachineAccess().getInitIDTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__InitAssignment_8"


    // $ANTLR start "rule__BSQLMachine__BopsAssignment_12"
    // InternalBSQLLog2Java.g:5598:1: rule__BSQLMachine__BopsAssignment_12 : ( ruleBOperation ) ;
    public final void rule__BSQLMachine__BopsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5602:1: ( ( ruleBOperation ) )
            // InternalBSQLLog2Java.g:5603:2: ( ruleBOperation )
            {
            // InternalBSQLLog2Java.g:5603:2: ( ruleBOperation )
            // InternalBSQLLog2Java.g:5604:3: ruleBOperation
            {
             before(grammarAccess.getBSQLMachineAccess().getBopsBOperationParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleBOperation();

            state._fsp--;

             after(grammarAccess.getBSQLMachineAccess().getBopsBOperationParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__BopsAssignment_12"


    // $ANTLR start "rule__BSQLMachine__BopsAssignment_13_1"
    // InternalBSQLLog2Java.g:5613:1: rule__BSQLMachine__BopsAssignment_13_1 : ( ruleBOperation ) ;
    public final void rule__BSQLMachine__BopsAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5617:1: ( ( ruleBOperation ) )
            // InternalBSQLLog2Java.g:5618:2: ( ruleBOperation )
            {
            // InternalBSQLLog2Java.g:5618:2: ( ruleBOperation )
            // InternalBSQLLog2Java.g:5619:3: ruleBOperation
            {
             before(grammarAccess.getBSQLMachineAccess().getBopsBOperationParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBOperation();

            state._fsp--;

             after(grammarAccess.getBSQLMachineAccess().getBopsBOperationParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSQLMachine__BopsAssignment_13_1"


    // $ANTLR start "rule__BOperation__BopsAssignment_0"
    // InternalBSQLLog2Java.g:5628:1: rule__BOperation__BopsAssignment_0 : ( ruleBoolOperation ) ;
    public final void rule__BOperation__BopsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5632:1: ( ( ruleBoolOperation ) )
            // InternalBSQLLog2Java.g:5633:2: ( ruleBoolOperation )
            {
            // InternalBSQLLog2Java.g:5633:2: ( ruleBoolOperation )
            // InternalBSQLLog2Java.g:5634:3: ruleBoolOperation
            {
             before(grammarAccess.getBOperationAccess().getBopsBoolOperationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOperation();

            state._fsp--;

             after(grammarAccess.getBOperationAccess().getBopsBoolOperationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOperation__BopsAssignment_0"


    // $ANTLR start "rule__BOperation__VopsAssignment_1"
    // InternalBSQLLog2Java.g:5643:1: rule__BOperation__VopsAssignment_1 : ( ruleVoidOperation ) ;
    public final void rule__BOperation__VopsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5647:1: ( ( ruleVoidOperation ) )
            // InternalBSQLLog2Java.g:5648:2: ( ruleVoidOperation )
            {
            // InternalBSQLLog2Java.g:5648:2: ( ruleVoidOperation )
            // InternalBSQLLog2Java.g:5649:3: ruleVoidOperation
            {
             before(grammarAccess.getBOperationAccess().getVopsVoidOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVoidOperation();

            state._fsp--;

             after(grammarAccess.getBOperationAccess().getVopsVoidOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOperation__VopsAssignment_1"


    // $ANTLR start "rule__BOperation__SopsAssignment_2"
    // InternalBSQLLog2Java.g:5658:1: rule__BOperation__SopsAssignment_2 : ( ruleStringOperation ) ;
    public final void rule__BOperation__SopsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5662:1: ( ( ruleStringOperation ) )
            // InternalBSQLLog2Java.g:5663:2: ( ruleStringOperation )
            {
            // InternalBSQLLog2Java.g:5663:2: ( ruleStringOperation )
            // InternalBSQLLog2Java.g:5664:3: ruleStringOperation
            {
             before(grammarAccess.getBOperationAccess().getSopsStringOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOperation();

            state._fsp--;

             after(grammarAccess.getBOperationAccess().getSopsStringOperationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOperation__SopsAssignment_2"


    // $ANTLR start "rule__BTable__Table_nameAssignment_0"
    // InternalBSQLLog2Java.g:5673:1: rule__BTable__Table_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BTable__Table_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5677:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5678:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5678:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5679:3: RULE_ID
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
    // InternalBSQLLog2Java.g:5688:1: rule__BTable__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__BTable__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5692:1: ( ( ruleAttribute ) )
            // InternalBSQLLog2Java.g:5693:2: ( ruleAttribute )
            {
            // InternalBSQLLog2Java.g:5693:2: ( ruleAttribute )
            // InternalBSQLLog2Java.g:5694:3: ruleAttribute
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
    // InternalBSQLLog2Java.g:5703:1: rule__BTable__AttributesAssignment_5_1 : ( ruleAttribute ) ;
    public final void rule__BTable__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5707:1: ( ( ruleAttribute ) )
            // InternalBSQLLog2Java.g:5708:2: ( ruleAttribute )
            {
            // InternalBSQLLog2Java.g:5708:2: ( ruleAttribute )
            // InternalBSQLLog2Java.g:5709:3: ruleAttribute
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
    // InternalBSQLLog2Java.g:5718:1: rule__Attribute__Att_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__Att_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5722:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5723:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5723:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5724:3: RULE_ID
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
    // InternalBSQLLog2Java.g:5733:1: rule__Attribute__TypeAssignment_2 : ( ruleBType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5737:1: ( ( ruleBType ) )
            // InternalBSQLLog2Java.g:5738:2: ( ruleBType )
            {
            // InternalBSQLLog2Java.g:5738:2: ( ruleBType )
            // InternalBSQLLog2Java.g:5739:3: ruleBType
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
    // InternalBSQLLog2Java.g:5748:1: rule__BType__Type_nameAssignment : ( RULE_ID ) ;
    public final void rule__BType__Type_nameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5752:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5753:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5753:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5754:3: RULE_ID
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


    // $ANTLR start "rule__BoolOperation__ResAssignment_0"
    // InternalBSQLLog2Java.g:5763:1: rule__BoolOperation__ResAssignment_0 : ( RULE_ID ) ;
    public final void rule__BoolOperation__ResAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5767:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5768:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5768:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5769:3: RULE_ID
            {
             before(grammarAccess.getBoolOperationAccess().getResIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoolOperationAccess().getResIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__ResAssignment_0"


    // $ANTLR start "rule__BoolOperation__Op_nameAssignment_2"
    // InternalBSQLLog2Java.g:5778:1: rule__BoolOperation__Op_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BoolOperation__Op_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5782:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5783:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5783:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5784:3: RULE_ID
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
    // InternalBSQLLog2Java.g:5793:1: rule__BoolOperation__PListAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__BoolOperation__PListAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5797:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5798:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5798:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5799:3: RULE_ID
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
    // InternalBSQLLog2Java.g:5808:1: rule__BoolOperation__PListAssignment_4_1_1 : ( RULE_ID ) ;
    public final void rule__BoolOperation__PListAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5812:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5813:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5813:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5814:3: RULE_ID
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


    // $ANTLR start "rule__BoolOperation__PTypingAssignment_8_0"
    // InternalBSQLLog2Java.g:5823:1: rule__BoolOperation__PTypingAssignment_8_0 : ( ruleBParameterTyping ) ;
    public final void rule__BoolOperation__PTypingAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5827:1: ( ( ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:5828:2: ( ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:5828:2: ( ruleBParameterTyping )
            // InternalBSQLLog2Java.g:5829:3: ruleBParameterTyping
            {
             before(grammarAccess.getBoolOperationAccess().getPTypingBParameterTypingParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameterTyping();

            state._fsp--;

             after(grammarAccess.getBoolOperationAccess().getPTypingBParameterTypingParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__PTypingAssignment_8_0"


    // $ANTLR start "rule__BoolOperation__PTypingAssignment_8_1_1"
    // InternalBSQLLog2Java.g:5838:1: rule__BoolOperation__PTypingAssignment_8_1_1 : ( ruleBParameterTyping ) ;
    public final void rule__BoolOperation__PTypingAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5842:1: ( ( ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:5843:2: ( ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:5843:2: ( ruleBParameterTyping )
            // InternalBSQLLog2Java.g:5844:3: ruleBParameterTyping
            {
             before(grammarAccess.getBoolOperationAccess().getPTypingBParameterTypingParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameterTyping();

            state._fsp--;

             after(grammarAccess.getBoolOperationAccess().getPTypingBParameterTypingParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__PTypingAssignment_8_1_1"


    // $ANTLR start "rule__BoolOperation__ReshasAssignment_10_0"
    // InternalBSQLLog2Java.g:5853:1: rule__BoolOperation__ReshasAssignment_10_0 : ( ruleBSubTrue ) ;
    public final void rule__BoolOperation__ReshasAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5857:1: ( ( ruleBSubTrue ) )
            // InternalBSQLLog2Java.g:5858:2: ( ruleBSubTrue )
            {
            // InternalBSQLLog2Java.g:5858:2: ( ruleBSubTrue )
            // InternalBSQLLog2Java.g:5859:3: ruleBSubTrue
            {
             before(grammarAccess.getBoolOperationAccess().getReshasBSubTrueParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubTrue();

            state._fsp--;

             after(grammarAccess.getBoolOperationAccess().getReshasBSubTrueParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__ReshasAssignment_10_0"


    // $ANTLR start "rule__BoolOperation__ResnoAssignment_10_1"
    // InternalBSQLLog2Java.g:5868:1: rule__BoolOperation__ResnoAssignment_10_1 : ( ruleBSubFalse ) ;
    public final void rule__BoolOperation__ResnoAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5872:1: ( ( ruleBSubFalse ) )
            // InternalBSQLLog2Java.g:5873:2: ( ruleBSubFalse )
            {
            // InternalBSQLLog2Java.g:5873:2: ( ruleBSubFalse )
            // InternalBSQLLog2Java.g:5874:3: ruleBSubFalse
            {
             before(grammarAccess.getBoolOperationAccess().getResnoBSubFalseParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubFalse();

            state._fsp--;

             after(grammarAccess.getBoolOperationAccess().getResnoBSubFalseParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__ResnoAssignment_10_1"


    // $ANTLR start "rule__BSubTrue__ResAssignment_0"
    // InternalBSQLLog2Java.g:5883:1: rule__BSubTrue__ResAssignment_0 : ( RULE_ID ) ;
    public final void rule__BSubTrue__ResAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5887:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5888:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5888:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5889:3: RULE_ID
            {
             before(grammarAccess.getBSubTrueAccess().getResIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSubTrueAccess().getResIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__ResAssignment_0"


    // $ANTLR start "rule__BSubTrue__ObjTableAssignment_4"
    // InternalBSQLLog2Java.g:5898:1: rule__BSubTrue__ObjTableAssignment_4 : ( ruleTableInstance ) ;
    public final void rule__BSubTrue__ObjTableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5902:1: ( ( ruleTableInstance ) )
            // InternalBSQLLog2Java.g:5903:2: ( ruleTableInstance )
            {
            // InternalBSQLLog2Java.g:5903:2: ( ruleTableInstance )
            // InternalBSQLLog2Java.g:5904:3: ruleTableInstance
            {
             before(grammarAccess.getBSubTrueAccess().getObjTableTableInstanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTableInstance();

            state._fsp--;

             after(grammarAccess.getBSubTrueAccess().getObjTableTableInstanceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__ObjTableAssignment_4"


    // $ANTLR start "rule__BSubTrue__PresAssignment_6"
    // InternalBSQLLog2Java.g:5913:1: rule__BSubTrue__PresAssignment_6 : ( ruleBPredicate ) ;
    public final void rule__BSubTrue__PresAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5917:1: ( ( ruleBPredicate ) )
            // InternalBSQLLog2Java.g:5918:2: ( ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:5918:2: ( ruleBPredicate )
            // InternalBSQLLog2Java.g:5919:3: ruleBPredicate
            {
             before(grammarAccess.getBSubTrueAccess().getPresBPredicateParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBSubTrueAccess().getPresBPredicateParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__PresAssignment_6"


    // $ANTLR start "rule__BSubTrue__PresAssignment_7_1"
    // InternalBSQLLog2Java.g:5928:1: rule__BSubTrue__PresAssignment_7_1 : ( ruleBPredicate ) ;
    public final void rule__BSubTrue__PresAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5932:1: ( ( ruleBPredicate ) )
            // InternalBSQLLog2Java.g:5933:2: ( ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:5933:2: ( ruleBPredicate )
            // InternalBSQLLog2Java.g:5934:3: ruleBPredicate
            {
             before(grammarAccess.getBSubTrueAccess().getPresBPredicateParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBSubTrueAccess().getPresBPredicateParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubTrue__PresAssignment_7_1"


    // $ANTLR start "rule__BSubFalse__ResAssignment_0"
    // InternalBSQLLog2Java.g:5943:1: rule__BSubFalse__ResAssignment_0 : ( RULE_ID ) ;
    public final void rule__BSubFalse__ResAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5947:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:5948:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:5948:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:5949:3: RULE_ID
            {
             before(grammarAccess.getBSubFalseAccess().getResIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSubFalseAccess().getResIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__ResAssignment_0"


    // $ANTLR start "rule__BSubFalse__ObjTableAssignment_6"
    // InternalBSQLLog2Java.g:5958:1: rule__BSubFalse__ObjTableAssignment_6 : ( ruleTableInstance ) ;
    public final void rule__BSubFalse__ObjTableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5962:1: ( ( ruleTableInstance ) )
            // InternalBSQLLog2Java.g:5963:2: ( ruleTableInstance )
            {
            // InternalBSQLLog2Java.g:5963:2: ( ruleTableInstance )
            // InternalBSQLLog2Java.g:5964:3: ruleTableInstance
            {
             before(grammarAccess.getBSubFalseAccess().getObjTableTableInstanceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTableInstance();

            state._fsp--;

             after(grammarAccess.getBSubFalseAccess().getObjTableTableInstanceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__ObjTableAssignment_6"


    // $ANTLR start "rule__BSubFalse__PresAssignment_8"
    // InternalBSQLLog2Java.g:5973:1: rule__BSubFalse__PresAssignment_8 : ( ruleBPredicate ) ;
    public final void rule__BSubFalse__PresAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5977:1: ( ( ruleBPredicate ) )
            // InternalBSQLLog2Java.g:5978:2: ( ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:5978:2: ( ruleBPredicate )
            // InternalBSQLLog2Java.g:5979:3: ruleBPredicate
            {
             before(grammarAccess.getBSubFalseAccess().getPresBPredicateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBSubFalseAccess().getPresBPredicateParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__PresAssignment_8"


    // $ANTLR start "rule__BSubFalse__PresAssignment_9_1"
    // InternalBSQLLog2Java.g:5988:1: rule__BSubFalse__PresAssignment_9_1 : ( ruleBPredicate ) ;
    public final void rule__BSubFalse__PresAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:5992:1: ( ( ruleBPredicate ) )
            // InternalBSQLLog2Java.g:5993:2: ( ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:5993:2: ( ruleBPredicate )
            // InternalBSQLLog2Java.g:5994:3: ruleBPredicate
            {
             before(grammarAccess.getBSubFalseAccess().getPresBPredicateParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBSubFalseAccess().getPresBPredicateParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubFalse__PresAssignment_9_1"


    // $ANTLR start "rule__StringOperation__ResAssignment_0"
    // InternalBSQLLog2Java.g:6003:1: rule__StringOperation__ResAssignment_0 : ( RULE_ID ) ;
    public final void rule__StringOperation__ResAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6007:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6008:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6008:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6009:3: RULE_ID
            {
             before(grammarAccess.getStringOperationAccess().getResIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringOperationAccess().getResIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperation__ResAssignment_0"


    // $ANTLR start "rule__StringOperation__Op_nameAssignment_2"
    // InternalBSQLLog2Java.g:6018:1: rule__StringOperation__Op_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringOperation__Op_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6022:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6023:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6023:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6024:3: RULE_ID
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
    // InternalBSQLLog2Java.g:6033:1: rule__StringOperation__PListAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__StringOperation__PListAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6037:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6038:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6038:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6039:3: RULE_ID
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
    // InternalBSQLLog2Java.g:6048:1: rule__StringOperation__PListAssignment_4_1_1 : ( RULE_ID ) ;
    public final void rule__StringOperation__PListAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6052:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6053:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6053:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6054:3: RULE_ID
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


    // $ANTLR start "rule__StringOperation__PTypingAssignment_8_0"
    // InternalBSQLLog2Java.g:6063:1: rule__StringOperation__PTypingAssignment_8_0 : ( ruleBParameterTyping ) ;
    public final void rule__StringOperation__PTypingAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6067:1: ( ( ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:6068:2: ( ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:6068:2: ( ruleBParameterTyping )
            // InternalBSQLLog2Java.g:6069:3: ruleBParameterTyping
            {
             before(grammarAccess.getStringOperationAccess().getPTypingBParameterTypingParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameterTyping();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getPTypingBParameterTypingParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperation__PTypingAssignment_8_0"


    // $ANTLR start "rule__StringOperation__PTypingAssignment_8_1_1"
    // InternalBSQLLog2Java.g:6078:1: rule__StringOperation__PTypingAssignment_8_1_1 : ( ruleBParameterTyping ) ;
    public final void rule__StringOperation__PTypingAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6082:1: ( ( ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:6083:2: ( ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:6083:2: ( ruleBParameterTyping )
            // InternalBSQLLog2Java.g:6084:3: ruleBParameterTyping
            {
             before(grammarAccess.getStringOperationAccess().getPTypingBParameterTypingParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameterTyping();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getPTypingBParameterTypingParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperation__PTypingAssignment_8_1_1"


    // $ANTLR start "rule__StringOperation__AnyblockAssignment_10"
    // InternalBSQLLog2Java.g:6093:1: rule__StringOperation__AnyblockAssignment_10 : ( ruleBAnyBlock ) ;
    public final void rule__StringOperation__AnyblockAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6097:1: ( ( ruleBAnyBlock ) )
            // InternalBSQLLog2Java.g:6098:2: ( ruleBAnyBlock )
            {
            // InternalBSQLLog2Java.g:6098:2: ( ruleBAnyBlock )
            // InternalBSQLLog2Java.g:6099:3: ruleBAnyBlock
            {
             before(grammarAccess.getStringOperationAccess().getAnyblockBAnyBlockParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleBAnyBlock();

            state._fsp--;

             after(grammarAccess.getStringOperationAccess().getAnyblockBAnyBlockParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperation__AnyblockAssignment_10"


    // $ANTLR start "rule__BAnyBlock__VarListAssignment_1_0"
    // InternalBSQLLog2Java.g:6108:1: rule__BAnyBlock__VarListAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__BAnyBlock__VarListAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6112:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6113:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6113:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6114:3: RULE_ID
            {
             before(grammarAccess.getBAnyBlockAccess().getVarListIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getVarListIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__VarListAssignment_1_0"


    // $ANTLR start "rule__BAnyBlock__VarListAssignment_1_1_1"
    // InternalBSQLLog2Java.g:6123:1: rule__BAnyBlock__VarListAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__BAnyBlock__VarListAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6127:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6128:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6128:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6129:3: RULE_ID
            {
             before(grammarAccess.getBAnyBlockAccess().getVarListIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBAnyBlockAccess().getVarListIDTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__VarListAssignment_1_1_1"


    // $ANTLR start "rule__BAnyBlock__VarTypingAssignment_3_0"
    // InternalBSQLLog2Java.g:6138:1: rule__BAnyBlock__VarTypingAssignment_3_0 : ( ruleBParameterTyping ) ;
    public final void rule__BAnyBlock__VarTypingAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6142:1: ( ( ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:6143:2: ( ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:6143:2: ( ruleBParameterTyping )
            // InternalBSQLLog2Java.g:6144:3: ruleBParameterTyping
            {
             before(grammarAccess.getBAnyBlockAccess().getVarTypingBParameterTypingParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameterTyping();

            state._fsp--;

             after(grammarAccess.getBAnyBlockAccess().getVarTypingBParameterTypingParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__VarTypingAssignment_3_0"


    // $ANTLR start "rule__BAnyBlock__VarTypingAssignment_3_1_1"
    // InternalBSQLLog2Java.g:6153:1: rule__BAnyBlock__VarTypingAssignment_3_1_1 : ( ruleBParameterTyping ) ;
    public final void rule__BAnyBlock__VarTypingAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6157:1: ( ( ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:6158:2: ( ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:6158:2: ( ruleBParameterTyping )
            // InternalBSQLLog2Java.g:6159:3: ruleBParameterTyping
            {
             before(grammarAccess.getBAnyBlockAccess().getVarTypingBParameterTypingParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameterTyping();

            state._fsp--;

             after(grammarAccess.getBAnyBlockAccess().getVarTypingBParameterTypingParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__VarTypingAssignment_3_1_1"


    // $ANTLR start "rule__BAnyBlock__PresAssignment_5"
    // InternalBSQLLog2Java.g:6168:1: rule__BAnyBlock__PresAssignment_5 : ( ruleBPredicate ) ;
    public final void rule__BAnyBlock__PresAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6172:1: ( ( ruleBPredicate ) )
            // InternalBSQLLog2Java.g:6173:2: ( ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:6173:2: ( ruleBPredicate )
            // InternalBSQLLog2Java.g:6174:3: ruleBPredicate
            {
             before(grammarAccess.getBAnyBlockAccess().getPresBPredicateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBAnyBlockAccess().getPresBPredicateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__PresAssignment_5"


    // $ANTLR start "rule__BAnyBlock__PresAssignment_6_1"
    // InternalBSQLLog2Java.g:6183:1: rule__BAnyBlock__PresAssignment_6_1 : ( ruleBPredicate ) ;
    public final void rule__BAnyBlock__PresAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6187:1: ( ( ruleBPredicate ) )
            // InternalBSQLLog2Java.g:6188:2: ( ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:6188:2: ( ruleBPredicate )
            // InternalBSQLLog2Java.g:6189:3: ruleBPredicate
            {
             before(grammarAccess.getBAnyBlockAccess().getPresBPredicateParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBAnyBlockAccess().getPresBPredicateParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__PresAssignment_6_1"


    // $ANTLR start "rule__BAnyBlock__SubsAssignment_8_0"
    // InternalBSQLLog2Java.g:6198:1: rule__BAnyBlock__SubsAssignment_8_0 : ( ruleBSubstitution ) ;
    public final void rule__BAnyBlock__SubsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6202:1: ( ( ruleBSubstitution ) )
            // InternalBSQLLog2Java.g:6203:2: ( ruleBSubstitution )
            {
            // InternalBSQLLog2Java.g:6203:2: ( ruleBSubstitution )
            // InternalBSQLLog2Java.g:6204:3: ruleBSubstitution
            {
             before(grammarAccess.getBAnyBlockAccess().getSubsBSubstitutionParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getBAnyBlockAccess().getSubsBSubstitutionParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__SubsAssignment_8_0"


    // $ANTLR start "rule__BAnyBlock__SubsAssignment_8_1_1"
    // InternalBSQLLog2Java.g:6213:1: rule__BAnyBlock__SubsAssignment_8_1_1 : ( ruleBSubstitution ) ;
    public final void rule__BAnyBlock__SubsAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6217:1: ( ( ruleBSubstitution ) )
            // InternalBSQLLog2Java.g:6218:2: ( ruleBSubstitution )
            {
            // InternalBSQLLog2Java.g:6218:2: ( ruleBSubstitution )
            // InternalBSQLLog2Java.g:6219:3: ruleBSubstitution
            {
             before(grammarAccess.getBAnyBlockAccess().getSubsBSubstitutionParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getBAnyBlockAccess().getSubsBSubstitutionParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BAnyBlock__SubsAssignment_8_1_1"


    // $ANTLR start "rule__VoidOperation__Op_nameAssignment_0"
    // InternalBSQLLog2Java.g:6228:1: rule__VoidOperation__Op_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VoidOperation__Op_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6232:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6233:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6233:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6234:3: RULE_ID
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
    // InternalBSQLLog2Java.g:6243:1: rule__VoidOperation__PListAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__VoidOperation__PListAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6247:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6248:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6248:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6249:3: RULE_ID
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
    // InternalBSQLLog2Java.g:6258:1: rule__VoidOperation__PListAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__VoidOperation__PListAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6262:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6263:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6263:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6264:3: RULE_ID
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


    // $ANTLR start "rule__VoidOperation__PTypingAssignment_6_0"
    // InternalBSQLLog2Java.g:6273:1: rule__VoidOperation__PTypingAssignment_6_0 : ( ruleBParameterTyping ) ;
    public final void rule__VoidOperation__PTypingAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6277:1: ( ( ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:6278:2: ( ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:6278:2: ( ruleBParameterTyping )
            // InternalBSQLLog2Java.g:6279:3: ruleBParameterTyping
            {
             before(grammarAccess.getVoidOperationAccess().getPTypingBParameterTypingParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameterTyping();

            state._fsp--;

             after(grammarAccess.getVoidOperationAccess().getPTypingBParameterTypingParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidOperation__PTypingAssignment_6_0"


    // $ANTLR start "rule__VoidOperation__PTypingAssignment_6_1_1"
    // InternalBSQLLog2Java.g:6288:1: rule__VoidOperation__PTypingAssignment_6_1_1 : ( ruleBParameterTyping ) ;
    public final void rule__VoidOperation__PTypingAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6292:1: ( ( ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:6293:2: ( ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:6293:2: ( ruleBParameterTyping )
            // InternalBSQLLog2Java.g:6294:3: ruleBParameterTyping
            {
             before(grammarAccess.getVoidOperationAccess().getPTypingBParameterTypingParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBParameterTyping();

            state._fsp--;

             after(grammarAccess.getVoidOperationAccess().getPTypingBParameterTypingParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidOperation__PTypingAssignment_6_1_1"


    // $ANTLR start "rule__VoidOperation__SubsAssignment_8"
    // InternalBSQLLog2Java.g:6303:1: rule__VoidOperation__SubsAssignment_8 : ( ruleBSubstitution ) ;
    public final void rule__VoidOperation__SubsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6307:1: ( ( ruleBSubstitution ) )
            // InternalBSQLLog2Java.g:6308:2: ( ruleBSubstitution )
            {
            // InternalBSQLLog2Java.g:6308:2: ( ruleBSubstitution )
            // InternalBSQLLog2Java.g:6309:3: ruleBSubstitution
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


    // $ANTLR start "rule__VoidOperation__SubsAssignment_9_1"
    // InternalBSQLLog2Java.g:6318:1: rule__VoidOperation__SubsAssignment_9_1 : ( ruleBSubstitution ) ;
    public final void rule__VoidOperation__SubsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6322:1: ( ( ruleBSubstitution ) )
            // InternalBSQLLog2Java.g:6323:2: ( ruleBSubstitution )
            {
            // InternalBSQLLog2Java.g:6323:2: ( ruleBSubstitution )
            // InternalBSQLLog2Java.g:6324:3: ruleBSubstitution
            {
             before(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBSubstitution();

            state._fsp--;

             after(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidOperation__SubsAssignment_9_1"


    // $ANTLR start "rule__BPredicate__PLeftAssignment_1_0"
    // InternalBSQLLog2Java.g:6333:1: rule__BPredicate__PLeftAssignment_1_0 : ( ruleSQLCall ) ;
    public final void rule__BPredicate__PLeftAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6337:1: ( ( ruleSQLCall ) )
            // InternalBSQLLog2Java.g:6338:2: ( ruleSQLCall )
            {
            // InternalBSQLLog2Java.g:6338:2: ( ruleSQLCall )
            // InternalBSQLLog2Java.g:6339:3: ruleSQLCall
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
    // InternalBSQLLog2Java.g:6348:1: rule__BPredicate__PRightAssignment_1_2 : ( ruleBValue ) ;
    public final void rule__BPredicate__PRightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6352:1: ( ( ruleBValue ) )
            // InternalBSQLLog2Java.g:6353:2: ( ruleBValue )
            {
            // InternalBSQLLog2Java.g:6353:2: ( ruleBValue )
            // InternalBSQLLog2Java.g:6354:3: ruleBValue
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
    // InternalBSQLLog2Java.g:6363:1: rule__SQLCall__SLeftAssignment_0 : ( RULE_ID ) ;
    public final void rule__SQLCall__SLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6367:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6368:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6368:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6369:3: RULE_ID
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
    // InternalBSQLLog2Java.g:6378:1: rule__SQLCall__SRightAssignment_2 : ( RULE_ID ) ;
    public final void rule__SQLCall__SRightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6382:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6383:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6383:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6384:3: RULE_ID
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
    // InternalBSQLLog2Java.g:6393:1: rule__TableInstance__Ti_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TableInstance__Ti_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6397:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6398:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6398:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6399:3: RULE_ID
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
    // InternalBSQLLog2Java.g:6408:1: rule__TableInstance__Ti_typeAssignment_2 : ( ruleTIAssignment ) ;
    public final void rule__TableInstance__Ti_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6412:1: ( ( ruleTIAssignment ) )
            // InternalBSQLLog2Java.g:6413:2: ( ruleTIAssignment )
            {
            // InternalBSQLLog2Java.g:6413:2: ( ruleTIAssignment )
            // InternalBSQLLog2Java.g:6414:3: ruleTIAssignment
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
    // InternalBSQLLog2Java.g:6423:1: rule__TIAssignment__Instance_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TIAssignment__Instance_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6427:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6428:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6428:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6429:3: RULE_ID
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
    // InternalBSQLLog2Java.g:6438:1: rule__TIAssignment__Instance_typeAssignment_2 : ( RULE_ID ) ;
    public final void rule__TIAssignment__Instance_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6442:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6443:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6443:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6444:3: RULE_ID
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


    // $ANTLR start "rule__BParameterTyping__P_nameAssignment_0"
    // InternalBSQLLog2Java.g:6453:1: rule__BParameterTyping__P_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BParameterTyping__P_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6457:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6458:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6458:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6459:3: RULE_ID
            {
             before(grammarAccess.getBParameterTypingAccess().getP_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBParameterTypingAccess().getP_nameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BParameterTyping__P_nameAssignment_0"


    // $ANTLR start "rule__BParameterTyping__TypeAssignment_2"
    // InternalBSQLLog2Java.g:6468:1: rule__BParameterTyping__TypeAssignment_2 : ( ruleBType ) ;
    public final void rule__BParameterTyping__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6472:1: ( ( ruleBType ) )
            // InternalBSQLLog2Java.g:6473:2: ( ruleBType )
            {
            // InternalBSQLLog2Java.g:6473:2: ( ruleBType )
            // InternalBSQLLog2Java.g:6474:3: ruleBType
            {
             before(grammarAccess.getBParameterTypingAccess().getTypeBTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBType();

            state._fsp--;

             after(grammarAccess.getBParameterTypingAccess().getTypeBTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BParameterTyping__TypeAssignment_2"


    // $ANTLR start "rule__BSubstitution__LeftAssignment_0"
    // InternalBSQLLog2Java.g:6483:1: rule__BSubstitution__LeftAssignment_0 : ( RULE_ID ) ;
    public final void rule__BSubstitution__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6487:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6488:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6488:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6489:3: RULE_ID
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


    // $ANTLR start "rule__BSubstitution__PrightAssignment_2_0"
    // InternalBSQLLog2Java.g:6498:1: rule__BSubstitution__PrightAssignment_2_0 : ( ruleBPredicate ) ;
    public final void rule__BSubstitution__PrightAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6502:1: ( ( ruleBPredicate ) )
            // InternalBSQLLog2Java.g:6503:2: ( ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:6503:2: ( ruleBPredicate )
            // InternalBSQLLog2Java.g:6504:3: ruleBPredicate
            {
             before(grammarAccess.getBSubstitutionAccess().getPrightBPredicateParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBPredicate();

            state._fsp--;

             after(grammarAccess.getBSubstitutionAccess().getPrightBPredicateParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubstitution__PrightAssignment_2_0"


    // $ANTLR start "rule__BSubstitution__UrightAssignment_2_1"
    // InternalBSQLLog2Java.g:6513:1: rule__BSubstitution__UrightAssignment_2_1 : ( ruleBUnion ) ;
    public final void rule__BSubstitution__UrightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6517:1: ( ( ruleBUnion ) )
            // InternalBSQLLog2Java.g:6518:2: ( ruleBUnion )
            {
            // InternalBSQLLog2Java.g:6518:2: ( ruleBUnion )
            // InternalBSQLLog2Java.g:6519:3: ruleBUnion
            {
             before(grammarAccess.getBSubstitutionAccess().getUrightBUnionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBUnion();

            state._fsp--;

             after(grammarAccess.getBSubstitutionAccess().getUrightBUnionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubstitution__UrightAssignment_2_1"


    // $ANTLR start "rule__BSubstitution__SrightAssignment_2_2"
    // InternalBSQLLog2Java.g:6528:1: rule__BSubstitution__SrightAssignment_2_2 : ( ruleSQLCall ) ;
    public final void rule__BSubstitution__SrightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6532:1: ( ( ruleSQLCall ) )
            // InternalBSQLLog2Java.g:6533:2: ( ruleSQLCall )
            {
            // InternalBSQLLog2Java.g:6533:2: ( ruleSQLCall )
            // InternalBSQLLog2Java.g:6534:3: ruleSQLCall
            {
             before(grammarAccess.getBSubstitutionAccess().getSrightSQLCallParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSQLCall();

            state._fsp--;

             after(grammarAccess.getBSubstitutionAccess().getSrightSQLCallParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSubstitution__SrightAssignment_2_2"


    // $ANTLR start "rule__BUnion__SetAssignment_0"
    // InternalBSQLLog2Java.g:6543:1: rule__BUnion__SetAssignment_0 : ( ruleBSet ) ;
    public final void rule__BUnion__SetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6547:1: ( ( ruleBSet ) )
            // InternalBSQLLog2Java.g:6548:2: ( ruleBSet )
            {
            // InternalBSQLLog2Java.g:6548:2: ( ruleBSet )
            // InternalBSQLLog2Java.g:6549:3: ruleBSet
            {
             before(grammarAccess.getBUnionAccess().getSetBSetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBSet();

            state._fsp--;

             after(grammarAccess.getBUnionAccess().getSetBSetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUnion__SetAssignment_0"


    // $ANTLR start "rule__BUnion__AddedSetAssignment_2_0"
    // InternalBSQLLog2Java.g:6558:1: rule__BUnion__AddedSetAssignment_2_0 : ( ruleBSet ) ;
    public final void rule__BUnion__AddedSetAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6562:1: ( ( ruleBSet ) )
            // InternalBSQLLog2Java.g:6563:2: ( ruleBSet )
            {
            // InternalBSQLLog2Java.g:6563:2: ( ruleBSet )
            // InternalBSQLLog2Java.g:6564:3: ruleBSet
            {
             before(grammarAccess.getBUnionAccess().getAddedSetBSetParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBSet();

            state._fsp--;

             after(grammarAccess.getBUnionAccess().getAddedSetBSetParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUnion__AddedSetAssignment_2_0"


    // $ANTLR start "rule__BUnion__AddedEAssignment_2_1"
    // InternalBSQLLog2Java.g:6573:1: rule__BUnion__AddedEAssignment_2_1 : ( ruleBElementStructure ) ;
    public final void rule__BUnion__AddedEAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6577:1: ( ( ruleBElementStructure ) )
            // InternalBSQLLog2Java.g:6578:2: ( ruleBElementStructure )
            {
            // InternalBSQLLog2Java.g:6578:2: ( ruleBElementStructure )
            // InternalBSQLLog2Java.g:6579:3: ruleBElementStructure
            {
             before(grammarAccess.getBUnionAccess().getAddedEBElementStructureParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBElementStructure();

            state._fsp--;

             after(grammarAccess.getBUnionAccess().getAddedEBElementStructureParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BUnion__AddedEAssignment_2_1"


    // $ANTLR start "rule__BElementStructure__EAssignment_2"
    // InternalBSQLLog2Java.g:6588:1: rule__BElementStructure__EAssignment_2 : ( ruleBElement ) ;
    public final void rule__BElementStructure__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6592:1: ( ( ruleBElement ) )
            // InternalBSQLLog2Java.g:6593:2: ( ruleBElement )
            {
            // InternalBSQLLog2Java.g:6593:2: ( ruleBElement )
            // InternalBSQLLog2Java.g:6594:3: ruleBElement
            {
             before(grammarAccess.getBElementStructureAccess().getEBElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBElement();

            state._fsp--;

             after(grammarAccess.getBElementStructureAccess().getEBElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__EAssignment_2"


    // $ANTLR start "rule__BElementStructure__EAssignment_3_1"
    // InternalBSQLLog2Java.g:6603:1: rule__BElementStructure__EAssignment_3_1 : ( ruleBElement ) ;
    public final void rule__BElementStructure__EAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6607:1: ( ( ruleBElement ) )
            // InternalBSQLLog2Java.g:6608:2: ( ruleBElement )
            {
            // InternalBSQLLog2Java.g:6608:2: ( ruleBElement )
            // InternalBSQLLog2Java.g:6609:3: ruleBElement
            {
             before(grammarAccess.getBElementStructureAccess().getEBElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBElement();

            state._fsp--;

             after(grammarAccess.getBElementStructureAccess().getEBElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElementStructure__EAssignment_3_1"


    // $ANTLR start "rule__BElement__EnameAssignment"
    // InternalBSQLLog2Java.g:6618:1: rule__BElement__EnameAssignment : ( RULE_ID ) ;
    public final void rule__BElement__EnameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6622:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6623:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6623:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6624:3: RULE_ID
            {
             before(grammarAccess.getBElementAccess().getEnameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBElementAccess().getEnameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BElement__EnameAssignment"


    // $ANTLR start "rule__BSet__Set_nameAssignment"
    // InternalBSQLLog2Java.g:6633:1: rule__BSet__Set_nameAssignment : ( RULE_ID ) ;
    public final void rule__BSet__Set_nameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSQLLog2Java.g:6637:1: ( ( RULE_ID ) )
            // InternalBSQLLog2Java.g:6638:2: ( RULE_ID )
            {
            // InternalBSQLLog2Java.g:6638:2: ( RULE_ID )
            // InternalBSQLLog2Java.g:6639:3: RULE_ID
            {
             before(grammarAccess.getBSetAccess().getSet_nameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBSetAccess().getSet_nameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSet__Set_nameAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\4\1\32\1\4\1\uffff\1\32\1\4\1\26\1\36\1\4\1\37\1\26\1\4\1\34\1\4\1\40\2\4\1\34\2\uffff\1\4\1\40";
    static final String dfa_3s = "\1\4\1\35\1\4\1\uffff\1\32\2\33\1\36\1\4\1\37\1\33\1\4\1\34\1\4\1\41\1\4\1\45\1\34\2\uffff\1\4\1\41";
    static final String dfa_4s = "\3\uffff\1\2\16\uffff\1\3\1\1\2\uffff";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\3\2\uffff\1\2",
            "\1\4",
            "",
            "\1\5",
            "\1\6\26\uffff\1\7",
            "\1\10\4\uffff\1\7",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\10\4\uffff\1\7",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\20\1\17",
            "\1\21",
            "\1\23\40\uffff\1\22",
            "\1\24",
            "",
            "",
            "\1\25",
            "\1\20\1\17"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "627:1: rule__BOperation__Alternatives : ( ( ( rule__BOperation__BopsAssignment_0 ) ) | ( ( rule__BOperation__VopsAssignment_1 ) ) | ( ( rule__BOperation__SopsAssignment_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000400000L});

}