public class WrapperMethodExample {
    public static void main(String[] args){
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("Numero convertido: " + number);
        int num1 = 50;
        int num2 = 20;
        int comparisonResult = Integer.compare(num1, num2);
        System.out.println("comparisonResult: " + comparisonResult);
        if (comparisonResult < 0){
            System.out.println(num1 + " e menor que " + num2);
        }else if (comparisonResult > 0){
            System.out.println(num1 + " e maior que " + num2);
        }else{
            System.out.println(num1 + " e igual a " + num2);
        }
    }
}
