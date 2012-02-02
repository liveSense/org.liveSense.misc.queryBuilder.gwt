package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.StartingWithCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(StartingWithCriteria.class)
public interface StartingWithCriteriaValueProxy extends ValueProxy, CriteriaValueProxy {	

	public ValueValueProxy getValueValue();
	
	public void setValueValue(
		ValueValueProxy value);
	
}
