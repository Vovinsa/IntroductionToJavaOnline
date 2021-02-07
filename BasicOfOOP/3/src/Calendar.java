import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class Calendar {

    private final Set<MonthDay> monthDays = new HashSet<>();
    Holidays holidays;

    public Calendar() {
        this.holidays = new Holidays();
    }

    public void addHoliday(final MonthDay monthDay) {
        monthDays.add(monthDay);
    }

    public void showWeekendAndHolidayBetween(final LocalDate startInclusive, final LocalDate endInclusive){
        System.out.println("Total weekends and holidays: " + holidays.numberOfWeekendAndHolidayBetween(startInclusive, endInclusive));
        for (LocalDate i = startInclusive; !i.isAfter(endInclusive); i = i.plusDays(1)) {
            if (holidays.isHoliday(i)) {
                System.out.println(i + "  " + i.getDayOfWeek());
            }
        }
    }

    private class Holidays {

        public boolean isWeekend(final LocalDate localDate) {
            final DayOfWeek dayOfWeek = localDate.getDayOfWeek();

            return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
        }

        public int numberOfWeekendAndHolidayBetween(final LocalDate startInclusive, final LocalDate endInclusive) {
            int c = 0;
            for (LocalDate i = startInclusive; !i.isAfter(endInclusive); i = i.plusDays(1)) {
                if (isHoliday(i)) {
                    c++;
                }
            }
            return c;
        }

        public boolean isHoliday(final LocalDate localDate) {
            return isWeekend(localDate) || monthDays.contains(toMonthDay(localDate));
        }

        public MonthDay toMonthDay(LocalDate localDate) {
            return MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
        }

    }
}
