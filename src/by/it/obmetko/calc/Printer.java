package by.it.obmetko.calc;

import static by.it.obmetko.calc.ConsoleRunner.rm;

public class Printer {

    static void print (Var var) {
        if (var != null)
            Logger.getLogger().println(var.toString(), Logger.MessageType.CALC_OUTPUT);
        else
            Logger.getLogger().println(rm.get(Messages.VARNOTFOUND), Logger.MessageType.CALC_OUTPUT);
    }
}