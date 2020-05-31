#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  std::string st1;
  int count=0;
  std::getline(std::cin,st1);
  for(int i=0;i<st1.length();i++)
  {
    if((st1[i] >='a' && st1[i]<='z') || (st1[i] >='A'&& st1[i]<='Z'))
    {
        std::cout<<st1[i];
    }
    else
    {
       st1.erase(i,1);
      i=i-1;
      count++;
    }
  }
  return 0;
}