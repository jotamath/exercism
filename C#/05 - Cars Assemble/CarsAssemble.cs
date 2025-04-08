static class AssemblyLine
{
    public static double SuccessRate(int speed)
    {
        if (speed == 0) return 0.0;
        if (speed <= 4) return 1.0;
        if (speed <= 8) return 0.9;
        if (speed == 9) return 0.8;
        if (speed == 10) return 0.77;
        return 0.0;
    }
    
    public static double ProductionRatePerHour(int speed)
    {
        double successRate = SuccessRate(speed);
        return speed * 221.0 * successRate;
    }

    public static int WorkingItemsPerMinute(int speed)
    {
        double productionRatePerHour = ProductionRatePerHour(speed);
        return (int)(productionRatePerHour / 60.0);
    }
}
