package secureuml2Java.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import secureuml2Java.services.SecureUML2JavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecureUML2JavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MACHINE'", "'SEES'", "','", "'VARIABLES'", "'INVARIANT'", "'&'", "'INITIALISATION'", "'||'", "'OPERATIONS'", "';'", "'END'", "'('", "')'", "'='", "'PRE'", "'THEN'", "'<--'", "'IF'", "'ELSE'", "':='", "':'", "'dom'", "'{'", "'}'", "'|->'", "'<:'", "'-->'", "'+->'", "'<->'"
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

        public InternalSecureUML2JavaParser(TokenStream input, SecureUML2JavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SecureUML2Java";
       	}

       	@Override
       	protected SecureUML2JavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSecureUML2Java"
    // InternalSecureUML2Java.g:64:1: entryRuleSecureUML2Java returns [EObject current=null] : iv_ruleSecureUML2Java= ruleSecureUML2Java EOF ;
    public final EObject entryRuleSecureUML2Java() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecureUML2Java = null;


        try {
            // InternalSecureUML2Java.g:64:55: (iv_ruleSecureUML2Java= ruleSecureUML2Java EOF )
            // InternalSecureUML2Java.g:65:2: iv_ruleSecureUML2Java= ruleSecureUML2Java EOF
            {
             newCompositeNode(grammarAccess.getSecureUML2JavaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecureUML2Java=ruleSecureUML2Java();

            state._fsp--;

             current =iv_ruleSecureUML2Java; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecureUML2Java"


    // $ANTLR start "ruleSecureUML2Java"
    // InternalSecureUML2Java.g:71:1: ruleSecureUML2Java returns [EObject current=null] : this_BMachine_0= ruleBMachine ;
    public final EObject ruleSecureUML2Java() throws RecognitionException {
        EObject current = null;

        EObject this_BMachine_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:77:2: (this_BMachine_0= ruleBMachine )
            // InternalSecureUML2Java.g:78:2: this_BMachine_0= ruleBMachine
            {

            		newCompositeNode(grammarAccess.getSecureUML2JavaAccess().getBMachineParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BMachine_0=ruleBMachine();

            state._fsp--;


            		current = this_BMachine_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecureUML2Java"


    // $ANTLR start "entryRuleBMachine"
    // InternalSecureUML2Java.g:89:1: entryRuleBMachine returns [EObject current=null] : iv_ruleBMachine= ruleBMachine EOF ;
    public final EObject entryRuleBMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBMachine = null;


        try {
            // InternalSecureUML2Java.g:89:49: (iv_ruleBMachine= ruleBMachine EOF )
            // InternalSecureUML2Java.g:90:2: iv_ruleBMachine= ruleBMachine EOF
            {
             newCompositeNode(grammarAccess.getBMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBMachine=ruleBMachine();

            state._fsp--;

             current =iv_ruleBMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBMachine"


    // $ANTLR start "ruleBMachine"
    // InternalSecureUML2Java.g:96:1: ruleBMachine returns [EObject current=null] : (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SEES' ( (lv_sees_3_0= ruleBSees ) ) (otherlv_4= ',' ( (lv_sees_5_0= ruleBSees ) ) )* otherlv_6= 'VARIABLES' ( (lv_vars_7_0= ruleBVariable ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleBVariable ) ) )* otherlv_10= 'INVARIANT' ( (lv_invs_11_0= ruleBInvariant ) ) (otherlv_12= '&' ( (lv_invs_13_0= ruleBInvariant ) ) )* otherlv_14= 'INITIALISATION' ( (lv_inits_15_0= ruleBInit ) ) (otherlv_16= '||' ( (lv_inits_17_0= ruleBInit ) ) )* otherlv_18= 'OPERATIONS' ( (lv_vops_19_0= ruleVoidOperation ) ) (otherlv_20= ';' ( (lv_vops_21_0= ruleVoidOperation ) ) )* otherlv_22= ';' ( (lv_sops_23_0= ruleStringOperation ) ) (otherlv_24= ';' ( (lv_sops_25_0= ruleStringOperation ) ) )* otherlv_26= 'END' ) ;
    public final EObject ruleBMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_m_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        EObject lv_sees_3_0 = null;

        EObject lv_sees_5_0 = null;

        EObject lv_vars_7_0 = null;

        EObject lv_vars_9_0 = null;

        EObject lv_invs_11_0 = null;

        EObject lv_invs_13_0 = null;

        EObject lv_inits_15_0 = null;

        EObject lv_inits_17_0 = null;

        EObject lv_vops_19_0 = null;

        EObject lv_vops_21_0 = null;

        EObject lv_sops_23_0 = null;

        EObject lv_sops_25_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:102:2: ( (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SEES' ( (lv_sees_3_0= ruleBSees ) ) (otherlv_4= ',' ( (lv_sees_5_0= ruleBSees ) ) )* otherlv_6= 'VARIABLES' ( (lv_vars_7_0= ruleBVariable ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleBVariable ) ) )* otherlv_10= 'INVARIANT' ( (lv_invs_11_0= ruleBInvariant ) ) (otherlv_12= '&' ( (lv_invs_13_0= ruleBInvariant ) ) )* otherlv_14= 'INITIALISATION' ( (lv_inits_15_0= ruleBInit ) ) (otherlv_16= '||' ( (lv_inits_17_0= ruleBInit ) ) )* otherlv_18= 'OPERATIONS' ( (lv_vops_19_0= ruleVoidOperation ) ) (otherlv_20= ';' ( (lv_vops_21_0= ruleVoidOperation ) ) )* otherlv_22= ';' ( (lv_sops_23_0= ruleStringOperation ) ) (otherlv_24= ';' ( (lv_sops_25_0= ruleStringOperation ) ) )* otherlv_26= 'END' ) )
            // InternalSecureUML2Java.g:103:2: (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SEES' ( (lv_sees_3_0= ruleBSees ) ) (otherlv_4= ',' ( (lv_sees_5_0= ruleBSees ) ) )* otherlv_6= 'VARIABLES' ( (lv_vars_7_0= ruleBVariable ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleBVariable ) ) )* otherlv_10= 'INVARIANT' ( (lv_invs_11_0= ruleBInvariant ) ) (otherlv_12= '&' ( (lv_invs_13_0= ruleBInvariant ) ) )* otherlv_14= 'INITIALISATION' ( (lv_inits_15_0= ruleBInit ) ) (otherlv_16= '||' ( (lv_inits_17_0= ruleBInit ) ) )* otherlv_18= 'OPERATIONS' ( (lv_vops_19_0= ruleVoidOperation ) ) (otherlv_20= ';' ( (lv_vops_21_0= ruleVoidOperation ) ) )* otherlv_22= ';' ( (lv_sops_23_0= ruleStringOperation ) ) (otherlv_24= ';' ( (lv_sops_25_0= ruleStringOperation ) ) )* otherlv_26= 'END' )
            {
            // InternalSecureUML2Java.g:103:2: (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SEES' ( (lv_sees_3_0= ruleBSees ) ) (otherlv_4= ',' ( (lv_sees_5_0= ruleBSees ) ) )* otherlv_6= 'VARIABLES' ( (lv_vars_7_0= ruleBVariable ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleBVariable ) ) )* otherlv_10= 'INVARIANT' ( (lv_invs_11_0= ruleBInvariant ) ) (otherlv_12= '&' ( (lv_invs_13_0= ruleBInvariant ) ) )* otherlv_14= 'INITIALISATION' ( (lv_inits_15_0= ruleBInit ) ) (otherlv_16= '||' ( (lv_inits_17_0= ruleBInit ) ) )* otherlv_18= 'OPERATIONS' ( (lv_vops_19_0= ruleVoidOperation ) ) (otherlv_20= ';' ( (lv_vops_21_0= ruleVoidOperation ) ) )* otherlv_22= ';' ( (lv_sops_23_0= ruleStringOperation ) ) (otherlv_24= ';' ( (lv_sops_25_0= ruleStringOperation ) ) )* otherlv_26= 'END' )
            // InternalSecureUML2Java.g:104:3: otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SEES' ( (lv_sees_3_0= ruleBSees ) ) (otherlv_4= ',' ( (lv_sees_5_0= ruleBSees ) ) )* otherlv_6= 'VARIABLES' ( (lv_vars_7_0= ruleBVariable ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleBVariable ) ) )* otherlv_10= 'INVARIANT' ( (lv_invs_11_0= ruleBInvariant ) ) (otherlv_12= '&' ( (lv_invs_13_0= ruleBInvariant ) ) )* otherlv_14= 'INITIALISATION' ( (lv_inits_15_0= ruleBInit ) ) (otherlv_16= '||' ( (lv_inits_17_0= ruleBInit ) ) )* otherlv_18= 'OPERATIONS' ( (lv_vops_19_0= ruleVoidOperation ) ) (otherlv_20= ';' ( (lv_vops_21_0= ruleVoidOperation ) ) )* otherlv_22= ';' ( (lv_sops_23_0= ruleStringOperation ) ) (otherlv_24= ';' ( (lv_sops_25_0= ruleStringOperation ) ) )* otherlv_26= 'END'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBMachineAccess().getMACHINEKeyword_0());
            		
            // InternalSecureUML2Java.g:108:3: ( (lv_m_name_1_0= RULE_ID ) )
            // InternalSecureUML2Java.g:109:4: (lv_m_name_1_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:109:4: (lv_m_name_1_0= RULE_ID )
            // InternalSecureUML2Java.g:110:5: lv_m_name_1_0= RULE_ID
            {
            lv_m_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_m_name_1_0, grammarAccess.getBMachineAccess().getM_nameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"m_name",
            						lv_m_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBMachineAccess().getSEESKeyword_2());
            		
            // InternalSecureUML2Java.g:130:3: ( (lv_sees_3_0= ruleBSees ) )
            // InternalSecureUML2Java.g:131:4: (lv_sees_3_0= ruleBSees )
            {
            // InternalSecureUML2Java.g:131:4: (lv_sees_3_0= ruleBSees )
            // InternalSecureUML2Java.g:132:5: lv_sees_3_0= ruleBSees
            {

            					newCompositeNode(grammarAccess.getBMachineAccess().getSeesBSeesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_sees_3_0=ruleBSees();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBMachineRule());
            					}
            					add(
            						current,
            						"sees",
            						lv_sees_3_0,
            						"secureuml2Java.SecureUML2Java.BSees");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2Java.g:149:3: (otherlv_4= ',' ( (lv_sees_5_0= ruleBSees ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSecureUML2Java.g:150:4: otherlv_4= ',' ( (lv_sees_5_0= ruleBSees ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBMachineAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSecureUML2Java.g:154:4: ( (lv_sees_5_0= ruleBSees ) )
            	    // InternalSecureUML2Java.g:155:5: (lv_sees_5_0= ruleBSees )
            	    {
            	    // InternalSecureUML2Java.g:155:5: (lv_sees_5_0= ruleBSees )
            	    // InternalSecureUML2Java.g:156:6: lv_sees_5_0= ruleBSees
            	    {

            	    						newCompositeNode(grammarAccess.getBMachineAccess().getSeesBSeesParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_sees_5_0=ruleBSees();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sees",
            	    							lv_sees_5_0,
            	    							"secureuml2Java.SecureUML2Java.BSees");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getBMachineAccess().getVARIABLESKeyword_5());
            		
            // InternalSecureUML2Java.g:178:3: ( (lv_vars_7_0= ruleBVariable ) )
            // InternalSecureUML2Java.g:179:4: (lv_vars_7_0= ruleBVariable )
            {
            // InternalSecureUML2Java.g:179:4: (lv_vars_7_0= ruleBVariable )
            // InternalSecureUML2Java.g:180:5: lv_vars_7_0= ruleBVariable
            {

            					newCompositeNode(grammarAccess.getBMachineAccess().getVarsBVariableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_vars_7_0=ruleBVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBMachineRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_7_0,
            						"secureuml2Java.SecureUML2Java.BVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2Java.g:197:3: (otherlv_8= ',' ( (lv_vars_9_0= ruleBVariable ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSecureUML2Java.g:198:4: otherlv_8= ',' ( (lv_vars_9_0= ruleBVariable ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getBMachineAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSecureUML2Java.g:202:4: ( (lv_vars_9_0= ruleBVariable ) )
            	    // InternalSecureUML2Java.g:203:5: (lv_vars_9_0= ruleBVariable )
            	    {
            	    // InternalSecureUML2Java.g:203:5: (lv_vars_9_0= ruleBVariable )
            	    // InternalSecureUML2Java.g:204:6: lv_vars_9_0= ruleBVariable
            	    {

            	    						newCompositeNode(grammarAccess.getBMachineAccess().getVarsBVariableParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_vars_9_0=ruleBVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_9_0,
            	    							"secureuml2Java.SecureUML2Java.BVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getBMachineAccess().getINVARIANTKeyword_8());
            		
            // InternalSecureUML2Java.g:226:3: ( (lv_invs_11_0= ruleBInvariant ) )
            // InternalSecureUML2Java.g:227:4: (lv_invs_11_0= ruleBInvariant )
            {
            // InternalSecureUML2Java.g:227:4: (lv_invs_11_0= ruleBInvariant )
            // InternalSecureUML2Java.g:228:5: lv_invs_11_0= ruleBInvariant
            {

            					newCompositeNode(grammarAccess.getBMachineAccess().getInvsBInvariantParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_invs_11_0=ruleBInvariant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBMachineRule());
            					}
            					add(
            						current,
            						"invs",
            						lv_invs_11_0,
            						"secureuml2Java.SecureUML2Java.BInvariant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2Java.g:245:3: (otherlv_12= '&' ( (lv_invs_13_0= ruleBInvariant ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSecureUML2Java.g:246:4: otherlv_12= '&' ( (lv_invs_13_0= ruleBInvariant ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_12, grammarAccess.getBMachineAccess().getAmpersandKeyword_10_0());
            	    			
            	    // InternalSecureUML2Java.g:250:4: ( (lv_invs_13_0= ruleBInvariant ) )
            	    // InternalSecureUML2Java.g:251:5: (lv_invs_13_0= ruleBInvariant )
            	    {
            	    // InternalSecureUML2Java.g:251:5: (lv_invs_13_0= ruleBInvariant )
            	    // InternalSecureUML2Java.g:252:6: lv_invs_13_0= ruleBInvariant
            	    {

            	    						newCompositeNode(grammarAccess.getBMachineAccess().getInvsBInvariantParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_invs_13_0=ruleBInvariant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"invs",
            	    							lv_invs_13_0,
            	    							"secureuml2Java.SecureUML2Java.BInvariant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getBMachineAccess().getINITIALISATIONKeyword_11());
            		
            // InternalSecureUML2Java.g:274:3: ( (lv_inits_15_0= ruleBInit ) )
            // InternalSecureUML2Java.g:275:4: (lv_inits_15_0= ruleBInit )
            {
            // InternalSecureUML2Java.g:275:4: (lv_inits_15_0= ruleBInit )
            // InternalSecureUML2Java.g:276:5: lv_inits_15_0= ruleBInit
            {

            					newCompositeNode(grammarAccess.getBMachineAccess().getInitsBInitParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_inits_15_0=ruleBInit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBMachineRule());
            					}
            					add(
            						current,
            						"inits",
            						lv_inits_15_0,
            						"secureuml2Java.SecureUML2Java.BInit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2Java.g:293:3: (otherlv_16= '||' ( (lv_inits_17_0= ruleBInit ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSecureUML2Java.g:294:4: otherlv_16= '||' ( (lv_inits_17_0= ruleBInit ) )
            	    {
            	    otherlv_16=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_16, grammarAccess.getBMachineAccess().getVerticalLineVerticalLineKeyword_13_0());
            	    			
            	    // InternalSecureUML2Java.g:298:4: ( (lv_inits_17_0= ruleBInit ) )
            	    // InternalSecureUML2Java.g:299:5: (lv_inits_17_0= ruleBInit )
            	    {
            	    // InternalSecureUML2Java.g:299:5: (lv_inits_17_0= ruleBInit )
            	    // InternalSecureUML2Java.g:300:6: lv_inits_17_0= ruleBInit
            	    {

            	    						newCompositeNode(grammarAccess.getBMachineAccess().getInitsBInitParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_inits_17_0=ruleBInit();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inits",
            	    							lv_inits_17_0,
            	    							"secureuml2Java.SecureUML2Java.BInit");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_18=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getBMachineAccess().getOPERATIONSKeyword_14());
            		
            // InternalSecureUML2Java.g:322:3: ( (lv_vops_19_0= ruleVoidOperation ) )
            // InternalSecureUML2Java.g:323:4: (lv_vops_19_0= ruleVoidOperation )
            {
            // InternalSecureUML2Java.g:323:4: (lv_vops_19_0= ruleVoidOperation )
            // InternalSecureUML2Java.g:324:5: lv_vops_19_0= ruleVoidOperation
            {

            					newCompositeNode(grammarAccess.getBMachineAccess().getVopsVoidOperationParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_9);
            lv_vops_19_0=ruleVoidOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBMachineRule());
            					}
            					add(
            						current,
            						"vops",
            						lv_vops_19_0,
            						"secureuml2Java.SecureUML2Java.VoidOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2Java.g:341:3: (otherlv_20= ';' ( (lv_vops_21_0= ruleVoidOperation ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_ID) ) {
                        int LA5_2 = input.LA(3);

                        if ( (LA5_2==22) ) {
                            alt5=1;
                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalSecureUML2Java.g:342:4: otherlv_20= ';' ( (lv_vops_21_0= ruleVoidOperation ) )
            	    {
            	    otherlv_20=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_20, grammarAccess.getBMachineAccess().getSemicolonKeyword_16_0());
            	    			
            	    // InternalSecureUML2Java.g:346:4: ( (lv_vops_21_0= ruleVoidOperation ) )
            	    // InternalSecureUML2Java.g:347:5: (lv_vops_21_0= ruleVoidOperation )
            	    {
            	    // InternalSecureUML2Java.g:347:5: (lv_vops_21_0= ruleVoidOperation )
            	    // InternalSecureUML2Java.g:348:6: lv_vops_21_0= ruleVoidOperation
            	    {

            	    						newCompositeNode(grammarAccess.getBMachineAccess().getVopsVoidOperationParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_vops_21_0=ruleVoidOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vops",
            	    							lv_vops_21_0,
            	    							"secureuml2Java.SecureUML2Java.VoidOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_22=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_22, grammarAccess.getBMachineAccess().getSemicolonKeyword_17());
            		
            // InternalSecureUML2Java.g:370:3: ( (lv_sops_23_0= ruleStringOperation ) )
            // InternalSecureUML2Java.g:371:4: (lv_sops_23_0= ruleStringOperation )
            {
            // InternalSecureUML2Java.g:371:4: (lv_sops_23_0= ruleStringOperation )
            // InternalSecureUML2Java.g:372:5: lv_sops_23_0= ruleStringOperation
            {

            					newCompositeNode(grammarAccess.getBMachineAccess().getSopsStringOperationParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_10);
            lv_sops_23_0=ruleStringOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBMachineRule());
            					}
            					add(
            						current,
            						"sops",
            						lv_sops_23_0,
            						"secureuml2Java.SecureUML2Java.StringOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2Java.g:389:3: (otherlv_24= ';' ( (lv_sops_25_0= ruleStringOperation ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSecureUML2Java.g:390:4: otherlv_24= ';' ( (lv_sops_25_0= ruleStringOperation ) )
            	    {
            	    otherlv_24=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_24, grammarAccess.getBMachineAccess().getSemicolonKeyword_19_0());
            	    			
            	    // InternalSecureUML2Java.g:394:4: ( (lv_sops_25_0= ruleStringOperation ) )
            	    // InternalSecureUML2Java.g:395:5: (lv_sops_25_0= ruleStringOperation )
            	    {
            	    // InternalSecureUML2Java.g:395:5: (lv_sops_25_0= ruleStringOperation )
            	    // InternalSecureUML2Java.g:396:6: lv_sops_25_0= ruleStringOperation
            	    {

            	    						newCompositeNode(grammarAccess.getBMachineAccess().getSopsStringOperationParserRuleCall_19_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_sops_25_0=ruleStringOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sops",
            	    							lv_sops_25_0,
            	    							"secureuml2Java.SecureUML2Java.StringOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_26=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getBMachineAccess().getENDKeyword_20());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBMachine"


    // $ANTLR start "entryRuleVoidOperation"
    // InternalSecureUML2Java.g:422:1: entryRuleVoidOperation returns [EObject current=null] : iv_ruleVoidOperation= ruleVoidOperation EOF ;
    public final EObject entryRuleVoidOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidOperation = null;


        try {
            // InternalSecureUML2Java.g:422:54: (iv_ruleVoidOperation= ruleVoidOperation EOF )
            // InternalSecureUML2Java.g:423:2: iv_ruleVoidOperation= ruleVoidOperation EOF
            {
             newCompositeNode(grammarAccess.getVoidOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoidOperation=ruleVoidOperation();

            state._fsp--;

             current =iv_ruleVoidOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoidOperation"


    // $ANTLR start "ruleVoidOperation"
    // InternalSecureUML2Java.g:429:1: ruleVoidOperation returns [EObject current=null] : ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) (otherlv_11= '&' ( (lv_pre_12_0= ruleBPredicate ) ) )* otherlv_13= 'THEN' ( (lv_subs_14_0= ruleBSubstitution ) ) (otherlv_15= '||' ( (lv_subs_16_0= ruleBSubstitution ) ) )* otherlv_17= 'END' ) ;
    public final EObject ruleVoidOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_name_0_0=null;
        Token otherlv_1=null;
        Token lv_pList_2_0=null;
        Token otherlv_3=null;
        Token lv_pList_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_params_8_0 = null;

        EObject lv_params_10_0 = null;

        EObject lv_pre_12_0 = null;

        EObject lv_subs_14_0 = null;

        EObject lv_subs_16_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:435:2: ( ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) (otherlv_11= '&' ( (lv_pre_12_0= ruleBPredicate ) ) )* otherlv_13= 'THEN' ( (lv_subs_14_0= ruleBSubstitution ) ) (otherlv_15= '||' ( (lv_subs_16_0= ruleBSubstitution ) ) )* otherlv_17= 'END' ) )
            // InternalSecureUML2Java.g:436:2: ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) (otherlv_11= '&' ( (lv_pre_12_0= ruleBPredicate ) ) )* otherlv_13= 'THEN' ( (lv_subs_14_0= ruleBSubstitution ) ) (otherlv_15= '||' ( (lv_subs_16_0= ruleBSubstitution ) ) )* otherlv_17= 'END' )
            {
            // InternalSecureUML2Java.g:436:2: ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) (otherlv_11= '&' ( (lv_pre_12_0= ruleBPredicate ) ) )* otherlv_13= 'THEN' ( (lv_subs_14_0= ruleBSubstitution ) ) (otherlv_15= '||' ( (lv_subs_16_0= ruleBSubstitution ) ) )* otherlv_17= 'END' )
            // InternalSecureUML2Java.g:437:3: ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) (otherlv_11= '&' ( (lv_pre_12_0= ruleBPredicate ) ) )* otherlv_13= 'THEN' ( (lv_subs_14_0= ruleBSubstitution ) ) (otherlv_15= '||' ( (lv_subs_16_0= ruleBSubstitution ) ) )* otherlv_17= 'END'
            {
            // InternalSecureUML2Java.g:437:3: ( (lv_op_name_0_0= RULE_ID ) )
            // InternalSecureUML2Java.g:438:4: (lv_op_name_0_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:438:4: (lv_op_name_0_0= RULE_ID )
            // InternalSecureUML2Java.g:439:5: lv_op_name_0_0= RULE_ID
            {
            lv_op_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_op_name_0_0, grammarAccess.getVoidOperationAccess().getOp_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVoidOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"op_name",
            						lv_op_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSecureUML2Java.g:459:3: ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSecureUML2Java.g:460:4: ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )*
                    {
                    // InternalSecureUML2Java.g:460:4: ( (lv_pList_2_0= RULE_ID ) )
                    // InternalSecureUML2Java.g:461:5: (lv_pList_2_0= RULE_ID )
                    {
                    // InternalSecureUML2Java.g:461:5: (lv_pList_2_0= RULE_ID )
                    // InternalSecureUML2Java.g:462:6: lv_pList_2_0= RULE_ID
                    {
                    lv_pList_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_pList_2_0, grammarAccess.getVoidOperationAccess().getPListIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVoidOperationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"pList",
                    							lv_pList_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSecureUML2Java.g:478:4: (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSecureUML2Java.g:479:5: otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVoidOperationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSecureUML2Java.g:483:5: ( (lv_pList_4_0= RULE_ID ) )
                    	    // InternalSecureUML2Java.g:484:6: (lv_pList_4_0= RULE_ID )
                    	    {
                    	    // InternalSecureUML2Java.g:484:6: (lv_pList_4_0= RULE_ID )
                    	    // InternalSecureUML2Java.g:485:7: lv_pList_4_0= RULE_ID
                    	    {
                    	    lv_pList_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(lv_pList_4_0, grammarAccess.getVoidOperationAccess().getPListIDTerminalRuleCall_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVoidOperationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"pList",
                    	    								lv_pList_4_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getVoidOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getVoidOperationAccess().getEqualsSignKeyword_4());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getVoidOperationAccess().getPREKeyword_5());
            		
            // InternalSecureUML2Java.g:515:3: ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* )
            // InternalSecureUML2Java.g:516:4: ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )*
            {
            // InternalSecureUML2Java.g:516:4: ( (lv_params_8_0= ruleBParameter ) )
            // InternalSecureUML2Java.g:517:5: (lv_params_8_0= ruleBParameter )
            {
            // InternalSecureUML2Java.g:517:5: (lv_params_8_0= ruleBParameter )
            // InternalSecureUML2Java.g:518:6: lv_params_8_0= ruleBParameter
            {

            						newCompositeNode(grammarAccess.getVoidOperationAccess().getParamsBParameterParserRuleCall_6_0_0());
            					
            pushFollow(FOLLOW_16);
            lv_params_8_0=ruleBParameter();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            						}
            						add(
            							current,
            							"params",
            							lv_params_8_0,
            							"secureuml2Java.SecureUML2Java.BParameter");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalSecureUML2Java.g:535:4: (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_ID) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==31) ) {
                            int LA9_4 = input.LA(4);

                            if ( (LA9_4==RULE_ID) ) {
                                alt9=1;
                            }


                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalSecureUML2Java.g:536:5: otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_3); 

            	    					newLeafNode(otherlv_9, grammarAccess.getVoidOperationAccess().getAmpersandKeyword_6_1_0());
            	    				
            	    // InternalSecureUML2Java.g:540:5: ( (lv_params_10_0= ruleBParameter ) )
            	    // InternalSecureUML2Java.g:541:6: (lv_params_10_0= ruleBParameter )
            	    {
            	    // InternalSecureUML2Java.g:541:6: (lv_params_10_0= ruleBParameter )
            	    // InternalSecureUML2Java.g:542:7: lv_params_10_0= ruleBParameter
            	    {

            	    							newCompositeNode(grammarAccess.getVoidOperationAccess().getParamsBParameterParserRuleCall_6_1_1_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_params_10_0=ruleBParameter();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"params",
            	    								lv_params_10_0,
            	    								"secureuml2Java.SecureUML2Java.BParameter");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            // InternalSecureUML2Java.g:561:3: (otherlv_11= '&' ( (lv_pre_12_0= ruleBPredicate ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSecureUML2Java.g:562:4: otherlv_11= '&' ( (lv_pre_12_0= ruleBPredicate ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getVoidOperationAccess().getAmpersandKeyword_7_0());
            	    			
            	    // InternalSecureUML2Java.g:566:4: ( (lv_pre_12_0= ruleBPredicate ) )
            	    // InternalSecureUML2Java.g:567:5: (lv_pre_12_0= ruleBPredicate )
            	    {
            	    // InternalSecureUML2Java.g:567:5: (lv_pre_12_0= ruleBPredicate )
            	    // InternalSecureUML2Java.g:568:6: lv_pre_12_0= ruleBPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getVoidOperationAccess().getPreBPredicateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_pre_12_0=ruleBPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pre",
            	    							lv_pre_12_0,
            	    							"secureuml2Java.SecureUML2Java.BPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_13=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getVoidOperationAccess().getTHENKeyword_8());
            		
            // InternalSecureUML2Java.g:590:3: ( (lv_subs_14_0= ruleBSubstitution ) )
            // InternalSecureUML2Java.g:591:4: (lv_subs_14_0= ruleBSubstitution )
            {
            // InternalSecureUML2Java.g:591:4: (lv_subs_14_0= ruleBSubstitution )
            // InternalSecureUML2Java.g:592:5: lv_subs_14_0= ruleBSubstitution
            {

            					newCompositeNode(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_17);
            lv_subs_14_0=ruleBSubstitution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            					}
            					add(
            						current,
            						"subs",
            						lv_subs_14_0,
            						"secureuml2Java.SecureUML2Java.BSubstitution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2Java.g:609:3: (otherlv_15= '||' ( (lv_subs_16_0= ruleBSubstitution ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSecureUML2Java.g:610:4: otherlv_15= '||' ( (lv_subs_16_0= ruleBSubstitution ) )
            	    {
            	    otherlv_15=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_15, grammarAccess.getVoidOperationAccess().getVerticalLineVerticalLineKeyword_10_0());
            	    			
            	    // InternalSecureUML2Java.g:614:4: ( (lv_subs_16_0= ruleBSubstitution ) )
            	    // InternalSecureUML2Java.g:615:5: (lv_subs_16_0= ruleBSubstitution )
            	    {
            	    // InternalSecureUML2Java.g:615:5: (lv_subs_16_0= ruleBSubstitution )
            	    // InternalSecureUML2Java.g:616:6: lv_subs_16_0= ruleBSubstitution
            	    {

            	    						newCompositeNode(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_subs_16_0=ruleBSubstitution();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subs",
            	    							lv_subs_16_0,
            	    							"secureuml2Java.SecureUML2Java.BSubstitution");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_17=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getVoidOperationAccess().getENDKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoidOperation"


    // $ANTLR start "entryRuleStringOperation"
    // InternalSecureUML2Java.g:642:1: entryRuleStringOperation returns [EObject current=null] : iv_ruleStringOperation= ruleStringOperation EOF ;
    public final EObject entryRuleStringOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOperation = null;


        try {
            // InternalSecureUML2Java.g:642:56: (iv_ruleStringOperation= ruleStringOperation EOF )
            // InternalSecureUML2Java.g:643:2: iv_ruleStringOperation= ruleStringOperation EOF
            {
             newCompositeNode(grammarAccess.getStringOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringOperation=ruleStringOperation();

            state._fsp--;

             current =iv_ruleStringOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringOperation"


    // $ANTLR start "ruleStringOperation"
    // InternalSecureUML2Java.g:649:1: ruleStringOperation returns [EObject current=null] : ( ( (lv_res1_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'IF' ( (lv_pres1_15_0= ruleBPredicate ) ) (otherlv_16= '&' ( (lv_pres1_17_0= ruleBPredicate ) ) )* otherlv_18= 'THEN' otherlv_19= 'IF' ( (lv_pres2_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres2_22_0= ruleBPredicate ) ) )* otherlv_23= 'THEN' ( (lv_subif_24_0= ruleBSubstitution ) ) otherlv_25= 'ELSE' ( (lv_subelse2_26_0= ruleBSubstitution ) ) otherlv_27= 'END' otherlv_28= 'ELSE' ( (lv_subelse1_29_0= ruleBSubstitution ) ) otherlv_30= 'END' otherlv_31= 'END' ) ;
    public final EObject ruleStringOperation() throws RecognitionException {
        EObject current = null;

        Token lv_res1_0_0=null;
        Token otherlv_1=null;
        Token lv_op_name_2_0=null;
        Token otherlv_3=null;
        Token lv_pList_4_0=null;
        Token otherlv_5=null;
        Token lv_pList_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        EObject lv_params_10_0 = null;

        EObject lv_params_12_0 = null;

        EObject lv_pres1_15_0 = null;

        EObject lv_pres1_17_0 = null;

        EObject lv_pres2_20_0 = null;

        EObject lv_pres2_22_0 = null;

        EObject lv_subif_24_0 = null;

        EObject lv_subelse2_26_0 = null;

        EObject lv_subelse1_29_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:655:2: ( ( ( (lv_res1_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'IF' ( (lv_pres1_15_0= ruleBPredicate ) ) (otherlv_16= '&' ( (lv_pres1_17_0= ruleBPredicate ) ) )* otherlv_18= 'THEN' otherlv_19= 'IF' ( (lv_pres2_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres2_22_0= ruleBPredicate ) ) )* otherlv_23= 'THEN' ( (lv_subif_24_0= ruleBSubstitution ) ) otherlv_25= 'ELSE' ( (lv_subelse2_26_0= ruleBSubstitution ) ) otherlv_27= 'END' otherlv_28= 'ELSE' ( (lv_subelse1_29_0= ruleBSubstitution ) ) otherlv_30= 'END' otherlv_31= 'END' ) )
            // InternalSecureUML2Java.g:656:2: ( ( (lv_res1_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'IF' ( (lv_pres1_15_0= ruleBPredicate ) ) (otherlv_16= '&' ( (lv_pres1_17_0= ruleBPredicate ) ) )* otherlv_18= 'THEN' otherlv_19= 'IF' ( (lv_pres2_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres2_22_0= ruleBPredicate ) ) )* otherlv_23= 'THEN' ( (lv_subif_24_0= ruleBSubstitution ) ) otherlv_25= 'ELSE' ( (lv_subelse2_26_0= ruleBSubstitution ) ) otherlv_27= 'END' otherlv_28= 'ELSE' ( (lv_subelse1_29_0= ruleBSubstitution ) ) otherlv_30= 'END' otherlv_31= 'END' )
            {
            // InternalSecureUML2Java.g:656:2: ( ( (lv_res1_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'IF' ( (lv_pres1_15_0= ruleBPredicate ) ) (otherlv_16= '&' ( (lv_pres1_17_0= ruleBPredicate ) ) )* otherlv_18= 'THEN' otherlv_19= 'IF' ( (lv_pres2_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres2_22_0= ruleBPredicate ) ) )* otherlv_23= 'THEN' ( (lv_subif_24_0= ruleBSubstitution ) ) otherlv_25= 'ELSE' ( (lv_subelse2_26_0= ruleBSubstitution ) ) otherlv_27= 'END' otherlv_28= 'ELSE' ( (lv_subelse1_29_0= ruleBSubstitution ) ) otherlv_30= 'END' otherlv_31= 'END' )
            // InternalSecureUML2Java.g:657:3: ( (lv_res1_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'IF' ( (lv_pres1_15_0= ruleBPredicate ) ) (otherlv_16= '&' ( (lv_pres1_17_0= ruleBPredicate ) ) )* otherlv_18= 'THEN' otherlv_19= 'IF' ( (lv_pres2_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres2_22_0= ruleBPredicate ) ) )* otherlv_23= 'THEN' ( (lv_subif_24_0= ruleBSubstitution ) ) otherlv_25= 'ELSE' ( (lv_subelse2_26_0= ruleBSubstitution ) ) otherlv_27= 'END' otherlv_28= 'ELSE' ( (lv_subelse1_29_0= ruleBSubstitution ) ) otherlv_30= 'END' otherlv_31= 'END'
            {
            // InternalSecureUML2Java.g:657:3: ( (lv_res1_0_0= RULE_ID ) )
            // InternalSecureUML2Java.g:658:4: (lv_res1_0_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:658:4: (lv_res1_0_0= RULE_ID )
            // InternalSecureUML2Java.g:659:5: lv_res1_0_0= RULE_ID
            {
            lv_res1_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_res1_0_0, grammarAccess.getStringOperationAccess().getRes1IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"res1",
            						lv_res1_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStringOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1());
            		
            // InternalSecureUML2Java.g:679:3: ( (lv_op_name_2_0= RULE_ID ) )
            // InternalSecureUML2Java.g:680:4: (lv_op_name_2_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:680:4: (lv_op_name_2_0= RULE_ID )
            // InternalSecureUML2Java.g:681:5: lv_op_name_2_0= RULE_ID
            {
            lv_op_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_op_name_2_0, grammarAccess.getStringOperationAccess().getOp_nameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"op_name",
            						lv_op_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getStringOperationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSecureUML2Java.g:701:3: ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecureUML2Java.g:702:4: ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )*
                    {
                    // InternalSecureUML2Java.g:702:4: ( (lv_pList_4_0= RULE_ID ) )
                    // InternalSecureUML2Java.g:703:5: (lv_pList_4_0= RULE_ID )
                    {
                    // InternalSecureUML2Java.g:703:5: (lv_pList_4_0= RULE_ID )
                    // InternalSecureUML2Java.g:704:6: lv_pList_4_0= RULE_ID
                    {
                    lv_pList_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_pList_4_0, grammarAccess.getStringOperationAccess().getPListIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringOperationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"pList",
                    							lv_pList_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSecureUML2Java.g:720:4: (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSecureUML2Java.g:721:5: otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getStringOperationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalSecureUML2Java.g:725:5: ( (lv_pList_6_0= RULE_ID ) )
                    	    // InternalSecureUML2Java.g:726:6: (lv_pList_6_0= RULE_ID )
                    	    {
                    	    // InternalSecureUML2Java.g:726:6: (lv_pList_6_0= RULE_ID )
                    	    // InternalSecureUML2Java.g:727:7: lv_pList_6_0= RULE_ID
                    	    {
                    	    lv_pList_6_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(lv_pList_6_0, grammarAccess.getStringOperationAccess().getPListIDTerminalRuleCall_4_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStringOperationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"pList",
                    	    								lv_pList_6_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getStringOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getStringOperationAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getStringOperationAccess().getPREKeyword_7());
            		
            // InternalSecureUML2Java.g:757:3: ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* )
            // InternalSecureUML2Java.g:758:4: ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )*
            {
            // InternalSecureUML2Java.g:758:4: ( (lv_params_10_0= ruleBParameter ) )
            // InternalSecureUML2Java.g:759:5: (lv_params_10_0= ruleBParameter )
            {
            // InternalSecureUML2Java.g:759:5: (lv_params_10_0= ruleBParameter )
            // InternalSecureUML2Java.g:760:6: lv_params_10_0= ruleBParameter
            {

            						newCompositeNode(grammarAccess.getStringOperationAccess().getParamsBParameterParserRuleCall_8_0_0());
            					
            pushFollow(FOLLOW_16);
            lv_params_10_0=ruleBParameter();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStringOperationRule());
            						}
            						add(
            							current,
            							"params",
            							lv_params_10_0,
            							"secureuml2Java.SecureUML2Java.BParameter");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalSecureUML2Java.g:777:4: (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSecureUML2Java.g:778:5: otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getStringOperationAccess().getAmpersandKeyword_8_1_0());
            	    				
            	    // InternalSecureUML2Java.g:782:5: ( (lv_params_12_0= ruleBParameter ) )
            	    // InternalSecureUML2Java.g:783:6: (lv_params_12_0= ruleBParameter )
            	    {
            	    // InternalSecureUML2Java.g:783:6: (lv_params_12_0= ruleBParameter )
            	    // InternalSecureUML2Java.g:784:7: lv_params_12_0= ruleBParameter
            	    {

            	    							newCompositeNode(grammarAccess.getStringOperationAccess().getParamsBParameterParserRuleCall_8_1_1_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_params_12_0=ruleBParameter();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getStringOperationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"params",
            	    								lv_params_12_0,
            	    								"secureuml2Java.SecureUML2Java.BParameter");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            otherlv_13=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getStringOperationAccess().getTHENKeyword_9());
            		
            otherlv_14=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getStringOperationAccess().getIFKeyword_10());
            		
            // InternalSecureUML2Java.g:811:3: ( (lv_pres1_15_0= ruleBPredicate ) )
            // InternalSecureUML2Java.g:812:4: (lv_pres1_15_0= ruleBPredicate )
            {
            // InternalSecureUML2Java.g:812:4: (lv_pres1_15_0= ruleBPredicate )
            // InternalSecureUML2Java.g:813:5: lv_pres1_15_0= ruleBPredicate
            {

            					newCompositeNode(grammarAccess.getStringOperationAccess().getPres1BPredicateParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_16);
            lv_pres1_15_0=ruleBPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringOperationRule());
            					}
            					add(
            						current,
            						"pres1",
            						lv_pres1_15_0,
            						"secureuml2Java.SecureUML2Java.BPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2Java.g:830:3: (otherlv_16= '&' ( (lv_pres1_17_0= ruleBPredicate ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSecureUML2Java.g:831:4: otherlv_16= '&' ( (lv_pres1_17_0= ruleBPredicate ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_16, grammarAccess.getStringOperationAccess().getAmpersandKeyword_12_0());
            	    			
            	    // InternalSecureUML2Java.g:835:4: ( (lv_pres1_17_0= ruleBPredicate ) )
            	    // InternalSecureUML2Java.g:836:5: (lv_pres1_17_0= ruleBPredicate )
            	    {
            	    // InternalSecureUML2Java.g:836:5: (lv_pres1_17_0= ruleBPredicate )
            	    // InternalSecureUML2Java.g:837:6: lv_pres1_17_0= ruleBPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getStringOperationAccess().getPres1BPredicateParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_pres1_17_0=ruleBPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStringOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pres1",
            	    							lv_pres1_17_0,
            	    							"secureuml2Java.SecureUML2Java.BPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_18=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_18, grammarAccess.getStringOperationAccess().getTHENKeyword_13());
            		
            otherlv_19=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getStringOperationAccess().getIFKeyword_14());
            		
            // InternalSecureUML2Java.g:863:3: ( (lv_pres2_20_0= ruleBPredicate ) )
            // InternalSecureUML2Java.g:864:4: (lv_pres2_20_0= ruleBPredicate )
            {
            // InternalSecureUML2Java.g:864:4: (lv_pres2_20_0= ruleBPredicate )
            // InternalSecureUML2Java.g:865:5: lv_pres2_20_0= ruleBPredicate
            {

            					newCompositeNode(grammarAccess.getStringOperationAccess().getPres2BPredicateParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_16);
            lv_pres2_20_0=ruleBPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringOperationRule());
            					}
            					add(
            						current,
            						"pres2",
            						lv_pres2_20_0,
            						"secureuml2Java.SecureUML2Java.BPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2Java.g:882:3: (otherlv_21= '&' ( (lv_pres2_22_0= ruleBPredicate ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSecureUML2Java.g:883:4: otherlv_21= '&' ( (lv_pres2_22_0= ruleBPredicate ) )
            	    {
            	    otherlv_21=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_21, grammarAccess.getStringOperationAccess().getAmpersandKeyword_16_0());
            	    			
            	    // InternalSecureUML2Java.g:887:4: ( (lv_pres2_22_0= ruleBPredicate ) )
            	    // InternalSecureUML2Java.g:888:5: (lv_pres2_22_0= ruleBPredicate )
            	    {
            	    // InternalSecureUML2Java.g:888:5: (lv_pres2_22_0= ruleBPredicate )
            	    // InternalSecureUML2Java.g:889:6: lv_pres2_22_0= ruleBPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getStringOperationAccess().getPres2BPredicateParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_pres2_22_0=ruleBPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStringOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pres2",
            	    							lv_pres2_22_0,
            	    							"secureuml2Java.SecureUML2Java.BPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_23=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getStringOperationAccess().getTHENKeyword_17());
            		
            // InternalSecureUML2Java.g:911:3: ( (lv_subif_24_0= ruleBSubstitution ) )
            // InternalSecureUML2Java.g:912:4: (lv_subif_24_0= ruleBSubstitution )
            {
            // InternalSecureUML2Java.g:912:4: (lv_subif_24_0= ruleBSubstitution )
            // InternalSecureUML2Java.g:913:5: lv_subif_24_0= ruleBSubstitution
            {

            					newCompositeNode(grammarAccess.getStringOperationAccess().getSubifBSubstitutionParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_20);
            lv_subif_24_0=ruleBSubstitution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringOperationRule());
            					}
            					set(
            						current,
            						"subif",
            						lv_subif_24_0,
            						"secureuml2Java.SecureUML2Java.BSubstitution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_25, grammarAccess.getStringOperationAccess().getELSEKeyword_19());
            		
            // InternalSecureUML2Java.g:934:3: ( (lv_subelse2_26_0= ruleBSubstitution ) )
            // InternalSecureUML2Java.g:935:4: (lv_subelse2_26_0= ruleBSubstitution )
            {
            // InternalSecureUML2Java.g:935:4: (lv_subelse2_26_0= ruleBSubstitution )
            // InternalSecureUML2Java.g:936:5: lv_subelse2_26_0= ruleBSubstitution
            {

            					newCompositeNode(grammarAccess.getStringOperationAccess().getSubelse2BSubstitutionParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_21);
            lv_subelse2_26_0=ruleBSubstitution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringOperationRule());
            					}
            					set(
            						current,
            						"subelse2",
            						lv_subelse2_26_0,
            						"secureuml2Java.SecureUML2Java.BSubstitution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_27, grammarAccess.getStringOperationAccess().getENDKeyword_21());
            		
            otherlv_28=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_28, grammarAccess.getStringOperationAccess().getELSEKeyword_22());
            		
            // InternalSecureUML2Java.g:961:3: ( (lv_subelse1_29_0= ruleBSubstitution ) )
            // InternalSecureUML2Java.g:962:4: (lv_subelse1_29_0= ruleBSubstitution )
            {
            // InternalSecureUML2Java.g:962:4: (lv_subelse1_29_0= ruleBSubstitution )
            // InternalSecureUML2Java.g:963:5: lv_subelse1_29_0= ruleBSubstitution
            {

            					newCompositeNode(grammarAccess.getStringOperationAccess().getSubelse1BSubstitutionParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_21);
            lv_subelse1_29_0=ruleBSubstitution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringOperationRule());
            					}
            					set(
            						current,
            						"subelse1",
            						lv_subelse1_29_0,
            						"secureuml2Java.SecureUML2Java.BSubstitution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_30=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_30, grammarAccess.getStringOperationAccess().getENDKeyword_24());
            		
            otherlv_31=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getStringOperationAccess().getENDKeyword_25());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringOperation"


    // $ANTLR start "entryRuleBSubstitution"
    // InternalSecureUML2Java.g:992:1: entryRuleBSubstitution returns [EObject current=null] : iv_ruleBSubstitution= ruleBSubstitution EOF ;
    public final EObject entryRuleBSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSubstitution = null;


        try {
            // InternalSecureUML2Java.g:992:54: (iv_ruleBSubstitution= ruleBSubstitution EOF )
            // InternalSecureUML2Java.g:993:2: iv_ruleBSubstitution= ruleBSubstitution EOF
            {
             newCompositeNode(grammarAccess.getBSubstitutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSubstitution=ruleBSubstitution();

            state._fsp--;

             current =iv_ruleBSubstitution; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSubstitution"


    // $ANTLR start "ruleBSubstitution"
    // InternalSecureUML2Java.g:999:1: ruleBSubstitution returns [EObject current=null] : ( ( ( (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall ) ) ) otherlv_1= ':=' ( (lv_sright_2_0= RULE_ID ) ) ) ;
    public final EObject ruleBSubstitution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_sright_2_0=null;
        EObject lv_sleft_0_1 = null;

        EObject lv_sleft_0_2 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:1005:2: ( ( ( ( (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall ) ) ) otherlv_1= ':=' ( (lv_sright_2_0= RULE_ID ) ) ) )
            // InternalSecureUML2Java.g:1006:2: ( ( ( (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall ) ) ) otherlv_1= ':=' ( (lv_sright_2_0= RULE_ID ) ) )
            {
            // InternalSecureUML2Java.g:1006:2: ( ( ( (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall ) ) ) otherlv_1= ':=' ( (lv_sright_2_0= RULE_ID ) ) )
            // InternalSecureUML2Java.g:1007:3: ( ( (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall ) ) ) otherlv_1= ':=' ( (lv_sright_2_0= RULE_ID ) )
            {
            // InternalSecureUML2Java.g:1007:3: ( ( (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall ) ) )
            // InternalSecureUML2Java.g:1008:4: ( (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall ) )
            {
            // InternalSecureUML2Java.g:1008:4: ( (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall ) )
            // InternalSecureUML2Java.g:1009:5: (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall )
            {
            // InternalSecureUML2Java.g:1009:5: (lv_sleft_0_1= ruleBType | lv_sleft_0_2= ruleBOperationCall )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==22) ) {
                    alt17=2;
                }
                else if ( (LA17_1==30) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecureUML2Java.g:1010:6: lv_sleft_0_1= ruleBType
                    {

                    						newCompositeNode(grammarAccess.getBSubstitutionAccess().getSleftBTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_sleft_0_1=ruleBType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBSubstitutionRule());
                    						}
                    						set(
                    							current,
                    							"sleft",
                    							lv_sleft_0_1,
                    							"secureuml2Java.SecureUML2Java.BType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:1026:6: lv_sleft_0_2= ruleBOperationCall
                    {

                    						newCompositeNode(grammarAccess.getBSubstitutionAccess().getSleftBOperationCallParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_22);
                    lv_sleft_0_2=ruleBOperationCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBSubstitutionRule());
                    						}
                    						set(
                    							current,
                    							"sleft",
                    							lv_sleft_0_2,
                    							"secureuml2Java.SecureUML2Java.BOperationCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBSubstitutionAccess().getColonEqualsSignKeyword_1());
            		
            // InternalSecureUML2Java.g:1048:3: ( (lv_sright_2_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1049:4: (lv_sright_2_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1049:4: (lv_sright_2_0= RULE_ID )
            // InternalSecureUML2Java.g:1050:5: lv_sright_2_0= RULE_ID
            {
            lv_sright_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_sright_2_0, grammarAccess.getBSubstitutionAccess().getSrightIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBSubstitutionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sright",
            						lv_sright_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSubstitution"


    // $ANTLR start "entryRuleBPredicate"
    // InternalSecureUML2Java.g:1070:1: entryRuleBPredicate returns [EObject current=null] : iv_ruleBPredicate= ruleBPredicate EOF ;
    public final EObject entryRuleBPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBPredicate = null;


        try {
            // InternalSecureUML2Java.g:1070:51: (iv_ruleBPredicate= ruleBPredicate EOF )
            // InternalSecureUML2Java.g:1071:2: iv_ruleBPredicate= ruleBPredicate EOF
            {
             newCompositeNode(grammarAccess.getBPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBPredicate=ruleBPredicate();

            state._fsp--;

             current =iv_ruleBPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBPredicate"


    // $ANTLR start "ruleBPredicate"
    // InternalSecureUML2Java.g:1077:1: ruleBPredicate returns [EObject current=null] : ( ( ( (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple ) ) ) otherlv_1= ':' ( ( (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType ) ) ) ) ;
    public final EObject ruleBPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pleft_0_1 = null;

        EObject lv_pleft_0_2 = null;

        EObject lv_pright_2_1 = null;

        EObject lv_pright_2_2 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:1083:2: ( ( ( ( (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple ) ) ) otherlv_1= ':' ( ( (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType ) ) ) ) )
            // InternalSecureUML2Java.g:1084:2: ( ( ( (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple ) ) ) otherlv_1= ':' ( ( (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType ) ) ) )
            {
            // InternalSecureUML2Java.g:1084:2: ( ( ( (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple ) ) ) otherlv_1= ':' ( ( (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType ) ) ) )
            // InternalSecureUML2Java.g:1085:3: ( ( (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple ) ) ) otherlv_1= ':' ( ( (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType ) ) )
            {
            // InternalSecureUML2Java.g:1085:3: ( ( (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple ) ) )
            // InternalSecureUML2Java.g:1086:4: ( (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple ) )
            {
            // InternalSecureUML2Java.g:1086:4: ( (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple ) )
            // InternalSecureUML2Java.g:1087:5: (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple )
            {
            // InternalSecureUML2Java.g:1087:5: (lv_pleft_0_1= ruleBType | lv_pleft_0_2= ruleBTuple )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==22||LA18_1==35) ) {
                    alt18=2;
                }
                else if ( (LA18_1==31) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecureUML2Java.g:1088:6: lv_pleft_0_1= ruleBType
                    {

                    						newCompositeNode(grammarAccess.getBPredicateAccess().getPleftBTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_pleft_0_1=ruleBType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBPredicateRule());
                    						}
                    						set(
                    							current,
                    							"pleft",
                    							lv_pleft_0_1,
                    							"secureuml2Java.SecureUML2Java.BType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:1104:6: lv_pleft_0_2= ruleBTuple
                    {

                    						newCompositeNode(grammarAccess.getBPredicateAccess().getPleftBTupleParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_23);
                    lv_pleft_0_2=ruleBTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBPredicateRule());
                    						}
                    						set(
                    							current,
                    							"pleft",
                    							lv_pleft_0_2,
                    							"secureuml2Java.SecureUML2Java.BTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getBPredicateAccess().getColonKeyword_1());
            		
            // InternalSecureUML2Java.g:1126:3: ( ( (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType ) ) )
            // InternalSecureUML2Java.g:1127:4: ( (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType ) )
            {
            // InternalSecureUML2Java.g:1127:4: ( (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType ) )
            // InternalSecureUML2Java.g:1128:5: (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType )
            {
            // InternalSecureUML2Java.g:1128:5: (lv_pright_2_1= ruleBDom | lv_pright_2_2= ruleBType )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecureUML2Java.g:1129:6: lv_pright_2_1= ruleBDom
                    {

                    						newCompositeNode(grammarAccess.getBPredicateAccess().getPrightBDomParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pright_2_1=ruleBDom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBPredicateRule());
                    						}
                    						set(
                    							current,
                    							"pright",
                    							lv_pright_2_1,
                    							"secureuml2Java.SecureUML2Java.BDom");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:1145:6: lv_pright_2_2= ruleBType
                    {

                    						newCompositeNode(grammarAccess.getBPredicateAccess().getPrightBTypeParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pright_2_2=ruleBType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBPredicateRule());
                    						}
                    						set(
                    							current,
                    							"pright",
                    							lv_pright_2_2,
                    							"secureuml2Java.SecureUML2Java.BType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBPredicate"


    // $ANTLR start "entryRuleBDom"
    // InternalSecureUML2Java.g:1167:1: entryRuleBDom returns [EObject current=null] : iv_ruleBDom= ruleBDom EOF ;
    public final EObject entryRuleBDom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBDom = null;


        try {
            // InternalSecureUML2Java.g:1167:45: (iv_ruleBDom= ruleBDom EOF )
            // InternalSecureUML2Java.g:1168:2: iv_ruleBDom= ruleBDom EOF
            {
             newCompositeNode(grammarAccess.getBDomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBDom=ruleBDom();

            state._fsp--;

             current =iv_ruleBDom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBDom"


    // $ANTLR start "ruleBDom"
    // InternalSecureUML2Java.g:1174:1: ruleBDom returns [EObject current=null] : (otherlv_0= 'dom' otherlv_1= '(' ( (lv_obj_2_0= ruleBType ) ) otherlv_3= ')' ) ;
    public final EObject ruleBDom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_obj_2_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:1180:2: ( (otherlv_0= 'dom' otherlv_1= '(' ( (lv_obj_2_0= ruleBType ) ) otherlv_3= ')' ) )
            // InternalSecureUML2Java.g:1181:2: (otherlv_0= 'dom' otherlv_1= '(' ( (lv_obj_2_0= ruleBType ) ) otherlv_3= ')' )
            {
            // InternalSecureUML2Java.g:1181:2: (otherlv_0= 'dom' otherlv_1= '(' ( (lv_obj_2_0= ruleBType ) ) otherlv_3= ')' )
            // InternalSecureUML2Java.g:1182:3: otherlv_0= 'dom' otherlv_1= '(' ( (lv_obj_2_0= ruleBType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBDomAccess().getDomKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBDomAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSecureUML2Java.g:1190:3: ( (lv_obj_2_0= ruleBType ) )
            // InternalSecureUML2Java.g:1191:4: (lv_obj_2_0= ruleBType )
            {
            // InternalSecureUML2Java.g:1191:4: (lv_obj_2_0= ruleBType )
            // InternalSecureUML2Java.g:1192:5: lv_obj_2_0= ruleBType
            {

            					newCompositeNode(grammarAccess.getBDomAccess().getObjBTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_obj_2_0=ruleBType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBDomRule());
            					}
            					set(
            						current,
            						"obj",
            						lv_obj_2_0,
            						"secureuml2Java.SecureUML2Java.BType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBDomAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBDom"


    // $ANTLR start "entryRuleBParameter"
    // InternalSecureUML2Java.g:1217:1: entryRuleBParameter returns [EObject current=null] : iv_ruleBParameter= ruleBParameter EOF ;
    public final EObject entryRuleBParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBParameter = null;


        try {
            // InternalSecureUML2Java.g:1217:51: (iv_ruleBParameter= ruleBParameter EOF )
            // InternalSecureUML2Java.g:1218:2: iv_ruleBParameter= ruleBParameter EOF
            {
             newCompositeNode(grammarAccess.getBParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBParameter=ruleBParameter();

            state._fsp--;

             current =iv_ruleBParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBParameter"


    // $ANTLR start "ruleBParameter"
    // InternalSecureUML2Java.g:1224:1: ruleBParameter returns [EObject current=null] : ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) ;
    public final EObject ruleBParameter() throws RecognitionException {
        EObject current = null;

        Token lv_p_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:1230:2: ( ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) )
            // InternalSecureUML2Java.g:1231:2: ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            {
            // InternalSecureUML2Java.g:1231:2: ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            // InternalSecureUML2Java.g:1232:3: ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) )
            {
            // InternalSecureUML2Java.g:1232:3: ( (lv_p_name_0_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1233:4: (lv_p_name_0_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1233:4: (lv_p_name_0_0= RULE_ID )
            // InternalSecureUML2Java.g:1234:5: lv_p_name_0_0= RULE_ID
            {
            lv_p_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_p_name_0_0, grammarAccess.getBParameterAccess().getP_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"p_name",
            						lv_p_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBParameterAccess().getColonKeyword_1());
            		
            // InternalSecureUML2Java.g:1254:3: ( (lv_type_2_0= ruleBType ) )
            // InternalSecureUML2Java.g:1255:4: (lv_type_2_0= ruleBType )
            {
            // InternalSecureUML2Java.g:1255:4: (lv_type_2_0= ruleBType )
            // InternalSecureUML2Java.g:1256:5: lv_type_2_0= ruleBType
            {

            					newCompositeNode(grammarAccess.getBParameterAccess().getTypeBTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleBType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"secureuml2Java.SecureUML2Java.BType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBParameter"


    // $ANTLR start "entryRuleBType"
    // InternalSecureUML2Java.g:1277:1: entryRuleBType returns [EObject current=null] : iv_ruleBType= ruleBType EOF ;
    public final EObject entryRuleBType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBType = null;


        try {
            // InternalSecureUML2Java.g:1277:46: (iv_ruleBType= ruleBType EOF )
            // InternalSecureUML2Java.g:1278:2: iv_ruleBType= ruleBType EOF
            {
             newCompositeNode(grammarAccess.getBTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBType=ruleBType();

            state._fsp--;

             current =iv_ruleBType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBType"


    // $ANTLR start "ruleBType"
    // InternalSecureUML2Java.g:1284:1: ruleBType returns [EObject current=null] : ( (lv_type_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBType() throws RecognitionException {
        EObject current = null;

        Token lv_type_name_0_0=null;


        	enterRule();

        try {
            // InternalSecureUML2Java.g:1290:2: ( ( (lv_type_name_0_0= RULE_ID ) ) )
            // InternalSecureUML2Java.g:1291:2: ( (lv_type_name_0_0= RULE_ID ) )
            {
            // InternalSecureUML2Java.g:1291:2: ( (lv_type_name_0_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1292:3: (lv_type_name_0_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1292:3: (lv_type_name_0_0= RULE_ID )
            // InternalSecureUML2Java.g:1293:4: lv_type_name_0_0= RULE_ID
            {
            lv_type_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_type_name_0_0, grammarAccess.getBTypeAccess().getType_nameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"type_name",
            					lv_type_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBType"


    // $ANTLR start "entryRuleBInit"
    // InternalSecureUML2Java.g:1312:1: entryRuleBInit returns [EObject current=null] : iv_ruleBInit= ruleBInit EOF ;
    public final EObject entryRuleBInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBInit = null;


        try {
            // InternalSecureUML2Java.g:1312:46: (iv_ruleBInit= ruleBInit EOF )
            // InternalSecureUML2Java.g:1313:2: iv_ruleBInit= ruleBInit EOF
            {
             newCompositeNode(grammarAccess.getBInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBInit=ruleBInit();

            state._fsp--;

             current =iv_ruleBInit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBInit"


    // $ANTLR start "ruleBInit"
    // InternalSecureUML2Java.g:1319:1: ruleBInit returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= '{' ( (lv_pair_3_0= ruleBTuple ) ) otherlv_4= '}' ) ;
    public final EObject ruleBInit() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pair_3_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:1325:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= '{' ( (lv_pair_3_0= ruleBTuple ) ) otherlv_4= '}' ) )
            // InternalSecureUML2Java.g:1326:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= '{' ( (lv_pair_3_0= ruleBTuple ) ) otherlv_4= '}' )
            {
            // InternalSecureUML2Java.g:1326:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= '{' ( (lv_pair_3_0= ruleBTuple ) ) otherlv_4= '}' )
            // InternalSecureUML2Java.g:1327:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= '{' ( (lv_pair_3_0= ruleBTuple ) ) otherlv_4= '}'
            {
            // InternalSecureUML2Java.g:1327:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1328:4: (lv_var_0_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1328:4: (lv_var_0_0= RULE_ID )
            // InternalSecureUML2Java.g:1329:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_var_0_0, grammarAccess.getBInitAccess().getVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBInitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBInitAccess().getColonEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBInitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSecureUML2Java.g:1353:3: ( (lv_pair_3_0= ruleBTuple ) )
            // InternalSecureUML2Java.g:1354:4: (lv_pair_3_0= ruleBTuple )
            {
            // InternalSecureUML2Java.g:1354:4: (lv_pair_3_0= ruleBTuple )
            // InternalSecureUML2Java.g:1355:5: lv_pair_3_0= ruleBTuple
            {

            					newCompositeNode(grammarAccess.getBInitAccess().getPairBTupleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_pair_3_0=ruleBTuple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBInitRule());
            					}
            					add(
            						current,
            						"pair",
            						lv_pair_3_0,
            						"secureuml2Java.SecureUML2Java.BTuple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBInitAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBInit"


    // $ANTLR start "entryRuleBTuple"
    // InternalSecureUML2Java.g:1380:1: entryRuleBTuple returns [EObject current=null] : iv_ruleBTuple= ruleBTuple EOF ;
    public final EObject entryRuleBTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTuple = null;


        try {
            // InternalSecureUML2Java.g:1380:47: (iv_ruleBTuple= ruleBTuple EOF )
            // InternalSecureUML2Java.g:1381:2: iv_ruleBTuple= ruleBTuple EOF
            {
             newCompositeNode(grammarAccess.getBTupleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBTuple=ruleBTuple();

            state._fsp--;

             current =iv_ruleBTuple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTuple"


    // $ANTLR start "ruleBTuple"
    // InternalSecureUML2Java.g:1387:1: ruleBTuple returns [EObject current=null] : ( ( ( (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall ) ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) ) ) ;
    public final EObject ruleBTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_dom_2_0=null;
        EObject lv_ran_0_1 = null;

        EObject lv_ran_0_2 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:1393:2: ( ( ( ( (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall ) ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) ) ) )
            // InternalSecureUML2Java.g:1394:2: ( ( ( (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall ) ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) ) )
            {
            // InternalSecureUML2Java.g:1394:2: ( ( ( (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall ) ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) ) )
            // InternalSecureUML2Java.g:1395:3: ( ( (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall ) ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) )
            {
            // InternalSecureUML2Java.g:1395:3: ( ( (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall ) ) )
            // InternalSecureUML2Java.g:1396:4: ( (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall ) )
            {
            // InternalSecureUML2Java.g:1396:4: ( (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall ) )
            // InternalSecureUML2Java.g:1397:5: (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall )
            {
            // InternalSecureUML2Java.g:1397:5: (lv_ran_0_1= ruleBType | lv_ran_0_2= ruleBOperationCall )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==22) ) {
                    alt20=2;
                }
                else if ( (LA20_1==35) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecureUML2Java.g:1398:6: lv_ran_0_1= ruleBType
                    {

                    						newCompositeNode(grammarAccess.getBTupleAccess().getRanBTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_ran_0_1=ruleBType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBTupleRule());
                    						}
                    						set(
                    							current,
                    							"ran",
                    							lv_ran_0_1,
                    							"secureuml2Java.SecureUML2Java.BType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:1414:6: lv_ran_0_2= ruleBOperationCall
                    {

                    						newCompositeNode(grammarAccess.getBTupleAccess().getRanBOperationCallParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_28);
                    lv_ran_0_2=ruleBOperationCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBTupleRule());
                    						}
                    						set(
                    							current,
                    							"ran",
                    							lv_ran_0_2,
                    							"secureuml2Java.SecureUML2Java.BOperationCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBTupleAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalSecureUML2Java.g:1436:3: ( (lv_dom_2_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1437:4: (lv_dom_2_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1437:4: (lv_dom_2_0= RULE_ID )
            // InternalSecureUML2Java.g:1438:5: lv_dom_2_0= RULE_ID
            {
            lv_dom_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_dom_2_0, grammarAccess.getBTupleAccess().getDomIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBTupleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dom",
            						lv_dom_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBTuple"


    // $ANTLR start "entryRuleBOperationCall"
    // InternalSecureUML2Java.g:1458:1: entryRuleBOperationCall returns [EObject current=null] : iv_ruleBOperationCall= ruleBOperationCall EOF ;
    public final EObject entryRuleBOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOperationCall = null;


        try {
            // InternalSecureUML2Java.g:1458:55: (iv_ruleBOperationCall= ruleBOperationCall EOF )
            // InternalSecureUML2Java.g:1459:2: iv_ruleBOperationCall= ruleBOperationCall EOF
            {
             newCompositeNode(grammarAccess.getBOperationCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOperationCall=ruleBOperationCall();

            state._fsp--;

             current =iv_ruleBOperationCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOperationCall"


    // $ANTLR start "ruleBOperationCall"
    // InternalSecureUML2Java.g:1465:1: ruleBOperationCall returns [EObject current=null] : ( ( (lv_op_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleBOperationCall() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token lv_par_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSecureUML2Java.g:1471:2: ( ( ( (lv_op_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSecureUML2Java.g:1472:2: ( ( (lv_op_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSecureUML2Java.g:1472:2: ( ( (lv_op_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalSecureUML2Java.g:1473:3: ( (lv_op_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalSecureUML2Java.g:1473:3: ( (lv_op_0_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1474:4: (lv_op_0_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1474:4: (lv_op_0_0= RULE_ID )
            // InternalSecureUML2Java.g:1475:5: lv_op_0_0= RULE_ID
            {
            lv_op_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_op_0_0, grammarAccess.getBOperationCallAccess().getOpIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBOperationCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"op",
            						lv_op_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBOperationCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSecureUML2Java.g:1495:3: ( (lv_par_2_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1496:4: (lv_par_2_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1496:4: (lv_par_2_0= RULE_ID )
            // InternalSecureUML2Java.g:1497:5: lv_par_2_0= RULE_ID
            {
            lv_par_2_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_par_2_0, grammarAccess.getBOperationCallAccess().getParIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBOperationCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"par",
            						lv_par_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBOperationCallAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOperationCall"


    // $ANTLR start "entryRuleBInvariant"
    // InternalSecureUML2Java.g:1521:1: entryRuleBInvariant returns [EObject current=null] : iv_ruleBInvariant= ruleBInvariant EOF ;
    public final EObject entryRuleBInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBInvariant = null;


        try {
            // InternalSecureUML2Java.g:1521:51: (iv_ruleBInvariant= ruleBInvariant EOF )
            // InternalSecureUML2Java.g:1522:2: iv_ruleBInvariant= ruleBInvariant EOF
            {
             newCompositeNode(grammarAccess.getBInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBInvariant=ruleBInvariant();

            state._fsp--;

             current =iv_ruleBInvariant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBInvariant"


    // $ANTLR start "ruleBInvariant"
    // InternalSecureUML2Java.g:1528:1: ruleBInvariant returns [EObject current=null] : ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_vardif_2_0= ruleBFunction ) ) ) | ( ( (lv_dom_3_0= RULE_ID ) ) otherlv_4= '<:' ( (lv_ran_5_0= RULE_ID ) ) ) ) ;
    public final EObject ruleBInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token lv_dom_3_0=null;
        Token otherlv_4=null;
        Token lv_ran_5_0=null;
        EObject lv_vardif_2_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2Java.g:1534:2: ( ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_vardif_2_0= ruleBFunction ) ) ) | ( ( (lv_dom_3_0= RULE_ID ) ) otherlv_4= '<:' ( (lv_ran_5_0= RULE_ID ) ) ) ) )
            // InternalSecureUML2Java.g:1535:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_vardif_2_0= ruleBFunction ) ) ) | ( ( (lv_dom_3_0= RULE_ID ) ) otherlv_4= '<:' ( (lv_ran_5_0= RULE_ID ) ) ) )
            {
            // InternalSecureUML2Java.g:1535:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_vardif_2_0= ruleBFunction ) ) ) | ( ( (lv_dom_3_0= RULE_ID ) ) otherlv_4= '<:' ( (lv_ran_5_0= RULE_ID ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==31) ) {
                    alt21=1;
                }
                else if ( (LA21_1==36) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecureUML2Java.g:1536:3: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_vardif_2_0= ruleBFunction ) ) )
                    {
                    // InternalSecureUML2Java.g:1536:3: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_vardif_2_0= ruleBFunction ) ) )
                    // InternalSecureUML2Java.g:1537:4: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_vardif_2_0= ruleBFunction ) )
                    {
                    // InternalSecureUML2Java.g:1537:4: ( (lv_var_0_0= RULE_ID ) )
                    // InternalSecureUML2Java.g:1538:5: (lv_var_0_0= RULE_ID )
                    {
                    // InternalSecureUML2Java.g:1538:5: (lv_var_0_0= RULE_ID )
                    // InternalSecureUML2Java.g:1539:6: lv_var_0_0= RULE_ID
                    {
                    lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(lv_var_0_0, grammarAccess.getBInvariantAccess().getVarIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBInvariantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"var",
                    							lv_var_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getBInvariantAccess().getColonKeyword_0_1());
                    			
                    // InternalSecureUML2Java.g:1559:4: ( (lv_vardif_2_0= ruleBFunction ) )
                    // InternalSecureUML2Java.g:1560:5: (lv_vardif_2_0= ruleBFunction )
                    {
                    // InternalSecureUML2Java.g:1560:5: (lv_vardif_2_0= ruleBFunction )
                    // InternalSecureUML2Java.g:1561:6: lv_vardif_2_0= ruleBFunction
                    {

                    						newCompositeNode(grammarAccess.getBInvariantAccess().getVardifBFunctionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_vardif_2_0=ruleBFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBInvariantRule());
                    						}
                    						set(
                    							current,
                    							"vardif",
                    							lv_vardif_2_0,
                    							"secureuml2Java.SecureUML2Java.BFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:1580:3: ( ( (lv_dom_3_0= RULE_ID ) ) otherlv_4= '<:' ( (lv_ran_5_0= RULE_ID ) ) )
                    {
                    // InternalSecureUML2Java.g:1580:3: ( ( (lv_dom_3_0= RULE_ID ) ) otherlv_4= '<:' ( (lv_ran_5_0= RULE_ID ) ) )
                    // InternalSecureUML2Java.g:1581:4: ( (lv_dom_3_0= RULE_ID ) ) otherlv_4= '<:' ( (lv_ran_5_0= RULE_ID ) )
                    {
                    // InternalSecureUML2Java.g:1581:4: ( (lv_dom_3_0= RULE_ID ) )
                    // InternalSecureUML2Java.g:1582:5: (lv_dom_3_0= RULE_ID )
                    {
                    // InternalSecureUML2Java.g:1582:5: (lv_dom_3_0= RULE_ID )
                    // InternalSecureUML2Java.g:1583:6: lv_dom_3_0= RULE_ID
                    {
                    lv_dom_3_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(lv_dom_3_0, grammarAccess.getBInvariantAccess().getDomIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBInvariantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dom",
                    							lv_dom_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBInvariantAccess().getLessThanSignColonKeyword_1_1());
                    			
                    // InternalSecureUML2Java.g:1603:4: ( (lv_ran_5_0= RULE_ID ) )
                    // InternalSecureUML2Java.g:1604:5: (lv_ran_5_0= RULE_ID )
                    {
                    // InternalSecureUML2Java.g:1604:5: (lv_ran_5_0= RULE_ID )
                    // InternalSecureUML2Java.g:1605:6: lv_ran_5_0= RULE_ID
                    {
                    lv_ran_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_ran_5_0, grammarAccess.getBInvariantAccess().getRanIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBInvariantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ran",
                    							lv_ran_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBInvariant"


    // $ANTLR start "entryRuleBFunction"
    // InternalSecureUML2Java.g:1626:1: entryRuleBFunction returns [EObject current=null] : iv_ruleBFunction= ruleBFunction EOF ;
    public final EObject entryRuleBFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBFunction = null;


        try {
            // InternalSecureUML2Java.g:1626:50: (iv_ruleBFunction= ruleBFunction EOF )
            // InternalSecureUML2Java.g:1627:2: iv_ruleBFunction= ruleBFunction EOF
            {
             newCompositeNode(grammarAccess.getBFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBFunction=ruleBFunction();

            state._fsp--;

             current =iv_ruleBFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBFunction"


    // $ANTLR start "ruleBFunction"
    // InternalSecureUML2Java.g:1633:1: ruleBFunction returns [EObject current=null] : ( ( (lv_ran_0_0= RULE_ID ) ) (otherlv_1= '-->' | otherlv_2= '+->' | otherlv_3= '<->' ) ( (lv_dom_4_0= RULE_ID ) ) ) ;
    public final EObject ruleBFunction() throws RecognitionException {
        EObject current = null;

        Token lv_ran_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_dom_4_0=null;


        	enterRule();

        try {
            // InternalSecureUML2Java.g:1639:2: ( ( ( (lv_ran_0_0= RULE_ID ) ) (otherlv_1= '-->' | otherlv_2= '+->' | otherlv_3= '<->' ) ( (lv_dom_4_0= RULE_ID ) ) ) )
            // InternalSecureUML2Java.g:1640:2: ( ( (lv_ran_0_0= RULE_ID ) ) (otherlv_1= '-->' | otherlv_2= '+->' | otherlv_3= '<->' ) ( (lv_dom_4_0= RULE_ID ) ) )
            {
            // InternalSecureUML2Java.g:1640:2: ( ( (lv_ran_0_0= RULE_ID ) ) (otherlv_1= '-->' | otherlv_2= '+->' | otherlv_3= '<->' ) ( (lv_dom_4_0= RULE_ID ) ) )
            // InternalSecureUML2Java.g:1641:3: ( (lv_ran_0_0= RULE_ID ) ) (otherlv_1= '-->' | otherlv_2= '+->' | otherlv_3= '<->' ) ( (lv_dom_4_0= RULE_ID ) )
            {
            // InternalSecureUML2Java.g:1641:3: ( (lv_ran_0_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1642:4: (lv_ran_0_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1642:4: (lv_ran_0_0= RULE_ID )
            // InternalSecureUML2Java.g:1643:5: lv_ran_0_0= RULE_ID
            {
            lv_ran_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_ran_0_0, grammarAccess.getBFunctionAccess().getRanIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ran",
            						lv_ran_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSecureUML2Java.g:1659:3: (otherlv_1= '-->' | otherlv_2= '+->' | otherlv_3= '<->' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt22=1;
                }
                break;
            case 38:
                {
                alt22=2;
                }
                break;
            case 39:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSecureUML2Java.g:1660:4: otherlv_1= '-->'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getBFunctionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSecureUML2Java.g:1665:4: otherlv_2= '+->'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getBFunctionAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalSecureUML2Java.g:1670:4: otherlv_3= '<->'
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBFunctionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalSecureUML2Java.g:1675:3: ( (lv_dom_4_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1676:4: (lv_dom_4_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1676:4: (lv_dom_4_0= RULE_ID )
            // InternalSecureUML2Java.g:1677:5: lv_dom_4_0= RULE_ID
            {
            lv_dom_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_dom_4_0, grammarAccess.getBFunctionAccess().getDomIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dom",
            						lv_dom_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBFunction"


    // $ANTLR start "entryRuleBVariable"
    // InternalSecureUML2Java.g:1697:1: entryRuleBVariable returns [EObject current=null] : iv_ruleBVariable= ruleBVariable EOF ;
    public final EObject entryRuleBVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBVariable = null;


        try {
            // InternalSecureUML2Java.g:1697:50: (iv_ruleBVariable= ruleBVariable EOF )
            // InternalSecureUML2Java.g:1698:2: iv_ruleBVariable= ruleBVariable EOF
            {
             newCompositeNode(grammarAccess.getBVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBVariable=ruleBVariable();

            state._fsp--;

             current =iv_ruleBVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBVariable"


    // $ANTLR start "ruleBVariable"
    // InternalSecureUML2Java.g:1704:1: ruleBVariable returns [EObject current=null] : ( (lv_var_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBVariable() throws RecognitionException {
        EObject current = null;

        Token lv_var_name_0_0=null;


        	enterRule();

        try {
            // InternalSecureUML2Java.g:1710:2: ( ( (lv_var_name_0_0= RULE_ID ) ) )
            // InternalSecureUML2Java.g:1711:2: ( (lv_var_name_0_0= RULE_ID ) )
            {
            // InternalSecureUML2Java.g:1711:2: ( (lv_var_name_0_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1712:3: (lv_var_name_0_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1712:3: (lv_var_name_0_0= RULE_ID )
            // InternalSecureUML2Java.g:1713:4: lv_var_name_0_0= RULE_ID
            {
            lv_var_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_var_name_0_0, grammarAccess.getBVariableAccess().getVar_nameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"var_name",
            					lv_var_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBVariable"


    // $ANTLR start "entryRuleBSees"
    // InternalSecureUML2Java.g:1732:1: entryRuleBSees returns [EObject current=null] : iv_ruleBSees= ruleBSees EOF ;
    public final EObject entryRuleBSees() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSees = null;


        try {
            // InternalSecureUML2Java.g:1732:46: (iv_ruleBSees= ruleBSees EOF )
            // InternalSecureUML2Java.g:1733:2: iv_ruleBSees= ruleBSees EOF
            {
             newCompositeNode(grammarAccess.getBSeesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSees=ruleBSees();

            state._fsp--;

             current =iv_ruleBSees; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSees"


    // $ANTLR start "ruleBSees"
    // InternalSecureUML2Java.g:1739:1: ruleBSees returns [EObject current=null] : ( (lv_m_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBSees() throws RecognitionException {
        EObject current = null;

        Token lv_m_name_0_0=null;


        	enterRule();

        try {
            // InternalSecureUML2Java.g:1745:2: ( ( (lv_m_name_0_0= RULE_ID ) ) )
            // InternalSecureUML2Java.g:1746:2: ( (lv_m_name_0_0= RULE_ID ) )
            {
            // InternalSecureUML2Java.g:1746:2: ( (lv_m_name_0_0= RULE_ID ) )
            // InternalSecureUML2Java.g:1747:3: (lv_m_name_0_0= RULE_ID )
            {
            // InternalSecureUML2Java.g:1747:3: (lv_m_name_0_0= RULE_ID )
            // InternalSecureUML2Java.g:1748:4: lv_m_name_0_0= RULE_ID
            {
            lv_m_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_m_name_0_0, grammarAccess.getBSeesAccess().getM_nameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBSeesRule());
            				}
            				setWithLastConsumed(
            					current,
            					"m_name",
            					lv_m_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSees"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000E000000000L});

}