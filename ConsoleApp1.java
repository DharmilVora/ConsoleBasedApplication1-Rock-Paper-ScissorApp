//This Project is to play Rock Paper Scissor
import java.util.Random;
import java.util.*;
public class ConsoleApp1 {
    public static void main(String[] args) {
        System.out.println("Note this Game is for two players :-\n");
        System.out.println("Enter Number given below :-");
        System.out.println("0.Rock\n1.Paper\n2.Scissor");
        Random r=new Random();
        int a=r.nextInt(3);
        System.out.println("\nPlayer 1 Number is ::"+a);
        System.out.print("\nEnter Number for Player 2 ::");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        System.out.println();
        switch(b)
        {
            case 0:
                if(b==0 && a==1)
                {
                    System.out.println("Player 1 won");
                }
                else if(b==0 && a==0)
                {
                    System.out.println("Match Tie");
                }
                else if(b==0 && a==2)
                {
                    System.out.println("Player 2 won");
                }
                break;
            case 1:
                 if(b==1 && a==0)
                 {
                     System.out.println("Player 2 won");
                 }
                 else if(b==1 && a==1)
                 {
                     System.out.println("Match Tie");
                 }
                 else if(b==1 && a==2)
                 {
                     System.out.println("Player 1 won");
                 }
                 break;
            case 2:
                 if(b==2 && a==0)
                 {
                     System.out.println("Player 1 won");
                 }
                 else if(b==2 && a==2)
                 {
                     System.out.println("Match Tie");
                 }
                 else if(b==2 && a==1)
                 {
                     System.out.println("Player 2 won");
                 }
                 break;
            default:
            System.out.println("Input is incorrect");
            break;
        }
        sc.close();
    }
}