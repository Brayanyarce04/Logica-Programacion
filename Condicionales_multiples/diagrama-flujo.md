```mermaid
flowchart TD
    
    A([Inicio]) --> B[Compra = 180000]
    
    B --> C{"¿Compra mayor o igual a 300000?"}
    
    C -->|Sí| D["Descuento del 20%"]
    C -->|No| E{"¿Compra mayor o igual a 200000?"}
    
    E -->|Sí| F["Descuento del 15%"]
    E -->|No| G{"¿Compra mayor o igual a 100000?"}
   
    G -->|Sí| H["Descuento del 10%"]
    G -->|No| I["No tiene descuento"]
   
    D --> J([Fin])
    F --> J
    H --> J
    I --> J
    
