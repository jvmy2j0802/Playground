#include<iostream>
using namespace std;
int main()
{
  int v=0,c=0,w=0,d=0,s=0;
  std::string a;
  std::getline(std::cin,a);
  for(int i=0;i<a.length();i++)
  {
    if((a[i]>='a') && (a[i]<='z') || (a[i]>='A') && (a[i]<='Z'))
    {
      if((a[i]=='a' ) ||(a[i]=='e' ) ||(a[i]=='i' ) ||(a[i]=='o' ) ||(a[i]=='u' ) ||
        (a[i]=='A' ) ||(a[i]=='E' ) ||(a[i]=='I' ) ||(a[i]=='O' ) ||(a[i]=='U' ))
        v++;
      else
        c++;
    }
    else if(a[i] ==' ')
      w++;
    
    else if((a[i]>='0') && (a[i]<='9'))
      d++;
    
    else
      s++;
  }
  std::cout<<"Vowels:"<<v<<"\n";
    std::cout<<"Consonants:"<<c<<"\n";
  std::cout<<"White Spaces:"<<w<<"\n";
  std::cout<<"Digits:"<<d<<"\n";
  std::cout<<"Symbols:"<<s<<"\n";
  return 0;
}