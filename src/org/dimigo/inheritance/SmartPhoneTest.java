package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] phones = {
				new IPhone("IPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
				};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			if(phone instanceof IPhone) {
				IPhone a = (IPhone)phone;
				a.useAirDrop();
			}
			if(phone instanceof Galaxy) {
				Galaxy a = (Galaxy)phone;
				a.useWirelessCharging();
			}
			phone.useSpecialFunction(phone);
			
			phone.turnOff();
			System.out.println();
		}
		
	}

}
