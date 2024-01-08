package JavaCollections;

import java.awt.font.TextMeasurer;
import java.util.TreeSet;

public class TreeSetCollection {
    // DO NOT ACCEPT DUPLICATE

    public static void main(String[] args) {
        weather Germany = new weather("Dec to March", 10, "July to Oct");
        weather Nigeria = new weather("No winter",34, "all year");
        weather Canada = new weather("all most all year", 5, "maybe only a month");

        TreeSet<Long> SeasonsByCountry = new TreeSet<>();

        SeasonsByCountry.add(Germany.getTemp());
        SeasonsByCountry.add(Nigeria.getTemp());
        SeasonsByCountry.add(Canada.getTemp());

        System.out.println(SeasonsByCountry);

        TreeSet<String>winter = new TreeSet<>();
        winter.add(Germany.getWinter());
        winter.add(Nigeria.getWinter());
        winter.add(Canada.getWinter());
        System.out.println(winter);

        TreeSet<Long>temp = new TreeSet<>();
        temp.add(Germany.getTemp());
        temp.add(Nigeria.getTemp());
        temp.add(Canada.getTemp());
        System.out.println(temp);
    }

}
