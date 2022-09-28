import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double salary;
        String name;
        String trash;
        int age;
        int favNum;

        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.println("You said your name is: " + name);

        //Not bulletproof
     /*   System.out.print("\nEnter your age: ");
        age = in.nextInt();

        System.out.println("You said your age is: " + age);
    */

        System.out.print("\nEnter your age: ");
        if(in.hasNextInt()){
            age = in.nextInt();
            in.nextLine(); //clear buffer after reading a number
            System.out.println("You said your age is " + age);
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number.");
        }

        System.out.print("\nEnter your salary: ");
        if(in.hasNextDouble()){
            salary = in.nextDouble();
            in.nextLine();
            System.out.println("You said your salary is " + salary);
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is bad input.");
        }
        //FavNum 1-10
        System.out.print("\nEnter your fav num [1-10]: ");
        if(in.hasNextInt()){
            favNum = in.nextInt();
            in.nextLine(); //clear buffer after reading a number
            if(favNum >= 1 && favNum <= 10){
                System.out.println("You said your fav num is " + favNum);
            } else {
                System.out.println("You said your fav num is " + favNum + " but that is out of range.");
            }

        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number.");
        }



    }
}