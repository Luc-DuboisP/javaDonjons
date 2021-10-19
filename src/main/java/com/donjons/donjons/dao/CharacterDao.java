package com.donjons.donjons.dao;
import com.donjons.donjons.model.Character;
import java.util.List;

public interface CharacterDao {
    public List<Character> findAll();
    public Character findById(int id);
    public Character save(Character character);
    public void deleteById(int id);
    //public Character update(Character character, int id);
}
