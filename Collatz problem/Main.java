#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  std::cin>>n;
  std::cout<<n<<"\n";
  while(n!=1)
  {
    if(n%2==0)
      n=(n/2);
    else
      n=(3*n)+1;
    
   count++;
   std::cout<<n<<"\n";
  }
  std::cout<<count;
 return 0; 
}