#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if((c%b==0)||(c%b==1)||(c==b-1)||(c==b-2)||(c==b-3)||(c==b-4))
  std::cout<<"Yes";
  else
    std::cout<<"No";
  
  return 0;
}