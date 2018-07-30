package jp.AtCoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtCoderBeginner03 {
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
		char[] chars = str.toCharArray();

		int sum = 0;
		for(int i=0;i<chars.length;i++) {
			if(chars[i] == '1') sum++;
		}
		System.out.println(sum);
	}
}
