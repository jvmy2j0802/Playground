#include<iostream>
using namespace std;
int main()
{
  int m,n,max=0;
  std::cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int j=0;j<n;j++)
  {
    for(int i=0;i<m;i++)
    {
      if(a[i][j] > max)
        max=a[i][j];
    }
    std::cout<<max<<"\n";
    max=0;
}
  return 0;
}