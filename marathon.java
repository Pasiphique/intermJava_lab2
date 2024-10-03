package edu.pitt.pao36.lab2;

import javax.swing.JOptionPane;

public class marathon {

	public static void main(String[] args) {
		String minutes = JOptionPane.showInputDialog(null,"minutes per mile");
		String seconds = JOptionPane.showInputDialog(null,"Seconds per mile");
		
		int minute = Integer.parseInt(minutes);
		int second = Integer.parseInt(seconds);
		
		double mile = 26.2;
		
		int totalMinutes = (int)(mile*minute);
		int totalSeconds = (int)(mile * second);
		totalMinutes+= totalSeconds/60;
		totalSeconds = totalSeconds%60;
		
		double totalHours = totalMinutes/60;
		 
		totalMinutes = totalMinutes%60;
		
		
		JOptionPane.showMessageDialog(null,"the estimated time is "+ totalHours+" hours and "+totalMinutes+ " minutes");
		

	}

}
