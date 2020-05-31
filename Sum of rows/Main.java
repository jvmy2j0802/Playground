#include<iostream>
using namespace std;
int main()
{
  int m,n,sum=0;
  std::cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      sum=sum+a[i][j];
    }
    std::cout<<sum<<"\n";
    sum=0;
}
  return 0;
}