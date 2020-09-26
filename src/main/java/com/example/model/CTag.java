package com.example.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the c_tags database table.
 * 
 */
@Entity
@Table(name="c_tags")
@NamedQuery(name="CTag.findAll", query="SELECT c FROM CTag c")
public class CTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uuid;

	@Column(name="cards_uuid")
	private String cardsUuid;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="tag_name")
	private String tagName;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	public CTag() {
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

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}