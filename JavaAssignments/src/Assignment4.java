/*
 * Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC )
 * which has to be filled annually. Each form has a date which signifies the date the form was filled called the form date.
Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer. When filling it
up, you have to provide the form date. If you are past the +-30 day anniversary then you can back-date it so that
 it falls in the +-30-day window. When filling it up you cannot use a future date for the form date.
For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this year would be 30 Jan 2017
to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to a date in this range.
Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then your first anniversary will be 01-02-1993, the 2nd
will be 01-02-1994 and so on. 01-02-1992 is not an anniversary.
Given the signup date and the current date, provide the allowable date range for the form date.
Input - First line is an integer n as the number of inputs to be passed. Next, n lines are n input for the program in the format dd-mm-yyyy
dd-mm-yyyy Each line has two dates separated by space where the first date in signup date and the second date is the current date.
Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy
Test Input:
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016
Test output:
16-06-2017 27-06-2017
05-01-2017 06-03-2017
No range
05-03-2016 04-04-2016
05-03-2016 15-03-2016
 */

import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

 class KYCForm{
    Date signUpDate,currentDate;
    public void dateRange(String signUp, String currDateInput) {
        Date startDate = null;
        Date endDate = null;
        try {
            boolean flag = true;
            //Use SimpleDateFormat to convert string to date

            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = dateFormatter.parse(signUp);
            currentDate = dateFormatter.parse(currDateInput);

            //Invalid input check
            Calendar calendarTemp = Calendar.getInstance();
            calendarTemp.setTime(signUpDate);
            calendarTemp.add(Calendar.DATE, 364);
            Date tempDate = calendarTemp.getTime();

            if(signUpDate.after(currentDate)) {
                System.out.println("No range");
                flag = false;
            }
            else if(!currentDate.after(tempDate)) {
                System.out.println("No range");
                flag = false;
            }
            else {
                startDate = signUpDate;
                //Creating a calendar object
                Calendar calendar = Calendar.getInstance();
                //startDate is equal to current date
                calendar.setTime(startDate);
                //Addition of 60 days
                calendar.add(Calendar.DATE, 60);
                endDate = calendar.getTime();
                //Subtraction of 30 days
                calendar.add(Calendar.DATE, -30);
                startDate = calendar.getTime();
                //if endDate is after the currentDate make endDate as currentDate
                if(endDate.after(currentDate)) {
                    endDate = currentDate;
                }
            }
            //Converting date objects to strings
            if(flag) {
                System.out.println(dateFormatter.format(startDate) + " " + dateFormatter.format(endDate));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        KYCForm kycForm = new KYCForm();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end dates with a space and enter the word exit to stop");
        while(true) {
            String dates[] = sc.nextLine().split(" ");
            if(dates[0].toLowerCase().equals("exit")) {
                System.out.println("Exit");
                break;
            }
            String signupDate = dates[0];
            String currentDate = dates[1];
            kycForm.dateRange(signupDate, currentDate);
        }
//		kycForm.findRange("16-07-1998", "27-06-2017");
//		kycForm.findRange("04-02-2016", "04-04-2017");
    }

}
