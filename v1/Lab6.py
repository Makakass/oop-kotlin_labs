#  C13 = 9
#  Визначити ієрархію легкових автомобілів. Створити таксопарк.
#  Порахувати вартість автопарку. Провести сортування автомобілів парку за витратами палива.
#  Знайти автомобіль у компанії, що відповідає заданому діапазону швидкості автомобіля.

class Auto:
    def __init__(self, price, fuel_cons, speed):
        self.name = "Легковий автомобіль"
        self.price = int(price)
        self.fuel_cons = int(fuel_cons)
        self.speed = int(speed)

    def __str__(self):
        return f"Автомобіль: {self.name}, ціна: {self.price}$, витрата палива: {self.fuel_cons}л/100км , швидкість: {self.speed} км/год"

    def getname(self):
        return self.name

    def getprice(self):
        return self.price

    def getcons(self):
        return self.fuel_cons

    def getspeed(self):
        return self.speed


class BMW(Auto):
    def __init__(self, name, price, fuel_cons, speed):
        super().__init__(price, fuel_cons, speed)
        self.name = name


class Audi(Auto):
    def __init__(self, name, price, fuel_cons, speed):
        super().__init__(price, fuel_cons, speed)
        self.name = name


class Honda(Auto):
    def __init__(self, name, price, fuel_cons, speed):
        super().__init__(price, fuel_cons, speed)
        self.name = name


class Park:
    def __init__(self, *auto):
        self.autos = [autos for autos in auto]

    def park_price(self):
        price = 0
        for i in self.autos:
            price += int(i.price)
        print(f"\nЗагальна ціна парку: {price}$")

    def fuelcons_sort(self):
        self.autos.sort(key=lambda x: x.getcons())
        print("\nВідсортовано по споживанню: ")
        for i in self.autos:
            print(i.name)

    def out(self):
        print("\nПарк: ")
        for i in self.autos:
            print(i.__str__())

    def find_by_speed_range(self, minspeed, maxspeed):
        print("Машини в заданому діапазоні швидкості: ")
        for i in self.autos:
            if minspeed <= i.getspeed() <= maxspeed:
                print(i.name)
class Main:
    def __init__(self):
        Taxpark = Park(
            BMW("BMW M2", 60000, 8, 215),
            BMW("BMW M5", 80000, 9, 300),
            Audi("Audi A4", 45000, 6, 201),
            Honda("Honda Civic", 40000, 6, 198)
        )
        Taxpark.out()
        Taxpark.park_price()
        Taxpark.fuelcons_sort()
        while True:
            try:
                Taxpark.find_by_speed_range(int(input("\nМінімальна швидкість: ")),int(input("Максимальна швидкість: ")))
                return
            except TypeError:
                print("Введено не число!")

if __name__ == "__main__":
    Lab6 = Main()
