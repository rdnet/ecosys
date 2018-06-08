package com.ecosys.core.elements.relativity;

import com.ecosys.core.elements.pmb.ObjectBase;

public class Connection {
	public enum 		type {
		SEQUENCE,
		RESTING,
		ASSEMBLY
	};
	ObjectBase			from;
	ObjectBase			to;
	Connection			twin;
}
