package com.luv4boot.springcore.collection.properties;

import java.util.Properties;

public class CountryAndLangs {
	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

	@Override
	public String toString() {
		return String.format("CountryAndLangs [countryAndLangs=%s]", countryAndLangs);
	}

}
