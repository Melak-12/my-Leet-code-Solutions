

class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        
        return 0;
    }
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<n;i++){//3,1,4
	       for(int j=i+1;j<n;j++){
	           if(arr[i]>arr[j]){
	               int temp=arr[i];
	               arr[i]=arr[j];
	               arr[j]=temp;
	           }
	       }
	      
	    }
	   
	}
}
