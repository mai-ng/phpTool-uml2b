package secureuml2SQL.parser.antlr.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import secureuml2SQL.services.SecureUML2SQLGrammarAccess;



import org.antlr.runtime.*;

@SuppressWarnings("all")
public class InternalSecureUML2SQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MACHINE'", "'SETS'", "';'", "'CONSTANTS'", "','", "'PROPERTIES'", "'&'", "'END'", "'='", "'{'", "'}'", "'|->'"
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
        

    @Override
	public String[] getTokenNames() { return InternalSecureUML2SQLParser.tokenNames; }
    @Override
	public String getGrammarFileName() { return "InternalSecureUML2SQL.g"; }



     	private SecureUML2SQLGrammarAccess grammarAccess;

        public InternalSecureUML2SQLParser(TokenStream input, SecureUML2SQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SecureUML2SQL";
       	}

       	@Override
       	protected SecureUML2SQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSecureUML2SQL"
    // InternalSecureUML2SQL.g:64:1: entryRuleSecureUML2SQL returns [EObject current=null] : iv_ruleSecureUML2SQL= ruleSecureUML2SQL EOF ;
    public final EObject entryRuleSecureUML2SQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecureUML2SQL = null;


        try {
            // InternalSecureUML2SQL.g:64:54: (iv_ruleSecureUML2SQL= ruleSecureUML2SQL EOF )
            // InternalSecureUML2SQL.g:65:2: iv_ruleSecureUML2SQL= ruleSecureUML2SQL EOF
            {
             newCompositeNode(grammarAccess.getSecureUML2SQLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecureUML2SQL=ruleSecureUML2SQL();

            state._fsp--;

             current =iv_ruleSecureUML2SQL; 
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
    // $ANTLR end "entryRuleSecureUML2SQL"


    // $ANTLR start "ruleSecureUML2SQL"
    // InternalSecureUML2SQL.g:71:1: ruleSecureUML2SQL returns [EObject current=null] : this_BMachine_0= ruleBMachine ;
    public final EObject ruleSecureUML2SQL() throws RecognitionException {
        EObject current = null;

        EObject this_BMachine_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2SQL.g:77:2: (this_BMachine_0= ruleBMachine )
            // InternalSecureUML2SQL.g:78:2: this_BMachine_0= ruleBMachine
            {

            		newCompositeNode(grammarAccess.getSecureUML2SQLAccess().getBMachineParserRuleCall());
            	
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
    // $ANTLR end "ruleSecureUML2SQL"


    // $ANTLR start "entryRuleBMachine"
    // InternalSecureUML2SQL.g:89:1: entryRuleBMachine returns [EObject current=null] : iv_ruleBMachine= ruleBMachine EOF ;
    public final EObject entryRuleBMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBMachine = null;


        try {
            // InternalSecureUML2SQL.g:89:49: (iv_ruleBMachine= ruleBMachine EOF )
            // InternalSecureUML2SQL.g:90:2: iv_ruleBMachine= ruleBMachine EOF
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
    // InternalSecureUML2SQL.g:96:1: ruleBMachine returns [EObject current=null] : (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SETS' ( (lv_esets_3_0= ruleBESet ) ) (otherlv_4= ';' ( (lv_esets_5_0= ruleBESet ) ) )* otherlv_6= 'CONSTANTS' ( (lv_cons_7_0= ruleBConstant ) ) (otherlv_8= ',' ( (lv_cons_9_0= ruleBConstant ) ) )* otherlv_10= 'PROPERTIES' ( (lv_pros_11_0= ruleBProperties ) ) (otherlv_12= '&' ( (lv_pros_13_0= ruleBProperties ) ) )* otherlv_14= 'END' ) ;
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
        EObject lv_esets_3_0 = null;

        EObject lv_esets_5_0 = null;

        EObject lv_cons_7_0 = null;

        EObject lv_cons_9_0 = null;

        EObject lv_pros_11_0 = null;

        EObject lv_pros_13_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2SQL.g:102:2: ( (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SETS' ( (lv_esets_3_0= ruleBESet ) ) (otherlv_4= ';' ( (lv_esets_5_0= ruleBESet ) ) )* otherlv_6= 'CONSTANTS' ( (lv_cons_7_0= ruleBConstant ) ) (otherlv_8= ',' ( (lv_cons_9_0= ruleBConstant ) ) )* otherlv_10= 'PROPERTIES' ( (lv_pros_11_0= ruleBProperties ) ) (otherlv_12= '&' ( (lv_pros_13_0= ruleBProperties ) ) )* otherlv_14= 'END' ) )
            // InternalSecureUML2SQL.g:103:2: (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SETS' ( (lv_esets_3_0= ruleBESet ) ) (otherlv_4= ';' ( (lv_esets_5_0= ruleBESet ) ) )* otherlv_6= 'CONSTANTS' ( (lv_cons_7_0= ruleBConstant ) ) (otherlv_8= ',' ( (lv_cons_9_0= ruleBConstant ) ) )* otherlv_10= 'PROPERTIES' ( (lv_pros_11_0= ruleBProperties ) ) (otherlv_12= '&' ( (lv_pros_13_0= ruleBProperties ) ) )* otherlv_14= 'END' )
            {
            // InternalSecureUML2SQL.g:103:2: (otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SETS' ( (lv_esets_3_0= ruleBESet ) ) (otherlv_4= ';' ( (lv_esets_5_0= ruleBESet ) ) )* otherlv_6= 'CONSTANTS' ( (lv_cons_7_0= ruleBConstant ) ) (otherlv_8= ',' ( (lv_cons_9_0= ruleBConstant ) ) )* otherlv_10= 'PROPERTIES' ( (lv_pros_11_0= ruleBProperties ) ) (otherlv_12= '&' ( (lv_pros_13_0= ruleBProperties ) ) )* otherlv_14= 'END' )
            // InternalSecureUML2SQL.g:104:3: otherlv_0= 'MACHINE' ( (lv_m_name_1_0= RULE_ID ) ) otherlv_2= 'SETS' ( (lv_esets_3_0= ruleBESet ) ) (otherlv_4= ';' ( (lv_esets_5_0= ruleBESet ) ) )* otherlv_6= 'CONSTANTS' ( (lv_cons_7_0= ruleBConstant ) ) (otherlv_8= ',' ( (lv_cons_9_0= ruleBConstant ) ) )* otherlv_10= 'PROPERTIES' ( (lv_pros_11_0= ruleBProperties ) ) (otherlv_12= '&' ( (lv_pros_13_0= ruleBProperties ) ) )* otherlv_14= 'END'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBMachineAccess().getMACHINEKeyword_0());
            		
            // InternalSecureUML2SQL.g:108:3: ( (lv_m_name_1_0= RULE_ID ) )
            // InternalSecureUML2SQL.g:109:4: (lv_m_name_1_0= RULE_ID )
            {
            // InternalSecureUML2SQL.g:109:4: (lv_m_name_1_0= RULE_ID )
            // InternalSecureUML2SQL.g:110:5: lv_m_name_1_0= RULE_ID
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

            			newLeafNode(otherlv_2, grammarAccess.getBMachineAccess().getSETSKeyword_2());
            		
            // InternalSecureUML2SQL.g:130:3: ( (lv_esets_3_0= ruleBESet ) )
            // InternalSecureUML2SQL.g:131:4: (lv_esets_3_0= ruleBESet )
            {
            // InternalSecureUML2SQL.g:131:4: (lv_esets_3_0= ruleBESet )
            // InternalSecureUML2SQL.g:132:5: lv_esets_3_0= ruleBESet
            {

            					newCompositeNode(grammarAccess.getBMachineAccess().getEsetsBESetParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_esets_3_0=ruleBESet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBMachineRule());
            					}
            					add(
            						current,
            						"esets",
            						lv_esets_3_0,
            						"secureuml2SQL.SecureUML2SQL.BESet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2SQL.g:149:3: (otherlv_4= ';' ( (lv_esets_5_0= ruleBESet ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:150:4: otherlv_4= ';' ( (lv_esets_5_0= ruleBESet ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBMachineAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalSecureUML2SQL.g:154:4: ( (lv_esets_5_0= ruleBESet ) )
            	    // InternalSecureUML2SQL.g:155:5: (lv_esets_5_0= ruleBESet )
            	    {
            	    // InternalSecureUML2SQL.g:155:5: (lv_esets_5_0= ruleBESet )
            	    // InternalSecureUML2SQL.g:156:6: lv_esets_5_0= ruleBESet
            	    {

            	    						newCompositeNode(grammarAccess.getBMachineAccess().getEsetsBESetParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_esets_5_0=ruleBESet();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"esets",
            	    							lv_esets_5_0,
            	    							"secureuml2SQL.SecureUML2SQL.BESet");
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

            			newLeafNode(otherlv_6, grammarAccess.getBMachineAccess().getCONSTANTSKeyword_5());
            		
            // InternalSecureUML2SQL.g:178:3: ( (lv_cons_7_0= ruleBConstant ) )
            // InternalSecureUML2SQL.g:179:4: (lv_cons_7_0= ruleBConstant )
            {
            // InternalSecureUML2SQL.g:179:4: (lv_cons_7_0= ruleBConstant )
            // InternalSecureUML2SQL.g:180:5: lv_cons_7_0= ruleBConstant
            {

            					newCompositeNode(grammarAccess.getBMachineAccess().getConsBConstantParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_cons_7_0=ruleBConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBMachineRule());
            					}
            					add(
            						current,
            						"cons",
            						lv_cons_7_0,
            						"secureuml2SQL.SecureUML2SQL.BConstant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2SQL.g:197:3: (otherlv_8= ',' ( (lv_cons_9_0= ruleBConstant ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:198:4: otherlv_8= ',' ( (lv_cons_9_0= ruleBConstant ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getBMachineAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSecureUML2SQL.g:202:4: ( (lv_cons_9_0= ruleBConstant ) )
            	    // InternalSecureUML2SQL.g:203:5: (lv_cons_9_0= ruleBConstant )
            	    {
            	    // InternalSecureUML2SQL.g:203:5: (lv_cons_9_0= ruleBConstant )
            	    // InternalSecureUML2SQL.g:204:6: lv_cons_9_0= ruleBConstant
            	    {

            	    						newCompositeNode(grammarAccess.getBMachineAccess().getConsBConstantParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_cons_9_0=ruleBConstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cons",
            	    							lv_cons_9_0,
            	    							"secureuml2SQL.SecureUML2SQL.BConstant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getBMachineAccess().getPROPERTIESKeyword_8());
            		
            // InternalSecureUML2SQL.g:226:3: ( (lv_pros_11_0= ruleBProperties ) )
            // InternalSecureUML2SQL.g:227:4: (lv_pros_11_0= ruleBProperties )
            {
            // InternalSecureUML2SQL.g:227:4: (lv_pros_11_0= ruleBProperties )
            // InternalSecureUML2SQL.g:228:5: lv_pros_11_0= ruleBProperties
            {

            					newCompositeNode(grammarAccess.getBMachineAccess().getProsBPropertiesParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_pros_11_0=ruleBProperties();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBMachineRule());
            					}
            					add(
            						current,
            						"pros",
            						lv_pros_11_0,
            						"secureuml2SQL.SecureUML2SQL.BProperties");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2SQL.g:245:3: (otherlv_12= '&' ( (lv_pros_13_0= ruleBProperties ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:246:4: otherlv_12= '&' ( (lv_pros_13_0= ruleBProperties ) )
            	    {
            	    otherlv_12=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_12, grammarAccess.getBMachineAccess().getAmpersandKeyword_10_0());
            	    			
            	    // InternalSecureUML2SQL.g:250:4: ( (lv_pros_13_0= ruleBProperties ) )
            	    // InternalSecureUML2SQL.g:251:5: (lv_pros_13_0= ruleBProperties )
            	    {
            	    // InternalSecureUML2SQL.g:251:5: (lv_pros_13_0= ruleBProperties )
            	    // InternalSecureUML2SQL.g:252:6: lv_pros_13_0= ruleBProperties
            	    {

            	    						newCompositeNode(grammarAccess.getBMachineAccess().getProsBPropertiesParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_pros_13_0=ruleBProperties();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pros",
            	    							lv_pros_13_0,
            	    							"secureuml2SQL.SecureUML2SQL.BProperties");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getBMachineAccess().getENDKeyword_11());
            		

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


    // $ANTLR start "entryRuleBProperties"
    // InternalSecureUML2SQL.g:278:1: entryRuleBProperties returns [EObject current=null] : iv_ruleBProperties= ruleBProperties EOF ;
    public final EObject entryRuleBProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBProperties = null;


        try {
            // InternalSecureUML2SQL.g:278:52: (iv_ruleBProperties= ruleBProperties EOF )
            // InternalSecureUML2SQL.g:279:2: iv_ruleBProperties= ruleBProperties EOF
            {
             newCompositeNode(grammarAccess.getBPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBProperties=ruleBProperties();

            state._fsp--;

             current =iv_ruleBProperties; 
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
    // $ANTLR end "entryRuleBProperties"


    // $ANTLR start "ruleBProperties"
    // InternalSecureUML2SQL.g:285:1: ruleBProperties returns [EObject current=null] : ( ( (lv_cons_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_prop_2_0= '{' ) ) ( (lv_pairs_3_0= ruleBTuple ) ) (otherlv_4= ',' ( (lv_pairs_5_0= ruleBTuple ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleBProperties() throws RecognitionException {
        EObject current = null;

        Token lv_cons_0_0=null;
        Token otherlv_1=null;
        Token lv_prop_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_pairs_3_0 = null;

        EObject lv_pairs_5_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2SQL.g:291:2: ( ( ( (lv_cons_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_prop_2_0= '{' ) ) ( (lv_pairs_3_0= ruleBTuple ) ) (otherlv_4= ',' ( (lv_pairs_5_0= ruleBTuple ) ) )* otherlv_6= '}' ) )
            // InternalSecureUML2SQL.g:292:2: ( ( (lv_cons_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_prop_2_0= '{' ) ) ( (lv_pairs_3_0= ruleBTuple ) ) (otherlv_4= ',' ( (lv_pairs_5_0= ruleBTuple ) ) )* otherlv_6= '}' )
            {
            // InternalSecureUML2SQL.g:292:2: ( ( (lv_cons_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_prop_2_0= '{' ) ) ( (lv_pairs_3_0= ruleBTuple ) ) (otherlv_4= ',' ( (lv_pairs_5_0= ruleBTuple ) ) )* otherlv_6= '}' )
            // InternalSecureUML2SQL.g:293:3: ( (lv_cons_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_prop_2_0= '{' ) ) ( (lv_pairs_3_0= ruleBTuple ) ) (otherlv_4= ',' ( (lv_pairs_5_0= ruleBTuple ) ) )* otherlv_6= '}'
            {
            // InternalSecureUML2SQL.g:293:3: ( (lv_cons_0_0= RULE_ID ) )
            // InternalSecureUML2SQL.g:294:4: (lv_cons_0_0= RULE_ID )
            {
            // InternalSecureUML2SQL.g:294:4: (lv_cons_0_0= RULE_ID )
            // InternalSecureUML2SQL.g:295:5: lv_cons_0_0= RULE_ID
            {
            lv_cons_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_cons_0_0, grammarAccess.getBPropertiesAccess().getConsIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cons",
            						lv_cons_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBPropertiesAccess().getEqualsSignKeyword_1());
            		
            // InternalSecureUML2SQL.g:315:3: ( (lv_prop_2_0= '{' ) )
            // InternalSecureUML2SQL.g:316:4: (lv_prop_2_0= '{' )
            {
            // InternalSecureUML2SQL.g:316:4: (lv_prop_2_0= '{' )
            // InternalSecureUML2SQL.g:317:5: lv_prop_2_0= '{'
            {
            lv_prop_2_0=(Token)match(input,20,FOLLOW_3); 

            					newLeafNode(lv_prop_2_0, grammarAccess.getBPropertiesAccess().getPropLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBPropertiesRule());
            					}
            					setWithLastConsumed(current, "prop", lv_prop_2_0, "{");
            				

            }


            }

            // InternalSecureUML2SQL.g:329:3: ( (lv_pairs_3_0= ruleBTuple ) )
            // InternalSecureUML2SQL.g:330:4: (lv_pairs_3_0= ruleBTuple )
            {
            // InternalSecureUML2SQL.g:330:4: (lv_pairs_3_0= ruleBTuple )
            // InternalSecureUML2SQL.g:331:5: lv_pairs_3_0= ruleBTuple
            {

            					newCompositeNode(grammarAccess.getBPropertiesAccess().getPairsBTupleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_pairs_3_0=ruleBTuple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBPropertiesRule());
            					}
            					add(
            						current,
            						"pairs",
            						lv_pairs_3_0,
            						"secureuml2SQL.SecureUML2SQL.BTuple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2SQL.g:348:3: (otherlv_4= ',' ( (lv_pairs_5_0= ruleBTuple ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:349:4: otherlv_4= ',' ( (lv_pairs_5_0= ruleBTuple ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBPropertiesAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSecureUML2SQL.g:353:4: ( (lv_pairs_5_0= ruleBTuple ) )
            	    // InternalSecureUML2SQL.g:354:5: (lv_pairs_5_0= ruleBTuple )
            	    {
            	    // InternalSecureUML2SQL.g:354:5: (lv_pairs_5_0= ruleBTuple )
            	    // InternalSecureUML2SQL.g:355:6: lv_pairs_5_0= ruleBTuple
            	    {

            	    						newCompositeNode(grammarAccess.getBPropertiesAccess().getPairsBTupleParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_pairs_5_0=ruleBTuple();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBPropertiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pairs",
            	    							lv_pairs_5_0,
            	    							"secureuml2SQL.SecureUML2SQL.BTuple");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBPropertiesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBProperties"


    // $ANTLR start "entryRuleBTuple"
    // InternalSecureUML2SQL.g:381:1: entryRuleBTuple returns [EObject current=null] : iv_ruleBTuple= ruleBTuple EOF ;
    public final EObject entryRuleBTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTuple = null;


        try {
            // InternalSecureUML2SQL.g:381:47: (iv_ruleBTuple= ruleBTuple EOF )
            // InternalSecureUML2SQL.g:382:2: iv_ruleBTuple= ruleBTuple EOF
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
    // InternalSecureUML2SQL.g:388:1: ruleBTuple returns [EObject current=null] : ( ( (lv_ran_0_0= RULE_ID ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) ) ) ;
    public final EObject ruleBTuple() throws RecognitionException {
        EObject current = null;

        Token lv_ran_0_0=null;
        Token otherlv_1=null;
        Token lv_dom_2_0=null;


        	enterRule();

        try {
            // InternalSecureUML2SQL.g:394:2: ( ( ( (lv_ran_0_0= RULE_ID ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) ) ) )
            // InternalSecureUML2SQL.g:395:2: ( ( (lv_ran_0_0= RULE_ID ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) ) )
            {
            // InternalSecureUML2SQL.g:395:2: ( ( (lv_ran_0_0= RULE_ID ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) ) )
            // InternalSecureUML2SQL.g:396:3: ( (lv_ran_0_0= RULE_ID ) ) otherlv_1= '|->' ( (lv_dom_2_0= RULE_ID ) )
            {
            // InternalSecureUML2SQL.g:396:3: ( (lv_ran_0_0= RULE_ID ) )
            // InternalSecureUML2SQL.g:397:4: (lv_ran_0_0= RULE_ID )
            {
            // InternalSecureUML2SQL.g:397:4: (lv_ran_0_0= RULE_ID )
            // InternalSecureUML2SQL.g:398:5: lv_ran_0_0= RULE_ID
            {
            lv_ran_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_ran_0_0, grammarAccess.getBTupleAccess().getRanIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBTupleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ran",
            						lv_ran_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBTupleAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalSecureUML2SQL.g:418:3: ( (lv_dom_2_0= RULE_ID ) )
            // InternalSecureUML2SQL.g:419:4: (lv_dom_2_0= RULE_ID )
            {
            // InternalSecureUML2SQL.g:419:4: (lv_dom_2_0= RULE_ID )
            // InternalSecureUML2SQL.g:420:5: lv_dom_2_0= RULE_ID
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


    // $ANTLR start "entryRuleBESet"
    // InternalSecureUML2SQL.g:440:1: entryRuleBESet returns [EObject current=null] : iv_ruleBESet= ruleBESet EOF ;
    public final EObject entryRuleBESet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBESet = null;


        try {
            // InternalSecureUML2SQL.g:440:46: (iv_ruleBESet= ruleBESet EOF )
            // InternalSecureUML2SQL.g:441:2: iv_ruleBESet= ruleBESet EOF
            {
             newCompositeNode(grammarAccess.getBESetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBESet=ruleBESet();

            state._fsp--;

             current =iv_ruleBESet; 
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
    // $ANTLR end "entryRuleBESet"


    // $ANTLR start "ruleBESet"
    // InternalSecureUML2SQL.g:447:1: ruleBESet returns [EObject current=null] : ( ( (lv_set_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= ruleBSetValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleBSetValue ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleBESet() throws RecognitionException {
        EObject current = null;

        Token lv_set_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_values_3_0 = null;

        EObject lv_values_5_0 = null;



        	enterRule();

        try {
            // InternalSecureUML2SQL.g:453:2: ( ( ( (lv_set_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= ruleBSetValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleBSetValue ) ) )* otherlv_6= '}' ) )
            // InternalSecureUML2SQL.g:454:2: ( ( (lv_set_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= ruleBSetValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleBSetValue ) ) )* otherlv_6= '}' )
            {
            // InternalSecureUML2SQL.g:454:2: ( ( (lv_set_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= ruleBSetValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleBSetValue ) ) )* otherlv_6= '}' )
            // InternalSecureUML2SQL.g:455:3: ( (lv_set_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= ruleBSetValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleBSetValue ) ) )* otherlv_6= '}'
            {
            // InternalSecureUML2SQL.g:455:3: ( (lv_set_name_0_0= RULE_ID ) )
            // InternalSecureUML2SQL.g:456:4: (lv_set_name_0_0= RULE_ID )
            {
            // InternalSecureUML2SQL.g:456:4: (lv_set_name_0_0= RULE_ID )
            // InternalSecureUML2SQL.g:457:5: lv_set_name_0_0= RULE_ID
            {
            lv_set_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_set_name_0_0, grammarAccess.getBESetAccess().getSet_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBESetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"set_name",
            						lv_set_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBESetAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBESetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSecureUML2SQL.g:481:3: ( (lv_values_3_0= ruleBSetValue ) )
            // InternalSecureUML2SQL.g:482:4: (lv_values_3_0= ruleBSetValue )
            {
            // InternalSecureUML2SQL.g:482:4: (lv_values_3_0= ruleBSetValue )
            // InternalSecureUML2SQL.g:483:5: lv_values_3_0= ruleBSetValue
            {

            					newCompositeNode(grammarAccess.getBESetAccess().getValuesBSetValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_values_3_0=ruleBSetValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBESetRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_3_0,
            						"secureuml2SQL.SecureUML2SQL.BSetValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecureUML2SQL.g:500:3: (otherlv_4= ',' ( (lv_values_5_0= ruleBSetValue ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSecureUML2SQL.g:501:4: otherlv_4= ',' ( (lv_values_5_0= ruleBSetValue ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBESetAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSecureUML2SQL.g:505:4: ( (lv_values_5_0= ruleBSetValue ) )
            	    // InternalSecureUML2SQL.g:506:5: (lv_values_5_0= ruleBSetValue )
            	    {
            	    // InternalSecureUML2SQL.g:506:5: (lv_values_5_0= ruleBSetValue )
            	    // InternalSecureUML2SQL.g:507:6: lv_values_5_0= ruleBSetValue
            	    {

            	    						newCompositeNode(grammarAccess.getBESetAccess().getValuesBSetValueParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_values_5_0=ruleBSetValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBESetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_5_0,
            	    							"secureuml2SQL.SecureUML2SQL.BSetValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBESetAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBESet"


    // $ANTLR start "entryRuleBSetValue"
    // InternalSecureUML2SQL.g:533:1: entryRuleBSetValue returns [EObject current=null] : iv_ruleBSetValue= ruleBSetValue EOF ;
    public final EObject entryRuleBSetValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSetValue = null;


        try {
            // InternalSecureUML2SQL.g:533:50: (iv_ruleBSetValue= ruleBSetValue EOF )
            // InternalSecureUML2SQL.g:534:2: iv_ruleBSetValue= ruleBSetValue EOF
            {
             newCompositeNode(grammarAccess.getBSetValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSetValue=ruleBSetValue();

            state._fsp--;

             current =iv_ruleBSetValue; 
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
    // $ANTLR end "entryRuleBSetValue"


    // $ANTLR start "ruleBSetValue"
    // InternalSecureUML2SQL.g:540:1: ruleBSetValue returns [EObject current=null] : ( (lv_value_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBSetValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_name_0_0=null;


        	enterRule();

        try {
            // InternalSecureUML2SQL.g:546:2: ( ( (lv_value_name_0_0= RULE_ID ) ) )
            // InternalSecureUML2SQL.g:547:2: ( (lv_value_name_0_0= RULE_ID ) )
            {
            // InternalSecureUML2SQL.g:547:2: ( (lv_value_name_0_0= RULE_ID ) )
            // InternalSecureUML2SQL.g:548:3: (lv_value_name_0_0= RULE_ID )
            {
            // InternalSecureUML2SQL.g:548:3: (lv_value_name_0_0= RULE_ID )
            // InternalSecureUML2SQL.g:549:4: lv_value_name_0_0= RULE_ID
            {
            lv_value_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_value_name_0_0, grammarAccess.getBSetValueAccess().getValue_nameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBSetValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value_name",
            					lv_value_name_0_0,
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
    // $ANTLR end "ruleBSetValue"


    // $ANTLR start "entryRuleBConstant"
    // InternalSecureUML2SQL.g:568:1: entryRuleBConstant returns [EObject current=null] : iv_ruleBConstant= ruleBConstant EOF ;
    public final EObject entryRuleBConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBConstant = null;


        try {
            // InternalSecureUML2SQL.g:568:50: (iv_ruleBConstant= ruleBConstant EOF )
            // InternalSecureUML2SQL.g:569:2: iv_ruleBConstant= ruleBConstant EOF
            {
             newCompositeNode(grammarAccess.getBConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBConstant=ruleBConstant();

            state._fsp--;

             current =iv_ruleBConstant; 
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
    // $ANTLR end "entryRuleBConstant"


    // $ANTLR start "ruleBConstant"
    // InternalSecureUML2SQL.g:575:1: ruleBConstant returns [EObject current=null] : ( (lv_constant_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_name_0_0=null;


        	enterRule();

        try {
            // InternalSecureUML2SQL.g:581:2: ( ( (lv_constant_name_0_0= RULE_ID ) ) )
            // InternalSecureUML2SQL.g:582:2: ( (lv_constant_name_0_0= RULE_ID ) )
            {
            // InternalSecureUML2SQL.g:582:2: ( (lv_constant_name_0_0= RULE_ID ) )
            // InternalSecureUML2SQL.g:583:3: (lv_constant_name_0_0= RULE_ID )
            {
            // InternalSecureUML2SQL.g:583:3: (lv_constant_name_0_0= RULE_ID )
            // InternalSecureUML2SQL.g:584:4: lv_constant_name_0_0= RULE_ID
            {
            lv_constant_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_constant_name_0_0, grammarAccess.getBConstantAccess().getConstant_nameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBConstantRule());
            				}
            				setWithLastConsumed(
            					current,
            					"constant_name",
            					lv_constant_name_0_0,
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
    // $ANTLR end "ruleBConstant"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});

}