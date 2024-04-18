public class Main {
    public static void main(String[] args) {
        Project p2 = new Project("xd1", "lol4", 20);
        Project p3 = new Project("xd2", "lol5", 30);
        Project p1 = new Project("xd3", "lol6", 40);
        
        Portfolio portfolio = new Portfolio();
        portfolio.addProject(p1);
        portfolio.addProject(p2);
        portfolio.addProject(p3);

        System.out.println(portfolio.getPortfolioCost());
        portfolio.showPortfolio();
    }
}
