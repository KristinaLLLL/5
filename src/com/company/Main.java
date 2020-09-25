package com.company;

import java.util.Scanner;

public class Main {
public static int namRec(int n){
    if (n!=0){
        System.out.print(n%10+" ");
        n=n/10;
        return namRec(n);
    }
    else return 1;
}

public static int SumMax (int x, int a1){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    if (a!=0){
        if (a>=a1){
            if (a1==a){
                x++;
            }
            a1=a;
        }
        return SumMax(x, a1);
    }
    else
    return x;
}
    public static int Max (int a1){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if (a!=0){
            if (a>=a1){
                a1=a;
            }
            return Max(a1);
        }
        else
            return a1;
    }

    public static void main(String[] args) {
        int n=123456789;
	    if (n!=0){
	    n=namRec(n);
        };
        System.out.println(SumMax(1,-1));
        System.out.println(Max(-1));
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();

    }
}
