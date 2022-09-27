import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String data = "";
        String name = "";

        System.out.println("Enter your name: ");
        name = in.nextLine();

        System.out.println("You said your name is: " + name);
    }
}