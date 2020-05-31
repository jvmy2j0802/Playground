#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if((a>b) && (a>c))
  {
    if(b>c)
      cout<<"The treasure is in box which has number "<<b<<endl;
      else
       cout<<"The treasure is in box which has number "<<c<<endl;  
   }
  if((b>a) && (b>c))
  {
    if(a>c)
      cout<<"The treasure is in box which has number "<<a<<endl;
      else
       cout<<"The treasure is in box which has number "<<c<<endl;  
   }
    if((c>b) && (c>a))
  {
    if(b>a)
      cout<<"The treasure is in box which has number "<<b<<endl;
      else
       cout<<"The treasure is in box which has number "<<a<<endl;  
   }
if((a<b)&&(a<c))
{
  if((c%a==0)&&(b%a==0))
  {
    cout<<"The code to open the box is "<<a<<endl;
  }
  else
    cout<<"The code to open the box is 1"<<endl;
}
if((b<a)&&(b<c))
{
  if((c%b==0)&&(a%b==0))
  {
    cout<<"The code to open the box is "<<b<<endl;
  }
  else
    cout<<"The code to open the box is 1"<<endl;
} 
  if((c<b)&&(c<a))
{
  if((a%c==0)&&(b%c==0))
  {
    cout<<"The code to open the box is "<<c<<endl;
  }
    else
      cout<<"The code to open the box is 1"<<endl;
}
}