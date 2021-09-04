/*
Exercício 4
Crie uma função de alta ordem genérica (xpto) que receba como parâmetro qualquer uma
das duas funções dadas no exercício 1 (soma e cat) e solte a seguinte saída.*/

fun main() {
    println(xpto(2, 3, ::somas))
    println(xpto("Jo", "ão", ::cat))
}

// Solucao
fun <Q> xpto(a: Q, b: Q, funcao: (Q, Q) -> Q): Q = funcao(a, b)
