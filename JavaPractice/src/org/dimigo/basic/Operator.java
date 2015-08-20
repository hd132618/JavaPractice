package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a1 = 9, a2 = 9, b1 = 10;
		double h1 = 5.8, h2 = 5.4, k1, k2; // k1 -> 사다리꼴 넓이, k2 -> 평행사변형 넓이
		k1 = (a1 + b1) * h1 / 2;
		k2 = a2 * h2;
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + k1);
		System.out.println("평행사변형 넓이 : " + k2 + "\n\n");
		
		if(k1 > k2) {
			System.out.println("사다리꼴이 평행사변형보다 " + (k1 - k2) + " 더 큽니다.");
		}
		else if(k1 == k2){
			System.out.println("사다리꼴과 평행사변형의 넓이는 " + k1 + "로 같습니다.");
		}
		else{
			System.out.println("평행사변형이 사다리꼴보다 " + (k2 - k1) + " 더 큽니다.");
		}

	}

}
