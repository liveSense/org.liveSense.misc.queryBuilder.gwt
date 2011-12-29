package org.liveSense.misc.queryBuilder.gwt.valueproxies.operands;

import org.liveSense.misc.queryBuilder.beans.Value;
import org.liveSense.misc.queryBuilder.domains.Operand;
import org.liveSense.misc.queryBuilder.operands.DefaultOperand;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(DefaultOperand.class)
public interface DefaultOperandValueProxy extends AbstractOperandValueProxy  {
	
	public String getQualifier();
	
	public Value getSource();
		
	public boolean isLiteral();

	public String getFunction();
	
	public void setSource(Value source);

	public void setQualifier(String qualifier);

	public void setLiteral(boolean literal);

	public void setFunction(String function);

}
