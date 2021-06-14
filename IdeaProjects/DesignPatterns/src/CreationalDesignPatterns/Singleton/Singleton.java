package Singleton;

class Logger {
	private static Logger instance=new Logger();
	private Logger() {
		
	}
	public static Logger getInstance() {
		System.out.println(instance.hashCode());
		return instance;
	}
}

class lazyLogger extends Thread{
	private static lazyLogger instance;
	private lazyLogger() {
		
	}
	public static lazyLogger getInstance() {
		if(instance==null)
			instance=new lazyLogger();
		System.out.println(instance.hashCode());
		return instance;
	}
}

class synchronizedLogger {
	private static synchronizedLogger instance;
	private synchronizedLogger() {
		
	}
	public static synchronized synchronizedLogger getInstance() {
		if(instance==null)
			instance=new synchronizedLogger();
		System.out.println(instance.hashCode());
		return instance;
	}
}

class efficientSynchronizedLogger {
	  private static efficientSynchronizedLogger instance; 
	  
	  private efficientSynchronizedLogger(){}
	  
	  public static efficientSynchronizedLogger getInstance() {
	    if(instance == null) {
	      synchronized (efficientSynchronizedLogger.class) {
	        if(instance == null) {
	          instance = new efficientSynchronizedLogger();
	        }
	      }
	    }
	    System.out.println(instance.hashCode());
	    return instance;
	  }
	}


public class Singleton{
	public static void main(String[] args) {
		Logger l1=Logger.getInstance();
		Logger l2=Logger.getInstance();
		//System.out.println(l1+" "+l2);
		lazyLogger lL1=lazyLogger.getInstance();
		lazyLogger lL2=lazyLogger.getInstance();
		//System.out.println(lL1+" "+lL2);
		synchronizedLogger sl1=synchronizedLogger.getInstance();
		synchronizedLogger sl2=synchronizedLogger.getInstance();
		//System.out.println(sl1+" "+sl2);
		efficientSynchronizedLogger eSl1=efficientSynchronizedLogger.getInstance();
		efficientSynchronizedLogger eSl2=efficientSynchronizedLogger.getInstance();
		//System.out.println(eSl1+" "+eSl2);
	}
	
}
