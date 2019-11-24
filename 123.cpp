#include <iostream>
#include <stdlib.h>
#define list_init_size 100
#define listincrement 10
#define elemtype int
#define Status int
#define TRUE        1
#define FALSE       0
#define OK          1
#define ERROR       0
#define INFEASIBLE -1
#define OVERFLOW   -2
using namespace std;
typedef struct
{
    elemtype *elem;
    int length;
    int listsize;
}Sqlist;


Status initlist_sq(Sqlist &L)//初始化
{
    L.elem=(elemtype *)malloc(list_init_size*sizeof(elemtype));
    if(!L.elem)
       exit(OVERFLOW);
    L.length=0;
    L.listsize=list_init_size;
    return OK;
}

Status listinsert_sq(Sqlist &L,int i,elemtype e)//插入元素
{
    elemtype *p ,*q;
    if(i<1||i>L.length+1)
        return ERROR;
    if(L.length>=L.listsize)
    {
    elemtype *newbase = (elemtype*)realloc(L.elem,(L.listsize + listincrement)*sizeof(elemtype));
    if(!newbase)
            exit(OVERFLOW);
        L.elem=newbase;
        L.listsize +=listincrement;
    }
    q=&(L.elem[i-1]);
    for(p=&(L.elem[L.length-1]);p>=q;--p)
        *(p+1)=*p;
    *q=e;
    ++L.length;
    return OK;
}

Status listdelete_sq(Sqlist &L,int i,elemtype &e)//删除元素
{
    elemtype *p ,*q;
    if((i<1)||(i>L.length))
        return ERROR;
    p=&(L.elem[i-1]);
    e=*p;
    q=L.elem+L.length-1;
    for(++p;p<=q;++p)
        *(p-1)=*p;
    --L.length;
    return OK;
}

Status getelem_sq(Sqlist L,int i,elemtype &e)//读取元素
{
	if(L.length==0||i<1||i>L.length)
		return ERROR;
    e=*(L.elem+i-1);
    return OK;
}

Status getmax_sq(Sqlist L,int i,elemtype &e)//最大值
{
    if(L.length==0||i<1||i>L.length)
		return ERROR;
		elemtype *last;
		e=*L.elem;
		last=L.elem+L.length-1;
		while(L.elem!=last)
        {
            if(*L.elem>e)
            e=*(L.elem);
            L.elem++;
        }
    return OK;
}


Status getmini_sq(Sqlist L,int i,elemtype &e)//最小值
{
    if(L.length==0||i<1||i>L.length)
		return ERROR;
		elemtype *last;
		e=*L.elem;
		last=L.elem+L.length-1;
		while(L.elem!=last)
        {
            if(*L.elem<e)
            e=*(L.elem);
            L.elem++;
        }
    return OK;
}

Status locateelem_Sq(Sqlist L, elemtype e,Status (*compare)(elemtype,elemtype))//查找元素
{
	int i=1;
    elemtype *p;
	p=L.elem;
	while(i<=L.length&&!(*compare)(*p++,e)) ++i;
	if(i<=L.length) return i;
	else return 0;
	while(i<=L.length)
	{
		if((*compare)(e,L.elem[i-1]))
		{
			return i;
		}
		i++;
	}
	return 0;
}

Status compare_sq(elemtype e1,elemtype e2)//比较
{
	if(e1==e2) return TRUE;
	else return FALSE;
}

void mergelist_sq(Sqlist La,Sqlist Lb,Sqlist &Lc)//合并
{
    elemtype *pa,*pb,*pc,*pa_last,*pb_last;
    pa=La.elem;
    pb=Lb.elem;
    Lc.listsize=Lc.length=La.length+Lb.length;
    pc=Lc.elem=(elemtype *)malloc(Lc.listsize*sizeof(elemtype));
    if(!Lc.elem)
        exit(OVERFLOW);
    pa_last=La.elem+La.length-1;
    pb_last=Lb.elem+Lb.length-1;
    while(pa<=pa_last&&pb<=pb_last)
    {
        if(*pa<=*pb)
            *pc++=*pa++;
        else *pc++=*pb++;
    }
    while(pa<=pa_last)
        *pc++=*pa++;
    while(pb<=pb_last)
        *pc++=*pb++;
}

void listreverse_sq(Sqlist &L)//表元素逆置
{
    int i=0,j=L.length-1;
    elemtype temp=0;
    while(i<j)
    {
      temp=L.elem[i];
      L.elem[i]=L.elem[j];
      L.elem[j]=temp;
      i++;
      j--;
    }
}

void listsort_sq(Sqlist &L)//起泡法排序
{
      elemtype t=0;
    for(int i=0;i<L.length-1;i++)
        for(int j=0;j<L.length-1-i;j++)
            if(L.elem[j]>L.elem[j+1])
            {
                t=L.elem[j];
                L.elem[j]=L.elem[j+1];
                L.elem[j+1]=t;
            }
}

void  listput_sq(Sqlist &L,int n)//顺序表的定义算法
{
     cout<<"请依次输入顺序表中要储存的"<<n<<"个元素："<<endl;
    for(int i=0;i<n;i++)
    {
    cin>>L.elem[i];
    L.length++;
    }
}

void  listout_sq(Sqlist &L)//顺序表的定义算法
{
    for(int i=0;i<L.length;i++)
    {
    cout<<L.elem[i]<<" ";
    }
}





int main()
{
    Sqlist L1,L2,L3;
    initlist_sq(L1);
    initlist_sq(L2);
    listput_sq(L1,10);
    listput_sq(L2,5);
    mergelist_sq(L1,L2,L3);
    listsort_sq(L3);
    listout_sq(L3);
    return 0;
}
