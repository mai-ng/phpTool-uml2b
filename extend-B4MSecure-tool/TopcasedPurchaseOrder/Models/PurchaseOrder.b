<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Functional" systemMachine="//@machines.0">
  <machines name="Functional">
    <data xsi:type="b:BAbstractSet" name="STR" typing="//@machines.0/@operations.4/@param.1 //@machines.0/@operations.16/@param.1"/>
    <data xsi:type="b:BVariable" name="PurchaseOrder" type="//@machines.0/@data.2" typing="//@machines.0/@operations.5/@param.0 //@machines.0/@operations.7/@param.0 //@machines.0/@operations.8/@param.0 //@machines.0/@operations.9/@param.0 //@machines.0/@operations.10/@param.0 //@machines.0/@operations.13/@param.0 //@machines.0/@operations.14/@param.0 //@machines.0/@operations.15/@param.0 //@machines.0/@operations.17/@param.0">
      <typingPredicate type="//@machines.0/@data.2"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="PURCHASEORDER" typing="//@machines.0/@data.1 //@machines.0/@operations.0/@param.0 //@machines.0/@operations.1/@param.0 //@machines.0/@operations.2/@param.0 //@machines.0/@operations.3/@param.0"/>
    <data xsi:type="b:BVariable" name="Supplier" type="//@machines.0/@data.4" typing="//@machines.0/@operations.6/@param.0 //@machines.0/@operations.11/@param.0 //@machines.0/@operations.12/@param.0 //@machines.0/@operations.16/@param.0 //@machines.0/@operations.18/@param.0">
      <typingPredicate type="//@machines.0/@data.4"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="SUPPLIER" typing="//@machines.0/@data.3 //@machines.0/@operations.4/@param.0"/>
    <data xsi:type="b:BVariable" name="PurchaseOrder__createdDate" type="//@sharedTypes/@sharedTypes.2">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BVariable" name="PurchaseOrder__isApproved" type="//@sharedTypes/@sharedTypes.3">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BVariable" name="PurchaseOrder__isReceived" type="//@sharedTypes/@sharedTypes.4">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <data xsi:type="b:BVariable" name="Supplier__name" type="//@sharedTypes/@sharedTypes.5">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
    </data>
    <data xsi:type="b:BVariable" name="PurchaseOrder__id" type="//@sharedTypes/@sharedTypes.6">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
    </data>
    <data xsi:type="b:BVariable" name="Supplier__id" type="//@sharedTypes/@sharedTypes.7">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.7"/>
    </data>
    <operations name="PurchaseOrder__create" body="ANY nb, time WHERE nb : NAT &amp; time :ran(PurchaseOrder__id)-NAT THEN&#xD;&#xA;&#x9;PurchaseOrder__id(po) := nb ||&#xD;&#xA;&#x9;PurchaseOrder__createdDate(po) := time ||&#xD;&#xA;&#x9;PurchaseOrder__isApproved(po) := FALSE ||&#xD;&#xA;&#x9;PurchaseOrder__isReceived(po) := FALSE &#xD;&#xA;END /* Body generated from annotation */">
      <param name="po" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__approve" body="PurchaseOrder__isApproved(po) := TRUE /* Body generated from annotation */">
      <param name="po" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__receive" body="PurchaseOrder__isReceived(po) := TRUE&#xD;&#xA; /* Body generated from annotation */">
      <param name="po" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="PurchaseOrder_NEW" body="PurchaseOrder := PurchaseOrder \/ {Instance}&#xA; || PurchaseOrder__createdDate:= PurchaseOrder__createdDate \/ {(Instance|->PurchaseOrder__createdDateValue)}&#xA; || PurchaseOrder__isApproved:= PurchaseOrder__isApproved \/ {(Instance|->PurchaseOrder__isApprovedValue)}&#xA; || PurchaseOrder__isReceived:= PurchaseOrder__isReceived \/ {(Instance|->PurchaseOrder__isReceivedValue)}&#xA; || PurchaseOrder__id:= PurchaseOrder__id \/ {(Instance|->PurchaseOrder__idValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="Instance /: PurchaseOrder"/>
      </param>
      <param name="PurchaseOrder__createdDateValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
      <param name="PurchaseOrder__isApprovedValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
      </param>
      <param name="PurchaseOrder__isReceivedValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
      </param>
      <param name="PurchaseOrder__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="PurchaseOrder__idValue /:ran(PurchaseOrder__id)"/>
      </param>
    </operations>
    <operations name="Supplier_NEW" body="Supplier := Supplier \/ {Instance}&#xA; || Supplier__name:= Supplier__name \/ {(Instance|->Supplier__nameValue)}&#xA; || Supplier__id:= Supplier__id \/ {(Instance|->Supplier__idValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance /: Supplier"/>
      </param>
      <param name="Supplier__nameValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="Supplier__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Supplier__idValue /:ran(Supplier__id)"/>
      </param>
    </operations>
    <operations name="PurchaseOrder_Free" body="PurchaseOrder := PurchaseOrder - {Instance}&#xA; || PurchaseOrder__id:= {Instance}&lt;&lt;|PurchaseOrder__id&#xA; || PurchaseOrder__createdDate:= {Instance}&lt;&lt;|PurchaseOrder__createdDate&#xA; || PurchaseOrder__isApproved:= {Instance}&lt;&lt;|PurchaseOrder__isApproved&#xA; || PurchaseOrder__isReceived:= {Instance}&lt;&lt;|PurchaseOrder__isReceived">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="Supplier_Free" body="Supplier := Supplier - {Instance}&#xA; || Supplier__id:= {Instance}&lt;&lt;|Supplier__id&#xA; || Supplier__name:= {Instance}&lt;&lt;|Supplier__name">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__GetId" body="returnedData := PurchaseOrder__id(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance : dom(PurchaseOrder__id)"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__GetCreatedDate" body="returnedData := PurchaseOrder__createdDate(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance : dom(PurchaseOrder__createdDate)"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__GetIsApproved" body="returnedData := PurchaseOrder__isApproved(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance : dom(PurchaseOrder__isApproved)"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__GetIsReceived" body="returnedData := PurchaseOrder__isReceived(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance : dom(PurchaseOrder__isReceived)"/>
      </param>
    </operations>
    <operations name="Supplier__GetId" body="returnedData := Supplier__id(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance : dom(Supplier__id)"/>
      </param>
    </operations>
    <operations name="Supplier__GetName" body="returnedData := Supplier__name(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance : dom(Supplier__name)"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__SetCreatedDate" body="PurchaseOrder__createdDate:= ({Instance}&lt;&lt;|PurchaseOrder__createdDate)\/ {(Instance|-> PurchaseOrder__createdDateValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="PurchaseOrder__createdDateValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> PurchaseOrder__createdDateValue) /: PurchaseOrder__createdDate"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__SetIsApproved" body="PurchaseOrder__isApproved:= ({Instance}&lt;&lt;|PurchaseOrder__isApproved)\/ {(Instance|-> PurchaseOrder__isApprovedValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="PurchaseOrder__isApprovedValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="(Instance|-> PurchaseOrder__isApprovedValue) /: PurchaseOrder__isApproved"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__SetIsReceived" body="PurchaseOrder__isReceived:= ({Instance}&lt;&lt;|PurchaseOrder__isReceived)\/ {(Instance|-> PurchaseOrder__isReceivedValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="PurchaseOrder__isReceivedValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="(Instance|-> PurchaseOrder__isReceivedValue) /: PurchaseOrder__isReceived"/>
      </param>
    </operations>
    <operations name="Supplier__SetName" body="Supplier__name:= ({Instance}&lt;&lt;|Supplier__name)\/ {(Instance|-> Supplier__nameValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="Supplier__nameValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="(Instance|-> Supplier__nameValue) /: Supplier__name"/>
      </param>
    </operations>
    <operations name="PurchaseOrder__SetId" body="PurchaseOrder__id:= ({Instance}&lt;&lt;|PurchaseOrder__id)\/ {(Instance|-> PurchaseOrder__idValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="PurchaseOrder__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="PurchaseOrder__idValue /: ran(PurchaseOrder__id)"/>
      </param>
    </operations>
    <operations name="Supplier__SetId" body="Supplier__id:= ({Instance}&lt;&lt;|Supplier__id)\/ {(Instance|-> Supplier__idValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="Supplier__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Supplier__idValue /: ran(Supplier__id)"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.1"/>
    <initialisation init="//@machines.0/@data.3"/>
    <initialisation init="//@machines.0/@data.5"/>
    <initialisation init="//@machines.0/@data.6"/>
    <initialisation init="//@machines.0/@data.7"/>
    <initialisation init="//@machines.0/@data.8"/>
    <initialisation init="//@machines.0/@data.9"/>
    <initialisation init="//@machines.0/@data.10"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@operations.3/@param.1 //@machines.0/@operations.3/@param.4 //@machines.0/@operations.4/@param.2 //@machines.0/@operations.13/@param.1 //@machines.0/@operations.17/@param.1 //@machines.0/@operations.18/@param.1"/>
    <sharedTypes xsi:type="b:Bool" typing="//@machines.0/@operations.3/@param.2 //@machines.0/@operations.3/@param.3 //@machines.0/@operations.14/@param.1 //@machines.0/@operations.15/@param.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.5" expression="TotalFunction" dom="//@machines.0/@data.1" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.6" expression="TotalFunction" dom="//@machines.0/@data.1" ran="//@sharedTypes/@sharedTypes.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.7" expression="TotalFunction" dom="//@machines.0/@data.1" ran="//@sharedTypes/@sharedTypes.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.8" expression="TotalFunction" dom="//@machines.0/@data.3" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.9" expression="TotalInjection" dom="//@machines.0/@data.1" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.10" expression="TotalInjection" dom="//@machines.0/@data.3" ran="//@sharedTypes/@sharedTypes.0"/>
  </sharedTypes>
</b:BSpec>
