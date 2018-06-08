package com.ecosys.core.elements.pmb;

import com.ecosys.core.elements.behavior.message.Message;
import com.ecosys.core.elements.bhautik.Measure;

public class Akash extends ObjectBase{
	
	String			shortName;
	String			identity;		// Unique identifier
	Measure			temperature;
	
	@Override
	protected void onMessage(Message payload) {
		// TODO Auto-generated method stub
		
	}

}
