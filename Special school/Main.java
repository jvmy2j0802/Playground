#include<iostream>
#include<string>
using namespace std;
int main()
{
 std::string st1,st2,st3;
  int j=0,count =0;
  std::getline(std::cin,st1);
   std::getline(std::cin,st3);
 for(auto i=st1.crbegin();i<st1.crend();i++)
 {
   st2[j]= *i;
   j++;
 }
  for(int i=0;i<st1.length();i++)
  {
      if(st2[i] != st3[i])
    count++;
  }
  if(count == 0)
  {
    std::cout<<"It is correct";
  }
  else
std::cout<<"It is wrong";
  
  return 0;
}