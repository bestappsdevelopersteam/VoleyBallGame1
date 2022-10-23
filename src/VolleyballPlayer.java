public class VolleyballPlayer {

    private String name;
    public int age;
    private int position;//1-5
    private int skill; //1-10
    private int condition; //1-5

    public VolleyballPlayer (String name, int age, int position, int skill, int condition) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.skill = skill;
        this.condition = condition;
    }

    public VolleyballPlayer () {
        this.name = "Peter";
        this.age = 23;
        this.position = 1;
        this.skill = 5;
        this.condition = 4;
    }

    public void rest () {   // condition +1
        condition++;
    }

    public void train () {   //skill + 1; condition -1
        if (condition > 1) {

            skill++;
            condition--;
        } else {
            System.out.println ("Player " + name + " has condition only :" + condition + " and " + "can't train. Give him some rest.");
        }
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getPosition () {
        return position;
    }

    public void setPosition (int position) {
        this.position = position;
    }

    public int getSkill () {
        return skill;
    }

    public void setSkill (int skill) {
        this.skill = skill;
    }

    public int getCondition () {
        return condition;
    }

    public void setCondition (int condition) {
        this.condition = condition;
    }

    @Override
    public String toString () {
        return "VolleyballPlayer{" + "name='" + name + '\'' + ", age='" + age + '\'' + ", position=" + position + ", skill=" + skill + ", condition=" + condition + '}';
    }
}
