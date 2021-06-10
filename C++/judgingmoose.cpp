/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <algorithm> 
using namespace std;

int main()
{
    int l, r;
    cin >> l >> r;
  if(l==0 && r==0){
        cout << "Not a moose";
    }
    else if(l==r){
        
        cout << "Even "<<l*2;
    }
    
    else {
        
        cout << "Odd " <<max(l,r)*2;
    }
    return 0;
}
