package com.ecosys.core.elements.behavior;

import com.ecosys.core.elements.enums.MessageType;

public class Sensor {
	MessageType			sensorType;
	
	@Deprecated
	public Sensor() {
	}
	
	public Sensor(MessageType type) {
		sensorType = type;
	}

	public MessageType getSensorType() {
		return sensorType;
	}

	public void setSensorType(MessageType sensorType) {
		this.sensorType = sensorType;
	}
	
}
