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
	private int age;//成员变量  属性
	private float height;
	
	//构造方法
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
	
	
	void shout() {//成员方法 行为
		System.out.println("我的年龄是："+age+"!我的身高是："+height+"米！");
	}
}
//继承 父类Person  子类
//强内聚 弱耦合
class Student extends Person{
	
}







