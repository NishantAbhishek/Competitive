#include<iostream>
#include<vector>
#include<math.h>
using namespace std;

int q10() {
    int testCases = 0;
    cin>>testCases;
    
    while(testCases-->0){
        int distance,duration;
        cin>>distance;
        cin>>duration;
        cout<<distance/duration<<endl;
    }
    
	return 0;
}


int q9(){
    int testCases = 0;
    cin>>testCases;

    while(testCases-->0){
        int length = 0;
        cin>>length;
        string value = "";
        cin>>value;

        int count = 0;

        char vowels[] = {'a','e','i','o','u'};
        for(int i = 0;i<value.length()-1;i++){
            char letter1 = value.at(i);
            char letter2 = value.at(i+1);

            bool satisfies = true;
            bool letter2IsVowel = false;
            for(int k = 0;k<5;k++){
                if(vowels[k]==letter1){
                    satisfies = false;
                }

                if(vowels[k]==letter2){
                    letter2IsVowel = true;
                }
            }

            if(satisfies&&letter2IsVowel){
                count++;
            }
        }

        cout<<count<<endl;

    }

    return 0;
}


int q8(){
    int testCases = 0;
    cin>>testCases;

    while(testCases-->0){
        int length = 0;
        cin>>length;

        long data[length];

        for(long i = 0;i<length;i++){
            cin>>data[i];
        }

        int dp[length];
        long long total = 0;
        for(int i = 0;i<length;i++){
            dp[i] = 1;
            if(i!=0){
                if(data[i]>=data[i-1]){
                    dp[i]= dp[i]+dp[i-1];
                }
            }
            total = total+dp[i];
        }

        cout<<total<<endl;
    }
    return 0;    
}



int q7(){
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        int submission = 0;
        cin>>submission;
        int data[12]; 

        for(int i = 0;i<submission;i++){
            int index,score;
            cin>>index;
            cin>>score;

            if(data[index]<score){
                data[index] = score;
            }
        }

        int totalScore = 0;
        for(int i =0;i<=8;i++){
            totalScore+=data[i];
        }
        
        cout<<totalScore<<endl;

    }
    return 0;    
}



int q6(){
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        string data = "";
        cin>>data;
        int counter = 0;
        bool possible = true;
        while(counter<data.length()){
            char first = data.at(counter);
            char second = data.at(counter);

            if(first==second){
                possible = false;
            }

            counter = counter+2;
        }

        if(possible){
            cout<<"yes"<<endl;
        }else{
            cout<<"no"<<endl;
        }

    }

    return 0;
}

int q5(){
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        int N = 0;
        cin>>N;
        int v1 = 0;
        int v2 = 0;
        cin>>v1;
        cin>>v2;
        int totalLiftDistance = N*2;
        int totalStairDistance = N * sqrt(1/2);

        int liftTime = totalLiftDistance/v1;
        int stairTim  = totalStairDistance/v2;

        if(liftTime<stairTim){
            cout<<"Elevator"<<endl;
        }else{
            cout<<"Stairs"<<endl;
        }

    }
    return 0;
}


int q4(){
    int testCases=0;
    cin>>testCases;

    while(testCases-->0){
        int length;
        cin>>length;
        int A[length];
        int B[length];        

        for(int i = 0;i<length;i++){
            int data = 0;
            cin>>A[i];            
        }

        for(int i = 0;i<length;i++){
            int data = 0;
            cin>>B[i];            
        }

        int maxScore=0;

        for(int i = 0;i<length;i++){
            int goal = A[i];
            int foul = B[i];

            int score = (goal*20) - (foul*10);

            if(score>maxScore){
                maxScore = score;
            }
        }

        cout<<maxScore<<endl;
    }

    return 0;
}

int q3(){
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        int length;
        cin>>length;
        int A[length];
        int B[length];

        int maxA = 0;
        int maxB = 0;
        int sumA = 0;
        int sumB = 0;
        for(int i = 0;i<length;i++){
            int data = 0;
            cin>>data;
            if(maxA<data){
                maxA = data;
            }
            sumA +=data;            
        }

        for(int i = 0;i<length;i++){
            int data = 0;
            cin>>data;
            if(maxB<data){
                maxB = data;
            }
            sumB +=data;            
        }

        sumA = sumA-maxA;
        sumB = sumB - maxB;

        if(sumA>sumB){
            cout<<"Bob"<<endl;
        }else if(sumA<sumB){
            cout<<"Alice"<<endl;
        }else{
            cout<<"Draw"<<endl;
        }
        
    }

    return 0;    
}


int q2(){
    int testCases = 0;
    cin>>testCases;
    while(testCases-->0){
        vector<string> bag1;
        vector<string> bag2;


        for(int i = 0;i<4;i++){
            string item;
            cin>>item;
            bag1.push_back(item);
        }


        for(int i = 0;i<4;i++){
            string item;
            cin>>item;            
            bag2.push_back(item);
        }


        int similarItem = 0;

        for(int i =0;i<bag1.size();i++){
            string itemA = bag1.at(i);
            for(int k = 0;k<bag2.size();i++){
                string itemB = bag2.at(i);
                if(itemA.compare(itemB)==0){
                    similarItem++;
                }
            }
        }


        if(similarItem>=2){
            cout<<"similar"<<endl;
        }else{
            cout<<"dissimilar"<<endl;
        }

    }

    return 0;
}



int q1(){
    int testCases=0;
    cin>>testCases;
    while(testCases-->0){
        int length;
        cin>>length;
        int data[length];
        
        for(int i =0;i<length;i++){
            cin>>data[i];            
        }
        int subArraySize;
        cin>>subArraySize;
        int subArray[subArraySize];

        for(int i = 0;i<subArraySize;i++){
            cin>>subArray[i];
        }

        int subIndex = 0;
        for(int i = 0;i<length && i<subIndex;i++){
            if(data[i]==subArray[subIndex]){
                subIndex++;
            }
        }
        if(subIndex == subArraySize){
            cout<<"Yes"<<endl;
        }else{
            cout<<"No"<<endl;
        }
    }
    return 0;
}