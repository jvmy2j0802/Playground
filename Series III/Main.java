#include<iostream>
using namespace std;
int main()
{
  int n,b=5;
  int a=6,t;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    t=a;
    a=a+b;
    b=b+5;
    std::cout<<t<<" ";
  }
  return 0;
}
    
    
  