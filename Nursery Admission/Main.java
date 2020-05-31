#include<iostream>
using namespace std;
int main()
{
 std::string st1;
  std::getline(std::cin,st1);
  std::cout<<"The number of letters in the name is "<<st1.length();
  return 0;
}