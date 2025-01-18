
# Distributeur Automatique de Billets (DAB)

## Description

Le **Distributeur Automatique de Billets (DAB)** est une application de gestion bancaire en Java SE, développée en utilisant les technologies **Swing**, **AWT**, et **MySQL**. Cette application simule un système de guichet automatique bancaire (ATM) permettant à un utilisateur d'effectuer différentes transactions, telles que le retrait d'argent, le dépôt, la consultation de solde, et plus encore.

### Fonctionnalités principales

- **Login sécurisé** : Identification de l'utilisateur par un numéro de carte et un code PIN.
- **Gestion des transactions** :
  - **Dépôt d'argent** : Permet à l'utilisateur de déposer des fonds sur son compte.
  - **Retrait d'argent** : Permet à l'utilisateur de retirer des fonds, avec un montant maximum de retrait.
  - **Consultation du solde** : Affiche le solde actuel de l'utilisateur.
  - **Consultation des relevés** : Affiche un relevé des transactions passées (mini-statement).
  - **Changement de PIN** : Permet à l'utilisateur de modifier son code PIN.
  - **Retrait rapide** : Offre des montants prédéfinis pour un retrait rapide.

- **Gestion des utilisateurs** :
  - **Inscription** : Permet à un nouvel utilisateur de créer un compte.
  - **Vérification et sécurité** : Chaque action de transaction nécessite une validation par PIN.

### Technologies Utilisées

- **Java SE** (Standard Edition)
- **Swing** et **AWT** pour la conception de l'interface graphique (GUI)
- **MySQL** pour la gestion des données et des transactions
- **JDBC** pour la connexion à la base de données MySQL

### Installation

1. Clonez ce dépôt sur votre machine locale :
   ```bash
   git clone https://github.com/votre-utilisateur/Distributeur-Automatique-de-Billets-DAB.git
