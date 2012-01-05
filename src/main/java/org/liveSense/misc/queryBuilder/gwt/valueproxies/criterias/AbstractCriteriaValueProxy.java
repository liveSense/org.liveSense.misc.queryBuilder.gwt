package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.AbstractCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.operands.AbstractOperandValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;


@ProxyFor(AbstractCriteria.class)
public interface AbstractCriteriaValueProxy extends ValueProxy {

	public AbstractOperandValueProxy getOperand();
	
	public void setOperand(AbstractOperandValueProxy operand);
		
}
