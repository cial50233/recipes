package fr.formation.recipes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.recipes.entities.Step;

@Repository
public interface StepJpaRepository extends JpaRepository<Step, Long> {

}
