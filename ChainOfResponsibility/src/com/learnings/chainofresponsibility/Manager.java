package com.learnings.chainofresponsibility;

public class Manager extends Approver{

	@Override
	void processLeaveRequest(int numberOfLeaves) {
		if(numberOfLeaves <= 10) {
			System.out.println("Manager the request");
		}else if(nextApprover != null) {
			nextApprover.processLeaveRequest(numberOfLeaves);
		}else {
			System.out.println("No one able to approve leaves talk with Hr");
		}
		
	}

}
