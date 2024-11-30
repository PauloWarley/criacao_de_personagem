import com.google.gson.Gson;
import game.controller.CreateCharacter;
import game.model.CharacterClass;
import game.model.ItemInventory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ItemInventory item = new ItemInventory();


        //Adicionando valores à um objeto usando um Json em formato de string
        String jsonBody = "{\n" +
                "  \"level\": 1,\n" +
                "  \"name\": \"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops\",\n" +
                "  \"price\": 109.95,\n" +
                "  \"description\": \"Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday\"\n" +
                "}";

        Gson gson = new Gson();
        ItemInventory itemFromJsonBody = gson.fromJson(jsonBody, ItemInventory.class);

        //Adicionando valores à um objeto usando SETs
        item.setName("Espada");
        item.setDescription("Espada magnifica de hogwart");
        item.setLevel(12);
        item.setPrice(90.15);

        ArrayList<ItemInventory> inventory = new ArrayList<ItemInventory>();

        inventory.add(item);
        inventory.add(itemFromJsonBody);

        System.out.println("O valor do objeto na primeira posição é: " + inventory.get(0).getName());
        System.out.println("O valor do objeto na segunda posição é: " + inventory.get(1).getName());

    }

    public void createPersonagem(){
        CreateCharacter character = new CreateCharacter( "Pwarr");
        System.out.println(
                "Dados do Personagem: \n"+
                        "Nome:" + character.getCharacterName() + "\n"+
                        "Nível:" + character.getLevel() + "\n"+
                        "Magia:" + character.getMagic() + "\n"+
                        "Vida:" + character.getLife() + "\n"+
                        "Classe:" + character.getCharacterClass() + "\n"
        );

        character.setCharacterName("Pwarr");

        System.out.println(
                "Dados do Personagem: \n"+
                        "Nome:" + character.getCharacterName() + "\n"+
                        "Nível:" + character.getLevel() + "\n"+
                        "Magia:" + character.getMagic() + "\n"+
                        "Vida:" + character.getLife() + "\n"+
                        "Classe:" + character.getCharacterClass() + "\n"
        );

        character.setCharacterName("Pwar");
        character.setLevel(200);
        character.setLife(550);
        character.setMagic(650);
        character.setCharacterClass(CharacterClass.HEALER);

        System.out.println(
                "Dados do Personagem: \n"+
                        "Nome:" + character.getCharacterName() + "\n"+
                        "Nível:" + character.getLevel() + "\n"+
                        "Magia:" + character.getMagic() + "\n"+
                        "Vida:" + character.getLife() + "\n"+
                        "Classe:" + character.getCharacterClass() + "\n"
        );
    }
}