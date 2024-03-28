package org.designPatterns.chainOfResponsibility;

public class FinanceHandler extends ReimbursementHandler{
    @Override
    public void handleRequest(ReimbursementRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("财务部门处理报销请求：" + request.getDescription());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
