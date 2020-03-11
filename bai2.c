#include<stdio.h>
#include<conio.h>
void  nhapMang(int a[], int n)
{
	int i;
	for(i =0; i<n ; i++) 
	{
		printf("Nhap so thu %d ",i); 
		scanf("%d",&a[i]);
	}
}
//ham in mang
void inMang(int a[], int n)
{
	int i;
	for(i=0; i<n; i++) 
	printf("%d ", a[i]);
}
//ham tim so lon nhat
int soLonNhat(int a[], int n)
{
	int i, max;
	max=a[0];
for(i =1; i<n; i++)
	if(max<a[i]) 
		max=a[i];
return max;
}
//tao mang
int taoMang(int a[], int n, int b[])
{
	int i, k;
	k=0;
	for(i =0; i<n; i++)
		if(a[i]%2==0)
		{
			b[k]=a[i];
			k++;
}
	return k;
}

// tinh trung binh cong cua mang

float tbc(int a[], int n)
{	
	int i,s=0;
	float r;
	for(i=0;i<n;i++)
		s+=a[i];
	r=(float)s/n;
	return r;
}

//tim mot so nguyen có xuat hien trong mang hay khong



//Ham main
void main()
{
	int x[10], y[10], a, n;
	float p;
	nhapMang(x, 5);
	inMang(x, 5);
	a = soLonNhat(x, 5);
	printf("So lon nhat cua mang la %d \n", a);
	n = taoMang(x, 5, y);
	printf("Mang cac so chan la:",n);
	inMang(y,n);
	p = tbc(x,5);
	printf("\n trung binh cong la %f",p);
	
}



