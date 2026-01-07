import 'package:flutter/material.dart';

void main() {
  runApp(const ElectproyApp());
}

class ElectproyApp extends StatelessWidget {
  const ElectproyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Electproy',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: const Color(0xFF330033)),
        useMaterial3: true,
      ),
      home: const ElectproyCalculator(),
    );
  }
}

class ElectproyCalculator extends StatefulWidget {
  const ElectproyCalculator({super.key});

  @override
  State<ElectproyCalculator> createState() => _ElectproyCalculatorState();
}

class _ElectproyCalculatorState extends State<ElectproyCalculator> {
  final TextEditingController _lecturaAnteriorController =
      TextEditingController();
  final TextEditingController _lecturaActualController =
      TextEditingController();
  final TextEditingController _diasConsumidosController =
      TextEditingController();

  @override
  void dispose() {
    _lecturaAnteriorController.dispose();
    _lecturaActualController.dispose();
    _diasConsumidosController.dispose();
    super.dispose();
  }

  void _calcularConsumo() {
    final lecturaAnterior = double.tryParse(_lecturaAnteriorController.text);
    final lecturaActual = double.tryParse(_lecturaActualController.text);
    final diasConsumidos = double.tryParse(_diasConsumidosController.text);

    if (lecturaAnterior == null ||
        lecturaActual == null ||
        diasConsumidos == null ||
        diasConsumidos <= 0) {
      _showMessage('Ingresa valores válidos para calcular.');
      return;
    }

    final consumo = ((lecturaActual - lecturaAnterior) / diasConsumidos) * 30;
    final consumoRedondeado = consumo.round();
    _showMessage('Lo consumido es $consumoRedondeado');
  }

  void _showMessage(String message) {
    showDialog<void>(
      context: context,
      builder: (context) {
        return AlertDialog(
          content: Text(message),
          actions: [
            TextButton(
              onPressed: () => Navigator.of(context).pop(),
              child: const Text('OK'),
            ),
          ],
        );
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          Positioned.fill(
            child: Container(
              decoration: const BoxDecoration(
                gradient: LinearGradient(
                  begin: Alignment.topCenter,
                  end: Alignment.bottomCenter,
                  colors: [
                    Color(0xFF2B0A0A),
                    Color(0xFF0E0404),
                  ],
                ),
              ),
            ),
          ),
          Align(
            alignment: Alignment.topCenter,
            child: Padding(
              padding: const EdgeInsets.only(top: 24),
              child: CircleAvatar(
                radius: 90,
                backgroundColor: const Color(0xFF3A0E0E),
                child: Icon(
                  Icons.person,
                  size: 110,
                  color: Colors.white.withOpacity(0.9),
                ),
              ),
            ),
          ),
          Center(
            child: SingleChildScrollView(
              padding: const EdgeInsets.symmetric(horizontal: 32),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  const SizedBox(height: 140),
                  const _FieldLabel(text: 'LECTURA ANTERIOR'),
                  _ElectproyField(
                    controller: _lecturaAnteriorController,
                    hintText: '0',
                  ),
                  const SizedBox(height: 12),
                  const _FieldLabel(text: 'LECTURA ACTUAL'),
                  _ElectproyField(
                    controller: _lecturaActualController,
                    hintText: '0',
                  ),
                  const SizedBox(height: 12),
                  const _FieldLabel(text: 'DIAS CONSUMIDO'),
                  _ElectproyField(
                    controller: _diasConsumidosController,
                    hintText: '0',
                  ),
                  const SizedBox(height: 24),
                  ElevatedButton(
                    style: ElevatedButton.styleFrom(
                      backgroundColor: const Color(0xFF660000),
                      foregroundColor: Colors.white,
                    ),
                    onPressed: _calcularConsumo,
                    child: const Text('OK'),
                  ),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }
}

class _FieldLabel extends StatelessWidget {
  const _FieldLabel({required this.text});

  final String text;

  @override
  Widget build(BuildContext context) {
    return Align(
      alignment: Alignment.centerLeft,
      child: Text(
        text,
        style: const TextStyle(
          color: Colors.white,
          fontWeight: FontWeight.bold,
        ),
      ),
    );
  }
}

class _ElectproyField extends StatelessWidget {
  const _ElectproyField({
    required this.controller,
    required this.hintText,
  });

  final TextEditingController controller;
  final String hintText;

  @override
  Widget build(BuildContext context) {
    return TextField(
      controller: controller,
      keyboardType: TextInputType.number,
      style: const TextStyle(color: Colors.white),
      decoration: InputDecoration(
        hintText: hintText,
        hintStyle: TextStyle(color: Colors.white.withOpacity(0.6)),
        filled: true,
        fillColor: const Color(0xFF140503),
        enabledBorder: OutlineInputBorder(
          borderSide: const BorderSide(color: Color(0xFF660000), width: 2),
          borderRadius: BorderRadius.circular(6),
        ),
        focusedBorder: OutlineInputBorder(
          borderSide: const BorderSide(color: Color(0xFF660000), width: 2),
          borderRadius: BorderRadius.circular(6),
        ),
      ),
    );
  }
}
