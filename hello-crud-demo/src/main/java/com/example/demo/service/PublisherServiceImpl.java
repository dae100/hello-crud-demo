package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.Publisher;
import com.example.demo.data.PublisherRepository;
import com.example.demo.dto.PublisherDto;

@Service
public class PublisherServiceImpl implements PublisherService {

	@Autowired
	PublisherRepository repo;
	
	@Autowired
	EntityTransformer entityTransformer;
	
	@Override
	public Publisher getPublisherById(Integer id) {
		Optional<Publisher> pubOpt = repo.findById(1);
		
		Publisher publisher = null;
		
		if (pubOpt.isPresent()) {
			publisher = pubOpt.get();
		} 
		
		return publisher;
	}

	
	@Override
	public PublisherDto getPublisherDtoById(Integer id) {
		
		Publisher publisher = this.getPublisherById(id);
		PublisherDto dto = entityTransformer.transformToPublisherDto(publisher);
		
		return dto;
	}
}
