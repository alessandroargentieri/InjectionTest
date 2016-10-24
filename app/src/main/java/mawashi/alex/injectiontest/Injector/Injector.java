package mawashi.alex.injectiontest.Injector;

import mawashi.alex.injectiontest.Model.Computer;
import mawashi.alex.injectiontest.Model.PC;
import mawashi.alex.injectiontest.Model.Processor;
import mawashi.alex.injectiontest.Model.x32CPU;

public class Injector {

    static private Processor cpu;
    static private Computer pc;

    public static Computer injectComputer(){
        cpu = new x32CPU();
        pc = new PC("PC1", cpu);

        return pc;
    }


}
