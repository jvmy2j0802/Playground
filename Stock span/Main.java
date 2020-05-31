#include<iostream>
using namespace std;
void stockspan(int x,int* y)
{
  int c=2;
  std::cout<<"1"<<"\n";
  for(int i=0,j=1;i<x,j<x;i++,j++)
  {
    if(y[i]>=y[j])
       std::cout<<"1"<<"\n";
    else{
      std::cout<<c<<"\n";
      c=c+2;
    }
  }
}
int main()
{
 int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  stockspan(n,a);
  return 0;
}