package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.BetweenCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(BetweenCriteria.class)
public interface BetweenCriteriaValueProxy extends AbstractCriteriaValueProxy {	

	public ValueValueProxy getValue1();
	
	public void setValue1(
		ValueValueProxy value1);
	
	public ValueValueProxy getValue2();
	
	public void setValue2(
		ValueValueProxy value2);

}
