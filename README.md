uwu owo :3c

#Konzept und Regeln
Am Anfang der Runde: Jeder kriegt ein (zunächst) festes Startland (P1 kriegt USA, P2 kriegt Russland) (später wählbar)
Zugablauf:
- evtl. Katastrophen
- Geldabwurf
- 4 Aktionen
**Mögliche Aktionen:**
- Angrenzendes Land kaufen (manchmal auch zusätzliche Requirements)
- Industrie upgraden
- Events entwickeln
- Events nutzen

#Industrien
Jedes Land hat jede Industrie, aber unterschiedliche Effizienzfaktoren, die ändern, wie viel Geld/Level diese Industrie in diesem Land
bei jedem Geldabwurf bringt
Formel (grob): Basisertrag (1000€) * Effizienzfaktor * Level * Eventfaktor
Levels sind bei 10 gecappt
Bei einseitiger Ausreizung bestimmter Industrien entstehen Katastrophen eventuell

**Industriearten:**
- Bergbau
- Landwirtschaft
- Warenproduktion
- Maschinenbau
- Tourismus
- Energie
- *Wissenschaft und Innovation (bringt kein Geld, nur zufällige Events alle paar Geldabwürfe)*

#Events
**2 Typen**
- Verbesserungs-Events: Verbessern Sachen bei einem selbst, z. B. erhöhen Cap bei einer Industrie oder reduzieren Upgrade-Preise eines ganzen Lands permanent
- Schaden-Events: Schaden dem Gegner

#Klassennamen
- UI -> Greift auf Game zu
- CountryBorderLibrary -> Welche Länder grenzen an welche?
- CountryDataLibrary -> Beinhält fixe Informationen über Länder (Effizienzfaktor, etc.)
- Player -> Speichert Status eines Landes im Spiel (Gekauft, Levels der Industrien, etc.)
- GameHandler -> Verknüpft alle Klassen, erstellt 4 instanzen von Player ( Player1, Player2, currentPlayer, otherPlayer)


**GUI-Elementnamen**
pTurnField
p1/p2MoneyField

p1/p2StatsArea

buyCountriesButton
upgradeButton
eventManagerButton
backButton
finishTurnButton

#To Do
**Fixes**
Theodor: Keine
Timo:
- Gelbe Errors in der UI-Klasse fixen
**Features**
- Länder kaufen
- UI-Design
