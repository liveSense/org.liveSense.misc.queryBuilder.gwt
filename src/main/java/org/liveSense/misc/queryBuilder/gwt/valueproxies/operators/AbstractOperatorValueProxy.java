package org.liveSense.misc.queryBuilder.gwt.valueproxies.operators;

import java.util.List;

import org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias.AbstractCriteriaValueProxy;
import org.liveSense.misc.queryBuilder.operands.AbstractOperand;

import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(AbstractOperand.class)
public interface AbstractOperatorValueProxy {

	public List<?> getParams();

	public AbstractOperatorValueProxy addCriteria(AbstractCriteriaValueProxy criteria);

	public AbstractOperatorValueProxy addOperator(AbstractOperatorValueProxy operator);

	public AbstractOperatorValueProxy addCriterias(AbstractCriteriaValueProxy[] criteria);

	public AbstractOperatorValueProxy addOperators(AbstractOperatorValueProxy[] operators);

	public AbstractOperatorValueProxy addParams(List<?> params);

	
}
