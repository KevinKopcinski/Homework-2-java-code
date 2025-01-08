public abstract class Employee {
    
    private String name;
    private int hours;

    Employee(String name, int hours){
        this.name = name;
        this.hours = hours;
    }

    public double calculateSalary(){
        return getHours() * 20;
    }

    public int getHours(){
        return hours;
    }
}
