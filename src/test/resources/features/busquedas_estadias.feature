# language: es

Característica: Buscar un Airbnb simple

  Escenario: Busqueda para "Jardin, Antioquia" la siguiente semana, estadia 1 semana y 2 personas
    Cuando busque un airbnb para "jardin, antioquia", por 5 días y para 2 "Adultos"
    Entonces debo encontrar al menos 1 locación