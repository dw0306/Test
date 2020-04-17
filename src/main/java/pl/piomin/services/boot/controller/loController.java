package pl.piomin.services.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.piomin.services.boot.data.Repository;
import pl.piomin.services.boot.model.location;

@RestController
@RequestMapping("/location")
public class loController {
	
	@Autowired
	private Repository repository;

	@GetMapping
	public List<location> findAll() {
		System.out.println(repository.findAll());
		return repository.findAll();
	}

}
