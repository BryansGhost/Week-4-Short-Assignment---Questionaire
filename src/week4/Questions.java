package week4;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Questions {


	// question value place holders
	private int q1;
	private int q2;
	private int q3;
	private int q4;
	private int q5;
	private int q6;
	private int q7;
	private int q8;
	private int q9;
	private int q10;
	private int q11;
	private int q12;
	private int q13;
	private int q14;
	private int q15;
	
	// variables that will hold the final decision
	private int desktop = (q1 + q4 + q6 + q8 + q10 + q12 + q14);
	private int laptop = (q2 + q3 + q5 + q7 + q9 + q11 + q13 + q15);
	
	// Final decision of what to recommend the user
	private static String desktopSuggestion = "The best computing device for you would be a DESKTOP computer. +"
			+ "\nDesktops are cost-effective, upgradable, and customizable while being powerful+"
			+ "\nhome-bound machines. They are not portable and moving them often can risk issues.";
	
	private static String laptopSuggestion = "The best computing device for you would be a LAPTOP. +"
			+ "\nLaptops are small, portable devices that can be used wherever you feel like working. +"
			+ "\nThey can be used indoors and outdoors but risk a limited power supply, processing power, and upgradability.";
	
	public static String statement(int desktop, int laptop){
		if (desktop > laptop){
			return desktopSuggestion;
		}else{
		return laptopSuggestion;
		}
	}
	
	// no arg-constructor
	public Questions(){
		
	}

	// getters and setters
	public int getQ1() {
		return q1;
	}

	public void setQ1(int q1) {
		this.q1 = q1;
	}

	public int getQ2() {
		return q2;
	}

	public void setQ2(int q2) {
		this.q2 = q2;
	}

	public int getQ3() {
		return q3;
	}

	public void setQ3(int q3) {
		this.q3 = q3;
	}

	public int getQ4() {
		return q4;
	}

	public void setQ4(int q4) {
		this.q4 = q4;
	}

	public int getQ5() {
		return q5;
	}

	public void setQ5(int q5) {
		this.q5 = q5;
	}

	public int getQ6() {
		return q6;
	}

	public void setQ6(int q6) {
		this.q6 = q6;
	}

	public int getQ7() {
		return q7;
	}

	public void setQ7(int q7) {
		this.q7 = q7;
	}

	public int getQ8() {
		return q8;
	}

	public void setQ8(int q8) {
		this.q8 = q8;
	}

	public int getQ9() {
		return q9;
	}

	public void setQ9(int q9) {
		this.q9 = q9;
	}

	public int getQ10() {
		return q10;
	}

	public void setQ10(int q10) {
		this.q10 = q10;
	}

	public int getQ11() {
		return q11;
	}

	public void setQ11(int q11) {
		this.q11 = q11;
	}

	public int getQ12() {
		return q12;
	}

	public void setQ12(int q12) {
		this.q12 = q12;
	}

	public int getQ13() {
		return q13;
	}

	public void setQ13(int q13) {
		this.q13 = q13;
	}

	public int getQ14() {
		return q14;
	}

	public void setQ14(int q14) {
		this.q14 = q14;
	}

	public int getQ15() {
		return q15;
	}

	public void setQ15(int q15) {
		this.q15 = q15;
	}
	
}
