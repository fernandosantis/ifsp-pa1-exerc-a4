/*Exercício 01
Dado o código abaixo, a partir da lista já criada crie uma lista que contenha somente os
cursos que tenham a palavra Sistemas em qualquer parte do nome. Imprima essa nova
lista no formato dado como exemplo*/
fun main() {

    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas"
    )
    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    // Solução
    val listaResultados: List<String> = listaCursos.filter { it.contains("Sistemas") }
    listaResultados.forEach {
        println("${listaResultados.indexOf(it)} - $it")
    }
}
