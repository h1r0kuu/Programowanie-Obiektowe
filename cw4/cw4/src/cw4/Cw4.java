package cw4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;


public class Cw4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int columns = 2;
		int[][] calendarArray = new int[days][columns];
		int day = 0;
		
		for(int i = 0; i < days; i++) {
			for(int j = 0; j < columns; j++) {
				if(j == 0) {
					calendarArray[i][j] = ++day;
				} else {
					LocalDate localDate = LocalDate.of(calendar.get(Calendar.YEAR),
													   calendar.get(Calendar.MONTH) + 1,
													   calendarArray[i][0]);
					DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
					if(dayOfWeek == DayOfWeek.MONDAY) {
						calendarArray[i][1] = 5;
					} else if(dayOfWeek == DayOfWeek.TUESDAY) {
						calendarArray[i][1] = 3;
					} else if(dayOfWeek == DayOfWeek.THURSDAY) {
						calendarArray[i][1] = 4;
					} else if(dayOfWeek == DayOfWeek.FRIDAY) {
						calendarArray[i][1] = 6;
					}
				}
			}
		}
		
		for(int i = 0; i < days; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print( calendarArray[i][j] + " ");
			}
			System.out.print('\n');
		}
	}
}
