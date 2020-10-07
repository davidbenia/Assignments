package btu.Task1;
import java.util.Scanner;

public class ClassC {
    Scanner input = new Scanner(System.in);
    public int a, b, c;

    public void Method_1(){
        System.out.println("\nInput integers:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }

    public int Method_2(){
        String integer_str = Integer.toString(a);
        String last_digit_str;
        int last_digit_int;

        last_digit_str = integer_str.substring((integer_str.length() - 1));
        last_digit_int = Integer.parseInt(last_digit_str);

        return last_digit_int;
    }

    public int Method_3(){
        String integer_str = Integer.toString(b);
        String first_digit_str;
        int first_digit_int;

        first_digit_str = integer_str.substring(0, 1);
        first_digit_int = Integer.parseInt(first_digit_str);

        return first_digit_int;
    }

    public int Method_4(){
        String integer_str = Integer.toString(c);
        String digit_array[] = integer_str.split("");
        int digit_sum_int = 0;

        for(String digit : digit_array){
            digit_sum_int += Integer.parseInt(digit);
        }

        return digit_sum_int;
    }

    private int Method_5(){
        int answer = this.Method_2() * this.Method_3();

        System.out.format("\nint a last digit multiplied by int b first digit:\n%d\n", answer);

        return answer;
    }

    public void Method_6(){
        int answer = this.Method_3() + this.Method_5();

        System.out.format("\n(int a last digit multiplied by int b first digit) plus int c digit sum:\n%d\n", answer);
    }
}
