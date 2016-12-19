
	
MACHINE 
	SecureUMLContext 
SETS
     Users = {Paul, Martin, Jack, none};
     Roles = {Teller, Advisor};
     Operations = { 	
		 Deposit__validateDeposit_Label ,
		 Deposit__saveDeposit_Label ,
		 Deposit__createDeposit_Label ,
		 Deposit__verifyDeposit_Label 						
		
	 };
     Access = {granted, denied}
CONSTANTS
    Permissions,  PermittedUsersRoles
PROPERTIES
     Permissions ={       	
     		Teller|-> Deposit__validateDeposit_Label 	 
,      	
     		Teller|-> Deposit__saveDeposit_Label 	 
,      	
     		Teller|-> Deposit__createDeposit_Label 	 
 ,      	
     		Advisor|-> Deposit__verifyDeposit_Label 	 
,      	
     		Advisor|-> Deposit__createDeposit_Label 	 
,      	
     		Advisor|-> Deposit__saveDeposit_Label 	 
} & 
     PermittedUsersRoles ={Paul|->Teller, Martin|->Advisor, Jack|->Teller}
 END
