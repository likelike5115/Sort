/**
 * @Description
 * @Author
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{0,6,5,9,7,8,4,12};
        mergeSort(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void mergeSort(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        int mid = (r-l)/2 + l;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,r,mid);
    }
    public static void merge(int[] arr, int l, int r, int mid){
        int[] newArr = new int[r - l + 1];
        int p1 = l; //pointer index for sub array 1
        int p2 = mid + 1;//pointer index for sub array 2
        int p = 0; //pointer index for new array
        while(p1 <= mid && p2 <= r){
            if(arr[p1] < arr[p2]){
                newArr[p++] = arr[p1++];
            }else{
                newArr[p++] = arr[p2++];
            }
        }
        while(p1 <= mid){
            newArr[p++] = arr[p1++];
        }
        while(p2 <= r){
            newArr[p++] = arr[p2++];
        }
        for(int num : newArr){
            arr[l++] = num;
        }
    }
}
