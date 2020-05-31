#include<iostream>
using namespace std;
int gcd(int a,int b,int c)
{
  if((a%c==0) && (b%c==0)){
  return c;
  }
  c--;
  return gcd(a,b,c);
}
int main()
{
 int x,y;
  std::cin>>x>>y;
  if(x>y)
    std::cout<<"G.C.D of "<<x<<" and "<<y<<" = "<<gcd(x,y,y);
  else
    std::cout<<"G.C.D of "<<x<<" and "<<y<<" = "<<gcd(y,x,x);
  return 0;
}