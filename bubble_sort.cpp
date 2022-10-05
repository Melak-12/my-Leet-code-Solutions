


void countSwaps(vector<int> a) {
    int numof_swaps=0;
    int n=a.size();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - 1; j++) {
            if (a[j] > a[j + 1]) {
                swap(a[j], a[j + 1]);
                numof_swaps++;
            }
        }
    
    }
    cout<<"Array is sorted in "<<numof_swaps<<" swaps.\n";
    cout<<"First Element: "<<a[0]<<"\n";
    cout<<"Last Element: "<<a[n-1]<<"\n";

}

