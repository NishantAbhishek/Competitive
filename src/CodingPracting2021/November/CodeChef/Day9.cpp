#include <iostream>
#include<string>
using namespace std;
int largestPower(int number);

int q5() {
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        int userInput = 0;
        cin>>userInput;

        int power = largestPower(userInput);
        cout<<power<<endl;
        int n = 1;
        for(int i = 1;i<=power;i++){
            n = n*2;
        }

        int answer1 = n/2;
        int answer2 = userInput-n+1;

        if(answer1>answer2){
            cout<<answer1<<endl;
        }else{
            cout<<answer2<<endl;
        }

        
    }
	return 0;
}

int largestPower(int number){
    if(number==1){
        return 1;
    }

    int currentPower = 1;
    int boundary=2;
    while(boundary<number){
        boundary = boundary*2;
        currentPower++;
    }
    if(boundary>number){
        currentPower--;
    }
    return currentPower;
}


int q4() {
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        int england = 0;
        int india = 0;
        
        int counter = 5;
        while(counter-->0){
            int input = 0;
            cin>>input;
            if(input==1){
                india++;
            }else if(input == 2){
                england++;
            }
        }
        
        if(england==india){
            cout<<"DRAW"<<endl;
        }else if (india>england){
            cout<<"INDIA"<<endl;
        }else{
            cout<<"ENGLAND"<<endl;
        }
        
    }
	return 0;
}

int q3() {
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        int x,y;
        cin>>x;
        cin>>y;
        int totalStep=0;
        while(x!=y){
           // cout<<"x "<<x<<endl;
            if(x<y){
                x=x+2;
            }else{
                x--;
            }
            totalStep++;
        }
        cout<<totalStep<<endl;
    }
	return 0;
}



int q2(){
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        int N = 0;
        cin>>N;

        for(int row = 1;row<=N;row++){
            for(int column = 1;column<=N;column++){
                if(column==2 && row==2){
                    cout<<"Q";
                }else if(column>2 && column==row){
                    cout<<"Q";
                }else{
                    cout<<".";
                }
            }
            cout<<endl;
        }

    }
    return 0;
}


int q1() {
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        int input = 0;
        cin>>input;
        int total = 0;
        for(int i = 1;i<=input;i++){
            if(i%2==1){
                int numberOfBox = (input+1-i)*(input+1-i);
                total = total+numberOfBox;
            }
        }
        cout<<total<<endl;
        
    }
    
	return 0;
}
