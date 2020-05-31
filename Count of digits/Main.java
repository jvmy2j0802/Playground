#include <iostream>

int main()
{
    int num;
    int count=0;
  std::cin>>num;
    do
    {
        count++;
        num /= 10;
    } while(num != 0);
  std::cout<<count;

    return 0;
}