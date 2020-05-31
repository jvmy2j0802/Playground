#include<iostream>
#include<string>
int main() 
{ 
std::string n;
  std::getline(std::cin,n);
  for(auto i=n.crbegin();i<n.crend();i++)
  {
    std::cout<<*i;
  }
  return 0;
}