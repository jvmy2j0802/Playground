#include<iostream>
int main()
{
  int a;
  std::cin>>a;
  if(a%4==0&&a%100!=0||a%400==0)
    {
   std::cout<<"Vicky can celebrate his birthday.";
    }
  else
  {
    std::cout<<"Vicky can't celebrate.";
  }
}
