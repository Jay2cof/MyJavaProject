import java.util.Scanner;

/* format of switch statement
switch(condition){
case one :
         program to be excuted
         break;
case two:
        program to be excuted
        break;
 default:
        program to be excuted
}
 */
public class SwitchStatement {
    public static void main(String[] args){
    Scanner Input = new Scanner(System.in);
        System.out.println("enter your activity plans");
        int day = Input.nextInt();
        switch (day){
            case 1:
                System.out.println("will go to paris");
                break;
            case 2:
                System.out.println("will go play football");
                break;
            case 3:
                System.out.println("will meet with a girlfriend");
                break;
            default:
                System.out.println("no stated activity");




        }
    }
}
