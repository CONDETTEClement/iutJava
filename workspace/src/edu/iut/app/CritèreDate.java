package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CritèreDate implements Critère{

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> Exam){
	      List<ExamEvent> DateExam = new ArrayList<ExamEvent>(); 
	      
	      for (ExamEvent examEvent: Exam) {
	         if(examEvent.getExamDate()!= null){
	            DateExam.add(examEvent);
	         }
	      }
	      return DateExam;
	   }
}
