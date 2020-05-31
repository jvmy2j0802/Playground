#include<iostream>
int main()
{
	int a,b,sum=0;
	std::cin>>a>>b;
	int c=a;
	while(c<b)
	{
		for(int i=1;i<c;i++)
		{
			if(c%i==0)
			{
				sum=sum+i;
			}
		}

		if(sum == c )
		std::cout<<sum<<" ";
		c++;
		sum=0;
	}
	return 0;
}
