package ch10_extends_interface.ramen;

public class RamenMain {

	public static void main(String[] args) {
//		Ramen rame = new Ramen("진라면", 1000) // 추상클래스는 객체로 만들 수 없음
		JinRamen jin = new JinRamen("진라면 매운맛", 1000);
		jin.printRecipe();
		
		JjaPpagheti Jja = new JjaPpagheti("사천 짜파게티", 1200);
		Jja.printRecipe();
	}

}