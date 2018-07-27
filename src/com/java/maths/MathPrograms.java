package com.java.maths;

public class MathPrograms {

	
	public void checkPrime(int n){
		
		for (int i=2;i<n;i++){
			if(n%i==0){
				System.out.println("Not Prime: " + n);
				break;
			}else{
				System.out.println("Prime: " + n);
				break;
			}
		}
		
	}
	
	public int gcd(int a,int b){
		return gcd(a,a%b);
	}
	
	public void printFibonacci(int numTerms){
		int firstTerm = 0;
		int cnt=0;
		int[] arr={};
		for(cnt=0;cnt<numTerms;cnt++){
		if(cnt==0){
			arr[cnt]=firstTerm;
		}else if (cnt==1){
			arr[cnt]=arr[cnt-1]+1; 
		}else{
			arr[cnt]=arr[cnt-1]+arr[cnt-2];
		}
			
		}
		for (int i : arr) {
			System.out.print(","+i);
		}
	}
	
}
