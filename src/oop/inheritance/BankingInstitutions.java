package oop.inheritance;

public class BankingInstitutions extends Institutions {

    private int salary;
    private String services;

    public BankingInstitutions(String name, String head, int numbers, int networth, String address, int salary, String services) {
        super(name, head, numbers, networth, address);

        this.services = services;
        this.salary = salary;

    }

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
