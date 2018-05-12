package cn.qssq666.robot.test;

import java.util.Arrays;

/**
 * Created by qssq on 2018/4/3 qssq666@foxmail.com
 */
public class BubbleSort {


    public static int[] bubbleSort(int[] array){
        for(int i = 0;i < array.length;i++){
            for(int j = 0; j < array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println("第"+(i+1)+"趟排序");
            for(int k = 0;k < array.length;k++){
                System.out.print(array[k]+"  ");
            }
            System.out.println();
        }
        return array;
    }
    public static void  main(String[] args){

        int arr[]=new int[]{8,3,53,7,1,4,0,5,38,22,777,33};
        bubbleSort(arr);
        System.out.println(""+ Arrays.toString(arr));


    }
}
