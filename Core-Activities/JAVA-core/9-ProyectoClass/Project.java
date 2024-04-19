class Project{
    private String nombre;
    private String descripcion;
    
    private double initialValue;

    public Project(){
        this.nombre = "";
        this.descripcion = "";
        this.initialValue = -1;
    }

    public Project(String name){
        this.nombre = name;
        this.descripcion = "";
    }

    public Project(String name, String description, double initialValue){
        this.nombre = name;
        this.descripcion = description;
        this.initialValue = initialValue;
    }

    public String elevatorPitch(){
        return this.nombre + " (" + this.initialValue + ") : " + this.descripcion;
    }

    public void setName(String name){
        this.nombre = name;
    }

    public void setDescription(String description){
        this.descripcion = description;
    }

    public void setInitialValue(double initialValue){
        this.initialValue = initialValue;
    }

    public String getName(){
        return this.nombre;
    }

    public String getDescription(){
        return this.descripcion;
    }

    public double getInitialValue(){
        return initialValue;
    }
}