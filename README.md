# Roll the Dice

**Autore:** Fioretti Daniele  
**Tecnologie:** Kotlin, Android Studio, API 35

## Descrizione

"Roll the Dice" è un'applicazione Android composta da tre schermate, sviluppata in Kotlin. L'utente può premere un pulsante per lanciare un dado a 6 facce. Se il risultato del lancio è un numero pari, l'utente ha vinto, altrimenti ha perso.

## Funzionamento

1. **Schermata iniziale:**  
   L'utente può premere un pulsante per lanciare il dado. Il numero generato casualmente viene passato alla schermata successiva.

2. **Schermata del lancio:**  
   Viene visualizzato il numero uscito dal dado e mostrata l'immagine del dado corrispondente. È presente un pulsante con la scritta "Risultato" che porta alla schermata finale.

3. **Schermata del risultato:**  
   Mostra un messaggio che indica se l'utente ha vinto (numero pari) o perso (numero dispari).

## Requisiti

- Android Studio (versione compatibile con API 35)
- Dispositivo o emulatore con supporto API 35 o superiore

## Struttura del progetto

- **MainActivity:** gestisce il lancio del dado
- **secondActivity:** mostra il risultato del dado e il pulsante "Risultato"
- **thirdActivity:** determina e visualizza se l'utente ha vinto o perso

## Note

Il dado è simulato tramite generazione casuale di un numero compreso tra 1 e 6. La logica di vittoria è: se il numero è pari, si vince.
