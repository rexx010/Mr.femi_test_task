import java.time.LocalDate;
public class MentrualAppFunction{

public static String begin(int year, int month, int day, int cycle){
LocalDate start = LocalDate.of(year, month, day);
String end = finish(start, cycle);

return "Your cycle starts on the "+start+ "\n and ends on the "+end ;
}

public static int finish(LocalDate start, int cycle){
return start.plusDays(cycle);

}
}
