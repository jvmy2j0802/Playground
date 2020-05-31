#include<iostream>
int main()
{
  int a,c=0;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(a%i==0)
    {
      c++;
    }
  }
  if(c==2)
  {
    std::cout<<"Eligible";
  }
  else
  {
std::cout<<"Not eligible";
  }
}