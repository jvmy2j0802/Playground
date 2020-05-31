#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
	 {
        j=j*m;
		}
    return j;
}
int arm(int n)
{
    int a,b,s=0,t,c;
  int count=0;
  b=n;
  while(b!=0)
  {
    b=(b/10);
    count++;
  }
  a=n;
  while(a>0)
  {
    c=(a%10);
    t=power(c,count);
      s=s+t;
    a=(a/10);
  }
  return s;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==n)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";

}