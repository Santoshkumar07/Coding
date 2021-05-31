package com.vm.training.java.exceptionhandling;
import java.io.*;
class Training{
	void train() throws Exception{
		
		System.out.println("dotnet zero knowledge");
	}
	
	
void trainAllSubjects() throws Exception{
	specificTraining();
		
		System.out.println("can train all subjects");
	}
void specificTraining() throws Exception{
	train();
	System.out.println("can only train on java and angular");
}

}

/*public class ThrowsTest {
	//main method is also not handling the exception.JVM will take care

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Training  training = new Training();
		training.train();
	}

}*/
