public class Relief implements Thing, HasColoring, Lumen{

    private ToShine toShine;
    private Color color;
    private int height;
    private String type;
    private int layer;
    private String nameOfPlanet;
    private Property property = Property.NONE;

    public Relief(){}

    @Override
    public void Beamed(Thing temp, Ray temp1) {
        Relief temp2 = (Relief) temp;
        temp2.HasColor(temp2);
        this.toShine= ToShine.SELF;
        System.out.println(", потому что" + toShine.getName() + " Землей");
    }

    public Relief(Planet temp1, int temp2, ToShine temp3) {
        this.nameOfPlanet = temp1.getName();
        this.height = temp2;
        this.toShine = temp3;
        if (this.height > 5) {
            this.type = "Гора";}
        else if (this.height > 0 ){
            this.type = " пещеры";
        } else if (this.height == 0 ){
            this.type = "Равнина";
        } else {
            this.type = " моря";
        }
    }

    @Override
    public void HasColor(Thing temp) {
        String allColor = " ";
        Relief temp1 = (Relief) temp;
        if((temp1.toShine == ToShine.SELF) && (temp1.height > 5)) {
            temp1.color = Color.RED;
            allColor = temp1.color.getColor() + " цвет: От ";
            temp1.color = Color.BRIGHT_RED;
            allColor += temp1.color.getColor() + " или ";
            temp1.color = Color.WINE_RED;
            allColor += temp1.color.getColor() + " и до ";
            temp1.color = Color.DARK_RED;
            allColor += temp1.color.getColor();
        }else if (temp1.toShine == ToShine.SHADOW){
            temp1.property = Property.FLICKERING;
            temp1.color = Color.GREEN;
            temp1.toShine = ToShine.LUMINOUS;
            allColor = temp1.toShine.getName() + " и " + temp1.property.getPropertion() + temp1.color.getColor() + "цвет";
        } else {
            temp1.color = Color.NONE;
        }

        System.out.print(temp1.getType()+ " ("+ temp1.nameOfPlanet +")" + " иммет " +  allColor);

    }



    public String getType() {
        return type;
    }
}

