package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CCard;
import com.example.service.AtCoderMemoryService;

@RestController
@CrossOrigin(origins = "*")
@ComponentScan("com.example.service")
public class AtCoderMemoryController {

	/* AtCoderMemory サービス. */
	@Autowired
	AtCoderMemoryService service;

	@RequestMapping(value = "/getCardList", method = RequestMethod.GET)
	public List<CCard> getCardList() {
		return service.getCardList();
	}

	@RequestMapping(value = "/addCard", method = RequestMethod.POST)
	public void addCard( @RequestBody CCard cCard ) {
		service.addCard(cCard);

		return;
	}
}
