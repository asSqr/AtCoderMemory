package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the c_cards database table.
 *
 */
@Entity
@Table(name="c_cards")
@NamedQuery(name="CCard.findAll", query="SELECT c FROM CCard c")
public class CCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uuid;

	private String code;

	private String comment;

	@Column(name="problem_url")
	private String problemUrl;

	@Column(name="solved_flag")
	private Boolean solvedFlag;

	public CCard() {
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getProblemUrl() {
		return this.problemUrl;
	}

	public void setProblemUrl(String problemUrl) {
		this.problemUrl = problemUrl;
	}

	public Boolean getSolvedFlag() {
		return this.solvedFlag;
	}

	public void setSolvedFlag(Boolean solvedFlag) {
		this.solvedFlag = solvedFlag;
	}

}