package CreationalDesignPatterns.Prototype;
import java.lang.Cloneable;
public class ServiceProvider implements Cloneable{

    private String serviceProviderName, area;

    public ServiceProvider(String serviceProviderName, String area){
        this.serviceProviderName = serviceProviderName;
        this.area = area;
    }

    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String serviceRequired) {
        this.area = area;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
