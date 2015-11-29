package edu.iut.app;

import java.util.List;

public interface Critère{
   public List<ExamEvent> meetCriteria(List<ExamEvent> evenement);
}