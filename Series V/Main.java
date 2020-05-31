#include<iostream>
using namespace std;
int main()
{
  int n;
  int a=121,t,b=104;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    t=a;
    a=a+b;
    b=b+32;
    std::cout<<t<<" ";
  }
  return 0;
}
    
    
  