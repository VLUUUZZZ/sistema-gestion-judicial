# Arranque

1. Instala Git y un JDK 21 (recomendado Amazon Corretto 21):
   - Windows: `winget install Git.Git` y `winget install Amazon.Corretto.21.JDK`
   - macOS: `brew install --cask corretto@21`
2. Comprueba con `java -version` que aparezca la versión 21.
3. Clona el repo y compila:

       git clone https://github.com/sistema-gestion-judicial/sistema-gestion-judicial.git
       cd sistema-gestion-judicial
       ./mvnw verify

4. Abre la carpeta en tu IDE como proyecto Maven y elige JDK 21.
5. Nunca trabajes en `main`: crea una rama `tipo/modulo-descripcion` y abre un pull request.
