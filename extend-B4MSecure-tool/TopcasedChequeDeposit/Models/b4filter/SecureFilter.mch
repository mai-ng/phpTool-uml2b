
MACHINE
    SecureFilter
    
SEES  
  Context, SecureUMLContext, SecureUMLTranslation
  
INCLUDES 
  ActionsHistory
  
OPERATIONS
	

result,access<--FilterDeposit__validate(ch, cl, usr)=
PRE
	ch: CHEQUE& cl: CLIENT&
	usr : Users &
	currentOrder+1 : NAT
THEN
	CHOICE
		access := granted ||
		result<--ExecutionDeposit__validate(ch, usr)
	OR 
		access := denied || result := Ko
    END
END

END
 