package org.liveSense.misc.queryBuilder.gwt.valueproxies.clauses;

import org.liveSense.misc.queryBuilder.clauses.DefaultOrderByClause;
import org.liveSense.misc.queryBuilder.domains.OrderByClause;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(DefaultOrderByClause.class)
public interface OrderByClauseValueProxy extends ValueProxy, OrderByClause {
		
}
