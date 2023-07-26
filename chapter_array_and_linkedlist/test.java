package chapter_array_and_linkedlist;

/**
 * @author : e-Yuzhao.Yang
 * @date : 2023/7/21 15:01
 */
public class test {



    /* 指数阶（循环实现） */
    int exponential(int n) {
        int count = 0, base = 1;
        // cell 每轮一分为二，形成数列 1, 2, 4, 8, ..., 2^(n-1)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < base; j++) {
                count++;
            }
            base *= 2;
        }
        // count = 1 + 2 + 4 + 8 + .. + 2^(n-1) = 2^n - 1
        return count;
    }

}
