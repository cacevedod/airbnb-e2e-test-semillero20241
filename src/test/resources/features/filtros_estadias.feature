# language: es

Característica: Filtros en Airbnb de estadias

  Escenario: Filtrar por Piscinas increíbles
    Dado que busque un airbnb para "jardin, antioquia", por 5 días y para 2 "Adultos"
    Cuando filtre por "Piscinas increíbles"
    Entonces los 5 primeros resultados deben tener "Piscina" en "Estacionamiento e instalaciones" en los servicios del detalle
