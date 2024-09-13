# **Lastenheft: Pizza-Bestell- und Automatisierungssystem**

---

## **Inhaltsverzeichnis**

1. [Projektübersicht](#1-projektübersicht)
   - [Projektname](#12-projektname)
   - [Projektbeschreibung](#12-projektbeschreibung)
   - [Hauptfunktionen](#13-hauptfunktionen)

2. [Funktionale Anforderungen](#2-funktionale-anforderungen)
   - [Benutzeroberfläche (UI)](#21-benutzeroberfläche-ui)
   - [Back-End-Dienste (API)](#22-back-end-dienste-api)
   - [Automatisierungsgerät](#23-automatisierungsgerät)

3. [Technische Spezifikationen](#3-technische-spezifikationen)
   - [Technologien](#31-technologien)
   - [API-Spezifikationen](#32-api-spezifikationen)

4. [Nicht-funktionale Anforderungen](#4-nicht-funktionale-anforderungen)
   - [Leistung](#41-leistung)
   - [Zuverlässigkeit](#42-zuverlässigkeit)
   - [Benutzerfreundlichkeit](#43-benutzerfreundlichkeit)
   - [Sicherheit](#44-sicherheit)
   - [Skalierbarkeit](#45-skalierbarkeit)

5. [Meilensteine & Zeitplan](#5-meilensteine--zeitplan)
   - [Phase 1: Anforderungserhebung und Planung](#51-phase-1-anforderungserhebung-und-planung)
   - [Phase 2: Entwicklung](#52-phase-2-entwicklung)
   - [Phase 3: Testing](#53-phase-3-testing)
   - [Phase 4: Deployment](#54-phase-4-deployment)

6. [Risiken und Gegenmaßnahmen](#6-risiken-und-gegenmaßnahmen)
   - [Risiken](#61-risiken)
   - [Gegenmaßnahmen](#62-gegenmaßnahmen)

7. [Teamrollen](#7-teamrollen)
   - [Projektmanager](#71-projektmanager)
   - [Front-End-Entwickler](#72-front-end-entwickler)
   - [Back-End-Entwickler](#73-back-end-entwickler)
   - [Embedded Systems Engineer](#74-embedded-systems-engineer)
   - [Qualitätssicherung (QS)](#75-qualitätssicherung-qs)

8. [Abnahmekriterien](#8-abnahmekriterien)

---

## **1. Projektübersicht**

### **1.1 Projektname**
**Pizza-Bestell- und Automatisierungssystem**

### **1.2 Projektbeschreibung**
Ziel des Projekts ist es, ein automatisiertes Pizza-Bestellsystem zu entwickeln, bei dem Kunden Zutaten auswählen und ihre Pizza individuell anpassen können. Die Bestellung wird an einen Pizzaautomaten gesendet oder direkt vor Ort am Automaten bestellt. Der Automat bereitet die Pizza basierend auf den Benutzeranforderungen zu. Eine REST-API verwaltet die Interaktion zwischen dem Benutzer, dem Bestellsystem und dem Gerät.

### **1.3 Hauptfunktionen**
- Login 
- Liste der verfügbaren Zutaten
- Auswahl der Zutaten
- Anpassbare Pizza (z.B. Größe, Teigart, Beläge).
- Integration von Zahlungsanbietern (Kreditkarte, PayPal, kontaktloses Bezahlen vor Ort).
- Echtzeit-Verfolgung der Bestellung (Statusaktualisierungen).
- Geräteerkennung basierend auf dem Standort (nächstgelegenes Pizza-Gerät finden).
- Überprüfung ob die Zutaten abgelaufen sind.
- Meldung ob Zutaten fehlen oder abgelaufen sind.

---

## **2. Funktionale Anforderungen**

### **2.1 Benutzeroberfläche (UI)**
- Anzeige der verfügbaren Zutaten (Käse, Peperoni, Oliven, etc.).
- Ermöglichen der Auswahl von Pizzagrößen (klein, mittel, groß).
- Auswahl der Teigart (dünn, dick, glutenfrei).
- Preisaktualisierungen basierend auf Zutaten und Pizzagröße anzeigen.
- Option für Zahlungsmethoden (Kreditkarte, PayPal, Zahlung vor Ort über kontaktloses Zahlen) anbieten.
- Bestellstatus anzeigen (in Vorbereitung, im Ofen, abholbereit).
— Standort des nächsten Pizza-Geräts anzeigen (falls nicht vor Ort bestellt wird).

### **2.2 Back-End-Dienste (API)**
- Zutaten-API, um verfügbare Zutaten abzurufen.
- Bestell-API, um die Pizza-Bestellung aufzugeben.
- Zahlungs-API zur Abwicklung verschiedener Zahlungsmethoden.
- Bestellverfolgungs-API, um den Status der Pizza in Echtzeit zu liefern.
- Geräte-Standort-API, um den Standort des nächsten Pizza-Geräts zu ermitteln.

### **2.3 Automatisierungsgerät**
- Das automatisierte Gerät muss Bestellungen über die REST-API empfangen können.
- Das Gerät muss in der Lage sein, eine Pizza entsprechend den Benutzeranpassungen herzustellen.
- Das Gerät sollte den Bestellstatus in Echtzeit aktualisieren können (z. B. in Vorbereitung, im Ofen, abholbereit).
- Es muss eine Benutzeroberfläche vorhanden sein, die den Benutzer informiert, wenn die Pizza zur Abholung bereit ist.

---

## **3. Technische Spezifikationen**

### **3.1 Technologien**
- **Frontend**:  
  - HTML, CSS, JavaScript (React oder Angular)
- **Backend**:  
  - Node.js mit Express oder Python (Flask/Django) zur Verwaltung der REST-API
- **Datenbank**:  
  - MongoDB oder PostgreSQL zur Speicherung von Bestellungen, Benutzern und Lagerbeständen
- **Zahlungsintegration**:  
  - Stripe API für Kreditkartenzahlungen  
  - PayPal API für Online-Zahlungen
- **Automatisierungsgerät**:  
  - Eingebettetes System mit Mikrocontroller (z. B. Arduino)
  - Sensoren und Aktoren zur Steuerung des Pizza-Zubereitungsprozesses

### **3.2 API-Spezifikationen**

- **GET /ingredients**
  - **Beschreibung**: Abrufen einer Liste der verfügbaren Zutaten.
  - **Antwort**: JSON mit einem Array von Zutaten.

- **POST /order**
  - **Beschreibung**: Eine neue Pizza-Bestellung aufgeben.
  - **Anfrage**: JSON mit Zutaten, Pizzagröße, Teigart und Zahlungsdetails.
  - **Antwort**: Bestellbestätigung mit Bestell-ID.

- **GET /order/{orderId}/status**
  - **Beschreibung**: Abrufen des aktuellen Status der Pizza-Bestellung.
  - **Antwort**: JSON mit dem Bestellstatus (in Vorbereitung, im Ofen, abholbereit).

- **GET /device/location**
  - **Beschreibung**: Abrufen des Standorts des nächsten Pizza-Geräts.
  - **Antwort**: JSON mit Breitengrad, Längengrad und Adresse.

---

## **4. Nicht-funktionale Anforderungen**

### **4.1 Leistung**
- Das System sollte bis zu 1000 gleichzeitige Benutzer verarbeiten können.
- Bestellungen müssen innerhalb von 3 Sekunden verarbeitet und bestätigt werden.

### **4.2 Zuverlässigkeit**
- 99,9 % Verfügbarkeit für die Bestell-API.
- Das automatisierte Pizza-Gerät muss mit einer Ausfallrate von weniger als 1 % zuverlässig funktionieren.

### **4.3 Benutzerfreundlichkeit**
- Die Benutzeroberfläche muss sowohl auf mobilen Geräten als auch auf Desktops intuitiv und reaktionsschnell sein.
- Die Auswahl der Zutaten muss visuell klar und einfach zu bedienen sein.

### **4.4 Sicherheit**
- Zahlungsinformationen müssen verschlüsselt und sicher gespeichert werden.
- Das System muss den DSGVO-Richtlinien zur Verarbeitung personenbezogener Daten entsprechen.

### **4.5 Skalierbarkeit**
- Das System muss skalierbar sein, um wachsende Nachfrage insbesondere während Spitzenzeiten zu bewältigen.

---

## **5. Meilensteine & Zeitplan**

### **5.1 Phase 1: Anforderungserhebung und Planung**
- **Dauer**: 2 Wochen
- **Ergebnisse**: 
  - Abgeschlossenes Lastenheft
  - API-Design und Wireframes für die Benutzeroberfläche

### **5.2 Phase 2: Entwicklung**
- **Dauer**: 6 Wochen
- **Ergebnisse**: 
  - Funktionale Benutzeroberfläche für die Pizza-Bestellung
  - Backend-API für Bestellungen, Zutaten und Zahlungen
  - Erste Einrichtung des automatisierten Pizza-Geräts

### **5.3 Phase 3: Testing**
- **Dauer**: 3 Wochen
- **Ergebnisse**: 
  - Testautomatisierung für Bestellabwicklung und Geräteintegration
  - Leistungstests (1000+ Benutzer)

### **5.4 Phase 4: Deployment**
- **Dauer**: 2 Wochen
- **Ergebnisse**: 
  - Bereitstellung des Bestellsystems in der Produktionsumgebung
  - Einrichtung von Pizza-Automaten an mehreren Standorten

---

## **6. Risiken und Gegenmaßnahmen**

### **6.1 Risiken**
- Verzögerungen bei der Integration des Zahlungsgateways.
- Verbindungsprobleme zwischen dem Pizza-Gerät und der Backend-API.
- Mögliche Ausfallzeiten aufgrund hoher Auslastung.

### **6.2 Gegenmaßnahmen**
- Frühe Integrationstests mit Zahlungs-APIs (Stripe, PayPal).
- Implementierung robuster Fehlerbehandlungs- und Wiederholungsmechanismen für die Gerätekommunikation.
- Verwendung von Cloud-basiertem Auto-Scaling, um Spitzenlasten zu bewältigen.

---

## **7. Teamrollen**

### **7.1 Projektmanager**
- **Verantwortlichkeiten**: Überwachung des Projektzeitplans, Sicherstellung der Einhaltung von Meilensteinen.

### **7.2 Front-End-Entwickler**
- **Verantwortlichkeiten**: Entwicklung der Benutzeroberfläche für die Pizza-Anpassung, Bestellung und Verfolgung.

### **7.3 Back-End-Entwickler**
- **Verantwortlichkeiten**: Aufbau der REST-API, Verwaltung der Datenbank, Integration von Zahlungssystemen.

### **7.4 Embedded Systems Engineer**
- **Verantwortlichkeiten**: Entwicklung des automatisierten Pizza-Geräts, Sicherstellung der API-Integration.

### **7.5 Qualitätssicherung (QS)**
- **Verantwortlichkeiten**: Testen der Anwendung und des Geräts auf Fehler, Sicherstellung der Leistung und Sicherheit.

---

## **8. Abnahmekriterien**

Es soll möglich sein, eine Pizza an einem Demoautomaten zusammenzustellen, zu bestellen und zu erhalten.