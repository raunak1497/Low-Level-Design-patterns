public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(LogLevel Loglevel, String message) {
        if(Loglevel == LogLevel.ERROR){
            System.out.println("Error : " + message);
        }else{
            super.log(Loglevel, message);
        }
    }
}
