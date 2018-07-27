package com.java.maths;

public class MathMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MathPrograms mat = new MathPrograms();
mat.checkPrime(498);
//mat.printFibonacci(5);
int gcd = mat.gcd(3, 7);
System.out.println("GCD:" + gcd);	}

}
