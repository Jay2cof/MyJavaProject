
// Lopp is a repetition, iteration of codes.
// while loop, for loop, do while loop

/* while loop.... this will continue to execute until the condition is false

while (condition){
      programme to be excuted
      increament
}


 */

/*A program to print 1 to 100 using while loop
The break keyword can be used to stop out the loop
the continue keyword is used to resume the loop after some program

 */

public class LoopClassInJava {
    public static void main(String[] args) {


        int i = 0; // initialisation

        while (i <= 100){
            System.out.println(i);
            i+=5;
            if (i == 30){
                System.out.println("what can a man do to be happy");
                continue; // works without continue

            }

           // i+=5; // Increment
           // i+=2;

        }

    }
}
