/**
 * @Description
 * @Author
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] num = new int[]{10,5,21,8,1,6,4,9};
        quickSort(num, 0, num.length-1);
        for(int n : num){
            System.out.println(n);
        }
    }
    public static void quickSort(int[] num, int low, int high){
        if(low >= high){
            return;
        }
        int l = low;
        int r = high; //注意这里r的值是high
        int pivot = high;
        while(l < r){
            while(num[l] <= num[pivot] && l < r){
                l++;
            }
            while(num[r] >= num[pivot] && l < r){
                r--;
            }
            swap(num, l, r);
        }
        swap(num, l, pivot); //结束后num[l]一定大于num[pivot]所以交换这两个位置
        quickSort(num, low, l - 1); //交换后l是pivot的index
        quickSort(num, l + 1, high);
    }
    public static void swap(int[] num, int l, int r){
        int temp = num[l];
        num[l] = num[r];
        num[r] = temp;
    }
}
