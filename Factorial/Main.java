#include<iostream>
using namespace std;
int fac;
int factorial(int a)
{
  if(a==1) {
    return a;}
  return fac=a*factorial(a-1);
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<factorial(n);
  return 0;
}