package zhx;
//������
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1;
		p1=new Person();
		p1.age=29;
		p1.height=2.26f;
		p1.shout();
		Students p2;
		p2=new Students();
		p2.school="�ӱ�����ѧԺ";
		p2.profession="��Ϣ��ȫ";
		p2.study();
	}
}
//ʵ����
class Person {
	int age;//��Ա����
	float height;
	void shout() {//��Ա����
		System.out.println("oh!My age is "+age+"�������ҵ�����ǣ�"+height+"�ף�");
	}
}
class Students extends Person{
	String  school;
	String  profession;
	void study(){
		System.out.println("�ҵ�ѧУ��"+school+"!�ҵ�רҵ��"+profession);
	}
}
