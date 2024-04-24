# Progetto TPS e Informatica: Negozio di Elettronica

## Descrizione
Questo progetto si propone di creare un sistema per gestire un negozio di elettronica. Il sistema permette di gestire il catalogo dei prodotti, le vendite e il magazzino in modo efficiente e organizzato.

## Classi e Attributi

### Classe Prodotto
La classe `Prodotto` rappresenta un singolo prodotto nel catalogo del negozio.

Attributi:
- `id`: identificativo univoco del prodotto
- `nome`: nome del prodotto
- `marca`: marca del prodotto
- `prezzo`: prezzo del prodotto
- `quantita`: quantità disponibile in magazzino
- `descrizione`: breve descrizione del prodotto
Classe Vendita
La classe `Vendita` rappresenta una singola transazione di vendita nel negozio.

Attributi:
- `id`: identificativo univoco della vendita
- `data`: data e ora della vendita
- `prodotti`: lista dei prodotti venduti
- `totale`: totale della vendita

