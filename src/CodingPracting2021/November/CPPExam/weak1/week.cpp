#include<iostream>
#include<ctime>
using namespace std;
const int DAY_HOURS = 24;
void runLoop();

int main(){
    bool isGameOver = true;
    if(!isGameOver){
        cout<<"This game is over, my friend!"<<endl;
    }else{
        cout<<"Hey, you haven't finished yet"<<endl;
    }

    runLoop();

    return 0;
}


void runLoop(){
    srand(unsigned(time(NULL)));
    string name = "nishant";
    cout<<"Length: "<<name.length()<<endl;
    for(int i = 0;i<=10;i++){
        int secretNum = rand()%100 + 1;
        cout<<secretNum<<endl;
        cout<<"I value: "<<i<<endl;
    }
}

