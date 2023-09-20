import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringsInJava {
    public static void main(String[] args) {
        // String name = "LEONA is a mad lady";

        // Strings are literals
        // String methos
        // find the lenght of a string

        //System.out.println(name.length());

        // FIND THE INDEX OF A String

        //System.out.println(name.charAt(3));

        /* System.out.println(name.length());
        System.out.println(name.charAt(8));
        System.out.println(name.charAt(2));
        System.out.println(name.isEmpty());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

         */

        System.out.println();


        String history = "The history of Nigeria can be traced to the earliest inhabitants whose remains date from " +
                "at least 13,000 BC through early civilizations such as the Nok culture which began around 1500 BC. " +
                "Numerous ancient African civilizations settled in the region that is known today as Nigeria, such as " +
                "the Kingdom of Nri,[1] the Benin Empire,[2] and the Oyo Empire.[3] Islam reached Nigeria through the " +
                "Bornu Empire between (1068 AD) and Hausa States around (1385 AD) during the 11th century,[4][5][6][7] " +
                "while Christianity came to Nigeria in the 15th century through Augustinian and Capuchin monks from Portugal " +
                "to the Kingdom of Warri.[8]The Songhai Empire also occupied part of the region.[9] From the 15th century, " +
                "European slave traders arrived in the region to purchase enslaved Africans as part of the Atlantic slave trade, " +
                "which started in the region of modern-day Nigeria; the first Nigerian port used by European slave traders was " +
                "Badagry, a coastal harbour.[10][11] Local merchants provided them with slaves, escalating conflicts among the " +
                "ethnic groups in the region and disrupting older trade patterns through the Trans-Saharan route.[12]\n" +
        "\n" +
                "Lagos was occupied by British forces in 1851 and formally annexed by Britain in the year 1865.[13] " +
                "Nigeria became a British protectorate in 1901. The period of British rule lasted until 1960 when an " +
                "independence movement led to the country being granted independence.[14] Nigeria first became a republic in 1963, " +
                "but succumbed to military rule after a bloody coup d'état in 1966. A separatist movement later formed the Republic of " +
                "Biafra in 1967, leading to the three-year Nigerian Civil War.[15] Nigeria became a republic again after a new " +
                "constitution was written in 1979. However, the republic was short-lived, as the military seized power again in " +
                "1983 and later ruled for ten years. A new republic was planned to be established in 1993 but was aborted by General " +
                "Sani Abacha. Abacha died in 1998 and a fourth republic was later established the following year, 1999, which ended " +
                "three decades of intermittent military rule.";

        Scanner historyAboutNigeria = new Scanner(System.in);
        System.out.println(" Search for a word: ");
        System.out.println(history.contains("war"));
        System.out.println(history.contains("years"));
        System.out.println(history.contains("Ibo people"));
        System.out.println(history.contains("Abuja"));
        System.out.println(history.indexOf("1967"));
        System.out.println(history.indexOf("1930"));
        System.out.println(history.contains("Civil War"));


        String FirstSon = "Freddy ";
        String SecondSon = "Charly";
        System.out.println(FirstSon.concat(SecondSon));

        String newLife = " it takes a new baby 5 months to start talking ";
        String laterLife = "How long does it take a baby to start crying";
        System.out.println(laterLife.concat(newLife));
        System.out.println(newLife.length());
        System.out.println(laterLife.length());
        System.out.println(FirstSon.indexOf(SecondSon));
        System.out.println(history.length());
        System.out.println(history.replace("Lagos", "Abuja"));


        String h = "23";
        String d = "22";
        int e = 20;
        String jay = h + e;
        System.out.println(jay); // talk about typecastng in the near future












    }
}
