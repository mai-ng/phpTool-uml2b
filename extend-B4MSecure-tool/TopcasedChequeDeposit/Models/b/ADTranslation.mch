MACHINE
    ADTranslation 
     
SEES
 	Context, SecureUMLContext, ActionsHistory  
 		
OPERATIONS
	

access<--ADDeposit__saveDeposit(ch, cl, usr)=
PRE
	ch: CHEQUE & cl: CLIENT&
	usr : Users
THEN
	IF
		ch|->cl : dom(historyDeposit__createDeposit)&
		ch|->cl : dom(orderExecutionDeposit__createDeposit)&
		usr /= historyDeposit__createDeposit(ch, cl)			
	THEN
		access := granted
    ELSE
        access := denied
    END
END

END
 