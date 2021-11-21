package com.refactor.bootcamp.long_parameter_list.example_2;

public class LongParameterListExample2 {


    private HeatingPlan plan;

    public LongParameterListExample2(HeatingPlan plan) {
        this.plan = plan;
    }

    public boolean isWithinPlan(int low, int high) {
        boolean withinPlan = plan.withinRange(low, high);
        return withinPlan;
    }

    public static class HeatingPlan {
        private final DaysTempRange daysTempRange;

        public HeatingPlan(DaysTempRange daysTempRange) {
            this.daysTempRange = daysTempRange;
        }

        public boolean withinRange(int low, int high) {
            if (low > daysTempRange.getLow() && high < daysTempRange.getHigh()) {
                return true;
            }
            return false;
        }
    }
}
