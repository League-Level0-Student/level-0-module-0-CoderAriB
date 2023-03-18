package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2.  Ask the user a question 
		String question = JOptionPane.showInputDialog("What color is the sky?");
		// 3.  Use an if statement to check if their answer is correct
		if(question.equalsIgnoreCase("Blue")) {
			JOptionPane.showMessageDialog(null,"Good Job!");
			score+=1;
		}

		else {
			JOptionPane.showMessageDialog(null,"Incorrect");
		}
		JOptionPane.showMessageDialog(null,"Your score is "+score);
		// 4.  if the user's answer was correct, add one to their score 

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer
		String question2 = JOptionPane.showInputDialog("What is 2 + 2?");
		// 3.  Use an if statement to check if their answer is correct
		if(question2.equalsIgnoreCase("4") || question2.equalsIgnoreCase("four")) {
			
				JOptionPane.showMessageDialog(null,"Great Job!");
				score+=1;
			
		}

		else {
			JOptionPane.showMessageDialog(null,"Bad Luck");
		}
		JOptionPane.showMessageDialog(null,"Your score is "+score);
		
		String question3 = JOptionPane.showInputDialog("What is the most popular spor in the world?");
		// 3.  Use an if statement to check if their answer is correct
		if(question3.equalsIgnoreCase("Soccer") || question3.equalsIgnoreCase("futbol")){
			JOptionPane.showMessageDialog(null,"Fantastic!");
			score+=1;
		}

		else {
			JOptionPane.showMessageDialog(null,"You are wrong");
		}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,"Your score is "+score);
	}
}
