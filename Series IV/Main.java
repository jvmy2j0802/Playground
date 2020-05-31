#include<iostream>
using namespace std;
int main()
{
  int n,t,a=0,b=2,count=0;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    t=a;
    std::cout<<t<<" ";
    count++;
    
    if(count==2) {
      count=0;
      b=b+4;
    }
     a=a+b;
  }
return 0;    
}