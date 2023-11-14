public class Donut{
    private String sabor;
    private double preco;
    private String cobertura;

    public void Produto(String nome, double preco, String cobertura){
      this.sabor = nome;
      this.preco = preco;
      this.cobertura = cobertura;
    }
    
    public String getSabor(){
      return this.sabor;
    }
    
    public double getPreco(){
      return this.preco;
    }
    
    public String getCobertura(){
      return this.cobertura;
    }

  }