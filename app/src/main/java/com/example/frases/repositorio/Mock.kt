package com.example.frases.repositorio

import com.example.frases.infra.MotivationConstants
import kotlin.random.Random


data class Phrase (val description: String,val category: Int)

class Mock {

    private val ALL = MotivationConstants.FILTROFRASES.ALL
    private val MORNING = MotivationConstants.FILTROFRASES.MORNING
    private val HAPPY = MotivationConstants.FILTROFRASES.HAPPY

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossível, foi lá e fez.", HAPPY),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", HAPPY),
        Phrase("Quando está mais escuro, vemos mais estrelas!", HAPPY),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", HAPPY),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", HAPPY),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", HAPPY),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", MORNING),
        Phrase("Você perde todas as chances que você não aproveita.", MORNING),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", MORNING),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", MORNING),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", MORNING),
        Phrase("Se você acredita, faz toda a diferença.", MORNING),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", MORNING)
    )
    fun getPhrase(categoriaId: Int) : String {

        val filtered = mListPhrases.filter{ (it.category == categoriaId) || categoriaId == ALL}

        val rand = Random.nextInt(14)
        return filtered[rand].description
    }


}