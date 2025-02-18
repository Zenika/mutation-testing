# Lab 5 : Bonus trie à bulles
Duration: 00:30:00

## Objectifs
Un petit code bonus pour se confronter au limite du mutation testing.

## Étapes
1. Ajouter une classe `BubbleSort` avec
2. Ajouter des tests unitaires
3. Comprendre les erreurs de mutation
4. Impossible de trouver des tests pour passer le mutation testing

### 1. Ajouter une classe `BubbleSort`
Créez une classe `BubbleSort` dans le répertoire `src/main/java/com/zenika/BubbleSort.java` :

```java
package com.zenika;

public class BubbleSort {
    public void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimisation: si aucun échange n'a été effectué, le tableau est déjà trié
            if (!swapped) {
                break;
            }
        }
    }
}
```

### 2. Ajouter des tests unitaires

Ajoutez une classe de test dans le répertoire `src/test/java/com/zenika/BubbleSortTest.java` :

```java
package com.zenika;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[] {}, arr);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testSortedArray() {
        int[] arr = {5, 5, 5, 5, 1};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 5, 5, 5, 5}, arr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testRandomArray() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    public void testSameSortedArray() {
        int[] arr = {2, 1, 1};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 1, 2}, arr);
    }
}
```

### 3. Lancer les tests et récupérer le rapport de couverture

Lancez PIT avec avec maven test dans intellij ou avec la commande suivante :

```shell
mvn test
```

### 4. Impossible de trouver des tests pour passer le mutation testing

Si vous essayez de trouver le code 
