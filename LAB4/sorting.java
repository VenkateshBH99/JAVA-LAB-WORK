
public class sorting<E>{
	public static <E extends Comparable<? super E>> void sortArray(E arr[]) {
		E t;
		for(int i=0;i<arr.length-1;i++) {
			int minIn=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[minIn])<0) {
					minIn=j;
				}
			}
			t=arr[i];
			arr[i]=arr[minIn];
			arr[minIn]=t;
		}
		for(E ele:arr) {
			System.out.println(ele);
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		sorting<Integer> obj1=new sorting<Integer>();
		sorting<String> obj2=new sorting<String>();
		Integer [] a={2,3,4,5,1,9,2,4,6,10};
		String [] b= {"a","c","b"};
		obj1.sortArray(a);
		obj2.sortArray(b);
	}

}
