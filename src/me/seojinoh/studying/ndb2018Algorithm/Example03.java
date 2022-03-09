package me.seojinoh.studying.ndb2018Algorithm;

// 삽입 정렬 (Insertion Sort)
// 앞에서부터 뒤에 슬롯을 하나씩 열어가며 열린 슬롯의 뒤에서부터 가까이에 있는 두 수를 비교해서 더 큰 수를 뒤로 보내며 정렬하는 알고리즘으로써, 구현이 어렵고 비교적 느림
// 위치 변경이 필요할 때에만 이루어지므로, 데이터가 이미 거의 정렬된 상태에 한해서는 가장 빠르다는 특징이 있음
// 시간 복잡도: O(N^2)
public class Example03 {

	public static void main(String[] args) {
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

		int j = 0, temp = 0;

		for(int i = 0; i < 9; i++) {
			j = i;

			while(j >= 0 && array[j] > array[j + 1]) {
				temp = array[j + 1];
				array[j + 1] = array[j];
				array[j] = temp;

				j--;
			}
		}

		for(int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
