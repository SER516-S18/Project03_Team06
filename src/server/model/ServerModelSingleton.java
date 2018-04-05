package server.model;

import server.helper.ServerConstants;

public class ServerModelSingleton {
	private static volatile ServerModelSingleton serverDataSingleton;
	private static Object mutex = new Object();
	private FaceData faceData = new FaceData();
	private  boolean autoReset = ServerConstants.AUTO_RESET;
	private double stateInterval= ServerConstants.STATE_INTERVAL;
	private boolean oneTimeSend = ServerConstants.ONE_TIME_SEND;
	
	public  double getStateInterval() {
		return stateInterval;
	}

	public boolean isOneTimeSend() {
		return oneTimeSend;
	}

	public void setOneTimeSend(boolean oneTimeSend) {
		this.oneTimeSend = oneTimeSend;
	}

	public  void setStateInterval(double stateInterval) {
		this.stateInterval = stateInterval;
	}

	public boolean isAutoReset() {
		return autoReset;
	}

	public  void setAutoReset(boolean autoReset) {
		this.autoReset = autoReset;
	}

	public static ServerModelSingleton getInstance() {
		ServerModelSingleton result = serverDataSingleton;
		if (result == null) {
			synchronized (mutex) {
				result = serverDataSingleton;
				if (result == null)
					result = new ServerModelSingleton();
				serverDataSingleton = result;
			}
		}
		return result;
	}

	public FaceData getFaceData() {
		return faceData;
	}

	public void setFaceData(FaceData faceData) {
		this.faceData = faceData;
	}


}