#include<iostream>
struct emp
{
  char name[50];
  int id;
  char des[50];
  int age;
  int salary;
};
int main()
{
  struct emp em;
  std::cout<<"Enter name:"<<"\n";
  std::cin.getline(em.name,50);
  std::cout<<"Enter ID:"<<"\n";
  std::cin>>em.id;
  std::cout<<"Enter age:"<<"\n";
  std::cin>>em.age;
  std::cout<<"Enter designation:"<<"\n";
  std::cin.getline(em.des,50);
  std::cin.getline(em.des,50);
  std::cout<<"Enter Salary:"<<"\n";
  std::cin>>em.salary;
  
  std::cout<<"Employee Details"<<"\n";
  std::cout<<"Name of the Employee : "<<em.name<<"\n";
  std::cout<<"ID of the Employee : "<<em.id<<"\n";
  std::cout<<"Age of the Employee : "<<em.age<<"\n";
  std::cout<<"Designation of the Employee : "<<em.des<<"\n";
  std::cout<<"Salary of the Employee : "<<em.salary<<"\n";
  
 return 0;
}
  