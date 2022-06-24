package aula08.Ex1;

public class Ex1 {
    
    public static void main(String[] args){

        Veiculo viaturaMostKM = null;

        //create a new instance of empresa
        Empresa empresa1 = new Empresa("Empresa1", "1000-999", "email@ua.pt");
        
        //create Motociclos
        System.out.println("Motociclos:");
        Motociclo motociclo1 = new Motociclo("11-AA-11", "Marca1", "m1", 10, "estrada");
        motociclo1.trajeto(10);
        Motociclo motociclo2 = new Motociclo("22-BB-22", "Marca2", "m2", 15, "estrada");
        motociclo2.trajeto(20);
        Motociclo motociclo3 = new Motociclo("33-CC-33", "Marca3", "m3", 20, "desportivo");

        //create AutomovelLigeiro
        System.out.println("\nAutomóveis Ligeiros:");
        Ligeiro ligeiro1 = new Ligeiro("44-DD-44", "Marca1", "m1", 100, 1111, 50);
        ligeiro1.trajeto(25);
        System.out.println(ligeiro1.getMatricula());
        Ligeiro ligeiro2 = new Ligeiro("55-EE-55", "Marca2", "m2", 200, 2222, 100);
        ligeiro2.trajeto(50);
        System.out.println(ligeiro2.getPotencia());

        //create Taxi
        System.out.println("\nTaxi:");
        Taxi taxi1 = new Taxi("66-FF-66", "Marca1", "m1", 100, 1111, 50, 1111111);
        taxi1.trajeto(60);
        System.out.println(taxi1.getMatricula());

        //create Pesado Mercadorias/Passageiros
        System.out.println("\nPesados:");
        PesadoMercadorias pesado1 = new PesadoMercadorias("77-GG-77", "Marca1", "m1", 100, 1111, 1111111, 10000);
        pesado1.trajeto(70);
        PesadoPassageiros pesado2 = new PesadoPassageiros("88-HH-88", "Marca2", "m2", 200, 2222, 2222222, 44);
        pesado2.trajeto(80);

        //add viaturas to empresa
        empresa1.addViatura(motociclo1);
        empresa1.addViatura(motociclo2);
        empresa1.addViatura(motociclo3);

        empresa1.addViatura(ligeiro1);
        empresa1.addViatura(ligeiro2);

        empresa1.addViatura(taxi1);

        empresa1.addViatura(pesado1); //pesadoMercadorias
        empresa1.addViatura(pesado2); //pesadoPassageiros


        //toString empresa
        System.out.println("\n" + empresa1.toString());

        //get viaturas and "toString" each one
        System.out.println("\nViaturas da empresa " + empresa1.getNome() + ":");
        for ( Veiculo viatura : empresa1.getViaturas() ) {
            System.out.println(viatura.toString());
        }

        //Viatura com maior nº km percorridos
        for ( Veiculo viatura : empresa1.getViaturas() ) {
            if (viaturaMostKM == null) {

                viaturaMostKM = viatura;

            } else if (viatura.distanciaTotal() > viaturaMostKM.distanciaTotal()) {

                viaturaMostKM = viatura;

            }
        }
        System.out.println("\nViatura com maior nº km percorridos: " + viaturaMostKM.getMatricula());
        System.out.println("Detalhes: " + viaturaMostKM.toString());

    }
}
