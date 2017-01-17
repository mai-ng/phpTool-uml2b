package bsqllog2java.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import bsqllog2java.services.BSQLLog2JavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSQLLog2JavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MACHINE'", "'SEES'", "','", "'VARIABLES'", "'INVARIANT'", "'INITIALISATION'", "':='", "'{}'", "'OPERATIONS'", "';'", "'END'", "'<:'", "'struct'", "'('", "')'", "':'", "'FALSE'", "'TRUE'", "'<--'", "'='", "'PRE'", "'&'", "'THEN'", "'bool('", "'#'", "'not'", "'ANY'", "'WHERE'", "'||'", "'\\''", "'.('", "'\\\\/'", "'{'", "'rec('", "')}'"
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

        public InternalBSQLLog2JavaParser(TokenStream input, BSQLLog2JavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BSQLLog2Java";
       	}

       	@Override
       	protected BSQLLog2JavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBSQLLog2Java"
    // InternalBSQLLog2Java.g:64:1: entryRuleBSQLLog2Java returns [EObject current=null] : iv_ruleBSQLLog2Java= ruleBSQLLog2Java EOF ;
    public final EObject entryRuleBSQLLog2Java() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSQLLog2Java = null;


        try {
            // InternalBSQLLog2Java.g:64:53: (iv_ruleBSQLLog2Java= ruleBSQLLog2Java EOF )
            // InternalBSQLLog2Java.g:65:2: iv_ruleBSQLLog2Java= ruleBSQLLog2Java EOF
            {
             newCompositeNode(grammarAccess.getBSQLLog2JavaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSQLLog2Java=ruleBSQLLog2Java();

            state._fsp--;

             current =iv_ruleBSQLLog2Java; 
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
    // $ANTLR end "entryRuleBSQLLog2Java"


    // $ANTLR start "ruleBSQLLog2Java"
    // InternalBSQLLog2Java.g:71:1: ruleBSQLLog2Java returns [EObject current=null] : this_BSQLMachine_0= ruleBSQLMachine ;
    public final EObject ruleBSQLLog2Java() throws RecognitionException {
        EObject current = null;

        EObject this_BSQLMachine_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:77:2: (this_BSQLMachine_0= ruleBSQLMachine )
            // InternalBSQLLog2Java.g:78:2: this_BSQLMachine_0= ruleBSQLMachine
            {

            		newCompositeNode(grammarAccess.getBSQLLog2JavaAccess().getBSQLMachineParserRuleCall());
            	
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
    // $ANTLR end "ruleBSQLLog2Java"


    // $ANTLR start "entryRuleBSQLMachine"
    // InternalBSQLLog2Java.g:89:1: entryRuleBSQLMachine returns [EObject current=null] : iv_ruleBSQLMachine= ruleBSQLMachine EOF ;
    public final EObject entryRuleBSQLMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSQLMachine = null;


        try {
            // InternalBSQLLog2Java.g:89:52: (iv_ruleBSQLMachine= ruleBSQLMachine EOF )
            // InternalBSQLLog2Java.g:90:2: iv_ruleBSQLMachine= ruleBSQLMachine EOF
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
    // InternalBSQLLog2Java.g:96:1: ruleBSQLMachine returns [EObject current=null] : (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) (otherlv_2= 'SEES' ( (lv_seename_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_seename_5_0= RULE_ID ) ) )* )? otherlv_6= 'VARIABLES' ( (lv_vars_7_0= RULE_ID ) ) otherlv_8= 'INVARIANT' ( (lv_inv_9_0= ruleBTable ) ) otherlv_10= 'INITIALISATION' ( (lv_init_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= '{}' otherlv_14= 'OPERATIONS' ( (lv_bops_15_0= ruleBOperation ) ) (otherlv_16= ';' ( (lv_bops_17_0= ruleBOperation ) ) )* otherlv_18= 'END' ) ;
    public final EObject ruleBSQLMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_m_name_1_0=null;
        Token otherlv_2=null;
        Token lv_seename_3_0=null;
        Token otherlv_4=null;
        Token lv_seename_5_0=null;
        Token otherlv_6=null;
        Token lv_vars_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_init_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_inv_9_0 = null;

        EObject lv_bops_15_0 = null;

        EObject lv_bops_17_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:102:2: ( (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) (otherlv_2= 'SEES' ( (lv_seename_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_seename_5_0= RULE_ID ) ) )* )? otherlv_6= 'VARIABLES' ( (lv_vars_7_0= RULE_ID ) ) otherlv_8= 'INVARIANT' ( (lv_inv_9_0= ruleBTable ) ) otherlv_10= 'INITIALISATION' ( (lv_init_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= '{}' otherlv_14= 'OPERATIONS' ( (lv_bops_15_0= ruleBOperation ) ) (otherlv_16= ';' ( (lv_bops_17_0= ruleBOperation ) ) )* otherlv_18= 'END' ) )
            // InternalBSQLLog2Java.g:103:2: (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) (otherlv_2= 'SEES' ( (lv_seename_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_seename_5_0= RULE_ID ) ) )* )? otherlv_6= 'VARIABLES' ( (lv_vars_7_0= RULE_ID ) ) otherlv_8= 'INVARIANT' ( (lv_inv_9_0= ruleBTable ) ) otherlv_10= 'INITIALISATION' ( (lv_init_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= '{}' otherlv_14= 'OPERATIONS' ( (lv_bops_15_0= ruleBOperation ) ) (otherlv_16= ';' ( (lv_bops_17_0= ruleBOperation ) ) )* otherlv_18= 'END' )
            {
            // InternalBSQLLog2Java.g:103:2: (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) (otherlv_2= 'SEES' ( (lv_seename_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_seename_5_0= RULE_ID ) ) )* )? otherlv_6= 'VARIABLES' ( (lv_vars_7_0= RULE_ID ) ) otherlv_8= 'INVARIANT' ( (lv_inv_9_0= ruleBTable ) ) otherlv_10= 'INITIALISATION' ( (lv_init_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= '{}' otherlv_14= 'OPERATIONS' ( (lv_bops_15_0= ruleBOperation ) ) (otherlv_16= ';' ( (lv_bops_17_0= ruleBOperation ) ) )* otherlv_18= 'END' )
            // InternalBSQLLog2Java.g:104:3: otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) (otherlv_2= 'SEES' ( (lv_seename_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_seename_5_0= RULE_ID ) ) )* )? otherlv_6= 'VARIABLES' ( (lv_vars_7_0= RULE_ID ) ) otherlv_8= 'INVARIANT' ( (lv_inv_9_0= ruleBTable ) ) otherlv_10= 'INITIALISATION' ( (lv_init_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= '{}' otherlv_14= 'OPERATIONS' ( (lv_bops_15_0= ruleBOperation ) ) (otherlv_16= ';' ( (lv_bops_17_0= ruleBOperation ) ) )* otherlv_18= 'END'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBSQLMachineAccess().getMACHINEKeyword_0());
            		
            // InternalBSQLLog2Java.g:108:3: ( (lv_m_name_1_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:109:4: (lv_m_name_1_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:109:4: (lv_m_name_1_0= RULE_ID )
            // InternalBSQLLog2Java.g:110:5: lv_m_name_1_0= RULE_ID
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

            // InternalBSQLLog2Java.g:126:3: (otherlv_2= 'SEES' ( (lv_seename_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_seename_5_0= RULE_ID ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBSQLLog2Java.g:127:4: otherlv_2= 'SEES' ( (lv_seename_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_seename_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getBSQLMachineAccess().getSEESKeyword_2_0());
                    			
                    // InternalBSQLLog2Java.g:131:4: ( (lv_seename_3_0= RULE_ID ) )
                    // InternalBSQLLog2Java.g:132:5: (lv_seename_3_0= RULE_ID )
                    {
                    // InternalBSQLLog2Java.g:132:5: (lv_seename_3_0= RULE_ID )
                    // InternalBSQLLog2Java.g:133:6: lv_seename_3_0= RULE_ID
                    {
                    lv_seename_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_seename_3_0, grammarAccess.getBSQLMachineAccess().getSeenameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBSQLMachineRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"seename",
                    							lv_seename_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalBSQLLog2Java.g:149:4: (otherlv_4= ',' ( (lv_seename_5_0= RULE_ID ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBSQLLog2Java.g:150:5: otherlv_4= ',' ( (lv_seename_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getBSQLMachineAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBSQLLog2Java.g:154:5: ( (lv_seename_5_0= RULE_ID ) )
                    	    // InternalBSQLLog2Java.g:155:6: (lv_seename_5_0= RULE_ID )
                    	    {
                    	    // InternalBSQLLog2Java.g:155:6: (lv_seename_5_0= RULE_ID )
                    	    // InternalBSQLLog2Java.g:156:7: lv_seename_5_0= RULE_ID
                    	    {
                    	    lv_seename_5_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    							newLeafNode(lv_seename_5_0, grammarAccess.getBSQLMachineAccess().getSeenameIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBSQLMachineRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"seename",
                    	    								lv_seename_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getBSQLMachineAccess().getVARIABLESKeyword_3());
            		
            // InternalBSQLLog2Java.g:178:3: ( (lv_vars_7_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:179:4: (lv_vars_7_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:179:4: (lv_vars_7_0= RULE_ID )
            // InternalBSQLLog2Java.g:180:5: lv_vars_7_0= RULE_ID
            {
            lv_vars_7_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_vars_7_0, grammarAccess.getBSQLMachineAccess().getVarsIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBSQLMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"vars",
            						lv_vars_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getBSQLMachineAccess().getINVARIANTKeyword_5());
            		
            // InternalBSQLLog2Java.g:200:3: ( (lv_inv_9_0= ruleBTable ) )
            // InternalBSQLLog2Java.g:201:4: (lv_inv_9_0= ruleBTable )
            {
            // InternalBSQLLog2Java.g:201:4: (lv_inv_9_0= ruleBTable )
            // InternalBSQLLog2Java.g:202:5: lv_inv_9_0= ruleBTable
            {

            					newCompositeNode(grammarAccess.getBSQLMachineAccess().getInvBTableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_inv_9_0=ruleBTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBSQLMachineRule());
            					}
            					set(
            						current,
            						"inv",
            						lv_inv_9_0,
            						"bsqllog2java.BSQLLog2Java.BTable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getBSQLMachineAccess().getINITIALISATIONKeyword_7());
            		
            // InternalBSQLLog2Java.g:223:3: ( (lv_init_11_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:224:4: (lv_init_11_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:224:4: (lv_init_11_0= RULE_ID )
            // InternalBSQLLog2Java.g:225:5: lv_init_11_0= RULE_ID
            {
            lv_init_11_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_init_11_0, grammarAccess.getBSQLMachineAccess().getInitIDTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBSQLMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"init",
            						lv_init_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getBSQLMachineAccess().getColonEqualsSignKeyword_9());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getBSQLMachineAccess().getLeftCurlyBracketRightCurlyBracketKeyword_10());
            		
            otherlv_14=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getBSQLMachineAccess().getOPERATIONSKeyword_11());
            		
            // InternalBSQLLog2Java.g:253:3: ( (lv_bops_15_0= ruleBOperation ) )
            // InternalBSQLLog2Java.g:254:4: (lv_bops_15_0= ruleBOperation )
            {
            // InternalBSQLLog2Java.g:254:4: (lv_bops_15_0= ruleBOperation )
            // InternalBSQLLog2Java.g:255:5: lv_bops_15_0= ruleBOperation
            {

            					newCompositeNode(grammarAccess.getBSQLMachineAccess().getBopsBOperationParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_bops_15_0=ruleBOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBSQLMachineRule());
            					}
            					add(
            						current,
            						"bops",
            						lv_bops_15_0,
            						"bsqllog2java.BSQLLog2Java.BOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSQLLog2Java.g:272:3: (otherlv_16= ';' ( (lv_bops_17_0= ruleBOperation ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:273:4: otherlv_16= ';' ( (lv_bops_17_0= ruleBOperation ) )
            	    {
            	    otherlv_16=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_16, grammarAccess.getBSQLMachineAccess().getSemicolonKeyword_13_0());
            	    			
            	    // InternalBSQLLog2Java.g:277:4: ( (lv_bops_17_0= ruleBOperation ) )
            	    // InternalBSQLLog2Java.g:278:5: (lv_bops_17_0= ruleBOperation )
            	    {
            	    // InternalBSQLLog2Java.g:278:5: (lv_bops_17_0= ruleBOperation )
            	    // InternalBSQLLog2Java.g:279:6: lv_bops_17_0= ruleBOperation
            	    {

            	    						newCompositeNode(grammarAccess.getBSQLMachineAccess().getBopsBOperationParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_bops_17_0=ruleBOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBSQLMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bops",
            	    							lv_bops_17_0,
            	    							"bsqllog2java.BSQLLog2Java.BOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_18=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getBSQLMachineAccess().getENDKeyword_14());
            		

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


    // $ANTLR start "entryRuleBOperation"
    // InternalBSQLLog2Java.g:305:1: entryRuleBOperation returns [EObject current=null] : iv_ruleBOperation= ruleBOperation EOF ;
    public final EObject entryRuleBOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOperation = null;


        try {
            // InternalBSQLLog2Java.g:305:51: (iv_ruleBOperation= ruleBOperation EOF )
            // InternalBSQLLog2Java.g:306:2: iv_ruleBOperation= ruleBOperation EOF
            {
             newCompositeNode(grammarAccess.getBOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOperation=ruleBOperation();

            state._fsp--;

             current =iv_ruleBOperation; 
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
    // $ANTLR end "entryRuleBOperation"


    // $ANTLR start "ruleBOperation"
    // InternalBSQLLog2Java.g:312:1: ruleBOperation returns [EObject current=null] : ( ( (lv_bops_0_0= ruleBoolOperation ) ) | ( (lv_vops_1_0= ruleVoidOperation ) ) | ( (lv_sops_2_0= ruleStringOperation ) ) ) ;
    public final EObject ruleBOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_bops_0_0 = null;

        EObject lv_vops_1_0 = null;

        EObject lv_sops_2_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:318:2: ( ( ( (lv_bops_0_0= ruleBoolOperation ) ) | ( (lv_vops_1_0= ruleVoidOperation ) ) | ( (lv_sops_2_0= ruleStringOperation ) ) ) )
            // InternalBSQLLog2Java.g:319:2: ( ( (lv_bops_0_0= ruleBoolOperation ) ) | ( (lv_vops_1_0= ruleVoidOperation ) ) | ( (lv_sops_2_0= ruleStringOperation ) ) )
            {
            // InternalBSQLLog2Java.g:319:2: ( ( (lv_bops_0_0= ruleBoolOperation ) ) | ( (lv_vops_1_0= ruleVoidOperation ) ) | ( (lv_sops_2_0= ruleStringOperation ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalBSQLLog2Java.g:320:3: ( (lv_bops_0_0= ruleBoolOperation ) )
                    {
                    // InternalBSQLLog2Java.g:320:3: ( (lv_bops_0_0= ruleBoolOperation ) )
                    // InternalBSQLLog2Java.g:321:4: (lv_bops_0_0= ruleBoolOperation )
                    {
                    // InternalBSQLLog2Java.g:321:4: (lv_bops_0_0= ruleBoolOperation )
                    // InternalBSQLLog2Java.g:322:5: lv_bops_0_0= ruleBoolOperation
                    {

                    					newCompositeNode(grammarAccess.getBOperationAccess().getBopsBoolOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bops_0_0=ruleBoolOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBOperationRule());
                    					}
                    					set(
                    						current,
                    						"bops",
                    						lv_bops_0_0,
                    						"bsqllog2java.BSQLLog2Java.BoolOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:340:3: ( (lv_vops_1_0= ruleVoidOperation ) )
                    {
                    // InternalBSQLLog2Java.g:340:3: ( (lv_vops_1_0= ruleVoidOperation ) )
                    // InternalBSQLLog2Java.g:341:4: (lv_vops_1_0= ruleVoidOperation )
                    {
                    // InternalBSQLLog2Java.g:341:4: (lv_vops_1_0= ruleVoidOperation )
                    // InternalBSQLLog2Java.g:342:5: lv_vops_1_0= ruleVoidOperation
                    {

                    					newCompositeNode(grammarAccess.getBOperationAccess().getVopsVoidOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_vops_1_0=ruleVoidOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBOperationRule());
                    					}
                    					set(
                    						current,
                    						"vops",
                    						lv_vops_1_0,
                    						"bsqllog2java.BSQLLog2Java.VoidOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBSQLLog2Java.g:360:3: ( (lv_sops_2_0= ruleStringOperation ) )
                    {
                    // InternalBSQLLog2Java.g:360:3: ( (lv_sops_2_0= ruleStringOperation ) )
                    // InternalBSQLLog2Java.g:361:4: (lv_sops_2_0= ruleStringOperation )
                    {
                    // InternalBSQLLog2Java.g:361:4: (lv_sops_2_0= ruleStringOperation )
                    // InternalBSQLLog2Java.g:362:5: lv_sops_2_0= ruleStringOperation
                    {

                    					newCompositeNode(grammarAccess.getBOperationAccess().getSopsStringOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sops_2_0=ruleStringOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBOperationRule());
                    					}
                    					set(
                    						current,
                    						"sops",
                    						lv_sops_2_0,
                    						"bsqllog2java.BSQLLog2Java.StringOperation");
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
    // $ANTLR end "ruleBOperation"


    // $ANTLR start "entryRuleBTable"
    // InternalBSQLLog2Java.g:383:1: entryRuleBTable returns [EObject current=null] : iv_ruleBTable= ruleBTable EOF ;
    public final EObject entryRuleBTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTable = null;


        try {
            // InternalBSQLLog2Java.g:383:47: (iv_ruleBTable= ruleBTable EOF )
            // InternalBSQLLog2Java.g:384:2: iv_ruleBTable= ruleBTable EOF
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
    // InternalBSQLLog2Java.g:390:1: ruleBTable returns [EObject current=null] : ( ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' ) ;
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
            // InternalBSQLLog2Java.g:396:2: ( ( ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' ) )
            // InternalBSQLLog2Java.g:397:2: ( ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )
            {
            // InternalBSQLLog2Java.g:397:2: ( ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )
            // InternalBSQLLog2Java.g:398:3: ( (lv_table_name_0_0= RULE_ID ) ) otherlv_1= '<:' otherlv_2= 'struct' otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')'
            {
            // InternalBSQLLog2Java.g:398:3: ( (lv_table_name_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:399:4: (lv_table_name_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:399:4: (lv_table_name_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:400:5: lv_table_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBTableAccess().getLessThanSignColonKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getBTableAccess().getStructKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBTableAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBSQLLog2Java.g:428:3: ( (lv_attributes_4_0= ruleAttribute ) )
            // InternalBSQLLog2Java.g:429:4: (lv_attributes_4_0= ruleAttribute )
            {
            // InternalBSQLLog2Java.g:429:4: (lv_attributes_4_0= ruleAttribute )
            // InternalBSQLLog2Java.g:430:5: lv_attributes_4_0= ruleAttribute
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
            						"bsqllog2java.BSQLLog2Java.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSQLLog2Java.g:447:3: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:448:4: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getBTableAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBSQLLog2Java.g:452:4: ( (lv_attributes_6_0= ruleAttribute ) )
            	    // InternalBSQLLog2Java.g:453:5: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // InternalBSQLLog2Java.g:453:5: (lv_attributes_6_0= ruleAttribute )
            	    // InternalBSQLLog2Java.g:454:6: lv_attributes_6_0= ruleAttribute
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
            	    							"bsqllog2java.BSQLLog2Java.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

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
    // InternalBSQLLog2Java.g:480:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalBSQLLog2Java.g:480:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalBSQLLog2Java.g:481:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalBSQLLog2Java.g:487:1: ruleAttribute returns [EObject current=null] : ( ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_att_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:493:2: ( ( ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) )
            // InternalBSQLLog2Java.g:494:2: ( ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            {
            // InternalBSQLLog2Java.g:494:2: ( ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            // InternalBSQLLog2Java.g:495:3: ( (lv_att_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) )
            {
            // InternalBSQLLog2Java.g:495:3: ( (lv_att_name_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:496:4: (lv_att_name_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:496:4: (lv_att_name_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:497:5: lv_att_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalBSQLLog2Java.g:517:3: ( (lv_type_2_0= ruleBType ) )
            // InternalBSQLLog2Java.g:518:4: (lv_type_2_0= ruleBType )
            {
            // InternalBSQLLog2Java.g:518:4: (lv_type_2_0= ruleBType )
            // InternalBSQLLog2Java.g:519:5: lv_type_2_0= ruleBType
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
            						"bsqllog2java.BSQLLog2Java.BType");
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
    // InternalBSQLLog2Java.g:540:1: entryRuleBType returns [EObject current=null] : iv_ruleBType= ruleBType EOF ;
    public final EObject entryRuleBType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBType = null;


        try {
            // InternalBSQLLog2Java.g:540:46: (iv_ruleBType= ruleBType EOF )
            // InternalBSQLLog2Java.g:541:2: iv_ruleBType= ruleBType EOF
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
    // InternalBSQLLog2Java.g:547:1: ruleBType returns [EObject current=null] : ( (lv_type_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBType() throws RecognitionException {
        EObject current = null;

        Token lv_type_name_0_0=null;


        	enterRule();

        try {
            // InternalBSQLLog2Java.g:553:2: ( ( (lv_type_name_0_0= RULE_ID ) ) )
            // InternalBSQLLog2Java.g:554:2: ( (lv_type_name_0_0= RULE_ID ) )
            {
            // InternalBSQLLog2Java.g:554:2: ( (lv_type_name_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:555:3: (lv_type_name_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:555:3: (lv_type_name_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:556:4: lv_type_name_0_0= RULE_ID
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
    // InternalBSQLLog2Java.g:575:1: entryRuleBValue returns [String current=null] : iv_ruleBValue= ruleBValue EOF ;
    public final String entryRuleBValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBValue = null;


        try {
            // InternalBSQLLog2Java.g:575:46: (iv_ruleBValue= ruleBValue EOF )
            // InternalBSQLLog2Java.g:576:2: iv_ruleBValue= ruleBValue EOF
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
    // InternalBSQLLog2Java.g:582:1: ruleBValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | kw= 'FALSE' | kw= 'TRUE' ) ;
    public final AntlrDatatypeRuleToken ruleBValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalBSQLLog2Java.g:588:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | kw= 'FALSE' | kw= 'TRUE' ) )
            // InternalBSQLLog2Java.g:589:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | kw= 'FALSE' | kw= 'TRUE' )
            {
            // InternalBSQLLog2Java.g:589:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | kw= 'FALSE' | kw= 'TRUE' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBSQLLog2Java.g:590:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getBValueAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:598:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getBValueAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSQLLog2Java.g:606:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBValueAccess().getFALSEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSQLLog2Java.g:612:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBoolOperation"
    // InternalBSQLLog2Java.g:621:1: entryRuleBoolOperation returns [EObject current=null] : iv_ruleBoolOperation= ruleBoolOperation EOF ;
    public final EObject entryRuleBoolOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolOperation = null;


        try {
            // InternalBSQLLog2Java.g:621:54: (iv_ruleBoolOperation= ruleBoolOperation EOF )
            // InternalBSQLLog2Java.g:622:2: iv_ruleBoolOperation= ruleBoolOperation EOF
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
    // InternalBSQLLog2Java.g:628:1: ruleBoolOperation returns [EObject current=null] : ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( ( (lv_reshas_14_0= ruleBSubTrue ) ) | ( (lv_resno_15_0= ruleBSubFalse ) ) ) otherlv_16= 'END' ) ;
    public final EObject ruleBoolOperation() throws RecognitionException {
        EObject current = null;

        Token lv_res_0_0=null;
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
        Token otherlv_16=null;
        EObject lv_pTyping_10_0 = null;

        EObject lv_pTyping_12_0 = null;

        EObject lv_reshas_14_0 = null;

        EObject lv_resno_15_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:634:2: ( ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( ( (lv_reshas_14_0= ruleBSubTrue ) ) | ( (lv_resno_15_0= ruleBSubFalse ) ) ) otherlv_16= 'END' ) )
            // InternalBSQLLog2Java.g:635:2: ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( ( (lv_reshas_14_0= ruleBSubTrue ) ) | ( (lv_resno_15_0= ruleBSubFalse ) ) ) otherlv_16= 'END' )
            {
            // InternalBSQLLog2Java.g:635:2: ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( ( (lv_reshas_14_0= ruleBSubTrue ) ) | ( (lv_resno_15_0= ruleBSubFalse ) ) ) otherlv_16= 'END' )
            // InternalBSQLLog2Java.g:636:3: ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( ( (lv_reshas_14_0= ruleBSubTrue ) ) | ( (lv_resno_15_0= ruleBSubFalse ) ) ) otherlv_16= 'END'
            {
            // InternalBSQLLog2Java.g:636:3: ( (lv_res_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:637:4: (lv_res_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:637:4: (lv_res_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:638:5: lv_res_0_0= RULE_ID
            {
            lv_res_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_res_0_0, grammarAccess.getBoolOperationAccess().getResIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"res",
            						lv_res_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1());
            		
            // InternalBSQLLog2Java.g:658:3: ( (lv_op_name_2_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:659:4: (lv_op_name_2_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:659:4: (lv_op_name_2_0= RULE_ID )
            // InternalBSQLLog2Java.g:660:5: lv_op_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getBoolOperationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBSQLLog2Java.g:680:3: ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBSQLLog2Java.g:681:4: ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )*
                    {
                    // InternalBSQLLog2Java.g:681:4: ( (lv_pList_4_0= RULE_ID ) )
                    // InternalBSQLLog2Java.g:682:5: (lv_pList_4_0= RULE_ID )
                    {
                    // InternalBSQLLog2Java.g:682:5: (lv_pList_4_0= RULE_ID )
                    // InternalBSQLLog2Java.g:683:6: lv_pList_4_0= RULE_ID
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

                    // InternalBSQLLog2Java.g:699:4: (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBSQLLog2Java.g:700:5: otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getBoolOperationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalBSQLLog2Java.g:704:5: ( (lv_pList_6_0= RULE_ID ) )
                    	    // InternalBSQLLog2Java.g:705:6: (lv_pList_6_0= RULE_ID )
                    	    {
                    	    // InternalBSQLLog2Java.g:705:6: (lv_pList_6_0= RULE_ID )
                    	    // InternalBSQLLog2Java.g:706:7: lv_pList_6_0= RULE_ID
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getBoolOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getBoolOperationAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getBoolOperationAccess().getPREKeyword_7());
            		
            // InternalBSQLLog2Java.g:736:3: ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* )
            // InternalBSQLLog2Java.g:737:4: ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )*
            {
            // InternalBSQLLog2Java.g:737:4: ( (lv_pTyping_10_0= ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:738:5: (lv_pTyping_10_0= ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:738:5: (lv_pTyping_10_0= ruleBParameterTyping )
            // InternalBSQLLog2Java.g:739:6: lv_pTyping_10_0= ruleBParameterTyping
            {

            						newCompositeNode(grammarAccess.getBoolOperationAccess().getPTypingBParameterTypingParserRuleCall_8_0_0());
            					
            pushFollow(FOLLOW_21);
            lv_pTyping_10_0=ruleBParameterTyping();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBoolOperationRule());
            						}
            						add(
            							current,
            							"pTyping",
            							lv_pTyping_10_0,
            							"bsqllog2java.BSQLLog2Java.BParameterTyping");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBSQLLog2Java.g:756:4: (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:757:5: otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) )
            	    {
            	    otherlv_11=(Token)match(input,32,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getBoolOperationAccess().getAmpersandKeyword_8_1_0());
            	    				
            	    // InternalBSQLLog2Java.g:761:5: ( (lv_pTyping_12_0= ruleBParameterTyping ) )
            	    // InternalBSQLLog2Java.g:762:6: (lv_pTyping_12_0= ruleBParameterTyping )
            	    {
            	    // InternalBSQLLog2Java.g:762:6: (lv_pTyping_12_0= ruleBParameterTyping )
            	    // InternalBSQLLog2Java.g:763:7: lv_pTyping_12_0= ruleBParameterTyping
            	    {

            	    							newCompositeNode(grammarAccess.getBoolOperationAccess().getPTypingBParameterTypingParserRuleCall_8_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_pTyping_12_0=ruleBParameterTyping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBoolOperationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"pTyping",
            	    								lv_pTyping_12_0,
            	    								"bsqllog2java.BSQLLog2Java.BParameterTyping");
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

            otherlv_13=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getBoolOperationAccess().getTHENKeyword_9());
            		
            // InternalBSQLLog2Java.g:786:3: ( ( (lv_reshas_14_0= ruleBSubTrue ) ) | ( (lv_resno_15_0= ruleBSubFalse ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==17) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==34) ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3==35) ) {
                            alt10=1;
                        }
                        else if ( (LA10_3==36) ) {
                            alt10=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBSQLLog2Java.g:787:4: ( (lv_reshas_14_0= ruleBSubTrue ) )
                    {
                    // InternalBSQLLog2Java.g:787:4: ( (lv_reshas_14_0= ruleBSubTrue ) )
                    // InternalBSQLLog2Java.g:788:5: (lv_reshas_14_0= ruleBSubTrue )
                    {
                    // InternalBSQLLog2Java.g:788:5: (lv_reshas_14_0= ruleBSubTrue )
                    // InternalBSQLLog2Java.g:789:6: lv_reshas_14_0= ruleBSubTrue
                    {

                    						newCompositeNode(grammarAccess.getBoolOperationAccess().getReshasBSubTrueParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_reshas_14_0=ruleBSubTrue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoolOperationRule());
                    						}
                    						set(
                    							current,
                    							"reshas",
                    							lv_reshas_14_0,
                    							"bsqllog2java.BSQLLog2Java.BSubTrue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:807:4: ( (lv_resno_15_0= ruleBSubFalse ) )
                    {
                    // InternalBSQLLog2Java.g:807:4: ( (lv_resno_15_0= ruleBSubFalse ) )
                    // InternalBSQLLog2Java.g:808:5: (lv_resno_15_0= ruleBSubFalse )
                    {
                    // InternalBSQLLog2Java.g:808:5: (lv_resno_15_0= ruleBSubFalse )
                    // InternalBSQLLog2Java.g:809:6: lv_resno_15_0= ruleBSubFalse
                    {

                    						newCompositeNode(grammarAccess.getBoolOperationAccess().getResnoBSubFalseParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_resno_15_0=ruleBSubFalse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoolOperationRule());
                    						}
                    						set(
                    							current,
                    							"resno",
                    							lv_resno_15_0,
                    							"bsqllog2java.BSQLLog2Java.BSubFalse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getBoolOperationAccess().getENDKeyword_11());
            		

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


    // $ANTLR start "entryRuleBSubTrue"
    // InternalBSQLLog2Java.g:835:1: entryRuleBSubTrue returns [EObject current=null] : iv_ruleBSubTrue= ruleBSubTrue EOF ;
    public final EObject entryRuleBSubTrue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSubTrue = null;


        try {
            // InternalBSQLLog2Java.g:835:49: (iv_ruleBSubTrue= ruleBSubTrue EOF )
            // InternalBSQLLog2Java.g:836:2: iv_ruleBSubTrue= ruleBSubTrue EOF
            {
             newCompositeNode(grammarAccess.getBSubTrueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSubTrue=ruleBSubTrue();

            state._fsp--;

             current =iv_ruleBSubTrue; 
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
    // $ANTLR end "entryRuleBSubTrue"


    // $ANTLR start "ruleBSubTrue"
    // InternalBSQLLog2Java.g:842:1: ruleBSubTrue returns [EObject current=null] : ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= '#' ( (lv_objTable_4_0= ruleTableInstance ) ) otherlv_5= '&' ( (lv_pres_6_0= ruleBPredicate ) ) (otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) )* otherlv_9= ')' otherlv_10= ')' ) ;
    public final EObject ruleBSubTrue() throws RecognitionException {
        EObject current = null;

        Token lv_res_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_objTable_4_0 = null;

        EObject lv_pres_6_0 = null;

        EObject lv_pres_8_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:848:2: ( ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= '#' ( (lv_objTable_4_0= ruleTableInstance ) ) otherlv_5= '&' ( (lv_pres_6_0= ruleBPredicate ) ) (otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) )* otherlv_9= ')' otherlv_10= ')' ) )
            // InternalBSQLLog2Java.g:849:2: ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= '#' ( (lv_objTable_4_0= ruleTableInstance ) ) otherlv_5= '&' ( (lv_pres_6_0= ruleBPredicate ) ) (otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) )* otherlv_9= ')' otherlv_10= ')' )
            {
            // InternalBSQLLog2Java.g:849:2: ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= '#' ( (lv_objTable_4_0= ruleTableInstance ) ) otherlv_5= '&' ( (lv_pres_6_0= ruleBPredicate ) ) (otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) )* otherlv_9= ')' otherlv_10= ')' )
            // InternalBSQLLog2Java.g:850:3: ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= '#' ( (lv_objTable_4_0= ruleTableInstance ) ) otherlv_5= '&' ( (lv_pres_6_0= ruleBPredicate ) ) (otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) )* otherlv_9= ')' otherlv_10= ')'
            {
            // InternalBSQLLog2Java.g:850:3: ( (lv_res_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:851:4: (lv_res_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:851:4: (lv_res_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:852:5: lv_res_0_0= RULE_ID
            {
            lv_res_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_res_0_0, grammarAccess.getBSubTrueAccess().getResIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBSubTrueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"res",
            						lv_res_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getBSubTrueAccess().getColonEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getBSubTrueAccess().getBoolKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBSubTrueAccess().getNumberSignKeyword_3());
            		
            // InternalBSQLLog2Java.g:880:3: ( (lv_objTable_4_0= ruleTableInstance ) )
            // InternalBSQLLog2Java.g:881:4: (lv_objTable_4_0= ruleTableInstance )
            {
            // InternalBSQLLog2Java.g:881:4: (lv_objTable_4_0= ruleTableInstance )
            // InternalBSQLLog2Java.g:882:5: lv_objTable_4_0= ruleTableInstance
            {

            					newCompositeNode(grammarAccess.getBSubTrueAccess().getObjTableTableInstanceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_objTable_4_0=ruleTableInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBSubTrueRule());
            					}
            					set(
            						current,
            						"objTable",
            						lv_objTable_4_0,
            						"bsqllog2java.BSQLLog2Java.TableInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getBSubTrueAccess().getAmpersandKeyword_5());
            		
            // InternalBSQLLog2Java.g:903:3: ( (lv_pres_6_0= ruleBPredicate ) )
            // InternalBSQLLog2Java.g:904:4: (lv_pres_6_0= ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:904:4: (lv_pres_6_0= ruleBPredicate )
            // InternalBSQLLog2Java.g:905:5: lv_pres_6_0= ruleBPredicate
            {

            					newCompositeNode(grammarAccess.getBSubTrueAccess().getPresBPredicateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_26);
            lv_pres_6_0=ruleBPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBSubTrueRule());
            					}
            					add(
            						current,
            						"pres",
            						lv_pres_6_0,
            						"bsqllog2java.BSQLLog2Java.BPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSQLLog2Java.g:922:3: (otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:923:4: otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) )
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBSubTrueAccess().getAmpersandKeyword_7_0());
            	    			
            	    // InternalBSQLLog2Java.g:927:4: ( (lv_pres_8_0= ruleBPredicate ) )
            	    // InternalBSQLLog2Java.g:928:5: (lv_pres_8_0= ruleBPredicate )
            	    {
            	    // InternalBSQLLog2Java.g:928:5: (lv_pres_8_0= ruleBPredicate )
            	    // InternalBSQLLog2Java.g:929:6: lv_pres_8_0= ruleBPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getBSubTrueAccess().getPresBPredicateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_pres_8_0=ruleBPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBSubTrueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pres",
            	    							lv_pres_8_0,
            	    							"bsqllog2java.BSQLLog2Java.BPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getBSubTrueAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBSubTrueAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleBSubTrue"


    // $ANTLR start "entryRuleBSubFalse"
    // InternalBSQLLog2Java.g:959:1: entryRuleBSubFalse returns [EObject current=null] : iv_ruleBSubFalse= ruleBSubFalse EOF ;
    public final EObject entryRuleBSubFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSubFalse = null;


        try {
            // InternalBSQLLog2Java.g:959:50: (iv_ruleBSubFalse= ruleBSubFalse EOF )
            // InternalBSQLLog2Java.g:960:2: iv_ruleBSubFalse= ruleBSubFalse EOF
            {
             newCompositeNode(grammarAccess.getBSubFalseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSubFalse=ruleBSubFalse();

            state._fsp--;

             current =iv_ruleBSubFalse; 
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
    // $ANTLR end "entryRuleBSubFalse"


    // $ANTLR start "ruleBSubFalse"
    // InternalBSQLLog2Java.g:966:1: ruleBSubFalse returns [EObject current=null] : ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= 'not' otherlv_4= '(' otherlv_5= '#' ( (lv_objTable_6_0= ruleTableInstance ) ) otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) (otherlv_9= '&' ( (lv_pres_10_0= ruleBPredicate ) ) )* otherlv_11= ')' otherlv_12= ')' otherlv_13= ')' ) ;
    public final EObject ruleBSubFalse() throws RecognitionException {
        EObject current = null;

        Token lv_res_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_objTable_6_0 = null;

        EObject lv_pres_8_0 = null;

        EObject lv_pres_10_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:972:2: ( ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= 'not' otherlv_4= '(' otherlv_5= '#' ( (lv_objTable_6_0= ruleTableInstance ) ) otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) (otherlv_9= '&' ( (lv_pres_10_0= ruleBPredicate ) ) )* otherlv_11= ')' otherlv_12= ')' otherlv_13= ')' ) )
            // InternalBSQLLog2Java.g:973:2: ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= 'not' otherlv_4= '(' otherlv_5= '#' ( (lv_objTable_6_0= ruleTableInstance ) ) otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) (otherlv_9= '&' ( (lv_pres_10_0= ruleBPredicate ) ) )* otherlv_11= ')' otherlv_12= ')' otherlv_13= ')' )
            {
            // InternalBSQLLog2Java.g:973:2: ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= 'not' otherlv_4= '(' otherlv_5= '#' ( (lv_objTable_6_0= ruleTableInstance ) ) otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) (otherlv_9= '&' ( (lv_pres_10_0= ruleBPredicate ) ) )* otherlv_11= ')' otherlv_12= ')' otherlv_13= ')' )
            // InternalBSQLLog2Java.g:974:3: ( (lv_res_0_0= RULE_ID ) ) otherlv_1= ':=' otherlv_2= 'bool(' otherlv_3= 'not' otherlv_4= '(' otherlv_5= '#' ( (lv_objTable_6_0= ruleTableInstance ) ) otherlv_7= '&' ( (lv_pres_8_0= ruleBPredicate ) ) (otherlv_9= '&' ( (lv_pres_10_0= ruleBPredicate ) ) )* otherlv_11= ')' otherlv_12= ')' otherlv_13= ')'
            {
            // InternalBSQLLog2Java.g:974:3: ( (lv_res_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:975:4: (lv_res_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:975:4: (lv_res_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:976:5: lv_res_0_0= RULE_ID
            {
            lv_res_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_res_0_0, grammarAccess.getBSubFalseAccess().getResIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBSubFalseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"res",
            						lv_res_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getBSubFalseAccess().getColonEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getBSubFalseAccess().getBoolKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getBSubFalseAccess().getNotKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getBSubFalseAccess().getLeftParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getBSubFalseAccess().getNumberSignKeyword_5());
            		
            // InternalBSQLLog2Java.g:1012:3: ( (lv_objTable_6_0= ruleTableInstance ) )
            // InternalBSQLLog2Java.g:1013:4: (lv_objTable_6_0= ruleTableInstance )
            {
            // InternalBSQLLog2Java.g:1013:4: (lv_objTable_6_0= ruleTableInstance )
            // InternalBSQLLog2Java.g:1014:5: lv_objTable_6_0= ruleTableInstance
            {

            					newCompositeNode(grammarAccess.getBSubFalseAccess().getObjTableTableInstanceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_objTable_6_0=ruleTableInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBSubFalseRule());
            					}
            					set(
            						current,
            						"objTable",
            						lv_objTable_6_0,
            						"bsqllog2java.BSQLLog2Java.TableInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getBSubFalseAccess().getAmpersandKeyword_7());
            		
            // InternalBSQLLog2Java.g:1035:3: ( (lv_pres_8_0= ruleBPredicate ) )
            // InternalBSQLLog2Java.g:1036:4: (lv_pres_8_0= ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:1036:4: (lv_pres_8_0= ruleBPredicate )
            // InternalBSQLLog2Java.g:1037:5: lv_pres_8_0= ruleBPredicate
            {

            					newCompositeNode(grammarAccess.getBSubFalseAccess().getPresBPredicateParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_26);
            lv_pres_8_0=ruleBPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBSubFalseRule());
            					}
            					add(
            						current,
            						"pres",
            						lv_pres_8_0,
            						"bsqllog2java.BSQLLog2Java.BPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSQLLog2Java.g:1054:3: (otherlv_9= '&' ( (lv_pres_10_0= ruleBPredicate ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1055:4: otherlv_9= '&' ( (lv_pres_10_0= ruleBPredicate ) )
            	    {
            	    otherlv_9=(Token)match(input,32,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getBSubFalseAccess().getAmpersandKeyword_9_0());
            	    			
            	    // InternalBSQLLog2Java.g:1059:4: ( (lv_pres_10_0= ruleBPredicate ) )
            	    // InternalBSQLLog2Java.g:1060:5: (lv_pres_10_0= ruleBPredicate )
            	    {
            	    // InternalBSQLLog2Java.g:1060:5: (lv_pres_10_0= ruleBPredicate )
            	    // InternalBSQLLog2Java.g:1061:6: lv_pres_10_0= ruleBPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getBSubFalseAccess().getPresBPredicateParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_pres_10_0=ruleBPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBSubFalseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pres",
            	    							lv_pres_10_0,
            	    							"bsqllog2java.BSQLLog2Java.BPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_11=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_11, grammarAccess.getBSubFalseAccess().getRightParenthesisKeyword_10());
            		
            otherlv_12=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_12, grammarAccess.getBSubFalseAccess().getRightParenthesisKeyword_11());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getBSubFalseAccess().getRightParenthesisKeyword_12());
            		

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
    // $ANTLR end "ruleBSubFalse"


    // $ANTLR start "entryRuleStringOperation"
    // InternalBSQLLog2Java.g:1095:1: entryRuleStringOperation returns [EObject current=null] : iv_ruleStringOperation= ruleStringOperation EOF ;
    public final EObject entryRuleStringOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOperation = null;


        try {
            // InternalBSQLLog2Java.g:1095:56: (iv_ruleStringOperation= ruleStringOperation EOF )
            // InternalBSQLLog2Java.g:1096:2: iv_ruleStringOperation= ruleStringOperation EOF
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
    // InternalBSQLLog2Java.g:1102:1: ruleStringOperation returns [EObject current=null] : ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( (lv_anyblock_14_0= ruleBAnyBlock ) ) otherlv_15= 'END' ) ;
    public final EObject ruleStringOperation() throws RecognitionException {
        EObject current = null;

        Token lv_res_0_0=null;
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
        Token otherlv_15=null;
        EObject lv_pTyping_10_0 = null;

        EObject lv_pTyping_12_0 = null;

        EObject lv_anyblock_14_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:1108:2: ( ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( (lv_anyblock_14_0= ruleBAnyBlock ) ) otherlv_15= 'END' ) )
            // InternalBSQLLog2Java.g:1109:2: ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( (lv_anyblock_14_0= ruleBAnyBlock ) ) otherlv_15= 'END' )
            {
            // InternalBSQLLog2Java.g:1109:2: ( ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( (lv_anyblock_14_0= ruleBAnyBlock ) ) otherlv_15= 'END' )
            // InternalBSQLLog2Java.g:1110:3: ( (lv_res_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_op_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )? otherlv_7= ')' otherlv_8= '=' otherlv_9= 'PRE' ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* ) otherlv_13= 'THEN' ( (lv_anyblock_14_0= ruleBAnyBlock ) ) otherlv_15= 'END'
            {
            // InternalBSQLLog2Java.g:1110:3: ( (lv_res_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1111:4: (lv_res_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1111:4: (lv_res_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:1112:5: lv_res_0_0= RULE_ID
            {
            lv_res_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_res_0_0, grammarAccess.getStringOperationAccess().getResIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"res",
            						lv_res_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStringOperationAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1());
            		
            // InternalBSQLLog2Java.g:1132:3: ( (lv_op_name_2_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1133:4: (lv_op_name_2_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1133:4: (lv_op_name_2_0= RULE_ID )
            // InternalBSQLLog2Java.g:1134:5: lv_op_name_2_0= RULE_ID
            {
            lv_op_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getStringOperationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBSQLLog2Java.g:1154:3: ( ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBSQLLog2Java.g:1155:4: ( (lv_pList_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )*
                    {
                    // InternalBSQLLog2Java.g:1155:4: ( (lv_pList_4_0= RULE_ID ) )
                    // InternalBSQLLog2Java.g:1156:5: (lv_pList_4_0= RULE_ID )
                    {
                    // InternalBSQLLog2Java.g:1156:5: (lv_pList_4_0= RULE_ID )
                    // InternalBSQLLog2Java.g:1157:6: lv_pList_4_0= RULE_ID
                    {
                    lv_pList_4_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

                    // InternalBSQLLog2Java.g:1173:4: (otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBSQLLog2Java.g:1174:5: otherlv_5= ',' ( (lv_pList_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getStringOperationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalBSQLLog2Java.g:1178:5: ( (lv_pList_6_0= RULE_ID ) )
                    	    // InternalBSQLLog2Java.g:1179:6: (lv_pList_6_0= RULE_ID )
                    	    {
                    	    // InternalBSQLLog2Java.g:1179:6: (lv_pList_6_0= RULE_ID )
                    	    // InternalBSQLLog2Java.g:1180:7: lv_pList_6_0= RULE_ID
                    	    {
                    	    lv_pList_6_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getStringOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getStringOperationAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getStringOperationAccess().getPREKeyword_7());
            		
            // InternalBSQLLog2Java.g:1210:3: ( ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )* )
            // InternalBSQLLog2Java.g:1211:4: ( (lv_pTyping_10_0= ruleBParameterTyping ) ) (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )*
            {
            // InternalBSQLLog2Java.g:1211:4: ( (lv_pTyping_10_0= ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:1212:5: (lv_pTyping_10_0= ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:1212:5: (lv_pTyping_10_0= ruleBParameterTyping )
            // InternalBSQLLog2Java.g:1213:6: lv_pTyping_10_0= ruleBParameterTyping
            {

            						newCompositeNode(grammarAccess.getStringOperationAccess().getPTypingBParameterTypingParserRuleCall_8_0_0());
            					
            pushFollow(FOLLOW_21);
            lv_pTyping_10_0=ruleBParameterTyping();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStringOperationRule());
            						}
            						add(
            							current,
            							"pTyping",
            							lv_pTyping_10_0,
            							"bsqllog2java.BSQLLog2Java.BParameterTyping");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBSQLLog2Java.g:1230:4: (otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1231:5: otherlv_11= '&' ( (lv_pTyping_12_0= ruleBParameterTyping ) )
            	    {
            	    otherlv_11=(Token)match(input,32,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getStringOperationAccess().getAmpersandKeyword_8_1_0());
            	    				
            	    // InternalBSQLLog2Java.g:1235:5: ( (lv_pTyping_12_0= ruleBParameterTyping ) )
            	    // InternalBSQLLog2Java.g:1236:6: (lv_pTyping_12_0= ruleBParameterTyping )
            	    {
            	    // InternalBSQLLog2Java.g:1236:6: (lv_pTyping_12_0= ruleBParameterTyping )
            	    // InternalBSQLLog2Java.g:1237:7: lv_pTyping_12_0= ruleBParameterTyping
            	    {

            	    							newCompositeNode(grammarAccess.getStringOperationAccess().getPTypingBParameterTypingParserRuleCall_8_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_pTyping_12_0=ruleBParameterTyping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getStringOperationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"pTyping",
            	    								lv_pTyping_12_0,
            	    								"bsqllog2java.BSQLLog2Java.BParameterTyping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            otherlv_13=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_13, grammarAccess.getStringOperationAccess().getTHENKeyword_9());
            		
            // InternalBSQLLog2Java.g:1260:3: ( (lv_anyblock_14_0= ruleBAnyBlock ) )
            // InternalBSQLLog2Java.g:1261:4: (lv_anyblock_14_0= ruleBAnyBlock )
            {
            // InternalBSQLLog2Java.g:1261:4: (lv_anyblock_14_0= ruleBAnyBlock )
            // InternalBSQLLog2Java.g:1262:5: lv_anyblock_14_0= ruleBAnyBlock
            {

            					newCompositeNode(grammarAccess.getStringOperationAccess().getAnyblockBAnyBlockParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_22);
            lv_anyblock_14_0=ruleBAnyBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringOperationRule());
            					}
            					set(
            						current,
            						"anyblock",
            						lv_anyblock_14_0,
            						"bsqllog2java.BSQLLog2Java.BAnyBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getStringOperationAccess().getENDKeyword_11());
            		

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


    // $ANTLR start "entryRuleBAnyBlock"
    // InternalBSQLLog2Java.g:1287:1: entryRuleBAnyBlock returns [EObject current=null] : iv_ruleBAnyBlock= ruleBAnyBlock EOF ;
    public final EObject entryRuleBAnyBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBAnyBlock = null;


        try {
            // InternalBSQLLog2Java.g:1287:50: (iv_ruleBAnyBlock= ruleBAnyBlock EOF )
            // InternalBSQLLog2Java.g:1288:2: iv_ruleBAnyBlock= ruleBAnyBlock EOF
            {
             newCompositeNode(grammarAccess.getBAnyBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBAnyBlock=ruleBAnyBlock();

            state._fsp--;

             current =iv_ruleBAnyBlock; 
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
    // $ANTLR end "entryRuleBAnyBlock"


    // $ANTLR start "ruleBAnyBlock"
    // InternalBSQLLog2Java.g:1294:1: ruleBAnyBlock returns [EObject current=null] : (otherlv_0= 'ANY' ( ( (lv_varList_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_varList_3_0= RULE_ID ) ) )* ) otherlv_4= 'WHERE' ( ( (lv_varTyping_5_0= ruleBParameterTyping ) ) (otherlv_6= '&' ( (lv_varTyping_7_0= ruleBParameterTyping ) ) )* ) (otherlv_8= '&' )? ( (lv_pres_9_0= ruleBPredicate ) ) (otherlv_10= '&' ( (lv_pres_11_0= ruleBPredicate ) ) )* otherlv_12= 'THEN' ( ( (lv_subs_13_0= ruleBSubstitution ) ) (otherlv_14= '||' ( (lv_subs_15_0= ruleBSubstitution ) ) )* ) otherlv_16= 'END' ) ;
    public final EObject ruleBAnyBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varList_1_0=null;
        Token otherlv_2=null;
        Token lv_varList_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_varTyping_5_0 = null;

        EObject lv_varTyping_7_0 = null;

        EObject lv_pres_9_0 = null;

        EObject lv_pres_11_0 = null;

        EObject lv_subs_13_0 = null;

        EObject lv_subs_15_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:1300:2: ( (otherlv_0= 'ANY' ( ( (lv_varList_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_varList_3_0= RULE_ID ) ) )* ) otherlv_4= 'WHERE' ( ( (lv_varTyping_5_0= ruleBParameterTyping ) ) (otherlv_6= '&' ( (lv_varTyping_7_0= ruleBParameterTyping ) ) )* ) (otherlv_8= '&' )? ( (lv_pres_9_0= ruleBPredicate ) ) (otherlv_10= '&' ( (lv_pres_11_0= ruleBPredicate ) ) )* otherlv_12= 'THEN' ( ( (lv_subs_13_0= ruleBSubstitution ) ) (otherlv_14= '||' ( (lv_subs_15_0= ruleBSubstitution ) ) )* ) otherlv_16= 'END' ) )
            // InternalBSQLLog2Java.g:1301:2: (otherlv_0= 'ANY' ( ( (lv_varList_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_varList_3_0= RULE_ID ) ) )* ) otherlv_4= 'WHERE' ( ( (lv_varTyping_5_0= ruleBParameterTyping ) ) (otherlv_6= '&' ( (lv_varTyping_7_0= ruleBParameterTyping ) ) )* ) (otherlv_8= '&' )? ( (lv_pres_9_0= ruleBPredicate ) ) (otherlv_10= '&' ( (lv_pres_11_0= ruleBPredicate ) ) )* otherlv_12= 'THEN' ( ( (lv_subs_13_0= ruleBSubstitution ) ) (otherlv_14= '||' ( (lv_subs_15_0= ruleBSubstitution ) ) )* ) otherlv_16= 'END' )
            {
            // InternalBSQLLog2Java.g:1301:2: (otherlv_0= 'ANY' ( ( (lv_varList_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_varList_3_0= RULE_ID ) ) )* ) otherlv_4= 'WHERE' ( ( (lv_varTyping_5_0= ruleBParameterTyping ) ) (otherlv_6= '&' ( (lv_varTyping_7_0= ruleBParameterTyping ) ) )* ) (otherlv_8= '&' )? ( (lv_pres_9_0= ruleBPredicate ) ) (otherlv_10= '&' ( (lv_pres_11_0= ruleBPredicate ) ) )* otherlv_12= 'THEN' ( ( (lv_subs_13_0= ruleBSubstitution ) ) (otherlv_14= '||' ( (lv_subs_15_0= ruleBSubstitution ) ) )* ) otherlv_16= 'END' )
            // InternalBSQLLog2Java.g:1302:3: otherlv_0= 'ANY' ( ( (lv_varList_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_varList_3_0= RULE_ID ) ) )* ) otherlv_4= 'WHERE' ( ( (lv_varTyping_5_0= ruleBParameterTyping ) ) (otherlv_6= '&' ( (lv_varTyping_7_0= ruleBParameterTyping ) ) )* ) (otherlv_8= '&' )? ( (lv_pres_9_0= ruleBPredicate ) ) (otherlv_10= '&' ( (lv_pres_11_0= ruleBPredicate ) ) )* otherlv_12= 'THEN' ( ( (lv_subs_13_0= ruleBSubstitution ) ) (otherlv_14= '||' ( (lv_subs_15_0= ruleBSubstitution ) ) )* ) otherlv_16= 'END'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBAnyBlockAccess().getANYKeyword_0());
            		
            // InternalBSQLLog2Java.g:1306:3: ( ( (lv_varList_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_varList_3_0= RULE_ID ) ) )* )
            // InternalBSQLLog2Java.g:1307:4: ( (lv_varList_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_varList_3_0= RULE_ID ) ) )*
            {
            // InternalBSQLLog2Java.g:1307:4: ( (lv_varList_1_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1308:5: (lv_varList_1_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1308:5: (lv_varList_1_0= RULE_ID )
            // InternalBSQLLog2Java.g:1309:6: lv_varList_1_0= RULE_ID
            {
            lv_varList_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            						newLeafNode(lv_varList_1_0, grammarAccess.getBAnyBlockAccess().getVarListIDTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getBAnyBlockRule());
            						}
            						addWithLastConsumed(
            							current,
            							"varList",
            							lv_varList_1_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            // InternalBSQLLog2Java.g:1325:4: (otherlv_2= ',' ( (lv_varList_3_0= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1326:5: otherlv_2= ',' ( (lv_varList_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getBAnyBlockAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalBSQLLog2Java.g:1330:5: ( (lv_varList_3_0= RULE_ID ) )
            	    // InternalBSQLLog2Java.g:1331:6: (lv_varList_3_0= RULE_ID )
            	    {
            	    // InternalBSQLLog2Java.g:1331:6: (lv_varList_3_0= RULE_ID )
            	    // InternalBSQLLog2Java.g:1332:7: lv_varList_3_0= RULE_ID
            	    {
            	    lv_varList_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    							newLeafNode(lv_varList_3_0, grammarAccess.getBAnyBlockAccess().getVarListIDTerminalRuleCall_1_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getBAnyBlockRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"varList",
            	    								lv_varList_3_0,
            	    								"org.eclipse.xtext.common.Terminals.ID");
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBAnyBlockAccess().getWHEREKeyword_2());
            		
            // InternalBSQLLog2Java.g:1354:3: ( ( (lv_varTyping_5_0= ruleBParameterTyping ) ) (otherlv_6= '&' ( (lv_varTyping_7_0= ruleBParameterTyping ) ) )* )
            // InternalBSQLLog2Java.g:1355:4: ( (lv_varTyping_5_0= ruleBParameterTyping ) ) (otherlv_6= '&' ( (lv_varTyping_7_0= ruleBParameterTyping ) ) )*
            {
            // InternalBSQLLog2Java.g:1355:4: ( (lv_varTyping_5_0= ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:1356:5: (lv_varTyping_5_0= ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:1356:5: (lv_varTyping_5_0= ruleBParameterTyping )
            // InternalBSQLLog2Java.g:1357:6: lv_varTyping_5_0= ruleBParameterTyping
            {

            						newCompositeNode(grammarAccess.getBAnyBlockAccess().getVarTypingBParameterTypingParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_31);
            lv_varTyping_5_0=ruleBParameterTyping();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBAnyBlockRule());
            						}
            						add(
            							current,
            							"varTyping",
            							lv_varTyping_5_0,
            							"bsqllog2java.BSQLLog2Java.BParameterTyping");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBSQLLog2Java.g:1374:4: (otherlv_6= '&' ( (lv_varTyping_7_0= ruleBParameterTyping ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_ID) ) {
                        int LA17_3 = input.LA(3);

                        if ( (LA17_3==26) ) {
                            alt17=1;
                        }


                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1375:5: otherlv_6= '&' ( (lv_varTyping_7_0= ruleBParameterTyping ) )
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_3); 

            	    					newLeafNode(otherlv_6, grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_3_1_0());
            	    				
            	    // InternalBSQLLog2Java.g:1379:5: ( (lv_varTyping_7_0= ruleBParameterTyping ) )
            	    // InternalBSQLLog2Java.g:1380:6: (lv_varTyping_7_0= ruleBParameterTyping )
            	    {
            	    // InternalBSQLLog2Java.g:1380:6: (lv_varTyping_7_0= ruleBParameterTyping )
            	    // InternalBSQLLog2Java.g:1381:7: lv_varTyping_7_0= ruleBParameterTyping
            	    {

            	    							newCompositeNode(grammarAccess.getBAnyBlockAccess().getVarTypingBParameterTypingParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_31);
            	    lv_varTyping_7_0=ruleBParameterTyping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBAnyBlockRule());
            	    							}
            	    							add(
            	    								current,
            	    								"varTyping",
            	    								lv_varTyping_7_0,
            	    								"bsqllog2java.BSQLLog2Java.BParameterTyping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            // InternalBSQLLog2Java.g:1400:3: (otherlv_8= '&' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBSQLLog2Java.g:1401:4: otherlv_8= '&'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_4());
                    			

                    }
                    break;

            }

            // InternalBSQLLog2Java.g:1406:3: ( (lv_pres_9_0= ruleBPredicate ) )
            // InternalBSQLLog2Java.g:1407:4: (lv_pres_9_0= ruleBPredicate )
            {
            // InternalBSQLLog2Java.g:1407:4: (lv_pres_9_0= ruleBPredicate )
            // InternalBSQLLog2Java.g:1408:5: lv_pres_9_0= ruleBPredicate
            {

            					newCompositeNode(grammarAccess.getBAnyBlockAccess().getPresBPredicateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_pres_9_0=ruleBPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBAnyBlockRule());
            					}
            					add(
            						current,
            						"pres",
            						lv_pres_9_0,
            						"bsqllog2java.BSQLLog2Java.BPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSQLLog2Java.g:1425:3: (otherlv_10= '&' ( (lv_pres_11_0= ruleBPredicate ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1426:4: otherlv_10= '&' ( (lv_pres_11_0= ruleBPredicate ) )
            	    {
            	    otherlv_10=(Token)match(input,32,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_6_0());
            	    			
            	    // InternalBSQLLog2Java.g:1430:4: ( (lv_pres_11_0= ruleBPredicate ) )
            	    // InternalBSQLLog2Java.g:1431:5: (lv_pres_11_0= ruleBPredicate )
            	    {
            	    // InternalBSQLLog2Java.g:1431:5: (lv_pres_11_0= ruleBPredicate )
            	    // InternalBSQLLog2Java.g:1432:6: lv_pres_11_0= ruleBPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getBAnyBlockAccess().getPresBPredicateParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_pres_11_0=ruleBPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBAnyBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pres",
            	    							lv_pres_11_0,
            	    							"bsqllog2java.BSQLLog2Java.BPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_12=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getBAnyBlockAccess().getTHENKeyword_7());
            		
            // InternalBSQLLog2Java.g:1454:3: ( ( (lv_subs_13_0= ruleBSubstitution ) ) (otherlv_14= '||' ( (lv_subs_15_0= ruleBSubstitution ) ) )* )
            // InternalBSQLLog2Java.g:1455:4: ( (lv_subs_13_0= ruleBSubstitution ) ) (otherlv_14= '||' ( (lv_subs_15_0= ruleBSubstitution ) ) )*
            {
            // InternalBSQLLog2Java.g:1455:4: ( (lv_subs_13_0= ruleBSubstitution ) )
            // InternalBSQLLog2Java.g:1456:5: (lv_subs_13_0= ruleBSubstitution )
            {
            // InternalBSQLLog2Java.g:1456:5: (lv_subs_13_0= ruleBSubstitution )
            // InternalBSQLLog2Java.g:1457:6: lv_subs_13_0= ruleBSubstitution
            {

            						newCompositeNode(grammarAccess.getBAnyBlockAccess().getSubsBSubstitutionParserRuleCall_8_0_0());
            					
            pushFollow(FOLLOW_32);
            lv_subs_13_0=ruleBSubstitution();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBAnyBlockRule());
            						}
            						add(
            							current,
            							"subs",
            							lv_subs_13_0,
            							"bsqllog2java.BSQLLog2Java.BSubstitution");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBSQLLog2Java.g:1474:4: (otherlv_14= '||' ( (lv_subs_15_0= ruleBSubstitution ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1475:5: otherlv_14= '||' ( (lv_subs_15_0= ruleBSubstitution ) )
            	    {
            	    otherlv_14=(Token)match(input,39,FOLLOW_3); 

            	    					newLeafNode(otherlv_14, grammarAccess.getBAnyBlockAccess().getVerticalLineVerticalLineKeyword_8_1_0());
            	    				
            	    // InternalBSQLLog2Java.g:1479:5: ( (lv_subs_15_0= ruleBSubstitution ) )
            	    // InternalBSQLLog2Java.g:1480:6: (lv_subs_15_0= ruleBSubstitution )
            	    {
            	    // InternalBSQLLog2Java.g:1480:6: (lv_subs_15_0= ruleBSubstitution )
            	    // InternalBSQLLog2Java.g:1481:7: lv_subs_15_0= ruleBSubstitution
            	    {

            	    							newCompositeNode(grammarAccess.getBAnyBlockAccess().getSubsBSubstitutionParserRuleCall_8_1_1_0());
            	    						
            	    pushFollow(FOLLOW_32);
            	    lv_subs_15_0=ruleBSubstitution();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBAnyBlockRule());
            	    							}
            	    							add(
            	    								current,
            	    								"subs",
            	    								lv_subs_15_0,
            	    								"bsqllog2java.BSQLLog2Java.BSubstitution");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            otherlv_16=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getBAnyBlockAccess().getENDKeyword_9());
            		

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
    // $ANTLR end "ruleBAnyBlock"


    // $ANTLR start "entryRuleVoidOperation"
    // InternalBSQLLog2Java.g:1508:1: entryRuleVoidOperation returns [EObject current=null] : iv_ruleVoidOperation= ruleVoidOperation EOF ;
    public final EObject entryRuleVoidOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidOperation = null;


        try {
            // InternalBSQLLog2Java.g:1508:54: (iv_ruleVoidOperation= ruleVoidOperation EOF )
            // InternalBSQLLog2Java.g:1509:2: iv_ruleVoidOperation= ruleVoidOperation EOF
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
    // InternalBSQLLog2Java.g:1515:1: ruleVoidOperation returns [EObject current=null] : ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_pTyping_8_0= ruleBParameterTyping ) ) (otherlv_9= '&' ( (lv_pTyping_10_0= ruleBParameterTyping ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) ) (otherlv_13= '||' ( (lv_subs_14_0= ruleBSubstitution ) ) )* otherlv_15= 'END' ) ;
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
        EObject lv_pTyping_8_0 = null;

        EObject lv_pTyping_10_0 = null;

        EObject lv_subs_12_0 = null;

        EObject lv_subs_14_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:1521:2: ( ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_pTyping_8_0= ruleBParameterTyping ) ) (otherlv_9= '&' ( (lv_pTyping_10_0= ruleBParameterTyping ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) ) (otherlv_13= '||' ( (lv_subs_14_0= ruleBSubstitution ) ) )* otherlv_15= 'END' ) )
            // InternalBSQLLog2Java.g:1522:2: ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_pTyping_8_0= ruleBParameterTyping ) ) (otherlv_9= '&' ( (lv_pTyping_10_0= ruleBParameterTyping ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) ) (otherlv_13= '||' ( (lv_subs_14_0= ruleBSubstitution ) ) )* otherlv_15= 'END' )
            {
            // InternalBSQLLog2Java.g:1522:2: ( ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_pTyping_8_0= ruleBParameterTyping ) ) (otherlv_9= '&' ( (lv_pTyping_10_0= ruleBParameterTyping ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) ) (otherlv_13= '||' ( (lv_subs_14_0= ruleBSubstitution ) ) )* otherlv_15= 'END' )
            // InternalBSQLLog2Java.g:1523:3: ( (lv_op_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '=' otherlv_7= 'PRE' ( ( (lv_pTyping_8_0= ruleBParameterTyping ) ) (otherlv_9= '&' ( (lv_pTyping_10_0= ruleBParameterTyping ) ) )* ) otherlv_11= 'THEN' ( (lv_subs_12_0= ruleBSubstitution ) ) (otherlv_13= '||' ( (lv_subs_14_0= ruleBSubstitution ) ) )* otherlv_15= 'END'
            {
            // InternalBSQLLog2Java.g:1523:3: ( (lv_op_name_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1524:4: (lv_op_name_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1524:4: (lv_op_name_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:1525:5: lv_op_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBSQLLog2Java.g:1545:3: ( ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBSQLLog2Java.g:1546:4: ( (lv_pList_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )*
                    {
                    // InternalBSQLLog2Java.g:1546:4: ( (lv_pList_2_0= RULE_ID ) )
                    // InternalBSQLLog2Java.g:1547:5: (lv_pList_2_0= RULE_ID )
                    {
                    // InternalBSQLLog2Java.g:1547:5: (lv_pList_2_0= RULE_ID )
                    // InternalBSQLLog2Java.g:1548:6: lv_pList_2_0= RULE_ID
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

                    // InternalBSQLLog2Java.g:1564:4: (otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalBSQLLog2Java.g:1565:5: otherlv_3= ',' ( (lv_pList_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVoidOperationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalBSQLLog2Java.g:1569:5: ( (lv_pList_4_0= RULE_ID ) )
                    	    // InternalBSQLLog2Java.g:1570:6: (lv_pList_4_0= RULE_ID )
                    	    {
                    	    // InternalBSQLLog2Java.g:1570:6: (lv_pList_4_0= RULE_ID )
                    	    // InternalBSQLLog2Java.g:1571:7: lv_pList_4_0= RULE_ID
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getVoidOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getVoidOperationAccess().getEqualsSignKeyword_4());
            		
            otherlv_7=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getVoidOperationAccess().getPREKeyword_5());
            		
            // InternalBSQLLog2Java.g:1601:3: ( ( (lv_pTyping_8_0= ruleBParameterTyping ) ) (otherlv_9= '&' ( (lv_pTyping_10_0= ruleBParameterTyping ) ) )* )
            // InternalBSQLLog2Java.g:1602:4: ( (lv_pTyping_8_0= ruleBParameterTyping ) ) (otherlv_9= '&' ( (lv_pTyping_10_0= ruleBParameterTyping ) ) )*
            {
            // InternalBSQLLog2Java.g:1602:4: ( (lv_pTyping_8_0= ruleBParameterTyping ) )
            // InternalBSQLLog2Java.g:1603:5: (lv_pTyping_8_0= ruleBParameterTyping )
            {
            // InternalBSQLLog2Java.g:1603:5: (lv_pTyping_8_0= ruleBParameterTyping )
            // InternalBSQLLog2Java.g:1604:6: lv_pTyping_8_0= ruleBParameterTyping
            {

            						newCompositeNode(grammarAccess.getVoidOperationAccess().getPTypingBParameterTypingParserRuleCall_6_0_0());
            					
            pushFollow(FOLLOW_21);
            lv_pTyping_8_0=ruleBParameterTyping();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            						}
            						add(
            							current,
            							"pTyping",
            							lv_pTyping_8_0,
            							"bsqllog2java.BSQLLog2Java.BParameterTyping");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBSQLLog2Java.g:1621:4: (otherlv_9= '&' ( (lv_pTyping_10_0= ruleBParameterTyping ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1622:5: otherlv_9= '&' ( (lv_pTyping_10_0= ruleBParameterTyping ) )
            	    {
            	    otherlv_9=(Token)match(input,32,FOLLOW_3); 

            	    					newLeafNode(otherlv_9, grammarAccess.getVoidOperationAccess().getAmpersandKeyword_6_1_0());
            	    				
            	    // InternalBSQLLog2Java.g:1626:5: ( (lv_pTyping_10_0= ruleBParameterTyping ) )
            	    // InternalBSQLLog2Java.g:1627:6: (lv_pTyping_10_0= ruleBParameterTyping )
            	    {
            	    // InternalBSQLLog2Java.g:1627:6: (lv_pTyping_10_0= ruleBParameterTyping )
            	    // InternalBSQLLog2Java.g:1628:7: lv_pTyping_10_0= ruleBParameterTyping
            	    {

            	    							newCompositeNode(grammarAccess.getVoidOperationAccess().getPTypingBParameterTypingParserRuleCall_6_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_pTyping_10_0=ruleBParameterTyping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"pTyping",
            	    								lv_pTyping_10_0,
            	    								"bsqllog2java.BSQLLog2Java.BParameterTyping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            otherlv_11=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getVoidOperationAccess().getTHENKeyword_7());
            		
            // InternalBSQLLog2Java.g:1651:3: ( (lv_subs_12_0= ruleBSubstitution ) )
            // InternalBSQLLog2Java.g:1652:4: (lv_subs_12_0= ruleBSubstitution )
            {
            // InternalBSQLLog2Java.g:1652:4: (lv_subs_12_0= ruleBSubstitution )
            // InternalBSQLLog2Java.g:1653:5: lv_subs_12_0= ruleBSubstitution
            {

            					newCompositeNode(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_32);
            lv_subs_12_0=ruleBSubstitution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            					}
            					add(
            						current,
            						"subs",
            						lv_subs_12_0,
            						"bsqllog2java.BSQLLog2Java.BSubstitution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSQLLog2Java.g:1670:3: (otherlv_13= '||' ( (lv_subs_14_0= ruleBSubstitution ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:1671:4: otherlv_13= '||' ( (lv_subs_14_0= ruleBSubstitution ) )
            	    {
            	    otherlv_13=(Token)match(input,39,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getVoidOperationAccess().getVerticalLineVerticalLineKeyword_9_0());
            	    			
            	    // InternalBSQLLog2Java.g:1675:4: ( (lv_subs_14_0= ruleBSubstitution ) )
            	    // InternalBSQLLog2Java.g:1676:5: (lv_subs_14_0= ruleBSubstitution )
            	    {
            	    // InternalBSQLLog2Java.g:1676:5: (lv_subs_14_0= ruleBSubstitution )
            	    // InternalBSQLLog2Java.g:1677:6: lv_subs_14_0= ruleBSubstitution
            	    {

            	    						newCompositeNode(grammarAccess.getVoidOperationAccess().getSubsBSubstitutionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_subs_14_0=ruleBSubstitution();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVoidOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subs",
            	    							lv_subs_14_0,
            	    							"bsqllog2java.BSQLLog2Java.BSubstitution");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_15=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getVoidOperationAccess().getENDKeyword_10());
            		

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
    // InternalBSQLLog2Java.g:1703:1: entryRuleBPredicate returns [EObject current=null] : iv_ruleBPredicate= ruleBPredicate EOF ;
    public final EObject entryRuleBPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBPredicate = null;


        try {
            // InternalBSQLLog2Java.g:1703:51: (iv_ruleBPredicate= ruleBPredicate EOF )
            // InternalBSQLLog2Java.g:1704:2: iv_ruleBPredicate= ruleBPredicate EOF
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
    // InternalBSQLLog2Java.g:1710:1: ruleBPredicate returns [EObject current=null] : ( () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) ) ) ;
    public final EObject ruleBPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_PLeft_1_0 = null;

        AntlrDatatypeRuleToken lv_PRight_3_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:1716:2: ( ( () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) ) ) )
            // InternalBSQLLog2Java.g:1717:2: ( () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) ) )
            {
            // InternalBSQLLog2Java.g:1717:2: ( () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) ) )
            // InternalBSQLLog2Java.g:1718:3: () ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) )
            {
            // InternalBSQLLog2Java.g:1718:3: ()
            // InternalBSQLLog2Java.g:1719:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBPredicateAccess().getBPredicateAction_0(),
            					current);
            			

            }

            // InternalBSQLLog2Java.g:1725:3: ( ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) ) )
            // InternalBSQLLog2Java.g:1726:4: ( (lv_PLeft_1_0= ruleSQLCall ) ) otherlv_2= '=' ( (lv_PRight_3_0= ruleBValue ) )
            {
            // InternalBSQLLog2Java.g:1726:4: ( (lv_PLeft_1_0= ruleSQLCall ) )
            // InternalBSQLLog2Java.g:1727:5: (lv_PLeft_1_0= ruleSQLCall )
            {
            // InternalBSQLLog2Java.g:1727:5: (lv_PLeft_1_0= ruleSQLCall )
            // InternalBSQLLog2Java.g:1728:6: lv_PLeft_1_0= ruleSQLCall
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
            							"bsqllog2java.BSQLLog2Java.SQLCall");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_33); 

            				newLeafNode(otherlv_2, grammarAccess.getBPredicateAccess().getEqualsSignKeyword_1_1());
            			
            // InternalBSQLLog2Java.g:1749:4: ( (lv_PRight_3_0= ruleBValue ) )
            // InternalBSQLLog2Java.g:1750:5: (lv_PRight_3_0= ruleBValue )
            {
            // InternalBSQLLog2Java.g:1750:5: (lv_PRight_3_0= ruleBValue )
            // InternalBSQLLog2Java.g:1751:6: lv_PRight_3_0= ruleBValue
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
            							"bsqllog2java.BSQLLog2Java.BValue");
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
    // InternalBSQLLog2Java.g:1773:1: entryRuleSQLCall returns [EObject current=null] : iv_ruleSQLCall= ruleSQLCall EOF ;
    public final EObject entryRuleSQLCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQLCall = null;


        try {
            // InternalBSQLLog2Java.g:1773:48: (iv_ruleSQLCall= ruleSQLCall EOF )
            // InternalBSQLLog2Java.g:1774:2: iv_ruleSQLCall= ruleSQLCall EOF
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
    // InternalBSQLLog2Java.g:1780:1: ruleSQLCall returns [EObject current=null] : ( ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSQLCall() throws RecognitionException {
        EObject current = null;

        Token lv_SLeft_0_0=null;
        Token otherlv_1=null;
        Token lv_SRight_2_0=null;


        	enterRule();

        try {
            // InternalBSQLLog2Java.g:1786:2: ( ( ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) ) ) )
            // InternalBSQLLog2Java.g:1787:2: ( ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) ) )
            {
            // InternalBSQLLog2Java.g:1787:2: ( ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) ) )
            // InternalBSQLLog2Java.g:1788:3: ( (lv_SLeft_0_0= RULE_ID ) ) otherlv_1= '\\'' ( (lv_SRight_2_0= RULE_ID ) )
            {
            // InternalBSQLLog2Java.g:1788:3: ( (lv_SLeft_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1789:4: (lv_SLeft_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1789:4: (lv_SLeft_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:1790:5: lv_SLeft_0_0= RULE_ID
            {
            lv_SLeft_0_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSQLCallAccess().getApostropheKeyword_1());
            		
            // InternalBSQLLog2Java.g:1810:3: ( (lv_SRight_2_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1811:4: (lv_SRight_2_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1811:4: (lv_SRight_2_0= RULE_ID )
            // InternalBSQLLog2Java.g:1812:5: lv_SRight_2_0= RULE_ID
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
    // InternalBSQLLog2Java.g:1832:1: entryRuleTableInstance returns [EObject current=null] : iv_ruleTableInstance= ruleTableInstance EOF ;
    public final EObject entryRuleTableInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableInstance = null;


        try {
            // InternalBSQLLog2Java.g:1832:54: (iv_ruleTableInstance= ruleTableInstance EOF )
            // InternalBSQLLog2Java.g:1833:2: iv_ruleTableInstance= ruleTableInstance EOF
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
    // InternalBSQLLog2Java.g:1839:1: ruleTableInstance returns [EObject current=null] : ( ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) ) ) ;
    public final EObject ruleTableInstance() throws RecognitionException {
        EObject current = null;

        Token lv_ti_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_ti_type_2_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:1845:2: ( ( ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) ) ) )
            // InternalBSQLLog2Java.g:1846:2: ( ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) ) )
            {
            // InternalBSQLLog2Java.g:1846:2: ( ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) ) )
            // InternalBSQLLog2Java.g:1847:3: ( (lv_ti_name_0_0= RULE_ID ) ) otherlv_1= '.(' ( (lv_ti_type_2_0= ruleTIAssignment ) )
            {
            // InternalBSQLLog2Java.g:1847:3: ( (lv_ti_name_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1848:4: (lv_ti_name_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1848:4: (lv_ti_name_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:1849:5: lv_ti_name_0_0= RULE_ID
            {
            lv_ti_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTableInstanceAccess().getFullStopLeftParenthesisKeyword_1());
            		
            // InternalBSQLLog2Java.g:1869:3: ( (lv_ti_type_2_0= ruleTIAssignment ) )
            // InternalBSQLLog2Java.g:1870:4: (lv_ti_type_2_0= ruleTIAssignment )
            {
            // InternalBSQLLog2Java.g:1870:4: (lv_ti_type_2_0= ruleTIAssignment )
            // InternalBSQLLog2Java.g:1871:5: lv_ti_type_2_0= ruleTIAssignment
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
            						"bsqllog2java.BSQLLog2Java.TIAssignment");
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
    // InternalBSQLLog2Java.g:1892:1: entryRuleTIAssignment returns [EObject current=null] : iv_ruleTIAssignment= ruleTIAssignment EOF ;
    public final EObject entryRuleTIAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTIAssignment = null;


        try {
            // InternalBSQLLog2Java.g:1892:53: (iv_ruleTIAssignment= ruleTIAssignment EOF )
            // InternalBSQLLog2Java.g:1893:2: iv_ruleTIAssignment= ruleTIAssignment EOF
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
    // InternalBSQLLog2Java.g:1899:1: ruleTIAssignment returns [EObject current=null] : ( ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTIAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_instance_name_0_0=null;
        Token otherlv_1=null;
        Token lv_instance_type_2_0=null;


        	enterRule();

        try {
            // InternalBSQLLog2Java.g:1905:2: ( ( ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) ) ) )
            // InternalBSQLLog2Java.g:1906:2: ( ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) ) )
            {
            // InternalBSQLLog2Java.g:1906:2: ( ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) ) )
            // InternalBSQLLog2Java.g:1907:3: ( (lv_instance_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instance_type_2_0= RULE_ID ) )
            {
            // InternalBSQLLog2Java.g:1907:3: ( (lv_instance_name_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1908:4: (lv_instance_name_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1908:4: (lv_instance_name_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:1909:5: lv_instance_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTIAssignmentAccess().getColonKeyword_1());
            		
            // InternalBSQLLog2Java.g:1929:3: ( (lv_instance_type_2_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1930:4: (lv_instance_type_2_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1930:4: (lv_instance_type_2_0= RULE_ID )
            // InternalBSQLLog2Java.g:1931:5: lv_instance_type_2_0= RULE_ID
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


    // $ANTLR start "entryRuleBParameterTyping"
    // InternalBSQLLog2Java.g:1951:1: entryRuleBParameterTyping returns [EObject current=null] : iv_ruleBParameterTyping= ruleBParameterTyping EOF ;
    public final EObject entryRuleBParameterTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBParameterTyping = null;


        try {
            // InternalBSQLLog2Java.g:1951:57: (iv_ruleBParameterTyping= ruleBParameterTyping EOF )
            // InternalBSQLLog2Java.g:1952:2: iv_ruleBParameterTyping= ruleBParameterTyping EOF
            {
             newCompositeNode(grammarAccess.getBParameterTypingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBParameterTyping=ruleBParameterTyping();

            state._fsp--;

             current =iv_ruleBParameterTyping; 
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
    // $ANTLR end "entryRuleBParameterTyping"


    // $ANTLR start "ruleBParameterTyping"
    // InternalBSQLLog2Java.g:1958:1: ruleBParameterTyping returns [EObject current=null] : ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) ;
    public final EObject ruleBParameterTyping() throws RecognitionException {
        EObject current = null;

        Token lv_p_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:1964:2: ( ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) ) )
            // InternalBSQLLog2Java.g:1965:2: ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            {
            // InternalBSQLLog2Java.g:1965:2: ( ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) ) )
            // InternalBSQLLog2Java.g:1966:3: ( (lv_p_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBType ) )
            {
            // InternalBSQLLog2Java.g:1966:3: ( (lv_p_name_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:1967:4: (lv_p_name_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:1967:4: (lv_p_name_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:1968:5: lv_p_name_0_0= RULE_ID
            {
            lv_p_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_p_name_0_0, grammarAccess.getBParameterTypingAccess().getP_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBParameterTypingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"p_name",
            						lv_p_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBParameterTypingAccess().getColonKeyword_1());
            		
            // InternalBSQLLog2Java.g:1988:3: ( (lv_type_2_0= ruleBType ) )
            // InternalBSQLLog2Java.g:1989:4: (lv_type_2_0= ruleBType )
            {
            // InternalBSQLLog2Java.g:1989:4: (lv_type_2_0= ruleBType )
            // InternalBSQLLog2Java.g:1990:5: lv_type_2_0= ruleBType
            {

            					newCompositeNode(grammarAccess.getBParameterTypingAccess().getTypeBTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleBType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBParameterTypingRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"bsqllog2java.BSQLLog2Java.BType");
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
    // $ANTLR end "ruleBParameterTyping"


    // $ANTLR start "entryRuleBSubstitution"
    // InternalBSQLLog2Java.g:2011:1: entryRuleBSubstitution returns [EObject current=null] : iv_ruleBSubstitution= ruleBSubstitution EOF ;
    public final EObject entryRuleBSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSubstitution = null;


        try {
            // InternalBSQLLog2Java.g:2011:54: (iv_ruleBSubstitution= ruleBSubstitution EOF )
            // InternalBSQLLog2Java.g:2012:2: iv_ruleBSubstitution= ruleBSubstitution EOF
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
    // InternalBSQLLog2Java.g:2018:1: ruleBSubstitution returns [EObject current=null] : ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( ( (lv_pright_2_0= ruleBPredicate ) ) | ( (lv_uright_3_0= ruleBUnion ) ) | ( (lv_sright_4_0= ruleSQLCall ) ) ) ) ;
    public final EObject ruleBSubstitution() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        EObject lv_pright_2_0 = null;

        EObject lv_uright_3_0 = null;

        EObject lv_sright_4_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:2024:2: ( ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( ( (lv_pright_2_0= ruleBPredicate ) ) | ( (lv_uright_3_0= ruleBUnion ) ) | ( (lv_sright_4_0= ruleSQLCall ) ) ) ) )
            // InternalBSQLLog2Java.g:2025:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( ( (lv_pright_2_0= ruleBPredicate ) ) | ( (lv_uright_3_0= ruleBUnion ) ) | ( (lv_sright_4_0= ruleSQLCall ) ) ) )
            {
            // InternalBSQLLog2Java.g:2025:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( ( (lv_pright_2_0= ruleBPredicate ) ) | ( (lv_uright_3_0= ruleBUnion ) ) | ( (lv_sright_4_0= ruleSQLCall ) ) ) )
            // InternalBSQLLog2Java.g:2026:3: ( (lv_left_0_0= RULE_ID ) ) otherlv_1= ':=' ( ( (lv_pright_2_0= ruleBPredicate ) ) | ( (lv_uright_3_0= ruleBUnion ) ) | ( (lv_sright_4_0= ruleSQLCall ) ) )
            {
            // InternalBSQLLog2Java.g:2026:3: ( (lv_left_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:2027:4: (lv_left_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:2027:4: (lv_left_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:2028:5: lv_left_0_0= RULE_ID
            {
            lv_left_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBSubstitutionAccess().getColonEqualsSignKeyword_1());
            		
            // InternalBSQLLog2Java.g:2048:3: ( ( (lv_pright_2_0= ruleBPredicate ) ) | ( (lv_uright_3_0= ruleBUnion ) ) | ( (lv_sright_4_0= ruleSQLCall ) ) )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==42) ) {
                    alt25=2;
                }
                else if ( (LA25_1==40) ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3==RULE_ID) ) {
                        int LA25_4 = input.LA(4);

                        if ( (LA25_4==30) ) {
                            alt25=1;
                        }
                        else if ( (LA25_4==EOF||LA25_4==21||LA25_4==39) ) {
                            alt25=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalBSQLLog2Java.g:2049:4: ( (lv_pright_2_0= ruleBPredicate ) )
                    {
                    // InternalBSQLLog2Java.g:2049:4: ( (lv_pright_2_0= ruleBPredicate ) )
                    // InternalBSQLLog2Java.g:2050:5: (lv_pright_2_0= ruleBPredicate )
                    {
                    // InternalBSQLLog2Java.g:2050:5: (lv_pright_2_0= ruleBPredicate )
                    // InternalBSQLLog2Java.g:2051:6: lv_pright_2_0= ruleBPredicate
                    {

                    						newCompositeNode(grammarAccess.getBSubstitutionAccess().getPrightBPredicateParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pright_2_0=ruleBPredicate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBSubstitutionRule());
                    						}
                    						set(
                    							current,
                    							"pright",
                    							lv_pright_2_0,
                    							"bsqllog2java.BSQLLog2Java.BPredicate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:2069:4: ( (lv_uright_3_0= ruleBUnion ) )
                    {
                    // InternalBSQLLog2Java.g:2069:4: ( (lv_uright_3_0= ruleBUnion ) )
                    // InternalBSQLLog2Java.g:2070:5: (lv_uright_3_0= ruleBUnion )
                    {
                    // InternalBSQLLog2Java.g:2070:5: (lv_uright_3_0= ruleBUnion )
                    // InternalBSQLLog2Java.g:2071:6: lv_uright_3_0= ruleBUnion
                    {

                    						newCompositeNode(grammarAccess.getBSubstitutionAccess().getUrightBUnionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uright_3_0=ruleBUnion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBSubstitutionRule());
                    						}
                    						set(
                    							current,
                    							"uright",
                    							lv_uright_3_0,
                    							"bsqllog2java.BSQLLog2Java.BUnion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBSQLLog2Java.g:2089:4: ( (lv_sright_4_0= ruleSQLCall ) )
                    {
                    // InternalBSQLLog2Java.g:2089:4: ( (lv_sright_4_0= ruleSQLCall ) )
                    // InternalBSQLLog2Java.g:2090:5: (lv_sright_4_0= ruleSQLCall )
                    {
                    // InternalBSQLLog2Java.g:2090:5: (lv_sright_4_0= ruleSQLCall )
                    // InternalBSQLLog2Java.g:2091:6: lv_sright_4_0= ruleSQLCall
                    {

                    						newCompositeNode(grammarAccess.getBSubstitutionAccess().getSrightSQLCallParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sright_4_0=ruleSQLCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBSubstitutionRule());
                    						}
                    						set(
                    							current,
                    							"sright",
                    							lv_sright_4_0,
                    							"bsqllog2java.BSQLLog2Java.SQLCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleBUnion"
    // InternalBSQLLog2Java.g:2113:1: entryRuleBUnion returns [EObject current=null] : iv_ruleBUnion= ruleBUnion EOF ;
    public final EObject entryRuleBUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBUnion = null;


        try {
            // InternalBSQLLog2Java.g:2113:47: (iv_ruleBUnion= ruleBUnion EOF )
            // InternalBSQLLog2Java.g:2114:2: iv_ruleBUnion= ruleBUnion EOF
            {
             newCompositeNode(grammarAccess.getBUnionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBUnion=ruleBUnion();

            state._fsp--;

             current =iv_ruleBUnion; 
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
    // $ANTLR end "entryRuleBUnion"


    // $ANTLR start "ruleBUnion"
    // InternalBSQLLog2Java.g:2120:1: ruleBUnion returns [EObject current=null] : ( ( (lv_set_0_0= ruleBSet ) ) otherlv_1= '\\\\/' ( ( (lv_addedSet_2_0= ruleBSet ) ) | ( (lv_addedE_3_0= ruleBElementStructure ) ) ) ) ;
    public final EObject ruleBUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_set_0_0 = null;

        EObject lv_addedSet_2_0 = null;

        EObject lv_addedE_3_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:2126:2: ( ( ( (lv_set_0_0= ruleBSet ) ) otherlv_1= '\\\\/' ( ( (lv_addedSet_2_0= ruleBSet ) ) | ( (lv_addedE_3_0= ruleBElementStructure ) ) ) ) )
            // InternalBSQLLog2Java.g:2127:2: ( ( (lv_set_0_0= ruleBSet ) ) otherlv_1= '\\\\/' ( ( (lv_addedSet_2_0= ruleBSet ) ) | ( (lv_addedE_3_0= ruleBElementStructure ) ) ) )
            {
            // InternalBSQLLog2Java.g:2127:2: ( ( (lv_set_0_0= ruleBSet ) ) otherlv_1= '\\\\/' ( ( (lv_addedSet_2_0= ruleBSet ) ) | ( (lv_addedE_3_0= ruleBElementStructure ) ) ) )
            // InternalBSQLLog2Java.g:2128:3: ( (lv_set_0_0= ruleBSet ) ) otherlv_1= '\\\\/' ( ( (lv_addedSet_2_0= ruleBSet ) ) | ( (lv_addedE_3_0= ruleBElementStructure ) ) )
            {
            // InternalBSQLLog2Java.g:2128:3: ( (lv_set_0_0= ruleBSet ) )
            // InternalBSQLLog2Java.g:2129:4: (lv_set_0_0= ruleBSet )
            {
            // InternalBSQLLog2Java.g:2129:4: (lv_set_0_0= ruleBSet )
            // InternalBSQLLog2Java.g:2130:5: lv_set_0_0= ruleBSet
            {

            					newCompositeNode(grammarAccess.getBUnionAccess().getSetBSetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_set_0_0=ruleBSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBUnionRule());
            					}
            					set(
            						current,
            						"set",
            						lv_set_0_0,
            						"bsqllog2java.BSQLLog2Java.BSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getBUnionAccess().getReverseSolidusSolidusKeyword_1());
            		
            // InternalBSQLLog2Java.g:2151:3: ( ( (lv_addedSet_2_0= ruleBSet ) ) | ( (lv_addedE_3_0= ruleBElementStructure ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==43) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalBSQLLog2Java.g:2152:4: ( (lv_addedSet_2_0= ruleBSet ) )
                    {
                    // InternalBSQLLog2Java.g:2152:4: ( (lv_addedSet_2_0= ruleBSet ) )
                    // InternalBSQLLog2Java.g:2153:5: (lv_addedSet_2_0= ruleBSet )
                    {
                    // InternalBSQLLog2Java.g:2153:5: (lv_addedSet_2_0= ruleBSet )
                    // InternalBSQLLog2Java.g:2154:6: lv_addedSet_2_0= ruleBSet
                    {

                    						newCompositeNode(grammarAccess.getBUnionAccess().getAddedSetBSetParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_addedSet_2_0=ruleBSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBUnionRule());
                    						}
                    						set(
                    							current,
                    							"addedSet",
                    							lv_addedSet_2_0,
                    							"bsqllog2java.BSQLLog2Java.BSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSQLLog2Java.g:2172:4: ( (lv_addedE_3_0= ruleBElementStructure ) )
                    {
                    // InternalBSQLLog2Java.g:2172:4: ( (lv_addedE_3_0= ruleBElementStructure ) )
                    // InternalBSQLLog2Java.g:2173:5: (lv_addedE_3_0= ruleBElementStructure )
                    {
                    // InternalBSQLLog2Java.g:2173:5: (lv_addedE_3_0= ruleBElementStructure )
                    // InternalBSQLLog2Java.g:2174:6: lv_addedE_3_0= ruleBElementStructure
                    {

                    						newCompositeNode(grammarAccess.getBUnionAccess().getAddedEBElementStructureParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_addedE_3_0=ruleBElementStructure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBUnionRule());
                    						}
                    						set(
                    							current,
                    							"addedE",
                    							lv_addedE_3_0,
                    							"bsqllog2java.BSQLLog2Java.BElementStructure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleBUnion"


    // $ANTLR start "entryRuleBElementStructure"
    // InternalBSQLLog2Java.g:2196:1: entryRuleBElementStructure returns [EObject current=null] : iv_ruleBElementStructure= ruleBElementStructure EOF ;
    public final EObject entryRuleBElementStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBElementStructure = null;


        try {
            // InternalBSQLLog2Java.g:2196:58: (iv_ruleBElementStructure= ruleBElementStructure EOF )
            // InternalBSQLLog2Java.g:2197:2: iv_ruleBElementStructure= ruleBElementStructure EOF
            {
             newCompositeNode(grammarAccess.getBElementStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBElementStructure=ruleBElementStructure();

            state._fsp--;

             current =iv_ruleBElementStructure; 
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
    // $ANTLR end "entryRuleBElementStructure"


    // $ANTLR start "ruleBElementStructure"
    // InternalBSQLLog2Java.g:2203:1: ruleBElementStructure returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'rec(' ( (lv_e_2_0= ruleBElement ) ) (otherlv_3= ',' ( (lv_e_4_0= ruleBElement ) ) )* otherlv_5= ')}' ) ;
    public final EObject ruleBElementStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_e_2_0 = null;

        EObject lv_e_4_0 = null;



        	enterRule();

        try {
            // InternalBSQLLog2Java.g:2209:2: ( (otherlv_0= '{' otherlv_1= 'rec(' ( (lv_e_2_0= ruleBElement ) ) (otherlv_3= ',' ( (lv_e_4_0= ruleBElement ) ) )* otherlv_5= ')}' ) )
            // InternalBSQLLog2Java.g:2210:2: (otherlv_0= '{' otherlv_1= 'rec(' ( (lv_e_2_0= ruleBElement ) ) (otherlv_3= ',' ( (lv_e_4_0= ruleBElement ) ) )* otherlv_5= ')}' )
            {
            // InternalBSQLLog2Java.g:2210:2: (otherlv_0= '{' otherlv_1= 'rec(' ( (lv_e_2_0= ruleBElement ) ) (otherlv_3= ',' ( (lv_e_4_0= ruleBElement ) ) )* otherlv_5= ')}' )
            // InternalBSQLLog2Java.g:2211:3: otherlv_0= '{' otherlv_1= 'rec(' ( (lv_e_2_0= ruleBElement ) ) (otherlv_3= ',' ( (lv_e_4_0= ruleBElement ) ) )* otherlv_5= ')}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getBElementStructureAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBElementStructureAccess().getRecKeyword_1());
            		
            // InternalBSQLLog2Java.g:2219:3: ( (lv_e_2_0= ruleBElement ) )
            // InternalBSQLLog2Java.g:2220:4: (lv_e_2_0= ruleBElement )
            {
            // InternalBSQLLog2Java.g:2220:4: (lv_e_2_0= ruleBElement )
            // InternalBSQLLog2Java.g:2221:5: lv_e_2_0= ruleBElement
            {

            					newCompositeNode(grammarAccess.getBElementStructureAccess().getEBElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_e_2_0=ruleBElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBElementStructureRule());
            					}
            					add(
            						current,
            						"e",
            						lv_e_2_0,
            						"bsqllog2java.BSQLLog2Java.BElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSQLLog2Java.g:2238:3: (otherlv_3= ',' ( (lv_e_4_0= ruleBElement ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBSQLLog2Java.g:2239:4: otherlv_3= ',' ( (lv_e_4_0= ruleBElement ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getBElementStructureAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBSQLLog2Java.g:2243:4: ( (lv_e_4_0= ruleBElement ) )
            	    // InternalBSQLLog2Java.g:2244:5: (lv_e_4_0= ruleBElement )
            	    {
            	    // InternalBSQLLog2Java.g:2244:5: (lv_e_4_0= ruleBElement )
            	    // InternalBSQLLog2Java.g:2245:6: lv_e_4_0= ruleBElement
            	    {

            	    						newCompositeNode(grammarAccess.getBElementStructureAccess().getEBElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_e_4_0=ruleBElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBElementStructureRule());
            	    						}
            	    						add(
            	    							current,
            	    							"e",
            	    							lv_e_4_0,
            	    							"bsqllog2java.BSQLLog2Java.BElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBElementStructureAccess().getRightParenthesisRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBElementStructure"


    // $ANTLR start "entryRuleBElement"
    // InternalBSQLLog2Java.g:2271:1: entryRuleBElement returns [EObject current=null] : iv_ruleBElement= ruleBElement EOF ;
    public final EObject entryRuleBElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBElement = null;


        try {
            // InternalBSQLLog2Java.g:2271:49: (iv_ruleBElement= ruleBElement EOF )
            // InternalBSQLLog2Java.g:2272:2: iv_ruleBElement= ruleBElement EOF
            {
             newCompositeNode(grammarAccess.getBElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBElement=ruleBElement();

            state._fsp--;

             current =iv_ruleBElement; 
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
    // $ANTLR end "entryRuleBElement"


    // $ANTLR start "ruleBElement"
    // InternalBSQLLog2Java.g:2278:1: ruleBElement returns [EObject current=null] : ( (lv_ename_0_0= RULE_ID ) ) ;
    public final EObject ruleBElement() throws RecognitionException {
        EObject current = null;

        Token lv_ename_0_0=null;


        	enterRule();

        try {
            // InternalBSQLLog2Java.g:2284:2: ( ( (lv_ename_0_0= RULE_ID ) ) )
            // InternalBSQLLog2Java.g:2285:2: ( (lv_ename_0_0= RULE_ID ) )
            {
            // InternalBSQLLog2Java.g:2285:2: ( (lv_ename_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:2286:3: (lv_ename_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:2286:3: (lv_ename_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:2287:4: lv_ename_0_0= RULE_ID
            {
            lv_ename_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_ename_0_0, grammarAccess.getBElementAccess().getEnameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"ename",
            					lv_ename_0_0,
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
    // $ANTLR end "ruleBElement"


    // $ANTLR start "entryRuleBSet"
    // InternalBSQLLog2Java.g:2306:1: entryRuleBSet returns [EObject current=null] : iv_ruleBSet= ruleBSet EOF ;
    public final EObject entryRuleBSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSet = null;


        try {
            // InternalBSQLLog2Java.g:2306:45: (iv_ruleBSet= ruleBSet EOF )
            // InternalBSQLLog2Java.g:2307:2: iv_ruleBSet= ruleBSet EOF
            {
             newCompositeNode(grammarAccess.getBSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSet=ruleBSet();

            state._fsp--;

             current =iv_ruleBSet; 
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
    // $ANTLR end "entryRuleBSet"


    // $ANTLR start "ruleBSet"
    // InternalBSQLLog2Java.g:2313:1: ruleBSet returns [EObject current=null] : ( (lv_set_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBSet() throws RecognitionException {
        EObject current = null;

        Token lv_set_name_0_0=null;


        	enterRule();

        try {
            // InternalBSQLLog2Java.g:2319:2: ( ( (lv_set_name_0_0= RULE_ID ) ) )
            // InternalBSQLLog2Java.g:2320:2: ( (lv_set_name_0_0= RULE_ID ) )
            {
            // InternalBSQLLog2Java.g:2320:2: ( (lv_set_name_0_0= RULE_ID ) )
            // InternalBSQLLog2Java.g:2321:3: (lv_set_name_0_0= RULE_ID )
            {
            // InternalBSQLLog2Java.g:2321:3: (lv_set_name_0_0= RULE_ID )
            // InternalBSQLLog2Java.g:2322:4: lv_set_name_0_0= RULE_ID
            {
            lv_set_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_set_name_0_0, grammarAccess.getBSetAccess().getSet_nameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBSetRule());
            				}
            				setWithLastConsumed(
            					current,
            					"set_name",
            					lv_set_name_0_0,
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
    // $ANTLR end "ruleBSet"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\4\1\30\1\4\1\uffff\1\30\1\4\1\15\1\36\1\4\1\37\1\15\1\4\1\32\1\4\1\40\2\4\1\32\2\uffff\1\4\1\40";
    static final String dfa_3s = "\1\4\1\35\1\4\1\uffff\1\30\2\31\1\36\1\4\1\37\1\31\1\4\1\32\1\4\1\41\1\4\1\45\1\32\2\uffff\1\4\1\41";
    static final String dfa_4s = "\3\uffff\1\2\16\uffff\1\3\1\1\2\uffff";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\3\4\uffff\1\2",
            "\1\4",
            "",
            "\1\5",
            "\1\6\24\uffff\1\7",
            "\1\10\13\uffff\1\7",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\10\13\uffff\1\7",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17\1\20",
            "\1\21",
            "\1\23\40\uffff\1\22",
            "\1\24",
            "",
            "",
            "\1\25",
            "\1\17\1\20"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "319:2: ( ( (lv_bops_0_0= ruleBoolOperation ) ) | ( (lv_vops_1_0= ruleVoidOperation ) ) | ( (lv_sops_2_0= ruleStringOperation ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000018000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000002000L});

}