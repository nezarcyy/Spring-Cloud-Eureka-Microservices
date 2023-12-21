package com.microservice.voiture.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.voiture.models.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
