#include <iostream>
using namespace std;

int main(){
    return 0;
}

int q3(){
    int testCases;
    cin>>testCases;
    while(testCases-->0){
        int noOfCharacter,occuranceCount;
        cin>>noOfCharacter;
        cin>>occuranceCount;
        int occurances[occuranceCount];
        int oddNumber = 0;
        int evenNumber = 0;
        int stringLength=0;

        for(int i = 0;i<occuranceCount;i++){
            int input;
            cin>>input;
            if(input%2==0){
                evenNumber++;
            }else{
                oddNumber++;
            }
            stringLength += input;
            occurances[i] = input;
        }

        int changeRequired = 0;
        changeRequired = oddNumber/2;
        cout<<changeRequired<<endl;

    }
    return 0;
}

int q2(){
    int testCases;
    cin>>testCases;

    while(testCases-->0){
        int coins_1RS, coins_2RS;
        cin>>coins_1RS;
        cin>>coins_2RS;

        int totalPrice = coins_1RS+ (coins_2RS*2);

        bool possible = true;

        if(totalPrice%2==1){
            possible = false;
        }else if(coins_2RS%2 == 1 && coins_1RS%2==0){
            possible = true;
        }else{
            possible = false;
        }
        if(possible){
            cout<<"YES"<<endl;            
        }else{
            cout<<"NO"<<endl;            
        }

    }

}


int q1() {
    int testCases;
    cin>>testCases;

    while(testCases-->0){
        int X,Y,A,B,K;
        cin>>X;
        cin>>Y;
        cin>>A;
        cin>>B;
        cin>>K;

        while(K-->0){
            X = X+A;
            Y = Y+B;            
        }

        if(X<Y){
            cout<<"PETROL"<<endl;
        }else if(X>Y){
            cout<<"DIESEL"<<endl;
        }else{
            cout<<"SAME PRICE"<<endl;
        }

    }
	return 0;
}
