package com.example.BikeSharing.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.BikeSharing.Entity.Bike;


public interface IBikeService {

	Bike Inserimento(Bike b);
	
	Bike Modifica(Bike b);
	
	void Elimina(int id);
	
	List<Bike> MostraTutto();
	
	Page<Bike> MostraBiciLimit(int n);
	
	List<Bike> MostraBiciOrdKm();
	
	Bike BiciPerId(int id);
	
	List<Bike> BiciPerModelloKm(String mod,int km);
}
