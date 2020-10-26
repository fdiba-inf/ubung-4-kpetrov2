package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MaxElement {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the volume of the array: ");
    int i = input.nextInt();
    double[] numbers = new double[i];
    

    System.out.println("Enter numbers: ");
    for(int index = 0; index < numbers.length; index++) {

      numbers[index] = input.nextDouble();
    }
    
    double maxn = numbers[0];

    for( int max = 0; max < numbers.length; max++) {

      if (numbers[max] > maxn) {

        maxn = numbers[max];
        
      }
    }
    System.out.println("Max number: " + maxn);
  }
}