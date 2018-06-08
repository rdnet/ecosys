package com.ecosys.core.elements.bhautik;

import com.ecosys.core.elements.enums.Conduction;

public class Mass {
	public 		enum type {SOLID, LIQUID, GAS};
	protected Measure		weight;
	protected Measure		density;
	protected Measure		viscocity;
	protected Conduction	electricConductor;
	protected Conduction	heatConductor;
	
	public Measure getWeight() {
		return weight;
	}
	public void setWeight(Measure weight) {
		this.weight = weight;
	}
	public Measure getDensity() {
		return density;
	}
	public void setDensity(Measure density) {
		this.density = density;
	}
	public Measure getViscocity() {
		return viscocity;
	}
	public void setViscocity(Measure viscocity) {
		this.viscocity = viscocity;
	}
	public Conduction getElectricConductor() {
		return electricConductor;
	}
	public void setElectricConductor(Conduction electricConductor) {
		this.electricConductor = electricConductor;
	}
	public Conduction getHeatConductor() {
		return heatConductor;
	}
	public void setHeatConductor(Conduction heatConductor) {
		this.heatConductor = heatConductor;
	}
}
