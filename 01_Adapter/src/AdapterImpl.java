

public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("half 함수 호출!");
		return (float) Math.half(f.doubleValue());
	}

}
