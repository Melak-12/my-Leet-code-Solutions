class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int length=people.length;
        int length2=length-1;
        int j=0;
        int count=0;
        Arrays.sort(people);

        while(j<=length2){
            if(people[j]+people[length2] <= limit){
                j++;
            }
            count++;
            length2--;
            
        }
        return count;
        
    }
}
