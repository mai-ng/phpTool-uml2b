<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="AssociationClass" systemMachine="//@machines.0">
  <machines name="AssociationClass">
    <data xsi:type="b:BVariable" name="Assoc_Class_01_1n__Class1" type="//@machines.0/@data.1" typing="//@machines.0/@operations.6/@param.0 //@machines.0/@operations.12/@param.2 //@machines.0/@operations.18/@param.0 //@machines.0/@operations.24/@param.1 //@machines.0/@operations.26/@param.0 //@machines.0/@operations.30/@param.0">
      <typingPredicate type="//@machines.0/@data.1"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ASSOC_CLASS_01_1N__CLASS1" typing="//@machines.0/@data.0 //@machines.0/@operations.0/@param.0"/>
    <data xsi:type="b:BVariable" name="Assoc_Class_01_1n__Class2" type="//@machines.0/@data.3" typing="//@machines.0/@operations.7/@param.0 //@machines.0/@operations.12/@param.1 //@machines.0/@operations.19/@param.0 //@machines.0/@operations.24/@param.0 //@machines.0/@operations.26/@param.1 //@machines.0/@operations.30/@param.1">
      <typingPredicate type="//@machines.0/@data.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ASSOC_CLASS_01_1N__CLASS2" typing="//@machines.0/@data.2 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="Assoc_Class_02_0n__Class1" type="//@machines.0/@data.5" typing="//@machines.0/@operations.8/@param.0 //@machines.0/@operations.13/@param.2 //@machines.0/@operations.20/@param.0 //@machines.0/@operations.27/@param.0 //@machines.0/@operations.28/@param.1 //@machines.0/@operations.31/@param.0 //@machines.0/@operations.32/@param.1">
      <typingPredicate type="//@machines.0/@data.5"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ASSOC_CLASS_02_0N__CLASS1" typing="//@machines.0/@data.4 //@machines.0/@operations.2/@param.0"/>
    <data xsi:type="b:BVariable" name="Assoc_Class_02_0n__Class2" type="//@machines.0/@data.7" typing="//@machines.0/@operations.9/@param.0 //@machines.0/@operations.13/@param.1 //@machines.0/@operations.21/@param.0 //@machines.0/@operations.27/@param.1 //@machines.0/@operations.28/@param.0 //@machines.0/@operations.31/@param.1 //@machines.0/@operations.32/@param.0">
      <typingPredicate type="//@machines.0/@data.7"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ASSOC_CLASS_02_0N__CLASS2" typing="//@machines.0/@data.6 //@machines.0/@operations.3/@param.0"/>
    <data xsi:type="b:BVariable" name="Assoc_Class_11_0n__Class1" type="//@machines.0/@data.9" typing="//@machines.0/@operations.10/@param.0 //@machines.0/@operations.14/@param.2 //@machines.0/@operations.5/@param.1 //@machines.0/@operations.22/@param.0 //@machines.0/@operations.25/@param.1 //@machines.0/@operations.29/@param.0 //@machines.0/@operations.33/@param.0">
      <typingPredicate type="//@machines.0/@data.9"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ASSOC_CLASS_11_0N__CLASS1" typing="//@machines.0/@data.8 //@machines.0/@operations.4/@param.0"/>
    <data xsi:type="b:BVariable" name="Assoc_Class_11_0n__Class2" type="//@machines.0/@data.11" typing="//@machines.0/@operations.11/@param.0 //@machines.0/@operations.14/@param.1 //@machines.0/@operations.23/@param.0 //@machines.0/@operations.25/@param.0 //@machines.0/@operations.29/@param.1 //@machines.0/@operations.33/@param.1">
      <typingPredicate type="//@machines.0/@data.11"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ASSOC_CLASS_11_0N__CLASS2" typing="//@machines.0/@data.10 //@machines.0/@operations.5/@param.0"/>
    <data xsi:type="b:BVariable" name="Assoc_Class_01_1n__AssoClass" type="//@sharedTypes/@sharedTypes.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
    </data>
    <data xsi:type="b:BVariable" name="Assoc_Class_02_0n__AssoClass" type="//@sharedTypes/@sharedTypes.1">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
      <typingPredicate name="!c2.( c2:ran(Assoc_Class_02_0n__AssoClass) => card(Assoc_Class_02_0n__AssoClass[{c2}])&lt;=2)"/>
    </data>
    <data xsi:type="b:BVariable" name="Assoc_Class_11_0n__AssoClass" type="//@sharedTypes/@sharedTypes.2">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <operations name="Assoc_Class_01_1n__Class1_NEW" body="Assoc_Class_01_1n__Class1 := Assoc_Class_01_1n__Class1 \/ {Instance} &#xA; || Assoc_Class_01_1n__AssoClass:= Assoc_Class_01_1n__AssoClass \/ (Assoc_Class_01_1n__AssoClass__class2Values*{Instance})">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: Assoc_Class_01_1n__Class1"/>
      </param>
      <param name="Assoc_Class_01_1n__AssoClass__class2Values" type="//@sharedTypes/@sharedTypes.3">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
        <typingPredicate name="Assoc_Class_01_1n__AssoClass__class2Values/={}&#xA; &amp; Assoc_Class_01_1n__AssoClass[Assoc_Class_01_1n__AssoClass__class2Values]={}"/>
      </param>
    </operations>
    <operations name="Assoc_Class_01_1n__Class2_NEW" body="Assoc_Class_01_1n__Class2 := Assoc_Class_01_1n__Class2 \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: Assoc_Class_01_1n__Class2"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class1_NEW" body="Assoc_Class_02_0n__Class1 := Assoc_Class_02_0n__Class1 \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: Assoc_Class_02_0n__Class1"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class2_NEW" body="Assoc_Class_02_0n__Class2 := Assoc_Class_02_0n__Class2 \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="Instance /: Assoc_Class_02_0n__Class2"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__Class1_NEW" body="Assoc_Class_11_0n__Class1 := Assoc_Class_11_0n__Class1 \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate name="Instance /: Assoc_Class_11_0n__Class1"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__Class2_NEW" body="Assoc_Class_11_0n__Class2 := Assoc_Class_11_0n__Class2 \/ {Instance} &#xA; || Assoc_Class_11_0n__AssoClass:= Assoc_Class_11_0n__AssoClass \/ {(Instance|->Assoc_Class_11_0n__AssoClass__class1Value)}">
      <param name="Instance" type="//@machines.0/@data.11">
        <typingPredicate operator="In" type="//@machines.0/@data.11"/>
        <typingPredicate name="Instance /: Assoc_Class_11_0n__Class2"/>
      </param>
      <param name="Assoc_Class_11_0n__AssoClass__class1Value" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Assoc_Class_01_1n__Class1_Free" body="Assoc_Class_01_1n__Class1 := Assoc_Class_01_1n__Class1 - {Instance}&#xA; || Assoc_Class_01_1n__AssoClass:= Assoc_Class_01_1n__AssoClass|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Assoc_Class_01_1n__Class2_Free" body="Assoc_Class_01_1n__Class2 := Assoc_Class_01_1n__Class2 - {Instance}&#xA; || Assoc_Class_01_1n__AssoClass:= {Instance}&lt;&lt;|Assoc_Class_01_1n__AssoClass">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name=" !c2.(c2:Assoc_Class_01_1n__AssoClass[{Instance}] =>#cc.(cc:Assoc_Class_01_1n__AssoClass~[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class1_Free" body="Assoc_Class_02_0n__Class1 := Assoc_Class_02_0n__Class1 - {Instance}&#xA; || Assoc_Class_02_0n__AssoClass:= Assoc_Class_02_0n__AssoClass|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class2_Free" body="Assoc_Class_02_0n__Class2 := Assoc_Class_02_0n__Class2 - {Instance}&#xA; || Assoc_Class_02_0n__AssoClass:= {Instance}&lt;&lt;|Assoc_Class_02_0n__AssoClass">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__Class1_Free" body="Assoc_Class_11_0n__Class1 := Assoc_Class_11_0n__Class1 - {Instance}&#xA; || Assoc_Class_11_0n__AssoClass:= Assoc_Class_11_0n__AssoClass|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Assoc_Class_11_0n__AssoClass~[{Instance}]={}&#xA; &amp; Assoc_Class_11_0n__AssoClass~[{Instance}]={}"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__Class2_Free" body="Assoc_Class_11_0n__Class2 := Assoc_Class_11_0n__Class2 - {Instance}&#xA; || Assoc_Class_11_0n__AssoClass:= {Instance}&lt;&lt;|Assoc_Class_11_0n__AssoClass">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.11"/>
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
    </operations>
    <operations name="Assoc_Class_01_1n__AssoClass_NEW" body="Assoc_Class_01_1n__AssoClass := Assoc_Class_01_1n__AssoClass \/ {Instance}">
      <param name="Instance">
        <typingPredicate name="Instance : Assoc_Class_01_1n__Class2*Assoc_Class_01_1n__Class1"/>
        <typingPredicate name="Instance /: Assoc_Class_01_1n__AssoClass"/>
      </param>
      <param name="Class2Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Class1Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="( Class2Instance|->Class1Instance )= Instance"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__AssoClass_NEW" body="Assoc_Class_02_0n__AssoClass := Assoc_Class_02_0n__AssoClass \/ {Instance}">
      <param name="Instance">
        <typingPredicate name="Instance : Assoc_Class_02_0n__Class2*Assoc_Class_02_0n__Class1"/>
        <typingPredicate name="Instance /: Assoc_Class_02_0n__AssoClass"/>
      </param>
      <param name="Class2Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
      <param name="Class1Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="( Class2Instance|->Class1Instance )= Instance"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__AssoClass_NEW" body="Assoc_Class_11_0n__AssoClass := Assoc_Class_11_0n__AssoClass \/ {Instance}">
      <param name="Instance">
        <typingPredicate name="Instance : Assoc_Class_11_0n__Class2*Assoc_Class_11_0n__Class1"/>
        <typingPredicate name="Instance /: Assoc_Class_11_0n__AssoClass"/>
      </param>
      <param name="Class2Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
      <param name="Class1Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="( Class2Instance|->Class1Instance )= Instance"/>
      </param>
    </operations>
    <operations name="Assoc_Class_01_1n__AssoClass_Free"/>
    <operations name="Assoc_Class_02_0n__AssoClass_Free"/>
    <operations name="Assoc_Class_11_0n__AssoClass_Free"/>
    <operations name="Assoc_Class_01_1n__Class1__GetAssoClass" body="result := Assoc_Class_01_1n__AssoClass~(Instance)">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Assoc_Class_01_1n__Class2__GetAssoClass" body="result := Assoc_Class_01_1n__AssoClass(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class1__GetAssoClass" body="result := Assoc_Class_02_0n__AssoClass~(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class2__GetAssoClass" body="result := Assoc_Class_02_0n__AssoClass(Instance)">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__Class1__GetAssoClass" body="result := Assoc_Class_11_0n__AssoClass~(Instance)">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__Class2__GetAssoClass" body="result := Assoc_Class_11_0n__AssoClass(Instance)">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
    </operations>
    <operations name="Assoc_Class_01_1n__Class2__SetAssoClass" body="Assoc_Class_01_1n__AssoClass:= ({Instance}&lt;&lt;|Assoc_Class_01_1n__AssoClass)\/ {(Instance|-> Assoc_Class_01_1n__AssoClass__class1Value)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Assoc_Class_01_1n__AssoClass__class1Value" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="(Instance|-> Assoc_Class_01_1n__AssoClass__class1Value) /: Assoc_Class_01_1n__AssoClass"/>
        <typingPredicate name="#cc.(cc: Assoc_Class_01_1n__Class2 &amp; cc/=Instance &amp; cc: Assoc_Class_01_1n__AssoClass~[Assoc_Class_01_1n__AssoClass[{Instance}]])"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__Class2__SetAssoClass" body="Assoc_Class_11_0n__AssoClass:= ({Instance}&lt;&lt;|Assoc_Class_11_0n__AssoClass)\/ {(Instance|-> Assoc_Class_11_0n__AssoClass__class1Value)}">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
      <param name="Assoc_Class_11_0n__AssoClass__class1Value" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="(Instance|-> Assoc_Class_11_0n__AssoClass__class1Value) /: Assoc_Class_11_0n__AssoClass"/>
      </param>
    </operations>
    <operations name="Assoc_Class_01_1n__Class1__AddAssoClass" body="Assoc_Class_01_1n__AssoClass:= Assoc_Class_01_1n__AssoClass\/{(Assoc_Class_01_1n__AssoClass__class2Values|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="Assoc_Class_01_1n__AssoClass__class2Values" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(Assoc_Class_01_1n__AssoClass__class2Values|-> Instance) /:Assoc_Class_01_1n__AssoClass"/>
        <typingPredicate name="Assoc_Class_01_1n__AssoClass__class2Values/:dom(Assoc_Class_01_1n__AssoClass)"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class1__AddAssoClass" body="Assoc_Class_02_0n__AssoClass:= Assoc_Class_02_0n__AssoClass\/{(Assoc_Class_02_0n__AssoClass__class2Values|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="Assoc_Class_02_0n__AssoClass__class2Values" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="(Assoc_Class_02_0n__AssoClass__class2Values|-> Instance) /:Assoc_Class_02_0n__AssoClass"/>
        <typingPredicate name="not(#(c1,c2).(c1:Assoc_Class_02_0n__Class1 &amp; c2:Assoc_Class_02_0n__Class1 &amp; c1/=c2 &amp; {c1,c2}&lt;: Assoc_Class_02_0n__AssoClass[{Assoc_Class_02_0n__AssoClass__class2Values}]))"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class2__AddAssoClass" body="Assoc_Class_02_0n__AssoClass:= Assoc_Class_02_0n__AssoClass\/ {(Instance|-> Assoc_Class_02_0n__AssoClass__class1Values)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="card(Assoc_Class_02_0n__AssoClass[{Instance}])&lt;2"/>
      </param>
      <param name="Assoc_Class_02_0n__AssoClass__class1Values" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="(Instance|-> Assoc_Class_02_0n__AssoClass__class1Values) /:Assoc_Class_02_0n__AssoClass"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__Class1__AddAssoClass" body="Assoc_Class_11_0n__AssoClass:= Assoc_Class_11_0n__AssoClass\/{(Assoc_Class_11_0n__AssoClass__class2Values|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
      <param name="Assoc_Class_11_0n__AssoClass__class2Values" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="(Assoc_Class_11_0n__AssoClass__class2Values|-> Instance) /:Assoc_Class_11_0n__AssoClass"/>
        <typingPredicate name="Assoc_Class_11_0n__AssoClass__class2Values/:dom(Assoc_Class_11_0n__AssoClass)"/>
      </param>
    </operations>
    <operations name="Assoc_Class_01_1n__Class1__RemoveAssoClass" body="Assoc_Class_01_1n__AssoClass:= Assoc_Class_01_1n__AssoClass-{(Assoc_Class_01_1n__AssoClass__class2Values|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="Assoc_Class_01_1n__AssoClass__class2Values" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(Assoc_Class_01_1n__AssoClass__class2Values|-> Instance) :Assoc_Class_01_1n__AssoClass"/>
        <typingPredicate name="#cc.(cc: Assoc_Class_01_1n__Class2&amp; cc/=Assoc_Class_01_1n__AssoClass__class2Values &amp; (Assoc_Class_01_1n__AssoClass__class2Values|-> Instance):Assoc_Class_01_1n__AssoClass )"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class1__RemoveAssoClass" body="Assoc_Class_02_0n__AssoClass:= Assoc_Class_02_0n__AssoClass-{(Assoc_Class_02_0n__AssoClass__class2Values|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="Assoc_Class_02_0n__AssoClass__class2Values" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="(Assoc_Class_02_0n__AssoClass__class2Values|-> Instance) :Assoc_Class_02_0n__AssoClass"/>
      </param>
    </operations>
    <operations name="Assoc_Class_02_0n__Class2__RemoveAssoClass" body="Assoc_Class_02_0n__AssoClass:= Assoc_Class_02_0n__AssoClass-{(Instance|-> Assoc_Class_02_0n__AssoClass__class1Values)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
      <param name="Assoc_Class_02_0n__AssoClass__class1Values" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="(Instance|-> Assoc_Class_02_0n__AssoClass__class1Values) :Assoc_Class_02_0n__AssoClass"/>
      </param>
    </operations>
    <operations name="Assoc_Class_11_0n__Class1__RemoveAssoClass" body="Assoc_Class_11_0n__AssoClass:= Assoc_Class_11_0n__AssoClass-{(Assoc_Class_11_0n__AssoClass__class2Values|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
      <param name="Assoc_Class_11_0n__AssoClass__class2Values" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="(Assoc_Class_11_0n__AssoClass__class2Values|-> Instance) :Assoc_Class_11_0n__AssoClass"/>
        <typingPredicate name="#cc.(cc: Assoc_Class_11_0n__Class1 &amp; cc/=Instance &amp; cc: Assoc_Class_11_0n__AssoClass[{Assoc_Class_11_0n__AssoClass__class2Values}])"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.0"/>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
    <initialisation init="//@machines.0/@data.6"/>
    <initialisation init="//@machines.0/@data.8"/>
    <initialisation init="//@machines.0/@data.10"/>
    <initialisation init="//@machines.0/@data.12"/>
    <initialisation init="//@machines.0/@data.13"/>
    <initialisation init="//@machines.0/@data.14"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.12" expression="PartialSurjection" dom="//@machines.0/@data.2" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.13" dom="//@machines.0/@data.6" ran="//@machines.0/@data.4"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.14" expression="TotalFunction" dom="//@machines.0/@data.10" ran="//@machines.0/@data.8"/>
    <sharedTypes xsi:type="b:BPowType" typing="//@machines.0/@operations.0/@param.1" pow="//@machines.0/@data.2"/>
  </sharedTypes>
</b:BSpec>
