
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekCount = new int[] {0, 2, 5, 3, 7, 8, 4};
        return lastWeekCount;
    }

    public int getToday() {
        int lastIndex = birdsPerDay.length - 1;
        return (birdsPerDay.length != 0) ? birdsPerDay[lastIndex] : 0;
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) {
            int currentCount = getToday();
            int lastIndex = birdsPerDay.length - 1;

            birdsPerDay[lastIndex] = currentCount + 1;
        }
    }

    public boolean hasDayWithoutBirds() {
        for (int birdCount : birdsPerDay) {
            if (birdCount == 0) {
                return true;
            }
        }
        return false;   
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumOfBirdsPerDay = 0;

        for (int i = 0; i < numberOfDays; i++) {
            if (i >= birdsPerDay.length) {
                break;
            }
            sumOfBirdsPerDay = sumOfBirdsPerDay + birdsPerDay[i];
        }
        return sumOfBirdsPerDay;
    }

    public int getBusyDays() {
        int busyDayCount = 0;

        for (int birdCount : birdsPerDay) {
            if (birdCount >= 5) {
                busyDayCount++;
            }
        }

        return busyDayCount;
    }
}
