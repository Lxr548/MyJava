package test;

import java.util.Arrays;

public class Test8 {

	public static void main(String[] args) {
		int[] arr={3,1,9,8,0,4,6,7};
        System.out.print("交换之前:");
        System.out.println(Arrays.toString(arr));
        int max=getMax(arr);
        int maxIndex=getIndex(arr,max);
        swap(arr,maxIndex,0);
        int min=getMin(arr);
        int minIndex=getIndex(arr,min);
        swap(arr,minIndex,arr.length-1);
        System.out.print("交换之后:");
        System.out.println(Arrays.toString(arr));
    }

    public static int getMax(int[] arr){
    	int max=arr[0];
    	for(int i=1;i<arr.length;i++){
    		if(arr[i]>max){
    			max=arr[i];
    		}
    	}
    	return max;
    }

    public static int getMin(int[] arr){ 
    	int min=arr[0]; 
    	for(int i=1;i<arr.length;i++){ 
    		if(arr[i]<min){ 
    			min=arr[i];
    		} 
    	} 
    	return min; 
    } 

    public static int getIndex(int[] arr,int number){ 
    	for(int i=0;i<arr.length;i++){ 
    		if(arr[i]==number){ 
    			return i; 
    		} 
    	} 
    	return -1;
    } 

    public static void swap(int[] arr,int x,int y){
    	int temp=arr[x];
    	arr[x]=arr[y];
    	arr[y]=temp;
    } 

}
