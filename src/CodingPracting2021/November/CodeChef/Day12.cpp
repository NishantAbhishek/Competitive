#include <iostream>
#include<string>

using namespace std;

int gcd(int numA, int numB);

int q2() {
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        int A = 0;
        cin>>A;
        string B = "";
        cin>>B;

        if(A==0){
            cout<<B<<endl;
        }else if(B=="0"){
            cout<<A<<endl;
        }else if(A==0&&B=="0"){
            cout<<0<<endl;
        }else{
            int bResult = 0;
            for(int i = 0;i<B.size();i++){
                int currentCharVal = B.at(i)-'0';
                bResult = ((bResult*10)+currentCharVal)%A;
            }
            
            cout<<gcd(A,bResult)<<endl;
        }
    }
	return 0;
}

int gcd(int numA, int numB){
    if(numA==0){
        return numB;
    }else if(numB==0){
        return numA;
    }else{
        if(numA>numB){
            return gcd(numA%numB, numB);
        }else{
            return gcd(numA,numB%numA);
        }
    }
}


