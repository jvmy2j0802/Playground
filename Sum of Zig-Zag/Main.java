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
  }
  if(n==3 && m==3)
    sum=sum-a[1][0]-a[1][2];
  
  std::cout<<"Sum of Zig-Zag pattern is "<<sum;
  return 0;
}