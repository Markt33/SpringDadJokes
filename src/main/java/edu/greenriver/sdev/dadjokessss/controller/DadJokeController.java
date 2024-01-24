package edu.greenriver.sdev.dadjokessss.controller;

import edu.greenriver.sdev.dadjokessss.domain.DadJoke;
import edu.greenriver.sdev.dadjokessss.service.DadJokeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DadJokeController {

    private DadJokeService service;

    public DadJokeController(DadJokeService service){
        this.service = service;
    }

    @GetMapping("jokes/all")
    public List<DadJoke> all(){
        return service.all();
    }

    @PostMapping("jokes")
    public void addJoke(@RequestBody DadJoke newJoke){
        service.addJoke(newJoke);
    }

    @PutMapping("movies/{id}")
    public DadJoke updateJoke(@PathVariable int id,
                              @RequestBody DadJoke updateJoke){
        return service.updateJoke(updateJoke, id);
    }

    @DeleteMapping("movies/{id}")
    public void deleteJoke(@PathVariable int id){
        service.deleteJoke(id);
    }
}
