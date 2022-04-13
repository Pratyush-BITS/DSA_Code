package HelpOthers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveIshanToys {

	public static void sort(HashMap<String,Integer> hm, int n) {
		ArrayList<Map.Entry<String,Integer>> list= new ArrayList<>(hm.entrySet());

		list.sort((o1,o2)-> {
			int a = o1.getValue()-o2.getValue();
			if (a ==0)
				return o1.getKey().compareTo(o2.getKey());
			return a;
		});

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		sc.nextLine();

		HashMap<String,Integer> hm=new HashMap<>();
		while (n-- > 0) {
			String[] st = sc.nextLine().split("=");
			int fee = Integer.parseInt(st[1]);
			if (!hm.containsKey(st[0]))
				hm.put(st[0], fee);
		}
		sort(hm,n);
	}
}