package com.cts.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@Entity
public class AccountDetails {
	@Override
	public String toString() {
		return "AccountDetails [pan=" + pan + ", accountnumber=" + accountnumber + ", ifsccode=" + ifsccode
				+ ", bankname=" + bankname + ", micrcode=" + micrcode + "]";
	}
	@Id
	private Long pan;
	private Long accountnumber;
	private String ifsccode;
	private String bankname;
	private Long  micrcode;
	
	public Long getPan() {
		return pan;
	}
	public void setPan(Long pan) {
		this.pan = pan;
	}
	public Long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public Long getMicrcode() {
		return micrcode;
	}
	public void setMicrcode(Long micrcode) {
		this.micrcode = micrcode;
	}
	
	
}
