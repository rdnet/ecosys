package com.ecosys.core.elements.behavior.message;

import java.util.Date;

import com.ecosys.core.elements.bhautik.GeoLocation;
import com.ecosys.core.elements.bhautik.Measure;
import com.ecosys.core.elements.enums.MessageType;
import com.ecosys.core.elements.pmb.ObjectId;

public class Message {
	protected String			payload;	// JSON Payload
	protected String			jsAttenuator;	// javascript - attenuation logic (optional)
	protected Date 				timestamp;
	protected ObjectId			originator;
	protected GeoLocation		originLocation;
	protected MessageType		type;
	protected Boolean			broadCast;
	protected ObjectId			target;		// optional - used only in point-to-point
	protected Measure			value;		// Message Value
}
