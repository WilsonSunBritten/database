package com.simple.database

import com.simple.database.entities.TestTableEntity
import com.simple.database.entities.jsonobjects.JsonObject
import com.simple.database.repositories.TestTableRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext

@SpringBootTest
@DirtiesContext
class CallTests(
        @Autowired
        private val testTableRepository: TestTableRepository
) {
    @Test
    fun someTest(){
        val complexString = "ComplexString"
        val entity = TestTableEntity(
                testSimpleData = "test data",
                testComplexData = JsonObject(complexString)
        )
        val firstUUID = entity.testTableId

        println("here0")
        val savedResult = testTableRepository.save(entity)
        println("here1 $firstUUID, ${savedResult.testTableId}")
        assert(firstUUID != savedResult.testTableId)
        val allResults = testTableRepository.findAll()
        print("here2")
        assert(allResults.isNotEmpty())
        assert(complexString == allResults.first().testComplexData.someData)
    }
}