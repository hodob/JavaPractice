package enumpractice;

public class enum_compareTo {

	public static void main(String[] args) {
		
		//compareTo()메소드는 매개값으로 주어진 열거 객체를 기준으로 전후로 몇번째 위치하는지 비교합니다. 
		//만약 열거 객체가 매개값의 열거 객체보다 순번이 빠르다면 음수가, 순번이 늦다면 양수가 리턴됩니다.
    	Season seson1 = Season.가을;
    	Season seson2 = Season.겨울;
    	
    	int result1 = seson1.compareTo(seson2);
    	int result2 = seson2.compareTo(seson1);
    	
    	System.out.println("result1 = " +result1);
    	System.out.println("result2 = " +result2);
	}

}
