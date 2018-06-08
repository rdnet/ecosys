package com.ecosys.core.elements.pmb;

import com.ecosys.core.elements.behavior.message.Message;
import com.ecosys.core.elements.bhautik.Dimension;
import com.ecosys.core.elements.bhautik.GeoLocation;
import com.ecosys.core.elements.bhautik.Mass;

public class Prithvi extends ObjectBase {
	Dimension 		dimension;
	GeoLocation		center;
	GeoLocation[]  	perimeter = new GeoLocation[10];	// co-ordinates in 10 directions
	Mass			mass;
	
	@Override
	protected void onMessage(Message payload) {
		// TODO Auto-generated method stub
		
	}
}
