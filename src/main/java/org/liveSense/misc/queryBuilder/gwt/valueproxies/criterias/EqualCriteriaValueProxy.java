package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import org.liveSense.misc.queryBuilder.criterias.EqualCriteria;
import org.liveSense.misc.queryBuilder.domains.Criteria;
import org.liveSense.misc.queryBuilder.beans.Value;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(EqualCriteria.class)
public interface EqualCriteriaValueProxy extends AbstractCriteriaValueProxy {
	
	public ValueProxy getValue();
	
	public void setValue(
		ValueProxy value);
	
}
