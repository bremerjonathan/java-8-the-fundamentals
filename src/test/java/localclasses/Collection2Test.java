package localclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Collection2Test {

	private static final List<Integer> ODDS = Arrays.asList(1,5,7,9,5);
	private static final List<Integer> EVENS = Arrays.asList(4,2,6,4,2,6,8);
	@SuppressWarnings("serial")
	private static final List<Integer> ODDS_AND_EVENS = new ArrayList<Integer>() {{addAll(ODDS);addAll(EVENS);}};
	
	@Test
	public void shouldReturnTheListOfOdds() {
		List<Integer> odds = Collections2.filter(ODDS_AND_EVENS, new OddFilter());
		Assert.assertArrayEquals(ODDS.toArray(new Integer[ODDS.size()]), odds.toArray(new Integer[odds.size()]));
	}
	
}
