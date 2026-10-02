fun main() {
  print("Digite um número inteiro: ")
  val numero = readln().toInt()

  print("TABUADA DO $numero")
for (multiplicador in 1..10) {
  val resultado = numero * multiplicador
  print("$numero x $multiplicador = $resultado")
  }
}
