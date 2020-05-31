#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end, i=0;    
std::cin.getline(str,100);
while (str[i]!='\0')
{
	count++;
		i++;
}
for(int i=count-1,j=0;i>=0;i--,j++)
{
	rev[j]=str[i];
	std::cout<<rev[j];
}           
return 0;
}