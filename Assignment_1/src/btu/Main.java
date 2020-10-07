package btu;
import btu.Task1.*;
import btu.Task2.*;
import btu.Task3.*;

public class Main {

    public static void main(String[] args) {
        ClassC object_1 = new ClassC();

        object_1.Method_1();
        System.out.format("\nInteger a: %d\nLast digit: %d\n", object_1.a, object_1.Method_2());
        System.out.format("\nInteger b: %d\nFirst digit: %d\n", object_1.b, object_1.Method_3());
        System.out.format("\nInteger c: %d\nDigit sum: %d\n", object_1.c, object_1.Method_4());
        //object_1.Method_5() is called by object_1.Method_6();
        object_1.Method_6();

        ClassB object_2 = new ClassB();

        object_2.Method_1();
        object_2.Method_2();
        object_2.Method_3();
        object_2.Method_4();
        System.out.format("\nint x + int y = %d\n", object_2.Method_5());

        RandomOddEven object_3 = new RandomOddEven();

        object_3.MainMethod();
    }
}
