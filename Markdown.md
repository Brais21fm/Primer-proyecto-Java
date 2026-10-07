# Vivienda en España
El desahucio de *Maricarmen* en **Madrid**, hizo que bastante gente se ~~manifestada~~ en toda **España**.

## Problemas de la vivienda
1. Precios altos
2. Falta de oferta
3. Acceso juvenil difícil

## Que debe de hacer le gobierno
- [x] Construir más viviendas
- [ ] Limitar los precios del alquiler
- [x] Ayudas para la entrada
- [ ] Desproteger al propietario

---

## Deuda en Europa

| País              | Deuda Pública (% del PIB) |
| :---              | :---:                     |
| Grecia            | 143,5%                    |
| Italia            | 138,9%                    |
| Francia           | 117,6%                    |
| Bélgica           | 109,1%                    |
| España            | 101,6%                    |

## Blackquote

> "Pedir prestado hoy es pagar impuestos mañana"

## Imágenes

![Deuda en España](https://www.airef.es/wp-content/uploads/2026/03/Deuda-2025.jpg)

![Paises de la UE con más deuda](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxI5zGZIMwdaZdwBzvqLhiF2bWXGY_PZL8aLSVXxeeBW9z5bCs)

## Noticias

[El euro cae mientras el dólar sube](https://www.reuters.com/world/asia-pacific/dollar-holds-losses-markets-await-fed-minutes-speakers-2026-10-07/)

[Huelga general en España](https://www.reuters.com/business/world-at-work/spanish-unions-call-general-strike-november-11-weeks-before-snap-election-2026-10-07/)

## Codigo Java

```java
class MercadoForex {
    public static void main(String[] args) {
        double euroAyer = 1.10;
        double euroHoy = 1.12;

        System.out.println("Precio ayer: " + euroAyer + " $");
        System.out.println("Precio hoy: " + euroHoy + " $");

        // El programa compara los dos valores automáticamente
        if (euroHoy > euroAyer) {
            System.out.println("¡El Euro está SUBIENDO frente al Dólar! 📈");
        } else {
            System.out.println("El Euro está bajando o se mantiene igual. 📉");
        }
    }
}
```


