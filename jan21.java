public class jan21 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = nums1.length - 1;
        while (p2 >= 0 && p1 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[i] = nums2[p2];
                p2--;
                i--;
            } else {
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }
        }
        while(p2<n){
            nums1[i]=nums2[p2];
            p2--;
            i--;
        }
    }

}
