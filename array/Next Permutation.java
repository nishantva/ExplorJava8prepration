Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
  7 2 5 3 1--->7 3 1 2 5 next greater permuntation yhe hua
class Solution {
    public void nextPermutation(int[] arr) {
        int n =arr.length;

        int i;
        for( i=n-2;i>=0;i--){   // first find the ist decreasing point 7 , 2. 5 , 3 ,1  yha 2 find hua 

            if(arr[i+1]>arr[i]){
                break;
            }

        }
        if(i>=0){    // then find the next number which we have to swap form that number  then 2 ko  3 se replce kia -->7 3 5 2 1 
            int j;
            for(j=n-1;j>=i;j--){
                if(arr[j]>arr[i]){
                    break;
                }
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1); // reverse the right arry//  -->7 3 1 2 5
      
        }
        void  swap(int arr[],int i, int j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
    void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }
}
