package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.EqualCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(EqualCriteria.class)
public interface EqualCriteriaValueProxy extends ValueProxy, CriteriaValueProxy {
	
	public ValueValueProxy getValue();
	
	public void setValue(
		ValueValueProxy value);
	
}
