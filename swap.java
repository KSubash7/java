class swap{
    public static void main(String[] args){
        int a=20;
        int b=30;
        System.out.println("The numbers"+a);
        System.out.println("The numbers"+b);
        int c=a+b;
        a=c-a;
        b=c-b;
        System.out.println(+a);
        System.out.println(+b);

    }
}
