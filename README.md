# README -- TP Monitoring Spring Boot / Prometheus / Grafana

## Étape 1 : Initialisation du projet Spring Boot

-   Création du projet avec Spring Initializr.
-   Ajout des dépendances : Web, Actuator, Micrometer Prometheus,
    Lombok.
-   Mise en place d'un contrôleur REST simple.
-   Création d'un service simulant un traitement.
-   Configuration initiale du logging.

## Étape 2 : Activation de Spring Boot Actuator

-   Activation de l'exposition des endpoints Actuator.
-   Activation des détails du health check.
-   Mise en place de l'endpoint `/actuator`.
-   Ajout d'informations personnalisées.
-   Vérification via `/actuator/health`, `/actuator/info`,
    `/actuator/metrics`.




    <img width="1708" height="194" alt="image" src="https://github.com/user-attachments/assets/eac675f2-3600-4b86-a112-f3d464a1e404" />


    <img width="1670" height="302" alt="image" src="https://github.com/user-attachments/assets/1956ed1f-e4cd-496c-b09c-e5612521a36c" />


    <img width="1753" height="251" alt="image" src="https://github.com/user-attachments/assets/40707e0b-5a96-40b7-8ede-df395b0b47fa" />



<img width="1391" height="442" alt="image" src="https://github.com/user-attachments/assets/7104b831-d4ee-4b2d-988b-f9df9d84c653" />




## Étape 3 : Journalisation (Logging)

-   Configuration des niveaux de logs.
-   Création d'un fichier de logs.
-   Personnalisation du format console.
-   Suivi des logs en temps réel.

<img width="1749" height="445" alt="image" src="https://github.com/user-attachments/assets/f31c88d9-ffb6-44be-b180-d13004294b80" />


## Étape 4 : Exportation des métriques vers Prometheus

-   Activation du registre Prometheus.
-   Exposition des métriques via `/actuator/prometheus`.
-   Vérification des métriques JVM, HTTP, CPU.



<img width="669" height="722" alt="image" src="https://github.com/user-attachments/assets/d0db5832-5446-45d8-b581-d116710d6b4c" />

## Étape 5 : Installation et configuration de Prometheus

-   Téléchargement et lancement.
-   Configuration du scraping pour l'application Spring Boot.
-   Vérification via l'interface Prometheus.
-   Premières requêtes PromQL.

<img width="1056" height="704" alt="image" src="https://github.com/user-attachments/assets/5c5e202e-bcb3-4ec8-8d50-2525b2d85460" />
<img width="1755" height="510" alt="image" src="https://github.com/user-attachments/assets/9be39b7b-1b17-4c81-bdb2-52486413db4d" />
<img width="1223" height="668" alt="image" src="https://github.com/user-attachments/assets/0a8ea54e-41c7-46a4-9be7-7457d8a4c88e" />
<img width="1184" height="599" alt="image" src="https://github.com/user-attachments/assets/87506145-caf2-4d04-89e3-b8c6cb51de5a" />


## Étape 6 : Visualisation avec Grafana

-   Installation et lancement de Grafana.
-   Ajout de Prometheus comme datasource.
-   Import d'un Dashboard existant (ID 4701).
-   Visualisation des métriques JVM, CPU, HTTP, temps de réponse.


<img width="1426" height="722" alt="image" src="https://github.com/user-attachments/assets/db2b4a4d-3d86-4fd0-a651-c845a517a264" />


<img width="1526" height="718" alt="image" src="https://github.com/user-attachments/assets/68af5d06-d16a-4c55-83ab-0e07de8034b5" />





## Étape 7 : Alertes et supervision proactive

### Côté Prometheus

-   Création d'un fichier de règles.
-   Mise en place d'une alerte de disponibilité.
-   Vérification via l'interface `/alerts`.

### Côté Grafana

-   Création d'une règle d'alerte basée sur PromQL.
-   Condition sur la latence.
-   Configuration d'un canal de notification (email, Slack...).


