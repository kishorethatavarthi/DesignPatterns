package com.learnings.chainofresponsibility;

public class ChainOfResponsibilityMain {
  public static void main(String[] args) {
	Approver supervisor = new Supervisor();
	Approver manager = new Manager();
	Approver director = new Director();
	supervisor.setNextApprover(manager);
	manager.setNextApprover(director);
	
	supervisor.processLeaveRequest(2);
	supervisor.processLeaveRequest(9);
	supervisor.processLeaveRequest(15);
	supervisor.processLeaveRequest(20);
}
}
