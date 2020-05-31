#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  std::string st;
  std::getline(std::cin,st);
  a=st.find("the");
  st.erase(a,4); 
  b=st.find("the");
  st.erase(b,4);
  std::cout<<st;
  return 0;
}