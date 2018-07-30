package jp.AtCoder.AtCoderBeginner03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] lines = scan();

		String str = lines[0];
		char[] chars = str.toCharArray();

		int sum = 0;
		for(int i=0;i<chars.length;i++) {
			if(chars[i] == '1') sum++;
		}
		System.out.println(sum);
	}

	public static String[] scan() {
		List<String> list = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
		    list.add(scanner.nextLine());
		}
		scanner.close();

		return list.toArray(new String[list.size()]);
	}
}
