import java.util.Arrays;
import java.util.Comparator;

/*
0204
c11 = 6; Визначити клас косметика, який складається як мінімум з 5-и полів.
*/

class Catalog {
    private String name;
    private String brand;
    private int price;
    private int mass;
    private int id;

    public Catalog(String name, String brand, int price, int mass, int id){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.mass = mass;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    public int getMass(){
        return mass;
    }
    public int getId(){
        return id;
    }
    public void setName(String n) {
        this.name = n;
    }
    public void setBrand(String n){
        this.brand = n;
    }
    public void setPrice(int n){
        this.price = n;
    }
    public void setMass(int n){
        this.mass = n;
    }
    public void setId(int n){
        this.id = n;
    }
}

class PriceIncrease implements Comparator<Catalog>{
    public int compare(Catalog p1,Catalog p2){
        return p1.getPrice()-p2.getPrice();
    }
}

class MassDecrease implements Comparator<Catalog>{
    public int compare(Catalog p1,Catalog p2){
        return p2.getMass()-p1.getMass();
    }
}

public class Lab4 {
    public static void main(String[] args){
        Catalog list[] = new Catalog[4];
        list[0] = new Catalog("Лак","rty",80,100,324553);
        list[1] = new Catalog("Гель","qwe",50,200,745373);
        list[2] = new Catalog("Помада","Dior",70,70,565856);
        list[3] = new Catalog("Парфум","Loreal",120,150,907965);

        System.out.println("Сортування за зростанням ціни товару:");
        Arrays.sort(list, new PriceIncrease());
        for(int i=0; i<list.length;i++){
            System.out.println(list[i].getName() + ": " + list[i].getBrand() + " - " + list[i].getPrice());
        }

        System.out.println("\nСортування за спаданням маси товару:");
        Arrays.sort(list, new MassDecrease());
        for(int i=0; i<list.length;i++){
            System.out.println(list[i].getName() + ": " + list[i].getBrand() + " - " + list[i].getMass());
        }
    }
}
