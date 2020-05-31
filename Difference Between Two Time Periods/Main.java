#include<iostream>
using namespace std;
struct time
{
  int h,m,s;
};
int main()
{
 struct time t1,t2,t;
  std::cin>>t1.h>>t1.m>>t1.s;
  std::cin>>t2.h>>t2.m>>t2.s;
  
  if(t2.s>t1.s)
  {
    t1.m--;
    t1.s=t1.s+60;
  }
  if(t2.m>t1.m)
  {
    t1.h--;
    t1.m=t1.m+60;
  }
   t.h=t1.h-t2.h;
   t.m=t1.m-t2.m;
  t.s=t1.s-t2.s;
  
  std::cout<<t.h<<":"<<t.m<<":"<<t.s;
  return 0;
}