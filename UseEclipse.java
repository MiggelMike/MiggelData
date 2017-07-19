import java.util.Calendar;
import java.util.Date;

public class UseEclipse {
	
	public static void main(String[] args) {
		Calendar datum1 = Calendar.getInstance();
		datum1.set(2017, Calendar.JANUARY, 1);
		Calendar datum2 = Calendar.getInstance();
		datum2.set(2017, Calendar.FEBRUARY, 1);
		System.out.println(Tage(datum1,datum2));
	}
	
	static int Tage(Calendar aDatum1, Calendar aDatum2){
		int mResult = 0;
		int mJahr1 = aDatum1.get(Calendar.YEAR);
		int mJahr2 = aDatum2.get(Calendar.YEAR);
		for (int jahr = mJahr1; jahr < mJahr2; jahr++) {
			int mVonMonat = jahr == mJahr1 ? aDatum1.get(Calendar.MONTH) : Calendar.JANUARY; 
			int mBisMonat = jahr == mJahr2 ? aDatum2.get(Calendar.MONTH) : Calendar.DECEMBER;
			for (int monat = mVonMonat; monat < mBisMonat; monat++) {
				int mTage = 31;
				switch(monat){
				    case Calendar.APRIL:				    	
				    case Calendar.JUNE:
				    case Calendar.SEPTEMBER:
				    case Calendar.NOVEMBER:
				    	mTage = 30;
						break;
					
				    case Calendar.FEBRUARY:
				    	mTage = 28;
				    	if(IsLeapYear(jahr))
				    		mTage++;
				    	break;
				}
				mResult += mTage;
			}	
		}
		return mResult;
	}
	
	static boolean IsLeapYear(int aYear){
		return ((aYear % 4 == 0) && (aYear % 100 != 0) || (aYear % 400 == 0));
	}
}
