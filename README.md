Fortgeschrittene Programmierung (Java 2)

# Übung 6

Sie sollten jetzt auch die zweite Aufgabe von Übung 5 lösen können. 

Klonen Sie dieses Repository direkt in Eclipse und importieren Sie das Projekt. Legen Sie einen neuen Branch an, den Sie nach Ihrem GitHub-Benutzernamen benennen.

## Aufgabe 1: Rekursive Berechnung von Fibonacci-Zahlen

### Ziel

In dieser Aufgabe sollen Sie eine Methode implementieren, die die ersten `n` Fibonacci-Zahlen rekursiv berechnet und ausgibt.

### Hintergrund

Die **Fibonacci-Zahlen** bilden eine Zahlenfolge, bei der sich jede Zahl (ab der dritten) aus der Summe der beiden vorherigen ergibt. Die Folge beginnt mit:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ...

Formal wird die Folge definiert durch:

- F(0) = 0  
- F(1) = 1  
- F(n) = F(n − 1) + F(n − 2) für n > 1

## Aufgabe

Implementieren Sie die Methode `fibonacci(int n)` in der Klasse `FibonacciDemo`, die den **n-ten Fibonacci-Wert** rekursiv berechnet.  


Die main-Methode ist so gestaltet, dass Sie n Fibonacci-Zahlen ausgibt. Bei Aufruf mit `n = 10` soll die Ausgabe sein: 0 1 1 2 3 5 8 13 21 34


### Hinweis

Überlegen Sie sich, wie Sie mit einer Methode arbeiten, die sich **selbst mit kleineren Argumenten aufruft**, bis sie einen **Abbruchfall** erreicht (z. B. `n == 0` oder `n == 1`). Achten Sie darauf, dass die Methode für jeden Wert `n ≥ 0` korrekt funktioniert.

## Bonus (optional)

Die rekursive Methode ist einfach umzusetzen, aber für große `n` sehr ineffizient. Wer Lust hat, kann überlegen, wie man das Verfahren **effizienter** machen kann – etwa mit Hilfe von Zwischenspeicherung (*Memoisierung*) oder einer **iterativen Lösung**.


----

Wenn Sie fertig sind, committen Sie alle Ihre Änderungen am Quellcode, und pushen Sie den neuen Branch auf das remote namens `origin` (= GitHub). 