class Product:
    def __init__(self, name, price):
        self._name = name
        self._price = price

    def get_name(self):
        return self._name

    def set_name(self, name):
        self._name = name

    def get_price(self):
        return self._price

    def set_price(self, price):
        if price > 0:
            self._price = price
        else:
            raise ValueError("Price must be positive")

    def display_product_details(self):
        return f"Product Name: {self.get_name()}, Price: {self.get_price()}"


class Electronics(Product):
    def __init__(self, name, price, brand):
        super().__init__(name, price)
        self._brand = brand

    def get_brand(self):
        return self._brand

    def set_brand(self, brand):
        self._brand = brand

    def display_product_details(self):
        return f"Electronics Name: {self.get_name()}, Price: {self.get_price()}, Brand: {self._brand}"


class Clothing(Product):
    def __init__(self, name, price, size):
        super().__init__(name, price)
        self._size = size

    def get_size(self):
        return self._size

    def set_size(self, size):
        self._size = size

    def display_product_details(self):
        return f"Clothing Name: {self.get_name()}, Price: {self.get_price()}, Size: {self._size}"


class Furniture(Product):
    def __init__(self, name, price, material):
        super().__init__(name, price)
        self._material = material

    def get_material(self):
        return self._material

    def set_material(self, material):
        self._material = material

    def display_product_details(self):
        return f"Furniture Name: {self.get_name()}, Price: {self.get_price()}, Material: {self._material}"


def print_product_details(product):
    print(product.display_product_details())


shirt = Clothing("Shirt", 20.5, "M")
sofa = Furniture("Sofa", 499.99, "Leather")
tv = Electronics("TV", 299.99, "Sony")

print_product_details(shirt)  # Polymorphism in action
print_product_details(sofa)
print_product_details(tv)
