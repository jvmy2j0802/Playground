#include<iostream>
#include<string>
int main() 
{ 
  int find;
	std::string fnum;
  std::getline(std::cin,fnum);
  find=fnum.find(".");
  if(find>=0 ) {
    fnum.assign(fnum.begin()+find+1,fnum.end());
  std::cout<<"Floating part is : "<<fnum;}
  else
  std::cout<<"Floating part is : ";
  return 0;	
}