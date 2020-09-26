package com.example.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.CCard;
import com.example.model.CSubmissionUrl;
import com.example.model.CTag;
import com.example.repository.CCardRepository;
import com.example.repository.CSubmissionUrlRepository;
import com.example.repository.CTagRepository;

@Service
public class AtCoderMemoryService {

	/* カードレポジトリ. */
	@Autowired
	CCardRepository cardRepo;

	/* 提出 URL レポジトリ. */
	@Autowired
	CSubmissionUrlRepository submissionRepo;

	/* タグレポジトリ. */
	@Autowired
	CTagRepository tagRepo;

	public List<CCard> getCardList() {
		return cardRepo.findAll();
	}

	public String addCard(CCard cCard) throws Exception {
		if( cCard.getProblemUrl() == null ) {
			throw new IllegalArgumentException("problemUrl");
		}
		if( cCard.getCode() == null ) {
			throw new IllegalArgumentException("code");
		}
		if( cCard.getComment() == null ) {
			throw new IllegalArgumentException("comment");
		}
		if( cCard.getSolvedFlag() == null ) {
			throw new IllegalArgumentException("solvedFlag");
		}

		String uuid = UUID.randomUUID().toString();
		cCard.setUuid(uuid);

		Timestamp now = new Timestamp(System.currentTimeMillis());

		cCard.setCreatedAt(now);
		cCard.setUpdatedAt(now);

		cardRepo.save(cCard);

		return uuid;
	}

	public List<CSubmissionUrl> getSubmissionUrlList( String uuid ) {
		return submissionRepo.findByCardsUuid( uuid );
	}

	public String addSubmissionUrl(CSubmissionUrl cSubmissionUrl) throws Exception {
		if( cSubmissionUrl.getCardsUuid() == null ) {
			throw new IllegalArgumentException("cardsUuid");
		}
		if( cSubmissionUrl.getSubmissionUrl() == null ) {
			throw new IllegalArgumentException("submissionUrl");
		}

		String uuid = UUID.randomUUID().toString();
		cSubmissionUrl.setUuid(uuid);

		Timestamp now = new Timestamp(System.currentTimeMillis());

		cSubmissionUrl.setCreatedAt(now);
		cSubmissionUrl.setUpdatedAt(now);

		submissionRepo.save(cSubmissionUrl);

		return uuid;
	}

	public List<CTag> getTagList( String uuid ) {
		return tagRepo.findByCardsUuid( uuid );
	}

	public String addTag(CTag cTag) throws Exception {
		if( cTag.getCardsUuid() == null ) {
			throw new IllegalArgumentException("cardsUuid");
		}
		if( cTag.getTagName() == null ) {
			throw new IllegalArgumentException("tagName");
		}

		String uuid = UUID.randomUUID().toString();
		cTag.setUuid(uuid);

		Timestamp now = new Timestamp(System.currentTimeMillis());

		cTag.setCreatedAt(now);
		cTag.setUpdatedAt(now);

		tagRepo.save(cTag);

		return uuid;
	}
}
