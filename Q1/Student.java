import java.util.Objects;

public class Student {

    private String name;
    private String major;
    private double gpa;

    Student(){}

    Student(String name, String major){
        this.name = name;
        this.major = major;  
    }

    Student(String name, String major, double gpa){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }



    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public double getGPA(){
        return gpa;
    }

    public void setGPA(double gpa){
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return "Name: "+getName()+"\nMajor: "+getMajor()+"\nGPA: "+getGPA();
    }

    @Override
    public boolean equals(Object obj){
        
        Student other = (Student)obj;
        return this.getName().equals(other.getName()) && other.getGPA() == this.getGPA();
    }

/*    public boolean equals(Student obj){
        if(this.getName().equals(obj.getName()) && this.getGPA() == obj.getGPA()){
            return true; 
        }
        return false;
    }
*/
}