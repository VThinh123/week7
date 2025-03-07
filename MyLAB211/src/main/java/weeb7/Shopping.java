/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weeb7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO LEGION
 */
public class Shopping {
    private List<Fruit> fruits;
    private List<Order> orders;

    public Shopping() {
        this.fruits = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void createFruit(String fruitId, String name, double price, int quantity, String origin){
        fruits.add(new Fruit(fruitId, name, price, quantity, origin));
    }
    
    public Fruit getFruitbyName(String fruitName){
        for(Fruit fruit: fruits){
            if(fruit.getFruitId().equals(fruitName)){
                return fruit;
            }
        }
        return null;
    }
}
    
