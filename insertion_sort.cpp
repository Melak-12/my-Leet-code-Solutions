void insertionSort1(int n, vector<int> arr) {
    for(int i=1;i<arr.size();i++)
        {
            int j=i;
            while((j > 0) && (arr[j-1] > arr[j])){
                int temp=arr[j];
                arr[j]=arr[j-1];//5,1
                // arr[j-1]=temp;
                // j--;
    for(int k=0;k<n;k++)
        {
            cout<<arr[k]<<" ";

        }
        cout<<endl;
        arr[j-1]=temp;
        j--;
        }
        
        
        }
        for(int k=0;k<n;k++)
        {
            cout<<arr[k]<<" ";

        }
          
        
}
