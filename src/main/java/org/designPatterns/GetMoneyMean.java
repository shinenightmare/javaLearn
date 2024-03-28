package org.designPatterns;

import org.designPatterns.pck1.MoneyTest;
import org.designPatterns.pck1.PaperMoney;

public class GetMoneyMean {
    public static void main(String[] args) {
        for(PaperMoney paperMoney:PaperMoney.values()){
            System.out.println(paperMoney+" ordinal:"+paperMoney.ordinal());
        }
        MoneyTest moneyTest=new MoneyTest(PaperMoney.one_hundred_yuan);
        moneyTest.selectMoney();
    }
}
