package com.learnings.chainofresponsibility;

public abstract class Approver {
   Approver nextApprover;
   
   public void setNextApprover(Approver nextApprover) {
	   this.nextApprover = nextApprover;
   }
   
   abstract void processLeaveRequest(int numberOfLeaves);
}
