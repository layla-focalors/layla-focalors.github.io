import java.util.Arrays;

public class arraytest{
    public static void main(String[] args){
        // int[] arr = {10, 20, 30, 40};
        int arr[] = new int[]{10, 20, 30, 40};
        // 단, 이 경우, int는 생략 가능
        String mx = Arrays.toString(arr);
        System.out.println(mx);
    }
}