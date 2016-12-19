
MACHINE
    ActionsHistory
    
SEES
 	Context, SecureUMLContext
 	
INCLUDES
	FunctionalRequirement
	
VARIABLES
	currentOrder,
	historyDeposit__saveDeposit, orderExecutionDeposit__saveDeposit	,
	historyDeposit__createDeposit, orderExecutionDeposit__createDeposit	 	

INVARIANT
	currentOrder : NAT &
 	historyDeposit__saveDeposit : CHEQUE +-> Users	 & 	 
	orderExecutionDeposit__saveDeposit:  CHEQUE +-> NAT
	&
 	historyDeposit__createDeposit : CHEQUE*CLIENT +-> Users	 & 	 
	orderExecutionDeposit__createDeposit:  CHEQUE* CLIENT +-> NAT


INITIALISATION
	currentOrder := 0 ||
	historyDeposit__saveDeposit := {} || 
	orderExecutionDeposit__saveDeposit := {}
	||
	historyDeposit__createDeposit := {} ||
	orderExecutionDeposit__createDeposit := {}

OPERATIONS
result<--ExecutionDeposit__saveDeposit(ch, usr)=
PRE 
	ch: CHEQUE &
	currentOrder+1: NAT &
	usr : Users
THEN
	IF 
		ch : Cheque 	
   THEN
		result<--Deposit__saveDeposit(ch)||
  		historyDeposit__saveDeposit(ch) := usr || 
  		orderExecutionDeposit__saveDeposit(ch) := currentOrder ||
  		currentOrder := currentOrder + 1
  	ELSE
  		result := Ko
  	END   
 END;
result<--ExecutionDeposit__createDeposit(ch, cl, usr)=
PRE 
	ch: CHEQUE & cl: CLIENT &
	currentOrder+1: NAT &
	usr : Users
THEN
	IF 
		ch : Cheque &
		cl : Client 
 &
		ch /: dom(Deposit) /* Precondition generated from annotation*/  
   THEN
		result<--Deposit__createDeposit(ch, cl)||
  		historyDeposit__createDeposit(ch, cl) := usr || 
  		orderExecutionDeposit__createDeposit(ch, cl) := currentOrder ||
  		currentOrder := currentOrder + 1
  	ELSE
  		result := Ko
  	END   
 END 
END
 