package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.NotEqualCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(NotEqualCriteria.class)
public interface NotEqualCriteriaValueProxy extends AbstractCriteriaValueProxy {

	public ValueValueProxy getValue();
	
	public void setValue(ValueValueProxy value);

}
