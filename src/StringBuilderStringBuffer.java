public class StringBuilderStringBuffer {
    public static void main(String[] args) {
        /*
        we use stringbuilder or stringBuffer for mutable string
        string builder and string buffer a mutable string
        the difference between stringbuilder and stringbuffer is that, the method in string buffer
        are synchronised(suitable of multithreading/Concurency.

         */
        StringBuilder JayBoy = new StringBuilder();
        StringBuffer JayManPet = new StringBuffer();

        JayBoy.append("Benjamin" + " ");
        JayBoy.append("Feddy");
        JayBoy.append(2412);
        System.out.println(JayBoy); // get the same output without + and colum, diff btw \t

        // Using String buffer to get collection of pet names

        JayManPet.append("caddyMan" + "\t");
        JayManPet.append("handdyMan" + "\n ");
        JayManPet.append("TvMan");
        //JayBoy.indexOf(1001) // so it doesnt matter which append you use...
        System.out.println(JayManPet);

    }
}
