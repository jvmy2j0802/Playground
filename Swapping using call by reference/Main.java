#include<iostream>
using namespace std;
void swap(int &x, int &y)
{
 int a=x;
  x=y;
  y=a;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
   std::cout<<"After swapping a= "<<a<<" and b="<<b;
 return 0; 
}
