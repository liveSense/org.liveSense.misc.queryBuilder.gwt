package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.DistinctFromCriteria;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(DistinctFromCriteria.class)
public interface DistinctFromCriteriaValueProxy extends ValueProxy, AbstractCriteriaValueProxy {

	public ValueProxy getValue();
	
	public void setValue(
		ValueProxy value);	
}
