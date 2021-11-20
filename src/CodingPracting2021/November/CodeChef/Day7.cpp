#include<iostream>

using namespace std;


int main(){

    int testCases=0;
    cin>>testCases;

    while(testCases-->0){
        int rows,columns;
        cin>>rows;
        cin>>columns;

        if((rows%2)!=0 || (columns%2)!=0){
            cout<<"NO"<<endl;
        }else{
            cout<<"YES"<<endl;
        }
    }
    
    return 0;
}


int q2(){
    int testCases;
    cin>>testCases;
    while(testCases-->0){
        int X,Y;
        cin>>X;//score
        cin>>Y;//matches

        //win = 2
        //tie = 1
        //loose = 0

        if(X<=Y){
            cout<<"0"<<endl;
        }else{
            int numberOfWin =0;
            while(X>Y){
                numberOfWin++;
                X = X-2;
                Y--;
            }
            cout<<numberOfWin<<endl;
        }
    }
    return  0;
}

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
