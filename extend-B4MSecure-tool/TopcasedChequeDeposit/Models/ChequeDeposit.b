<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Functional" systemMachine="//@machines.0">
  <machines name="Functional">
    <data xsi:type="b:BAbstractSet" name="STR" typing="//@machines.0/@operations.12/@param.1 //@machines.0/@operations.33/@param.1"/>
    <data xsi:type="b:BEnumSet" name="DepositStatus" typing="//@machines.0/@operations.19/@param.3 //@machines.0/@operations.36/@param.1">
      <values name="validated" type="//@sharedTypes/@sharedTypes.0"/>
      <values name="verified" type="//@sharedTypes/@sharedTypes.0"/>
      <values name="saved" type="//@sharedTypes/@sharedTypes.0"/>
      <values name="created" type="//@sharedTypes/@sharedTypes.0"/>
    </data>
    <data xsi:type="b:BVariable" name="Bank" type="//@machines.0/@data.3" typing="//@machines.0/@operations.15/@param.0 //@machines.0/@operations.25/@param.1 //@machines.0/@operations.26/@param.1">
      <typingPredicate type="//@machines.0/@data.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="BANK" typing="//@machines.0/@data.2 //@machines.0/@operations.3/@param.1 //@machines.0/@operations.11/@param.0"/>
    <data xsi:type="b:BVariable" name="Client" type="//@machines.0/@data.5" typing="//@machines.0/@operations.16/@param.0 //@machines.0/@operations.19/@param.2 //@machines.0/@operations.22/@param.0 //@machines.0/@operations.24/@param.1 //@machines.0/@operations.25/@param.0 //@machines.0/@operations.27/@param.0 //@machines.0/@operations.28/@param.0 //@machines.0/@operations.29/@param.0 //@machines.0/@operations.33/@param.0 //@machines.0/@operations.34/@param.0 //@machines.0/@operations.37/@param.0">
      <typingPredicate type="//@machines.0/@data.5"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="CLIENT" typing="//@machines.0/@data.4 //@machines.0/@operations.0/@param.0 //@machines.0/@operations.1/@param.0 //@machines.0/@operations.2/@param.0 //@machines.0/@operations.7/@param.1 //@machines.0/@operations.12/@param.0"/>
    <data xsi:type="b:BVariable" name="User" type="//@machines.0/@data.7" typing="//@machines.0/@operations.17/@param.0 //@machines.0/@operations.23/@param.0 //@machines.0/@operations.26/@param.0">
      <typingPredicate type="//@machines.0/@data.7"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="USER" typing="//@machines.0/@data.6 //@machines.0/@operations.3/@param.0 //@machines.0/@operations.4/@param.0 //@machines.0/@operations.13/@param.0"/>
    <data xsi:type="b:BVariable" name="Cheque" type="//@machines.0/@data.9" typing="//@machines.0/@operations.18/@param.0 //@machines.0/@operations.19/@param.1 //@machines.0/@operations.21/@param.0 //@machines.0/@operations.24/@param.0 //@machines.0/@operations.30/@param.0 //@machines.0/@operations.31/@param.0 //@machines.0/@operations.35/@param.0 //@machines.0/@operations.38/@param.0">
      <typingPredicate type="//@machines.0/@data.9"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="CHEQUE" typing="//@machines.0/@data.8 //@machines.0/@operations.5/@param.0 //@machines.0/@operations.6/@param.0 //@machines.0/@operations.7/@param.0 //@machines.0/@operations.8/@param.0 //@machines.0/@operations.9/@param.0 //@machines.0/@operations.10/@param.0 //@machines.0/@operations.14/@param.0"/>
    <data xsi:type="b:BVariable" name="Deposit" type="//@sharedTypes/@sharedTypes.1" typing="//@machines.0/@operations.19/@param.0 //@machines.0/@operations.20/@param.0 //@machines.0/@operations.32/@param.0 //@machines.0/@operations.36/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
    </data>
    <data xsi:type="b:BVariable" name="BankAccountOf" type="//@sharedTypes/@sharedTypes.2">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BVariable" name="WorkingBankOf" type="//@sharedTypes/@sharedTypes.3">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BVariable" name="Client__name" type="//@sharedTypes/@sharedTypes.6">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
    </data>
    <data xsi:type="b:BVariable" name="Client__amount" type="//@sharedTypes/@sharedTypes.7">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.7"/>
    </data>
    <data xsi:type="b:BVariable" name="Cheque__value" type="//@sharedTypes/@sharedTypes.8">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.8"/>
    </data>
    <data xsi:type="b:BVariable" name="Deposit__status" type="//@sharedTypes/@sharedTypes.9">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.9"/>
    </data>
    <data xsi:type="b:BVariable" name="Client__id" type="//@sharedTypes/@sharedTypes.10">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.10"/>
    </data>
    <data xsi:type="b:BVariable" name="Cheque__id" type="//@sharedTypes/@sharedTypes.11">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.11"/>
    </data>
    <operations name="Client__create">
      <param name="cl" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Client__modifyAmount">
      <param name="cl" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Client__delete" body="skip">
      <param name="cl" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="User__joinBank" body="WorkingBankOf(uu) := bb /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="uu|->bb /: WorkingBankOf /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="uu" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
      <param name="bb" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="User__leaveBank" body="WorkingBankOf := {uu} &lt;&lt;| WorkingBankOf  /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="uu : dom(WorkingBankOf) /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="uu" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="Cheque__create" body="skip">
      <param name="ch" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Cheque__delete" body="skip">
      <param name="ch" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Deposit__createDeposit" body="Deposit := Deposit \/ {ch|->cl} ||&#xD;&#xA;Deposit__status(ch, Deposit(ch)) := created /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="ch /: dom(Deposit) /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="ch" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
      <param name="cl" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Deposit__validateDeposit" body="Deposit__status(ch, Deposit(ch)) := validated /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="ch : dom(Deposit) /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="ch" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Deposit__verifyDeposit" body="Deposit__status(ch, Deposit(ch)) := verified /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="ch : dom(Deposit) /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="ch" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Deposit__saveDeposit" body="Deposit__status(ch, Deposit(ch)) := saved /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="ch : dom(Deposit) /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="ch" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Bank_NEW" body="Bank := Bank \/ {Instance} &#xA; || BankAccountOf:= BankAccountOf \/ (BankAccountOf__clientValues*{Instance}) &#xA; || WorkingBankOf:= WorkingBankOf \/ (WorkingBankOf__userValues*{Instance})">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: Bank"/>
      </param>
      <param name="BankAccountOf__clientValues" type="//@sharedTypes/@sharedTypes.4">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
        <typingPredicate name="BankAccountOf__clientValues/={}&#xA; &amp; BankAccountOf[BankAccountOf__clientValues]={}"/>
      </param>
      <param name="WorkingBankOf__userValues" type="//@sharedTypes/@sharedTypes.5">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
        <typingPredicate name="WorkingBankOf__userValues/={}&#xA; &amp; WorkingBankOf[WorkingBankOf__userValues]={}"/>
      </param>
    </operations>
    <operations name="Client_NEW" body="Client := Client \/ {Instance}&#xA; || Client__name:= Client__name \/ {(Instance|->Client__nameValue)}&#xA; || Client__amount:= Client__amount \/ {(Instance|->Client__amountValue)}&#xA; || Client__id:= Client__id \/ {(Instance|->Client__idValue)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: Client"/>
      </param>
      <param name="Client__nameValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="Client__amountValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
      <param name="Client__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Client__idValue /:ran(Client__id)"/>
      </param>
    </operations>
    <operations name="User_NEW" body="User := User \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="Instance /: User"/>
      </param>
    </operations>
    <operations name="Cheque_NEW" body="Cheque := Cheque \/ {Instance}&#xA; || Cheque__value:= Cheque__value \/ {(Instance|->Cheque__valueValue)}&#xA; || Cheque__id:= Cheque__id \/ {(Instance|->Cheque__idValue)}">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate name="Instance /: Cheque"/>
      </param>
      <param name="Cheque__valueValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
      <param name="Cheque__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Cheque__idValue /:ran(Cheque__id)"/>
      </param>
    </operations>
    <operations name="Bank_Free" body="Bank := Bank - {Instance}&#xA; || BankAccountOf:= BankAccountOf|>> {Instance}&#xA; || WorkingBankOf:= WorkingBankOf|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Client_Free" body="Client := Client - {Instance}&#xA; || Deposit:= Deposit|>> {Instance}&#xA; || BankAccountOf:= {Instance}&lt;&lt;|BankAccountOf&#xA; || Client__id:= {Instance}&lt;&lt;|Client__id&#xA; || Client__name:= {Instance}&lt;&lt;|Client__name&#xA; || Client__amount:= {Instance}&lt;&lt;|Client__amount">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name=" !c2.(c2:BankAccountOf[{Instance}] =>#cc.(cc:BankAccountOf~[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="User_Free" body="User := User - {Instance}&#xA; || WorkingBankOf:= {Instance}&lt;&lt;|WorkingBankOf">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name=" !c2.(c2:WorkingBankOf[{Instance}] =>#cc.(cc:WorkingBankOf~[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="Cheque_Free" body="Cheque := Cheque - {Instance}&#xA; || Deposit:= {Instance}&lt;&lt;|Deposit&#xA; || Cheque__id:= {Instance}&lt;&lt;|Cheque__id&#xA; || Cheque__value:= {Instance}&lt;&lt;|Cheque__value">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Deposit_NEW" body="Deposit := Deposit \/ {Instance}&#xA; || Deposit__status:= Deposit__status \/ {(Instance|->Deposit__statusValue)}">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate name="Instance : Cheque*Client"/>
        <typingPredicate name="Instance /: Deposit"/>
      </param>
      <param name="ChequeInstance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="ChequeInstance /: dom(Deposit)"/>
      </param>
      <param name="ClientInstance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="( ChequeInstance|->ClientInstance )= Instance"/>
      </param>
      <param name="Deposit__statusValue" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="Deposit_Free" body="Deposit := Deposit - {Instance}&#xA; || Deposit__status:= {Instance}&lt;&lt;|Deposit__status">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
    </operations>
    <operations name="Cheque__GetDeposit" body="returnedData := Deposit(Instance)">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance : dom(Deposit)"/>
      </param>
    </operations>
    <operations name="Client__GetBankAccountOf" body="returnedData := BankAccountOf(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance : dom(BankAccountOf)"/>
      </param>
    </operations>
    <operations name="User__GetWorkingBankOf" body="returnedData := WorkingBankOf(Instance)">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="Instance : dom(WorkingBankOf)"/>
      </param>
    </operations>
    <operations name="Cheque__SetDeposit" body="Deposit:= ({Instance}&lt;&lt;|Deposit)\/ {(Instance|-> Deposit__clientValue)}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
      <param name="Deposit__clientValue" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="(Instance|-> Deposit__clientValue) /: Deposit"/>
      </param>
    </operations>
    <operations name="Client__SetBankAccountOf" body="BankAccountOf:= ({Instance}&lt;&lt;|BankAccountOf)\/ {(Instance|-> BankAccountOf__bankValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="BankAccountOf__bankValue" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(Instance|-> BankAccountOf__bankValue) /: BankAccountOf"/>
        <typingPredicate name="#cc.(cc: Client &amp; cc/=Instance &amp; cc: BankAccountOf~[BankAccountOf[{Instance}]])"/>
      </param>
    </operations>
    <operations name="User__SetWorkingBankOf" body="WorkingBankOf:= ({Instance}&lt;&lt;|WorkingBankOf)\/ {(Instance|-> WorkingBankOf__bankValue)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
      <param name="WorkingBankOf__bankValue" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(Instance|-> WorkingBankOf__bankValue) /: WorkingBankOf"/>
        <typingPredicate name="#cc.(cc: User &amp; cc/=Instance &amp; cc: WorkingBankOf~[WorkingBankOf[{Instance}]])"/>
      </param>
    </operations>
    <operations name="Client__GetId" body="returnedData := Client__id(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance : dom(Client__id)"/>
      </param>
    </operations>
    <operations name="Client__GetName" body="returnedData := Client__name(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance : dom(Client__name)"/>
      </param>
    </operations>
    <operations name="Client__GetAmount" body="returnedData := Client__amount(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance : dom(Client__amount)"/>
      </param>
    </operations>
    <operations name="Cheque__GetId" body="returnedData := Cheque__id(Instance)">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance : dom(Cheque__id)"/>
      </param>
    </operations>
    <operations name="Cheque__GetValue" body="returnedData := Cheque__value(Instance)">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance : dom(Cheque__value)"/>
      </param>
    </operations>
    <operations name="Deposit__GetStatus" body="returnedData := Deposit__status(Instance)">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="Instance : dom(Deposit__status)"/>
      </param>
    </operations>
    <operations name="Client__SetName" body="Client__name:= ({Instance}&lt;&lt;|Client__name)\/ {(Instance|-> Client__nameValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="Client__nameValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="(Instance|-> Client__nameValue) /: Client__name"/>
      </param>
    </operations>
    <operations name="Client__SetAmount" body="Client__amount:= ({Instance}&lt;&lt;|Client__amount)\/ {(Instance|-> Client__amountValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="Client__amountValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> Client__amountValue) /: Client__amount"/>
      </param>
    </operations>
    <operations name="Cheque__SetValue" body="Cheque__value:= ({Instance}&lt;&lt;|Cheque__value)\/ {(Instance|-> Cheque__valueValue)}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
      <param name="Cheque__valueValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> Cheque__valueValue) /: Cheque__value"/>
      </param>
    </operations>
    <operations name="Deposit__SetStatus" body="Deposit__status:= ({Instance}&lt;&lt;|Deposit__status)\/ {(Instance|-> Deposit__statusValue)}">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
      <param name="Deposit__statusValue" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="(Instance|-> Deposit__statusValue) /: Deposit__status"/>
      </param>
    </operations>
    <operations name="Client__SetId" body="Client__id:= ({Instance}&lt;&lt;|Client__id)\/ {(Instance|-> Client__idValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="Client__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Client__idValue /: ran(Client__id)"/>
      </param>
    </operations>
    <operations name="Cheque__SetId" body="Cheque__id:= ({Instance}&lt;&lt;|Cheque__id)\/ {(Instance|-> Cheque__idValue)}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
      <param name="Cheque__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Cheque__idValue /: ran(Cheque__id)"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
    <initialisation init="//@machines.0/@data.6"/>
    <initialisation init="//@machines.0/@data.8"/>
    <initialisation init="//@machines.0/@data.10"/>
    <initialisation init="//@machines.0/@data.11"/>
    <initialisation init="//@machines.0/@data.12"/>
    <initialisation init="//@machines.0/@data.13"/>
    <initialisation init="//@machines.0/@data.14"/>
    <initialisation init="//@machines.0/@data.15"/>
    <initialisation init="//@machines.0/@data.16"/>
    <initialisation init="//@machines.0/@data.17"/>
    <initialisation init="//@machines.0/@data.18"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@data.1/@values.0 //@machines.0/@data.1/@values.1 //@machines.0/@data.1/@values.2 //@machines.0/@data.1/@values.3 //@machines.0/@operations.12/@param.2 //@machines.0/@operations.14/@param.1 //@machines.0/@operations.12/@param.3 //@machines.0/@operations.14/@param.2 //@machines.0/@operations.34/@param.1 //@machines.0/@operations.35/@param.1 //@machines.0/@operations.37/@param.1 //@machines.0/@operations.38/@param.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.10" expression="PartialFunction" dom="//@machines.0/@data.8" ran="//@machines.0/@data.4"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.11" expression="PartialSurjection" dom="//@machines.0/@data.4" ran="//@machines.0/@data.2"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.12" expression="PartialSurjection" dom="//@machines.0/@data.6" ran="//@machines.0/@data.2"/>
    <sharedTypes xsi:type="b:BPowType" typing="//@machines.0/@operations.11/@param.1" pow="//@machines.0/@data.4"/>
    <sharedTypes xsi:type="b:BPowType" typing="//@machines.0/@operations.11/@param.2" pow="//@machines.0/@data.6"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.13" expression="TotalFunction" dom="//@machines.0/@data.4" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.14" expression="TotalFunction" dom="//@machines.0/@data.4" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.15" expression="TotalFunction" dom="//@machines.0/@data.8" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.16" expression="TotalFunction" dom="//@machines.0/@data.10" ran="//@machines.0/@data.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.17" expression="TotalInjection" dom="//@machines.0/@data.4" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.18" expression="TotalInjection" dom="//@machines.0/@data.8" ran="//@sharedTypes/@sharedTypes.0"/>
  </sharedTypes>
</b:BSpec>
