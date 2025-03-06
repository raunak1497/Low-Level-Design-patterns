public class WarningLogProcessor extends LogProcessor {
    public WarningLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void Log(LogLevel logLevel, String message) {
        if(logLevel == LogLevel.WARNING) {
            System.out.println(message);
        }else{
            super.log(logLevel, message);
        }
    }
}
