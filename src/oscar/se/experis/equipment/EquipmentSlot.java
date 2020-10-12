package oscar.se.experis.equipment;

public abstract class EquipmentSlot {
    private String slotType;

    //Constructor

    public EquipmentSlot(String slotType) {
        this.slotType = slotType;
    }

    //Getters and Setters

    public String getSlotType() {
        return slotType;
    }

    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }
}
