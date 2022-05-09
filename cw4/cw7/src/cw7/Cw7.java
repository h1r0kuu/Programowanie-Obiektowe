package cw7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cw7 {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for(int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();

			int[] arr = new int[N];

			for(int j = 0; j < N; j++) {
				int num = scanner.nextInt();
				arr[j] = num;
			}

			boolean check = checkSubArray(N, arr, K);
			if(check) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

    }
    public static boolean checkSubArray(int a, int[] arr, int b) {
		if(a == b) {
			return true;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < a; i++) {
			map.put(arr[i], i);
		}

		if(map.size() > b) {
			return false;
		}

		int x = a / b;
		for(int key : map.keySet()) {
			if(map.get(key) % x != 0) {
				return false;
			}
		}
		return true;
	}


}
