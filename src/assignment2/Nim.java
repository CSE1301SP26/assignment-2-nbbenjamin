import java.util.Scanner;

public class Nim {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of sticks to start: ");
    int sticks = in.nextInt();
    System.out.println("starting with " + sticks + " sticks ");
    int i = 1;
    while (sticks > 0) {
    System.out.println("round " + i);
      System.out.print("Your turn. Enter the number of sticks to remove (1-2): ");
      int remove = in.nextInt();
      
     while (remove < 1 || remove > 2) {
        System.out.println("Invalid move. ");
        System.out.print("Your turn. Enter the number of sticks to remove (1-2): ");
        remove = in.nextInt();
     }
        
        sticks = sticks - remove;
      System.out.println(sticks + " sticks remaining ");
 
        if (sticks <= 0) {
            System.out.println("You removed the last stick. You lose!");    
        }
        else {
           int computerRemove = (int)(Math.random() * 2) + 1;
            System.out.println("Computer removes " + computerRemove + " stick(s).");
            sticks = sticks - computerRemove;
            System.out.println(sticks + " sticks remaining ");
            if (sticks <= 0) {
                System.out.println("Computer removed the last stick. You win!");
            }
  
        };
        i++;
    }




}
}