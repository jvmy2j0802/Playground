#include<iostream>
using namespace std;
int main()
{
  int n,b=1,count=1,c=4;
  std::cin>>n;
  int j=n;
  for(int i=0;i<=3;i++)
  {
    for(j;count<=b;count++)
    {
      std::cout<<j;
    }
    std::cout<<"\n";
    count=1;
    b=b+1;
    j=j+1;
  }
   for(int i=0;i<=3;i++)
  {
      j=j-1;
    for(j;count<=c;count++)
    {
      std::cout<<j;
    }
    std::cout<<"\n";
    count=1;
    c=c-1;
  }
  return 0;
}