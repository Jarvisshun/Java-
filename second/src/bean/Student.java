package bean;
//�̳� ����Person  ����
//ǿ�ھ� �����
public class Student implements Person{
	private String school;
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public void shout(){
		System.out.println("I am a good student!");
	}
	public void run() {
		
	}
	public void eat() {
		
	}
}