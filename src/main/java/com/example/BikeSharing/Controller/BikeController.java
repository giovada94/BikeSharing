package com.example.BikeSharing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.BikeSharing.Entity.Bike;
import com.example.BikeSharing.Entity.User;
import com.example.BikeSharing.service.IBikeService;



@Controller // This means that this class is a Controller
@RequestMapping(path="/bike")
public class BikeController {
	@Autowired
	IBikeService bikeService;
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},path="/add") 
	public @ResponseBody Bike addNewBike (@RequestBody Bike b) {
		Bike abike =  bikeService.Inserimento(b);
		return abike;
	}
	@PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},path="/edit") 
	public @ResponseBody Bike editBike (@RequestBody Bike b) {
		Bike abike =  bikeService.Modifica(b);
		return abike;
	}
	@DeleteMapping(path="/delete/{id}") 
	public @ResponseBody String deleteBike (@PathVariable(value="id") int id) {
		bikeService.Elimina(id);
		return "OK";
	}
	@GetMapping(path="/") 
	public @ResponseBody List<Bike> findAllBike () {
		return bikeService.MostraTutto();
	}
	@GetMapping(path="/{n}") 
	public @ResponseBody List<Bike> findLimitBike (@PathVariable(value="n") int n) {
		return bikeService.MostraBiciLimit(n).getContent();
	}
	
	
	
	
}
