public class SmallestLargest {

public static void main(String[] args) {

int[] array = {1,2,4,8,4,5};

for (int count = 0; count < array.length; count++){


		
		if(array[0] > array[1] && array[0] > array[2] && array[0] > array[3] && array[0] > array[4] && array[0] > array[5] && array[0] > array[6] ) {
			System.out.print("the largest is: " + array[0]);
		}
		if(array[1] > array[0] && array[1] > array[2] && array[1] > array[3] && array[1] > array[4] && array[1] > array[5] && array[1] > array[6] ) {
			System.out.print("the larest is: " + array[1]);

}
	if (array[2] > array[0] && array[2] > array[1] && array[2] > array[3] && array[2] > array[4] && array[2] > array[5] && array[2] > array[6] ) {

		System.out.print("the largest is: " + array[2]);
}

}

}




	}