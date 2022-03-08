package sort_java;

public class InsertionSort {
    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    /**
     * ^异或运算。
     * 具备以下性质A^0=A,A^A=0
     * 具备交换律与结合律
     */
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j]; //记arr[i] = A,arr[j]=B
        arr[j] = arr[i] ^ arr[j]; //arr[j]=arr[i]^ arr[j] ^arr[j] = arr[i]
        arr[i] = arr[i] ^ arr[j]; //arr[i]=arr[i]^arr[j]^arr[i] = arr[j]
    }

//    public static void main(String[] args) {
//        int[] a =new int [6,5,3,7,8,1,2]
//    }
}
