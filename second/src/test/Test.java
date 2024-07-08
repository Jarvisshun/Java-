package test;
import bean.Person;
import bean.Student;
import bean.Teacher;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.shout();
		s1.run();
		
		Teacher t1=new Teacher();
		t1.teach();
		t1.shout();
		t1.run();
		t1.eat();
	}
}