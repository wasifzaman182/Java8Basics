package chainOfResponsibilityPattern;

public class ChainResponsibilityMain {

	public static void main(String[] args) {
		
		TeamLeader t = new TeamLeader();
		ProjectLeader p = new ProjectLeader();
		HR r = new HR();
		
		
		t.setSupervisor(p);
		p.setSupervisor(r);
		
		Leave leave1 = new Leave(5,4, LeaveType.REGULAR);
        System.out.println(t.applyLeave(leave1));

        Leave leave2 = new Leave(5,5, LeaveType.REGULAR);
        System.out.println(t.applyLeave(leave2));

        Leave leave3 = new Leave(12,3, LeaveType.REGULAR);
        System.out.println(t.applyLeave(leave3));

        Leave leave4 = new Leave(18,2, LeaveType.CRITICAL);
        System.out.println(t.applyLeave(leave4));

        Leave leave5 = new Leave(18,2, LeaveType.REGULAR);
        System.out.println(t.applyLeave(leave5));

        Leave leave6 = new Leave(30,2, LeaveType.SPECIAL);
        System.out.println(t.applyLeave(leave6));
				
	}
}
