package com.example.demo;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.Publisher;
import com.example.demo.data.PublisherRepository;

@Service
public class DbInitializer {

	
	@Autowired
	private PublisherRepository repo;
	
	
	@PostConstruct
	public void initDb() {
		
		
		// Check if records have already been initialized
		// If none, then initialize the data
		Optional<Publisher> publisher = repo.findById(1);
		
		if (!publisher.isPresent())
		{
			Publisher pub1 = new Publisher(1, "OReilly", "OReilly Publisher");			
			repo.save(pub1);
		}
	}
}
