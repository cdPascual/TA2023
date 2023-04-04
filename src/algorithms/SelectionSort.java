package algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] array = {5,7,3,8,12,43,87,9,4};
		int temp;
		
		for(int i =0;i<array.length;i++)
			System.out.print(array[i]+", ");
		
		System.out.println("\n-----after sort----");
		
		for(int i = 1;i<array.length;i++) {

			for(int j = i;j>0;j--) {
				if(array[j]<array[j-1]) {
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
				
			}
		}
		
		for(int i =0;i<array.length;i++)
			System.out.print(array[i]+", ");
		
	}

}
