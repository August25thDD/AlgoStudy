package chapter_array_and_linkedlist.my_demo;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author : Yuzhao.Yang
 * @date : 2023/7/26 15:09
 */
@SuppressWarnings("all")
public class array_demo {

    /* 随机返回一个数组元素 */
    static int rondomAccess(int[] nums) {
//      区间[0,nums.length)
        return nums[ThreadLocalRandom.current().nextInt(0, nums.length)];
    }

    /* 扩展数组长度 */

    /* 在数组的索引 index 处插入元素 num */

    /* 删除索引 index 处元素 */

    /* 遍历数组 */

    /* 在数组中查找指定元素 */



}
