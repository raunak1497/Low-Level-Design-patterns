public class Main {
    public static void main(String[] args){
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor( new ErrorLogProcessor(new WarningLogProcessor(null))));
        logObject.log(LogLevel.ERROR,"Found an exception");
        logObject.log(LogLevel.DEBUG,"In debug mode");
        logObject.log(LogLevel.INFO,"just the Info");

        logObject.log(LogLevel.WARNING,"This is a warning");
    }
}
