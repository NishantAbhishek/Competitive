#include<vector>
#include<iostream>

using namespace std;

int main(){    

    return 0;
}

int q1(){
    int totalTurns;
    cin>>totalTurns;
    while(totalTurns--){
        long long n;
        cin>>n;
        vector<int> arr;

        long long minData = 100000000000000;

        for(long long i =0; i<n;i++){
            int elem;
            cin>>elem;

            if(minData>elem){
                minData = elem;
            }

            arr.push_back(elem);            
            
            }

        cout<<minData*(n-1)<<endl;

    }    
    return 0;
}