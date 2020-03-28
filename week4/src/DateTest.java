
public class DateTest {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(11,12, 2019);
        date1.printDate();
        MyDate.printFormat(date1);

        
        MyDate date2 = new MyDate();
        date2.nhapString();
        MyDate.printFormat(date2);
        
        String[] date =  new String[]{"2020/10/03", "2011/05/02", "2015/11/12"};

        
        System.out.println("Before Sorting: ");
        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }

        DateUtils.sortingDate(date);

        
        System.out.println("After Sorting: ");
        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }
        
    }
}
