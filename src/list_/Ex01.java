package list_;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
//		ArrayList<int> arr = new ArrayList<String>();
		int num = 100; // 기본 자료형
//		String s=num;
		Integer i = num; // 클래스 자료형
		System.out.println("i : " + i);
		System.out.println("num : " + num);

		ArrayList<Integer> arr = new ArrayList<Integer>();
//		int[] arr = new int[5];
		arr.add(100);
//		arr.add(1.11);
		arr.add(300);
		System.out.println("arr : " + arr);
		System.out.println("get(0) : " + arr.get(0));
		System.out.println("get(1) : " + arr.get(1));

		int n = arr.get(0);
		n += 100;
		if (n < 100) {
		}
		System.out.println("--------------------------------");
		for (i = 0; i < 2; i++) {
			System.out.println(arr.get(i));
		}
	}
}