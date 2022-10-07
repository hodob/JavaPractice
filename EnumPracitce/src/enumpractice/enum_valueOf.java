package enumpractice;

public class enum_valueOf {

	public static void main(String[] args) {

		//values()메소드는 매개 값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴합니다.
		Season season = Season.valueOf("가을");
		System.out.println(season);
	}

}
