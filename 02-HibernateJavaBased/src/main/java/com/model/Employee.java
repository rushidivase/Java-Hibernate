package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DynamicUpdate
public class Employee {

	@Id
	@GeneratedValue(generator = "eid", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "eid", sequenceName = "EmployeeIds", initialValue = 10001, allocationSize = 1)
	private int eid;
	private String ename;
	private double salary;
	private long mono;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getMono() {
		return mono;
	}

	public void setMono(long mono) {
		this.mono = mono;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", mono=" + mono + "]";
	}

}
