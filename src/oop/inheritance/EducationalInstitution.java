package oop.inheritance;

public class EducationalInstitution extends Institutions{

    private String headOfUniversity;
    private String headOfDepartment;
    private int populationOfUniversity;
    private int costOfTuition;
    private int numbersOfLecturers;

    public EducationalInstitution(String name, String head, int numbers, int networth,
                                  String address, String headOfUniversity,
                                  String headOfDepartment, int populationOfUniversity, int costOfTuition, int numbersOfLecturers) {
        super(name, head, numbers, networth, address);
    }

    public EducationalInstitution(){

    }

    public String getHeadOfUniversity(){
        return headOfUniversity;
    }
    public void setHeadOfUniversity(String headOfUniversity){
        this.headOfUniversity = headOfUniversity;
    }

    public void setHeadOfDepartment(String headOfDepartment){
        this.headOfDepartment = headOfDepartment;
    }

    public String getHeadOfDepartment(){
        return headOfDepartment;
    }

    public int getPopulationOfUniversity(){
        return populationOfUniversity;
    }

    public void setPopulationOfUniversity(int populationOfUniversity){
        this.populationOfUniversity = populationOfUniversity;
    }

    public int getCostOfTuition(){
        return costOfTuition;
    }
    public void setCostOfTuition(int costOfTuition){
        this.costOfTuition = costOfTuition;
    }

    public int getNumbersOfLecturers(){
        return numbersOfLecturers;
    }
    public void setNumberOfLecturers(int numbersOfLecturers){
        this.numbersOfLecturers = numbersOfLecturers;
    }



    /*public String getHeadOfUniversity() {
        return headOfUniversity;
    }

    public void setHeadOfUniversity(String headOfUniversity) {
        this.headOfUniversity = headOfUniversity;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public int getPopulationOfUniversity() {
        return populationOfUniversity;
    }

    public void setPopulationOfUniversity(int populationOfUniversity) {
        this.populationOfUniversity = populationOfUniversity;
    }

    public int getCostOfTuition() {
        return costOfTuition;
    }

    public void setCostOfTuition(int costOfTuition) {
        this.costOfTuition = costOfTuition;
    }

    public int getNumbersOfLecturers() {
        return numbersOfLecturers;
    }

    public void setNumbersOfLecturers(int numbersOfLecturers) {
        this.numbersOfLecturers = numbersOfLecturers;
    }

     */


}
