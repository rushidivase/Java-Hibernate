package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Account_Info")
public class Account {

	@Id
	@SequenceGenerator(sequenceName = "Account_Sequence", initialValue = 123456, allocationSize = 1, name = "ac_seq")
	@GeneratedValue(generator = "ac_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "Account_No")
	private long acNo;

	@Column(name = "Account_Name")
	private String acName;

	@Column(name = "Account_Address")
	private String address;

	@Column(name = "Account_MobileNo")
	private long mobileNo;

	@Column(name = "Account_AdharNo")
	private long aadharNo;

	@Column(name = "Account_PanNo")
	private String panNo;

	@Column(name = "Account_Balance")
	private double balance;

	@Column(name = "Account_AcType")
	private String acType;
	
	@Column(name = "Account_Gender")
	private String gender;

}