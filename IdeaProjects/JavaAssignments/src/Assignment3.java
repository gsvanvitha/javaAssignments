//Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
//Use the system ping utility, do not use any deprecated methods.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PingHost{
    private String ipAddress;

    public PingHost(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /*	Method which uses Runtime class exec() command to run the ping command with the IP address
     * 	provided in the input.
     *  It uses a BufferedReader to read the input stream of bytes and prints the response from the
     *  server which is connected.
     *
     */

    public void pingHostWithIpAddress() {

        try {
            List<Double> pingTimes = new ArrayList<>();

            Process p = Runtime.getRuntime().exec("ping " + ipAddress);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                //System.out.println(s);
                if(s.startsWith("PING")) {
                    continue;
                }
                findMedian(s,pingTimes);
                double num1 = pingTimes.get(pingTimes.size()/2);

                if(pingTimes.size() % 2 == 0) {
                    double num2 = pingTimes.get((pingTimes.size()/2) - 1);
                    System.out.println("Median :" + (num1 + num2)/2);
                }
                else {
                    System.out.println("Median :" + num1);
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findMedian(String s,List<Double> list) {
        String temp[] = s.split("time=");
        //System.out.println(Arrays.toString(temp));
        double time = Double.parseDouble(temp[1].substring(0,temp[1].length() - 3));
        list.add(time);
        Collections.sort(list);
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}
public class Assignment3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the IP address of the host to ping : ");
        String ipAddress = sc.nextLine();

        PingHost pingHost = new PingHost(ipAddress);
        pingHost.pingHostWithIpAddress();
    }
}

