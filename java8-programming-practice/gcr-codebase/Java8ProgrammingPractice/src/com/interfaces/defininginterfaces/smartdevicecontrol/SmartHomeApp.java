/*Smart Device Control Interface
○ Scenario: All devices (lights, AC, TV) should have turnOn() and turnOff()
methods.
○ Task: Create an interface and implement it in multiple classes.*/

package com.interfaces.defininginterfaces.smartdevicecontrol;

public class SmartHomeApp {
	public static void main(String[] args) {

		SmartDevice light = new Light();
		SmartDevice ac = new AirConditioner();
		SmartDevice tv = new Television();

		light.turnOn();
		ac.turnOn();
		tv.turnOn();

		light.turnOff();
		ac.turnOff();
		tv.turnOff();
	}
}
