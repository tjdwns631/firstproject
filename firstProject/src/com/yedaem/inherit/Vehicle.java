package com.yedaem.inherit;

public class Vehicle {
	void run() {
		System.out.println("차량이 달립니다.");

	}
}

class Bus extends Vehicle {

	@Override
	void run() {
		System.out.println("버스가 달립니다. ");
	}

}

class Taxi extends Vehicle {

	@Override
	void run() {
		System.out.println("차량이 달립니다. ");
	}
}