package jp.AtCoder.AtCoderBeginner04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		String[] lines = scan();

		// int num = Integer.parseInt(lines[0]);
		String[] strs = lines[1].split(" ");
		List<String> strList = Arrays.asList(strs);
		List<Integer> list = strList.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int[] values = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			values[i] = list.get(i).intValue();
		}

		int result = 0;
		while(true) {
			Boolean isEven = true;
			for(int i=0;i<values.length;i++) {
				if(values[i]%2 == 1) {
					isEven = false;
					break;
				}
			}
			if(isEven) {
				for(int i=0;i<values.length;i++) {
					values[i] /= 2;
				}
				result++;
			}else {
				break;
			}
		}
		System.out.println(result);
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
