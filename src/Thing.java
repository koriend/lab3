public interface Thing {


    public enum Property {
        BOTOMLESS(" бездонное"),
        SHINY(" сверкающих"),
        GREAT(" огромный"),
        SMALL(" мельчайшие"),
        FLICKERING("мерцающий"),
        INVISIBLE(" невидимых "),
        SPRING(" весеннего"),
        EARTHLY(" земного"),
        FULLY(" полный"),
        HAPPY(" счастливых"),
        NONE(" ");
        private String propertion;

        public String getPropertion(){
            return propertion;
        }


        Property(String prop){
            this.propertion = prop;
        }

        public void setPropertion(String prop) {
            this.propertion = prop;
        }
    }

}
