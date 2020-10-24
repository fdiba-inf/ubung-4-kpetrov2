package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MaxElement {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the volume of the array: ");
    int i = input.nextInt();
    double[] numbers = new double[i];
    double maxn = 0;

    System.out.println("Enter numbers: ");
    for(int index = 0; index < numbers.length; index++) {

      numbers[index] = input.nextDouble();
    }
    for( int max = 1; max < numbers.length; max++) {

      if (numbers[max] > numbers[max - 1]) {

        maxn = numbers[max];
        
      }
    }
    System.out.println("Max number: " + maxn);
  }
}
