package btu.Task2;
import java.util.Scanner;

public class ClassA {
    Scanner input = new Scanner(System.in);
    int x;

    //Constructor 1
    public ClassA(){
        System.out.println("\nHello\n");
    }

    public void Method_1(){
        System.out.println("\nInput integer x:");
        x = input.nextInt();
    }

    public void Method_2(){
        System.out.format("\nx + 12 = %d\n", (x + 12));
    }

    public void Method_3(){
        if(x % 2 != 0)
            System.out.println("\nInteger x is odd.\n");
        else
            System.out.println("\nInteger x is even.\n");
    }
}
