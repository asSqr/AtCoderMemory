package com.example.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


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

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="problem_url")
	private String problemUrl;

	@Column(name="solved_flag")
	private Boolean solvedFlag;

	@Column(name="updated_at")
	private Timestamp updatedAt;

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

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
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

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}