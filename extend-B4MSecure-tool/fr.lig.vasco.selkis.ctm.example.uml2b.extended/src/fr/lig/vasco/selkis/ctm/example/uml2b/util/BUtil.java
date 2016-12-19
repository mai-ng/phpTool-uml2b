package fr.lig.vasco.selkis.ctm.example.uml2b.util;

import fr.lig.vasco.models.b.BAbstractSet;
import fr.lig.vasco.models.b.BPackage;
import fr.lig.vasco.models.b.BPowType;
import fr.lig.vasco.models.b.BType;
import fr.lig.vasco.models.b.BVariable;

public class BUtil {

	public static BAbstractSet getVariableType(BVariable variable) {
		// System.out.println("DEBUG - getVariableType("+variable.getName()+") type:"+variable.getType());
		if (BPackage.Literals.BABSTRACT_SET.isInstance(variable.getType()))
			return (BAbstractSet) variable.getType();
		else if (BPackage.Literals.BVARIABLE.isInstance(variable.getType())) {
			return getVariableType((BVariable) variable.getType());
		} else if (BPackage.Literals.BPOW_TYPE.isInstance(variable.getType())) {
			BType type = ((BPowType) variable.getType()).getPow();
			if (BPackage.Literals.BVARIABLE.isInstance(type))
				return getVariableType((BVariable) type);
			else if (BPackage.Literals.BABSTRACT_SET.isInstance(type))
				return (BAbstractSet) type;
		}
		return null;
	}

}
