package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		long salary = 1700000L;
		long employee = 3L;
		long jumpo = 1500L;
		long year;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : "  + String.format("%,d",salary)+"원");
		System.out.println("점포 내 직원 수 : " + employee + "명");
		System.out.println("점포 수 : " + String.format("%,d",jumpo) + "개\n\n");
		year = salary * employee * jumpo * 12;
		System.out.println("연간 인건비 : " + String.format("%,d",year) + "원");
		
	}

}
