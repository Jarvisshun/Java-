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
		System.out.println("�ҽ�Java��");
	}
	public void shout() {
		System.out.println("����һ������ʦ��");
	}
	public void run() {
		
	}
	public void eat() {
		System.out.println("��С����");
	}
}
