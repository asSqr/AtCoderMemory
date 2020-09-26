package com.example.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the c_submission_urls database table.
 * 
 */
@Entity
@Table(name="c_submission_urls")
@NamedQuery(name="CSubmissionUrl.findAll", query="SELECT c FROM CSubmissionUrl c")
public class CSubmissionUrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uuid;

	@Column(name="cards_uuid")
	private String cardsUuid;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="submission_url")
	private String submissionUrl;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	public CSubmissionUrl() {
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCardsUuid() {
		return this.cardsUuid;
	}

	public void setCardsUuid(String cardsUuid) {
		this.cardsUuid = cardsUuid;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getSubmissionUrl() {
		return this.submissionUrl;
	}

	public void setSubmissionUrl(String submissionUrl) {
		this.submissionUrl = submissionUrl;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}