package org.liveSense.misc.queryBuilder.gwt.valueproxies.clauses;

import org.liveSense.misc.queryBuilder.clauses.DefaultLimitClause;
import org.liveSense.misc.queryBuilder.domains.LimitClause;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(DefaultLimitClause.class)
public interface LimitClauseValueProxy extends ValueProxy, LimitClause {
	

}
