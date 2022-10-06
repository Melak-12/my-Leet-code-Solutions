class Result {

   
    public static List<Integer> gradingStudents(List<Integer> grades) {
    int[] grade = grades.stream().mapToInt(Integer::intValue).toArray();
    int n=grade.length;
        //int[] grade = new int[grades.size()];
        
        for(int i=0;i<n;i++){//73, 78-73
            if(grade[i]>=38&&(((grade[i]+5)-(grade[i]%5))-grade[i])<3){
              grade[i]=(grade[i]+5)-(grade[i]%5);
            }
           
         }
         List<Integer> ls = Arrays.stream(grade)        
                                    .boxed()          
                                    .collect(Collectors.toList());
 
        return ls;  
        }
        
       
        
}
