#include <stdio.h>
#include <conio.h>
#include <string.h>
int SoSanh(long n);
main()
{
	FILE *f1, *f2;
	int n,i;
	long so;
	f1 = fopen("D:\\Dinh Thi Hanh Trang k41C\\test1.2.txt" , "r");
	f2 = fopen("D:\\Dinh Thi Hanh Trang k41C\\ketqua1.2.txt" , "w");
	fscanf(f1, "%d", &n);
	for (i=0; i<n; i++)
	{
		fscanf(f1, "%ld", &so);
		if (SoSanh(so)==1)
			fprintf(f2, "%s\n", "YES");
		else
			fprintf(f2, "%s\n", "NO");
	}	
}
int SoSanh(long n){
	int du, dau, cuoi ;
	cuoi = n % 10;
	while(n != 0)
	{
		du = n%10;
		n = n/10;
		dau = du;
	}
	if(dau == cuoi)
		return 1;
	return 0;
}
