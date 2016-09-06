package localclasses;

public class OddFilter implements Filter<Integer> {

	@Override
	public boolean filter(Integer integer) {
		return integer != null && integer%2 == 1;
	}

}
