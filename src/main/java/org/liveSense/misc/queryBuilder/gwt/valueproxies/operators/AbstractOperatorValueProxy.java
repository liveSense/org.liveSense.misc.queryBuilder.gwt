package org.liveSense.misc.queryBuilder.gwt.valueproxies.operators;

import java.util.List;

import org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias.AbstractCriteriaValueProxy;
import org.liveSense.misc.queryBuilder.operators.AbstractOperator;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(AbstractOperator.class)
public interface AbstractOperatorValueProxy extends ValueProxy {

	public AbstractOperatorValueProxy setCriteria(AbstractCriteriaValueProxy criteria);

	public AbstractOperatorValueProxy setOperator(AbstractOperatorValueProxy operator);

	public AbstractOperatorValueProxy setCriterias(AbstractCriteriaValueProxy[] criteria);

	public AbstractOperatorValueProxy setOperators(AbstractOperatorValueProxy[] operators);

	public AbstractOperatorValueProxy setCriterias(List<AbstractCriteriaValueProxy> criterias);

	public AbstractOperatorValueProxy setOperators(List<AbstractOperatorValueProxy> operators);
	
}
