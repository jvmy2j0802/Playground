#include<iostream>
using namespace std;
int main()
{
int x,y,count=0,sum=0;
  std::cin>>x>>y;
  int a[x];
  for(int i=0;i<x;i++)
  {
    std::cin>>a[i];
  }
  for(int i=0,j=1;i<x;i++,j++)
  {
    if(a[i]<y)
    {
      sum=a[i]+a[j];
      if(sum <= y){
        i=i+1;
        j=j+1;
        count++;}
      else
        count++;
    }
    else
      count++;
  }
  if(count==2)
    std::cout<<3;
  else
    std::cout<<count;
  return 0;
  
}