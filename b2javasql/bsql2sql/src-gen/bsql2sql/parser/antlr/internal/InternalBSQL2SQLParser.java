package bsql2sql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import bsql2sql.services.BSQL2SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSQL2SQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MACHINE'", "'VARIABLES'", "'INVARIANT'", "'INITIALISATION'", "':='", "'{}'", "'OPERATIONS'", "'<:'", "'struct'", "'('", "','", "')'", "':'", "'FALSE'", "'TRUE'", "'res'", "'<--'", "'='", "'PRE'", "'&'", "'THEN'", "'bool('", "'#'", "'END'", "'\\''", "'.('"
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

        public InternalBSQL2SQLParser(TokenStream input, BSQL2SQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BSQL2SQL";
       	}

       	@Override
       	protected BSQL2SQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBSQL2SQL"
    // InternalBSQL2SQL.g:64:1: entryRuleBSQL2SQL returns [EObject current=null] : iv_ruleBSQL2SQL= ruleBSQL2SQL EOF ;
    public final EObject entryRuleBSQL2SQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSQL2SQL = null;


        try {
            // InternalBSQL2SQL.g:64:49: (iv_ruleBSQL2SQL= ruleBSQL2SQL EOF )
            // InternalBSQL2SQL.g:65:2: iv_ruleBSQL2SQL= ruleBSQL2SQL EOF
            {
             newCompositeNode(grammarAccess.getBSQL2SQLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSQL2SQL=ruleBSQL2SQL();

            state._fsp--;

             current =iv_ruleBSQL2SQL; 
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
    // $ANTLR end "entryRuleBSQL2SQL"


    // $ANTLR start "ruleBSQL2SQL"
    // InternalBSQL2SQL.g:71:1: ruleBSQL2SQL returns [EObject current=null] : this_BSQLMachine_0= ruleBSQLMachine ;
    public final EObject ruleBSQL2SQL() throws RecognitionException {
        EObject current = null;

        EObject this_BSQLMachine_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:77:2: (this_BSQLMachine_0= ruleBSQLMachine )
            // InternalBSQL2SQL.g:78:2: this_BSQLMachine_0= ruleBSQLMachine
            {

            		newCompositeNode(grammarAccess.getBSQL2SQLAccess().getBSQLMachineParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BSQLMachine_0=ruleBSQLMachine();

            state._fsp--;


            		current = this_BSQLMachine_0;
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
    // $ANTLR end "ruleBSQL2SQL"


    // $ANTLR start "entryRuleBSQLMachine"
    // InternalBSQL2SQL.g:89:1: entryRuleBSQLMachine returns [EObject current=null] : iv_ruleBSQLMachine= ruleBSQLMachine EOF ;
    public final EObject entryRuleBSQLMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSQLMachine = null;


        try {
            // InternalBSQL2SQL.g:89:52: (iv_ruleBSQLMachine= ruleBSQLMachine EOF )
            // InternalBSQL2SQL.g:90:2: iv_ruleBSQLMachine= ruleBSQLMachine EOF
            {
             newCompositeNode(grammarAccess.getBSQLMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSQLMachine=ruleBSQLMachine();

            state._fsp--;

             current =iv_ruleBSQLMachine; 
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
    // $ANTLR end "entryRuleBSQLMachine"


    // $ANTLR start "ruleBSQLMachine"
    // InternalBSQL2SQL.g:96:1: ruleBSQLMachine returns [EObject current=null] : (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'VARIABLES' ( (lv_vars_3_0= RULE_ID ) ) otherlv_4= 'INVARIANT' ( (lv_inv_5_0= ruleBTable ) ) otherlv_6= 'INITIALISATION' ( (lv_init_7_0= RULE_ID ) ) otherlv_8= ':=' otherlv_9= '{}' otherlv_10= 'OPERATIONS' ( (lv_ops_11_0= ruleBSOperation ) )+ ) ;
    public final EObject ruleBSQLMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_m_name_1_0=null;
        Token otherlv_2=null;
        Token lv_vars_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_init_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_inv_5_0 = null;

        EObject lv_ops_11_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:102:2: ( (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'VARIABLES' ( (lv_vars_3_0= RULE_ID ) ) otherlv_4= 'INVARIANT' ( (lv_inv_5_0= ruleBTable ) ) otherlv_6= 'INITIALISATION' ( (lv_init_7_0= RULE_ID ) ) otherlv_8= ':=' otherlv_9= '{}' otherlv_10= 'OPERATIONS' ( (lv_ops_11_0= ruleBSOperation ) )+ ) )
            // InternalBSQL2SQL.g:103:2: (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'VARIABLES' ( (lv_vars_3_0= RULE_ID ) ) otherlv_4= 'INVARIANT' ( (lv_inv_5_0= ruleBTable ) ) otherlv_6= 'INITIALISATION' ( (lv_init_7_0= RULE_ID ) ) otherlv_8= ':=' otherlv_9= '{}' otherlv_10= 'OPERATIONS' ( (lv_ops_11_0= ruleBSOperation ) )+ )
            {
            // InternalBSQL2SQL.g:103:2: (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'VARIABLES' ( (lv_vars_3_0= RULE_ID ) ) otherlv_4= 'INVARIANT' ( (lv_inv_5_0= ruleBTable ) ) otherlv_6= 'INITIALISATION' ( (lv_init_7_0= RULE_ID ) ) otherlv_8= ':=' otherlv_9= '{}' otherlv_10= 'OPERATIONS' ( (lv_ops_11_0= ruleBSOperation ) )+ )
            // InternalBSQL2SQL.g:104:3: otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'VARIABLES' ( (lv_vars_3_0= RULE_ID ) ) otherlv_4= 'INVARIANT' ( (lv_inv_5_0= ruleBTable ) ) otherlv_6= 'INITIALISATION' ( (lv_init_7_0= RULE_ID ) ) otherlv_8= ':=' otherlv_9= '{}' otherlv_10= 'OPERATIONS' ( (lv_ops_11_0= ruleBSOperation ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBSQLMachineAccess().getMACHINEKeyword_0());
            		
            // InternalBSQL2SQL.g:108:3: ( (lv_m_name_1_0= RULE_ID ) )
            // InternalBSQL2SQL.g:109:4: (lv_m_name_1_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:109:4: (lv_m_name_1_0= RULE_ID )
            // InternalBSQL2SQL.g:110:5: lv_m_name_1_0= RULE_ID
            {
            lv_m_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_m_name_1_0, grammarAccess.getBSQLMachineAccess().getM_nameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBSQLMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"m_name",
            						lv_m_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBSQLMachineAccess().getVARIABLESKeyword_2());
            		
            // InternalBSQL2SQL.g:130:3: ( (lv_vars_3_0= RULE_ID ) )
            // InternalBSQL2SQL.g:131:4: (lv_vars_3_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:131:4: (lv_vars_3_0= RULE_ID )
            // InternalBSQL2SQL.g:132:5: lv_vars_3_0= RULE_ID
            {
            lv_vars_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_vars_3_0, grammarAccess.getBSQLMachineAccess().getVarsIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBSQLMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"vars",
            						lv_vars_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBSQLMachineAccess().getINVARIANTKeyword_4());
            		
            // InternalBSQL2SQL.g:152:3: ( (lv_inv_5_0= ruleBTable ) )
            // InternalBSQL2SQL.g:153:4: (lv_inv_5_0= ruleBTable )
            {
            // InternalBSQL2SQL.g:153:4: (lv_inv_5_0= ruleBTable )
            // InternalBSQL2SQL.g:154:5: lv_inv_5_0= ruleBTable
            {

            					newCompositeNode(grammarAccess.getBSQLMachineAccess().getInvBTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_inv_5_0=ruleBTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBSQLMachineRule());
            					}
            					set(
            						current,
            						"inv",
            						lv_inv_5_0,
            						"bsql2sql.BSQL2SQL.BTable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getBSQLMachineAccess().getINITIALISATIONKeyword_6());
            		
            // InternalBSQL2SQL.g:175:3: ( (lv_init_7_0= RULE_ID ) )
            // InternalBSQL2SQL.g:176:4: (lv_init_7_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:176:4: (lv_init_7_0= RULE_ID )
            // InternalBSQL2SQL.g:177:5: lv_init_7_0= RULE_ID
            {
            lv_init_7_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_init_7_0, grammarAccess.getBSQLMachineAccess().getInitIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBSQLMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"init",
            						lv_init_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getBSQLMachineAccess().getColonEqualsSignKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getBSQLMachineAccess().getLeftCurlyBracketRightCurlyBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getBSQLMachineAccess().getOPERATIONSKeyword_10());
            		
            // InternalBSQL2SQL.g:205:3: ( (lv_ops_11_0= ruleBSOperation ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBSQL2SQL.g:206:4: (lv_ops_11_0= ruleBSOperation )
            	    {
            	    // InternalBSQL2SQL.g:206:4: (lv_ops_11_0= ruleBSOperation )
            	    // InternalBSQL2SQL.g:207:5: lv_ops_11_0= ruleBSOperation
            	    {

            	    					newCompositeNode(grammarAccess.getBSQLMachineAccess().getOpsBSOperationParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ops_11_0=ruleBSOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBSQLMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ops",
            	    						lv_ops_11_0,
            	    						"bsql2sql.BSQL2SQL.BSOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleBSQLMachine"


    // $ANTLR start "entryRuleBTable"
    // InternalBSQL2SQL.g:228:1: entryRuleBTable returns [EObject current=null] : iv_ruleBTable= ruleBTable EOF ;
    public final EObject entryRuleBTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTable = null;


        try {
            // InternalBSQL2SQL.g:228:47: (iv_ruleBTable= ruleBTable EOF )
            // InternalBSQL2SQL.g:229:2: iv_ruleBTable= ruleBTable EOF
            {
             newCompositeNode(grammarAccess.getBTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBTable=ruleBTable();

            state._fsp--;

             current =iv_ruleBTable; 
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
    // $ANTLR end "entryRuleBTable"


    // $ANTLR start "ruleBTable"
    // InternalBSQL2SQL.g:235:1: ruleBTable returns [EObject current=null] : ( ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleBTable() throws RecognitionException {
        EObject current = null;

        Token lv_table_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:241:2: ( ( ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' ) )
            // InternalBSQL2SQL.g:242:2: ( ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )
            {
            // InternalBSQL2SQL.g:242:2: ( ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )
            // InternalBSQL2SQL.g:243:3: ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')'
            {
            // InternalBSQL2SQL.g:243:3: ( (lv_table_name_0_0= RULE_ID ) )
            // InternalBSQL2SQL.g:244:4: (lv_table_name_0_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:244:4: (lv_table_name_0_0= RULE_ID )
            // InternalBSQL2SQL.g:245:5: lv_table_name_0_0= RULE_ID
            {
            lv_table_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_table_name_0_0, grammarAccess.getBTableAccess().getTable_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table_name",
            						lv_table_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBTableAccess().getLessThanSignColonKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getBTableAccess().getStructKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBTableAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBSQL2SQL.g:273:3: ( (lv_attributes_4_0= ruleAttribute ) )
            // InternalBSQL2SQL.g:274:4: (lv_attributes_4_0= ruleAttribute )
            {
            // InternalBSQL2SQL.g:274:4: (lv_attributes_4_0= ruleAttribute )
            // InternalBSQL2SQL.g:275:5: lv_attributes_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getBTableAccess().getAttributesAttributeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_attributes_4_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBTableRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_4_0,
            						"bsql2sql.BSQL2SQL.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSQL2SQL.g:292:3: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBSQL2SQL.g:293:4: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getBTableAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBSQL2SQL.g:297:4: ( (lv_attributes_6_0= ruleAttribute ) )
            	    // InternalBSQL2SQL.g:298:5: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // InternalBSQL2SQL.g:298:5: (lv_attributes_6_0= ruleAttribute )
            	    // InternalBSQL2SQL.g:299:6: lv_attributes_6_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getBTableAccess().getAttributesAttributeParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_6_0,
            	    							"bsql2sql.BSQL2SQL.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getBTableAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleBTable"


    // $ANTLR start "entryRuleAttribute"
    // InternalBSQL2SQL.g:325:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalBSQL2SQL.g:325:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalBSQL2SQL.g:326:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalBSQL2SQL.g:332:1: ruleAttribute returns [EObject current=null] : ( ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_att_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:338:2: ( ( ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) )
            // InternalBSQL2SQL.g:339:2: ( ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            {
            // InternalBSQL2SQL.g:339:2: ( ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            // InternalBSQL2SQL.g:340:3: ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) )
            {
            // InternalBSQL2SQL.g:340:3: ( (lv_att_name_0_0= RULE_ID ) )
            // InternalBSQL2SQL.g:341:4: (lv_att_name_0_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:341:4: (lv_att_name_0_0= RULE_ID )
            // InternalBSQL2SQL.g:342:5: lv_att_name_0_0= RULE_ID
            {
            lv_att_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_att_name_0_0, grammarAccess.getAttributeAccess().getAtt_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"att_name",
            						lv_att_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalBSQL2SQL.g:362:3: ( (lv_type_2_0= ruleBType ) )
            // InternalBSQL2SQL.g:363:4: (lv_type_2_0= ruleBType )
            {
            // InternalBSQL2SQL.g:363:4: (lv_type_2_0= ruleBType )
            // InternalBSQL2SQL.g:364:5: lv_type_2_0= ruleBType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeBTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleBType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"bsql2sql.BSQL2SQL.BType");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleBType"
    // InternalBSQL2SQL.g:385:1: entryRuleBType returns [EObject current=null] : iv_ruleBType= ruleBType EOF ;
    public final EObject entryRuleBType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBType = null;


        try {
            // InternalBSQL2SQL.g:385:46: (iv_ruleBType= ruleBType EOF )
            // InternalBSQL2SQL.g:386:2: iv_ruleBType= ruleBType EOF
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
    // InternalBSQL2SQL.g:392:1: ruleBType returns [EObject current=null] : ( (lv_type_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBType() throws RecognitionException {
        EObject current = null;

        Token lv_type_name_0_0=null;


        	enterRule();

        try {
            // InternalBSQL2SQL.g:398:2: ( ( (lv_type_name_0_0= RULE_ID ) ) )
            // InternalBSQL2SQL.g:399:2: ( (lv_type_name_0_0= RULE_ID ) )
            {
            // InternalBSQL2SQL.g:399:2: ( (lv_type_name_0_0= RULE_ID ) )
            // InternalBSQL2SQL.g:400:3: (lv_type_name_0_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:400:3: (lv_type_name_0_0= RULE_ID )
            // InternalBSQL2SQL.g:401:4: lv_type_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleBValue"
    // InternalBSQL2SQL.g:420:1: entryRuleBValue returns [String current=null] : iv_ruleBValue= ruleBValue EOF ;
    public final String entryRuleBValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBValue = null;


        try {
            // InternalBSQL2SQL.g:420:46: (iv_ruleBValue= ruleBValue EOF )
            // InternalBSQL2SQL.g:421:2: iv_ruleBValue= ruleBValue EOF
            {
             newCompositeNode(grammarAccess.getBValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBValue=ruleBValue();

            state._fsp--;

             current =iv_ruleBValue.getText(); 
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
    // $ANTLR end "entryRuleBValue"


    // $ANTLR start "ruleBValue"
    // InternalBSQL2SQL.g:427:1: ruleBValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | kw= 'FALSE' | kw= 'TRUE' ) ;
    public final AntlrDatatypeRuleToken ruleBValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalBSQL2SQL.g:433:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | kw= 'FALSE' | kw= 'TRUE' ) )
            // InternalBSQL2SQL.g:434:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | kw= 'FALSE' | kw= 'TRUE' )
            {
            // InternalBSQL2SQL.g:434:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | kw= 'FALSE' | kw= 'TRUE' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBSQL2SQL.g:435:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getBValueAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSQL2SQL.g:443:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getBValueAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSQL2SQL.g:451:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBValueAccess().getFALSEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSQL2SQL.g:457:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBValueAccess().getTRUEKeyword_3());
                    		

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
    // $ANTLR end "ruleBValue"


    // $ANTLR start "entryRuleBSOperation"
    // InternalBSQL2SQL.g:466:1: entryRuleBSOperation returns [EObject current=null] : iv_ruleBSOperation= ruleBSOperation EOF ;
    public final EObject entryRuleBSOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSOperation = null;


        try {
            // InternalBSQL2SQL.g:466:52: (iv_ruleBSOperation= ruleBSOperation EOF )
            // InternalBSQL2SQL.g:467:2: iv_ruleBSOperation= ruleBSOperation EOF
            {
             newCompositeNode(grammarAccess.getBSOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSOperation=ruleBSOperation();

            state._fsp--;

             current =iv_ruleBSOperation; 
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
    // $ANTLR end "entryRuleBSOperation"


    // $ANTLR start "ruleBSOperation"
    // InternalBSQL2SQL.g:473:1: ruleBSOperation returns [EObject current=null] : ( ( (lv_bop_0_0= ruleBoolOperation ) ) | ( (lv_vop_1_0= ruleVoidOperation ) ) ) ;
    public final EObject ruleBSOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_bop_0_0 = null;

        EObject lv_vop_1_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:479:2: ( ( ( (lv_bop_0_0= ruleBoolOperation ) ) | ( (lv_vop_1_0= ruleVoidOperation ) ) ) )
            // InternalBSQL2SQL.g:480:2: ( ( (lv_bop_0_0= ruleBoolOperation ) ) | ( (lv_vop_1_0= ruleVoidOperation ) ) )
            {
            // InternalBSQL2SQL.g:480:2: ( ( (lv_bop_0_0= ruleBoolOperation ) ) | ( (lv_vop_1_0= ruleVoidOperation ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBSQL2SQL.g:481:3: ( (lv_bop_0_0= ruleBoolOperation ) )
                    {
                    // InternalBSQL2SQL.g:481:3: ( (lv_bop_0_0= ruleBoolOperation ) )
                    // InternalBSQL2SQL.g:482:4: (lv_bop_0_0= ruleBoolOperation )
                    {
                    // InternalBSQL2SQL.g:482:4: (lv_bop_0_0= ruleBoolOperation )
                    // InternalBSQL2SQL.g:483:5: lv_bop_0_0= ruleBoolOperation
                    {

                    					newCompositeNode(grammarAccess.getBSOperationAccess().getBopBoolOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bop_0_0=ruleBoolOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBSOperationRule());
                    					}
                    					set(
                    						current,
                    						"bop",
                    						lv_bop_0_0,
                    						"bsql2sql.BSQL2SQL.BoolOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSQL2SQL.g:501:3: ( (lv_vop_1_0= ruleVoidOperation ) )
                    {
                    // InternalBSQL2SQL.g:501:3: ( (lv_vop_1_0= ruleVoidOperation ) )
                    // InternalBSQL2SQL.g:502:4: (lv_vop_1_0= ruleVoidOperation )
                    {
                    // InternalBSQL2SQL.g:502:4: (lv_vop_1_0= ruleVoidOperation )
                    // InternalBSQL2SQL.g:503:5: lv_vop_1_0= ruleVoidOperation
                    {

                    					newCompositeNode(grammarAccess.getBSOperationAccess().getVopVoidOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_vop_1_0=ruleVoidOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBSOperationRule());
                    					}
                    					set(
                    						current,
                    						"vop",
                    						lv_vop_1_0,
                    						"bsql2sql.BSQL2SQL.VoidOperation");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleBSOperation"


    // $ANTLR start "entryRuleBoolOperation"
    // InternalBSQL2SQL.g:524:1: entryRuleBoolOperation returns [EObject current=null] : iv_ruleBoolOperation= ruleBoolOperation EOF ;
    public final EObject entryRuleBoolOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolOperation = null;


        try {
            // InternalBSQL2SQL.g:524:54: (iv_ruleBoolOperation= ruleBoolOperation EOF )
            // InternalBSQL2SQL.g:525:2: iv_ruleBoolOperation= ruleBoolOperation EOF
            {
             newCompositeNode(grammarAccess.getBoolOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolOperation=ruleBoolOperation();

            state._fsp--;

             current =iv_ruleBoolOperation; 
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
    // $ANTLR end "entryRuleBoolOperation"


    // $ANTLR start "ruleBoolOperation"
    // InternalBSQL2SQL.g:531:1: ruleBoolOperation returns [EObject current=null] : (otherlv_0= 'res' otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'res' otherlv_15= ':=' otherlv_16= 'bool(' otherlv_17= '#' ( (lv_objTable_18_0= ruleTableInstance ) ) otherlv_19= '&' ( (lv_pres_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres_22_0= ruleBPredicate ) ) )* otherlv_23= ')' otherlv_24= ')' otherlv_25= 'END' ) ;
    public final EObject ruleBoolOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_params_10_0 = null;

        EObject lv_params_12_0 = null;

        EObject lv_objTable_18_0 = null;

        EObject lv_pres_20_0 = null;

        EObject lv_pres_22_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:537:2: ( (otherlv_0= 'res' otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'res' otherlv_15= ':=' otherlv_16= 'bool(' otherlv_17= '#' ( (lv_objTable_18_0= ruleTableInstance ) ) otherlv_19= '&' ( (lv_pres_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres_22_0= ruleBPredicate ) ) )* otherlv_23= ')' otherlv_24= ')' otherlv_25= 'END' ) )
            // InternalBSQL2SQL.g:538:2: (otherlv_0= 'res' otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'res' otherlv_15= ':=' otherlv_16= 'bool(' otherlv_17= '#' ( (lv_objTable_18_0= ruleTableInstance ) ) otherlv_19= '&' ( (lv_pres_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres_22_0= ruleBPredicate ) ) )* otherlv_23= ')' otherlv_24= ')' otherlv_25= 'END' )
            {
            // InternalBSQL2SQL.g:538:2: (otherlv_0= 'res' otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'res' otherlv_15= ':=' otherlv_16= 'bool(' otherlv_17= '#' ( (lv_objTable_18_0= ruleTableInstance ) ) otherlv_19= '&' ( (lv_pres_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres_22_0= ruleBPredicate ) ) )* otherlv_23= ')' otherlv_24= ')' otherlv_25= 'END' )
            // InternalBSQL2SQL.g:539:3: otherlv_0= 'res' otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* ) otherlv_13= 'THEN' otherlv_14= 'res' otherlv_15= ':=' otherlv_16= 'bool(' otherlv_17= '#' ( (lv_objTable_18_0= ruleTableInstance ) ) otherlv_19= '&' ( (lv_pres_20_0= ruleBPredicate ) ) (otherlv_21= '&' ( (lv_pres_22_0= ruleBPredicate ) ) )* otherlv_23= ')' otherlv_24= ')' otherlv_25= 'END'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getBoolOperationAccess().getResKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1());
            		
            // InternalBSQL2SQL.g:547:3: ( (lv_op_name_2_0= RULE_ID ) )
            // InternalBSQL2SQL.g:548:4: (lv_op_name_2_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:548:4: (lv_op_name_2_0= RULE_ID )
            // InternalBSQL2SQL.g:549:5: lv_op_name_2_0= RULE_ID
            {
            lv_op_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_op_name_2_0, grammarAccess.getBoolOperationAccess().getOp_nameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"op_name",
            						lv_op_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getBoolOperationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBSQL2SQL.g:569:3: ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBSQL2SQL.g:570:4: ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )*
                    {
                    // InternalBSQL2SQL.g:570:4: ( (lv_pList_4_0= RULE_ID ) )
                    // InternalBSQL2SQL.g:571:5: (lv_pList_4_0= RULE_ID )
                    {
                    // InternalBSQL2SQL.g:571:5: (lv_pList_4_0= RULE_ID )
                    // InternalBSQL2SQL.g:572:6: lv_pList_4_0= RULE_ID
                    {
                    lv_pList_4_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(lv_pList_4_0, grammarAccess.getBoolOperationAccess().getPListIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoolOperationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"pList",
                    							lv_pList_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalBSQL2SQL.g:588:4: (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBSQL2SQL.g:589:5: otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getBoolOperationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalBSQL2SQL.g:593:5: ( (lv_pList_6_0= RULE_ID ) )
                    	    // InternalBSQL2SQL.g:594:6: (lv_pList_6_0= RULE_ID )
                    	    {
                    	    // InternalBSQL2SQL.g:594:6: (lv_pList_6_0= RULE_ID )
                    	    // InternalBSQL2SQL.g:595:7: lv_pList_6_0= RULE_ID
                    	    {
                    	    lv_pList_6_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    							newLeafNode(lv_pList_6_0, grammarAccess.getBoolOperationAccess().getPListIDTerminalRuleCall_4_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBoolOperationRule());
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getBoolOperationAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getBoolOperationAccess().getPREKeyword_7());
            		
            // InternalBSQL2SQL.g:625:3: ( ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )* )
            // InternalBSQL2SQL.g:626:4: ( (lv_params_10_0= ruleBParameter ) ) (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )*
            {
            // InternalBSQL2SQL.g:626:4: ( (lv_params_10_0= ruleBParameter ) )
            // InternalBSQL2SQL.g:627:5: (lv_params_10_0= ruleBParameter )
            {
            // InternalBSQL2SQL.g:627:5: (lv_params_10_0= ruleBParameter )
            // InternalBSQL2SQL.g:628:6: lv_params_10_0= ruleBParameter
            {

            						newCompositeNode(grammarAccess.getBoolOperationAccess().getParamsBParameterParserRuleCall_8_0_0());
            					
            pushFollow(FOLLOW_21);
            lv_params_10_0=ruleBParameter();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBoolOperationRule());
            						}
            						add(
            							current,
            							"params",
            							lv_params_10_0,
            							"bsql2sql.BSQL2SQL.BParameter");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBSQL2SQL.g:645:4: (otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBSQL2SQL.g:646:5: otherlv_11= '&' ( (lv_params_12_0= ruleBParameter ) )
            	    {
            	    otherlv_11=(Token)match(input,30,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getBoolOperationAccess().getAmpersandKeyword_8_1_0());
            	    				
            	    // InternalBSQL2SQL.g:650:5: ( (lv_params_12_0= ruleBParameter ) )
            	    // InternalBSQL2SQL.g:651:6: (lv_params_12_0= ruleBParameter )
            	    {
            	    // InternalBSQL2SQL.g:651:6: (lv_params_12_0= ruleBParameter )
            	    // InternalBSQL2SQL.g:652:7: lv_params_12_0= ruleBParameter
            	    {

            	    							newCompositeNode(grammarAccess.getBoolOperationAccess().getParamsBParameterParserRuleCall_8_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_params_12_0=ruleBParameter();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBoolOperationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"params",
            	    								lv_params_12_0,
            	    								"bsql2sql.BSQL2SQL.BParameter");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            otherlv_13=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getBoolOperationAccess().getTHENKeyword_9());
            		
            otherlv_14=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getBoolOperationAccess().getResKeyword_10());
            		
            otherlv_15=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_15, grammarAccess.getBoolOperationAccess().getColonEqualsSignKeyword_11());
            		
            otherlv_16=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_16, grammarAccess.getBoolOperationAccess().getBoolKeyword_12());
            		
            otherlv_17=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getBoolOperationAccess().getNumberSignKeyword_13());
            		
            // InternalBSQL2SQL.g:691:3: ( (lv_objTable_18_0= ruleTableInstance ) )
            // InternalBSQL2SQL.g:692:4: (lv_objTable_18_0= ruleTableInstance )
            {
            // InternalBSQL2SQL.g:692:4: (lv_objTable_18_0= ruleTableInstance )
            // InternalBSQL2SQL.g:693:5: lv_objTable_18_0= ruleTableInstance
            {

            					newCompositeNode(grammarAccess.getBoolOperationAccess().getObjTableTableInstanceParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_25);
            lv_objTable_18_0=ruleTableInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolOperationRule());
            					}
            					set(
            						current,
            						"objTable",
            						lv_objTable_18_0,
            						"bsql2sql.BSQL2SQL.TableInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getBoolOperationAccess().getAmpersandKeyword_15());
            		
            // InternalBSQL2SQL.g:714:3: ( (lv_pres_20_0= ruleBPredicate ) )
            // InternalBSQL2SQL.g:715:4: (lv_pres_20_0= ruleBPredicate )
            {
            // InternalBSQL2SQL.g:715:4: (lv_pres_20_0= ruleBPredicate )
            // InternalBSQL2SQL.g:716:5: lv_pres_20_0= ruleBPredicate
            {

            					newCompositeNode(grammarAccess.getBoolOperationAccess().getPresBPredicateParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_26);
            lv_pres_20_0=ruleBPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolOperationRule());
            					}
            					add(
            						current,
            						"pres",
            						lv_pres_20_0,
            						"bsql2sql.BSQL2SQL.BPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSQL2SQL.g:733:3: (otherlv_21= '&' ( (lv_pres_22_0= ruleBPredicate ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBSQL2SQL.g:734:4: otherlv_21= '&' ( (lv_pres_22_0= ruleBPredicate ) )
            	    {
            	    otherlv_21=(Token)match(input,30,FOLLOW_3); 

            	    				newLeafNode(otherlv_21, grammarAccess.getBoolOperationAccess().getAmpersandKeyword_17_0());
            	    			
            	    // InternalBSQL2SQL.g:738:4: ( (lv_pres_22_0= ruleBPredicate ) )
            	    // InternalBSQL2SQL.g:739:5: (lv_pres_22_0= ruleBPredicate )
            	    {
            	    // InternalBSQL2SQL.g:739:5: (lv_pres_22_0= ruleBPredicate )
            	    // InternalBSQL2SQL.g:740:6: lv_pres_22_0= ruleBPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getBoolOperationAccess().getPresBPredicateParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_pres_22_0=ruleBPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoolOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pres",
            	    							lv_pres_22_0,
            	    							"bsql2sql.BSQL2SQL.BPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_23=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_23, grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_18());
            		
            otherlv_24=(Token)match(input,22,FOLLOW_28); 

            			newLeafNode(otherlv_24, grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_19());
            		
            otherlv_25=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getBoolOperationAccess().getENDKeyword_20());
            		

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
    // $ANTLR end "ruleBoolOperation"


    // $ANTLR start "entryRuleVoidOperation"
    // InternalBSQL2SQL.g:774:1: entryRuleVoidOperation returns [EObject current=null] : iv_ruleVoidOperation= ruleVoidOperation EOF ;
    public final EObject entryRuleVoidOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidOperation = null;


        try {
            // InternalBSQL2SQL.g:774:54: (iv_ruleVoidOperation= ruleVoidOperation EOF )
            // InternalBSQL2SQL.g:775:2: iv_ruleVoidOperation= ruleVoidOperation EOF
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
    // InternalBSQL2SQL.g:781:1: ruleVoidOperation returns [EObject current=null] : ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) )* otherlv_13= 'END' ) ;
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
        EObject lv_params_8_0 = null;

        EObject lv_params_10_0 = null;

        EObject lv_subs_12_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:787:2: ( ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) )* otherlv_13= 'END' ) )
            // InternalBSQL2SQL.g:788:2: ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) )* otherlv_13= 'END' )
            {
            // InternalBSQL2SQL.g:788:2: ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) )* otherlv_13= 'END' )
            // InternalBSQL2SQL.g:789:3: ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) )* otherlv_13= 'END'
            {
            // InternalBSQL2SQL.g:789:3: ( (lv_op_name_0_0= RULE_ID ) )
            // InternalBSQL2SQL.g:790:4: (lv_op_name_0_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:790:4: (lv_op_name_0_0= RULE_ID )
            // InternalBSQL2SQL.g:791:5: lv_op_name_0_0= RULE_ID
            {
            lv_op_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBSQL2SQL.g:811:3: ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBSQL2SQL.g:812:4: ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )*
                    {
                    // InternalBSQL2SQL.g:812:4: ( (lv_pList_2_0= RULE_ID ) )
                    // InternalBSQL2SQL.g:813:5: (lv_pList_2_0= RULE_ID )
                    {
                    // InternalBSQL2SQL.g:813:5: (lv_pList_2_0= RULE_ID )
                    // InternalBSQL2SQL.g:814:6: lv_pList_2_0= RULE_ID
                    {
                    lv_pList_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

                    // InternalBSQL2SQL.g:830:4: (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBSQL2SQL.g:831:5: otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVoidOperationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalBSQL2SQL.g:835:5: ( (lv_pList_4_0= RULE_ID ) )
                    	    // InternalBSQL2SQL.g:836:6: (lv_pList_4_0= RULE_ID )
                    	    {
                    	    // InternalBSQL2SQL.g:836:6: (lv_pList_4_0= RULE_ID )
                    	    // InternalBSQL2SQL.g:837:7: lv_pList_4_0= RULE_ID
                    	    {
                    	    lv_pList_4_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getVoidOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getVoidOperationAccess().getEqualsSignKeyword_4());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getVoidOperationAccess().getPREKeyword_5());
            		
            // InternalBSQL2SQL.g:867:3: ( ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )* )
            // InternalBSQL2SQL.g:868:4: ( (lv_params_8_0= ruleBParameter ) ) (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )*
            {
            // InternalBSQL2SQL.g:868:4: ( (lv_params_8_0= ruleBParameter ) )
            // InternalBSQL2SQL.g:869:5: (lv_params_8_0= ruleBParameter )
            {
            // InternalBSQL2SQL.g:869:5: (lv_params_8_0= ruleBParameter )
            // InternalBSQL2SQL.g:870:6: lv_params_8_0= ruleBParameter
            {

            						newCompositeNode(grammarAccess.getVoidOperationAccess().getParamsBParameterParserRuleCall_6_0_0());
            					
            pushFollow(FOLLOW_21);
            lv_params_8_0=ruleBParameter();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            						}
            						add(
            							current,
            							"params",
            							lv_params_8_0,
            							"bsql2sql.BSQL2SQL.BParameter");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBSQL2SQL.g:887:4: (otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBSQL2SQL.g:888:5: otherlv_9= '&' ( (lv_params_10_0= ruleBParameter ) )
            	    {
            	    otherlv_9=(Token)match(input,30,FOLLOW_3); 

            	    					newLeafNode(otherlv_9, grammarAccess.getVoidOperationAccess().getAmpersandKeyword_6_1_0());
            	    				
            	    // InternalBSQL2SQL.g:892:5: ( (lv_params_10_0= ruleBParameter ) )
            	    // InternalBSQL2SQL.g:893:6: (lv_params_10_0= ruleBParameter )
            	    {
            	    // InternalBSQL2SQL.g:893:6: (lv_params_10_0= ruleBParameter )
            	    // InternalBSQL2SQL.g:894:7: lv_params_10_0= ruleBParameter
            	    {

            	    							newCompositeNode(grammarAccess.getVoidOperationAccess().getParamsBParameterParserRuleCall_6_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_params_10_0=ruleBParameter();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"params",
            	    								lv_params_10_0,
            	    								"bsql2sql.BSQL2SQL.BParameter");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            otherlv_11=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_11, grammarAccess.getVoidOperationAccess().getTHENKeyword_7());
            		
            // InternalBSQL2SQL.g:917:3: ( (lv_subs_12_0= ruleBSubstitution ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBSQL2SQL.g:918:4: (lv_subs_12_0= ruleBSubstitution )
            	    {
            	    // InternalBSQL2SQL.g:918:4: (lv_subs_12_0= ruleBSubstitution )
            	    // InternalBSQL2SQL.g:919:5: lv_subs_12_0= ruleBSubstitution
            	    {

            	    					newCompositeNode(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_subs_12_0=ruleBSubstitution();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subs",
            	    						lv_subs_12_0,
            	    						"bsql2sql.BSQL2SQL.BSubstitution");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_13=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getVoidOperationAccess().getENDKeyword_9());
            		

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


    // $ANTLR start "entryRuleBPredicate"
    // InternalBSQL2SQL.g:944:1: entryRuleBPredicate returns [EObject current=null] : iv_ruleBPredicate= ruleBPredicate EOF ;
    public final EObject entryRuleBPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBPredicate = null;


        try {
            // InternalBSQL2SQL.g:944:51: (iv_ruleBPredicate= ruleBPredicate EOF )
            // InternalBSQL2SQL.g:945:2: iv_ruleBPredicate= ruleBPredicate EOF
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
    // InternalBSQL2SQL.g:951:1: ruleBPredicate returns [EObject current=null] : ( () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) ) ) ;
    public final EObject ruleBPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_PLeft_1_0 = null;

        AntlrDatatypeRuleToken lv_PRight_3_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:957:2: ( ( () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) ) ) )
            // InternalBSQL2SQL.g:958:2: ( () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) ) )
            {
            // InternalBSQL2SQL.g:958:2: ( () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) ) )
            // InternalBSQL2SQL.g:959:3: () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) )
            {
            // InternalBSQL2SQL.g:959:3: ()
            // InternalBSQL2SQL.g:960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBPredicateAccess().getBPredicateAction_0(),
            					current);
            			

            }

            // InternalBSQL2SQL.g:966:3: ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) )
            // InternalBSQL2SQL.g:967:4: ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) )
            {
            // InternalBSQL2SQL.g:967:4: ( (lv_PLeft_1_0= ruleSQLCall ) )
            // InternalBSQL2SQL.g:968:5: (lv_PLeft_1_0= ruleSQLCall )
            {
            // InternalBSQL2SQL.g:968:5: (lv_PLeft_1_0= ruleSQLCall )
            // InternalBSQL2SQL.g:969:6: lv_PLeft_1_0= ruleSQLCall
            {

            						newCompositeNode(grammarAccess.getBPredicateAccess().getPLeftSQLCallParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_19);
            lv_PLeft_1_0=ruleSQLCall();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBPredicateRule());
            						}
            						set(
            							current,
            							"PLeft",
            							lv_PLeft_1_0,
            							"bsql2sql.BSQL2SQL.SQLCall");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_30); 

            				newLeafNode(otherlv_2, grammarAccess.getBPredicateAccess().getEqualsSignKeyword_1_1());
            			
            // InternalBSQL2SQL.g:990:4: ( (lv_PRight_3_0= ruleBValue ) )
            // InternalBSQL2SQL.g:991:5: (lv_PRight_3_0= ruleBValue )
            {
            // InternalBSQL2SQL.g:991:5: (lv_PRight_3_0= ruleBValue )
            // InternalBSQL2SQL.g:992:6: lv_PRight_3_0= ruleBValue
            {

            						newCompositeNode(grammarAccess.getBPredicateAccess().getPRightBValueParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_2);
            lv_PRight_3_0=ruleBValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBPredicateRule());
            						}
            						set(
            							current,
            							"PRight",
            							lv_PRight_3_0,
            							"bsql2sql.BSQL2SQL.BValue");
            						afterParserOrEnumRuleCall();
            					

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


    // $ANTLR start "entryRuleSQLCall"
    // InternalBSQL2SQL.g:1014:1: entryRuleSQLCall returns [EObject current=null] : iv_ruleSQLCall= ruleSQLCall EOF ;
    public final EObject entryRuleSQLCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQLCall = null;


        try {
            // InternalBSQL2SQL.g:1014:48: (iv_ruleSQLCall= ruleSQLCall EOF )
            // InternalBSQL2SQL.g:1015:2: iv_ruleSQLCall= ruleSQLCall EOF
            {
             newCompositeNode(grammarAccess.getSQLCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSQLCall=ruleSQLCall();

            state._fsp--;

             current =iv_ruleSQLCall; 
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
    // $ANTLR end "entryRuleSQLCall"


    // $ANTLR start "ruleSQLCall"
    // InternalBSQL2SQL.g:1021:1: ruleSQLCall returns [EObject current=null] : ( ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSQLCall() throws RecognitionException {
        EObject current = null;

        Token lv_SLeft_0_0=null;
        Token otherlv_1=null;
        Token lv_SRight_2_0=null;


        	enterRule();

        try {
            // InternalBSQL2SQL.g:1027:2: ( ( ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) ) ) )
            // InternalBSQL2SQL.g:1028:2: ( ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) ) )
            {
            // InternalBSQL2SQL.g:1028:2: ( ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) ) )
            // InternalBSQL2SQL.g:1029:3: ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) )
            {
            // InternalBSQL2SQL.g:1029:3: ( (lv_SLeft_0_0= RULE_ID ) )
            // InternalBSQL2SQL.g:1030:4: (lv_SLeft_0_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:1030:4: (lv_SLeft_0_0= RULE_ID )
            // InternalBSQL2SQL.g:1031:5: lv_SLeft_0_0= RULE_ID
            {
            lv_SLeft_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_SLeft_0_0, grammarAccess.getSQLCallAccess().getSLeftIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSQLCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"SLeft",
            						lv_SLeft_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSQLCallAccess().getApostropheKeyword_1());
            		
            // InternalBSQL2SQL.g:1051:3: ( (lv_SRight_2_0= RULE_ID ) )
            // InternalBSQL2SQL.g:1052:4: (lv_SRight_2_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:1052:4: (lv_SRight_2_0= RULE_ID )
            // InternalBSQL2SQL.g:1053:5: lv_SRight_2_0= RULE_ID
            {
            lv_SRight_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_SRight_2_0, grammarAccess.getSQLCallAccess().getSRightIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSQLCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"SRight",
            						lv_SRight_2_0,
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
    // $ANTLR end "ruleSQLCall"


    // $ANTLR start "entryRuleTableInstance"
    // InternalBSQL2SQL.g:1073:1: entryRuleTableInstance returns [EObject current=null] : iv_ruleTableInstance= ruleTableInstance EOF ;
    public final EObject entryRuleTableInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableInstance = null;


        try {
            // InternalBSQL2SQL.g:1073:54: (iv_ruleTableInstance= ruleTableInstance EOF )
            // InternalBSQL2SQL.g:1074:2: iv_ruleTableInstance= ruleTableInstance EOF
            {
             newCompositeNode(grammarAccess.getTableInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableInstance=ruleTableInstance();

            state._fsp--;

             current =iv_ruleTableInstance; 
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
    // $ANTLR end "entryRuleTableInstance"


    // $ANTLR start "ruleTableInstance"
    // InternalBSQL2SQL.g:1080:1: ruleTableInstance returns [EObject current=null] : ( ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) ) ) ;
    public final EObject ruleTableInstance() throws RecognitionException {
        EObject current = null;

        Token lv_ti_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_ti_type_2_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:1086:2: ( ( ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) ) ) )
            // InternalBSQL2SQL.g:1087:2: ( ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) ) )
            {
            // InternalBSQL2SQL.g:1087:2: ( ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) ) )
            // InternalBSQL2SQL.g:1088:3: ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) )
            {
            // InternalBSQL2SQL.g:1088:3: ( (lv_ti_name_0_0= RULE_ID ) )
            // InternalBSQL2SQL.g:1089:4: (lv_ti_name_0_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:1089:4: (lv_ti_name_0_0= RULE_ID )
            // InternalBSQL2SQL.g:1090:5: lv_ti_name_0_0= RULE_ID
            {
            lv_ti_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_ti_name_0_0, grammarAccess.getTableInstanceAccess().getTi_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ti_name",
            						lv_ti_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTableInstanceAccess().getFullStopLeftParenthesisKeyword_1());
            		
            // InternalBSQL2SQL.g:1110:3: ( (lv_ti_type_2_0= ruleTIAssignment ) )
            // InternalBSQL2SQL.g:1111:4: (lv_ti_type_2_0= ruleTIAssignment )
            {
            // InternalBSQL2SQL.g:1111:4: (lv_ti_type_2_0= ruleTIAssignment )
            // InternalBSQL2SQL.g:1112:5: lv_ti_type_2_0= ruleTIAssignment
            {

            					newCompositeNode(grammarAccess.getTableInstanceAccess().getTi_typeTIAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ti_type_2_0=ruleTIAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableInstanceRule());
            					}
            					set(
            						current,
            						"ti_type",
            						lv_ti_type_2_0,
            						"bsql2sql.BSQL2SQL.TIAssignment");
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
    // $ANTLR end "ruleTableInstance"


    // $ANTLR start "entryRuleTIAssignment"
    // InternalBSQL2SQL.g:1133:1: entryRuleTIAssignment returns [EObject current=null] : iv_ruleTIAssignment= ruleTIAssignment EOF ;
    public final EObject entryRuleTIAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTIAssignment = null;


        try {
            // InternalBSQL2SQL.g:1133:53: (iv_ruleTIAssignment= ruleTIAssignment EOF )
            // InternalBSQL2SQL.g:1134:2: iv_ruleTIAssignment= ruleTIAssignment EOF
            {
             newCompositeNode(grammarAccess.getTIAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTIAssignment=ruleTIAssignment();

            state._fsp--;

             current =iv_ruleTIAssignment; 
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
    // $ANTLR end "entryRuleTIAssignment"


    // $ANTLR start "ruleTIAssignment"
    // InternalBSQL2SQL.g:1140:1: ruleTIAssignment returns [EObject current=null] : ( ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTIAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_instance_name_0_0=null;
        Token otherlv_1=null;
        Token lv_instance_type_2_0=null;


        	enterRule();

        try {
            // InternalBSQL2SQL.g:1146:2: ( ( ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) ) ) )
            // InternalBSQL2SQL.g:1147:2: ( ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) ) )
            {
            // InternalBSQL2SQL.g:1147:2: ( ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) ) )
            // InternalBSQL2SQL.g:1148:3: ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) )
            {
            // InternalBSQL2SQL.g:1148:3: ( (lv_instance_name_0_0= RULE_ID ) )
            // InternalBSQL2SQL.g:1149:4: (lv_instance_name_0_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:1149:4: (lv_instance_name_0_0= RULE_ID )
            // InternalBSQL2SQL.g:1150:5: lv_instance_name_0_0= RULE_ID
            {
            lv_instance_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_instance_name_0_0, grammarAccess.getTIAssignmentAccess().getInstance_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTIAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"instance_name",
            						lv_instance_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTIAssignmentAccess().getColonKeyword_1());
            		
            // InternalBSQL2SQL.g:1170:3: ( (lv_instance_type_2_0= RULE_ID ) )
            // InternalBSQL2SQL.g:1171:4: (lv_instance_type_2_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:1171:4: (lv_instance_type_2_0= RULE_ID )
            // InternalBSQL2SQL.g:1172:5: lv_instance_type_2_0= RULE_ID
            {
            lv_instance_type_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_instance_type_2_0, grammarAccess.getTIAssignmentAccess().getInstance_typeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTIAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"instance_type",
            						lv_instance_type_2_0,
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
    // $ANTLR end "ruleTIAssignment"


    // $ANTLR start "entryRuleBParameter"
    // InternalBSQL2SQL.g:1192:1: entryRuleBParameter returns [EObject current=null] : iv_ruleBParameter= ruleBParameter EOF ;
    public final EObject entryRuleBParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBParameter = null;


        try {
            // InternalBSQL2SQL.g:1192:51: (iv_ruleBParameter= ruleBParameter EOF )
            // InternalBSQL2SQL.g:1193:2: iv_ruleBParameter= ruleBParameter EOF
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
    // InternalBSQL2SQL.g:1199:1: ruleBParameter returns [EObject current=null] : ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) ;
    public final EObject ruleBParameter() throws RecognitionException {
        EObject current = null;

        Token lv_p_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:1205:2: ( ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) )
            // InternalBSQL2SQL.g:1206:2: ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            {
            // InternalBSQL2SQL.g:1206:2: ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            // InternalBSQL2SQL.g:1207:3: ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) )
            {
            // InternalBSQL2SQL.g:1207:3: ( (lv_p_name_0_0= RULE_ID ) )
            // InternalBSQL2SQL.g:1208:4: (lv_p_name_0_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:1208:4: (lv_p_name_0_0= RULE_ID )
            // InternalBSQL2SQL.g:1209:5: lv_p_name_0_0= RULE_ID
            {
            lv_p_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBParameterAccess().getColonKeyword_1());
            		
            // InternalBSQL2SQL.g:1229:3: ( (lv_type_2_0= ruleBType ) )
            // InternalBSQL2SQL.g:1230:4: (lv_type_2_0= ruleBType )
            {
            // InternalBSQL2SQL.g:1230:4: (lv_type_2_0= ruleBType )
            // InternalBSQL2SQL.g:1231:5: lv_type_2_0= ruleBType
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
            						"bsql2sql.BSQL2SQL.BType");
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


    // $ANTLR start "entryRuleBSubstitution"
    // InternalBSQL2SQL.g:1252:1: entryRuleBSubstitution returns [EObject current=null] : iv_ruleBSubstitution= ruleBSubstitution EOF ;
    public final EObject entryRuleBSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSubstitution = null;


        try {
            // InternalBSQL2SQL.g:1252:54: (iv_ruleBSubstitution= ruleBSubstitution EOF )
            // InternalBSQL2SQL.g:1253:2: iv_ruleBSubstitution= ruleBSubstitution EOF
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
    // InternalBSQL2SQL.g:1259:1: ruleBSubstitution returns [EObject current=null] : ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleBPredicate ) ) ) ;
    public final EObject ruleBSubstitution() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalBSQL2SQL.g:1265:2: ( ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleBPredicate ) ) ) )
            // InternalBSQL2SQL.g:1266:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleBPredicate ) ) )
            {
            // InternalBSQL2SQL.g:1266:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleBPredicate ) ) )
            // InternalBSQL2SQL.g:1267:3: ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_right_2_0= ruleBPredicate ) )
            {
            // InternalBSQL2SQL.g:1267:3: ( (lv_left_0_0= RULE_ID ) )
            // InternalBSQL2SQL.g:1268:4: (lv_left_0_0= RULE_ID )
            {
            // InternalBSQL2SQL.g:1268:4: (lv_left_0_0= RULE_ID )
            // InternalBSQL2SQL.g:1269:5: lv_left_0_0= RULE_ID
            {
            lv_left_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_left_0_0, grammarAccess.getBSubstitutionAccess().getLeftIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBSubstitutionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBSubstitutionAccess().getColonEqualsSignKeyword_1());
            		
            // InternalBSQL2SQL.g:1289:3: ( (lv_right_2_0= ruleBPredicate ) )
            // InternalBSQL2SQL.g:1290:4: (lv_right_2_0= ruleBPredicate )
            {
            // InternalBSQL2SQL.g:1290:4: (lv_right_2_0= ruleBPredicate )
            // InternalBSQL2SQL.g:1291:5: lv_right_2_0= ruleBPredicate
            {

            					newCompositeNode(grammarAccess.getBSubstitutionAccess().getRightBPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleBPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBSubstitutionRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"bsql2sql.BSQL2SQL.BPredicate");
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
    // $ANTLR end "ruleBSubstitution"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000003000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});

}