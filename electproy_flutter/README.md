# electproy_flutter

Flutter version of the "Proyecto electproy" Swing calculator. It reproduces the
three input fields (lectura anterior, lectura actual, días consumido) and the
"OK" button that computes the monthly consumption:

```
((lecturaActual - lecturaAnterior) / diasConsumidos) * 30
```

## Run

```bash
flutter pub get
flutter run
```
