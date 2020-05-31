#include<iostream>
using namespace std;
int main()
{
  int n;
  float a=0.5,t;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    t=a;
    a=a*3;
    std::cout<<t<<" ";
  }
  return 0;
}