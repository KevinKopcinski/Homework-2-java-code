public class Worker {
    
    private String name;
    private double hourlyRate;

    Worker(String name, double hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName(){
        return name;
    }
}
