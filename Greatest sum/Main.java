#include<iostream>
using namespace std;
int main()
{
 int m,n;
  std::cin>>m>>n;
  int a[m][n],sum[m],sum1[n],sumro=0,sumrc=0,sumr,sumc,sumv=0;
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      std::cin>>a[i][j];
    }
  }
  std::cout<<"Sum of rows is ";
   for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      sumv=sumv+a[i][j];
    }
     sum[i]=sumv;
     sumv=0;
     std::cout<<sum[i]<<" ";
  }
  std::cout<<"\n";
  for(int i=0;i<m;i++)
  {
    if(sum[i]>sumro){
      sumro=sum[i];
      sumr=i+1;}
  }
  std::cout<<"Row "<<sumr<<" has maximum sum"<<"\n";
  
  std::cout<<"Sum of columns is ";
   for(int j=0;j<n;j++) 
  {
    for(int i=0;i<m;i++)
    {
      sumv=sumv+a[i][j];
    }
     sum1[j]=sumv;
     sumv=0;
     std::cout<<sum1[j]<<" ";
  }
  std::cout<<"\n";
  for(int j=0;j<n;j++)
  {
    if(sum1[j]>sumrc){
      sumrc=sum1[j];
      sumc=j+1;}
  }
  std::cout<<"Column "<<sumc<<" has maximum sum"<<"\n";
  return 0;
}