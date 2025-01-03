package io.caffeinequery.golden_gym_app.service;

import io.caffeinequery.golden_gym_app.model.GymClient;

import java.util.List;

public interface IClientService {
    public List<GymClient> listClients();

    public GymClient searchClientById(Integer clientId);

    public void saveClient(GymClient client);

    public void deleteClient(GymClient client);

}
