package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.GreaterOrEqualCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(GreaterOrEqualCriteria.class)
public interface GreaterOrEqualCriteriaValueProxy extends ValueProxy, CriteriaValueProxy {	

	public ValueValueProxy getValueValue();
	
	public void setValueValue(
		ValueValueProxy value);
}
