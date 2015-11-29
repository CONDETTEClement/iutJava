package edu.iut.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Agenda extends LinkedList<ExamEvent> {
	public Agenda() {		
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	

	
}
