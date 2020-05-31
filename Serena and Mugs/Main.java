#include<iostream>
using namespace std;
int printresult(int*x,int y,int z)
{
  int sum=0;
  if(x[0]==1 && x[1]==1)
    std::cout<<"YES";
  else
  std::cout<<"NO";
  
}
int main()
{
  int a[2],j;
for(int i=0;i<2;i++)
{
  std::cin>>a[i];
}
j=a[0];
  int b[j];
for(int i=0;i<j;i++)
{
  std::cin>>b[i];
}
 printresult(b,1,j);
 return 0; 
}