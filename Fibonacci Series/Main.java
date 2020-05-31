#include<iostream>
using namespace std;
int b=1,c=0,d=0;
int fiba(int a,int count)
{
  count++;
  if(count == a) {
    return d;}
  d=b+c;
  b=c;
  c=d;
  return fiba(a,count);
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fiba(n,0);
  return 0;
}