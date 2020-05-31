#include<iostream>
using namespace std;
void print (int x[])
{
	if (x[0]%2==1)
	std::cout<<"Arun Gupta";
	else
	std::cout<<"Mani Iyer";	
}

int main()
{
	int x,b,a[2];
	for(int i=0;i<2;i++)
	std::cin>>a[i];
	print(a);
	return 0;	
}