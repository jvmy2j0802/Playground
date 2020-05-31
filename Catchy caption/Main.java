#include <cstring>
#include <iostream>
int main()
{
   char a[100];
  std::cin.getline(a,100);
  int c=strlen(a);
  if(c<=25)
  std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
}