

public interface InterruptVector {

	/**
	 * Method that handles an interrupt representing the arrival of a process.
	 * @param p - Process that just arrived
	 * @param time - time in which the event happened
	 */
	public void onProcessArrival(SimProcess p, int time);
	
	/**
	 * Method that handles an interrupt generated by the end of execution of a process
	 * @param p - Process that just finished execution
	 * @param time - time in which the event happened
	 */
	public void onProcessExit(SimProcess p, int time);
	
	/**
	 * Method that handles an interrupt generated by the clock
	 * @param timeElapsed - Time between
	 * @param time - time in which the event happened
	 */
	public void onClockInterrupt(int timeElapsed, int time);
}