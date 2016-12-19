
	
MACHINE 
	SecureUMLContext 
SETS
     Users = {Martin, Jack, Paul, none};
     Roles = {Advisor, Teller};
     Operations = { 	
		 Deposit__validate_Label ,
		 Deposit__save_Label ,
		 Deposit__create_Label ,
		 Deposit__verify_Label 						
		
	 };
     Access = {granted, denied}
CONSTANTS
    Permissions,  PermittedUsersRoles
PROPERTIES
     Permissions ={       	
     		Teller|-> Deposit__validate_Label 	 
,      	
     		Teller|-> Deposit__save_Label 	 
,      	
     		Teller|-> Deposit__create_Label 	 
 ,      	
     		Advisor|-> Deposit__create_Label 	 
,      	
     		Advisor|-> Deposit__save_Label 	 
,      	
     		Advisor|-> Deposit__verify_Label 	 
} & 
     PermittedUsersRoles ={Martin|->Advisor, Jack|->Teller, Paul|->Teller}
 END
