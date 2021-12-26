#include <iostream>

using namespace std;


int main(){
    int t;
    cin >> t;
    for(int x=1;x<=t;x++){
        string word;
        cin >> word;
        if(x%2==1){
            cout << word << endl;
        }
    }
    return 0;
}


