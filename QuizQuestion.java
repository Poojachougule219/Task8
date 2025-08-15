package task_8;

import java.util.List;

public class QuizQuestion {
	
	private String question;
	private List<String> options;
	private int correctOptionIndex;
	
	public QuizQuestion(String question,List<String> options,int correctOptionIndex)
	{
		this.question=question;
		this.setOptions(options);
		this.correctOptionIndex=correctOptionIndex;
		
	}
	
	public void displayQuestion()
	{
		System.out.println(question);
		for(int i=0;i<getOptions().size();i++)
		{
			System.out.println((i+1)+"."+getOptions().get(i));
		}
	}
	
	public boolean isCorrect(int userChoice)
	{
		return(userChoice-1)==correctOptionIndex;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

}
