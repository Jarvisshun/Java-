package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person(100,1.69f);
		//p1.setAge(100);
		//p1.setHeight(1.52f);
		System.out.println("age="+p1.getAge()+"!height="+p1.getHeight());
		
	}
}

class Person{
	private int age;//��Ա����  ����
	private float height;
	
	//���췽��
	Person(int age,float height){
		this.age=age;
		this.height=height;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	public void setHeight(float height) {
		this.height=height;
	}
	public float getHeight() {
		return height;
	}
	
	
	void shout() {//��Ա���� ��Ϊ
		System.out.println("�ҵ������ǣ�"+age+"!�ҵ�����ǣ�"+height+"�ף�");
	}
}
//�̳� ����Person  ����
//ǿ�ھ� �����
class Student extends Person{
	
}







