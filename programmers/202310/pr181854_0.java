package programmers;
public class pr181854_0 {
    public int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (i % 2 != 0) ? arr[i] + n : arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (i % 2 == 0) ? arr[i] + n : arr[i];
            }
        }
        return arr;
    }
}