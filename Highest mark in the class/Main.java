#include<iostream>
int main()
{
 int n,lar=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]>lar)
      lar=a[i];
  }
  std::cout<<lar;
  return 0;
}