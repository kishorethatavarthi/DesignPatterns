package com.learnings.chainofresponsibility;

public class Director extends Approver{

	@Override
	void processLeaveRequest(int numberOfLeaves) {
		if(numberOfLeaves <= 15) {
			System.out.println("Director the request");
		}else if(nextApprover != null) {
			nextApprover.processLeaveRequest(numberOfLeaves);
		}else {
			System.out.println("No one able to approve leaves talk with Hr");
		}
		
	}

}
