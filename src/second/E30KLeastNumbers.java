package second;

/**
 * created by memory
 * on 2019/6/14 下午3:39
 * <p>
 * 输入n个整数，找出其中最小的k个整数，找出其中最小的k个数。
 * 例如输入4，5，1，6，2，7，3，8这8个数字，则最小的4个数字为1，2，3，4
 */

/**
 * 输入n个整数，找出其中最小的k个整数，找出其中最小的k个数。
 * 例如输入4，5，1，6，2，7，3，8这8个数字，则最小的4个数字为1，2，3，4
 */

import java.util.Arrays;

public class E30KLeastNumbers {
    //新建大顶堆
    public void buildMaxHeap(int[] arr, int lastIndex) {
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            int k = i;
            while (2 * k + 1 <= lastIndex) {
                int biggerIndex = 2 * k + 1;
                if (biggerIndex < lastIndex) {
                    if (arr[biggerIndex] < arr[biggerIndex + 1])
                        biggerIndex++;
                }
                if (arr[k] < arr[biggerIndex]) {
                    swap(arr, k, biggerIndex);
                    k = biggerIndex;
                } else
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void heapSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            buildMaxHeap(arr, arr.length - i - 1);
            swap(arr, 0, arr.length - i - 1);
        }
    }

    public void getLeastNumbers(int[] arr, int k) {
        if (arr == null || k < 0 || k > arr.length)
            return;
        //根据输入数组前k个数简历最大堆
        //从k+1个数开始与根节点比较
        //大于根节点，舍去
        //小于，取代根节点，重建最大堆
        int[] kArray = Arrays.copyOfRange(arr, 0, k);
        heapSort(kArray);
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < kArray[k - 1]) {
                kArray[k - 1] = arr[i];
                heapSort(kArray);
            }
        }
        for (int i : kArray)
            System.out.print(i);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        E30KLeastNumbers test = new E30KLeastNumbers();
        test.getLeastNumbers(arr, 3);
    }
}
