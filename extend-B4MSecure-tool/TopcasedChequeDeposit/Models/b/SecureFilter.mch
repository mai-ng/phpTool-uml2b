
MACHINE
    SecureFilter
    
SEES  
  Context, SecureUMLContext, SecureUMLTranslation
  
INCLUDES 
  ActionsHistory
  
OPERATIONS
	

result,access<--FilterDeposit__saveDeposit(ch, cl, usr)=
PRE
	ch: CHEQUE& cl: CLIENT&
	usr : Users &
	currentOrder+1 : NAT
THEN
	CHOICE
		access := granted ||
		result<--ExecutionDeposit__saveDeposit(ch, usr)
	OR 
		access := denied || result := Ko
    END
END

END
 