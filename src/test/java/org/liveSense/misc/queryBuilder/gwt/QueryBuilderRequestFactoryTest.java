package org.liveSense.misc.queryBuilder.gwt;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.liveSense.misc.queryBuilder.beans.Value;
import org.liveSense.misc.queryBuilder.criterias.EqualCriteria;
import org.liveSense.misc.queryBuilder.gwt.QueryBuilderTestHelper.QueryBuilderRequestContext;
import org.liveSense.misc.queryBuilder.gwt.QueryBuilderTestHelper.QueryBuilderRequestFactory;
import org.liveSense.misc.queryBuilder.gwt.QueryBuilderTestHelper.QueryBuilderService;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.beans.CompositeValueProxy;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.criterias.EqualCriteriaValueProxy;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.operands.OperandValueProxy;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.operators.AndOperatorValueProxy;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.operators.NotOperatorValueProxy;
import org.liveSense.misc.queryBuilder.gwt.valueproxies.operators.OperatorValueProxy;
import org.liveSense.misc.queryBuilder.operands.DefaultOperand;
import org.liveSense.misc.queryBuilder.operators.AbstractOperator;
import org.liveSense.misc.queryBuilder.operators.AndOperator;
import org.liveSense.misc.queryBuilder.operators.NotOperator;
import org.liveSense.misc.queryBuilder.operators.OrOperator;
import org.mockito.ArgumentCaptor;

import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;
import com.google.web.bindery.requestfactory.shared.Receiver;

public class QueryBuilderRequestFactoryTest {

  private QueryBuilderService mockService;
  private QueryBuilderRequestFactory mockFactory;

  private QueryBuilderService cachedService;
  private QueryBuilderRequestFactory cachedFactory;

  @Before
  public void setup(){
    mockService = RequestFactoryHelper.getMockService( QueryBuilderService.class );
    mockFactory = RequestFactoryHelper.createMock( QueryBuilderRequestFactory.class );
    cachedService = RequestFactoryHelper.getCachedService( QueryBuilderService.class );
    cachedFactory = RequestFactoryHelper.createCached( QueryBuilderRequestFactory.class );
  }
  
  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Test
  public void testPolymorphism() {
    AbstractOperator abstractOperator = new AbstractOperator();
    AbstractOperator andOperator = new AndOperator();
    AbstractOperator orOperator = new OrOperator();
    AbstractOperator notOperator = new NotOperator();

    when( mockService.getOperators() ).thenReturn( Arrays.asList( abstractOperator, andOperator, orOperator, notOperator ) );
    Receiver<List<OperatorValueProxy>> receiver = mock( Receiver.class );
    
    mockFactory.context().getOperators().fire( receiver );
    
    ArgumentCaptor<List<OperatorValueProxy>> captor = (ArgumentCaptor)ArgumentCaptor.forClass( List.class );
    verify( receiver ).onSuccess( captor.capture() );
    List<OperatorValueProxy> operatorProxyList = captor.getValue();
    assertTrue( operatorProxyList.get( 0 ) instanceof OperatorValueProxy );
    assertTrue( operatorProxyList.get( 1 ) instanceof AndOperatorValueProxy );
    assertTrue( operatorProxyList.get( 2 ) instanceof OperatorValueProxy );
    assertTrue( operatorProxyList.get( 3 ) instanceof NotOperatorValueProxy );
  }

  
  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Test
  public void testOperator() {

		// Composite test

		AbstractOperator operator = new AndOperator();
		EqualCriteria foreignKeyCriteria = new EqualCriteria();
		DefaultOperand fieldName = new DefaultOperand();
		Value fieldNameValue = new Value();
		Value value = new Value();

		fieldNameValue.setValueAsString("testName");
		fieldName.setSource(fieldNameValue);
		foreignKeyCriteria.setOperand(fieldName);
		value.setValueAsInteger(1);
		foreignKeyCriteria.setValue(value);
		operator.setEqualCriteria(foreignKeyCriteria);

		when( mockService.getOperator() ).thenReturn( operator);
	    Receiver<OperatorValueProxy> receiver = mock( Receiver.class );
	    
	    mockFactory.context().getOperator().fire( receiver );
	    
	    ArgumentCaptor<OperatorValueProxy> captor = (ArgumentCaptor)ArgumentCaptor.forClass( OperatorValueProxy.class );
	    verify( receiver ).onSuccess( captor.capture() );
	    OperatorValueProxy operatorProxy = captor.getValue();
    
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Test
  public void testOperator2() {

	  /*
		OperatorValueProxy operator = factory.andOperatorValueProxy();
		EqualCriteriaValueProxy foreignKeyCriteria = factory.equalCriteriaValueProxy();
		OperandValueProxy fieldName = factory.defaultOperandValueProxy();
		CompositeValueProxy fieldNameValue = factory.compositeValueProxy();
		CompositeValueProxy value = factory.compositeValueProxy();
	*/
	  
	    QueryBuilderRequestContext req = cachedFactory.context();
		OperatorValueProxy operator = req.create(AndOperatorValueProxy.class);
		EqualCriteriaValueProxy foreignKeyCriteria = req.create(EqualCriteriaValueProxy.class);
		OperandValueProxy fieldName = req.create(OperandValueProxy.class);
		CompositeValueProxy fieldNameValue = req.create(CompositeValueProxy.class);
		CompositeValueProxy value = req.create(CompositeValueProxy.class);

		fieldNameValue.setValueAsString("testName");
		fieldName.setSource(fieldNameValue);
		foreignKeyCriteria.setOperand(fieldName);
		value.setValueAsInteger(1);
		foreignKeyCriteria.setValue(value);
		operator.setEqualCriteria(foreignKeyCriteria);
		Assert.assertEquals("{\"equalCriteria\":{\"value\":{\"valueAsInteger\":1},\"operand\":{\"source\":{\"valueAsString\":\"testName\"}}}}", AutoBeanCodex.encode(AutoBeanUtils.getAutoBean(operator)).getPayload());

//		when( service.setOperator(operator) ).thenReturn( operator);
	    Receiver<Void> receiver = mock( Receiver.class );
	    
	    req.setOperator(operator).fire( receiver );
	    
	    ArgumentCaptor<Void> captor = (ArgumentCaptor)ArgumentCaptor.forClass( Void.class );
	    verify( receiver ).onSuccess( captor.capture() );
	   // OperatorValueProxy operatorProxy = captor.getValue();
  }

}
