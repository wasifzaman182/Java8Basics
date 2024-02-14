package chainOfResponsibilityPattern;

public class Leave {

	int numberOfDays;
	int empTire;
	private LeaveType leaveType;

	
	public Leave() {
		// TODO Auto-generated constructor stub
	}
	

	public Leave(int numberOfDays, int empTire, LeaveType leaveType) {
		super();
		this.numberOfDays = numberOfDays;
		this.empTire = empTire;
		this.leaveType = leaveType;
	}


	public int getNumberOfDays() {
		return numberOfDays;
	}


	public int getEmpTire() {
		return empTire;
	}


	public LeaveType getLeaveType() {
		return leaveType;
	}

	
	
	
}
