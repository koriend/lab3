public class Planet extends CosmosObj implements Thing, HasColoring {
    private int diametr;
    private int distToSun;
    private String name;
    private Color color;
    private TypeOfPlanet type;
    private Property property = Property.NONE;
    private ToShine toShine;


    public enum Shape implements HasColoring{
        DISK(" диск"){
            @Override
            public void HasColor(Thing temp) {
                Planet temp1 = (Planet) temp;
                temp1.color = Color.WHITE;
                String s = temp1.color.getColor();
                temp1.color = Color.BLUE;
                s += temp1.color.getColor();
            }
        },
        SICKLE(" серпа"){
            @Override
            public void HasColor(Thing temp) {

            }
        },
        CRESCENT("полумесяца"){
            @Override
            public void HasColor(Thing temp) {

            }
        },
        CIRCLE(" круга"){
            @Override
            public void HasColor(Thing temp) {

            }
        };

        private String shape;

        Shape(String shape){ this.shape = shape; }

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }
    }




    public enum TypeOfPlanet implements Thing, HasColoring  {

        IS_PLANET{
            @Override
            public void HasColor(Thing temp) {
                Planet temp1 = (Planet) temp;
                temp1.color = Color.BLUE;
            }
        },
        IS_SATELLITE{
            @Override
            public void HasColor(Thing temp) {
                Planet temp1 = (Planet)temp;
                temp1.color = Color.BLACK;//вставить try-catch
                temp1.property = Property.BOTOMLESS;

            }
        }
    }


    public Planet(){};

    public Planet(String temp1, int temp2, int temp3, TypeOfPlanet temp4){
        this.name = temp1;
        this.diametr = temp2;
        this.distToSun = temp3;
        this.type = temp4;
    }



    static class MoonProperty implements Lumen{
        private int lay;
        private ToShine toShine;
        private String name;
        private Planet temp3;

        @Override
        public void Beamed(Thing temp, Ray temp1) {
            Planet temp3 = (Planet) temp;
            temp3.property = Property.INVISIBLE;
            this.toShine = ToShine.GLOW;
            System.out.println(this.toShine.getName() + " из-за" + temp3.property.getPropertion() + temp1.getName() + " лучей");
        }
        public void PropertyOfLayer(int layer){
            this.lay = layer;
            System.out.print(this.lay + " поверхность (Луна) ");
        }
        public void Answer(Planet temp1){
            System.out.print("Это объяется тем, что ");
            new Planet.MoonProperty().PropertyOfLayer(410);
            new Planet.MoonProperty().Beamed(temp1, Lumen.Ray.COSMIC);
            System.out.println("\n");
        }
    }


    @Override
    public void Beamed(Thing temp, Ray temp1) {
    }

    @Override
    public void HasColor(Thing temp) {
        Planet temp1 = (Planet) temp;
        System.out.println(temp1);

    }

    public String sky(){
         type.HasColor(this);
        return color.getColor() + property.getPropertion();
    }

    public void SideOf(Planet temp1, Shape temp2){
            if (temp2 == Shape.DISK){
                temp1.property = Property.GREAT;
                temp1.toShine = ToShine.LUMINOUS;
                System.out.print(temp1.property.getPropertion() + temp1.toShine.getName() + temp2.getShape());
                temp1.type.HasColor(temp1);

            }
    }

    @Override
    public boolean equals(Object temp0) {
        if(this == temp0){
            return true;
        } else if (temp0 != null && this.getClass() == temp0.getClass()){
            Planet temp01 = (Planet) temp0;

            return this.name.equals(temp01.name) && this.diametr == temp01.diametr && this.distToSun == temp01.distToSun;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int temp0 = 19;
        temp0 = temp0 * 13 + this.name.hashCode();
        temp0 = temp0 * 13 + this.distToSun;
        temp0 = temp0 * 13 + this.diametr;
        return temp0;
    }


    public String getName() {
        return this.name;
    }
}
