package com.simple.database.repositories

import com.simple.database.entities.TestTableEntity
import org.springframework.data.repository.Repository
import java.util.UUID

interface TestTableRepository: Repository<TestTableEntity, UUID> {
    fun save(entity: TestTableEntity): TestTableEntity

    fun findAll(): List<TestTableEntity>
}