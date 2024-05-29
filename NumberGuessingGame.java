import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    String user;
    int no=0 , j=0;
    int score = 0;
   
    System.out.println("\n      -o-    Number Guessing Game    -o- ");
    System.out.println("\nInstructions : \n1. Game has 3 Rounds. \n2.Each Round has 5 Attempts To Gusse the correct Number.\n");
   

    for(int i=1; i<=3 ;i++)
    {
        System.out.println("*************************************************");
        System.out.println("             Round - " + i );
        System.out.println("*************************************************");
        int GenerateNo = r.nextInt(1,100);

        for(j=1;j<=5;j++)
        {
            System.out.println("\n            Attempt - " + j);
            System.out.print("\nEnetr the your guess Number : ");
            no = sc.nextInt();
                
            if(no == GenerateNo)
            {
                System.out.println("-o- Congratulations you Guess Correct Number -o- .");
                score+=j;
                break;        
            }
        
            else if(no > GenerateNo)
            {
                System.out.println("Number is Too High .");
            }    
               
            else
            {
                System.out.println("Number is Too Low .");
            }
            
            System.out.println("______________________________________________");
        }
        
        if(j > 5)
        {
            System.out.println("\nGenerte No : " + GenerateNo + "  ||  Your Gusse No : " + no);

        }            
        j+=j;
        System.out.println("________________________________________________");
        if(i<3)
        {
        System.out.print("\nDo you want to paly next round (yes / no ) ? :- ");
        user = sc.next();
        System.out.println("");
        if(user.equalsIgnoreCase("no"))
        {
            System.out.println("\n>>> Total Score of All Rounds is " + score);
            System.out.println("\n          Game Over!    ");
            System.exit(0);
        }
        }
    }
        System.out.println("\n>>> Total Score of All Rounds is " + score);
        System.out.println("\n          Game Over!    \n");
        sc.close();
    
    }
}

