package me.seojinoh.studying.ndb2018Algorithm;

// 버블 정렬 (Bubble Sort)
// 가까이에 있는 두 수를 비교해서 더 큰 수를 뒤로 보내며 가장 큰 수로 제일 뒤부터 채우는 알고리즘으로써, 구현이 쉬우나 가장 비효율적임
// 시간 복잡도: O(N^2)
public class Example02 {

	public static void main(String[] args) {
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

		int temp = 0;

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 9 - i; j++) {
				if(array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

		for(int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
