class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def promocion(self, otro_producto):
        total = self.precio + otro_producto.precio
        descuento = total * 0.10
        precio_final = total - descuento

        print(f"Promoción: {self.nombre} + {otro_producto.nombre}")
        print(f"Precio normal: ${total:.0f}")
        print(f"Precio con promoción: ${precio_final:.0f}")


# Productos iniciales
leche = Producto("Leche", 4000)
pan = Producto("Pan", 3000)

leche.promocion(pan)