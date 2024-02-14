package chainOfResponsibilityPattern;

public class HR extends LeaveHandler {

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getNumberOfDays() <= 21) {
			if(leave.getEmpTire() <= 3 && !leave.getLeaveType().equals(LeaveType.REGULAR)) {
				return "Approved: HR";
			}
			else {
				return "your tire is low for the request: HR " + leave.getNumberOfDays();
			}
		}
		else {
			return "denied by HR";
		}
		
	}

}
