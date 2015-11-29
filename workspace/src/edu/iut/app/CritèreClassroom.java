package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CritèreClassroom implements Critère{
	
	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> Exam){
	      List<ExamEvent> ClassroomExam = new ArrayList<ExamEvent>(); 
	      
	      for (ExamEvent examEvent: Exam) {
	         if(examEvent.getClassroom()!= null){
	            ClassroomExam.add(examEvent);
	         }
	      }
	      return ClassroomExam;
	   }
}
