package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the volume of the array: ");
    int i = input.nextInt();
    char[] letters = new char[i];
    char[] reverse = new char[i];

    System.out.println("Enter the letters of your word: ");

    for(int index = 0; index < letters.length; index++) {

      letters[index] = input.next().charAt(0);      
    }
    
    for(int indexr = 0; indexr < reverse.length; indexr++) {

      i--;
      reverse[indexr] = letters[i];
      }

      String reverseAsString = Arrays.toString(reverse);
      System.out.println("Reversed symbols: " + reverseAsString);
    }

  }