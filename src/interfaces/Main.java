public class Main {
    public static void main(String[] args) {
       /* CustomerManager customerManager = new CustomerManager();-> burada CustomerManager icinde
       * constructoru yaradanada xeta atir cunki deyir ki CustomerManager in parametrsiz constructoru yoxdur*/
        Logger[] loggers= {new SmsLogger(),new EmailLogger()};

        //CustomerManager customerManager=new CustomerManager(new EmailLogger());


       CustomerManager customerManager = new CustomerManager(loggers);


        Customer engin = new Customer(1, "Vazifa", "Guliyeva");
        customerManager.add(engin);
    }
}