package JavaCollections;

import java.util.LinkedHashSet;

public class LinkedHashSetCollection {
    public static void main(String[] args) {
        weather Germany = new weather("Dec to March", 10, "July to Oct");
        weather Nigeria = new weather("No winter",34, "all year");
        weather Canada = new weather("all most all year", 5, "maybe only a month");

        LinkedHashSet<weather> seasons = new LinkedHashSet<>();
        seasons.add(Germany);
        seasons.add(Nigeria);
        seasons.add(Canada);
        System.out.println(seasons);

    }
}
