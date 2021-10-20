package com.donjons.donjons.donjons.controller;
import com.donjons.donjons.dao.CharacterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import com.donjons.donjons.model.Character;

import java.util.List;

@RestController
@RequestMapping("/Characters")
public class CharacterController {

    @Autowired
    private CharacterDao characterDao;


    @GetMapping()
    public List<Character> listCharacters() {
        return characterDao.findAll();
    }

    @GetMapping("/{id}")
    public Character showCharacter(@PathVariable int id) {
        return characterDao.findById(id);
    }

    @PostMapping()
    public void addCharacter(@RequestBody Character character) {
        characterDao.save(character);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable int id) {
        characterDao.deleteById(id);
    }

}

