package javaForloop;

public class SumOfArrayElements {
	
	//total of array(+)

	public static void main(String[] args) {
		
		int [] numbers ={3,9,5,-5};
		int sum = 0;
		for(int number:numbers){
			sum += number;
		}
	
			System.out.println("Sum = " + sum);
	}


}
