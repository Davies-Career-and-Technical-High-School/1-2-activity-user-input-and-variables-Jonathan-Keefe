/* Activity 1.2 - Question 2 */
import java.util.Scanner;


class Question2 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);
      String name1;
      String name2;
      String name3;
      System.out.println("Give me a name");
      name1 = scan.nextLine();
      System.out.println("Give me a name");
      name2 = scan.nextLine();
      System.out.println("Give me a name");
      name3 = scan.nextLine();
      System.out.println( name1 + " " + name2 + " " + name3);
    }
}