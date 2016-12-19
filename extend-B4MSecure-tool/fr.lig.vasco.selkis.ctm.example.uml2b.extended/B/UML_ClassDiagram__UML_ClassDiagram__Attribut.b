<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Attribut" systemMachine="//@machines.0">
  <machines name="Attribut">
    <data xsi:type="b:BAbstractSet" name="OPTIONAL__CLASS" typing="//@machines.0/@data.1 //@machines.0/@operations.0/@param.0"/>
    <data xsi:type="b:BVariable" name="Optional__Class" type="//@machines.0/@data.0" typing="//@machines.0/@operations.9/@param.0">
      <typingPredicate operator="In"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="MONDATORY__CLASS" typing="//@machines.0/@data.3 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="Mondatory__Class" type="//@machines.0/@data.2" typing="//@machines.0/@operations.10/@param.0">
      <typingPredicate operator="In"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="SET__CLASS" typing="//@machines.0/@data.5 //@machines.0/@operations.2/@param.0"/>
    <data xsi:type="b:BVariable" name="Set__Class" type="//@machines.0/@data.4" typing="//@machines.0/@operations.11/@param.0">
      <typingPredicate operator="In"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="NONEMPTYSET__CLASS" typing="//@machines.0/@data.7 //@machines.0/@operations.3/@param.0"/>
    <data xsi:type="b:BVariable" name="NonEmptySet__Class" type="//@machines.0/@data.6" typing="//@machines.0/@operations.12/@param.0">
      <typingPredicate operator="In"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ORDEREDSET__CLASS" typing="//@machines.0/@data.9 //@machines.0/@operations.4/@param.0"/>
    <data xsi:type="b:BVariable" name="OrderedSet__Class" type="//@machines.0/@data.8" typing="//@machines.0/@operations.13/@param.0">
      <typingPredicate operator="In"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="LIST__CLASS" typing="//@machines.0/@data.11 //@machines.0/@operations.5/@param.0"/>
    <data xsi:type="b:BVariable" name="List__Class" type="//@machines.0/@data.10" typing="//@machines.0/@operations.14/@param.0">
      <typingPredicate operator="In"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="FIXEDMULTIPLICITY__CLASS" typing="//@machines.0/@data.13 //@machines.0/@operations.6/@param.0"/>
    <data xsi:type="b:BVariable" name="fixedMultiplicity__Class" type="//@machines.0/@data.12" typing="//@machines.0/@operations.15/@param.0">
      <typingPredicate operator="In"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="STATIC__CLASS" typing="//@machines.0/@data.15 //@machines.0/@operations.7/@param.0"/>
    <data xsi:type="b:BVariable" name="Static__Class" type="//@machines.0/@data.14" typing="//@machines.0/@operations.16/@param.0">
      <typingPredicate operator="In"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="READONLY__CLASS" typing="//@machines.0/@data.17 //@machines.0/@operations.8/@param.0"/>
    <data xsi:type="b:BVariable" name="ReadOnly__Class" type="//@machines.0/@data.16" typing="//@machines.0/@operations.17/@param.0">
      <typingPredicate operator="In"/>
    </data>
    <data xsi:type="b:BVariable" name="Optional__Class__attribut"/>
    <data xsi:type="b:BVariable" name="Mondatory__Class__attribut"/>
    <data xsi:type="b:BVariable" name="Set__Class__attribut"/>
    <data xsi:type="b:BVariable" name="NonEmptySet__Class__attribut"/>
    <data xsi:type="b:BVariable" name="OrderedSet__Class__attribut"/>
    <data xsi:type="b:BVariable" name="List__Class__attribut"/>
    <data xsi:type="b:BVariable" name="fixedMultiplicity__Class__attribut"/>
    <data xsi:type="b:BVariable" name="Static__Class__attribut"/>
    <operations name="Optional__Class_NEW" body="Optional__Class := Optional__Class \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Instance /: Optional__Class"/>
      </param>
    </operations>
    <operations name="Mondatory__Class_NEW" body="Mondatory__Class := Mondatory__Class \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="Instance /: Mondatory__Class"/>
      </param>
    </operations>
    <operations name="Set__Class_NEW" body="Set__Class := Set__Class \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance /: Set__Class"/>
      </param>
    </operations>
    <operations name="NonEmptySet__Class_NEW" body="NonEmptySet__Class := NonEmptySet__Class \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="Instance /: NonEmptySet__Class"/>
      </param>
    </operations>
    <operations name="OrderedSet__Class_NEW" body="OrderedSet__Class := OrderedSet__Class \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance /: OrderedSet__Class"/>
      </param>
    </operations>
    <operations name="List__Class_NEW" body="List__Class := List__Class \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="Instance /: List__Class"/>
      </param>
    </operations>
    <operations name="fixedMultiplicity__Class_NEW" body="fixedMultiplicity__Class := fixedMultiplicity__Class \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.12">
        <typingPredicate operator="In" type="//@machines.0/@data.12"/>
        <typingPredicate name="Instance /: fixedMultiplicity__Class"/>
      </param>
    </operations>
    <operations name="Static__Class_NEW" body="Static__Class := Static__Class \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.14">
        <typingPredicate operator="In" type="//@machines.0/@data.14"/>
        <typingPredicate name="Instance /: Static__Class"/>
      </param>
    </operations>
    <operations name="ReadOnly__Class_NEW" body="ReadOnly__Class := ReadOnly__Class \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.16">
        <typingPredicate operator="In" type="//@machines.0/@data.16"/>
        <typingPredicate name="Instance /: ReadOnly__Class"/>
      </param>
    </operations>
    <operations name="Optional__Class_Free" body="Optional__Class := Optional__Class - {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="Mondatory__Class_Free" body="Mondatory__Class := Mondatory__Class - {Instance}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
    </operations>
    <operations name="Set__Class_Free" body="Set__Class := Set__Class - {Instance}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="NonEmptySet__Class_Free" body="NonEmptySet__Class := NonEmptySet__Class - {Instance}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="OrderedSet__Class_Free" body="OrderedSet__Class := OrderedSet__Class - {Instance}">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
      </param>
    </operations>
    <operations name="List__Class_Free" body="List__Class := List__Class - {Instance}">
      <param name="Instance" type="//@machines.0/@data.11">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate operator="In" type="//@machines.0/@data.11"/>
      </param>
    </operations>
    <operations name="fixedMultiplicity__Class_Free" body="fixedMultiplicity__Class := fixedMultiplicity__Class - {Instance}">
      <param name="Instance" type="//@machines.0/@data.13">
        <typingPredicate operator="In" type="//@machines.0/@data.12"/>
        <typingPredicate operator="In" type="//@machines.0/@data.13"/>
      </param>
    </operations>
    <operations name="Static__Class_Free" body="Static__Class := Static__Class - {Instance}">
      <param name="Instance" type="//@machines.0/@data.15">
        <typingPredicate operator="In" type="//@machines.0/@data.14"/>
        <typingPredicate operator="In" type="//@machines.0/@data.15"/>
      </param>
    </operations>
    <operations name="ReadOnly__Class_Free" body="ReadOnly__Class := ReadOnly__Class - {Instance}">
      <param name="Instance" type="//@machines.0/@data.17">
        <typingPredicate operator="In" type="//@machines.0/@data.16"/>
        <typingPredicate operator="In" type="//@machines.0/@data.17"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.1"/>
    <initialisation init="//@machines.0/@data.3"/>
    <initialisation init="//@machines.0/@data.5"/>
    <initialisation init="//@machines.0/@data.7"/>
    <initialisation init="//@machines.0/@data.9"/>
    <initialisation init="//@machines.0/@data.11"/>
    <initialisation init="//@machines.0/@data.13"/>
    <initialisation init="//@machines.0/@data.15"/>
    <initialisation init="//@machines.0/@data.17"/>
  </machines>
</b:BSpec>
