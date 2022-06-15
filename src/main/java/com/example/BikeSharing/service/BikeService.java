package com.example.BikeSharing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.BikeSharing.Entity.Bike;
import com.example.BikeSharing.Repository.BikeRepository;

@Service
public class BikeService implements IBikeService{
    @Autowired
    private BikeRepository repository;

    @Override
    public Bike Inserimento(Bike b) {
    	return repository.save(b);
    }
    @Override
    public Bike Modifica(Bike b) {
    	return repository.save(b);
    }    
    
    @Override
    public void  Elimina(int id) {
    	repository.deleteById(id);
    }
    
    @Override
    public List<Bike> MostraTutto(){
    	return (List<Bike>) repository.findAll();
    }
    
    @Override
    public Page<Bike> MostraBiciLimit(int n){
    	return  repository.findAll(PageRequest.of(0, n));
    }
}
