package model.service;

import model.entities.Contract;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	private void processContract (Contract contract, Integer months);
	
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	
	public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
		
	public void processContract (Contract contract, int month ) {
		
		for (int i=1 ; i <= months; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
		}
		
	}
	
		
		
		
		
		
		
	}
	
	


	
	
	
	

}
