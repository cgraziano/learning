package stopwatch;

import timer.Timer;

import java.util.Date;

public class Stopwatch implements Timer {
  private long startTime;
  private long stopTime;

  public void startTime() {
    startTime = System.currentTimeMillis();
  }

  public void stopTime() {
    stopTime = System.currentTimeMillis();
  }

  public void resetTime() {
    setStartTime(0L);
    setStopTime(0L);
  }

  public long getTime() {
    return getStopTime() - getStartTime();
  }

  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }

  public long getStopTime() {
    return stopTime;
  }

  public void setStopTime(long stopTime) {
    this.stopTime = stopTime;
  }
}
