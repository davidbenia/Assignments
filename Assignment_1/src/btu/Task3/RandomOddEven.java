package btu.Task3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomOddEven {
    Scanner input = new Scanner(System.in);
    int a, b;

    public RandomOddEven(){
        System.out.println("\nInput integers:");
        a = input.nextInt();
        b = input.nextInt();

        this.MaxSwitch();
    }

    public void MaxSwitch(){
        int temp = 0;

        if(b > a){
            temp = a;
            a = b;
            b = temp;
        }
    }

    public int[] FortyRandoms(){
        int[] forty_rands = new int[40];
        Random random_1 = new Random();

        for(int i = 0; i < forty_rands.length; i++){
            forty_rands[i] = random_1.nextInt(a - b + 1) + b;
        }

        return forty_rands;
    }

    public void MainMethod(){
        int[] forty_rands = this.FortyRandoms();
        int[] five_rands = new int[5];
        int odds_sum = 0, evens_sum = 0;
        ArrayList<Integer> odds = new ArrayList<Integer>();
        ArrayList<Integer> evens = new ArrayList<Integer>();
        Random random_2 = new Random();

        for(int i = 0; i < forty_rands.length; i++){
            if(forty_rands[i] % 2 != 0)
                odds.add(forty_rands[i]);
            else
                evens.add(forty_rands[i]);
        }

        //Summing odds and evens;
        for(int i : odds){
            odds_sum += i;
        }
        for(int i : evens){
            evens_sum += i;
        }

        //MaxSwitch for odds and evens;
        int temp = 0;
        if(evens_sum > odds_sum){
            temp = odds_sum;
            odds_sum = evens_sum;
            evens_sum = temp;
        }

        for(int i = 0; i < five_rands.length; i++){
            five_rands[i] = random_2.nextInt(odds_sum - evens_sum + 1) + evens_sum;
        }

        //Printing section;
        System.out.format("\nOdd number amount: %d" +
                "\nEven number amount: %d\n", odds.size(), evens.size());

        System.out.format("\nOdd number sum: %d" +
                "\nEven number sum: %d\n", odds_sum, evens_sum);

        System.out.format("\nFive random numbers between odds_sum and evens_sum: %s", Arrays.toString(five_rands));
    }
}
