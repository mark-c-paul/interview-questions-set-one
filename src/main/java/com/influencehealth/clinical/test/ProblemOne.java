package com.influencehealth.clinical.test;

/*
 * For your first programming problem, use the main method below to create a program that
 * does the following:
 * 
 * Given the numbers in the supplied list, write the implementation of three methods:
 * - Sum the numbers using a for loop
 * - Sum the numbers using a while loop
 * - Sum the numbers using recursion 
 * 
 * Run the program using Run As -> Java Application, and ensure that the output of the program
 * lists the value for the sum.
 */

public class ProblemOne
{

    public static void main(String[] args)
    {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("Sum using for loop: " + sumWithForLoop(numbers));
        System.out.println("Sum using while loop: " + sumWithWhileLoop(numbers));
        System.out.println("Sum using recursion: " + sumWithRecursion(numbers, numbers.length));

    }

    private static int sumWithForLoop(int[] numbers)
    {
        // change this method to sum the numbers using a for loop and return
    	int sum = 0;
    	for(int i : numbers){
    		sum+=i;
    	}
        return sum;
    }

    private static int sumWithWhileLoop(int[] numbers)
    {
    	int sum = 0;
    	int count = 0;
        while(count < numbers.length){
        	sum+=numbers[count++];
        }
        return sum;
    }

    private static int sumWithRecursion(int[] numbers, int index)
    {
        // change this method to sum the numbers using a recursion
    	if(index<=0){
    		return 0;
    	}
    	return sumWithRecursion(numbers, index-1) + numbers[index-1];
    }
    

}
