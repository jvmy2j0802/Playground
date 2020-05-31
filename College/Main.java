#include<iostream>
#include<iomanip>
using namespace std;
struct stu
{
  char name[100];
  char city[100];
  int year;
  float cgpa;
};
int main()
{
  int n,j=0,k=0;
  std::cout<<"Enter the number of colleges"<<"\n";
  std::cin>>n;
  stu stu[n];
  for(int i=0;i<n;i++)
  {
   std::cout<<"Enter the details of college "<<(j+1)<<"\n";
   std::cout<<"Enter name"<<"\n";
    std::cin.getline(stu[i].name,100);
   std::cin.getline(stu[i].name,100);
    std::cout<<"Enter city"<<"\n";
    std::cin.getline(stu[i].city,100);
    std::cout<<"Enter year of establishment"<<"\n";
    std::cin>>stu[i].year;
     std::cout<<"Enter pass percentage"<<"\n";
    std::cin>>stu[i].cgpa;
    j++;
  }
  std::cout<<"Details of colleges"<<"\n";
   
  for(int i=0;i<n;i++)
  {
    std::cout<<"College:"<<(k+1)<<"\n";
    std::cout<<"Name:"<<stu[i].name<<"\n";
    std::cout<<"City:"<<stu[i].city<<"\n";
    std::cout<<"Year of establishment:"<<stu[i].year<<"\n";
    std::cout<<"Pass percentage:";
    std::cout<<stu[i].cgpa<<"\n";
    k++;
    
  }
  
 return 0; 
}