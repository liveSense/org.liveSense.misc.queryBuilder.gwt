package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.AbstractCriteria;
import org.liveSense.misc.queryBuilder.domains.Operand;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.operators.AbstractOperatorValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;


@ProxyFor(AbstractCriteria.class)
public interface AbstractCriteriaValueProxy extends ValueProxy {

	public Operand getOperand();
	
	public void setOperand(AbstractOperatorValueProxy operand);
		
}
