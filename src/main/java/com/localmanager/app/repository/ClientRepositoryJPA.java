package com.localmanager.app.repository;

import com.localmanager.app.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoryJPA extends JpaRepository<Client, Long> {
}
