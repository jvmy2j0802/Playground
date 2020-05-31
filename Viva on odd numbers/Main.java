#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count =0;
  float sum=0.0;
  do
  {
    std::cin>>n;
    if(n<0){
      sum=sum-1.0;
      break;
    }
    else if(n%2==1) {
      sum=sum+1.0;
      count++; }
    
    else {
      sum=sum-0.5;
       }
    
  }while(count<3);
  
  std::cout<<sum;
  return 0;
}