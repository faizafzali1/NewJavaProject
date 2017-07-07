package faiz;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junit.framework.Assert;

@RunWith(Parameterized.class)
public class StudentTest {
	int score2;
	public StudentTest(int score2) {
		this.score2=score2;
	}
	Student st = new Student();
	
	@Parameterized.Parameters
	public static List<Integer> getGrade(){
		Integer[] scores = new Integer[] {46, 95, 78 , 90 , 45};
		return Arrays.asList(scores);
	}
	
	@Test
	public void getGradeTest() {
		
		Assert.assertEquals("Failed", st.getGrade(score2));
		
	}


}
