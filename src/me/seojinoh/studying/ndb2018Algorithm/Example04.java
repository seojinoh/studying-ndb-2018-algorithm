package me.seojinoh.studying.ndb2018Algorithm;

// 퀵 정렬 (Quick Sort)
// 특정한 값(피벗, 일반적으로 첫 번째 원소)을 기준으로 더 작은 값들을 왼쪽으로, 더 큰 값들을 오른쪽으로 분할하여 정렬하는 알고리즘으로써, 분할 정복 기법과 재귀 알고리즘을 이용한 대표적인 빠른 알고리즘
// 시간 복잡도: O(N * logN)
// Java의 Arrays.sort() 등 프로그래밍 언어의 내장 정렬 함수는 대부분 퀵 정렬을 기본으로 하며, 단, 이미 정렬되어 있는 경우에 최악의 시간 복잡도 O(N^2)
public class Example04 {

	public static void main(String[] args) {
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

		quickSort(array, 0, array.length - 1);

		for(int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static int[] quickSort(int[] array, int start, int end) {
		if(start >= end) {
			return array;
		}

		int key = start;
		int i = start + 1, j = end, temp = 0;

		while(i <= j) {
			while(i <= end && array[i] <= array[key]) {
				i++;
			}

			while(j > start && array[j] >= array[key]) {
				j--;
			}

			if(i > j) {
				temp = array[j];
				array[j] = array[key];
				array[key] = temp;
			} else {
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}

		quickSort(array, start, j - 1);
		quickSort(array, j + 1, end);

		return array;
	};

}
