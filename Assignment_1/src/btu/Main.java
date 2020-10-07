package btu;
import btu.Task1.*;
//import btu.Task2.*;
//import btu.Task3.*;

public class Main {

    public static void main(String[] args) {
        ClassC object_1 = new ClassC();

        object_1.Method_1();
        System.out.format("\nInteger a: %d\nLast digit: %d\n", object_1.a, object_1.Method_2());
        System.out.format("\nInteger b: %d\nFirst digit: %d\n", object_1.b, object_1.Method_3());
        System.out.format("\nInteger c: %d\nDigit sum: %d\n", object_1.c, object_1.Method_4());
        //object_1.Method_5() is called by object_1.Method_6();
        object_1.Method_6();
    }
}
