#include<iostream>
#include<string>
using namespace std;
int main()
{
 std::string st1;
  std::string st2;
  std::getline(std::cin,st1);
    std::getline(std::cin,st2);
  if(st1==st2)
  {
    std::cout<<"It is correct";
  }
  else
    std::cout<<"It is wrong";
  
  return 0;
}