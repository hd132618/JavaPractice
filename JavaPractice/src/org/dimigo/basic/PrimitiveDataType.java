package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		Boolean female = true;
		int age = 23;
		double heigh = 161.8;
		float weigh = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		if(female) System.out.println("성별 : 여자");
		else System.out.println("성별 : 남자");
		System.out.println("나이 : " + age + " 세");
		System.out.println("키 : " + heigh + " cm");
		System.out.println("몸무게 : " + weigh + " kg");
		System.out.println("혈액형 : " + bloodtype +" 형");
	}

}
