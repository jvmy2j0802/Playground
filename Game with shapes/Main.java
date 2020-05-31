#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a>>b;
  if((2*a)<=b)
  {
    std::cout<<"circle can be inside a square";
  }
  else
  {
    std::cout<<"circle cannot be inside a square";
  }
}