package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.LessOrEqualCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(LessOrEqualCriteria.class)
public interface LessOrEqualCriteriaValueProxy extends ValueProxy, CriteriaValueProxy {	

	public ValueValueProxy getValueValue();
	
	public void setValueValue(
		ValueValueProxy value);

}
