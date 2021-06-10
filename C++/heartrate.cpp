/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    while(n-->0){
        int b;
        double p;
        cin >> b >> p;
        double t = 60/p;
        double bpm = b*t;
        printf("%.4f %.4f %.4f \n", bpm-t, bpm, bpm+t);
    }

    return 0;
}
