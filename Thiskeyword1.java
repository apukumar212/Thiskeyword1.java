package com.pack1;

public class Thiskeyword1 
{
int a=100;
static int b=200;
void meth1()
{
	int a=55;
	int b=65;
	System.out.println("Instance variable a:"+this.a);
	System.out.println("Static variable b:"+Thiskeyword1.b);
	System.out.println("Static variable b:"+this.b);
	System.out.println(a+b);
}
public static void main(String[] args) 
{
new Thiskeyword1().meth1();	
}
}
