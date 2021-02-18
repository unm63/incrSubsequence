package incrSubsequence;
import java.util.ArrayList;
import java.util.Arrays;

public class Increas {
	public static void main(String[] args) {
		int[] array = {1,5,3,4,2,5,7,8,9,2,4,1,5};
		System.out.println("The original sequence is " + Arrays.toString(array));
		ArrayList lis = new ArrayList();
		ArrayList longestSequence = new ArrayList();
		lis.add(array[0]);
		int count = 1;
		int max = count;
		for (int i = 0; i < array.length-1; i++) {
			if (array[i+1] >= array[i]) {
				lis.add(array[i+1]);
				count++;
				if (count > max) {
					max = count;
				}
			}
			else {
				if (count == max) {
					longestSequence = (ArrayList) lis.clone();
				}
				lis.clear();
				lis.add(array[i+1]);
				count = 1;
			}
		}
		System.out.println("The longest increasing contiguous subsequence is " + longestSequence);
	}
}
