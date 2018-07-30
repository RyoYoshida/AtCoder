package jp.AtCoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtCoderBeginner02 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		while(sn.hasNextLine()) {
		    String str = sn.nextLine();
		    list.add(str);
		}
		args = list.toArray(new String[list.size()]);
		sn.close();

		String str = args[0];
		String[] values = str.split(" ");
		int a = Integer.parseInt(values[0]);
		int b = Integer.parseInt(values[1]);

		if((a * b)%2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
