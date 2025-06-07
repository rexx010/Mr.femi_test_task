import java.time.LocalDate;
public class MentrualAppFunction{

public static LocalDate begin(int year, int month, int day){
LocalDate start = LocalDate.of(year, month, day);
return start;
}

public static String flowDate(int year, int month, int day){
LocalDate start = LocalDate.of(year, month, day);
LocalDate stop = start.plusDays(5);
return "your flow starts on the "+start+"\n it ends on the "+stop;
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

public static String fertileLength(int year, int month, int day, int cycle){
LocalDate started = LocalDate.of(year, month, day);
LocalDate ended = started.plusDays(cycle);
LocalDate ferileStart = ended.minusDays(21);
LocalDate ferileEnd = ended.minusDays(12);
return "your fertility starts on the "+ferileStart+"\n it ends on the "+ferileEnd;
}

public static String safeperiod(int year, int month, int day, int cycle){
LocalDate started = LocalDate.of(year, month, day);
LocalDate ended = started.plusDays(cycle);
LocalDate ferileStart = ended.minusDays(21);
LocalDate ferileEnd = ended.minusDays(12);
return "All days are safe to have fun excluding days within "+ferileStart+" and "+ferileEnd;
}






}
