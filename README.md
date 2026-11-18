# FitZone CI/CD

Caso académico de integración y despliegue continuos (GitHub Actions) para el módulo de
facturación de FitZone Perú S.A.C. (empresa ficticia). Calcula el total de un comprobante
(subtotal + IGV 18 %).

## Ramas
- `main`: producción (dispara el CD)
- `develop`: integración (dispara el CI)
- `feature/*`: un cambio por rama

## Workflows
| Archivo | Evento | Función |
|---|---|---|
| `ci.yml` | push a develop y feature/**; PR a develop | Compila y prueba |
| `qa.yml` | PR a main | Validación de QA y reporte |
| `cd.yml` | push a main | Empaqueta y despliega (simulado) |

## Probar en local (requiere JDK 17)
```bash
mkdir -p out
javac -d out src/*.java
javac -d out -cp out test/*.java
java -cp out CalculadoraFacturaTest
echo 100 | java -cp out Main
```
