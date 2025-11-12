package com.learnings.chainofresponsibility;

public class Supervisor extends Approver{

	@Override
	void processLeaveRequest(int numberOfLeaves) {
		if(numberOfLeaves <= 3) {
			System.out.println("Supervisor the request");
		}else if(nextApprover != null) {
			nextApprover.processLeaveRequest(numberOfLeaves);
		}else {
			System.out.println("No one able to approve leaves talk with Hr");
		}
		
	}

}
