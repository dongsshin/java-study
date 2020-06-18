package selfstudy.exec01.dss01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCustomizedTest {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("1",1,1,1));
		sList.add(new Student("9",1,1,1));
		sList.add(new Student("2",1,1,1));
		sList.add(new Student("1",1,1,1));
		sList.add(new Student("5",1,1,1));
		sList.add(new Student("7",1,1,1));
		sList.add(new Student("4",1,1,1));
		sList.add(new Student("2",1,1,1));
		sList.add(new Student("3",1,1,1));
		Collections.sort(sList, new StudentComparator());
		for(Student s : sList){
			System.out.println(s.getName());
		}
	}
	public static class StudentComparator implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2){
			return s1.getName().compareTo(s2.getName());
		}
	}
}
class Student{
	private String name;
	private int parm1;
	private int parm2;
	private int parm3;
	private int parm4;
	
	public Student(String name, int parm1, int parm2, int parm3) {
		super();
		this.name = name;
		this.parm1 = parm1;
		this.parm2 = parm2;
		this.parm3 = parm3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParm1() {
		return parm1;
	}
	public void setParm1(int parm1) {
		this.parm1 = parm1;
	}
	public int getParm2() {
		return parm2;
	}
	public void setParm2(int parm2) {
		this.parm2 = parm2;
	}
	public int getParm3() {
		return parm3;
	}
	public void setParm3(int parm3) {
		this.parm3 = parm3;
	}
	public int getParm4() {
		return parm4;
	}
	public void setParm4(int parm4) {
		this.parm4 = parm4;
	}
	
}
