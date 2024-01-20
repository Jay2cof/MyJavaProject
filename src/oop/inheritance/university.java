package oop.inheritance;

public class university extends EducationalInstitution{
    private String lecture;
    private String status;
    private String Department;
    private String course;
    private int age;
    private int salary; // can you create another method for the same multilevel class?

    public university(String name, String head, int numbers, int networth, String address, String headOfUniversity,
                      String headOfDepartment, int populationOfUniversity, int costOfTuition, int numbersOfLecturers,
                      String lecture, String status, String department, String course, int age, int salary) {
        super(name, head, numbers, networth, address, headOfUniversity, headOfDepartment, populationOfUniversity, costOfTuition, numbersOfLecturers);
        this.lecture = lecture;
        this.status = status;
        Department = department;
        this.course = course;
        this.age = age;
        this.salary = salary;
    }
    public university(){
        super();

    }
    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) { // void is used when you are not expect a method to return a data
        this.lecture = lecture;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
