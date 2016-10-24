package mawashi.alex.injectiontest.Model;

public class PC implements Computer{
    private Processor cpu;
    private String name;

    public PC(String name, Processor cpu){
        this.name = name;
        this.cpu= cpu;
    }

    @Override
    public String getFeatures(){
        return this.name + " with Processor " + cpu.getName();
    }

}
