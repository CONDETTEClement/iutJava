package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.ApplicationSession;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		/** EX3: REMPLACEMENT DU BOUTON NEXT */
		Calendar c=new GregorianCalendar(); 
		int currentYear = c.get(Calendar.YEAR);
		int currentMonth = c.get(Calendar.MONTH);
		int currentDate = c.get(Calendar.DAY_OF_WEEK);
		SpinnerModel model = new SpinnerNumberModel(currentYear, 2010, 2020, 1);   
		JSpinner spinner = new JSpinner(model);
		this.add(spinner); 
		String []jours =  {"lundi", "mardi", "mercredi", "jeudi","vendredi","samedi","dimanche"};
		JComboBox boxDay = new JComboBox(jours);   
        this.add(boxDay);
        String []mois =  {"janvier", "février", "mars", "avril","mai","juin","juillet","août","septembre","octobre","novembre","décembre"};
		JComboBox boxMonth = new JComboBox(mois);  
        boxMonth.setSelectedIndex(currentDate);
        this.add(boxMonth);
        boxMonth.setSelectedIndex(currentMonth);
	}
	
	public int getYear() {
		return selectedYear;
	}
	public int getMonth() {
		return selectedMonth;
	}
	public int getDay() {
		return selectedDay;
	}
	
}
