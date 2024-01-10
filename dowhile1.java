public class dowhile1 {
    public static void main(String[] args) {
        int totTempo = 2;
        int contMin = 0;
        int contSeg = 0;

        while (contMin < totTempo) {
            try {
                System.out.println("Assistindo filme. Se passaram "+contMin+" minuto(s) e "+contSeg+" segundo(s)");
                Thread.sleep(1000); // conta o tempo a cada 1 segundo.
                contSeg++;
                if (contSeg == 60) {
                    contMin++;
                    contSeg = 0;
                }
            } catch (Exception e) {
                System.out.println("Ocorreu o erro "+e);
            }
        }
        System.out.println("Filme encerrado.");
    }
}