package com.klef.soa.exam.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.BusPass;
import com.klef.soa.exam.service.BussPassService;

@RestController
@RequestMapping("/BusPass")
public class BusPassController {
	@Autowired
	private BussPassService service;
	
	@GetMapping("/")
	public String demo()
	{
		return "BusPass Project";
	}
	
	@PostMapping("/add")
	public ResponseEntity<BusPass> addBusPass(@RequestBody BusPass b)
	{
		BusPass buspass = service.addBusPass(b);
		return ResponseEntity.status(201).body(buspass);
	}
	
	@GetMapping("/displayall")
	public ResponseEntity<List<BusPass>> displayAllBusPasses()
	{
		List<BusPass> buspass = service.displayAllBusPass();
		return ResponseEntity.status(200).body(buspass);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBusPassById(@PathVariable Long id)
	{
		String message = service.deleteBusPassById(id);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}


}
