package me.seojinoh.studying.ndb2018Algorithm;

// 선택 정렬 (Selection Sort)
// 가장 작은 수를 선택하여 제일 앞으로 보내는 알고리즘으로써, 원시적이고 기초적인 방법 중 하나
// 시간 복잡도: O(N^2)
public class Example01 {

	public static void main(String[] args) {
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

		int min = 0, index = 0, temp = 0;

		for(int i = 0; i < 10; i++) {
			min = 9999;

			for(int j = i; j < 10; j++) {
				if(min > array[j]) {
					min = array[j];
					index = j;
				}
			}

			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}

		for(int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
