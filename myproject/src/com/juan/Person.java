package com.juan;

public class Person {
	float weight;
	float height;
	
	public float bmi() {
		float bmi = weight/(height*height);
		return bmi;
	}
}
