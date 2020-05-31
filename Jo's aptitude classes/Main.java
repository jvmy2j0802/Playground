#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,small,fac;
  std::cin>>a>>b>>c>>d;
  
  if((a<=b)&&(a<=c))
    small=a;
  else if((b<=a)&&(b<=c))
    small=b;
  else
    small=c;
   
  while(small>0)
  {
    if((a%small==0) && (b%small==0) &&(c%small==0)){
      fac=small;
    break;}
    else
      small--;
  }
  if(fac==d)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
   return 0;
}
   
  
   
  