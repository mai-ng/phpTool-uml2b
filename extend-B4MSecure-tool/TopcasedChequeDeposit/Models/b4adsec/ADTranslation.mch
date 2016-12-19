MACHINE
    ADTranslation 
     
SEES
 	Context, SecureUMLContext, ActionsHistory  
 		
OPERATIONS
	

access<--ADDeposit__validate(ch, cl, usr)=
PRE
	ch: CHEQUE & cl: CLIENT&
	usr : Users
THEN
	IF
		ch|->cl : dom(historyDeposit__create)&
		ch|->cl : dom(orderExecutionDeposit__create)		 	&
		usr /= historyDeposit__create(ch, cl)	&
	THEN
		access := granted
    ELSE
        access := denied
    END
END

END
 