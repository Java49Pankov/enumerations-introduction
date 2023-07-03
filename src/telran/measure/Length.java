package telran.measure;

public class Length implements Comparable<Length> {
	private float amount;
	private LengthUnit unit;

	public Length(float amount, LengthUnit unit) {
		this.unit = unit;
		this.amount = amount;
	}

	public LengthUnit getUnit() {
		return unit;
	}

	public float getAmount() {
		return amount;
	}

	@Override
	public int compareTo(Length obj) {
		return Float.compare(amount, obj.convert(unit).amount);

	}

	@Override
	public boolean equals(Object obj) {
		return compareTo((Length) obj) == 0;
	}

	public String toString() {
		return Float.toString(amount) + unit.toString();
	}

	public Length convert(LengthUnit lengthUnit) {
		return new Length(amount * unit.value / lengthUnit.value, lengthUnit);
	}

}
