#include<iostream>
using namespace std;
int main()
{
  int n,x,y,count=0,count1=1,d=1,e=1;
  std::cin>>n;
  x=n*n;
  y=n;
  while(y!=0)
  {
    y=y/10;
    count++;
  }
  y=x;
  while(y!=0)
  {
    y=y/10;
    count1++;
  }
  int a,b,c;
    for(int i=1;i<=count;i++)
  {
    d=10*d;
  }
  for(int i=1;i<=(count1/2);i++)
  {
    e=10*e;
  }
  a=x/d;
  b=x%e;
  c=a+b;
  
  if(c==n)
    std::cout<<"Kaprekar Number";
  else
    std::cout<<"Not a Kaprekar Number";
    
    return 0;
}
