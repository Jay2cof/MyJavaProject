package oop.Abstraction;

public class SchoolApp {

    public static void main(String[] args) {
        PrivateSchools highStandard = new PrivateSchools();
        PublicSchool lowStandard = new PublicSchool();

        highStandard.setNameOfSchool("Jay High School");
        highStandard.setStudent(200);
        highStandard.setTeachers(20);
        lowStandard.setNameOfSchool("Jay Community Public School");
        lowStandard.setStudent(1000);
        lowStandard.setTeachers(20);

        System.out.println(highStandard.getNameOfSchool());
        System.out.println(highStandard.getStudent());
        System.out.println(highStandard.getTeachers());
        System.out.println();
        System.out.println(lowStandard.getNameOfSchool());
        System.out.println(lowStandard.getStudent());
        System.out.println(lowStandard.getTeachers());
        System.out.println();

        highStandard.setTeachers(20);
        highStandard.salary();
        highStandard.salary();

        System.out.println();

        lowStandard.setTeachers(20);
        lowStandard.salary();
        lowStandard.salary();
        System.out.println();

        lowStandard.setTeachers(100);
        lowStandard.bonus();
        System.out.println();

        highStandard.setTeachers(50);
        highStandard.bonus();


    }


}
