/*Exercício 3
Dadas as funções abaixo e as chamadas na função main. Crie duas funções (foo e bar) de
alta ordem que recebam essas funções como parâmetro e soltem a seguinte saída.*/

fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}$j"

fun main() {
    println(foo(10, 20, ::somas))
    println(bar("Ped", "ro", ::cat))
}
// Solucção

fun foo(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}

fun bar(a: String, b: String, funcao: (String, String) -> String) = funcao(a, b)
