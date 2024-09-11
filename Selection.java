public class Selection
{
public static void Selectionsort(int[]arr)
{
for(int i=0;i<arr.length-1;i++)
{
int index=i;
for(int j=1;j<arr.length;j++)
{
if(arr[j]<arr[index])
{
index=1;
}
}
int smallerNumber=arr[index];
arr[index]=arr[i];
arr[i]=smallerNumber;
}
}
public static void main(String a[])
{
int[]arr1={9,14,3,2,43,11,58,22};
System.out.println("before selection sort");
for(int i:arr1)
{
System.out.print(i+"");
}
System.out.println();
Selectionsort(arr1);
System.out.println("after selection sort");
for(int i:arr1)
{
System.out.print(i+"");
}
}
}
