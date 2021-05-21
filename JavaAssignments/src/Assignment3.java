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
    public void pingHostIpAddress() {
        try {
            List<Double> pings = new ArrayList<>();
            Process process = Runtime.getRuntime().exec("ping " + ipAddress);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String stream = "";
            // reading output stream of the command
            while ((stream = inputStream.readLine()) != null) {
                //System.out.println(stream);
                if(stream.startsWith("PING")) {
                    continue;
                }
                //calculating median for odd and even values
                calculateMedian(stream,pings);
                double med1 = pings.get(pings.size()/2);

                if(pings.size() % 2 == 0) {
                    double med2 = pings.get((pings.size()/2) - 1);
                    System.out.println("Median :" + (med1 + med2)/2);
                }
                else {
                    System.out.println("Median :" + med1);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void calculateMedian(String stream,List<Double> list) {
        String temp[] = stream.split("time=");
        double time = Double.parseDouble(temp[1].substring(0,temp[1].length() - 3));
        list.add(time);
        Collections.sort(list);
    }

}
public class Assignment3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the IP address of the host inorder to ping : ");
        String ipAddress = sc.nextLine();

        PingHost pingHost = new PingHost(ipAddress);
        pingHost.pingHostIpAddress();
    }
}

