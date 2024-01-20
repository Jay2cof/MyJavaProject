package javaCollections;

public class weather {

    private String winter;
    private long temp;
    private String summer;


    public weather(String winter, long temp, String summer) {
        this.winter = winter;
        this.temp = temp;
        this.summer = summer;
    }

    public String getWinter() {
        return winter;
    }

    public void setWinter(String winter) {
        this.winter = winter;
    }

    public long getTemp() {
        return temp;
    }

    public void setTemp(long temp) {
        this.temp = temp;
    }

    public String getSummer() {
        return summer;
    }

    @Override
    public String toString() {
        return "weather{" +
                "winter='" + winter + '\'' +
                ", temp=" + temp +
                ", summer='" + summer + '\'' +
                '}';
    }

    public void setSummer(String summer) {
        this.summer = summer;



    }
}
