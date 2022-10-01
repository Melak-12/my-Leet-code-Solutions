class Solution {
    public:
    string sortSentence(string s) {
        string word;
        vector<string>vec(10);
        for(int i=0;i<s.size();i++){
            if(s[i]>=48 && s[i]<=57){
                vec[s[i]-48]=word + " ";
                word="";
                i++;
                
            }else word+=s[i];
            
        }
        string ans;
        for(string n:vec){
            ans+=n;
        }ans.pop_back();
        return ans;
        
    }
};
