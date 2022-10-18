class Solution {
    public int maxVowels(String s, int k) {
        int size=s.length();
            int count=0;
            if(k>size){//ouki k=3
                    return 0;
            }
            for(int i=0;i<k;i++){
                    if(isVowel(s.charAt(i))){
                            count++;
                    }
            }
            int maxcount=count;
            for(int i=k;i<size;i++){
                char prevc=s.charAt(i-k);
                char curc=s.charAt(i);
                if(isVowel(prevc)){
                        count--;
                }
                if(isVowel(curc)){
                        count++;
                }
                  maxcount=Math.max(maxcount,count);
            }
            return maxcount;
    }
          public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
