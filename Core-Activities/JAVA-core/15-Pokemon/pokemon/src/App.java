public class App {
    public static void main(String[] args) throws Exception {
        Pokedex pokedex = new Pokedex();
        Pokemon pikachu = pokedex.createPokemon("pikachi", 20, "xd");
        Pokemon pikachu2 = pokedex.createPokemon("pikach2i", 20, "xd");
        pikachu.attackPokemon(pikachu2);
        pokedex.listPokemon();
    }
}
