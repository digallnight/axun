package com.lqp.axun.intview.algorithm.base;

/**
 * 查找算法
 */
public class Search {

    /**
     * 二分查找，找到key，则返回对应的下标，找不到则返回-1
     * 元素数组必须是有序的
     */
    public static int halfSearch(int[] a, int key, int low, int high) {

        //跳出递归
        if (low > high) {
            return -1;
        }

        //如果数据长度为0，则返回-1
        if (a.length == 0) {
            return -1;
        }
        //如果数组长度为1，判断该唯一元素是否为key，返回相应结果
        if (a.length == 1) {
            if (key == a[0]) {
                return 0;
            } else {
                return -1;
            }
        }
        //数组长度大于1
        int mid = (low + high) / 2;
        if (a[mid] > key) {
            return halfSearch(a, key, low, mid - 1);
        } else if (a[mid] < key) {
            return halfSearch(a, key, mid + 1, high);
        } else {
            return mid;
        }
    }

    /**
     * 顺序查找
     */
    public static int sequenceSearch(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 插值查找，基于二分查找，择改进为自适应选择，可以提高查找效率
     */
    public static int insertSearch(int[] a, int key, int low, int high) {

        //跳出递归
        if (low > high) {
            return -1;
        }

        //如果数据长度为0，则返回-1
        if (a.length == 0) {
            return -1;
        }
        //如果数组长度为1，判断该唯一元素是否为key，返回相应结果
        if (a.length == 1) {
            if (key == a[0]) {
                return 0;
            } else {
                return -1;
            }
        }
        //数组长度大于1
        int mid = low + (key - a[low]) / (a[high] - a[low]) * (high - low);
        if (a[mid] > key) {
            return insertSearch(a, key, low, mid - 1);
        } else if (a[mid] < key) {
            return insertSearch(a, key, mid + 1, high);
        } else {
            return mid;
        }
    }
}
