#include<iostream>
using namespace std;

int exponential(int x, int tot)
{
  x=x*1;
  tot=tot*x;
  return tot;
}
  int main()
  {
    int a,b,c,d;
    int sum=1;
    std::cin>>a>>b>>c;
    for(int i=b;i>=1;i--)
    {
     sum=exponential(a,sum); 
    }
    d=sum;
    if(c<=d)
      std::cout<<"Doctor, you can proceed with your experiment.";
      else
         std::cout<<"Sorry Doctor! You need more bacteria.";
    return 0;
  }