#include<iostream>
using namespace std;
int main()
{
  int a;
  float b,c;
  std::cin>>a>>b;
  b=int(b);
  if(a>13)
  {
    if(b==13||b==14)
    {
     std::cout<<"$5.00";
    }
    else
    {
      std::cout<<"$8.00";
    }
  }
  else
  {
    if(b==13||b==14)
    {
     std::cout<<"$2.00";
    }
    else
    {
      std::cout<<"$4.00";
    }
  }
  return 0;
}