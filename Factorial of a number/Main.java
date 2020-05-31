#include<iostream>
int main(){
  int a,flag=1;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  {
    flag=flag*i;
  }
  std::cout<<flag;
  
}