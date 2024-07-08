package e;
class B {
	int x = 100,y= 200;
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getXYSum() {
				return x+y;
	}
}
public class E {
	public static void main(String args[]) {
		B b = new B();
		b.setX(-100);
		b.setY(88);
		System.out.printf("%d:%d:%d", b.x, b.y, b.getXYSum());
	}
}