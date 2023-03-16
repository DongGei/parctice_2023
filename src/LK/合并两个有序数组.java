package LK;

/**
 * @className: 合并两个有序数组
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/25
 **/
public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,z=0;
        int [] re =new int[m+n];
        while (i<m||j<n){
            if(i==m){
                re[z++]=nums2[j++];
            }else if(j==n){
                re[z++]=nums1[i++];
            }
            else if (nums1[i]>nums2[j]){
                re[z++]=nums2[j++];
            }else {
                re[z++]=nums1[i++];
            }
        }
        System.arraycopy(re, 0, nums1, 0, nums1.length);
    }
}
