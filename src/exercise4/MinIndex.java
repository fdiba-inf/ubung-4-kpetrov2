package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MinIndex {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the volume of the array: ");
    int i = input.nextInt();
    double[] numbers = new double[i];
    int indexmin = 0;
    

    System.out.println("Enter the numbers: ");
    for(int index = 0; index < numbers.length; index++) {

      numbers[index] = input.nextDouble();
      
    }
    
    double minn = numbers[0];

    for(int min = 0; min < numbers.length; min++) {

      if(minn > numbers[min]) {

        indexmin = min;
        minn = numbers[min];
        
      }
    }

    System.out.println("Min index: " + indexmin);
  }
}
