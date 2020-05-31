#include<iostream>
using namespace std;
int pow(int x,int y, int pro)
{
  if(y==1)
  {
    return pro;
  }
  pro=pro*x;
  y--;
  return pow(x,y,pro);
}
int main()
{
 int a,n;
  std::cout<<"Enter the value of a"<<"\n";
  std::cin>>a;
  std::cout<<"Enter the value of n"<<"\n";
  std::cin>>n;
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n,a);
    return 0;
}
