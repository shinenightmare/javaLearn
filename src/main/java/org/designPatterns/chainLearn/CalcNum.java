package org.designPatterns.chainLearn;

public class CalcNum extends CheckHandle{
    @Override
    public Integer backResult(String id, int a, int b) {
        switch (id){
            case "add":
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return a+b;
            case "sub":
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return a-b;
            case "pls":
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return a*b;
            case "div":
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return a/b;
            default:
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return 0;
        }
    }
}
