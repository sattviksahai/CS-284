package com.cs284;

public class ArrayDivision {
    public static class MyException extends Exception{
        int i;
        public MyException(int n){
            this.i = n;
        }
        public String toString(){
            return ("This is my exception number:"+this.i);
        }
    }

    public static void checkNumerator(int n) throws Exception{
        if (n==6) {
            throw new MyException(n);
        }
    }

    public static void main(String[] args) {
        int numerators[] = {9,8,7,6,5};
        int denominators[] = {1,0,3,2,6};

        for (int i=0; i<5; i++) {
            try {
                checkNumerator(numerators[i]);
                int result = numerators[i]/denominators[i];
                System.out.println(result);
            } catch (ArithmeticException e1) {
                System.out.println("Division by zero is not defined"+e1);
            } catch (Exception e) {
                System.out.println("Any other exception: "+ e);
            } finally {
                // closes the filec
                System.out.println("This should run everytime");
            }
        }
    }
}
