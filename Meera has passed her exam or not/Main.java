#include<iostream>
int main()
{
 int n,x,count=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>x;
  for(int i=0;i<n;i++)
  {
    if(x==a[i])
      count++;
  }
  if(count == 1)
    std::cout<<"She passed her exam";
  
    else
      std::cout<<"She failed";
  
  return 0;
}