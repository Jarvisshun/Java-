package bean;
//继承 父类Person  子类
//强内聚 弱耦合
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