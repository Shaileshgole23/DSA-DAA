package DAA;
import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Quick_sort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int[] arr, int st, int end){
            int pivot = arr[end];
            int idx = (st-1);
            for(int i=st; i<end; i++){
                if(arr[i]<=pivot){
                    idx++;
                    int temp = arr[i];
                    arr[i]=arr[idx];
                    arr[idx]=temp;
                }
            }
            int temp = arr[idx+1];
            arr[idx+1] = arr[end];
            arr[end] = temp;
            return idx+1;
    }
    public static void Quick_sort(int[] arr, int st, int end){
        if(st<end){
            int pivotIndex= partition(arr, st, end);
            Quick_sort(arr, st, pivotIndex-1);
            Quick_sort(arr, pivotIndex+1, end);
        }
    }
}
