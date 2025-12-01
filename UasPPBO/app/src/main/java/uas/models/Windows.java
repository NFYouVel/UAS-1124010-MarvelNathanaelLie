package uas.models;

import uas.models.enums.TypeOfWindows;

public class Windows extends OperatingSystem{
    
    private TypeOfWindows type;

    public Windows(String version, TypeOfWindows type) {
        super("Windows", version);
        this.type = type;
    }

    @Override
    public String getBootInfo() {
        return ("Booting " + super.getName() + " " + super.getVersion() + " " + this.type.toString());
    }
    
}
