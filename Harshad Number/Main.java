#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,a,i;
  std::cin>>n;
  i=n;
  while(i!=0)
  {
    a=i%10;
    sum=sum+a;
    i=i/10;
  }
  if(n%sum==0)
  std::cout<<"Harshad Number";
  else
  std::cout<<"Not Harshad Number";  
  return 0;
}