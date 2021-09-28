package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.data.Publisher;
import com.example.demo.dto.PublisherDto;

@Service
public class EntityTransformer {
	
	public PublisherDto transformToPublisherDto(Publisher publisher) {
		PublisherDto dto = null;
		
		if (publisher != null) {
			dto = new PublisherDto();
			dto.setId(publisher.getId());
			dto.setName(publisher.getName());
			dto.setDescription(publisher.getDescription());
		}
		
		return dto;
	}
}
