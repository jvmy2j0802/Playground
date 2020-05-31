#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char a[50][50];
    int n = 0,c;
    for(int i = 0; i < 4; i++)
    {
        cin.getline(a[i],50);
        n++;
        if(a[1]=="#")
            break;
    }
    cout<<a[0]<<"\n";
    for(int i = 0; i < n; i++)
    {
        c=strlen(a[i]);
        if(a[i][c-1]==a[i+1][0])
            cout <<a[i+1]<<"\n";
    }
    return 0;
}