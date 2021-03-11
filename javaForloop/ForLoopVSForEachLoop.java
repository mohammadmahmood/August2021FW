package javaForloop;

public class ForLoopVSForEachLoop {

	public static void main(String[] args) {
		
		//Let's see how a for-each loop is different from a regular Java for loop.
		
		//Using for loop
		
		// char[] vowels = {'a', 'e', 'i', 'o', 'u'};

		   // iterating through an array using a for loop
		 
		  // for (int i = 0; i < vowels.length; ++ i) {
			   
		    // System.out.println(vowels[i]);
		   }
		 
		
//for-each loop usage 
	//Here, the output of both programs is the same. However, the for-each loop is easier to write and understand.

//This is why the for-each loop is preferred over the for loop when working with arrays and collections.

{
	char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	for(char item:vowels){
	System.out.println(item);
}

}

}