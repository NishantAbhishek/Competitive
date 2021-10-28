#include<iostream>
using namespace std;
int mul(int num);

int main(){

    int data[] = {-1,2,4,-3,5,2,-5,2};
    int size = 8;

    int maxSumSub = 0;
    for(int  i = 0;i<size;i++){
        if(data[i]>maxSumSub){
            
        }
    }
    return 0;
}

int mul(int num){
    if(num==0){
        return 1;
    }else{
        return num * mul(num-1);
    }
}



