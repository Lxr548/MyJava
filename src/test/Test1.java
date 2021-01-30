package test;

class Test1 {
	public static void main(String[] args) {
		int[] arr = {2,8,6,2,7,3,9,2,8,6,7,9,1};
		int[] a = new int[2];
	    int k=0;
	    for(int i = 0;i < arr.length;i++){
	    	int x=0;
	    	for(int j = 0;j < arr.length;j++){
		        if(arr[i] == arr[j]){
		            x++;
		        }
	    	}
	        if(x == 1){        	
	            a[k] = arr[i];
	            k++;
	        }
	    }
	    System.out.println("数组中只出现一次的数字是" + a[0] + "和" + a[1]);
	}
}