package telran.measure;

public enum LengthUnit {
	MM(1), CM(10), DM(100), M(1_000), KM(1_000_000);

	float value;

	LengthUnit(float value) {
		this.value = value;
	}
	
	public Length between(Length length1, Length length2) {
		float res = length2.convert(this).getAmount() - length1.convert(this).getAmount();
		return new Length(res, this);
	}

}
