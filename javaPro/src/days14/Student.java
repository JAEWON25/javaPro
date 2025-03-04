package days14;

public class Student {
	
	// 필드
	public int no;
	public String name;
	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + ", rank=" + rank + ", wrank=" + wrank + ", avg=" + avg + "]";
	}

	// 메소드
	public String getInfo() {
		return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \t%d\n"
				, no
				, name 
				, kor , eng , mat, tot 
				, avg , rank, wrank);
	}

}
