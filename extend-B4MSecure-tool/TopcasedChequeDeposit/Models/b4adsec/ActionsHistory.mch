
MACHINE
    ActionsHistory
    
SEES
 	Context, SecureUMLContext
 	
INCLUDES
	FunctionalRequirement
	
VARIABLES
	currentOrder,
	historyDeposit__validate, orderExecutionDeposit__validate	,
	historyDeposit__create, orderExecutionDeposit__create	 	

INVARIANT
	currentOrder : NAT &
 	historyDeposit__validate : CHEQUE +-> Users	 & 	 
	orderExecutionDeposit__validate:  CHEQUE +-> NAT
	&
 	historyDeposit__create : CHEQUE*CLIENT +-> Users	 & 	 
	orderExecutionDeposit__create:  CHEQUE* CLIENT +-> NAT


INITIALISATION
	currentOrder := 0 ||
	historyDeposit__validate := {} || 
	orderExecutionDeposit__validate := {}
	||
	historyDeposit__create := {} ||
	orderExecutionDeposit__create := {}

OPERATIONS
result<--ExecutionDeposit__validate(ch, usr)=
PRE 
	ch: CHEQUE &
	currentOrder+1: NAT &
	usr : Users
THEN
	IF 
		ch : Cheque 
 &
		ch : dom(Deposit) /* Precondition generated from annotation*/  
   THEN
		result<--Deposit__validate(ch)||
  		historyDeposit__validate(ch) := usr || 
  		orderExecutionDeposit__validate(ch) := currentOrder ||
  		currentOrder := currentOrder + 1
  	ELSE
  		result := Ko
  	END   
 END;
result<--ExecutionDeposit__create(ch, cl, usr)=
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
		result<--Deposit__create(ch, cl)||
  		historyDeposit__create(ch, cl) := usr || 
  		orderExecutionDeposit__create(ch, cl) := currentOrder ||
  		currentOrder := currentOrder + 1
  	ELSE
  		result := Ko
  	END   
 END 
END
 