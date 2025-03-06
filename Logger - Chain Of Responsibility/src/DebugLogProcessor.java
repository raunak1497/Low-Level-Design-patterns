public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(LogLevel Loglevel, String message) {
        if(Loglevel == LogLevel.DEBUG){
            System.out.println("Debug : " + message);
        }else{
            super.log(Loglevel, message);
        }
    }
}
