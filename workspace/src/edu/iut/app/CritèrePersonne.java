package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CritèrePersonne implements Critère{
	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> Exam){
	      List<ExamEvent> PersonExam = new ArrayList<ExamEvent>(); 
	      
	      for (ExamEvent examEvent: Exam) {
	         if(examEvent.getStudent()!= null){
	            PersonExam.add(examEvent);
	         }
	      }
	      return PersonExam;
	   }
}
