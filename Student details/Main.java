#include<iostream>
#include<iomanip>
#include<string.h>
#include<stdlib.h>
using namespace std;
struct stu
{
  char name[50];
  char dept[10];
  int year;
  float cgpa;
};
   int compare (const void *a, const void *b) {
         return strcmp(((stu*)a)->name,((stu*)b)->name);
}

int main()
{
  int n,j=0,k=0;
  std::cout<<"Enter the number of students"<<"\n";
  std::cin>>n;
  stu stu[n];
  for(int i=0;i<n;i++)
  {
   std::cout<<"Enter the details of student "<<(j+1)<<"\n";
   std::cout<<"Enter name"<<"\n";
   std::cin.getline(stu[i].name,50);
    std::cin.getline(stu[i].name,50);
    std::cout<<"Enter department"<<"\n";
    std::cin.getline(stu[i].dept,10);
    std::cout<<"Enter year of study"<<"\n";
    std::cin>>stu[i].year;
     std::cout<<"Enter cgpa"<<"\n";
    std::cin>>stu[i].cgpa;
    j++;
  }
  std::cout<<"Details of students"<<"\n";
  qsort(stu,n,sizeof(struct stu),compare);
  
  for(int i=0;i<n;i++)
  {
    std::cout<<"Student "<<(k+1)<<"\n";
    std::cout<<"Name:"<<stu[i].name<<"\n";
    std::cout<<"Department:"<<stu[i].dept<<"\n";
    std::cout<<"Year of study:"<<stu[i].year<<"\n";
    std::cout<<"CGPA:"<<stu[i].cgpa<<"\n";
    k++;
    
  }
  
 return 0; 
}

