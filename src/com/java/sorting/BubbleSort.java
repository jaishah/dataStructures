package com.java.sorting;

public class BubbleSort {

public void sort(int[] unsorted){
	boolean isSorted = false;
	while(true){
		int cnt=0;
		for(int i=0;i<unsorted.length-1;i++){
			//if(i!=unsorted.length-1){
				if(unsorted[i+1]<unsorted[i]){
					unsorted[i] = unsorted[i] + unsorted[i+1];
					unsorted[i+1] = unsorted[i] - unsorted[i+1];
					unsorted[i] = unsorted[i] - unsorted[i+1];
				cnt++;
				//}
			}
		}
		if(cnt==0){
			isSorted=true;
			break;
			
		}
	}
	//List<Integer> sorted = Arrays.asList(unsorted);
	System.out.println("\nSorted array: ");
	for(int i=0;i<unsorted.length;i++){
		System.out.print(" "+unsorted[i]);
	}
}
	
	
}
