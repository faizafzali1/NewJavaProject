package faiz;

public class Student {

	int score;
	String grade;
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	}
	
	public String getGrade(int score) {
		if (score >= 90 && score <= 100) {
			grade = "A";
			return grade;
		} else if (score >= 80 && score <= 90) {
			grade = "B";
			return grade;
		} else {
			return "Failed";
		}
		}

}
