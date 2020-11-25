public class Machine implements HasColoring, Thing, Lumen{
    private String name;
    private Planet planet;
    private Relief relief;
    private Color color;
    private Distance dist = Distance.LONG_AWAY;
    private ToShine toShiny;

    public Machine(){}

    public enum Distance {
        NEAR(" близко "),
        LONG_AWAY(" вдалеке");

        private String distance;

        Distance(String far){
            this.distance = far;
        }

        public String getDistance() {
            return distance;
        }
    }

    @Override
    public void Beamed(Thing temp, Ray temp1) {
        Machine temp2 = (Machine) temp;
        temp2.toShiny = ToShine.GLOW;
        System.out.println(temp2.getName() + temp2.toShiny.getName());
    }

    public Machine(String temp1, Planet temp2, Relief temp3, Color temp4, Distance temp5) {
        this.name = temp1;
        this.planet = temp2;
        this.relief = temp3;
        this.color = temp4;
        this.dist = temp5;
    }


    @Override
    public void HasColor(Thing temp1){
        Machine temp = (Machine) temp1;
        temp.color = Color.BRIGHT_BLUE;
        System.out.println(temp.getName() + " имеет " + temp.color.getColor() + " цвет, словно кусочек весеннего земного неба");
    }


    public String getDist() {
        return dist.getDistance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}