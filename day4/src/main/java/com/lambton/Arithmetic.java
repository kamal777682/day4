package com.lambton;

public class Arithmetic {


        public int add(int a,int b)
        {
            int Sum = a+b;
            return Sum;
        }
        public float add( float a,float b)
        {
            float Sum = a+b;
            return Sum;
        }
        public String add( String s1, String s2)
        {
            return s1+s2;
        }
        public String add( String a, int b )
        {
            return a+b;
        }
    public String add( int a, String b )
    {
        return a+b;
    }
    public int add(int a,int b ,int c)
    {

        return a+b+c ;
    }
    public float add( float a, float b, float c)
    {
        return a+b+c;
    }
    public float add ( int a, int b, float c)
    {
        return ((float) add(a,b)+c);
    }
    public float add( float a, int b)
    {
        return a+(float)b;
    }
    public float add( float a, int b,int c )
    {
        return a+(float(add(b,c)));
    }

}
