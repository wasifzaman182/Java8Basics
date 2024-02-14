package chainOfResponsibilityPattern;

public class ProjectLeader extends LeaveHandler{

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getNumberOfDays() <= 14) {
			if(leave.getEmpTire() <=3) {
				return "Leave is approved";
			}
			else {
				return "your employe tire is low for the request :PL " + leave.getNumberOfDays();
			}
		}
		else {
			return supervisor.applyLeave(leave);
		}
	}

}
