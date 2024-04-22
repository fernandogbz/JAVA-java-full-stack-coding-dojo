public class App {
    public static void main(String[] args) throws Exception {
        Pokedex pokedex = new Pokedex();
        Pokemon pikachu = pokedex.createPokemon("pikachu", 20, "xd");
        Pokemon charmander = pokedex.createPokemon("charmander", 20, "xd");
        pikachu.attackPokemon(charmander);
        pokedex.listPokemon();
    }
}
