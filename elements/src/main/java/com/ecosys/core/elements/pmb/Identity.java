package com.ecosys.core.elements.pmb;

public class Identity {
	String		shortName;
	ObjectId	identity;		// Unique . separated identity of an object
	
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public ObjectId getIdentity() {
		return identity;
	}
	public void setIdentity(ObjectId identity) {
		this.identity = identity;
	}
	
}
