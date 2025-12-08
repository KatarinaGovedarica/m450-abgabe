# Aufgabe 1

## Abstrakte Testfälle

| Nr. | Bedingung (abstrakt)         | Erwarteter Rabatt |
|-----|-------------------------------|-------------------|
| A1  | Preis < 15'000                | 0 %               |
| A2  | 15'000 ≤ Preis ≤ 20'000       | 5 %               |
| A3  | 20'000 < Preis < 25'000       | 7 %               |
| A4  | Preis ≥ 25'000                | 8.5 %             |


## Konkrete Testfälle

| Nr. | Preis (CHF) | Rabatt erwartet |
|-----|-------------|------------------|
| T1  | 14000       | 0 %              |
| T2  | 15000       | 5 %              |
| T3  | 18500       | 5 %              |
| T4  | 20000       | 5 %              |
| T5  | 22000       | 7 %              |
| T6  | 24999       | 7 %              |
| T7  | 25000       | 8.5 %            |
| T8  | 30000       | 8.5 %            |

# Aufgabe 2

| ID | Beschreibung | Erwartetes Resultat | Effektives Resultat | Status | Mögliche Ursache |
|----|--------------|----------------------|----------------------|--------|------------------|
| 1  | Benutzer gibt Standort ein und klickt „Auto suchen“ | Liste mit verfügbaren Autos wird angezeigt | – | – | – |
| 2  | Benutzer wählt ein Datum für Abholung und Rückgabe | Webseite zeigt verfügbare Fahrzeuge basierend auf Datum | – | – | – |
| 3  | Benutzer öffnet die Fahrzeugdetails eines Autos | Detailseite zeigt Preis, Modell, Bedingungen | – | – | – |
| 4  | Benutzer versucht, ein Auto zu buchen | Buchungsformular öffnet sich ohne Fehler | – | – | – |
| 5  | Benutzer nutzt Filter „Kleinwagen“ | Nur Kleinwagen erscheinen in der Liste | – | – | – |


# Aufgabe 3

- Mögliche Black-Box Testfälle

| Test | Testfall | Erwartetes Resultat | Resultat | 
|-----|-------------|-------------------|----------|
| 1   | Buchstaben der nicht im Menü ist, eingeben          | Fehlermeldung "Geben sie einen gültigen Buchstaben ein"                 |  Fehlermeldung        |
| 2   | Ungültige Währung eingeben          | Fehlermeldung                 | Fehlermeldung         |
| 3   | Zahl im Nachnamen bei Kontoerstellung eingeben          | Fehlermeldung                 | Speichert die Zahl im Nachnamen. keine Fehlermeldung         |
| 4   | Existierende Kontozahl eingeben          | Konto wird angezeigt mit Optionen                 | Konto wird angezeigt mit Optionen         |
| 5   | Mehr von einem Konto abheben als Geld auf dem Konto          | Fehlermeldung                 | Fehlermeldung         |
| 6   | 'Ü' um auf ein anderes Konto zu überweisen          | Auswahl welches Konto                 | Fehlermeldung         |


- White-Box-Testfälle

| Test | Methode                                   | Was wird geprüft?                                                   | Erwartetes Resultat                                  |
|------|-------------------------------------------|---------------------------------------------------------------------|-----------------------------------------------------|
| 1    | `Account.deposit(double amount)`          | Einzahlen auf ein Konto                                             | Kontostand erhöht sich um den eingezahlten Betrag   |
| 2    | `Account.withdraw(double amount)`         | Abheben mit genug / zu wenig Geld                                   | Genug Geld → true und Kontostand sinkt; zu wenig → false, Kontostand bleibt gleich |
| 3    | `Bank.getAccount(int nr)`                 | Konto über Kontonummer suchen                                       | Bei existierender Nummer → Konto; sonst → `null`    |
| 4    | `Bank.createAccount(String, Currency, double)` | Neues Konto anlegen                                                 | Konto wird erstellt und zur Liste hinzugefügt       |
| 5    | `Counter.convertCurrency(...)`            | Betrag zwischen Währungen umrechnen                                 | Betrag wird mit richtigem Kurs multipliziert, sonst unverändert |




