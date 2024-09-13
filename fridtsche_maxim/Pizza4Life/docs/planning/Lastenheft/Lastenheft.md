

**LASTENHEFT**

**Version:** 0.1

**Datum:** 13.10.2024  
				

**DOKUMENTVERSIONEN**

| Versionsnr. | Datum | Autor | Änderungsgrund / Bemerkungen |
| :---- | :---- | :---- | :---- |
| 0.1 | 13.09.2024 |  | Ersterstellung |
|  |  |  |  |
|  |  |  |  |
|  |  |  |  |

**INHALT**

[1\. Einleitung	2](#einleitung)

[1.1 Allgemeines	3](#allgemeines)

[1.1.1 Ziel und Zweck dieses Dokuments	3](#ziel-und-zweck-dieses-dokuments)

[1.1.2 Projektbezug	3](#projektbezug)

[1.1.3 Abkürzungen	3](#abkürzungen)

[1.1.4 Ablage, Gültigkeit und Bezüge zu anderen Dokumenten	3](#ablage,-gültigkeit-und-bezüge-zu-anderen-dokumenten)

[1.2 Verteiler und Freigabe	3](#verteiler-und-freigabe)

[1.2.1 Verteiler für dieses Lastenheft	3](#verteiler-für-dieses-lastenheft)

[1.3 Reviewvermerke und Meeting-Protokolle	3](#reviewvermerke-und-meeting-protokolle)

[1.3.1 Erstes bis n-tes Review	3](#erstes-bis-n-tes-review)

[2\. Konzept und Rahmenbedingungen	3](#konzept-und-rahmenbedingungen)

[2.1 Benutzer / Zielgruppe	4](#benutzer-/-zielgruppe)

[2.2 Ziele des Anbieters	4](#ziele-des-anbieters)

[2.3 Ziele und Nutzen des Anwenders	4](#ziele-und-nutzen-des-anwenders)

[2.4 Systemvoraussetzungen	4](#systemvoraussetzungen)

[2.5 Ressourcen	4](#ressourcen)

[3\. Anforderungsbeschreibung	4](#anforderungsbeschreibung)

[3.1 1\. Anforderung	5](#1.-anforderung)

[3.1.1 Beschreibung	5](#beschreibung)

[3.1.2 Wechselwirkungen	5](#wechselwirkungen)

[3.1.3 Risiken	5](#risiken)

[3.1.4 Vergleich mit bestehenden Lösungen	5](#vergleich-mit-bestehenden-lösungen)

[3.1.5 Schätzung des Aufwands	5](#schätzung-des-aufwands)

[3.2 2\. Anforderung	5](#2.-anforderung)

[3.2.1 Beschreibung	5](#beschreibung-1)

[3.2.2 Wechselwirkungen	5](#wechselwirkungen-1)

[3.2.3 Risiken	5](#risiken-1)

[3.2.4 Vergleich mit bestehenden Lösungen	6](#vergleich-mit-bestehenden-lösungen-1)

[3.2.5 Schätzung des Aufwands	6](#schätzung-des-aufwands-1)

[**4\. Lieferumfang	6**](#lieferumfang)

[**5\. Abnahmekriterien	6**](#abnahmekriterien)

[5.1 Funktionale Abnahmekriterien	6](#5.1-funktionale-abnahmekriterien)

[5.2 Nicht-funktionale Abnahmekriterien	7](#5.2-nicht-funktionale-abnahmekriterien)

[6\. Anhang	7](#anhang)

1. # **Einleitung** {#einleitung}

   1. ## **Allgemeines**  {#allgemeines}

      1. ### **Ziel und Zweck dieses Dokuments** {#ziel-und-zweck-dieses-dokuments}

Dieses Lastenheft beschreibt die Anforderungen an die Entwicklung eines vollautomatisierten Pizza-Automaten, der sowohl Vor-Ort-Bestellungen als auch Remote-Bestellungen ermöglicht. Ziel ist es, einen zuverlässigen und skalierbaren Automaten zu entwickeln, der moderne Bezahlsysteme und Benutzeroberflächen integriert.  

2. ### **Projektbezug** {#projektbezug}

Das Projekt steht im Zusammenhang mit der Automatisierung im Bereich Gastronomie, insbesondere für öffentliche Einrichtungen und kommerzielle Standorte wie Bahnhöfe oder Flughäfen.

3. ### **Abkürzungen** {#abkürzungen}

- **API**: Application Programming Interface  
- **HTTP**: Hypertext Transfer Protocol  
- **REST**: Representational State Transfer

  4. ### **Ablage, Gültigkeit und Bezüge zu anderen Dokumenten** {#ablage,-gültigkeit-und-bezüge-zu-anderen-dokumenten}

Das Dokument wird im Projektsystem abgelegt und bleibt bis zur Fertigstellung und Abnahme des Projekts gültig.

2. ## **Verteiler und Freigabe** {#verteiler-und-freigabe}

   1. ### **Verteiler für dieses Lastenheft** {#verteiler-für-dieses-lastenheft}

| Rolle | Name | Telefon | E-Mail | Bemerkungen |
| :---- | :---- | :---- | :---- | :---- |
| Projektleiter |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |

   3. ## **Reviewvermerke und Meeting-Protokolle**  {#reviewvermerke-und-meeting-protokolle}

      1. ### **Erstes bis n-tes Review** {#erstes-bis-n-tes-review}

- noch nicht passiert \-

2. # **Konzept und Rahmenbedingungen** {#konzept-und-rahmenbedingungen}

   1. ## **Benutzer / Zielgruppe** {#benutzer-/-zielgruppe}

Die Zielgruppe dieses Projekts sind Unternehmen im Gastronomiebereich, die automatisierte Essenslieferungen anbieten möchten.

2. ## **Ziele des Anbieters**  {#ziele-des-anbieters}

Der Anbieter zielt darauf ab, eine innovative Lösung zu entwickeln, die den Endkunden rund um die Uhr frische Pizza zur Verfügung stellt.

3. ## **Ziele und Nutzen des Anwenders** {#ziele-und-nutzen-des-anwenders}

Anwender können bequem vor Ort oder remote ihre Pizza bestellen und dabei verschiedene Zahlungsmethoden nutzen. Der Automat reduziert Wartezeiten und bietet eine hohe Verfügbarkeit.

4. ## **Systemvoraussetzungen** {#systemvoraussetzungen}

- API-Schnittstelle basierend auf REST und JSON.  
- Lokale Kommunikation erfolgt über HTTP unter Verwendung von OpenAPI-Spezifikationen.

  5. ## **Ressourcen** {#ressourcen}

- Software: Angular für die GUI, REST API für die Backend-Kommunikation.  
- Hardware: Automaten mit Bildschirm und Zahlungsterminals.

3. # **Anforderungsbeschreibung** {#anforderungsbeschreibung}

   1. ## **1\. Anforderung** {#1.-anforderung}

| Nr. / ID | 1 | Nichttechnischer Titel |  | Kiosk-Anwendung zur Pizza-Bestellung |  |  |
| :---- | :---- | :---- | :---- | :---- | :---- | :---- |
| **Quelle** | Kunde |  | **Verweise** |  | **Priorität** | Hoch |

      1. ### **Beschreibung** {#beschreibung}

Der Pizza-Automat benötigt eine Kiosk-Anwendung, die den Endnutzern die Auswahl und Bestellung von Pizzen ermöglicht. Die Anwendung muss auf einem Bildschirm laufen, intuitiv bedienbar sein und verschiedene Optionen zur Anpassung der Zutaten bieten.	

2. ### **Wechselwirkungen** {#wechselwirkungen}

Die Kiosk-Anwendung ist mit der API verbunden, die Bestellungen und den Status des Automaten überwacht.

3. ### **Risiken** {#risiken}

Fehlerhafte Eingaben oder Abstürze der Anwendung könnten zu Verzögerungen führen.

4. ### **Vergleich mit bestehenden Lösungen** {#vergleich-mit-bestehenden-lösungen}

Bestehende Automaten bieten oft nur begrenzte Anpassungsoptionen oder keine Remote-Bestellung.

5. ### **Schätzung des Aufwands** {#schätzung-des-aufwands}

Der Entwicklungsaufwand für die Kiosk-Anwendung wird auf ca. 40 Stunden geschätzt.

2. ## **2\. Anforderung**  {#2.-anforderung}

| Nr. / ID | 2 | Nichttechnischer Titel |  | Remote-Bestellplattform |  |  |
| :---- | :---- | :---- | :---- | :---- | :---- | :---- |
| **Quelle**	 | Kunde |  | **Verweise** |  | **Priorität** | Niedrig |

   1. ### **Beschreibung** {#beschreibung-1}

Eine Website ermöglicht es den Nutzern, Bestellungen remote aufzugeben. Die Website kommuniziert in Echtzeit mit dem Pizza-Automaten.

2. ### **Wechselwirkungen** {#wechselwirkungen-1}

Verbindung zur API und zu den Zahlungssystemen. Bestellungen werden synchron mit den Automaten verarbeitet.

3. ### **Risiken** {#risiken-1}

Hohe Last auf dem Server könnte die Bestellung verzögern.

4. ### **Vergleich mit bestehenden Lösungen** {#vergleich-mit-bestehenden-lösungen-1}

Ähnliche Systeme bieten oft keine vollständige Integration in Automaten.

5. ### **Schätzung des Aufwands** {#schätzung-des-aufwands-1}

Der Entwicklungsaufwand wird auf ca. 40 Stunden geschätzt.

4. # **Lieferumfang** {#lieferumfang}

Das abzuliefernde Produkt soll den oben genannten Anforderungen entsprechen und den beschriebenen Funktionsumfang besitzen. Des Weiteren ist eine Dokumentation über die gesamte Entwicklung anzufertigen, inkl. der durchgeführten Tests. 

| Ereignis | Plan | Soll | Ist |  |
| :---- | :---- | :---- | :---- | :---- |
| Pflichtenheft | 13.09.2024 |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |

### 

5. # **Abnahmekriterien** {#abnahmekriterien}

### **5.1 Funktionale Abnahmekriterien** {#5.1-funktionale-abnahmekriterien}

1. **Kiosk-Anwendung:**  
-  Der Benutzer muss in der Lage sein, problemlos über den Touchscreen eine Pizza zu bestellen und die gewünschten Zutaten auszuwählen.  
- Die Anwendung muss verschiedene Zahlungsmethoden unterstützen (Kartenzahlung und Mobile Payments).  
- Die Bestellung muss korrekt im System registriert und an die Zubereitungseinheit des Automaten weitergeleitet werden.

**2\.	Remote-Bestellplattform:**

- Die Webplattform muss es ermöglichen, Bestellungen in Echtzeit an den entsprechenden Automaten zu übermitteln.  
- Der Benutzer kann sich in ein Kundenkonto einloggen, eine Bestellung aufgeben und die Bestellung verfolgen.  
- Zahlungen auf der Plattform müssen sicher und problemlos durchgeführt werden.

**3\. 	Alarmsystem und Geräteüberwachung:**

- Das integrierte Alarmsystem muss Fehlfunktionen, niedrige Zutatenbestände oder andere Störungen korrekt melden.  
- Automatische Benachrichtigungen an den Betreiber bei auftretenden Problemen sind vollständig implementiert.

### **5.2 Nicht-funktionale Abnahmekriterien** {#5.2-nicht-funktionale-abnahmekriterien}

1. Benutzerfreundlichkeit:  
- Die grafischen Oberflächen (Kiosk und Webplattform) müssen intuitiv und leicht verständlich sein, sodass keine Schulung der Endnutzer notwendig ist.  
- Die Antwortzeiten der Kiosk-Anwendung und der Remote-Bestellplattform dürfen 1 Sekunde nicht überschreiten.  
2. Zuverlässigkeit:  
- Das System muss eine Verfügbarkeit von 99,9 % gewährleisten.  
- Der Automatenbetrieb darf nicht länger als 2 Stunden pro Monat aufgrund von Wartung oder Störungen unterbrochen werden.  
3. Skalierbarkeit:  
- Das System muss leicht auf weitere Automaten oder zusätzliche Funktionen erweiterbar sein.  
- Die Architektur muss so ausgelegt sein, dass sie bis zu 100 Automaten ohne signifikanten Leistungsverlust unterstützt.

6. # **Anhang** {#anhang}

ER-Modell:  
hier 
ER-Diagramm  
hier
