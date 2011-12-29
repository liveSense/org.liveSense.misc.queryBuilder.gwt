package org.liveSense.misc.queryBuilder.gwt.valueproxies.operands;


import org.liveSense.misc.queryBuilder.beans.Value;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;
import org.liveSense.misc.queryBuilder.operands.AbstractOperand;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(AbstractOperand.class)
public interface AbstractOperandValueProxy extends ValueProxy {	

	public String getQualifier();
	
	public Value getSource();
	
	public boolean isLiteral();
	
	public String getFunction();
		
	public void setSource(ValueValueProxy source);
	
	public void setQualifier(String qualifier);

	public void setLiteral(boolean literal);

	public void setFunction(String function);
	
}