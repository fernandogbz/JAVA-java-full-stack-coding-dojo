public class Main {
    public static void main(String[] args) {
        Project p2 = new Project("fizzBuzz", "un simple fizzBuzz", 20);
        Project p3 = new Project("ejercicios basicos", "unos simples ejercicios", 30);
        Project p1 = new Project("zoo", "un simple zoologico", 40);
        
        Portfolio portfolio = new Portfolio();
        portfolio.addProject(p1);
        portfolio.addProject(p2);
        portfolio.addProject(p3);

        System.out.println(portfolio.getPortfolioCost());
        portfolio.showPortfolio();
    }
}
