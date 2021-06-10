/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <bits/stdc++.h> 
using namespace std;

int main()
{
    int n;
    cin >> n;
    int c=0;
   unordered_set <int> hashSet; 
    while(n-->0){
        int s, e;
        cin >> s >> e;
        while(s<=e){
            hashSet.insert(s++);
        }
        
    }
    cout << hashSet.size();
    return 0;
}
