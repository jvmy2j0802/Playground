#include<iostream>
using namespace std;
int main()
{
 int x1,x2,x3,x,y1,y2,y3,y,z1,z2,z3,z;
  std::cin>>x1>>x2>>x3>>y1>>y2>>y3>>z1>>z2>>z3;
  x=((x1/100)*x2);
  x=(x1-x);
  x=(x+x3);
  y=((y1/100)*y2);
  y=(y1-y);
  y=(y+y3);
  z=((z1/100)*z2);
  z=(z1-z);
  z=(z+z3);
  std::cout<<"In Flipkart Rs."<<x<<"\n";
  std::cout<<"In Snapdeal Rs."<<y<<"\n";
  std::cout<<"In Amazon Rs."<<z<<"\n";
  if((x<=y) &&(x<=z))
  {
    std::cout<<"He will prefer Flipkart";
  }
  else if(y<z)
  {
    std::cout<<"He will prefer Snapdeal";
  }
  else
  {
    std::cout<<"He will prefer Amazon";
  }
return 0;
}
