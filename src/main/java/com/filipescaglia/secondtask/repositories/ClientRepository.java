package com.filipescaglia.secondtask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filipescaglia.secondtask.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
