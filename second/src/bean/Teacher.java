package bean;

public class Teacher implements Person {
	private String danwei;
	
	public String getDanwei() {
		return danwei;
	}

	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}

	public void teach() {
		System.out.println("我教Java！");
	}
	public void shout() {
		System.out.println("我是一个好老师！");
	}
	public void run() {
		
	}
	public void eat() {
		System.out.println("喝小米粥");
	}
}
