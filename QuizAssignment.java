package com.quizApplication;
import java.util.*;

public class QuizAssignment {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score=0;
		
		do {
			System.out.println("Welcome to the QUIZ GAME...");
			System.out.println("Press 'Y' to Start [Attention: USE CAPSLOCK ON]");
			char key = sc.next().charAt(0);
			char playAgain;
			
			if(key == 'Y') {
				
				do {
					System.out.println("Q1.  Which data type is used to store decimal numbers in Java?");
					System.out.println("A. int \nB. float \nC. char \nD. boolean");
					System.out.print("Answer: ");
					char ans1 = sc.next().charAt(0);
					
					if(ans1 == 'B') {
						System.out.println("Correct");
						score++;
					}else {
						System.out.println("Oops Incorrect, Better Luck Next Time!");
					}
					
					System.out.println();
					
					System.out.println("Q2.  Java is known as a platform-independent language because: ");
					System.out.println("A. It can only run on Windows \nB. Java programs are compiled into machine code \nC. Java programs are compiled into bytecode that runs on JVM \nD. It requires no compilation");
					System.out.print("Answer: ");
					char ans2  = sc.next().charAt(0);
					
					if(ans2 == 'C') {
						System.out.println("Correct");
						score++;
					}else {
						System.out.println("Oops Incorrect, Better Luck Next Time!");
					}
					
					System.out.println();
					
					System.out.println("Q3.  Java is a _______ language");
					System.out.println("A. Low-level \nB. Middle-level \nC. Machine-level \nD. High-level");
					System.out.print("Answer: ");
					char ans3 = sc.next().charAt(0);
					
					if(ans3 == 'D') {
						System.out.println("Correct");
						score++;
					}else {
						System.out.println("Oops Incorrect, Better Luck Next Time!");
					}
					
					System.out.println();
					
					System.out.println("Q4.  Which of the following executes Java bytecode?");
					System.out.println("A. JDK \nB. JVM \nC. Compiler \nD. JIT");
					System.out.print("Answer: ");
					char ans4 = sc.next().charAt(0);
					
					if(ans4 == 'B') {
						System.out.println("Correct");
						score++;
					}else {
						System.out.println("Oops Incorrect, Better Luck Next Time!");
					}
					
					System.out.println();
					
					System.out.println("Q5.  Who developed Java?");
					System.out.println("A. Sun Microsystems \nB. Microsoft \nC. Google \nD. Apple");
					System.out.print("Answer: ");
					char ans5 = sc.next().charAt(0);
					
					if(ans5 == 'A') {
						System.out.println("Correct");
						score++;
					}else {
						System.out.println("Oops Incorrect, Better Luck Next Time!");
					}
					
					System.out.println();
					
					System.out.println("Final Result: " + score + "/5 Quiz are Correct");
					System.out.println();
					
					System.out.println("Want to Play Again? (Y/N)");
					playAgain = sc.next().charAt(0);
					if(playAgain == 'N') {
						System.out.println("Thank You for Playing");
						break;
					}
					
				}while(playAgain == 'Y');
				
			}else {
				System.out.println("Thank You, Visit Again!");
			}
			
		
		}while(false);
	}
}
