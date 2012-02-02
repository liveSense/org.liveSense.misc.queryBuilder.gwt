package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.LikeCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(LikeCriteria.class)
public interface LikeCriteriaValueProxy extends ValueProxy, CriteriaValueProxy {

	public ValueValueProxy getValueValue();
	
	public void setValueValue(
		ValueValueProxy value);
		
}
