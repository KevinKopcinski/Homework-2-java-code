public class Professor extends Employee{
    
    private String field;

    Professor(String name, int hours, String field){
        super(name, hours);
        this.field = field;
    }

    @Override
    public double calculateSalary(){
        return super.getHours() * 30;
    }
}
