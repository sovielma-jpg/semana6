# SpeedFast - Gestión de Entregas (Semana 6)

Proyecto académico desarrollado en **Java Swing** para la empresa ficticia *SpeedFast*.  
Este sistema permite gestionar pedidos y entregas mediante una interfaz gráfica de escritorio.

##  Funcionalidades
- Registrar nuevos pedidos (ID, Dirección, Tipo).
- Visualizar pedidos en una tabla (`JTable`).
- Asignar repartidores e iniciar entregas.
- Navegación entre ventanas desde la ventana principal.
- Almacenamiento básico en listas en memoria (sin base de datos).

## Estructura del Proyecto

src/
├── main/
│     └──Main.java
├── modelo/
│    ├── Pedido.java
│    ├── Repartidor.java
│    └── ControladorPedidos.java
├── vista/
│    ├── VentanaPrincipal.java
│    ├── VentanaRegistroPedido.java
│    ├── VentanaListaPedidos.java
│    └── VentanaAsignarRepartidor.java
