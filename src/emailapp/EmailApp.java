package emailapp;

public class EmailApp {
    public static void main(String[] args){
        Email em1 = new Email("jannat", "hoory");
        // em1.setAlternateEmail("js.gh@gmail.com");
        // System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
}
