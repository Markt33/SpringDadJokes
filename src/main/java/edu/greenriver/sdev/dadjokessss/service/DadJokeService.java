package edu.greenriver.sdev.dadjokessss.service;

import edu.greenriver.sdev.dadjokessss.db.DadJokeRepository;
import edu.greenriver.sdev.dadjokessss.domain.DadJoke;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DadJokeService {

    private DadJokeRepository repository;

    public DadJokeService(DadJokeRepository repository) {
        this.repository = repository;
    }

    public List<DadJoke> all(){
        List<DadJoke> jokes = repository.findAll();
        return Collections.unmodifiableList(jokes);
    }

    public void addJoke(DadJoke joke) {
        repository.save(joke);
    }

    public DadJoke updateJoke(DadJoke updateJoke, int id) {
        DadJoke currentJoke = repository.findById(id).orElseThrow();
        currentJoke.setJokeText(updateJoke.getJokeText());

        repository.save(currentJoke);

        return null;
    }

    public void deleteJoke(int id){
        repository.deleteById(id);
    }

}
