package org.designPatterns.pck1;

public class MoneyTest {
    PaperMoney paperMoney;
    public MoneyTest(PaperMoney paperMoney){
        this.paperMoney=paperMoney;
    }
    public void selectMoney(){
        switch (paperMoney){
            case one_yuan:
                System.out.println("this is the lowest yuan");
                break;
            case two_yuan:
                System.out.println("this is out of market");
                break;
            case five_yuan:
                System.out.println("this is also out of market");
                break;
            case ten_yuan:
                System.out.println("this is no."+paperMoney.ordinal());
                break;
            case twenty_yuan:
                System.out.println("this is twenty_yuan");
                break;
            case fifty_yuan:
                System.out.println("this is fifty_yuan!");
                break;
            case one_hundred_yuan:
                System.out.println("this is the red one");
                break;
            default:
                System.out.println("go worry!");
        }
    }}
