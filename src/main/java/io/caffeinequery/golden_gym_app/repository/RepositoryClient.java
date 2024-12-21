package io.caffeinequery.golden_gym_app.repository;

import io.caffeinequery.golden_gym_app.model.GymClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryClient extends JpaRepository<GymClient, Integer> {
}
