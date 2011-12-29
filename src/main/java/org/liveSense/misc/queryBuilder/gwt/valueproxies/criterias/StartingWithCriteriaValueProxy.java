package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.StartingWithCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(StartingWithCriteria.class)
public interface StartingWithCriteriaValueProxy extends AbstractCriteriaValueProxy {	

	public ValueValueProxy getValue();
	
	public void setValue(ValueValueProxy value);
	
}
