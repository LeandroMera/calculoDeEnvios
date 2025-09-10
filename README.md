# Sistema de Envíos - Mayorista

Programa en **Java SE** que simula la lógica de un sistema de ventas mayoristas, aplicando reglas de negocio sobre **cantidad de paquetes** y **monto de compra**.

## 🚀 Características

- Valida la cantidad de paquetes:
  - Menos de 5 → no se permite la venta.
  - Entre 5 y 15 → costo de envío: **10 USD**.
  - Más de 15 → **envío gratis**.
- Solicita el monto de la compra.
- Si el monto es menor a 100 USD, muestra cuánto falta para acceder a las promociones.

## 🛠️ Tecnologías utilizadas

- Java SE (JDK 8+)
- Scanner para entrada por consola

## 📋 Requisitos previos

- Tener instalado **JDK 8 o superior**  
- Tener un IDE (IntelliJ, NetBeans, Eclipse) o compilar por consola.

## ▶️ Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tuusuario/envios-mayorista.git
Compilar el archivo Main.java:

bash
Copiar código
javac Main.java
Ejecutar el programa:

bash
Copiar código
java Main
Ingresar los datos solicitados por consola.

📌 Ejemplo de uso
yaml
Copiar código
Ingrese la cantidad de paquetes: 
8
Ingrese el monto total de la compra
85
El valor de envio es de 10Usd
El monto no aplica las promociones. necesitas comprar: 15.0 para obtener la promo.
