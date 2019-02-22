package factorlist;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class FactorsTester
{
	public static void main( String args[] )
	{
		System.out.println(Factors.getListOfFactors(9));
		
		System.out.println(Factors.getListOfFactors(23));
		
		System.out.println(Factors.getListOfFactors(50));
		
		System.out.println(Factors.getListOfFactors(100));
		
		System.out.println(Factors.getListOfFactors(762));	
			
		Integer[] nums = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		List<Integer> list = new ArrayList<Integer>( Arrays.asList(nums) );
		
		System.out.println("\nOriginal List:");
		System.out.println( list );
		Factors.keepOnlyCompositeNumbers( list );
		System.out.println("Composite List:");
		System.out.println( list );
	}
}
