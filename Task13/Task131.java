package Task13;
class Dish {
    String[] ingredients;

    void showIngredients() {
        for (String item : ingredients) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }
}

// Extended classes
class Afritada extends Dish {
    Afritada() {
        ingredients = new String[]{"Tomato Sauce", "Meat", "Potatoes & Carrots", "Hotdog"};
    }
}

class Mechado extends Dish {
    Mechado() {
        ingredients = new String[]{"Tomato Sauce", "Meat"};
    }
}

class Menudo extends Dish {
    Menudo() {
        ingredients = new String[]{"Tomato Sauce", "Liver Spread", "Raisins"};
    }
}

class Caldereta extends Dish {
    Caldereta() {
        ingredients = new String[]{"Tomato Paste", "Meat", "Cheese"};
    }
}

public class Task131 {
    public static void main(String[] args) {

        Dish meal1 = new Afritada();
        Dish meal2 = new Mechado();
        Dish meal3 = new Menudo();
        Dish meal4 = new Caldereta();

        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}