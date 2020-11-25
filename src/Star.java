public class Star extends CosmosObj {
    private String name;
    private int diametr;
    private int count;
    private String reallyCount;
    private Property property;


    public Star(String temp1, int temp2){
        this.name = temp1;
        this.diametr = temp2;
        this.count = 1;
        this.property = Property.NONE;

    }

    public Star(String temp1, String temp2){
        this.name = temp1;
        this.count = (int)Math.random()*300 + 100;
        this.reallyCount = temp2;
        this.property = Property.SHINY;
    }

    @Override
    public void Beamed(Thing temp, Ray temp1) {
        Star temp2 = (Star) temp;
        System.out.print(temp2.getName() + ToShine.TO_OTHER.getName() + " Землю " + temp1.getName() + " лучами," );
        temp1 = Ray.STRAIGHT;
        System.out.println("а не " + temp1.getName() + " лучами ");
    }


    @Override
    public boolean equals(Object temp0) {
        if(this == temp0){
            return true;
        } else if (temp0 != null && this.getClass() == temp0.getClass()){
            Star temp01 = (Star) temp0;
            if (!this.name.equals(temp01.name)){
                return false;
            } else if(this.diametr != temp01.diametr){
                return false;
            }else {
                return this.count > 1 ? this.count != temp01.count: this.count == temp01.count;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int temp0 = 23;
        temp0 = 17 * temp0 + this.name.hashCode();
        temp0 = 17 * temp0 + this.diametr;
        temp0 = 17 * temp0 + this.count;
        return temp0;
    }

    @Override
    public String toString() {
        if (this.count == 1){
            return "Звезда: " + "\n" + "Диаметр: " + this.diametr ;
        } else {
            return "Звезды: " + "\n" + "Количество: " + this.reallyCount;
        }

    }

    public String getName() {
        return name;
    }

    public String getReallyCount() {
        return reallyCount;
    }

    public String getProperty() {
        return property.getPropertion();
    }
}
