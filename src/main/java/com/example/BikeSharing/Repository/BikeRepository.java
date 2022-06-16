package com.example.BikeSharing.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.BikeSharing.Entity.Bike;



	public interface BikeRepository extends PagingAndSortingRepository<Bike,Integer> {

		
		/*
		- Inserimento di una nuova bicicletta;
		- Modifica di una bicicletta;
		- Cancellazione di una bicicletta (per id)
		- Visualizzazione di tutte le bici disponibili
		- Visualizzazione di una determinata bici (per id)
		*/
		//Visualizzazione delle n biciclette
		//List<Bike> findAll(PageRequest pageRequest);
		Page<Bike> findAll(Pageable pageable);

		List<Bike> findByModelloAndKmLessThan(String mod,int km);
	}

