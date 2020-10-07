package btu.Task2;

public class ClassB extends ClassA{
    int y;

    public void Method_4(){
        System.out.println("\nInput integer y:");
        y = input.nextInt();
    }

    public int Method_5(){
        return x + y;
    }
}
