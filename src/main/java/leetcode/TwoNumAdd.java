package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//题目一：两数之和
public class TwoNumAdd {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] indexs = twoSum(arr, target);
        System.out.println("arr=" + Arrays.toString(arr) + " target=" + target + " indexs=" + Arrays.toString(indexs));
    }

    private static int[] twoSum(int[] arr, int target){
        int[] indexs = new int[2];
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i < arr.length;i++){
            if(hash.containsKey(arr[i])){
                indexs[0] = i;
                indexs[i] = hash.get(arr[i]);
                return indexs;
            }
            hash.put(target - arr[i],i);
        }
        return indexs;
    }

}
