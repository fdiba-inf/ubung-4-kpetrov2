package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MinIndex {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int i = input.nextInt();
    int indexmin = 0;
    double[] numbers = new double[i];
    double minn = 0;

    for(int index = 0; index < numbers.length; index++) {

      numbers[index] = input.nextDouble();
    }
    for(int min = 1; min < numbers.length; min++) {

      if(numbers[min] < numbers[min - 1]) {

        minn = numbers[min];
        indexmin = min;
      }
    }
    System.out.println("Min index: " + indexmin);
  }
}