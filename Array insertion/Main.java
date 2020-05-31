#include<iostream>
using namespace std;
int main()
{
 int n,l,v;
  std::cout<<"Enter the number of elements in the array"<<"\n";
  std::cin>>n;
  int a[n+1];
  std::cout<<"Enter the elements in the array"<<"\n";
 for(int i=0;i<n;i++)
 {
   std::cin>>a[i];
 }
  std::cout<<"Enter the location where you wish to insert an element"<<"\n";
  std::cin>>l;
  if(l>n)
  {
    std::cout<<"Invalid Input";
    return 0;
  }
  std::cout<<"Enter the value to insert"<<"\n";
  std::cin>>v;
  std::cout<<"Array after insertion is"<<"\n";
  for(int i=n;i>=0;i--)
  {
    if(i+1 > l)
    {
      a[i]=a[i-1];
    }
    else if(i+1 == l)
    {
     a[i]=v; 
    }
    else 
   a[i];
  }
   for(int i=0;i<=n;i++)
 {
   std::cout<<a[i]<<"\n";
 }
  return 0;
}