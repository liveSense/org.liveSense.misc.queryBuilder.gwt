package org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias;

import java.util.List;

import org.liveSense.misc.queryBuilder.criterias.InCriteria;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.ValueValueProxy;

import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(InCriteria.class)
public interface InCriteriaValueProxy extends AbstractCriteriaValueProxy {	
	
	public List<ValueValueProxy> getValues();

	public void setValues(List<ValueValueProxy> values);

}
