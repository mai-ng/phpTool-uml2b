
	
MACHINE 
	SecureUMLContext 
SETS
     Users = {Bob, Paul, Tom, Alice, none};
     Roles = {Staff, Manager};
     Operations = { 	
		 PurchaseOrder__approve_Label ,
		 PurchaseOrder__receive_Label ,
		 PurchaseOrder__create_Label 						
		
	 };
     Access = {granted, denied}
CONSTANTS
    Permissions,  PermittedUsersRoles
PROPERTIES
     Permissions ={       	
     		Manager|-> PurchaseOrder__approve_Label 	 
 ,      	
     		Staff|-> PurchaseOrder__receive_Label 	 
,      	
     		Staff|-> PurchaseOrder__create_Label 	 
} & 
     PermittedUsersRoles ={Bob|->Staff, Paul|->Staff, Tom|->Manager, Alice|->Staff}
 END
