package com.andres.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andres.crud.model.Cliente;



@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}
