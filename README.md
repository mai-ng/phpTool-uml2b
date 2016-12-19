Source code of the tool including two features:
- uml to b translation
- b to java/sql translation

1. uml2b
	an extension of the B4MSecure tool (http://b4msecure.forge.imag.fr/) including three sub-projects:
	- a JAVA project that generates the b source code from uml class diagram
		* modifications on the project fr.lig.vasco.selkis.ctm.example.uml2b resulting in fr.lig.vasco.selkis.ctm.example.uml2b.extended
			+ generates two B machines instead of only one
			+ association class: change to obtain only a B variable 
			+ operation: change the format of the obtained B operation from each class operation (return OK/KO)
			+ operation: omit parameter "Instance" of each operation
	- an XPAND project that generates the b source code from SecureUML diagram
		* modifications on the project Selkis_B4MSecure:
			+ generate 2 B machines
			+ the structure of the obtained specification is different from the result of the B4MSecure tool
	- a QVT project that generates the B specification from UML activity diagrams UML2B4Security
	- various Topcased projects editing UML models


2. b2javasql
	XTEXT projects that generate SQl code, JAVA code and AspectJ code from the specific B specification 
	(the refinement of the previous obtained B specification)