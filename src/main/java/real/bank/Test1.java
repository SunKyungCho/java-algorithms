package real.bank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public int solution(String[] ledgers) {

        List<Record> income = new ArrayList<>();
        int resultInterest = 0;
        for (String ledger : ledgers) {
            String[] split = ledger.split(" ");
            LocalDate date = LocalDate.of(0001, Integer.parseInt(split[0].substring(0, 2)), Integer.parseInt(split[0].substring(3, 5)));
            Integer interestRate = Integer.valueOf(split[1]);
            Integer money = Integer.valueOf(split[2]);

            if (money > 0) {
                income.add(new Record(date, interestRate, money));
            } else {
                int getMoney = Math.abs(money);
                while (getMoney != 0) {
                    Record record = income.get(income.size() - 1);
                    if (record.isEmpty()) {
                        income.remove(income.size() - 1);
                        continue;
                    }
                    MoneyBack moneyBack = record.withdraw(date, getMoney);
                    resultInterest += moneyBack.getInterest();
                    System.out.println(moneyBack.getInterest());
                    getMoney -= moneyBack.getMoney();
                }
            }
        }

        if (!income.isEmpty()) {
            for (Record record : income) {
                MoneyBack moneyBack = record.findAll(LocalDate.of(0001, 12, 31));
                resultInterest += moneyBack.getInterest();
                System.out.println(moneyBack.getInterest());
            }
        }
        return resultInterest;
    }


    static class Record {

        private final LocalDate date;
        private final float interestRate;
        private int money;

        public Record(LocalDate date, int interestRate, int money) {
            this.date = date;
            this.interestRate = (float) interestRate / 100;
            this.money = money;
        }

        public MoneyBack withdraw(LocalDate findDate, int getMoney) {
            long periodDays = ChronoUnit.DAYS.between(date, findDate);
            if (getMoney >= money) {
                int interest = (int) ((money * interestRate) * periodDays) / 365;
                MoneyBack moneyBack = new MoneyBack(money, interest);
                money = 0;
                return moneyBack;
            } else {
                money -= getMoney;
                int interest = (int) ((getMoney * interestRate) * periodDays) / 365;
                return new MoneyBack(getMoney, interest);
            }
        }

        public MoneyBack findAll(LocalDate findDate) {
            long periodDays = ChronoUnit.DAYS.between(date, findDate);
            int interest = (int) ((money * interestRate) * periodDays) / 365;
            return new MoneyBack(money, interest);
        }

        public boolean isEmpty() {
            return money == 0;
        }
    }

    static class MoneyBack {
        private final int money;
        private final int interest;

        public MoneyBack(int money, int interest) {
            this.money = money;
            this.interest = interest;
        }

        public int getMoney() {
            return money;
        }

        public int getInterest() {
            return interest;
        }
    }

}
