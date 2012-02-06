package org.liveSense.misc.queryBuilder.gwt.valueproxies.operators;


import java.util.List;

import org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias.CriteriaValueProxy;
import org.liveSense.misc.queryBuilder.operators.AbstractOperator;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(AbstractOperator.class)
public interface OperatorValueProxy extends ValueProxy {

	public void setCriteria(CriteriaValueProxy criteria);

	public void setCriterias(List<CriteriaValueProxy> criteria);

	public void setOperator(OperatorValueProxy operator);

	public void setOperators(List<OperatorValueProxy> operator);
	
	public CriteriaValueProxy getCriteria();
	
	public List<CriteriaValueProxy> getCriterias();
	
	public OperatorValueProxy getOperator();

	public List<OperatorValueProxy> getOperators();
	

}
