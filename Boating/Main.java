#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c;
  d=(b*75)+(c*30);
  if(a>d)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}