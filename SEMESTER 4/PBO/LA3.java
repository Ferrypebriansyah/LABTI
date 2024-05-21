class Enemy {
    protected String name;
    protected int hp;
    protected int attackPoint;

    public Enemy(String name, int hp, int attackPoint) {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }
    void attack() {
        System.out.println(name + " is attacking!");
    }
    public String profile() {
        return "Name: " + name + "\nHP: " + hp + "\nAttack Point: " + attackPoint;
    }
}

class Zombie extends Enemy {
    public Zombie(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }
    void walk() {
        System.out.println(name + " the Zombie is walking.");
    }
    @Override
    public String profile() {
        return super.profile() + "\nType: Zombie\nUnique Ability: Walk";
    }
}

class Pocong extends Enemy {
    public Pocong(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }
    void jump() {
        System.out.println(name + " is jumping.");
    }
    @Override
    public String profile() {
        return super.profile() + "\nType: Ghost\nUnique Ability: Jump";
    }
}

class Burung extends Enemy {
    public Burung(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }
    void dive() {
        System.out.println(name + " is diving.");
    }
    void stab() {
        System.out.println(name + " is stabbing.");
    }
    void fly() {
        System.out.println(name + " is flying.");
    }
    @Override
    public String profile() {
        return super.profile() + "\nType: Bird\nUnique Ability: Dive, Stab, Fly";
    }
}

public class LA3 {
    public static void main(String[] args) {
        Zombie zumbi = new Zombie("Zumbi", 50, 8);
        Pocong hantuPocong = new Pocong("Pocong", 60, 7);
        Burung garuda = new Burung("Garuda", 70, 9);

        System.out.println("Monster Profile:");
        System.out.println("=================");

        System.out.println("Zumbi Profile:");
        System.out.println(zumbi.profile());
        zumbi.attack();
        System.out.println();

        System.out.println("Pocong Profile:");
        System.out.println(hantuPocong.profile());
        hantuPocong.jump();
        System.out.println();

        System.out.println("Garuda Profile:");
        System.out.println(garuda.profile());
        garuda.dive();
        System.out.println();
    }
}