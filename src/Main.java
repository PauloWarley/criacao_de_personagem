import game.controller.CreateCharacter;
import game.model.CharacterClass;

public class Main {
    public static void main(String[] args) {
        CreateCharacter character = new CreateCharacter( "Pwarr");
        System.out.println(
                "Dados do Personagem: \n"+
                        "Nome:" + character.getCharacterName() + "\n"+
                        "Nível:" + character.getLevel() + "\n"+
                        "Magia:" + character.getMagic() + "\n"+
                        "Vida:" + character.getLife() + "\n"+
                        "Classe:" + character.getCharacterClass() + "\n"
        );

        character.setCharacterName("Pwar");

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