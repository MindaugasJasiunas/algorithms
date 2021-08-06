public class Clock {
    // 12 hours 360 - 360/12= 30deg/hour = 0.5deg/min
    // 60 min's 360 - 360/60= 6deg/minute

    /**
     * Method that returns smallest angle between hour and minute hands
     *
     * @param hour   clock hour 0-23
     * @param minute clock minute 0-59
     * @return smallest angle between hour and minute hands in double format OR -1 if invalid input
     */
    public double getSmallestAngleBetweenClockHands(int hour, int minute) {
        if (hour > 23 || hour < 0 || minute > 59 || minute < 0) {
            return -1; //invalid input
        }
        if (hour > 12) {
            hour -= 12;  //get 12hour format
        }

        double hourDegrees = (hour * 30) + (0.5 * minute);
        double minuteDegrees = minute * 6;
        double angle = minuteDegrees - hourDegrees;
        if (angle < 0) {
            angle *= -1;
        }
        if (angle > 180) {
            angle = 360 - angle;  //get smallest degrees between
        }
        return angle;
    }
}
