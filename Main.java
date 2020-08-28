class Main {
  public static void main(String[] args) {

    Filme filme = new Filme();

    filme.setTitulo("As Branquelas");
    filme.setAno(2004);
    filme.setTipo("Comédia");

    System.out.println("Meu filme favorito é" + filme.getTitulo());
    System.out.println("De " + filme.getAno());
    System.out.println("Do gênero " + filme.getTipo());

  }
}