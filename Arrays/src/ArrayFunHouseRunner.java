import java.util.Arrays;

public class ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(one,4));
		System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(one,9));

		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};

		//add test cases

		
		// part2
//		[1,2,3,4,5,6,7,8,9,10]
//				[1,2,3,9,11,20,30]
//				[9,8,7,6,5,4,3,2,0,-2]
//				[3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0]

	}
}
