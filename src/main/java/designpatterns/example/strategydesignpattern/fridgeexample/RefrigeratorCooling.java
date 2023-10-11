package designpatterns.example.strategydesignpattern.fridgeexample;

public class RefrigeratorCooling {

        private Refrigerator refrigerator;

        public void setRefrigerator(Refrigerator refrigerator) {
            this.refrigerator = refrigerator;
        }

        public String freeze(){
            return refrigerator.freeze();
        }

        public String cool(){
            return refrigerator.cool();
        }

}
