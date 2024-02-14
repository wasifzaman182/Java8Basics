package chainOfResponsibilityPattern;

public class TeamLeader  extends LeaveHandler{

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getNumberOfDays()<= 7) {
			
			if(leave.getEmpTire() <= 4) {
				
				return "Your leave is approved by TeamLeader";
			}
			else {
				return "Your employ tire is low for the request: TL " + leave.getNumberOfDays();
			}
		}
		else {
			return supervisor.applyLeave(leave);
		}
		
	}

}
