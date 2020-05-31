#include<iostream>
using namespace std;
int main()
{
  int X,Y,R;
  float A,B,C,D;
  cin>>X>>Y>>R;
  A=(X*Y*R)/100;
  B=A+X;
  C=A*2/100;
  D=B-C;
  cout<<A<<"\n"<<B<<"\n"<<C<<"\n"<<D;
}