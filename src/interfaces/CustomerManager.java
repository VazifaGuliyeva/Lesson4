public class CustomerManager {
   // private Logger logger;
    private Logger[] loggers;

   /* public CustomerManager(Logger logger) {
        this.logger = logger;
    }*/
    public CustomerManager(Logger[] loggers){
        this.loggers=loggers;
    }

    public void add(Customer customer){
        System.out.println("musteri eklendi"+customer.getFirstName());
       /* DatabaseLogger data=new DatabaseLogger();// interfaces hissesi esas burdan baslayir
        data.log(customer.getFirstName()+"veri tabanina loglandi");*/ /*burada database i file ve ya sms ile
        deyismek istesek mecbur gelib elimizle silmeliyik yazmaliyiq bunun qarsini almaq ucun Logger in private
        deyisenini yaradacayiq*/


       // this.logger.log(customer.getFirstName());/*yuxaridaki elaqeni yaratmis olduq*/
        for(Logger logger:loggers){
            logger.log(customer.getFirstName());

        }
    }

    public void delete(Customer customer){
        System.out.println("musteri silindi"+customer.getFirstName());
      //  this.logger.log(customer.getFirstName());
        for(Logger logger:loggers){
            logger.log(customer.getFirstName());

        }

    }
}
