package com.naceproject.naceproject.controller;

import com.naceproject.naceproject.exception.ResourceNotFoundException;
import com.naceproject.naceproject.model.Nace;
import com.naceproject.naceproject.repository.NACERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class NACEController {
	@Autowired
	private NACERepository naceRepository;

	@GetMapping("/allOrders")
	public List<Nace> getAllEmployees() {
		return naceRepository.findAll();
	}

	@GetMapping("/orders/{id}")
	public ResponseEntity<Nace> getEmployeeById(@PathVariable(value = "id") int orderId)
			throws ResourceNotFoundException {
		Nace nace = naceRepository.findById(orderId).orElseThrow(() -> new ResourceNotFoundException("Orders not found for this id :: " + orderId));
		return ResponseEntity.ok().body(nace);
	}

	@PostMapping("/saveOrders")
	public Nace createNaceOrders(@Valid @RequestBody Nace nace) {
		return naceRepository.save(nace);
	}


}
