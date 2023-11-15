package samar.steps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import samar.steps.entities.Bloc;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {


}
