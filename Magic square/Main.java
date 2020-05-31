#include<iostream>
using namespace std;
int main()
{
  int n,sum1=0,sum2=0;
  std::cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int i=0,j=0;i<n;i++,j++)
  {
    sum1=sum1+a[i][j];
  }
  for(int i=0,j=n-1;i<n;i++,j--)
 {
    sum2=sum2+a[i][j];
  }
  if(sum1==sum2)
    std::cout<<"Yes";
  else
  std::cout<<"No";
  
  return 0;
}