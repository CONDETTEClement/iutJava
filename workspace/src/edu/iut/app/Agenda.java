package edu.iut.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Agenda extends LinkedList<ExamEvent> implements Criteria {
	public Agenda() {		
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
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
