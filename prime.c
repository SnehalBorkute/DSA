#include<stdio.h>
int main()
{
    int n,i;
    int static count=0;
    printf("enter the number");
    scanf("%d",&n);
    if(n==1 || n==2)
    {
        printf("prime");
    }
    else{
    for(i=2;i<n/2;i++)
    {
        if(n%i==0)
        {
            // printf("not prime");
            count++;
            break;
        }
        
    }
   

    if(count==0)
    {
        printf("prime");
    }
    else{
        printf("Not prime");
    }
    }
    // printf("Prime");
    return 0;
}