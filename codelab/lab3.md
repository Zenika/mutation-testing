# Lab 3 : Pile
Duration: 00:10:00

## Objectifs
Ajouter une nouvelle classe avec des tests unitaires et les corriger pour passer le mutation testing.

## Étapes
1. Ajouter une classe `Pile`
2. Ajouter des tests unitaires
3. Lancer les tests et récupérer le rapport de couverture
4. Comprendre les erreurs de mutation

### 1. Ajouter une classe `Pile`
Créez une classe `Pile` dans le répertoire `src/main/java/com/zenika/Pile.java` :

```java
package com.zenika;

public class Pile {
    private int[] elements;
    private int top;

    public Pile(int capacity) {
        elements = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            throw new IllegalStateException("Pile pleine");
        }
        top++;
        elements[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pile vide");
        }
        int data = elements[top];
        top--;
        return data;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == elements.length - 1;
    }
}
```

### 2. Ajouter des tests unitaires

Ajoutez une classe de test dans le répertoire `src/test/java/com/zenika/PileTest.java` :

```java
package com.zenika;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PileTest {

    @Test
    public void testPushPop() {
        Pile pile = new Pile(3);
        pile.push(0);
        assertEquals(0, pile.pop());
    }

    @Test
    public void testIsEmpty() {
        Pile pile = new Pile(0);
        assertTrue(pile.isEmpty());
    }

    @Test
    public void testIsFull() {
        Pile pile = new Pile(1);
        assertFalse(pile.isFull());
    }
}
```

### 3. Lancer les tests et récupérer le rapport de couverture

Lancez PIT avec avec maven test dans intellij ou avec la commande suivante :

```shell
mvn test
```

Ouvrez le rapport de mutation dans le navigateur :

```shell
open target/pit-reports/index.html
```

### 4. Comprendre les erreurs de mutation

Analysez les erreurs de mutation et corrigez les tests pour les passer.

