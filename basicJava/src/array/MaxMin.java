package array;

public class MaxMin {
	
	void minMax(int arr[]) {
		int max=arr[0],min=arr[0];
		for (int i:arr)
		{
			if(i>max) {
				max=i;
				
			}
			if(i<min) {
				min=i;
			}
		}
		System.out.println("min:"+min);
		System.out.println("max: "+max);
	}
	

	public static void main(String[] args) {
		int arr[]= {22,12,34,78,90};
		MaxMin m=new MaxMin();
		m.minMax(arr);

	}

}
