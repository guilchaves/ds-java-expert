package entities;

public class Champion {

    private String name;
    private Integer life;
    private Integer attack;
    private Integer armor;

    public Champion(String name, Integer life, Integer attack, Integer armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public Integer getLife() {
        return life;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion other){
        Integer damage;

        if(armor > other.attack){
           damage = 1;
           this.setLife(life - damage);
           return;
        }

        damage = other.attack - armor;
        this.setLife(life - damage);
    }

    public String status(){
        return (life <= 0)
                ? name + ": 0 de vida (morreu)"
                : name + ": " + life + " de vida";
    }
}
