#include<iostream>
using namespace std;
int main()
{
  int n,a=1,s=0;
  std::cin>>n;
  int b=(n*n)+1;
  int t=4*n;
  int c=b,e=0;
  for(int i=0;i<n;i++)
  {
    for(int j=1;j<t;j++)
    {
     if(i%2==0)
     {
        if(j<=s)
       {
         std::cout<<"-";
       }
       else if((j%2==1) && (j<2*n))
       {
         std::cout<<a;
         a++;
       }
       else if(j%2==1)
       {
         std::cout<<c;
         c++;
       }
       else
       {
         std::cout<<"*";
       }
     }
      
      else
      {
         if(j<=s)
       {
         std::cout<<"-";
       }
       else if((j%2==1) && (j<2*n))
       {
         std::cout<<a;
         a++;
       }
       else if (j%2==1)
       {
         std::cout<<c;
         c++;
       }
        else
        {
          std::cout<<"*";
        }
      }
    }
    std::cout<<"\n";
    s=s+2;
    c=(b-n+1);
    e=e+1;
    b=c+e;
    t=t-2;
  }
  return 0;
}