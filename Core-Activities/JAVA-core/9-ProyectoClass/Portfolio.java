import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio(){
        projects = new ArrayList<Project>();
    }

    public void addProject(Project project){
        projects.add(project);
    }

    public double getPortfolioCost(){
        double cost = 0;
        for (Project project : projects) {
            cost += project.getInitialValue();
        }
        return cost;
    }

    public void showPortfolio(){
        for (Project project : projects) {
            System.out.println(project.elevatorPitch());
        }
    }
}
