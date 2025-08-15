package task_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicMarkableReference;

public class QuizApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<QuizQuestion> quizQuestions=new ArrayList<>();
		
		quizQuestions.add(new QuizQuestion(
				"Which planet is known as the Red Planet ?", 
				List.of("Earth","Mars","Jupiter","Saturn"), 
				1));
		
		quizQuestions.add(new QuizQuestion(
				"Who wrote 'Remeo and juliet ? ", 
				List.of("Mark Twain","William Shakespear","Charles Dichens","Jane Austen"), 
				1));
		
		quizQuestions.add(new QuizQuestion(
				"What is the capital of France ? ", 
				List.of("Berlin","Madrid","Paris","Lisbon"), 
				2));
		
		
		int score=0;
		for(int i=0;i<quizQuestions.size();i++)
		{
			QuizQuestion question=quizQuestions.get(i);
			System.out.println("\n Question"+(i+1)+".");
			question.displayQuestion();
			
			System.out.println("Your Answer(1-"+question.getOptions().size() + "):");
			
			int userAnswer;
			try {
				userAnswer=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e)
			{
				System.out.println("Invalid input.Moving to next question.");
				continue;
			}
			
			if(question.isCorrect(userAnswer))
			{
				System.out.println("correct");
				score++;
			}
			else {
				System.out.println("wrong");
			}
		}
		
		
		System.out.println("\nQuiz Completed !");
		System.out.println("Your score : "+score+"out of"+quizQuestions.size());
		
		sc.close();
		
	}

}
