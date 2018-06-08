package com.ecosys.core.elements.pmb;

import java.util.List;

import com.ecosys.core.elements.behavior.Actor;
import com.ecosys.core.elements.behavior.Sensor;
import com.ecosys.core.elements.behavior.message.Message;

public abstract class ObjectBase extends Identity {
	Actor				actor;	// ticker
	List<Sensor>		sensors;
	
	/**
	 * onMessage is called by the {@code Actor}
	 * @param payload
	 */
	protected abstract void onMessage(Message payload);
}
