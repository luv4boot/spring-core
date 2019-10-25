package com.luv4boot.springcore.references;

public class Scores {
	private Double maths;
	private Double physis;
	private Double chemistry;

	public Double getMaths() {
		return maths;
	}

	public void setMaths(Double maths) {
		this.maths = maths;
	}

	public Double getPhysis() {
		return physis;
	}

	public void setPhysis(Double physis) {
		this.physis = physis;
	}

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return String.format("Scores [maths=%s, physis=%s, chemistry=%s]", maths, physis, chemistry);
	}

}
