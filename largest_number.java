class Solution {

    public String largestNumber(int[] nums) {
    int size=nums.length;
//conver to string 
    String[] arr = new String[size];
    for(int i=0; i<size; i++){
        arr[i]=String.valueOf(nums[i]);
    }
  
        //compare to the next element in the array  and sort elements
    Arrays.sort(arr, new Comparator<String>(){
        public int compare(String a, String b){
            return (b+a).compareTo(a+b);
        }
    });
 
    StringBuilder sb = new StringBuilder();
    for(String s: arr){
        sb.append(s);
    }
 
    while(sb.charAt(0)=='0'&&sb.length()>1)
        sb.deleteCharAt(0);
 
    return sb.toString();
}
   
}
