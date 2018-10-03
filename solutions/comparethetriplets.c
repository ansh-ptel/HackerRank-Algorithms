#include<stdio.h>
int main()
{
    int i;
    int a[3],b[3];
    for(i=0;i<3;i++)
    {
        scanf(" %d",&a[i]);
    }
    for(i=0;i<3;i++)
    {
        scanf(" %d",&b[i]);
    }
    int count=0;
    int count1=0;
    for(i=0;i<3;i++)
    {
        if(a[i]>b[i])
            count++;
        else if(a[i]<b[i])
            count1++;
        else
            continue;
    }
    printf("%d %d",count,count1);
    
}
