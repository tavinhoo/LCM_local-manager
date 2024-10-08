package com.localmanager.app.controller;

import com.localmanager.app.model.entities.Client;
import com.localmanager.app.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // Endpoint para criar um novo cliente
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    // Endpoint para deletar um cliente pelo ID
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    // Endpoint para obter um cliente pelo ID
    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    // Endpoint para listar todos os clientes
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
