import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {

    private ArrayList<Pokemon> myPokemons;

    public Pokedex(){
        myPokemons = new ArrayList<Pokemon>();
    }

    public Pokemon createPokemon(String name, int health, String type){
        Pokemon pokemon = super.createPokemon(name, health, type);
        myPokemons.add(pokemon);
        return pokemon;
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return pokemon.getName() + " " + pokemon.getType() + " h:" + pokemon.getHealth();
    }

    @Override
    public void listPokemon() {
        for (Pokemon pokemon : myPokemons) {
            System.out.println(pokemonInfo(pokemon));
        }
    }
    
}
