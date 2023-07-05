package telran.measure;

public class Length implements Comparable<Length> {
	private final float amount;
	private final LengthUnit unit;

	public Length(float amount, LengthUnit unit) {
		this.amount = amount;
		this.unit = unit;
	}

	@Override
	public boolean equals(Object obj) {
		return compareTo((Length) obj) == 0;
	}

	@Override
	public int compareTo(Length o) {
		return Float.compare(amount, o.convert(unit).amount);
	}

	public Length convert(LengthUnit unit) {
		return new Length(amount * this.unit.getValue() / unit.getValue(), unit);
	}

	@Override
	public String toString() {
		String amountStr = Float.toString(amount);
		return amountStr + unit.toString();
	}

	public float getAmount() {
		return amount;
	}

	public LengthUnit getUnit() {
		return unit;
	}

}