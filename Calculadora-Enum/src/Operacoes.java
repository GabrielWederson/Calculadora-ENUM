public enum Operacoes{
    SOMA("+") {
        @Override
        public double executar(double a, double b) {
            return a + b;
        }
    },
    SUBTACAO("-") {
        @Override
        public double executar(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICACAO("*") {
        @Override
        public double executar(double a, double b) {
            return a * b;
        }
    },
    DIVISAO("/") {
        @Override
        public double executar(double a, double b) {
            if(b == 0) throw new ArithmeticException("Divisão por zero!");
            return a / b;
        }
    };

    private final String simbolo;

    Operacoes(String simbolo) {
        this.simbolo = simbolo;
    }

    public abstract double executar(double a, double b);

    public String getSimbolo() {
        return simbolo;
    }

    public static Operacoes fromSimbolo(String simbolo) {
        for (Operacoes op : values()) {
            if (op.simbolo.equals(simbolo)) return op;
        }
        throw new IllegalArgumentException("Operação inválida: " + simbolo);
    }
}