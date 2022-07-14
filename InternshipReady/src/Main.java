/*Internship
     Write a program that prompts the user to enter his class grade and contract points and uses two void methods to determine if he qualifies for an Internship.
     To qualify, the minimum contract point is 350 and class grade 70.
     Requirements
     1.	Program Design: Pseudocode
     2.	Use the java.time package to work with date and time API
     3.	Use of the getProperty method of the System Class to display user directory and name.
     4.	Method: main(),
     a.	main() calls two void methods:  qualify(), notqualify()
     5.	Scanner Class , if else statement, logical operators
     6.	Screenshot of the pseudocode
     7.	Screenshot of program run
     8.	Screenshot of source code.
     lab 18.1*/


import java.text.SimpleDateFormat;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.*;


public class Main

{

     public static void main(String[] args)

     {
          SimpleDateFormat formatter = new SimpleDateFormat("E, MMM/dd/yyyy hh:mm:ss a");
          Date date = new Date();
          System.out.println(formatter.format(date));
          System.out.println("Working Directory: " + System.getProperty("user.dir") + "\n" + "Programmer: " + System.getProperty("user.name"));

          Scanner kb = new Scanner(System.in);
          //declarations

          String name;
          double grade, contractPts;

          System.out.print("Enter your name: ");
               name = kb.nextLine();

               System.out.print("What's your class grade? ");
                    grade = kb.nextInt();


                    System.out.print("Your contract points? ");
                         contractPts = kb.nextInt();

                         if (grade >= 70 && contractPts >= 350)
                              qualify(name);
                         else
                              notQualify(name);

               }
                    //method one
                    public static void qualify(String name) //variables have to be declared when receiving or putting out arguments

                    {
                         System.out.print(name + ", you qualify for an internship! \n");


                         }
                                   //method dos
                                   public static void notQualify(String name)

                                   {

                                        System.out.print(name + ", you do not qualify for the internship\n");

                                             }


     }

     /*PSEUDOCODE

     *  import utilities
     START
     * declarations = string name; double grade, contractPts;
     *
     * display message = enter your name
     * take user input
     *
     * display message = whats your class grade
     * user input
     *
     * display message = your contract points?
     * input
     *
     *  if grade above 70 and contractPts greater than 350 call qualify method
     * else
     * call not qualify method
     *
      * method 1 = public static void qualify, this method holds string name and prints "you qualify for internship"
      * method 2 = public static void notQualify. holds string name and prints "you do not qualify

      *END

     * */
