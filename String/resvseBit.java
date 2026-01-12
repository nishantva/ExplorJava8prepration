


class Solution {
    public int reverseBits(int n) {

      int res=0;  //store result

      for(int i=31;i>=0;i=i-1){   //Java int has 32 bits
         int bit= n&1;  //Extracts the last (rightmost) bit of n
         res=res + (bit<<i);  //bit << i → move the bit to position i  niche se aage uss postion mai set kr dega//
         n= n >>1;  //Right-shift n by 1 // Removes the bit we just used   last bit remove hogyi




      }
      return res;
    }
}
