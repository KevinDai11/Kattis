/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    string s;
    cin >> s;
    int c=0;
    for(int x=0;x<s.length();x++){
        if(x%3==0){
            if(s[x]=='P'){
                continue;
            }
            c++;
        }
        if(x%3==1){
            if(s[x]=='E'){
                continue;
            }
            c++;
        }
         if(x%3==2){
            if(s[x]=='R'){
                continue;
            }
            c++;
        }
    }
    cout << c;
    return 0;
}
