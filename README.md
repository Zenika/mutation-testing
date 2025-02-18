# Codelab sur le mutation testing

Durée 2h

Les slides de présentation sont disponibles [ici](https://docs.google.com/presentation/d/1SPt_ifk_Mb3e7GpeC40aT16ycYjGjXnwHiit6nXWN3g/edit?usp=sharing). 

## Objectifs
- Comprendre le concept de mutation testing
- Utiliser le plugin PITest pour lancer des mutations
- Corriger des tests unitaires pour passer le mutation testing


## Lancer le mutation testing

Le code source représente le code utilisé lors des TP 1, 2 et 3 et 5.

Le TP4 est un TP utilise un projet Spring que l'on peut retrouver [ici](https://github.com/Zenika-Training/codelab-mutation-testing).

Les tests sont en double, une version de base qui ne couvre pas toutes les mutations et une version corrigée qui les couvre.

Le but des TP est de corriger les tests de base pour que tous les mutations soient détectées et tuées.

### Lancer les tests sans les corrections :

Les tests dans le package `com.zenika.corrected` seront ignorés.

```shell
mvn test -P nocorrected
```

### Lancer les tests avec les corrections :

Seuls les tests dans le package `com.zenika.corrected` seront exécutés.


```shell
mvn test -P corrected
```