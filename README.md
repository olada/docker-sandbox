# Docker Spielwiese

## VM aufsetzen

### VirtualBox Image beschaffen
* Herunterladen der OVA-Datei von Ubuntu 15.04
* _Appliance Importieren_ in VirtualBox
* _VT-x_ und _VT-d_ in den BIOS-Settings aktivieren (falls nicht bereits geschehen)
* VM ausführen
* in VM mit dem Default-User und Passwort = _reverse_ einloggen

### In der VM
* Links zu LibreOffice und Amazon aus dem Launcher entfernen
* Deutsches Tastatur-Layout hinzufügen
* Automatische Software Updates deaktivieren (wird nur in der VM gemacht! Stattdessen kann man sich eine VM mit einer neueren Version besorgen)
* Terminal öffnen
* `sudo apt-get update`
* `sudo apt-get -y install docker.io`
* `sudo service docker start`

## JAVA-HTTP-API für Container bereitstellen
* Über Spring Initialzr ein Projekt erzeugen und herunterladen
* * Maven Project
* * Spring Boot Version 1.5.3
* * Group: net.olada
* * Artifact: dockerintro
* * Dependencies: Jersey (JAX-RS)
