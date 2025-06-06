import java.time.LocalDate;
public class MentrualAppFunction{

public static LocalDate begin(int year, int month, int day){
LocalDate start = LocalDate.of(year, month, day);
return start;
}

public static LocalDate finish(int year, int month, int day, int cycle){
LocalDate check = LocalDate.of(year, month, day);
LocalDate end = check.plusDays(cycle);
return end;
}

public static String ovulation(int year, int month, int day, int cycle){
LocalDate starting = LocalDate.of(year, month, day);
LocalDate ending = starting.plusDays(cycle);
LocalDate ovuStart = ending.minusDays(16);
LocalDate ovuEnd = ending.minusDays(12);
return "your ovulation starts on the "+ovuStart+"\n it ends on the "+ovuEnd;
}

}
