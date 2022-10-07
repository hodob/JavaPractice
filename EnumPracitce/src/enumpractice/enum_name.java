package enumpractice;

public class enum_name {

	public static void main(String[] args) {
		
		// 객체가 가지고 있는 문자열을 리턴합니다.
		Season season = Season.가을;
		String name = season.name();
		System.out.println(name);

	}

}
