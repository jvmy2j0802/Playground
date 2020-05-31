#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,total=0,a,count=0;
  std::cin>>n;
  do
  {
    std::cin>>a;
    total=total+a;
    count++;
  }while(total<n);
  
  std::cout<<"The number of turns is "<<count;
    return 0;
}