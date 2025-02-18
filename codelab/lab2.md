# Lab 2 : FizzBuzz
Duration: 00:10:00

## Objectifs
Ajouter une nouvelle classe avec des tests unitaires et les corriger pour passer la mutation testing.

## Étapes
1. Ajouter une classe `FizzBuzz` avec
2. Ajouter des tests unitaires
3. Lancer les tests et récupérer le rapport de couverture
4. Comprendre les erreurs de mutation
5. Corriger les tests
6. Relancer les tests et récupérer le rapport de couverture

### 1. Ajouter une classe `FizzBuzz`
Créez une classe `FizzBuzz` dans le répertoire `src/main/java/com/zenika/FizzBuzz.java` :

```java
package com.zenika;

public class FizzBuzz {
    public String getResult(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
```

### 2. Ajouter des tests unitaires

Ajoutez une classe de test dans le répertoire `src/test/java/com/zenika/FizzBuzzTest.java` :

```java
package com.zenika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_Bizz_when_number_is_divisible_by_3() {
        // Given
        int number = 3;

        // When
        fizzBuzz.getResult(number);

        // Then
        assertTrue(true);
    }

    @Test
    void should_return_Fizz_when_number_is_divisible_by_5() {
        assertNotNull(fizzBuzz.getResult(5));
    }

    @Test
    void should_return_FizzBuzz_when_number_is_divisible_by_15() {
        assertEquals("FizzBuzz", fizzBuzz.getResult(15));
        assertEquals("FizzBuzz", fizzBuzz.getResult(30));
    }

    @Test
    void should_return_number_when_number_is_not_divisible_by_3_or_5() {
        assertEquals(String.class, fizzBuzz.getResult(1).getClass());
    }
}
```

### 3. Lancer les tests et récupérer le rapport de couverture

Exécutez la commande suivante pour lancer les tests et générer le rapport de couverture :

```
mvn test
```

Regarder le rapport de couverture dans le fichier `target/site/jacoco/index.html`.
On doit avoir 100% de couverture de code.

### 4. Comprendre les erreurs de mutation

Lancez PIT avec avec maven test dans intellij ou avec la commande suivante :

```shell
mvn test
```

Regarder le rapport de mutation dans le fichier `target/pit-reports/index.html`.

### 5. Corriger les tests

Corrigez les tests unitaires pour passer la mutation testing à 100%.

### 6. Relancer les tests et récupérer le rapport de couverture

Relancez les tests et regardez le rapport de couverture pour vérifier que la mutation testing est à 100%.



