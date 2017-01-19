package dsa.example.sort;

public class BubbleSort {
	
	private static final int[] arr = {1,4,5,3,2,6,7,9,8};
	
	public static void main(String[] args) {
		new BubbleSort().bubblesort(arr);
	}
	
	public void bubblesort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++)
			if(arr[j]<arr[j+1]) {
				swap(arr,j,j+1);
			}
		}
		print(arr);
	}
	
	private void print(int[] arr2) {
		for(int i : arr)
			System.out.print(i + " ");
	}

	private void swap(int[] arr3,int a,int b) {
		int temp = arr3[a];
		arr3[a] = arr3[b];
		arr3[b] = temp;
	}

}
