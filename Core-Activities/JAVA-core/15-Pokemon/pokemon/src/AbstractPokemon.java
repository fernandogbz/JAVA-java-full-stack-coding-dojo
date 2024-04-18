public abstract class AbstractPokemon implements PokemonInterface {
    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = new Pokemon(name, health, type);
        return pokemon;
    }
}
