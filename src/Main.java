//import NotAlive.space.Place;


public class Main{

    public static void main(String[] args) {


            Planet Earth = new Planet("Земля", 12742, 150, Planet.TypeOfPlanet.IS_PLANET);
            Planet Moon = new Planet("Луна", 3474, 150, Planet.TypeOfPlanet.IS_SATELLITE);
            Shorty they = new Shorty("спутники", Earth, 18);
            new Shorty("Знайка", Earth){
                void ReName(){
                    they.setName(this.getName() + " и " + they.getName());

                }
            }.ReName();
        Relief Mountain = new Relief(Moon,15, Lumen.ToShine.SELF);
        Relief PlainWithout = new Relief(Moon,0, Lumen.ToShine.SHADOW);
        Relief Cave = new Relief(Moon, 3, Lumen.ToShine.SELF);
        Machine Rocket = new Machine(" ракету ", Moon, Mountain, HasColoring.Color.BLUE, Machine.Distance.LONG_AWAY);


        they.goOut(they, Cave);
        they.watchSky(they, Moon);
        they.watchStars(they);
        they.watchEarth(they, Earth);

        //System.out.println("\n");
        Relief relief = new Relief();
        relief.Beamed(Mountain, Lumen.Ray.NONE);
        relief.Beamed(PlainWithout, Lumen.Ray.NONE);

        new Planet.MoonProperty().Answer(Moon);
        Moon.WarColor(HasColoring.Color.RED, HasColoring.Color.GREEN, they);

        they.watchRocket(they, Rocket);

    }
}
