#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
   int tb,tr,nr,nb;
  std::cin>>tb>>tr>>nr>>nb;
  float a,b,c,d;
  a=tb/6;
  b=(nb/6)+((nb%6)*0.1);
  c=nr/b;
  d=tr/a;
  std::cout<<a<<endl;
  std::cout<<b<<endl;
  std::cout<<std::fixed<<std::setprecision(1)<<c<<endl;
  std::cout<<std::fixed<<std::setprecision(1)<<d<<endl;
  if(c>d)
  {
    std::cout<<"Eligible to Win";
  }
  else
  {
    std::cout<<"Not Eligible to Win";
  }
}
