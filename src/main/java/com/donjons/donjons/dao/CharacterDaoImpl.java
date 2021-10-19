package com.donjons.donjons.dao;

import com.donjons.donjons.model.Character;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CharacterDaoImpl implements CharacterDao {

    public static List<Character> characters = new ArrayList<>();

    static {
        characters.add(new Character(1, new String("Lauric"), new String("Warrior")));
        characters.add(new Character(2, new String("juifondor"), new String("Wizard")));
        characters.add(new Character(3, new String("Rod"), new String("Warrior")));

    }


    @Override
    public List<Character> findAll() {
        return characters;
    }

    @Override
    public Character findById(int id) {
        for (Character character : characters) {
            if(character.getId() == id){
                return character;
            }
        }
        return null;
    }

    @Override
    public Character save(Character character) {
        characters.add(character);
        return character;
    }

    @Override
    public void deleteById(int id) {
        Character character =
        characters.remove(id);
    }

}
