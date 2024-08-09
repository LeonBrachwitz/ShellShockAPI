# ShellShockAPI
REST-API für meine Prüfungsleistung im Modul Cyber Attack &amp; Threat Management

## Thema der Prüfungsleistung: 
From API Endpoint to Persistent Exploit: Reverse Shell Deployment in Open Source Projects

Diese simple Java REST-API dient lediglich zur Demonstration einer Sicherheitslücke. 
Der Beispielcode bietet einen Rest-Endpunkt an, welcher den aktuellen Spielstand eines Sportereignisses liefern soll. 
Hinter dem Aufruf der Konfiguration ist ein Aufruf eines Shell-Scripts versteckt, welche eine Reverseshell zum System des Angreifers herstellt.

Das Script ```StartReverseShell.sh``` zeigt ein Script, welches die Befehle zur Installation von Netcat und Nmap ausführt. 
Das Script ```StartReverseShell.sh``` zeigt ein Script, welches die gleiche Funktionalität beinhaltet, allerdings ist das Script obfuskiert worden um von der eigentlichen Funktionalität abzulenken. 