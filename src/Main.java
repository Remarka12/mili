public class Main {
    public static void main(String[] args) {
        int price = 2000;  // сумма, потраченная на билет
        int everSpend = 20; // шаг в 20 рублей, начисляющий 1 милю

        int miles = price / everSpend; // количество миль, начисленных за билет
        System.out.println(miles);
    }
}
