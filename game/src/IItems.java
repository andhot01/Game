public interface IItems extends IWeapon{
    String getName();
    String getQuality();
    int getDropChance();
    String getDescription();
    void setName();
    void setQuality();
    void setDropChance();
    void setDescription();
}
