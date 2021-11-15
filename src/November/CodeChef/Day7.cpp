#include<iostream>

using namespace std;



int q1(){
    int testCases = 0;
    cin>>testCases;

    while(testCases-->0){
        int numberOfStudent = 0;
        cin>>numberOfStudent;

        int heights[100001];

        for(int i = 0;i<numberOfStudent;i++){
            int input = 0;
            cin>>input;
            heights[input] = heights[input]+1;
        }

        int uniqueStudent = 0;
        for(int i =0;i<100001;i++){
            if(heights[i]!=0){
                uniqueStudent++;
            }
        }
        int possible = true;
        if(numberOfStudent<12 && uniqueStudent>12){
            possible = false;
        }

        if(possible){
            cout<<"yes"<<endl;
        }else{
            cout<<"bo"<<endl;
        }

    }
    return 0;
}
