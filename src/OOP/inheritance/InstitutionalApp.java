package OOP.inheritance;

import java.sql.SQLOutput;

public class InstitutionalApp {
    public static void main(String[] args) {
        EducationalInstitution University = new EducationalInstitution();

        University.setName("jay university");
        University.setAddress("Abuja Nigeria");
        University.setHead(" Mr Jay Nakada");
        University.setNetworth(500000);
        University.setNumbers(1521000101);
        University.setHeadOfUniversity(" Mr Ndu Madu");
        University.setHeadOfDepartment("mr lucky ");
        University.setCostOfTuition(5000);
        University.setPopulationOfUniversity(70000);
        //University.setNumbersOfLecturers(20000);

        System.out.println("Where is the University located : " + University.getAddress());
        System.out.println("University Name: " + University.getName());
        System.out.println("Head of the University: " + University.getHead());
        System.out.println("University worth: " + University.getNetworth());
        System.out.println("University Account Number: " + University.getNumbers());
        System.out.println("Head of Department: " + University.getHeadOfUniversity());
        System.out.println("University Tuition Fees: " + University.getCostOfTuition());
        System.out.println("Population of University:" + University.getPopulationOfUniversity());
        System.out.println("How many Lecturers in University: " + University.getNumbersOfLecturers());

        System.out.println();

        BankingInstitutions Bank = new BankingInstitutions ("JayBank", "Mr Jay Onu", 5000000, 30000, "Abuja", 30000, "bank notes and load providers");


        Bank.setName("JayBank");
        Bank.setHead("Mr Jay Onu");
        Bank.setNetworth(5000000);
        Bank.setSalary(30000);
        Bank.setServices("issues loans, financial Advice, provide estate advices");

        System.out.println("Name of Bank: " + Bank.getName());
        System.out.println("Bank Manger: " + Bank.getHead());
        System.out.println("Bank Networth: " + Bank.getNetworth());
        System.out.println("Workers Salary: " + Bank.getSalary());
        System.out.println("Type Of Services: " + Bank.getServices() );

        System.out.println();

        university staffDetails = new university();
        staffDetails.setName("Mr mark books");
        staffDetails.setAge(56);
        staffDetails.setStatus("Male");
        staffDetails.setLecture("Professor of Science");
        staffDetails.setDepartment("Medicine");
        staffDetails.setCourse("Human Anatomy");
        staffDetails.setSalary(200000);

        System.out.println("Lecturer Name: " + staffDetails.getName());
        System.out.println("Age Of Lecturer: " + staffDetails.getAge());
        System.out.println("Status: " + staffDetails.getStatus());
        System.out.println("Highest Qualification: " + staffDetails.getLecture());
        System.out.println("Department: " + staffDetails.getDepartment());
        System.out.println("Course: " + staffDetails.getCourse());
        System.out.println("Salary of Lecturer: " + staffDetails.getSalary());

        System.out.println();




    }
}
