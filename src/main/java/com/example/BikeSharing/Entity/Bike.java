package com.example.BikeSharing.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "bikes")
public class Bike {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String modello;
  private String sigla;

  private int km;
  
  private String lat;
  private String lng;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getModello() {
    return modello;
  }

  public void setModello(String modello) {
    this.modello = modello;
  }
  
  public String getSigla() {
	    return sigla;
	  }

	  public void setSigla(String sigla) {
	    this.sigla = sigla;
	  }

  public int getKm() {
	    return km;
	  }

	  public void setKm(int km) {
	    this.km = km;
	  }
  
  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }
  public String getLng() {
	    return lng;
	  }

	  public void setLng(String lng) {
	    this.lng = lng;
	  }
}