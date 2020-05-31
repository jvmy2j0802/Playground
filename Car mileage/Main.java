#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  if((a*b)<c)
  {
    std::cout<<"Cannot reach";
  }
  else
  {
    std::cout<<"Can reach";
  }
}