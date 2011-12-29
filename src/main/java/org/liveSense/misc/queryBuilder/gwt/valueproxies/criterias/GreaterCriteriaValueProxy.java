package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.GreaterCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(GreaterCriteria.class)
public interface GreaterCriteriaValueProxy extends AbstractCriteriaValueProxy {
	
	public ValueValueProxy getValue();
	
	public void setValue(
		ValueValueProxy value);
}
