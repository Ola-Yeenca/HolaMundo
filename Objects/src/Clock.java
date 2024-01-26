public class Clock {
    double hours;
    double minutes;
    double seconds;

    public Clock() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public String getTime() {
        return String.format("%02.0f:%02.0f:%02.0f",this.hours, this.minutes, this.seconds );
    }

    public String getFormattedTime() {
        if (this.hours >= 0 && this.hours <= 11) {
            return String.format("%02f:%02f:%02f AM", this.hours, this.minutes, this.seconds);
        } else {
            return String.format("%02f:%02f:%02f PM", this.hours - 12, this.minutes, this.seconds);
        }
    }

    public void set24HoursClock(double hours, double minutes, double seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void specificTime(double hours, double minutes) {
        this.seconds = 0;

        this.hours = hours;
        this.minutes = minutes;
    }


}
