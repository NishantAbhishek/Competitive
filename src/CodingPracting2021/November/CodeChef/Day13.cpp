#include<iostream>
using namespace std;

int main(){
    int testCases =0;
    cin>>testCases;
    while(testCases-->0){
        int count = 0;
        string s,t;
        cin>>s>>t;
        for(int i = 0;i<s.size();i++){
            if(s.at(i)!=t.at(i)){
                count++;
            }
        }
        cout<<count<<endl;
    }    
    return 0;    
}