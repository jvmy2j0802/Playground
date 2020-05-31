#include<iostream>
#include<iomanip>
int main()
{
  int n,a,b,c,d,a1,b1;
  std::cin>>n>>a>>b>>c>>d;
  switch(n)
  {
    case 1:
    {
      a=a+c;
      b=b+d;
      std::cout<<a<<std::showpos<<b<<"i";
      break;
    }
    case 2:
    {
      a=a-c;
      b=b-d;
      std::cout<<a<<std::showpos<<b<<"i";
      break;
    }
    case 3:
      {
        a1=((a*c)-(b*d));
        b1=((a*d)+(b*c));
        std::cout<<a1<<std::showpos<<b1<<"i";
      break;
      }
    default :
    std::cout<<"Invalid choice";
  }
    return 0;
  }
  