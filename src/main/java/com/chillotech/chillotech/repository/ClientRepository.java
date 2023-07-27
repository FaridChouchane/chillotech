package com.chillotech.chillotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chillotech.chillotech.entites.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}