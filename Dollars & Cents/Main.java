#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a1,b1,a2,b2,a,b,t,c;
  cin>>a1>>b1>>a2>>b2;
  a=a1+a2;
  b=b1+b2;
    t=b/100;
    c=b%100;
  std::cout<<(t+a)<<"\n";
  std::cout<<c;
  
  return 0;
}