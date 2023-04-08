package mphasis_internal_iv_prep.forjpmc.ArrayOfStudentMarksAvrg;

public class StudentScore {
	public int getBestAverageScore(String[][] scores) {
		int avg = 0,sum=0,noofStudents=scores.length;
		for(int row=0;row<noofStudents;row++) {
			for(int col=1;col<2;col++) {
				sum=sum+ Integer.parseInt(scores[row][col]);
				//System.out.println(scores[row][col]);
			}			
		}
		avg=(int)Math.floor(sum/noofStudents);
		return avg;
	}
	public static void main(String[] args) {
		StudentScore s = new StudentScore();
		String[][] students= {{"pk","1"},{"Jay","2"},{"Pushpa","3"}};
		System.out.println("The Studets List: ");
		for(String st[]:students) {
			System.out.println(st[0] +"\t"+st[1]);
		}
		System.out.println("The average of students marks: "+s.getBestAverageScore(students));
		
	}
}
