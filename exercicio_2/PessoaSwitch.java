public class Pessoa {
			private int idade;
      private String nome;
      private double salario;

	public Pessoa (String nome, int idade ){
    this.nome = nome;
		this.idade= idade + 5 * 3 ;
	}

     private void dummy(double param) {
         while(a < b) {
            // processamento
            if (a>b) break;
         }

				 switch(idade){
					 case 25:
					 		this.salario = 11111.00;
							break;
					 case 30:
							 this.salario = 15111.00;
							 break;
						case 45:
						   this.salario = 13111.00;
							 break;
						default:
						   this.salario = 9000.00;
							 break;
				 }
     }
}
