package priv.edward.graduationdesign.util;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class PensionCalculator {

    private float p1;
    private float p2;
    private Date startDate;
    private Date endDate;

    public PensionCalculator() {
    }

    public PensionCalculator(float p1, float p2, Date startDate, Date endDate) {
        this.p1 = p1;
        this.p2 = p2;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public static float calc(float p1, float p2, Integer month) {
        double p = (p1*0.2) + (p2/month);
        BigDecimal b = new BigDecimal(p);
        return b.floatValue();
    }

    public static int getMonthDiff(Date d1, Date d2, Integer retireAge) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        int year1 = c1.get(Calendar.YEAR);
        year1 += retireAge;
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);// 获取年的差值
        int yearInterval = year1 - year2;// 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if (month1 < month2 || month1 == month2 && day1 < day2)
            yearInterval--;// 获取月数差值
        int monthInterval = (month1 + 12) - month2;
        if (day1 < day2)
            monthInterval--;
        monthInterval %= 12;
        int monthsDiff = Math.abs(yearInterval * 12 + monthInterval);
        return monthsDiff;
    }

//    public static int getPensionAge(char staffGender, int ssId) {
//        Calendar c1 = Calendar.getInstance();
//    }

}
