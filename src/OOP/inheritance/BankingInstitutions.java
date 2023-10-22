package OOP.inheritance;

public class BankingInstitutions extends Institutions {

    private int salary;
    private String services;

    public void setSalary(int salary){
        this.salary = salary;

    }
    public int getSalary(){
        return salary;
    }

    public void setServices(String services){
        this.services = services;
    }

    public String getServices(){
        return services;
    }

}
