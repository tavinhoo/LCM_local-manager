package com.localmanager.app.service;

import com.localmanager.app.repository.ClientRepositoryJPA;
import com.localmanager.app.model.entities.Client;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepositoryJPA clientRepositoryJPA;

    public ClientService(ClientRepositoryJPA clientRepositoryJPA) {
        this.clientRepositoryJPA = clientRepositoryJPA;
    }

    // Cria um novo cliente
    public Client createClient(Client client) {
        return clientRepositoryJPA.save(client);
    }

    // Deleta um cliente pelo ID
    public void deleteClient(Long clientId) {
        clientRepositoryJPA.deleteById(clientId);
    }

    // Encontra um cliente pelo ID
    public Optional<Client> getClientById(Long clientId) {
        return clientRepositoryJPA.findById(clientId);
    }

    // Retorna uma lista de todos os clientes
    public List<Client> getAllClients() {
        return clientRepositoryJPA.findAll();
    }
}

