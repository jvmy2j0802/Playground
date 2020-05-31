#include <iostream>
int main() 
{
	// Type your code here
  int i,r;
  std::cin>>i;
  while(i!=0)
  {
    r=i%10;
    std::cout<<r;
    i=i/10;
  }
	return 0;
}