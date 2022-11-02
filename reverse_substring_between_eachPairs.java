class Solution {
    public String reverseParentheses(String s) {
        StringBuilder finalStr= new StringBuilder(s);
        
        int bgnIndex= finalStr.lastIndexOf("(");
        int endIndex= finalStr.indexOf(")", bgnIndex);
        
        while(bgnIndex != -1){
            String str=finalStr.substring(bgnIndex+1,endIndex);
            StringBuilder newStr= new StringBuilder(str);
            newStr.reverse();
            
            finalStr.replace(bgnIndex, endIndex+1, newStr.toString());
            bgnIndex= finalStr.lastIndexOf("(");
            endIndex= finalStr.indexOf(")", bgnIndex);
            
        }
        return finalStr.toString();
        
        
    }
}
