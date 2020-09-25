package com.example.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.CCard;
import com.example.repository.CCardRepository;

@Service
public class AtCoderMemoryService {

	/* カードレポジトリ. */
	@Autowired
	CCardRepository cardRepo;

	public List<CCard> getCardList() {
		return cardRepo.findAll();
	}

	public void addCard(CCard cCard) {
		String uuid = UUID.randomUUID().toString();
		cCard.setUuid(uuid);

		cardRepo.save(cCard);
	}
}
