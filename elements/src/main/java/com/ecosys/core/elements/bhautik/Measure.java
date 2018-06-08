package com.ecosys.core.elements.bhautik;

public class Measure {
	public enum		type 	{
		LENGHT,
		TIME,
		DEPTH,
		WEIGHT,
		FORCE,
		ACCELERATION,
		DENSITY,
		TEMPERATURE
	};
	Integer		value;
	String		unit;
}
