/*Exercício 2
Dado o código abaixo de um Map, imprima seu conteúdo conforme mostrado na saída*/
fun main() {
    val familiaMap: MutableMap<String, String> = mutableMapOf(
        Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca")
    )
    // Solução:
    familiaMap.forEach {
        println("${it.key}: ${it.value}")
    }
}
