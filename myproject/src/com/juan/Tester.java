package com.juan;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Person p = new Person();
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入您的體重(公斤)：");
		p.weight = scan.nextFloat();
		System.out.println("請輸入您的身高(公尺)：");
		p.height = scan.nextFloat();
		float bmi = p.bmi();
		System.out.println(bmi);
		bmi = (int)(bmi * 100f + 0.5f) / 100f;
		System.out.println("您的BMI為：" + bmi);
	}

}
