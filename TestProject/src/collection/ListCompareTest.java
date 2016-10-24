package collection;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListCompareTest {

	@SuppressWarnings("rawtypes")
	private final static Comparator CHINA_COMPARE = Collator.getInstance(java.util.Locale.CHINA);
	
	private static void sortList()
	{
		List<String> sortList = Arrays.asList("张三","李四","王五");
		Collections.sort(sortList, CHINA_COMPARE);
		for(String name : sortList)
		{
			System.out.println(name);
		}
	}
	
	private static void sortArray()
	{
		String [] arr = {"张三","李四","王五"};
		Arrays.sort(arr, CHINA_COMPARE);
		for(String name : arr)
		{
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		
		sortList();
		sortArray();
	}

}
