#include<iostream>
#include<cmath>
using namespace std;
struct dist
{
  float i;
  float f;
};
int main()
{
 struct dist d,d1,d2;
  std::cin>>d1.i>>d1.f;
  std::cin>>d2.i>>d2.f;
  d1.i=abs(d1.i);
  d1.f=abs(d1.f);
  d2.i=abs(d2.i);
  d2.f=abs(d2.f);
  
  d.i=d1.i+d2.i;
  d.f=d1.f+d2.f;
  
  if(d.f>=12){
    d.f=d.f-12;
      d.i++;
  }
  std::cout<<d.i<<"'-"<<d.f<<"\"";
  return 0;
}