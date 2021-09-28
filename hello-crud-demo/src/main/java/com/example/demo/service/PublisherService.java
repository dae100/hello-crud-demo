package com.example.demo.service;

import com.example.demo.data.Publisher;
import com.example.demo.dto.PublisherDto;

public interface PublisherService {

	public Publisher getPublisherById(Integer id);
	
	public PublisherDto getPublisherDtoById(Integer id);
}
