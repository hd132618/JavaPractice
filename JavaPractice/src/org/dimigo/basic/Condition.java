package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		int fee;
		String car = "고속버스";
		
		if(distance <= 0) {
			System.out.println("거리는 0km 이상이어야 합니다.");
			return;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance +"km");
		
		switch(car) {
		case "고속버스" :
			System.out.println("차종 : " + car);
			fee = 850 + (distance-1)/10 * 300;
			System.out.println("통행료 : " + fee + "원");
			break;
		case "경차":
			System.out.println("차종 : " + car);
			fee = 300 + (distance-1)/10 * 200;
			System.out.println("통행료 : " + fee + "원");
			break;
		default:
			System.out.println("차종 : 그 외");
			fee = 600 + (distance-1)/10 * 200;
			System.out.println("통행료 : " + fee + "원");
		}
	}

}
