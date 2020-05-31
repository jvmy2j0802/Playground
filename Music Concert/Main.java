#include<iostream>
#include<cstdlib>
int main(){
  int n,even=0,odd=0;
  std::cin>>n;
  int *a;
  a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    std::cin>>*(a+i);
  }
   for(int i=0;i<n;i++)
   {
     if((*(a+i))%2==0)
       even++;
     
       else
         odd++;
   }
  std::cout<<odd<<"\n"<<even;
 free(a);
  a=NULL;
         
  return 0;
}