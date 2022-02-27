class Main {

    public static void main(String[] args) {
        int attribute = 10;
        MyNumber myNumber = new MyNumber(attribute);
        System.out.println("Now isOdd");
        System.out.println(myNumber.isOdd(2));
        System.out.println(myNumber.isOdd(3));
        System.out.println(" ");
        System.out.println("Now isEven");
        System.out.println(myNumber.isEven(1));
        System.out.println(myNumber.isEven(2));
        System.out.println(" ");
        System.out.println("Now isSqrt");
        System.out.println(myNumber.sqrt(4));
        System.out.println(myNumber.sqrt(16));
        System.out.println(" ");
        System.out.println("Now isPow");
        System.out.println(myNumber.pow(4));
        System.out.println(myNumber.pow(16));
        System.out.println(" ");
        System.out.println("Now isAdd");
        System.out.println(myNumber.add(4));
        System.out.println(myNumber.add(16));
        System.out.println(" ");
        System.out.println("Now isSubstract");
        System.out.println(myNumber.subtract(4));
        System.out.println(myNumber.subtract(16));
    }
}
