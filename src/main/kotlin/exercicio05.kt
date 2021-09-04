/*Exercício 5
Dadas as funções abaixo:
1. Na função main, faça chamadas normais das funções de alta ordem passando as funções
somas, multiplica e raizQuadrada como parâmetro de acordo com a equivalência dos
parâmetros.
2. Na função main, faça chamadas das funções de alta ordem passando expressões
lambdas equivalentes as funções soma, multiplica e raizQuadrada.*/
// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int {
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int {
    return f(i, j)
}
// Funções
fun somas(i: Int, j: Int): Int {
    return i + j
}
fun multiplica(i: Int, j: Int): Int {
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}
// Solução:
// Main
fun main() {
    // Valores
    val v1 = 25
    val v2 = 9
    // 1. Chamadas do primeiro passo
    println("Soma de ($v1 e $v2): ${processaInteiros(v1,v2, ::somas)}")
    println("Multimplicacao de ($v1 e $v2): ${processaInteiros(v1,v2, ::multiplica)}")
    println("Raiz Quadrada de $v1: ${processaInteiro(v1, ::raizQuadrada)}")
    println("Raiz Quadrada de $v2: ${processaInteiro(v2, ::raizQuadrada)}")
// 2. Chamadas do segundo passo
    println("Soma de ($v1 e $v2): ${processaInteiros(v1,v2) {a: Int, b: Int -> somas(a,b)}}")
    println("Multimplicacao de ($v1 e $v2): ${processaInteiros(v1,v2) {a: Int, b: Int -> multiplica(a,b)}}")
    println("Raiz Quadrada de $v1: ${processaInteiro(v1) {v1 -> raizQuadrada(v1)}}")
    println("Raiz Quadrada de $v2: ${processaInteiro(v2) {v2 -> raizQuadrada(v2)}}")
}
