package chainOfResponsibilityPattern;

public abstract class LeaveHandler {

	public LeaveHandler supervisor;
	
	public void setSupervisor(LeaveHandler handler) {
		this.supervisor = handler;
	}
	
	public abstract String applyLeave(Leave leave);
	
}
