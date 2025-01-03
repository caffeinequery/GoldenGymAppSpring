package io.caffeinequery.golden_gym_app.service;

import io.caffeinequery.golden_gym_app.model.GymClient;
import io.caffeinequery.golden_gym_app.repository.RepositoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    @Autowired
    private RepositoryClient repositoryClient;

    @Override
    public List<GymClient> listClients() {
        List<GymClient> clients = repositoryClient.findAll();
        return clients;
    }

    @Override
    public GymClient searchClientById(Integer clientId) {
        GymClient client = repositoryClient.findById(clientId).orElse(null);
        return client;
    }

    @Override
    public void saveClient(GymClient client) {
        // If client's id is null, JPA makes a SQL INSERT query; otherwise, makes a UPDATE.
        repositoryClient.save(client);
    }

    @Override
    public void deleteClient(GymClient client) {
        repositoryClient.delete(client);
    }
}
