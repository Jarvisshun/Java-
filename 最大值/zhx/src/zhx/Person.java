package first;

public class Person {

public static void main(String[] args) {
// TODO Auto-generated method stub
	Person1 p1;
	p1=new Person1();
	p1.age=19;
	p1.height=1.80f;
	p1.shout();
	student p2;
	p2=new student();
	p2.school="河北金融学院";
	p2.speciality="信息安全";
	p2.shout();
	p2.study();
	teacher p3;
	p3=new teacher();
	p3.age=35;
	p3.say();
	p3.duties="教授";
	p3.teach();
		}
}
//实体类
		class Person1 {
		int age;//成员变量
		float height;
		void shout() {//成员方法
		System.out.println("oh!My god!My age is "+age+"岁啦！我的身高是："+height+"米！");
	}
}
		//继承extends
		class student extends Person{
		float height;
		String school;
		String speciality;
		void shout(){
		System.out.println("我的学校是"+school+"!");
			}
		void study(){
		System.out.println("我的专业是"+speciality+"!");
			}
}
		class teacher extends Person{
		int age;
		String duties;
		void teach() {
		System.out.println("我的职务是"+duties+".");
		}
		void say() {
		System.out.println("oh!My god!My age is "+age+"岁啦！");
			}
	}


