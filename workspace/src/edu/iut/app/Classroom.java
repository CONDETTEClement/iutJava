package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class Classroom implements Criteria  {
	
	public Classroom() {
		classRoomNumber="not affected";
	}
	public Classroom(String classRoomNumber) {
		this.classRoomNumber = classRoomNumber;
	}
	
	public void setClassroomNumber(String number) {
		this.classRoomNumber = number;
	}
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
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
