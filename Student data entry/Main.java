#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
struct student s1;
  std::cout<<"\n"<<"Student Details"<<"\n";
  std::cin.getline(s1.name,50);
  std::cin>>s1.roll>>s1.marks;
  std::cout<<"Name: "<<s1.name<<"\n";
  std::cout<<"Roll: "<<s1.roll<<"\n";
  std::cout<<"Marks: "<<s1.marks<<"\n";
  
  return 0;
}