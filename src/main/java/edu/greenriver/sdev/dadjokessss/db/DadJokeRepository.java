package edu.greenriver.sdev.dadjokessss.db;

import edu.greenriver.sdev.dadjokessss.domain.DadJoke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadJokeRepository extends JpaRepository<DadJoke, Integer> {

}
