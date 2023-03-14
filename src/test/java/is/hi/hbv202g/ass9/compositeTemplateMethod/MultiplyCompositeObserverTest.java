package is.hi.hbv202g.ass9.compositeTemplateMethod;

import static org.junit.Assert.*;


import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.MultiplyPlusComposite;
import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf;
import org.junit.Before;
import org.junit.Test;

public class MultiplyCompositeObserverTest {

	private MultiplyPlusComposite multiplyComposite;

	@Before
	public void createMultiplyComposite() {
		multiplyComposite = new MultiplyPlusComposite();
	}

	@Test
	public void testOneElementMultiplyCompositeObserver() {

		NumberLeaf number2 = new NumberLeaf(2);
		multiplyComposite.add(number2);

		multiplyComposite.update(); // This will cause stuff printed on the screen: this is not tested.

		assertEquals(2, multiplyComposite.getLastObservedResult());
	}
}
