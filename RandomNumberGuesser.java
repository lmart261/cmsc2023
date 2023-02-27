 * Instructor:Dr.Ginberg
 * Description: Build an application that will receive a guess and report if your guess is the random number that was generated.  
 * Due: 02/27/2023
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here:Leonela Martinez
*/
import java.util.Random;
import java.util.Scanner;


class RandomNumberGuesser{



public static void main(String args[]) {

Scanner keyboard = new Scanner(System.in);
System.out.print("This application generates a random integer between 0 and 100 and asks the user to guess repeatedly until they guess correctly");

System.out.print ("\nEnter the upper limit for the number: ");
int upperLimit = keyboard.nextInt();


Random random = new Random();
int number = random.nextInt(upperLimit - 1) + 1;

System.out.println ("OK, I'm thinking of a number between 0 and " + upperLimit);

int guessNumber = 1;
while(true)
{
System.out.print ("\nEnter your guess: ");
int guess = keyboard.nextInt();
if(guess>number)
System.out.println ("Your guess is too high.");
else if(guess<number)
System.out.println ("Your guess is too low.");
else{
System.out.println ("Correct");
System.out.println ("The number of guesses takes to get the correct number is " + guessNumber);
break;
}
guessNumber++;
}

System.out.println("Bye");
}
}
