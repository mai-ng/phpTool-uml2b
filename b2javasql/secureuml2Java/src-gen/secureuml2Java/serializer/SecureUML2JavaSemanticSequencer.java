/*
 * generated by Xtext 2.10.0
 */
package secureuml2Java.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import secureuml2Java.secureUML2Java.BDom;
import secureuml2Java.secureUML2Java.BFunction;
import secureuml2Java.secureUML2Java.BInit;
import secureuml2Java.secureUML2Java.BInvariant;
import secureuml2Java.secureUML2Java.BMachine;
import secureuml2Java.secureUML2Java.BOperationCall;
import secureuml2Java.secureUML2Java.BParameter;
import secureuml2Java.secureUML2Java.BPredicate;
import secureuml2Java.secureUML2Java.BSees;
import secureuml2Java.secureUML2Java.BSubstitution;
import secureuml2Java.secureUML2Java.BTuple;
import secureuml2Java.secureUML2Java.BType;
import secureuml2Java.secureUML2Java.BVariable;
import secureuml2Java.secureUML2Java.SecureUML2JavaPackage;
import secureuml2Java.secureUML2Java.StringOperation;
import secureuml2Java.secureUML2Java.VoidOperation;
import secureuml2Java.services.SecureUML2JavaGrammarAccess;

@SuppressWarnings("all")
public class SecureUML2JavaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SecureUML2JavaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SecureUML2JavaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SecureUML2JavaPackage.BDOM:
				sequence_BDom(context, (BDom) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BFUNCTION:
				sequence_BFunction(context, (BFunction) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BINIT:
				sequence_BInit(context, (BInit) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BINVARIANT:
				sequence_BInvariant(context, (BInvariant) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BMACHINE:
				sequence_BMachine(context, (BMachine) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BOPERATION_CALL:
				sequence_BOperationCall(context, (BOperationCall) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BPARAMETER:
				sequence_BParameter(context, (BParameter) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BPREDICATE:
				sequence_BPredicate(context, (BPredicate) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BSEES:
				sequence_BSees(context, (BSees) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BSUBSTITUTION:
				sequence_BSubstitution(context, (BSubstitution) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BTUPLE:
				sequence_BTuple(context, (BTuple) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BTYPE:
				sequence_BType(context, (BType) semanticObject); 
				return; 
			case SecureUML2JavaPackage.BVARIABLE:
				sequence_BVariable(context, (BVariable) semanticObject); 
				return; 
			case SecureUML2JavaPackage.STRING_OPERATION:
				sequence_StringOperation(context, (StringOperation) semanticObject); 
				return; 
			case SecureUML2JavaPackage.VOID_OPERATION:
				sequence_VoidOperation(context, (VoidOperation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BDom returns BDom
	 *
	 * Constraint:
	 *     obj=BType
	 */
	protected void sequence_BDom(ISerializationContext context, BDom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BDOM__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BDOM__OBJ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBDomAccess().getObjBTypeParserRuleCall_2_0(), semanticObject.getObj());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BFunction returns BFunction
	 *
	 * Constraint:
	 *     (ran=ID dom=ID)
	 */
	protected void sequence_BFunction(ISerializationContext context, BFunction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BFUNCTION__RAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BFUNCTION__RAN));
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BFUNCTION__DOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BFUNCTION__DOM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBFunctionAccess().getRanIDTerminalRuleCall_0_0(), semanticObject.getRan());
		feeder.accept(grammarAccess.getBFunctionAccess().getDomIDTerminalRuleCall_2_0(), semanticObject.getDom());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BInit returns BInit
	 *
	 * Constraint:
	 *     (var=ID pair+=BTuple)
	 */
	protected void sequence_BInit(ISerializationContext context, BInit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BInvariant returns BInvariant
	 *
	 * Constraint:
	 *     ((var=ID vardif=BFunction) | (dom=ID ran=ID))
	 */
	protected void sequence_BInvariant(ISerializationContext context, BInvariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SecureUML2Java returns BMachine
	 *     BMachine returns BMachine
	 *
	 * Constraint:
	 *     (
	 *         m_name=ID 
	 *         sees+=BSees 
	 *         sees+=BSees* 
	 *         vars+=BVariable 
	 *         vars+=BVariable* 
	 *         invs+=BInvariant 
	 *         invs+=BInvariant* 
	 *         inits+=BInit 
	 *         inits+=BInit* 
	 *         vops+=VoidOperation 
	 *         vops+=VoidOperation* 
	 *         sops+=StringOperation 
	 *         sops+=StringOperation*
	 *     )
	 */
	protected void sequence_BMachine(ISerializationContext context, BMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BOperationCall returns BOperationCall
	 *
	 * Constraint:
	 *     (op=ID par=ID)
	 */
	protected void sequence_BOperationCall(ISerializationContext context, BOperationCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BOPERATION_CALL__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BOPERATION_CALL__OP));
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BOPERATION_CALL__PAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BOPERATION_CALL__PAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBOperationCallAccess().getOpIDTerminalRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBOperationCallAccess().getParIDTerminalRuleCall_2_0(), semanticObject.getPar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BParameter returns BParameter
	 *
	 * Constraint:
	 *     (p_name=ID type=BType)
	 */
	protected void sequence_BParameter(ISerializationContext context, BParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BPARAMETER__PNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BPARAMETER__PNAME));
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BPARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BPARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBParameterAccess().getP_nameIDTerminalRuleCall_0_0(), semanticObject.getP_name());
		feeder.accept(grammarAccess.getBParameterAccess().getTypeBTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BPredicate returns BPredicate
	 *
	 * Constraint:
	 *     ((pleft=BType | pleft=BTuple) (pright=BDom | pright=BType))
	 */
	protected void sequence_BPredicate(ISerializationContext context, BPredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BSees returns BSees
	 *
	 * Constraint:
	 *     m_name=ID
	 */
	protected void sequence_BSees(ISerializationContext context, BSees semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BSEES__MNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BSEES__MNAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBSeesAccess().getM_nameIDTerminalRuleCall_0(), semanticObject.getM_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BSubstitution returns BSubstitution
	 *
	 * Constraint:
	 *     ((sleft=BType | sleft=BOperationCall) sright=ID)
	 */
	protected void sequence_BSubstitution(ISerializationContext context, BSubstitution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BTuple returns BTuple
	 *
	 * Constraint:
	 *     ((ran=BType | ran=BOperationCall) dom=ID)
	 */
	protected void sequence_BTuple(ISerializationContext context, BTuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BType returns BType
	 *
	 * Constraint:
	 *     type_name=ID
	 */
	protected void sequence_BType(ISerializationContext context, BType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BTYPE__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BTYPE__TYPE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBTypeAccess().getType_nameIDTerminalRuleCall_0(), semanticObject.getType_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BVariable returns BVariable
	 *
	 * Constraint:
	 *     var_name=ID
	 */
	protected void sequence_BVariable(ISerializationContext context, BVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecureUML2JavaPackage.Literals.BVARIABLE__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecureUML2JavaPackage.Literals.BVARIABLE__VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBVariableAccess().getVar_nameIDTerminalRuleCall_0(), semanticObject.getVar_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StringOperation returns StringOperation
	 *
	 * Constraint:
	 *     (
	 *         res1=ID 
	 *         op_name=ID 
	 *         (pList+=ID pList+=ID*)? 
	 *         params+=BParameter 
	 *         params+=BParameter* 
	 *         pres1+=BPredicate 
	 *         pres1+=BPredicate* 
	 *         pres2+=BPredicate 
	 *         pres2+=BPredicate* 
	 *         subif=BSubstitution 
	 *         subelse2=BSubstitution 
	 *         subelse1=BSubstitution
	 *     )
	 */
	protected void sequence_StringOperation(ISerializationContext context, StringOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VoidOperation returns VoidOperation
	 *
	 * Constraint:
	 *     (
	 *         op_name=ID 
	 *         (pList+=ID pList+=ID*)? 
	 *         params+=BParameter 
	 *         params+=BParameter* 
	 *         pre+=BPredicate* 
	 *         subs+=BSubstitution 
	 *         subs+=BSubstitution*
	 *     )
	 */
	protected void sequence_VoidOperation(ISerializationContext context, VoidOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
