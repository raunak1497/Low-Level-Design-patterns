public abstract class LogProcessor {

    private final LogProcessor nextLoggerProcessor;

    public LogProcessor(LogProcessor loggerProcessor) {
        this.nextLoggerProcessor = loggerProcessor;
    }

    public void log(LogLevel Loglevel, String message) {
        if(nextLoggerProcessor != null) {
            nextLoggerProcessor.log(Loglevel, message);
        }else{
            System.out.println("[UNHANDLED] Log level: "+ Loglevel + message);
        }
    }
}
