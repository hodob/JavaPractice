package enumpractice;


public class People {
	
	public String name; //이름
	public Season favorite_session; //좋아하는 계절

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People people = new People();
		
		people.name = "홍길동";
		people.favorite_session = Season.봄;
		
		System.out.println("이름 : " + people.name);
		System.out.println("좋아하는 계절 : "+people.favorite_session);
		
	}

}
