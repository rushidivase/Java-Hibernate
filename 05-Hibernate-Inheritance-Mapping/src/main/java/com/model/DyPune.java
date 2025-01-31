package com.model;

import javax.persistence.Entity;

@Entity
public class DyPune extends DyPatil {

	private boolean hostelFacility;

	public boolean isHostelFacility() {
		return hostelFacility;
	}

	public void setHostelFacility(boolean hostelFacility) {
		this.hostelFacility = hostelFacility;
	}

	@Override
	public String toString() {
		return "DyPune [hostelFacility=" + hostelFacility + "]";
	}

}
