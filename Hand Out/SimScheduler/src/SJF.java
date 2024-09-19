/**
 * Shortest Job First.
 */
public class SJF implements Scheduler {
	private List<SimProcess> queue;
	private List<Integer> waitingTimes;

	@Override
	public void onProcessArrival(SimProcess p, int time) {
		queue = new ArrayList<SimProcess>();
		waitingTimes = new ArrayList<Integer>();

		// Configure a clock interrupt
//		Clock.ENABLE_INTERRUPT = true;
//		Clock.INTERRUPT_INTERVAL = 50;
	}

	@Override
	public void onProcessExit(SimProcess p, int time) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onClockInterrupt(int timeElapsed, int time) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getAlgorithmName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimProcess currentProcess() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
