package JiyiCarnival;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Output
{
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tF %1$tT] [%4$-4s] %5$s %n");
    }

    public static void output(String myclass, String mymethod, String objectid, String description)
    {
        String msg = "\nCall Stack:" +
                "\n\tclassName = " + myclass + ";" +
                "\n\tmethodName = " + mymethod + ";" +
                "\n\tobjectId = " + objectid + ";" +
                "\n\tdescription = " + description + ";\n";
        LOGGER.log(Level.INFO, msg);

    }
}
