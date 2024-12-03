package interfacepractice;

public interface Laptop {
	
	public void copy();
	public void paste();
	public void cut();
	public void keyboard();
	
	default void security() {
		commoncode();
		System.out.println("please implement");
	}
	
static void audio() {
	commoncode();
	System.out.println("laptop audio code");
}
          private static void commoncode() {
        	  System.out.println("commoncode");
          }
}
