## [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)
## Ingeniería Web: Visión General (IWVG) DevOps
> Este proyecto es una Plantilla de apoyo docente de la asignatura.

### :gear: Instalación del proyecto
1. Clonar el repositorio en tu equipo, **mediante consola**:
```sh
> cd <folder path>
> git clone https://github.com/:owner/:repo
```
2. Importar el proyecto mediante **IntelliJ IDEA**
   1. **Import Project**, y seleccionar la carpeta del proyecto.
   1. Marcar **Create Project from external model**, elegir **Maven**.
   1. **Next** … **Finish**.
   
 ### Estado del código
 [![Build Status](https://travis-ci.org/sevenman7/iwvg-devops-manuel-martin.svg?branch=develop)](https://travis-ci.org/sevenman7/iwvg-devops-manuel-martin)
 [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=es.upm.miw%3Aiwvg-devops-manuel-martin&metric=alert_status)](https://sonarcloud.io/dashboard?id=es.upm.miw%3Aiwvg-devops-manuel-martin)
 [![BCH compliance](https://bettercodehub.com/edge/badge/sevenman7/iwvg-devops-manuel-martin?branch=develop)](https://bettercodehub.com/)
 [![Heroku broken](https://iwvg-devops-manuel-martin.herokuapp.com/system/version-badge)](https://iwvg-devops-manuel-martin.herokuapp.com/swagger-ui.html)
 
Ultimo commit antes del ultimo Sprint 4ca1a1b
    Double findFirstDecimalFractionByUserName(String name);
    Stream<Double> findDecimalFractionByUserName(String name);
    Stream<String> findUserNameByAnyImproperFraction();
    Stream<String> findUserIdByAnyProperFraction();