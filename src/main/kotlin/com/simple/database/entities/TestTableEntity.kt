package com.simple.database.entities

import com.simple.database.entities.jsonobjects.JsonObject
import com.vladmihalcea.hibernate.type.json.JsonBinaryType
import org.hibernate.annotations.Type
import org.hibernate.annotations.TypeDef
import org.hibernate.annotations.TypeDefs
import java.util.UUID
import javax.persistence.*

@Suppress("JpaDataSourceORMInspection")
@Entity
@Table(name = "test_table")
@TypeDefs(TypeDef(name = "jsonb", typeClass = JsonBinaryType::class))
class TestTableEntity(
        @Column(name = "test_simple_data")
        val testSimpleData: String,
        @Type(type = "jsonb")
        @Column(name="test_complex_data", columnDefinition = "jsonb")
        val testComplexData: JsonObject
) {
        @Id
        @Column(name = "test_table_id")
        @GeneratedValue
        val testTableId: UUID = UUID(0L, 0L) // dump default, real value is generated anyways >.>
}