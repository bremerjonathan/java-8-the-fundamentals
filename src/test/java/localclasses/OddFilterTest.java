package localclasses;

import org.junit.Assert;
import org.junit.Test;

public class OddFilterTest {

	@Test
	public void shouldReturnTrueFor3() {
		OddFilter oddFilter = new OddFilter();
		Assert.assertTrue(oddFilter.filter(3));
	}

	@Test
	public void shouldReturnFalseFor8() {
		OddFilter oddFilter = new OddFilter();
		Assert.assertFalse(oddFilter.filter(8));
	}
	
	@Test
	public void shouldReturnFalseForNull() {
		OddFilter oddFilter = new OddFilter();
		Assert.assertFalse(oddFilter.filter(null));
	}

}
