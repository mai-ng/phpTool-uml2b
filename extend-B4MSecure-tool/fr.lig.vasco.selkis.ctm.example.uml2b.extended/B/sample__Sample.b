<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Sample" systemMachine="//@machines.0">
  <machines name="Sample">
    <data xsi:type="b:BVariable" name="Patient" type="//@machines.0/@data.1" typing="//@machines.0/@operations.4/@param.0 //@machines.0/@operations.2/@param.1 //@machines.0/@operations.8/@param.0 //@machines.0/@operations.10/@param.0 //@machines.0/@operations.11/@param.0">
      <typingPredicate type="//@machines.0/@data.1"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="PATIENT" typing="//@machines.0/@data.0 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="ManagmentAct" type="//@machines.0/@data.3" typing="//@machines.0/@operations.0/@param.0 //@machines.0/@operations.5/@param.0 //@machines.0/@operations.7/@param.0 //@machines.0/@operations.9/@param.0 //@machines.0/@operations.10/@param.1 //@machines.0/@operations.11/@param.1 //@machines.0/@operations.12/@param.0 //@machines.0/@operations.13/@param.0 //@machines.0/@operations.14/@param.0 //@machines.0/@operations.15/@param.0 //@machines.0/@operations.16/@param.0">
      <typingPredicate type="//@machines.0/@data.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="MANAGMENTACT" typing="//@machines.0/@data.2 //@machines.0/@operations.2/@param.0"/>
    <data xsi:type="b:BVariable" name="Owner" type="//@machines.0/@data.5" typing="//@machines.0/@operations.6/@param.0 //@machines.0/@operations.2/@param.2">
      <typingPredicate type="//@machines.0/@data.5"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="OWNER" typing="//@machines.0/@data.4 //@machines.0/@operations.3/@param.0"/>
    <data xsi:type="b:BEnumSet" name="Type" typing="//@machines.0/@operations.15/@param.1">
      <values name="T1" type="//@sharedTypes/@sharedTypes.1"/>
      <values name="T2" type="//@sharedTypes/@sharedTypes.1"/>
    </data>
    <data xsi:type="b:BVariable" name="patientManagmentActs" type="//@sharedTypes/@sharedTypes.2">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BVariable" name="OwnedBy" type="//@sharedTypes/@sharedTypes.3">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BVariable" name="ManagmentAct__validated" type="//@sharedTypes/@sharedTypes.4">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <data xsi:type="b:BVariable" name="ManagmentAct__type" type="//@sharedTypes/@sharedTypes.5">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
    </data>
    <data xsi:type="b:BVariable" name="ManagmentAct__id" type="//@sharedTypes/@sharedTypes.6">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
    </data>
    <operations name="ManagmentAct__validate" body="&#xA;/* Annoted Body BEGIN */&#xA;ManagmentAct__validated:= ({Instance}&lt;&lt;|ManagmentAct__validated)\/{(Instance|->TRUE)}&#xA;/* Annoted Body END */&#xA;">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient_NEW" body="Patient := Patient \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: Patient"/>
      </param>
    </operations>
    <operations name="ManagmentAct_NEW" body="ManagmentAct := ManagmentAct \/ {Instance} &#xA; || patientManagmentActs:= patientManagmentActs \/ {(Instance|->patientManagmentActs__patientValue)} &#xA; || OwnedBy:= OwnedBy \/ {(Instance|->OwnedBy__ownerValue)} || ManagmentAct__validated:= ManagmentAct__validated \/ {(Instance|->FALSE)}&#xA; || ManagmentAct__id:= ManagmentAct__id \/ {(Instance|->ManagmentAct__idValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: ManagmentAct"/>
      </param>
      <param name="patientManagmentActs__patientValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="OwnedBy__ownerValue" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="ManagmentAct__idValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="ManagmentAct__idValue /:ran(ManagmentAct__id)"/>
      </param>
    </operations>
    <operations name="Owner_NEW" body="Owner := Owner \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: Owner"/>
      </param>
    </operations>
    <operations name="Patient_Free" body="Patient := Patient - {Instance}&#xA; || patientManagmentActs:= patientManagmentActs|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="patientManagmentActs~[{Instance}]={}&#xA; &amp; patientManagmentActs~[{Instance}]={}"/>
      </param>
    </operations>
    <operations name="ManagmentAct_Free" body="ManagmentAct := ManagmentAct - {Instance}&#xA; || patientManagmentActs:= {Instance}&lt;&lt;|patientManagmentActs&#xA; || OwnedBy:= {Instance}&lt;&lt;|OwnedBy&#xA; || ManagmentAct__validated:= {Instance}&lt;&lt;|ManagmentAct__validated&#xA; || ManagmentAct__type:= {Instance}&lt;&lt;|ManagmentAct__type&#xA; || ManagmentAct__id:= {Instance}&lt;&lt;|ManagmentAct__id">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Owner_Free" body="Owner := Owner - {Instance}&#xA; || OwnedBy:= OwnedBy|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="OwnedBy~[{Instance}]={}"/>
      </param>
    </operations>
    <operations name="ManagmentAct__GetPatientManagmentActs" body="result := patientManagmentActs(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient__GetPatientManagmentActs" body="result := patientManagmentActs~(Instance)">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="ManagmentAct__GetOwnedBy" body="result := OwnedBy(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient__AddPatientManagmentActs" body="patientManagmentActs:= patientManagmentActs\/{(patientManagmentActs__managmentActValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="patientManagmentActs__managmentActValues" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(patientManagmentActs__managmentActValues|-> Instance) /:patientManagmentActs"/>
        <typingPredicate name="patientManagmentActs__managmentActValues/:dom(patientManagmentActs)"/>
      </param>
    </operations>
    <operations name="Patient__RemovePatientManagmentActs" body="patientManagmentActs:= patientManagmentActs\/{(patientManagmentActs__managmentActValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="patientManagmentActs__managmentActValues" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(patientManagmentActs__managmentActValues|-> Instance) :patientManagmentActs"/>
        <typingPredicate name="#cc.(cc: Patient &amp; cc/=Instance &amp; cc: patientManagmentActs[{patientManagmentActs__managmentActValues}])"/>
      </param>
    </operations>
    <operations name="ManagmentAct__GetValidated" body="result := ManagmentAct__validated(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="ManagmentAct__GetType" body="result := ManagmentAct__type(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="ManagmentAct__GetId" body="result := ManagmentAct__id(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="ManagmentAct__SetType" body="ManagmentAct__type:= ({Instance}&lt;&lt;|ManagmentAct__type)\/ {(Instance|-> ManagmentAct__typeValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="ManagmentAct__typeValue" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="(Instance|-> ManagmentAct__typeValue) /: ManagmentAct__type"/>
      </param>
    </operations>
    <operations name="ManagmentAct__SetId" body="ManagmentAct__id:= ({Instance}&lt;&lt;|ManagmentAct__id)\/ {(Instance|-> ManagmentAct__idValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="ManagmentAct__idValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="ManagmentAct__idValue /: ran(ManagmentAct__id)"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.0"/>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
    <initialisation init="//@machines.0/@data.7"/>
    <initialisation init="//@machines.0/@data.8"/>
    <initialisation init="//@machines.0/@data.9"/>
    <initialisation init="//@machines.0/@data.10"/>
    <initialisation init="//@machines.0/@data.11"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Bool"/>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@data.6/@values.0 //@machines.0/@data.6/@values.1 //@machines.0/@operations.2/@param.3 //@machines.0/@operations.16/@param.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.7" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.8" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.4"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.9" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.10" expression="PartialFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.6"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.11" expression="TotalInjection" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.1"/>
  </sharedTypes>
</b:BSpec>
