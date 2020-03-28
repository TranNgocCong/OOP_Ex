
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class MyDate {
    private  int ngay,thang,nam;

    public MyDate() {

    }

    public MyDate(int ngay, int thang, int nam) {
        setNgay(ngay);
        setThang(thang);
        setNam(nam);
    }
    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    
    public int setNgay(String ngay) {
        String[] days ={"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentyth", "twenty first", "twenty second", "twenty third", "twenty fourth", "twenty fifth", "twenty sixth", "twenty seventh", "twenty eighth", "twenty ninth", "thirtyth", "thiry first"};
        for (int i = 0; i < days.length; i++)
            if (ngay.equalsIgnoreCase(days[i])) {
                return this.ngay = i + 1;
            }
        return 0;
    }
    
    public int getThang() {
        return thang;
    }
    
    public void setThang(int thang) {
        this.thang = thang;
    }
    
    public int setThang(String thang) {
        String[] monthOfYear ={"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        for (int i = 0; i < monthOfYear.length; i++) {
            if (thang.equalsIgnoreCase(monthOfYear[i])) {
                return this.ngay = i + 1;
            }
        }
        return 0;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    public int setNam(String nam) {
    	switch (nam) {
		case "twenty twenty":
			 return this.nam=2020;
		case "twenty nineteen":
			 return this.nam=2019;
		case "twenty eightteen":
			 return this.nam=2018;
			
		default:
			break;
		}
    	return 0;
    }
 
    public void nhapString() {
        String strNgay, strThang, strNam;
        int iNgay, iThang, iNam;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap ngay: ");
            strNgay = sc.nextLine();
            iNgay = setNgay(strNgay);
        } while (iNgay < 1 || iNgay > 32);

        do {
            System.out.println("Nhap thang: ");
            strThang = sc.nextLine();
            iThang = setThang(strThang);
        } while (iThang < 1 || iThang > 12);

        do {
            System.out.println("Nhap nam: ");
            strNam = sc.nextLine();
            iNam = setNam(strNam);
        } while (iNam < 0);

        setNgay(iNgay);
        setThang(iThang);
        setNam(iNam);
    }
    public void nhapNumber() {
        
        int iNgay, iThang, iNam;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap ngay: ");
             iNgay= sc.nextInt();
             setNgay(iNgay);
        } while (iNgay < 1 || iNgay > 32);

        do {
            System.out.println("Nhap thang: ");
            iThang = sc.nextInt();
            setThang(iThang);
        } while (iThang < 1 || iThang > 12);

        do {
            System.out.println("Nhap nam: ");
            iNam = sc.nextInt();
            setNam(iNam);
        } while (iNam < 0);

        setNgay(iNgay);
        setThang(iThang);
        setNam(iNam);
    }

    public void printDate() {
    	Calendar cal = Calendar.getInstance();
        cal.set(getNam(), getThang() - 1, getNgay());
        String month = new DateFormatSymbols().getMonths()[getThang() - 1];

        String day = "NULL";
        String[] dayOfMonth = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first", "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth", "thiry-first"};
        for (int i = 0; i < dayOfMonth.length; i++) {
            int j = i + 1;
            if (j == getNgay()) {
                day = dayOfMonth[i];
                break;
            }
        }
        System.out.println(day + " " + month + " " + getNam());
    }


    public static void printFormat(MyDate mydate) {
    	LocalDate date1 = LocalDate.of( mydate.getNam() , mydate.getThang() , mydate.getNgay());
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY"); 
        String formatdate1 = formatter.format(date1);
        System.out.println("Dinh dang MM/dd/yyyy: " +formatdate1);

        LocalDate date2 = LocalDate.of( mydate.getNam() , mydate.getThang() , mydate.getNgay());
    	formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); 
        String formatdate2 = formatter.format(date2);
        System.out.println("Dinh dang MM/dd/yyyy: " +formatdate2);
}
}  
    

