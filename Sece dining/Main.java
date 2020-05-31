#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char c[20];
  gets(c);
  char a[10]= "front";
  int b;
  std::cin>>b;
 
  if(strcmp(c,a)==0)
  {
    if(b==1)
    std::cout<<"Left Handed";
    else
    std::cout<<"Right Handed";
  }
  else
  {
    if(b==1)
      std::cout<<"Right Handed";
    else
      std::cout<<"Left Handed";
  }
  return 0;
}