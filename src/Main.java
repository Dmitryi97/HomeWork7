import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача1
        System.out.println("Задача1");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        double contributionMonth = 15000;
        double desiredAmount = 2459000;
        double amountAccumulation = 0;
        double percentageMonth = 0.01;
        int month = 1;
        while (amountAccumulation <= desiredAmount) {
            month++;
            amountAccumulation = amountAccumulation + contributionMonth + (amountAccumulation + contributionMonth) * percentageMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + numberFormat.format(amountAccumulation));
        }
        //Задача2
        System.out.println("Задача2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача3
        System.out.println("Задача3");
        int year = 1;
        int populationContry = 12000000;
        int berthRatePerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        while (year <= 10) {
            int wasBornContryYear = (populationContry / 1000) * berthRatePerThousand;
            int mortalityRateContryYear = (populationContry / 1000) * mortalityPerThousand;
            populationContry = populationContry + wasBornContryYear - mortalityRateContryYear;
            currentYear = currentYear + 1;
            System.out.println("Год " + currentYear + ", численность населения составляет " + populationContry);
            year++;
        }
        //Задача4
        System.out.println("Задача4");
        double initialAmount = 15000;
        percentageMonth = 7;
        month = 1;
        while (initialAmount <= 12000000) {
            initialAmount = initialAmount + (initialAmount * percentageMonth) / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + numberFormat.format(initialAmount));
            month++;
        }
        //Задача5
        System.out.println("Задача5");
        initialAmount = 15000;
        percentageMonth = 7;
        month = 1;
        while (initialAmount <= 12000000) {
            initialAmount = initialAmount + (initialAmount * percentageMonth) / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + numberFormat.format(initialAmount));
            }
            month++;
        }
        //Задача6
        System.out.println("Задача6");
        initialAmount = 15000;
        percentageMonth = 7;
        month = 1;
        int monthsNineYears = 9 * 12;
        while (month <= monthsNineYears) {
            initialAmount = initialAmount + (initialAmount * percentageMonth) / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + numberFormat.format(initialAmount));
            }
            month++;
        }
        //Задача7
        System.out.println("Задача7");
        int firstFriday = 2;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");
        }
        //Задача8
        System.out.println("Задача8");
        currentYear = 2024;
        int periodComet = 79;
        int lastYear = currentYear - 200;
        int subsequentYear = currentYear + 100;
        for (year = lastYear; year <= subsequentYear; year++) {
            if (year % periodComet == 0) {
                System.out.println(year);
            }
        }
    }
}