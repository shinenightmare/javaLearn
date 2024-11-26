package org.designPatterns.behaviorPattern.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        /*先设置责任链，在设置参数
        **/
        ReimbursementHandler manager = new ManagerHandler();
        ReimbursementHandler departmentHead = new DepartmentHeadHandler();
        ReimbursementHandler finance = new FinanceHandler();

        manager.setSuccessor(departmentHead);
//        manager.setSuccessor(finance);
        departmentHead.setSuccessor(finance);
        ReimbursementRequest request1 = new ReimbursementRequest(800, "购买办公用品");
        ReimbursementRequest request2 = new ReimbursementRequest(3000, "参加培训");
        ReimbursementRequest request3 = new ReimbursementRequest(10000, "举办团建活动");

        manager.handleRequest(request1);
        manager.handleRequest(request2);
        manager.handleRequest(request3);
    }
}
