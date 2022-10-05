class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
int[] frequencor_array= new int[100];
Arrays.fill(frequencor_array,0);
    for(Integer a:arr){
        frequencor_array[a]++;
        
    }
List<Integer> result=new ArrayList();
    for(int i=0;i<frequencor_array.length;i++){
        result.add(frequencor_array[i]);
    }
    return result;
    }

}
