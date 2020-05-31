#include<iostream>
using namespace std;
int point(int x, int y)
{
  if(x<(y-1))
    std::cout<<"*";
}
int main()
{
  int n,a=1,rc=1,b=0;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    for(b;b<rc;b++)
    {
      cout<<a;
      if(i%2==1)
        a++;
      else
        a--;
    point(b,rc);
    }
    if(i%2==1)
      a=a+b;
    else
      a=a+b+1;
    
    std::cout<<"\n";
    b=0;
    rc=rc+1;
  }
  return 0;
}