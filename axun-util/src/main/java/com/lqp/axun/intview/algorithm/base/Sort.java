package com.lqp.axun.intview.algorithm.base;

public class Sort {
    /**
     * 冒泡排序
     * // 分类 -------------- 内部比较排序
     * // 数据结构 ---------- 数组
     * // 最差时间复杂度 ---- O(n^2)
     * // 最优时间复杂度 ---- 如果能在内部循环第一次运行时,使用一个旗标来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)
     * // 平均时间复杂度 ---- O(n^2)
     * // 所需辅助空间 ------ O(1)
     * // 稳定性 ------------ 稳定
     */
    public static int[] bubbleSort(int a[]) {
        int n = a.length;
        while (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
            n--;
        }
        return a;
    }
}
