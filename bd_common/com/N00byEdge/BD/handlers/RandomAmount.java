package com.N00byEdge.BD.handlers;

import java.util.Random;

public class RandomAmount {
	private static Random randomno = new Random();
	public static int randomInt(int min, int max){
		return min + 1 + randomno.nextInt(max - min);
	}
}
