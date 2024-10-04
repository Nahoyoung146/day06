package list_;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("111");
		arr.add("222");
		arr.add("333");
		/*
		 * String[] id = {"aaa","bbb"}; System.out.println(id[0].equals("bbb"));
		 * System.out.println(id[0].equals("bbb"));
		 */
		System.out.println("arr =" + arr);
		System.out.println(arr.contains("222"));
		System.out.println(arr.contains("홍길동"));
		boolean bool = arr.contains("홍길동");
		System.out.println("bool : " + bool);

		System.out.println("-----------");
		System.out.println("삭제 전 arr : " + arr);
		System.out.println("삭제 전 size : " + arr.size());
		arr.remove(1); // index 삭제
		System.out.println("삭제 1 arr : " + arr);
		System.out.println("삭제 1 size : " + arr.size());
		arr.remove("111"); // 데이터 삭제
		System.out.println("삭제 111 arr : " + arr);
		System.out.println("삭제 111 size : " + arr.size());
		
		
	}
}