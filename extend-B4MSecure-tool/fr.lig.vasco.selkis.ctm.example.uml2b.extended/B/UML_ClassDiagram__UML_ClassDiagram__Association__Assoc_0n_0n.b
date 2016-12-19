<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Assoc_0n_0n" systemMachine="//@machines.0">
  <machines name="Assoc_0n_0n">
    <data xsi:type="b:BAbstractSet" name="STR"/>
    <data xsi:type="b:BAbstractSet" name="CLASS1" typing="//@machines.0/@data.2 //@machines.0/@operations.0/@param.0"/>
    <data xsi:type="b:BVariable" name="Class1" type="//@machines.0/@data.1" typing="//@machines.0/@operations.2/@param.0 //@machines.0/@operations.5/@param.0 //@machines.0/@operations.6/@param.1 //@machines.0/@operations.7/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="CLASS2" typing="//@machines.0/@data.4 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="Class2" type="//@machines.0/@data.3" typing="//@machines.0/@operations.3/@param.0 //@machines.0/@operations.4/@param.0 //@machines.0/@operations.6/@param.0 //@machines.0/@operations.7/@param.1">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BVariable" name="AssociationClass1_Class2" type="//@sharedTypes/@sharedTypes.4">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <operations name="Class1_NEW" body="Class1 := Class1 \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: Class1"/>
      </param>
    </operations>
    <operations name="Class2_NEW" body="Class2 := Class2 \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: Class2"/>
      </param>
    </operations>
    <operations name="Class1_Free" body="Class1 := Class1 - {Instance}&#xA; || AssociationClass1_Class2:= {Instance}&lt;&lt;|AssociationClass1_Class2">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class2_Free" body="Class2 := Class2 - {Instance}&#xA; || AssociationClass1_Class2:= AssociationClass1_Class2|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Class2__GetAssociationClass1_Class2" body="result := AssociationClass1_Class2~(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Class1__GetAssociationClass1_Class2" body="result := AssociationClass1_Class2(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class2__AddAssociationClass1_Class2" body="AssociationClass1_Class2:= AssociationClass1_Class2\/{(AssociationClass1_Class2__class1Values|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="AssociationClass1_Class2__class1Values" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(AssociationClass1_Class2__class1Values|-> Instance) /:AssociationClass1_Class2"/>
      </param>
    </operations>
    <operations name="Class1__AddAssociationClass1_Class2" body="AssociationClass1_Class2:= AssociationClass1_Class2\/ {(Instance|-> AssociationClass1_Class2__class2Values)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="AssociationClass1_Class2__class2Values" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="(Instance|-> AssociationClass1_Class2__class2Values) /:AssociationClass1_Class2"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
    <initialisation init="//@machines.0/@data.5"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Z"/>
    <sharedTypes xsi:type="b:Bool"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.1"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.3"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.5" dom="//@machines.0/@data.2" ran="//@machines.0/@data.4"/>
  </sharedTypes>
</b:BSpec>
