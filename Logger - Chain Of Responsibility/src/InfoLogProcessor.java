public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(LogLevel Loglevel, String message) {
        if(Loglevel == LogLevel.INFO){
            System.out.println("Info : " + message);
        }else{
            super.log(Loglevel, message);
        }
    }
}
