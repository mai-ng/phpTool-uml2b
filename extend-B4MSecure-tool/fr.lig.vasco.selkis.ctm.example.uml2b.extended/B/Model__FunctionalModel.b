<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="FunctionalModel" systemMachine="//@machines.0">
  <machines name="FunctionalModel">
    <data xsi:type="b:BVariable" name="Owner" type="//@machines.0/@data.1" typing="//@machines.0/@operations.4/@param.0 //@machines.0/@operations.2/@param.2 //@machines.0/@operations.9/@param.0">
      <typingPredicate type="//@machines.0/@data.1"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="OWNER" typing="//@machines.0/@data.0 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="ManagementAct" type="//@machines.0/@data.3" typing="//@machines.0/@operations.0/@param.0 //@machines.0/@operations.5/@param.0 //@machines.0/@operations.7/@param.0 //@machines.0/@operations.8/@param.0 //@machines.0/@operations.10/@param.0">
      <typingPredicate type="//@machines.0/@data.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="MANAGEMENTACT" typing="//@machines.0/@data.2 //@machines.0/@operations.2/@param.0"/>
    <data xsi:type="b:BVariable" name="Patient" type="//@machines.0/@data.5" typing="//@machines.0/@operations.6/@param.0 //@machines.0/@operations.2/@param.1 //@machines.0/@operations.11/@param.0 //@machines.0/@operations.12/@param.0">
      <typingPredicate type="//@machines.0/@data.5"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="PATIENT" typing="//@machines.0/@data.4 //@machines.0/@operations.3/@param.0"/>
    <data xsi:type="b:BVariable" name="A_&lt;patient>_&lt;managementAct>" type="//@sharedTypes/@sharedTypes.2">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BVariable" name="A_&lt;owner>_&lt;managementAct>" type="//@sharedTypes/@sharedTypes.3">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BVariable" name="ManagementAct__validated" type="//@sharedTypes/@sharedTypes.4">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <data xsi:type="b:BVariable" name="Patient__ssn" type="//@sharedTypes/@sharedTypes.5">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
    </data>
    <operations name="ManagementAct__validate" body="skip">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Owner_NEW" body="Owner := Owner \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: Owner"/>
      </param>
    </operations>
    <operations name="ManagementAct_NEW" body="ManagementAct := ManagementAct \/ {Instance} &#xA; || A_&lt;patient>_&lt;managementAct>:= A_&lt;patient>_&lt;managementAct> \/ {(Instance|->A_&lt;patient>_&lt;managementAct>__patientValue)} &#xA; || A_&lt;owner>_&lt;managementAct>:= A_&lt;owner>_&lt;managementAct> \/ {(Instance|->A_&lt;owner>_&lt;managementAct>__ownerValue)} || ManagementAct__validated:= ManagementAct__validated \/ {(Instance|->FALSE)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: ManagementAct"/>
      </param>
      <param name="A_&lt;patient>_&lt;managementAct>__patientValue" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="A_&lt;owner>_&lt;managementAct>__ownerValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Patient_NEW" body="Patient := Patient \/ {Instance}&#xA; || Patient__ssn:= Patient__ssn \/ {(Instance|->Patient__ssnValue)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: Patient"/>
      </param>
      <param name="Patient__ssnValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="Patient__ssnValue /:ran(Patient__ssn)"/>
      </param>
    </operations>
    <operations name="Owner_Free" body="Owner := Owner - {Instance}&#xA; || A_&lt;owner>_&lt;managementAct>:= A_&lt;owner>_&lt;managementAct>|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="A_&lt;owner>_&lt;managementAct>~[{Instance}]={}"/>
      </param>
    </operations>
    <operations name="ManagementAct_Free" body="ManagementAct := ManagementAct - {Instance}&#xA; || A_&lt;owner>_&lt;managementAct>:= {Instance}&lt;&lt;|A_&lt;owner>_&lt;managementAct>&#xA; || ManagementAct__validated:= {Instance}&lt;&lt;|ManagementAct__validated">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient_Free" body="Patient := Patient - {Instance}&#xA; || A_&lt;patient>_&lt;managementAct>:= A_&lt;patient>_&lt;managementAct>|>> {Instance}&#xA; || Patient__ssn:= {Instance}&lt;&lt;|Patient__ssn">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="A_&lt;patient>_&lt;managementAct>~[{Instance}]={}&#xA; &amp; A_&lt;patient>_&lt;managementAct>~[{Instance}]={}"/>
      </param>
    </operations>
    <operations name="ManagementAct__GetA_&lt;patient>_&lt;managementAct>" body="result := A_&lt;patient>_&lt;managementAct>(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="ManagementAct__GetA_&lt;owner>_&lt;managementAct>" body="result := A_&lt;owner>_&lt;managementAct>(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Owner__GetA_&lt;owner>_&lt;managementAct>" body="result := A_&lt;owner>_&lt;managementAct>~(Instance)">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="ManagementAct__GetValidated" body="result := ManagementAct__validated(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient__GetSsn" body="result := Patient__ssn(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Patient__SetSsn" body="Patient__ssn:= ({Instance}&lt;&lt;|Patient__ssn)\/ {(Instance|-> Patient__ssnValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="Patient__ssnValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="Patient__ssnValue /: ran(Patient__ssn)"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.0"/>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
    <initialisation init="//@machines.0/@data.6"/>
    <initialisation init="//@machines.0/@data.7"/>
    <initialisation init="//@machines.0/@data.8"/>
    <initialisation init="//@machines.0/@data.9"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Bool"/>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@operations.3/@param.1 //@machines.0/@operations.12/@param.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.6" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.4"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.7" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.8" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.9" expression="TotalInjection" dom="//@machines.0/@data.4" ran="//@sharedTypes/@sharedTypes.1"/>
  </sharedTypes>
</b:BSpec>
