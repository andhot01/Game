public class Sword implements IItems{
    private String name;
    private String quality;
    private int dropChances;
    private String description;
    private int attack;
    private int defence;

    public Sword(String name, String quality, int dropChances, String description,
                 int attack, int defence) {
        this.name = name;
        this.quality = quality;
        this.dropChances = dropChances;
        this.description = description;
        this.attack = attack;
        this.defence = defence;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getQuality() {
        return quality;
    }

    @Override
    public int getDropChance() {
        return dropChances;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setName() {

    }

    @Override
    public void setQuality() {

    }

    @Override
    public void setDropChance() {

    }

    @Override
    public void setDescription() {

    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public void setAttack() {

    }

    @Override
    public void setDefence() {

    }
}
