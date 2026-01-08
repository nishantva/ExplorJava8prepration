

  class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        
        for(int i: nums1){
            arr.add(i);
        }
        
          for(int i: nums2){
            arr.add(i);
        }
        Collections.sort(arr);
        
          double d=0.0;
        
        if(arr.size()%2==0){
            d=arr.get(arr.size()/2)+arr.get(arr.size()/2-1);
            d=d/2;
        }
        else{
            d=arr.get(arr.size()/2);
        }
        return d;
        
    }
}
