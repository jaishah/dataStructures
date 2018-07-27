package com.java.sorting;

public class QuickSort {
	public void sort(int[] unsorted){
		boolean isSorted = false;
		int hi,lo,pivot,temp;
		pivot = unsorted[unsorted.length-1];
			hi=unsorted.length-2;
			lo=0;
			while(true){
			while(lo<unsorted.length-1&&unsorted[++lo]<pivot){
			}
			while(hi>0&&unsorted[--hi]>pivot){
			}
			if(lo>=hi){
				break;
			}else{
				
			}
			}
}}