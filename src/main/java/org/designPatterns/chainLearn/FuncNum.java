package org.designPatterns.chainLearn;

public class FuncNum extends CheckHandle{
    @Override
    public Integer backResult(String id, int a, int b) {
        switch (id){
            case "add":
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return a*a+b*b;
            case "sub":
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return a*a-b*b;
            case "pls":
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return a*a*b*b;
            case "div":
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return a*a/(b*b);
            default:
                if(this.getNext()!=null){
                    return this.getNext().backResult(id,a,b);
                }
                return 0;
        }

    }
}
