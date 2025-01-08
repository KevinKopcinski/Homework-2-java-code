public class Payroll {
    
    Payroll(){
        //no-args constructor
    }

    public void processPayments(Worker worker){
        System.out.println("Payment processed for worker "+worker.getName());
    }
}
