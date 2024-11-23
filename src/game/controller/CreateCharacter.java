package game.controller;

import game.model.CharacterClass;

import java.sql.Array;
import java.util.ArrayList;

public class CreateCharacter {

    private int _level = 0;
    private int _life = 500;
    private int _magic = 100;
    private CharacterClass _characterClass = CharacterClass.WARRIOR;
    private String _characterName = "";
    private ArrayList<String> _inventory = new ArrayList<String>();

    public CreateCharacter(String characterName) {
        System.out.println("Iniciando a classe");
        _characterName = characterName;
    }

    //getters
    public String getCharacterName() {
        return _characterName;
    }

    public int getLevel() {
        return _level;
    }

    public int getLife() {
        return _life;
    }

    public int getMagic() {
        return _magic;
    }

    public CharacterClass getCharacterClass() {
        return _characterClass;
    }

    public ArrayList<String> getInventory(){
        return _inventory;
    }

    //setters
    public void setCharacterName(String characterName){
        _characterName = characterName;
    }

    public void setLevel(int level){
        _level = level;
    }

    public void setMagic(int magic){
        _magic = magic;
    }

    public void setLife(int life){
        _life = life;
    }

    public void setCharacterClass(CharacterClass characterClass){
        _characterClass = characterClass;
    }

    public void setInventory(String item){
        _inventory.add(item);
    }
}