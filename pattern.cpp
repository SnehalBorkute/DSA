#include<bits/stdc++.h>
using namespace std;
void print1(int n)
{
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<n;j++)
    {
        cout<<"*";
    }
    cout<<endl;
    }
}
void print2(int n){
    for(int i=0;i<n;i++){
      //  for(int j=0;j<=i;j++)
    for(int j=1;j<=j+1;j++)
     {
        cout<<"*";
     }
     cout<<endl;
  }
}
void print3(int n)
{
    for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++)
     {
        cout<<j;
     }
     cout<<endl;
    }
}
void print4(int n)
{
for(int i=1;i<=n;i++)
{
    for (int j=1;j<=i;j++)
    {
     cout<<i;
    }  
cout<<endl;
}
}
void print5(int n)
{
    for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i+1;j++)
    {
        cout<<"*";
    }
    cout<<endl;
}
}
 void print6(int n) 
 {
     for(int i=1;i<=n;i++){
     for(int j=1;j<=n-i+1;j++)
     {
         cout<<j;
     }
     cout<<endl;
 }
 }
 void print7(int n)
 {
    for(int i=0;i<n;i++){
    for(int j=0;j<=n-i-1;j++)//for space
    {
        cout<<" ";
    }
    for(int j=0;j<2*i+1;j++)//for *
    {
        cout<<"*";
    }
    for(int j=0;j<=n-i-1;j++)
    {
        cout<<" ";
    }
    cout<<endl;
 }
 }
 void print8(int n)
 {
   for(int i=0;i<n;i++) 
   {
    for(int j=0;j<i;j++)//space
    {
        cout<<" ";
    }
    for(int j=0;j<2*n - (2*i + 1);j++){//star
     cout<<"*";
    }
    for(int j=0;j<i;j++)//space
    {
        cout<<" ";
    }
    cout<<endl;
   }
 }
void  print9(int n)
 {
  for(int i=0;i<=n;i++){
    for(int j=0;j<=n-i-1;j++)//for space
    {
        cout<<" ";
    }
    for(int j=0;j<2*i+1;j++)//for *
    {
        cout<<"*";
    }
    for(int j=0;j<=n-i-1;j++)
    {
        cout<<" ";
    }
    cout<<endl;
 }
  for(int i=0;i<n;i++) 
   {
    for(int j=0;j<i;j++)//space
    {
        cout<<" ";
    }
    for(int j=0;j<2*n - (2*i + 1);j++){//star
     cout<<"*";
    }
    for(int j=0;j<i;j++)//space
    {
        cout<<" ";
    }
    cout<<endl;
   }  
 }
 void print10(int n)
 {
   for(int i=1;i<=2*n-1;i++)
   {
   int star=i;
   if(i>n)
   {
    star=2*n-i;
   }
   for(int j=1;j<=star;j++)
   {
    cout<<"*";
   }
   cout<<endl;
 }
 }
 void print12(int n)
 {
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)//star
        {
            cout<<j;
        }
        for(int j=1;j<2*(n-1);j++)//space
        {
            cout<<" ";
        }
          for(int j=1;j>=i;j--)//star
        {
            cout<<j;
        }
        cout<<endl;

    }
 }
 void print13(int n)
 {
   int num=1;
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=i;j++)
    {
        cout<<num;
        num=num+1;
    }
    cout<<endl;
   }
 }
 void print14(int n)
 {
  for(int i=1;i<=n;i++)
  {
    for(char ch='A';ch<='A'+i;ch++)
    {
        cout<<ch;
    }
    cout<<endl;
  }
 }
 void  print15(int n)
 {
    for(int i=1;i<=n;i++)
    {
        for(char j='A';j<='A'+n-i-1;j++)
        {
            cout<<j;
        }
        cout<<endl;
    }
 }
 void  print16(int n)
 {
    for(int i=0;i<=n;i++)
    {
        char ch='A'+i;
        for(char j=0;j<=i;j++)
        {
            cout<<ch;
        }
        cout<<endl;
    }
 }
 void print17(int n){
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)//space
        {
            cout<<" ";
        }
        char ch='A';
        int breakpoint=(2*i+1)/2;//character
        for(int j=1;j<=2*i+1;j++)
        {
          cout<<ch;
          if(j<=breakpoint)ch++;
          else ch--;
        }
        for(int j=0;j<n-i-1;j++)//space
        {
            cout<<" ";
        }
        cout<<endl;   
    }  
 }
 void print18(int n)
 {
    for(int i=0;i<n;i++)
    {
        for(char ch='E'-i;ch<='E';ch++)
        {
            cout<<ch;
        }
        cout<<endl;
    }
 }
 void print19(int n)
 {
    int inis=0;
    for(int i=0;i<n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
            cout<<"*";
        }
        for(int j=0;j<inis;j++)
        {
            cout<<" ";
           
        }
        for(int j=1;j<=n-i;j++)
        {
            cout<<"*";
        }
        inis +=2;
    cout<<endl;
    }
     inis=8;
    for(int i=1;i<=n;i++){
     for(int j=1;j<=i;j++)
        {
            cout<<"*";
        }
        for(int j=0;j<inis;j++)
        {
            cout<<" ";
           
        }
        for(int j=1;j<=i;j++)
        {
            cout<<"*";
        }
        inis -=2;
    cout<<endl;
 }
 }
 void print20(int n)
 {
    int spaces=2*n-2;
   for(int i=1;i<=2*n-1;i++)
   {
    int stars=i;
    if (i>n) stars=2*n-i;
    for(int j=1;j<=stars;j++)//star
    {
      cout<<"*";
    }
    //space
       for(int j=1;j<=spaces;j++)
       {
          cout<<" ";
       } 
       //star
       for(int j=1;j<=stars;j++)//star
    {
      cout<<"*";
    }
       
      cout<<endl;  
       if(i<n)spaces -=2;
      else spaces +=2;     
   }
 }
 void print21(int n)
 {
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if( i==0||j==0||i==n-1||j==n-1)
            {
                cout<<"*";
            }
            else cout<<" ";
    }
    cout<<endl;
    }
 }
 void print22(int n)
 {
    
 }
int main()
{
int n;
cin>>n;
print20(n);
}