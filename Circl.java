public class Circl {

	int radius; // 원의 반지름 
	String name; // 원의 이름

	public Circl() { //생성자
	} 

	public double getArea() { // 계산 
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circl pizza;
		pizza = new Circl();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		Circl donut = new Circl();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea(); //
		System.out.println(donut.name + "의 면적은 " + area);
	}
}