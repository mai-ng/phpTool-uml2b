/*
 * generated by Xtext 2.10.0
 */
package secureuml2Java.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import secureuml2Java.services.SecureUML2JavaGrammarAccess;

@SuppressWarnings("all")
public class SecureUML2JavaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SecureUML2JavaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BFunction_HyphenMinusHyphenMinusGreaterThanSignKeyword_1_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_1_2_or_PlusSignHyphenMinusGreaterThanSignKeyword_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SecureUML2JavaGrammarAccess) access;
		match_BFunction_HyphenMinusHyphenMinusGreaterThanSignKeyword_1_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_1_2_or_PlusSignHyphenMinusGreaterThanSignKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBFunctionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getBFunctionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getBFunctionAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_BFunction_HyphenMinusHyphenMinusGreaterThanSignKeyword_1_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_1_2_or_PlusSignHyphenMinusGreaterThanSignKeyword_1_1.equals(syntax))
				emit_BFunction_HyphenMinusHyphenMinusGreaterThanSignKeyword_1_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_1_2_or_PlusSignHyphenMinusGreaterThanSignKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '-->' | '+->' | '<->'
	 *
	 * This ambiguous syntax occurs at:
	 *     ran=ID (ambiguity) dom=ID
	 */
	protected void emit_BFunction_HyphenMinusHyphenMinusGreaterThanSignKeyword_1_0_or_LessThanSignHyphenMinusGreaterThanSignKeyword_1_2_or_PlusSignHyphenMinusGreaterThanSignKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
