package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.LessCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(LessCriteria.class)
public interface LessCriteriaValueProxy extends ValueProxy, AbstractCriteriaValueProxy {	

	public ValueValueProxy getValue();
	
	public void setValue(
		ValueValueProxy value);

}
