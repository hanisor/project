package my.utem.edu.ftmk.dad.luggageTrackingModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.utem.edu.ftmk.dad.luggageTrackingModule.model.Checkpoint2;

@Repository
public interface Checkpoint2Repository extends JpaRepository<Checkpoint2, Long> {

}
