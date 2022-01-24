// Method-1: using Brute Force.
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0; i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                char c = jewels.charAt(i);
                char d = stones.charAt(j);
                if(c==d) count++;
            }
        }
        return count;
    }
}

// Method-2: Optimal Solution.
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] count=new int[128];
        int ans=0;
        for(char c: stones.toCharArray()){
            count[c]++;
        }
        for(char c: jewels.toCharArray()){
            ans+=count[c];
        }
        return ans;
    }
}
