#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,a=0,t=0;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      
      if(i%2==0) {
      if(j==(n-1)){
        a=a+1;}
      else
        a=t+1;
      }
      
    if(i%2==1) {
      if(j==0)
        t=a-1;    
    else
    a=t;
    }
      std::cout<<a;
    }
    std::cout<<"\n";
    a=a+1;
  }
    return 0;
}