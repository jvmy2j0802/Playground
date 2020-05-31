#include<iostream>
using namespace std;
int b;
int dig(int a,int sum)
{
b=a%10;
  sum=sum+b;
   if(a<=9) {
     b=sum%10;
     sum=sum/10;
     sum=sum+b;
    return sum;
  }
  return dig(a/10,sum);
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<dig(n,0);
  return 0;
}