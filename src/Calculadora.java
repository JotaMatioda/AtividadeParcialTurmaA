public class Calculadora {

        public double somar(double a, double b) {
            return a + b;
        }
    
        public double subtrair(double a, double b) {
            return a - b;
        }
    
        public double multiplicar(double a, double b) {
            return a * b;
        }
    
        public double dividir(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Divisor não pode ser zero");
            }
            return a / b;
        }
    
        public static void main(String[] args) {
            Calculadora calc = new Calculadora();
            System.out.println("Soma: " + calc.somar(10, 5));
            System.out.println("Subtração: " + calc.subtrair(10, 5));
            System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
            System.out.println("Divisão: " + calc.dividir(10, 5));
        }
}
