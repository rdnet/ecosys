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
	protected Integer		value;
	protected String		unit;
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
}
