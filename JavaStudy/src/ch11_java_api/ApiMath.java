package ch11_java_api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * class Name : ApiMath Author : Smoothie Created Date : 2024. 8. 19. Version :
 * 1.0 Purpose : Description :
 */

public class ApiMath {
	public static void main(String[] args) {
		// Math: 수학에서 사용되는 여러가지 함수들을 메서드로 제공하는 클래스
		final double PI = 3.141592;
		// 반올림 round
		long roundPI = Math.round(PI);
		System.out.println(roundPI);
		// 소수 넷째 자리에서 반올림
		double fourPI = (Math.round(PI * 1000)) / 1000.0;
		System.out.println(fourPI);
		// 올림 ceil 내림 floor
		double ceilPI = Math.ceil(PI);
		System.out.println(ceilPI);
		// 제곱근 sqrt
		System.out.println(Math.sqrt(4));
		// 3의 4제곱 pow
		System.out.println(Math.pow(3, 4));
		// 10 ~ 20 랜덤 숫자
		int ranNum = (int) ((Math.random() * 11) + 10);
		System.out.println(ranNum);
		
		ArrayList<String> classMate = new ArrayList<>(Arrays.asList("강민호", "권철규", "김윤아", "김정인", "김혜원", "박정호",
							  "서원빈", "안서령", "이소희", "이승욱", "이원호", "전영범", 
							  "전종화", "정도현", "최대준", "최지은", "한준희"));
		HashMap<String, String> result = randomGame(classMate);
		Set<String> keySet = result.keySet();
		for(String key : keySet) {
			System.out.println(key + "님은" + result.get(key));
		}
		
	}
	
	public static String randomCard() {
		String result = null;
		// Random은 class로도 존재함
		Random random = new Random();
		// 1 ~ 100 사이 정수
		int num = random.nextInt(100) + 1;
		// 10 % 확률로 당첨
		if(num <= 10) {
			result = "당첨";
		}else {
			result = "꽝";
		}
		
		return result;
		
	}
	
	public static HashMap<String, String> randomGame(ArrayList<String> arr){
		HashMap<String, String> resultMap = new HashMap<String, String>();
		for(int i = 0 ; i < arr.size() ; i ++) {
			resultMap.put(arr.get(i), randomCard());
		}
		
		return resultMap;
	}
}