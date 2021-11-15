#include<iostream>
using namespace std;

int main(){    
    return 0;
}



int q5(){
    int testCases;
    cin>>testCases;
    while(testCases-->0){
        long long question,breakDuration,timeNeeded;
        cin>>question;
        cin>>breakDuration;
        cin>>timeNeeded;
        long long timeSpent = 0;

        while(question>0){
            if((question%2)==0){
                int solved = question/2;
                question = question-solved;
                timeSpent = timeSpent + (solved*timeNeeded);
            }else{
                int solved = (question+1)/2;
                question = question-solved;
                timeSpent = timeSpent + (solved*timeNeeded);
            }
            timeNeeded = timeNeeded*2;
            timeSpent += breakDuration;
        }

        cout<<timeSpent-breakDuration;
    }
    return 0;
}




int q4(){
    int totalCases;
    cin>>totalCases;
    while(totalCases-->0){
        int points,x,y;
        cin>>points;
        int n = points;

        while(points-->0){
            cin>>x;
            cin>>y;            
        }

        int result =0;
        for(int i = 1;i<=n;i++){
            result ^=i;
        }
        cout<<result<<endl;
    }

    return 0;
}



int q3(){
    int testCases;
    cin>>testCases;
    while(testCases-->0){
        int length;
        cin>>length;
        int data[length];

        for(int i = 0;i<length;i++){
            cin>>data[i];
        }

        int startIndex = 0;
        int endIndex = length-1;

        while(data[startIndex]==data[endIndex]&&startIndex<endIndex){
            startIndex++;
            endIndex--;

        }

        bool isContinous = true;

        for(int i = 1;i<length && isContinous;i++){
            int valA = data[i];
            int valB = data[i-1];

            int result = 0;
            if(valA>valB){
                result = valA-valB;
            }else{
                result = valB - valA;
            }

            if(result==1||result==0){
            }else{
                //cout<<result<<endl;
                isContinous = false;
            }
        }
        
        if(length==0){
            cout<<"yes"<<endl;
        }else{
            if(data[startIndex]==7&&startIndex>=endIndex && isContinous && data[0]==1){
                cout<<"yes"<<endl;
            }else{
                cout<<"no"<<endl;            
            }            
        }



    }
    return 0;    
}
int q2(){
    int testCases;
    cin>>testCases;
    while(testCases-->0){
        int moveiNumber;
        cin>>moveiNumber;
        int movieLengths[moveiNumber];
        int movieRating[moveiNumber];
        for(int i = 0;i<moveiNumber;i++){
            int input;
            cin>>input;
            movieLengths[i] = input;
        }

        for(int i = 0;i<moveiNumber;i++){
            int input;
            cin>>input;
            movieRating[i] = input;
        }

        int movieIndex = 0;

        for(int i = 0;i<moveiNumber;i++){
            if((movieLengths[movieIndex]*movieRating[movieIndex])<(movieLengths[i]*movieRating[i])
            &&(movieRating[movieIndex]<movieRating[i])){
                movieIndex = i;
            }
        }
        cout<<movieIndex;
    }
    return 0;   
}


int q1(){    
    int turns;
    cin>>turns;
    while(turns-->0){
        int n;
        cin>>n;

        int m;
        cin>>m;

        int k;
        cin>>m;

        int ignoredFiles[m];
        int trackedFiles[k];


        for(int ignoredCount = 0;ignoredCount<m;ignoredCount++){
            int input;
            cin>>input;
            ignoredFiles[ignoredCount] = input;
        }


        for(int trackedCount = 0;trackedCount<k;trackedCount++){
            int input;
            cin>>input;
            trackedFiles[trackedCount] = input;
        }

        int noOfCommonData = 0;
        
        for(int i = 0;i<m;i++){
            int currentIgnored = ignoredFiles[i];
            for(int l = 0;l<k;l++){
                int currentTracked = trackedFiles[l];
                if(currentIgnored==currentTracked){
                    noOfCommonData++;
                }
            }
        }
        int notTracAIgnored = 0;
        int smallerMax = 0;

        for(int i = 0;i<=notTracAIgnored;i++){
            bool found = false;
            int counter = 0;

            while(counter<m && !found){
                if(ignoredFiles[counter]==i){
                    found = true;
                }
                counter++;
            }

            counter = 0;
            while(counter<k &&  !found){
                if(trackedFiles[counter]==i){
                    found = true;
                }
                counter++;
            }

            if(!found){
                notTracAIgnored++;
            }
        }

        cout<<noOfCommonData<<" "<<notTracAIgnored<<endl;
    }
    return 0;
}