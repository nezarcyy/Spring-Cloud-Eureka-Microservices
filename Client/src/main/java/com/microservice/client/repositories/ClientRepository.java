package com.microservice.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.client.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
