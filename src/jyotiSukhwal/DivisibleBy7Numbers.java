package jyotiSukhwal;

public class DivisibleBy7Numbers{
	
	int maxNums, sumNums, avgNums;
	float count ;
	
	void printNumbers(int startIndex, int endIndex){
		
		System.out.print("Numbers divisible by 7: ");
		for(int i=startIndex; i<=endIndex; i++){
			if(i%7 == 0){
				System.out.print(i + ", ");
				sumNums = sumNums + i ;
				count++;
			}
		}
		System.out.println("\n" + "Maximum number divisible by 7: " + (endIndex - (endIndex %7 )));
		System.out.println("Sum of numbers divisible by 7: " + sumNums);
		System.out.println("Average of numbers divisible by 7: " + ((float)(sumNums/count)));
	} 
	
	public static void main(String[] args){
		DivisibleBy7Numbers divisibleBy7Numbers = new DivisibleBy7Numbers();
		int startIndex = 10;
		int endIndex = 50;
		divisibleBy7Numbers.printNumbers(startIndex, endIndex);
	}
	
}


/* 
Write a program that accepts a user-defined range (starting and ending number) and performs the following tasks:

1. Print all numbers divisible by 7 within the range.
2. Find and print the maximum number divisible by 7 within the range.
3. Calculate and print the sum of all numbers divisible by 7 within the range.
4. Calculate and print the average of numbers divisible by 7.

Input:
* Two integers from the user: start and end (start of the range and end of the range).

Output:
* List of numbers divisible by 7.
* Maximum number divisible by 7.
* Sum of all numbers divisible by 7.
* Average of numbers divisible by 7.

Example:
Input:
Enter start of range: 10
Enter end of range: 50

Output:
Numbers divisible by 7: 14 21 28 35 42 49
Maximum number divisible by 7: 49
Sum of numbers divisible by 7: 189
Average of numbers divisible by 7: 31.5
*/