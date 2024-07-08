package zhx;
//测试类
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
		p2.school="河北金融学院";
		p2.profession="信息安全";
		p2.study();
	}
}
//实体类
class Person {
	int age;//成员变量
	float height;
	void shout() {//成员方法
		System.out.println("oh!My age is "+age+"岁啦！我的身高是："+height+"米！");
	}
}
class Students extends Person{
	String  school;
	String  profession;
	void study(){
		System.out.println("我的学校是"+school+"!我的专业是"+profession);
	}
}
