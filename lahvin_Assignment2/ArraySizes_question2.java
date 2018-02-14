 package lahvin_Assignment2;

public class ArraySizes_question2 {

	public static void twoA() {
		int[] numArr = {1,2,4,6,3,7,8,9,10,11};

		int ttl = numArr.length;
		int combVal = ((ttl+1) * (ttl+2)) / 2;
		
		for(int i=0;i<ttl;i++) {
			combVal -= numArr[i];
		}
		
		System.out.println("The missing number is: " + combVal);
	}
	
	public static void twoB() {
		
		int[] numArr = {5,2,9,15,2,7,7,18,15,5};
			
			for(int i=0;i<numArr.length;i++) {
				for(int j=1;j<numArr.length;j++) {
					if(numArr[i] == numArr[j] && i!=j) {
						System.out.print(numArr[i] + " ");
						break;
					}
				}
			}
		}
	
	public static void twoC() {
		
		int[] numArr = {5,2,9,15,2,7,7,18,15,5};
		int holder;
		
			for(int i=0;i<numArr.length;i++) {
				for(int j=0;j<numArr.length;j++) {
					if(numArr[i] < numArr[j]) {
						holder = numArr[i];
						numArr[i] = numArr[j];
						numArr[j] = holder;
					}
				}
			}
			for(int x: numArr) {
				System.out.print(x + " ");
			}
		
	}
	
	public static void twoD() {
		int[] numArr = {16,7,89,20,7,99,21,56,12,10};
		int temp = 0;
		
		for(int i=0;i<numArr.length;i++) {
			for(int j=1;j<numArr.length;j++) {
				if(numArr[i] == numArr[j] && i!=j) {
					temp = numArr[i];
				}
			}
		}
		System.out.println("The duplicate number in this array is: " + temp);
	}
	
	public static void twoE() {
		int[] numArr= {16,4,89,20,7,99,21,56,12,10};
		
		int largest = 0;
		int smallest = numArr[1];
		
		for(int i=0;i<numArr.length;i++) {
			if(largest < numArr[i]) {
				largest = numArr[i];
			} 
			
			if(smallest < numArr[i]) {
				
			}else {
				smallest = numArr[i];
			}
		}
		System.out.println("The largest number in the array is: " + largest);
		System.out.println("The smallest number in the array is: " + smallest);
	}
	
	public static void twoF() {
		
		int[] numArr = {16,4,20,20,7,99,21,56,12,10};
		
			for(int i=0;i<numArr.length;i++) {
				for(int j=1;j<numArr.length;j++) {
					if(numArr[i] == numArr[j] && i != j) {
						numArr[i] = 0;
					}
				}
				if(numArr[i] != 0) {
					System.out.print(numArr[i] + " ");
				}
			}
		
	}
	
	
	public static void main(String[] args) {
		
		//twoA();
		//twoB();
		//twoC();
		//twoD();
		//twoE();
		//twoF();
	}

}
